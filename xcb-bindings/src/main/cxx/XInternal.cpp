#include "LibXcbBindings.hpp"

#include <ctype.h>
#include <cstring>
#include <cstdlib>
#include <string.h>

#define PTR_TO(P_NAME, P_TYPE) (P_TYPE) P_NAME

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_connect(JNIEnv *env, jclass, jstring displayname, jintArray rscreen)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_connect");
  int screen;
  if (rscreen)
  {
   env->GetIntArrayRegion(rscreen, 0, 1, &screen);
  }
  const char* _displayname;
  if (displayname)
  {
   _displayname = env->GetStringUTFChars(displayname, JNI_FALSE);
  }
  else
  {
   _displayname = NULL;
  }
  xcb_connection_t* c = xcb_connect(_displayname, &screen);
  env->SetIntArrayRegion(rscreen, 0, 1, &screen);
  return (uintptr_t) c;
}

JNIEXPORT void JNICALL
Java_org_freedesktop_xcb_internal_X_disconnect(JNIEnv* env, jclass, jlong _c)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_disconnect/c=" << _c);
  auto c = PTR_TO(_c, xcb_connection_t*);
  xcb_disconnect(c);
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_get_1setup(JNIEnv* env, jclass, jlong _c)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1setup/c=" << _c);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1setup:c:nullptr");
    return 0;
  }
  return (uintptr_t) xcb_get_setup(c);
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_query_1tree(JNIEnv* env, jclass, jlong _c, jint _xid)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_query_1tree" <<
        "/c=" << _c <<
        "/xid=" << _xid);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_query_1tree:c:nullptr");
    return 0;
  }
  xcb_window_t xid = (xcb_window_t) _xid;
  auto* cookie = new xcb_query_tree_cookie_t();
  *cookie = xcb_query_tree(c, xid);

  return (uintptr_t) cookie;
}


JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_query_1tree_1reply(JNIEnv* env, jclass, jlong _c, jlong _cookie, jlongArray errOut)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_query_1tree_1reply" <<
        "/c=" << _c <<
        "/cookie=" << _cookie);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_query_1tree_1reply:c:nullptr");
    return 0;
  }

  auto cookie = PTR_TO(_cookie, xcb_query_tree_cookie_t*);

  xcb_generic_error_t* e;
  auto reply = xcb_query_tree_reply(c, *cookie, &e);

  if (e) {
    WARN("Java_org_freedesktop_xcb_internal_X_query_1tree_1reply:xcb_generic_error/" << xcb_error_name(e));
    env->SetLongArrayRegion(errOut, 0, 1, (jlong*) e);
    return 0;
  }

  return (uintptr_t) reply;
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_get_1window_1attributes(JNIEnv* env, jclass, jlong _c, jint _xid)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1window_1attributes" <<
        "/c=" << _c <<
        "/xid=" << _xid);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1window_1attributes:c:nullptr");
    return 0;
  }
  xcb_window_t xid = (xcb_window_t) _xid;

  auto* cookie = new xcb_get_window_attributes_cookie_t();
  *cookie = xcb_get_window_attributes(c, xid);

  return (uintptr_t) cookie;
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_get_1window_1attributes_1reply(JNIEnv* env, jclass, jlong _c, jlong _cookie, jlongArray errOut)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1window_1attributes_1reply" <<
        "/c=" << _c <<
        "/cookie=" << _cookie);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1window_1attributes_1reply:c:nullptr");
    return 0;
  }
  auto cookie = PTR_TO(_cookie, xcb_get_window_attributes_cookie_t*);

  xcb_generic_error_t* e;

  auto reply = xcb_get_window_attributes_reply(c, *cookie, &e);

  if (e) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1window_1attributes_1reply:xcb_generic_error/" << xcb_error_name(e));
    env->SetLongArrayRegion(errOut, 0, 1, (jlong*) e);
    return 0;
  }

  return (uintptr_t) reply;
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_get_1geometry(JNIEnv* env, jclass, jlong _c, jint _xid)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1geometry" <<
        "/c=" << _c <<
        "/xid=" << _xid);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1geometry:c:nullptr");
    return 0;
  }
  xcb_window_t xid = (xcb_window_t) _xid;

  auto* cookie = new xcb_get_geometry_cookie_t();
  *cookie = xcb_get_geometry(c, xid);

  return (uintptr_t) cookie;
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_get_1geometry_1reply(JNIEnv* env, jclass, jlong _c, jlong _cookie, jlongArray errOut)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1geometry_1reply" <<
        "/c=" << _c <<
        "/cookie=" << _cookie);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1geometry_1reply:c:nullptr");
    return 0;
  }
  auto cookie = PTR_TO(_cookie, xcb_get_geometry_cookie_t*);

  xcb_generic_error_t* e;

  auto* reply = xcb_get_geometry_reply(c, *cookie, &e);

  if (e) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1geometry_1reply:xcb_generic_error/" << xcb_error_name(e));
    env->SetLongArrayRegion(errOut, 0, 1, (jlong*) e);
    return 0;
  }

  return (uintptr_t) reply;
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_get_1property(JNIEnv* env, jclass, jlong _c, jboolean _delete, jint _xid, jlong _property, jlong _type, jlong _offset, jint _length)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1property" <<
        "/c=" << _c <<
        "/delete=" << _delete <<
        "/xid=" << _xid <<
        "/property=" << _property <<
        "/type=" << _type <<
        "/offset=" << _offset <<
        "/length=" << _length);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1property:c:nullptr");
    return 0;
  }
  xcb_window_t xid = (xcb_window_t) _xid;
  auto* cookie = new xcb_get_property_cookie_t();
  *cookie = xcb_get_property(c, _delete, xid,_property,_type,_offset,_length);
  return (uintptr_t) cookie;
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_get_1property_1reply(JNIEnv* env, jclass, jlong _c, jlong _cookie, jlongArray errOut)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1property_1reply" <<
        "/c=" << _c <<
        "/cookie=" << _cookie);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1property_1reply:c:nullptr");
    return 0;
  }
  auto cookie = PTR_TO(_cookie, xcb_get_property_cookie_t*);
  if (!cookie) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1property_1reply:cookie:nullptr");
    return 0;
  }

  xcb_generic_error_t* e;
  auto* reply = xcb_get_property_reply(c, *cookie, &e);

  if (e) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1property_1reply:xcb_generic_error:" << xcb_error_name(e));
    env->SetLongArrayRegion(errOut, 0, 1, (jlong*) e);
    return 0;
  }

  if (!reply) {
    WARN("Java_org_freedesktop_xcb_internal_X_get_1property_1reply:reply:nullptr");
    return 0;
  }
  return (uintptr_t) reply;
}

JNIEXPORT jint JNICALL
Java_org_freedesktop_xcb_internal_X_get_1property_1value_1length(JNIEnv* env, jclass, jlong _reply)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1property_1value_1length" <<
        "/reply=" << _reply);
  return xcb_get_property_value_length((xcb_get_property_reply_t*) _reply);
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_get_1property_1value(JNIEnv* env, jclass, jlong _reply)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_get_1property_1value/reply=" << _reply);
  auto value = xcb_get_property_value((xcb_get_property_reply_t*) _reply);
  return (uintptr_t) value;
}

