package uk.calebwhiting.tk.inject;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import lombok.Getter;
import lombok.SneakyThrows;
import org.freedesktop.xcb.*;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import uk.calebwhiting.tk.App;
import uk.calebwhiting.tk.event.ClientEvent;
import uk.calebwhiting.tk.event.Exiting;
import uk.calebwhiting.tk.event.FrameCaptured;
import uk.calebwhiting.tk.event.Starting;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CaptureManager implements Runnable {

    private static final String CLIENT_WM_CLASS = String.join("\n", "RuneScape", "RuneScape");

    private final XID[] XID_BUF = new XID[3];
    @Getter
    private final Map<XID, ClientContextImpl> clients = new HashMap<>();
    @Inject
    private EventBus eventBus;
    @Inject
    private XcbConnection connection;
    @Inject
    private App app;
    private ScheduledExecutorService captureService;

    private Mat mat = null;
    private Mat rgb = null;
    // private Mat rgba = null;
    private int matHash = -1;

    @Subscribe
    public void onStarting(Starting evt) {
        System.out.println("Starting capture service");
        this.captureService = Executors.newSingleThreadScheduledExecutor();
        this.captureService.scheduleAtFixedRate(this, 1000, 600, TimeUnit.MILLISECONDS);
    }

    @Subscribe
    public void onExiting(Exiting evt) {
        System.out.println("Shutting down capture service");
        if (this.mat != null) this.mat.release();
        if (this.rgb != null) this.rgb.release();
        // if (this.rgba != null) this.rgba.release();
        if (this.captureService != null && !this.captureService.isShutdown())
            this.captureService.shutdown();
    }

    @SneakyThrows
    @Override
    public void run() {
        try {
            updateClientWindows();
            for (ClientContextImpl client : this.clients.values()) {
                capture(client);
            }
        } catch (Throwable t) {
            System.err.println("An error occurred in the capture service.");
            t.printStackTrace(System.err);
            System.err.flush();
            this.captureService.shutdown();
        }
    }

    private void capture(ClientContextImpl client) {
        // write image now so that any transforms (should) have been completed.
        if (this.rgb != null) {
            System.out.println("Writing image");
            Imgcodecs.imwrite("test.bmp", this.rgb);
        }

        XID xid = client.getXid();
        XcbGeometry geometry = connection.getGeometry(xid);

        int w = geometry.getWidth(), h = geometry.getHeight();
        int newMatHash = Objects.hash(w, h);

        if (this.mat == null || newMatHash != this.matHash) {
            if (this.mat != null) this.mat.release();
            if (this.rgb != null) this.rgb.release();
            // if (this.rgba != null) this.rgba.release();
            this.mat = new Mat(h, w, CvType.CV_8UC4);
            this.rgb = new Mat(h, w, CvType.CV_8UC4);
            // this.rgba = new Mat(h, w, CvType.CV_8UC4);
            this.matHash = newMatHash;
        }

        try (XcbImage image = connection.getImage(xid, (short) 0, (short) 0, w, h, 0xFFFFFF, XcbImageFormat.Z_PIXMAP)) {
            NativeUtils.copyToPointer(image.getDataAddress(), this.mat.dataAddr(), image.getSize());
        }

        Imgproc.cvtColor(mat, rgb, Imgproc.COLOR_BGRA2BGR);
        // Imgproc.cvtColor(rgb, rgba, Imgproc.COLOR_BGR2BGRA);

        eventBus.post(new FrameCaptured(client, this.rgb));

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
                ClientContextImpl context = new ClientContextImpl(add, new HashMap<>());
                clients.put(add, context);
                System.out.println("Client detected (" + add + ")");
                eventBus.post(new ClientEvent(ClientEvent.CLIENT_WINDOW_ADDED, context));
            }
            removed.remove(add);
        }
        for (XID remove : removed) {
            System.out.println("Client closed (" + remove + ")");
            ClientContextImpl context = clients.remove(remove);
            eventBus.post(new ClientEvent(ClientEvent.CLIENT_WINDOW_REMOVED, context));
        }
    }
}
