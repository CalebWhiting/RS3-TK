package uk.calebwhiting.rs3tk;

import static uk.calebwhiting.rs3tk.impl.x11.CTypes.UInt16;
import static uk.calebwhiting.rs3tk.impl.x11.XcbTypes.Connection;
import static uk.calebwhiting.rs3tk.impl.x11.XcbTypes.Screen;
import static uk.calebwhiting.rs3tk.impl.x11.XcbTypes.ScreenIterator;
import static uk.calebwhiting.rs3tk.impl.x11.XcbTypes.Setup;

import com.sun.jna.ptr.IntByReference;
import uk.calebwhiting.rs3tk.impl.x11.Xcb;

public class TestXcb {

  private static final Xcb xcb = Xcb.INSTANCE;

  public static void main(String[] args) {
    IntByReference screenPtr = new IntByReference();
    Connection c = xcb.connect(null, screenPtr);
    try {
      Setup setup = xcb.getSetup(c);
      ScreenIterator it = xcb.setupRootsIterator(setup);
      while (it.rem > 0) {
        Screen screen = it.data;
        UInt16 w = screen.width_in_pixels, h = screen.height_in_pixels;
        System.out.printf("Screen[%d, rem=%d]=[%s x %s]%n",
                          it.index, it.rem, w.intValue(), h.intValue());
        // This gives a SIGSEGV error (memory access violation)
        xcb.screenNext(it);
      }
    } finally {
      xcb.disconnect(c);
    }
  }
}
