package org.freedesktop.xcb;


import org.freedesktop.xcb.internal.X;

import java.nio.ByteBuffer;

public class XcbImage extends Pointer {

    public XcbImage(long p) {
        super(p);
    }

    public int getWidth() {
        return X.Image.width(this.p);
    }

    public int getHeight() {
        return X.Image.height(this.p);
    }

    public int getFormat() {
        return X.Image.format(this.p);
    }

    public short getScanlinePad() {
        return X.Image.scanline_pad(this.p);
    }

    public short getDepth() {
        return X.Image.depth(this.p);
    }

    public short getBitsPerPixel() {
        return X.Image.bpp(this.p);
    }

    public short getUnit() {
        return X.Image.unit(this.p);
    }

    public long getPlaneMask() {
        return X.Image.plane_mask(this.p);
    }

    public int getByteOrder() {
        return X.Image.byte_order(this.p);
    }

    public int getBitOrder() {
        return X.Image.bit_order(this.p);
    }

    public long getStride() {
        return X.Image.stride(this.p);
    }

    public long getSize() {
        return X.Image.size(this.p);
    }

    public long getPixel(long x, long y) {
        return X.image_get_pixel(this.p, x, y);
    }

    public ByteBuffer getDataBuffer() {
        int len = (int) getSize();
        ByteBuffer buf = ByteBuffer.allocateDirect(len);
        NativeUtils.copyToBuffer(this.getDataAddress(), buf, len);
        return buf;
    }

    public long getDataAddress() {
        return X.Image.data(this.p);
    }

    @Override
    public void close() {
        X.image_destroy(this.p);
    }

}
