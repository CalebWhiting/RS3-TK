package org.freedesktop.xcb;

import org.freedesktop.xcb.internal.X;

public class XcbWindowAttributes extends Pointer {

    public XcbWindowAttributes(long p) {
        super(p);
    }

    public short getResponseType() {
        return X.WindowAttributesReply.response_type(this.p);
    }

    public short getBackingStore() {
        return X.WindowAttributesReply.backing_store(this.p);
    }

    public long getLength() {
        return X.WindowAttributesReply.length(this.p);
    }

    public long getVisual() {
        return X.WindowAttributesReply.visual(this.p);
    }

    public int getWindowClass() {
        return X.WindowAttributesReply._class(this.p);
    }

    public short getBitGravity() {
        return X.WindowAttributesReply.bit_gravity(this.p);
    }

    public short getWinGravity() {
        return X.WindowAttributesReply.win_gravity(this.p);
    }

    public long getBackingPlanes() {
        return X.WindowAttributesReply.backing_planes(this.p);
    }

    public long getBackingPixel() {
        return X.WindowAttributesReply.backing_pixel(this.p);
    }

    public short getSaveUnder() {
        return X.WindowAttributesReply.save_under(this.p);
    }

    public short getMapIsInstalled() {
        return X.WindowAttributesReply.map_is_installed(this.p);
    }

    public short getMapState() {
        return X.WindowAttributesReply.map_state(this.p);
    }

    public short getOverrideRedirect() {
        return X.WindowAttributesReply.override_redirect(this.p);
    }

    public long getColormap() {
        return X.WindowAttributesReply.colormap(this.p);
    }

    public long getAllEventMasks() {
        return X.WindowAttributesReply.all_event_masks(this.p);
    }

    public long getYourEventMask() {
        return X.WindowAttributesReply.your_event_mask(this.p);
    }

    public int getDoNotPropagateMask() {
        return X.WindowAttributesReply.do_not_propagate_mask(this.p);
    }

    @Override
    public String toString() {
        return "XcbWindowAttributes" +
                "/responseType=" + getResponseType() +
                "/backingStore=" + getBackingStore() +
                "/length=" + getLength() +
                "/visual=" + getVisual() +
                "/windowClass=" + getWindowClass() +
                "/bitGravity=" + getBitGravity() +
                "/winGravity=" + getWinGravity() +
                "/backingPlanes=" + getBackingPlanes() +
                "/backingPixel=" + getBackingPixel() +
                "/saveUnder=" + getSaveUnder() +
                "/mapIsInstalled=" + getMapIsInstalled() +
                "/mapState=" + getMapState() +
                "/overrideRedirect=" + getOverrideRedirect() +
                "/colormap=" + getColormap() +
                "/allEventMasks=" + getAllEventMasks() +
                "/yourEventMask=" + getYourEventMask() +
                "/doNotPropagateMask=" + getDoNotPropagateMask();
    }
}