JNIEXPORT jstring JNICALL
Java_org_freedesktop_xcb_internal_X_chars_1to_1string(JNIEnv * env, jclass, jlong cp, jint len)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_chars_1to_1string" <<
        "/chars=" << cp <<
        "/len=" << len);
  const char* chars = (const char*) cp;
  char* array = (char*) malloc(len * sizeof(char));
  strcpy(array, chars);
  return env->NewStringUTF(array);
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_image_1get(JNIEnv* env, jclass, jlong _c, jint _xid, jshort _x, jshort _y, jint _w, jint _h, jint _mask, jint _format)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_image_1get" <<
        "/c=" << _c <<
        "/xid=" << _xid <<
        "/x=" << _x <<
        "/y=" << _y <<
        "/w=" << _w <<
        "/h=" << _h <<
        "/mask=" << _mask <<
        "/format=" << _format);
  auto c = PTR_TO(_c, xcb_connection_t*);
  if (!c) {
    WARN("Java_org_freedesktop_xcb_internal_X_image_1get:c:nullptr");
    return 0;
  }
  xcb_window_t xid = (xcb_window_t) _xid;

  auto image = xcb_image_get(c, xid, _x, _y, _w, _h, _mask, (xcb_image_format_t) _format);
  return (uintptr_t) image;
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_image_1get_1pixel(JNIEnv* env, jclass, jlong _image, jlong _x, jlong _y)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_image_1get_1pixel" <<
        "/image=" << _image <<
        "/x=" << _x <<
        "/y=" << _y);
  xcb_image_t* image = PTR_TO(_image, xcb_image_t*);
  if (!image) {
    WARN("Java_org_freedesktop_xcb_internal_X_image_1get_1pixel:image:nullptr");
    return 0;
  }
  return xcb_image_get_pixel(image, _x, _y);
}

JNIEXPORT void JNICALL
Java_org_freedesktop_xcb_internal_X_image_1destroy(JNIEnv* env, jclass, jlong _image)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_image_1destroy/image=" << _image);
  xcb_image_t* image = PTR_TO(_image, xcb_image_t*);
  if (!image) {
    WARN("Java_org_freedesktop_xcb_internal_X_image_1destroy:image:nullptr");
    return;
  }
  xcb_image_destroy(image);
}

JNIEXPORT jint JNICALL
Java_org_freedesktop_xcb_internal_X_query_1tree_1children_1length(JNIEnv* env, jclass, jlong _reply)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_query_1tree_1children_1length/reply=" << _reply);
  auto reply = PTR_TO(_reply, xcb_query_tree_reply_t*);
  if (!reply) {
    WARN("Java_org_freedesktop_xcb_internal_X_query_1tree_1children_1length:reply:nullptr");
    return 0;
  }
  jint len = xcb_query_tree_children_length(reply);
  return len;
}

JNIEXPORT void JNICALL
Java_org_freedesktop_xcb_internal_X_query_1tree_1children(JNIEnv *env, jclass, jlong _reply, jintArray res, jlong len)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_query_1tree_1children" <<
        "/reply=" << _reply <<
        "/len=" << len);
  auto reply = PTR_TO(_reply, xcb_query_tree_reply_t*);
  if (!reply) {
    WARN("Java_org_freedesktop_xcb_internal_X_query_1tree_1children:reply:nullptr");
    return;
  }

  if (reply->children_len == 0) {
    WARN("Java_org_freedesktop_xcb_internal_X_query_1tree_1children:n_children:0");
    return;
  }

  xcb_window_t* children = xcb_query_tree_children(reply);

  if (!children) {
    TRACE("Java_org_freedesktop_xcb_internal_X_query_1tree_1children:children:nullptr");
    return;
  }

  env->SetIntArrayRegion(res, 0, len, (jint*) children);
}

JNIEXPORT jlong JNICALL
Java_org_freedesktop_xcb_internal_X_setup_1roots_1iterator(JNIEnv* env, jclass, jlong _setup)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_setup_1roots_1iterator/setup=" << _setup);
  auto setup = PTR_TO(_setup, const xcb_setup_t*);

  xcb_screen_iterator_t* it = new xcb_screen_iterator_t();
   *it = xcb_setup_roots_iterator(setup);

  return (uintptr_t) it;
}

JNIEXPORT void JNICALL
Java_org_freedesktop_xcb_internal_X_screen_1next(JNIEnv* env, jclass, jlong _it)
{
  TRACE("Java_org_freedesktop_xcb_internal_X_screen_1next/it=" << _it);
  auto it = PTR_TO(_it, xcb_screen_iterator_t*);
  xcb_screen_next(it);
}
