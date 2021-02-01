package org.freedesktop.xcb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.freedesktop.xcb.internal.X;

@Getter
@RequiredArgsConstructor
public enum XcbImageFormat {
    XY_BITMAP(X.ImageFormat.XCB_IMAGE_FORMAT_XY_BITMAP()),
    XY_PIXMAP(X.ImageFormat.XCB_IMAGE_FORMAT_XY_PIXMAP()),
    Z_PIXMAP(X.ImageFormat.XCB_IMAGE_FORMAT_Z_PIXMAP());

    private final int id;
}
