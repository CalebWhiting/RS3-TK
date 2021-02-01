#include <jni.h>

#include <iostream>

#include <xcb/xcb.h>
#include <xcb/xcb_image.h>
#include <xcb/xproto.h>

#include "org_freedesktop_xcb_NativeUtils.h"
#include "org_freedesktop_xcb_internal_X.h"
#include "org_freedesktop_xcb_internal_X_Atom.h"
#include "org_freedesktop_xcb_internal_X_GeometryReply.h"
#include "org_freedesktop_xcb_internal_X_Image.h"
#include "org_freedesktop_xcb_internal_X_ImageFormat.h"
#include "org_freedesktop_xcb_internal_X_QueryTreeReply.h"
#include "org_freedesktop_xcb_internal_X_Screen.h"
#include "org_freedesktop_xcb_internal_X_ScreenIterator.h"
#include "org_freedesktop_xcb_internal_X_Setup.h"
#include "org_freedesktop_xcb_internal_X_WindowAttributesReply.h"
#include "org_freedesktop_xcb_internal_X_GenericError.h"

#ifdef DEBUG
 #define TRACE(L) std::cerr << "\u001b[33m[TRACE] " << L << "\u001b[0m\n"
#else
 #define TRACE(L)
#endif

#define WARN(L) std::cerr << "\u001b[31m[WARN] " << L << "\u001b[0m\n"

std::string xcb_error_name(xcb_generic_error_t* e);