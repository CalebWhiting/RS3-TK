package org.freedesktop.xcb;

import lombok.experimental.UtilityClass;
import org.freedesktop.xcb.internal.X;

@UtilityClass
public class Xcb {

    public static XcbConnection connect(String displayName, int screen) {
        int[] screenp = {screen};
        long con = X.connect(displayName, screenp);
        return con == 0 ? null : new XcbConnection(con, screenp[0]);
    }

    public static XcbConnection connect(String displayName) {
        return connect(displayName, -1);
    }

}
