package org.freedesktop.xcb;

import lombok.Getter;
import org.freedesktop.xcb.internal.X;

public class XcbConnection extends Pointer {

    @Getter
    private final int screen;

    public XcbConnection(long p, int screen) {
        super(p);
        this.screen = screen;
    }

    public XcbSetup getSetup() {
        long p = X.get_setup(this.p);
        return p == 0 ? null : new XcbSetup(p);
    }

    @Override
    public void close() {
        if (this.p == 0) {
            throw new IllegalStateException();
        }
        X.disconnect(this.p);
    }

    public XcbQueryTreeReply queryTree(XID window) {
        long[] err = {0};
        long cookie = 0;
        long reply;
        try {
            cookie = X.query_tree(this.p, window.getId());
            if (cookie == 0)
                return null;

            reply = X.query_tree_reply(this.p, cookie, err);
            X.checkError("xcb_query_tree_reply", err);
            if (reply == 0)
                return null;

            return new XcbQueryTreeReply(reply);
        } finally {
            NativeUtils.free(cookie);
        }
    }

    public XcbWindowAttributes getWindowAttributes(XID window) {
        long[] err = {0};
        long cookie = 0;
        long reply;
        try {
            cookie = X.get_window_attributes(this.p, window.getId());
            if (cookie == 0)
                return null;

            reply = X.get_window_attributes_reply(this.p, cookie, err);
            X.checkError("xcb_get_window_attributes_reply", err);
            if (reply == 0)
                return null;

            return new XcbWindowAttributes(reply);
        } finally {
            NativeUtils.free(cookie);
        }
    }

    public String getAtomString(XID window, XcbAtom atom, int length) {
        long[] err = {0};
        long property = atom.getId();
        long type = XcbAtom.STRING.getId();
        long offset = 0;

        long cookie = 0;
        long reply = 0;
        long namePtr;
        try {
            cookie = X.get_property(this.p, false, window.getId(), property, type, offset, length);
            if (cookie == 0)
                return null;

            reply = X.get_property_reply(this.p, cookie, err);
            X.checkError("xcb_get_property_reply", err);
            if (reply == 0)
                return null;

            int valueLength = X.get_property_value_length(reply);
            if (valueLength == 0)
                return null;

            namePtr = X.get_property_value(reply);
            return namePtr == 0 ? null : X.chars_to_string(namePtr, valueLength);
        } finally {
            NativeUtils.free(cookie, reply);
        }
    }

    public XcbGeometry getGeometry(XID xid) {
        long[] err = {0};
        long cookie = 0;
        long reply;
        try {
            cookie = X.get_geometry(this.p, xid.getId());
            if (cookie == 0)
                return null;

            reply = X.get_geometry_reply(this.p, cookie, err);
            X.checkError("get_geometry_reply", err);
            if (reply == 0)
                return null;

            return new XcbGeometry(reply);
        } finally {
            NativeUtils.free(cookie);
        }
    }

    public XcbImage getImage(XID xid, short x, short y, int w, int h, int planeMask, XcbImageFormat format) {
        var image = X.image_get(this.p, xid.getId(), x, y, w, h, planeMask, format.getId());
        if (image == 0) return null;
        return new XcbImage(image);
    }

    /*public XcbGetPropertyReply getWindowProperty(XID window) {
        long property = X.atom_enum_t.
        var cookie = X.get_property(p, 0, window.getId(), property, type, offset, length);
    }*/


}
