package org.freedesktop.xcb;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.io.Closeable;

@EqualsAndHashCode
@AllArgsConstructor
public abstract class Pointer implements Closeable {

    protected final long p;

    public boolean valid() {
        return this.p != 0;
    }

    @Override
    public void close() {
        if (valid())
            NativeUtils.free(this.p);
    }

}
