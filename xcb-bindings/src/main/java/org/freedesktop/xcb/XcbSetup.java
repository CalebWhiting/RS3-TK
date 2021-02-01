package org.freedesktop.xcb;

import org.freedesktop.xcb.internal.X;

import java.util.LinkedList;
import java.util.List;

public class XcbSetup extends Pointer {

    public XcbSetup(long p) {
        super(p);
    }

    public long getStatus() {
        return X.Setup.status(this.p);
    }

    public long getProtocolMajorVersion() {
        return X.Setup.protocol_major_version(this.p);
    }

    public long getProtocolMinorVersion() {
        return X.Setup.protocol_minor_version(this.p);
    }

    public long getLength() {
        return X.Setup.length(this.p);
    }

    public long getReleaseNumber() {
        return X.Setup.release_number(this.p);
    }

    public long getResourceIdBase() {
        return X.Setup.resource_id_base(this.p);
    }

    public long getResourceIdMask() {
        return X.Setup.resource_id_mask(this.p);
    }

    public long getMotionBufferSize() {
        return X.Setup.motion_buffer_size(this.p);
    }

    public long getVendorLength() {
        return X.Setup.vendor_len(this.p);
    }

    public long getMaximumRequestLength() {
        return X.Setup.maximum_request_length(this.p);
    }

    public long getRootsLength() {
        return X.Setup.roots_len(this.p);
    }

    public long getPixmapFormatsLength() {
        return X.Setup.pixmap_formats_len(this.p);
    }

    public long getImageByteOrder() {
        return X.Setup.image_byte_order(this.p);
    }

    public long getBitmapFormatBitOrder() {
        return X.Setup.bitmap_format_bit_order(this.p);
    }

    public long getBitmapFormatScanlineUnit() {
        return X.Setup.bitmap_format_scanline_unit(this.p);
    }

    public long getBitmapFormatScanlinePad() {
        return X.Setup.bitmap_format_scanline_pad(this.p);
    }

    public long getMinKeycode() {
        return X.Setup.min_keycode(this.p);
    }

    public long getMaxKeycode() {
        return X.Setup.max_keycode(this.p);
    }

    public XcbScreen[] getRoots() {
        long it = X.setup_roots_iterator(p);
        List<XcbScreen> screens = new LinkedList<>();
        while (X.ScreenIterator.rem(it) > 0) {
            long p = X.ScreenIterator.data(it);
            screens.add(new XcbScreen(p));
            X.screen_next(it);
        }
        NativeUtils.free(it);
        return screens.toArray(new XcbScreen[0]);
    }

}
