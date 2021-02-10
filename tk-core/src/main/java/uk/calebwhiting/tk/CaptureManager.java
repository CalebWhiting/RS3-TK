package uk.calebwhiting.tk;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import lombok.Getter;
import lombok.SneakyThrows;
import org.freedesktop.xcb.*;
import uk.calebwhiting.tk.api.ClientContext;
import uk.calebwhiting.tk.bus.EventBus;
import uk.calebwhiting.tk.event.ClientEvent;
import uk.calebwhiting.tk.event.Exiting;
import uk.calebwhiting.tk.event.FrameCaptured;
import uk.calebwhiting.tk.event.Starting;

import java.util.*;

public class CaptureManager implements Runnable {

    public static final String KEY_CAPTURE_DATA = "Capture.Data";

    private static final String CLIENT_WM_CLASS = "RuneScape";

    private final XID[] XID_BUF = new XID[3];

    @Getter
    private final Map<XID, ClientContext> clients = new HashMap<>();

    @Inject
    private EventBus eventBus;

    @Inject
    private XcbConnection connection;

    private Thread thread;
    private boolean running;

    @Subscribe
    public void onStarting(Starting evt) {
        System.out.println("Starting capture service");
        this.running = true;
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Subscribe
    public void onExiting(Exiting evt) {
        System.out.println("Shutting down capture service");
        this.running = false;
        // if (this.rgba != null) this.rgba.release();
        if (this.thread != null) this.thread.interrupt();
    }

    @SneakyThrows
    @Override
    public void run() {
        long delay = 1000L / 60L;
        while (this.running) {
            try {
                long start = System.currentTimeMillis();
                updateClientWindows();
                for (ClientContext client : this.clients.values()) {
                    capture(client);
                }
                long end = System.currentTimeMillis();
                long duration = (end - start);
                if (duration < delay) {
                    //noinspection BusyWait
                    Thread.sleep(delay - duration);
                }
            } catch (InterruptedException e) {
                break;
            } catch (Throwable t) {
                System.err.println("An error occurred in the capture service.");
                t.printStackTrace();
            }
        }
    }

    private static class CaptureData {

        private XcbImage xcbImage;

    }

    private void capture(ClientContext client) {
        CaptureData data = client.getDataStructure(CaptureData.class);

        XID xid = ((ClientContextImpl) client).getXid();
        XcbGeometry geometry = connection.getGeometry(xid);

        int w = geometry.getWidth(), h = geometry.getHeight();

        XcbImage image = connection.getImage(
                xid, (short) 0, (short) 0, w, h, 0xFFFFFF, XcbImageFormat.Z_PIXMAP);

        if (data.xcbImage != null) {
            data.xcbImage.close();
        }

        data.xcbImage = image;

        // data.osd.setTo(new Scalar(0));

        eventBus.dispatch(new FrameCaptured(client, image));
    }

    private XID[][] getGameWindows() {
        List<XID[]> matches = new LinkedList<>();
        Stack<XID[]> stack = new Stack<>();
        XcbSetup setup = connection.getSetup();
        XcbScreen[] screens = setup.getRoots();
        for (XcbScreen screen : screens) {
            XID_BUF[0] = screen.getRoot();
            stack.push(Arrays.copyOf(XID_BUF, 1));
        }
        while (stack.size() > 0) {
            XID[] cur = stack.pop();
            XID xid = cur[cur.length - 1];

            if (cur.length == 3) {
                String wmClass = connection.getAtomString(xid, XcbAtom.WM_CLASS, 64);
                if (wmClass != null && wmClass.equals(CLIENT_WM_CLASS)) {
                    matches.add(cur);
                }
            }

            System.arraycopy(cur, 0, XID_BUF, 0, cur.length);
            if (cur.length < XID_BUF.length) {
                try (XcbQueryTreeReply query = connection.queryTree(xid)) {
                    if (query != null) {
                        for (XID child : query.getChildren()) {
                            XID_BUF[cur.length] = child;
                            stack.push(Arrays.copyOf(XID_BUF, cur.length + 1));
                        }
                    }
                }
            }
        }
        return matches.toArray(new XID[0][]);
    }

    private void updateClientWindows() {
        XID[][] windows = getGameWindows();
        Set<XID> removed = new HashSet<>(this.clients.keySet());
        for (XID[] path : windows) {
            XID add = path[path.length - 1];
            if (!clients.containsKey(add)) {
                ClientContext context = new ClientContextImpl(add, new HashMap<>());
                clients.put(add, context);
                System.out.println("Client detected (" + add + ")");
                eventBus.dispatch(new ClientEvent(ClientEvent.CLIENT_WINDOW_ADDED, context));
            }
            removed.remove(add);
        }
        for (XID remove : removed) {
            System.out.println("Client closed (" + remove + ")");
            ClientContext context = clients.remove(remove);
            eventBus.dispatch(new ClientEvent(ClientEvent.CLIENT_WINDOW_REMOVED, context));
        }
    }
}
