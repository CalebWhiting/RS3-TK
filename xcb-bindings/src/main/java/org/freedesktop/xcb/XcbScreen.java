package org.freedesktop.xcb;

import org.freedesktop.xcb.internal.X;

public class XcbScreen extends Pointer {

    public XcbScreen(long p) {
        super(p);
    }

    public XID getRoot() {
        return new XID(X.Screen.root(this.p));
    }

    public long getDefaultColormap() {
        return X.Screen.default_colormap(this.p);
    }

    public long getWhitePixel() {
        return X.Screen.white_pixel(this.p);
    }

    public long getBlackPixel() {
        return X.Screen.black_pixel(this.p);
    }

    public long getCurrentInputMasks() {
        return X.Screen.current_input_masks(this.p);
    }

    public int getWidthInPixels() {
        return X.Screen.width_in_pixels(this.p);
    }

    public int getHeightInPixels() {
        return X.Screen.height_in_pixels(this.p);
    }

    public int getWidthInMillimeters() {
        return X.Screen.width_in_millimeters(this.p);
    }

    public int getHeightInMillimeters() {
        return X.Screen.height_in_millimeters(this.p);
    }

    public int getMinInstalledMaps() {
        return X.Screen.min_installed_maps(this.p);
    }

    public int getMaxInstalledMaps() {
        return X.Screen.max_installed_maps(this.p);
    }

    public long getRootVisual() {
        return X.Screen.root_visual(this.p);
    }

    public short getBackingStores() {
        return X.Screen.backing_stores(this.p);
    }

    public short getSaveUnders() {
        return X.Screen.save_unders(this.p);
    }

    public short getRootDepth() {
        return X.Screen.root_depth(this.p);
    }

    public short getAllowedDepthsLength() {
        return X.Screen.allowed_depths_len(this.p);
    }

}
