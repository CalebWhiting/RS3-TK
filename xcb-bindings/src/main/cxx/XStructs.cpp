#include "LibXcbBindings.hpp"

#define STR(X) #X

#define JNI_ACCESSOR(_METHOD_, _STRUCT_, _T_, _FIELD_) \
JNIEXPORT _T_ JNICALL _METHOD_ (JNIEnv *, jclass, jlong p) { \
 TRACE( STR(_METHOD_) << "/p=" << p); \
 if (p == 0) { \
    printf("Attempted to lookup a field from a null pointer!\n"); \
    return 0; \
 }\
 _STRUCT_* v = (_STRUCT_*) p; \
 return (_T_) v->_FIELD_; \
}

// xcb_generic_error_t
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GenericError_error_1code, xcb_generic_error_t, jshort, error_code)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GenericError_response_1type, xcb_generic_error_t, jshort, response_type)

// xcb_geometry_reply_t
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GeometryReply_response_1type, xcb_get_geometry_reply_t,   jshort, response_type)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GeometryReply_depth,          xcb_get_geometry_reply_t,   jshort, depth)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GeometryReply_root,           xcb_get_geometry_reply_t,   jint,   root)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GeometryReply_x,              xcb_get_geometry_reply_t,   jshort, x)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GeometryReply_y,              xcb_get_geometry_reply_t,   jshort, y)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GeometryReply_width,          xcb_get_geometry_reply_t,   jint,   width)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GeometryReply_height,         xcb_get_geometry_reply_t,   jint,   height)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024GeometryReply_border_1width,  xcb_get_geometry_reply_t,   jshort, border_width)

// xcb_image_t
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_width,          xcb_image_t,    jint,   width)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_height,         xcb_image_t,    jint,   height)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_format,         xcb_image_t,    jint,   format)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_scanline_1pad,  xcb_image_t,    jshort, scanline_pad)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_depth,          xcb_image_t,    jshort, depth)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_bpp,            xcb_image_t,    jshort, bpp)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_unit,           xcb_image_t,    jshort, unit)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_plane_1mask,    xcb_image_t,    jint,   plane_mask)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_byte_1order,    xcb_image_t,    jint,   byte_order)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_bit_1order,     xcb_image_t,    jint,   bit_order)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_stride,         xcb_image_t,    jlong,  stride)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_size,           xcb_image_t,    jlong,  size)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Image_data,           xcb_image_t,    jlong,  data)

// xcb_query_tree_reply_t
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024QueryTreeReply_parent,    xcb_query_tree_reply_t, jint,  parent)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024QueryTreeReply_root,      xcb_query_tree_reply_t, jint,  root)

// xcb_screen_t
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_root,                      xcb_screen_t,   jint,   root)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_default_1colormap,         xcb_screen_t,   jlong,  default_colormap)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_white_1pixel,              xcb_screen_t,   jlong,  white_pixel)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_black_1pixel,              xcb_screen_t,   jlong,  black_pixel)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_current_1input_1masks,     xcb_screen_t,   jlong,  current_input_masks)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_width_1in_1pixels,         xcb_screen_t,   jint,   width_in_pixels)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_height_1in_1pixels,        xcb_screen_t,   jint,   height_in_pixels)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_width_1in_1millimeters,    xcb_screen_t,   jint,   width_in_millimeters)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_height_1in_1millimeters,   xcb_screen_t,   jint,   height_in_millimeters)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_min_1installed_1maps,      xcb_screen_t,   jint,   min_installed_maps)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_max_1installed_1maps,      xcb_screen_t,   jint,   max_installed_maps)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_root_1visual,              xcb_screen_t,   jlong,  root_visual)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_backing_1stores,           xcb_screen_t,   jshort, backing_stores)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_save_1unders,              xcb_screen_t,   jshort, save_unders)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_root_1depth,               xcb_screen_t,   jshort, root_depth)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Screen_allowed_1depths_1len,      xcb_screen_t,   jshort, allowed_depths_len)

// xcb_screen_iterator_t
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024ScreenIterator_rem,   xcb_screen_iterator_t,  jint,   rem)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024ScreenIterator_data,  xcb_screen_iterator_t,  jlong,  data)

// xcb_setup_t
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_status,                         xcb_setup_t,    jlong,  status)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_protocol_1major_1version,       xcb_setup_t,    jlong,  protocol_major_version)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_protocol_1minor_1version,       xcb_setup_t,    jlong,  protocol_minor_version)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_length,                         xcb_setup_t,    jlong,  length)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_release_1number,                xcb_setup_t,    jlong,  release_number)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_resource_1id_1base,             xcb_setup_t,    jlong,  resource_id_base)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_resource_1id_1mask,             xcb_setup_t,    jlong,  resource_id_mask)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_motion_1buffer_1size,           xcb_setup_t,    jlong,  motion_buffer_size)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_vendor_1len,                    xcb_setup_t,    jlong,  vendor_len)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_maximum_1request_1length,       xcb_setup_t,    jlong,  maximum_request_length)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_roots_1len,                     xcb_setup_t,    jlong,  roots_len)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_pixmap_1formats_1len,           xcb_setup_t,    jlong,  pixmap_formats_len)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_image_1byte_1order,             xcb_setup_t,    jlong,  image_byte_order)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_bitmap_1format_1bit_1order,     xcb_setup_t,    jlong,  bitmap_format_bit_order)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_bitmap_1format_1scanline_1unit, xcb_setup_t,    jlong,  bitmap_format_scanline_unit)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_bitmap_1format_1scanline_1pad,  xcb_setup_t,    jlong,  bitmap_format_scanline_pad)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_min_1keycode,                   xcb_setup_t,    jlong,  min_keycode)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024Setup_max_1keycode,                   xcb_setup_t,    jlong,  max_keycode)

// xcb_get_window_attributes_reply_t
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_response_1type,             xcb_get_window_attributes_reply_t, jshort,  response_type)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_backing_1store,             xcb_get_window_attributes_reply_t, jshort,  backing_store)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_length,                     xcb_get_window_attributes_reply_t, jlong,   length)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_visual,                     xcb_get_window_attributes_reply_t, jlong,   visual)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply__1class,                    xcb_get_window_attributes_reply_t, jint,    _class)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_bit_1gravity,               xcb_get_window_attributes_reply_t, jshort,  bit_gravity)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_win_1gravity,               xcb_get_window_attributes_reply_t, jshort,  win_gravity)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_backing_1planes,            xcb_get_window_attributes_reply_t, jlong,   backing_planes)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_backing_1pixel,             xcb_get_window_attributes_reply_t, jlong,   backing_pixel)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_save_1under,                xcb_get_window_attributes_reply_t, jshort,  save_under)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_map_1is_1installed,         xcb_get_window_attributes_reply_t, jshort,  map_is_installed)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_map_1state,                 xcb_get_window_attributes_reply_t, jshort,  map_state)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_override_1redirect,         xcb_get_window_attributes_reply_t, jshort,  override_redirect)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_colormap,                   xcb_get_window_attributes_reply_t, jlong,   colormap)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_all_1event_1masks,          xcb_get_window_attributes_reply_t, jlong,   all_event_masks)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_your_1event_1mask,          xcb_get_window_attributes_reply_t, jlong,   your_event_mask)
JNI_ACCESSOR(Java_org_freedesktop_xcb_internal_X_00024WindowAttributesReply_do_1not_1propagate_1mask,   xcb_get_window_attributes_reply_t, jint,    do_not_propagate_mask)