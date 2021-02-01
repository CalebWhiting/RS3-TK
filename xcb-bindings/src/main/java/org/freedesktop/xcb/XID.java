package org.freedesktop.xcb;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class XID {

    private final int id;

    @Override
    public String toString() {
        return "0x" + Integer.toHexString(this.id);
    }

}
