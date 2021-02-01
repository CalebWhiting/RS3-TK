#include "LibXcbBindings.hpp"

JNIEXPORT jint JNICALL 
Java_org_freedesktop_xcb_internal_X_00024ImageFormat_XCB_1IMAGE_1FORMAT_1XY_1BITMAP(JNIEnv *, jclass) {
 TRACE("Java_org_freedesktop_xcb_internal_X_00024ImageFormat_XCB_1IMAGE_1FORMAT_1XY_1BITMAP");
 return XCB_IMAGE_FORMAT_XY_BITMAP;
}

JNIEXPORT jint JNICALL 
Java_org_freedesktop_xcb_internal_X_00024ImageFormat_XCB_1IMAGE_1FORMAT_1XY_1PIXMAP(JNIEnv *, jclass) {
 TRACE("Java_org_freedesktop_xcb_internal_X_00024ImageFormat_XCB_1IMAGE_1FORMAT_1XY_1PIXMAP");
 return XCB_IMAGE_FORMAT_XY_PIXMAP;
}

JNIEXPORT jint JNICALL 
Java_org_freedesktop_xcb_internal_X_00024ImageFormat_XCB_1IMAGE_1FORMAT_1Z_1PIXMAP(JNIEnv *, jclass) {
 TRACE("Java_org_freedesktop_xcb_internal_X_00024ImageFormat_XCB_1IMAGE_1FORMAT_1Z_1PIXMAP");
 return XCB_IMAGE_FORMAT_Z_PIXMAP;
}
