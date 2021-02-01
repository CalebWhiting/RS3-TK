package org.freedesktop.xcb;

import java.nio.ByteBuffer;

public class NativeUtils {

    public static native void copyToBuffer(long ptr, ByteBuffer dest, int size);

    public static native void copyToPointer(long src, long dest, long size);

    public static native void free(long pointer);

}
