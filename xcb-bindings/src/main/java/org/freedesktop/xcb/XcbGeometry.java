package org.freedesktop.xcb;


import org.freedesktop.xcb.internal.X;

public class XcbGeometry extends Pointer {

    public XcbGeometry(long p) {
        super(p);
    }

    public short getResponseType() {
        return X.GeometryReply.response_type(this.p);
    }

    public short getDepth() {
        return X.GeometryReply.depth(this.p);
    }

    public XID getRoot() {
        return new XID(X.GeometryReply.root(this.p));
    }

    public short getX() {
        return X.GeometryReply.x(this.p);
    }

    public short getY() {
        return X.GeometryReply.y(this.p);
    }

    public int getWidth() {
        return X.GeometryReply.width(this.p);
    }

    public int getHeight() {
        return X.GeometryReply.height(this.p);
    }

    public int getBorderWidth() {
        return X.GeometryReply.border_width(this.p);
    }

}
