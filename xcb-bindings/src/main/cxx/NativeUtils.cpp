#include "LibXcbBindings.hpp"

#include <cstring>
#include <stdlib.h>

JNIEXPORT void JNICALL
Java_org_freedesktop_xcb_NativeUtils_copyToBuffer(JNIEnv * env, jclass, jlong ptr, jobject buf, jint len)
{
 TRACE("Java_org_freedesktop_xcb_NativeUtils_copyToBuffer" <<
       "/ptr=" << ptr <<
       "/buf=" << buf <<
       "/len=" << len);
 void* src = (void*) ptr;
 void* dest = env->GetDirectBufferAddress(buf);
 memcpy(dest, src, len);
}


JNIEXPORT void JNICALL
Java_org_freedesktop_xcb_NativeUtils_copyToPointer(JNIEnv *, jclass, jlong src, jlong dest, jlong len)
{
 TRACE("Java_org_freedesktop_xcb_NativeUtils_copyToPointer" <<
       "/src=" << src <<
       "/dst=" << dest <<
       "/len=" << len);
 memcpy((void*) dest, (void*) src, len);
}


JNIEXPORT void JNICALL
Java_org_freedesktop_xcb_NativeUtils_free(JNIEnv *, jclass, jlong p)
{
 TRACE("Java_org_freedesktop_xcb_NativeUtils_free/p=" << p);
 void* ptr = (void*) p;
 if (!ptr) {
  printf("Attempted to free an invalid pointer!\n");
  return;
 }
 free(ptr);
}