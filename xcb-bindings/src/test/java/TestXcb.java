import org.freedesktop.xcb.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class TestXcb {

    private static XcbConnection c;

    @BeforeClass
    public static void init() {
        c = Xcb.connect(null);
    }

    @AfterClass
    public static void destroy() {
        c.close();
    }

    @Test
    public void testQueryTree() {
        XcbSetup setup = c.getSetup();
        XcbScreen[] roots = setup.getRoots();

        System.out.println("Listing roots");
        Queue<XID> queue = new LinkedList<>();
        for (XcbScreen root : roots) {
            queue.offer(root.getRoot());
        }

        System.out.println("Listing windows");
        while (queue.size() > 0) {
            XID xid = queue.poll();
            System.out.println("X:" + xid);
            try (XcbQueryTreeReply query = c.queryTree(xid)) {
                if (query == null) {
                    continue;
                }
                System.out.println("Getting children of " + xid);
                XID[] children = query.getChildren();
                System.out.println("Children=" + Arrays.toString(children));
                System.out.println("Adding to queue");
                for (XID child : children) {
                    queue.offer(child);
                }
            }
        }
        System.out.println("Done listing windows");
    }

    @Test
    public void textGetSetup() {
        XcbSetup setup = c.getSetup();
        Assert.assertNotNull(setup);
        Assert.assertEquals(setup.getReleaseNumber(), 12009000);
        Assert.assertEquals(setup.getProtocolMajorVersion(), 11);
        XcbScreen[] screens = setup.getRoots();
        Assert.assertNotNull(screens);
        for (XcbScreen screen : screens) {
            System.out.println("Screen: " + screen);
        }
    }

    @Test
    public void testGetProperty() {
        XcbScreen[] roots = c.getSetup().getRoots();
        Assert.assertTrue(roots.length > 0);
        XcbScreen screen = roots[0];
        XID root = screen.getRoot();
        try (XcbWindowAttributes attrs = c.getWindowAttributes(root)) {
            System.out.println(attrs);
            ;
        }
    }

    private void queryTreeChildren(
            XID xid, Consumer<XID> consumer) {
        consumer.accept(xid);
        XID[] children;
        try (XcbQueryTreeReply q = c.queryTree(xid)) {
            children = q.getChildren();
        }
        for (XID child : children) {
            queryTreeChildren(child, consumer);
        }
    }

    @Test
    public void testGetWmClass() {
        XcbScreen[] roots = c.getSetup().getRoots();
        Assert.assertTrue(roots.length > 0);
        XcbScreen screen = roots[0];
        XID root = screen.getRoot();
        AtomicInteger count = new AtomicInteger();
        queryTreeChildren(root, xid -> {
            String string = c.getAtomString(xid, XcbAtom.WM_CLASS, 128);
            if (string == null)
                return;
            System.out.println("WM_CLASS=" + string);
            count.incrementAndGet();
        });
        Assert.assertNotEquals(0, count.get());
    }

}
