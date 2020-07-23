package uk.calebwhiting.rs3tk.impl.x11;

import static uk.calebwhiting.rs3tk.impl.x11.CTypes.*;
import static uk.calebwhiting.rs3tk.impl.x11.XcbTypes.*;

import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Collections;

/**
 * @see com.sun.jna.platform.unix.X11
 */
public interface Xcb extends Library {

  Xcb INSTANCE = Native.load(
      "xcb",
      Xcb.class,
      Collections.singletonMap(Library.OPTION_FUNCTION_MAPPER, new Mapper()));

  @Function("xcb_flush")
  int flush(Connection c);

  @Function("xcb_get_maximum_request_length")
  UInt32 getMaximumRequestLength(Connection c);

  @Function("xcb_prefetch_maximum_request_length")
  void prefetchMaximumRequestLength(Connection c);

  @Function("xcb_poll_for_special_event")
  Pointer pollForSpecialEvent(Connection c, Pointer se);

  @Function("xcb_wait_for_special_event")
  Pointer waitForSpecialEvent(Connection c, Pointer se);

  @Function("xcb_register_for_special_xge")
  Pointer registerForSpecialXge(Connection c, Pointer ext, UInt32 eid, UInt32 stamp);

  @Function("xcb_unregister_for_special_event")
  void unregisterForSpecialEvent(Connection c, Pointer se);

  @Function("xcb_discard_reply64")
  void discardReply64(Connection c, UInt64 sequence);

  @Function("xcb_get_extension_data")
  Pointer getExtensionData(Connection c, Pointer ext);

  @Function("xcb_prefetch_extension_data")
  void prefetchExtensionData(Connection c, Pointer ext);

  @Function("xcb_get_setup")
  Setup getSetup(Connection c);

  @Function("xcb_get_file_descriptor")
  int getFileDescriptor(Connection c);

  @Function("xcb_connection_has_error")
  int connectionHasError(Connection c);

  @Function("xcb_connect_to_fd")
  Connection connectToFd(int fd, Pointer authInfo);

  @Function("xcb_disconnect")
  void disconnect(Connection c);

  @Function("xcb_parse_display")
  int parseDisplay(String name, String host, IntByReference display, IntByReference screen);

  @Function("xcb_connect_to_display_with_auth_info")
  Connection connectToDisplayWithAuthInfo(String display, Pointer auth, IntByReference screen);

  @Function("xcb_generate_id")
  UInt32 generateId(Connection c);

  @Function("xcb_total_read")
  UInt64 totalRead(Connection c);

  @Function("xcb_total_written")
  UInt64 totalWritten(Connection c);

  @Function("xcb_setup_roots_length")
  int setupRootsLength(Setup R);

  @Function("xcb_setup_roots_iterator")
  ScreenIterator setupRootsIterator(Setup R);

  @Function("xcb_setup_next")
  void setupNext(SetupIterator i);

  @Function("xcb_setup_end")
  GenericIterator setupEnd(SetupIterator i);

  @Function("xcb_wait_for_event")
  GenericEvent waitForEvent(Connection c);

  @Function("xcb_poll_for_event")
  GenericEvent pollForEvent(Connection c);

  @Function("xcb_poll_for_queued_event")
  GenericEvent pollForQueuedEvent(Connection c);

  @Function("xcb_poll_for_special_event")
  GenericEvent pollForSpecialEvent(Connection c, SpecialEvent se);

  @Function("xcb_wait_for_special_event")
  GenericEvent waitForSpecialEvent(Connection c, SpecialEvent se);

  @Function("xcb_register_for_special_xge")
  SpecialEvent registerForSpecialXge(Connection c, Extension ext, UInt32 eid, UInt32 stamp);

  @Function("xcb_unregister_for_special_event")
  void unregisterForSpecialEvent(Connection c, SpecialEvent se);

  @Function("xcb_request_check")
  GenericError requestCheck(Connection c, VoidCookie cookie);

  @Function("xcb_discard_reply")
  void discardReply(Connection c, int sequence);

  @Function("xcb_get_extension_data")
  QueryExtensionReply getExtensionData(Connection c, Extension ext);

  @Function("xcb_prefetch_extension_data")
  void prefetchExtensionData(Connection c, Extension ext);

  @Function("xcb_connect_to_fd")
  Connection connectToFd(int fd, AuthInfo authInfo);

  @Function("xcb_parse_display")
  int parseDisplay(String name, Pointer host, IntByReference display, IntByReference screen);

  @Function("xcb_connect")
  Connection connect(String displayname, IntByReference screenp);

  @Function("xcb_connect_to_display_with_auth_info")
  Connection connectToDisplayWithAuthInfo(String display, AuthInfo auth, IntByReference screen);

  @Function("xcb_char2b_next")
  void char2bNext(Char2bIterator i);

  @Function("xcb_char2b_end")
  GenericIterator char2bEnd(Char2bIterator i);

  @Function("xcb_window_next")
  void windowNext(WindowIterator i);

  @Function("xcb_window_end")
  GenericIterator windowEnd(WindowIterator i);

  @Function("xcb_pixmap_next")
  void pixmapNext(PixmapIterator i);

  @Function("xcb_pixmap_end")
  GenericIterator pixmapEnd(PixmapIterator i);

  @Function("xcb_cursor_next")
  void cursorNext(CursorIterator i);

  @Function("xcb_cursor_end")
  GenericIterator cursorEnd(CursorIterator i);

  @Function("xcb_font_next")
  void fontNext(FontIterator i);

  @Function("xcb_font_end")
  GenericIterator fontEnd(FontIterator i);

  @Function("xcb_gcontext_next")
  void gcontextNext(GcontextIterator i);

  @Function("xcb_gcontext_end")
  GenericIterator gcontextEnd(GcontextIterator i);

  @Function("xcb_colormap_next")
  void colormapNext(ColormapIterator i);

  @Function("xcb_colormap_end")
  GenericIterator colormapEnd(ColormapIterator i);

  @Function("xcb_atom_next")
  void atomNext(AtomIterator i);

  @Function("xcb_atom_end")
  GenericIterator atomEnd(AtomIterator i);

  @Function("xcb_drawable_next")
  void drawableNext(DrawableIterator i);

  @Function("xcb_drawable_end")
  GenericIterator drawableEnd(DrawableIterator i);

  @Function("xcb_fontable_next")
  void fontableNext(FontableIterator i);

  @Function("xcb_fontable_end")
  GenericIterator fontableEnd(FontableIterator i);

  @Function("xcb_bool32_next")
  void bool32Next(Bool32Iterator i);

  @Function("xcb_bool32_end")
  GenericIterator bool32End(Bool32Iterator i);

  @Function("xcb_visualid_next")
  void visualidNext(VisualidIterator i);

  @Function("xcb_visualid_end")
  GenericIterator visualidEnd(VisualidIterator i);

  @Function("xcb_timestamp_next")
  void timestampNext(TimestampIterator i);

  @Function("xcb_timestamp_end")
  GenericIterator timestampEnd(TimestampIterator i);

  @Function("xcb_keysym_next")
  void keysymNext(KeysymIterator i);

  @Function("xcb_keysym_end")
  GenericIterator keysymEnd(KeysymIterator i);

  @Function("xcb_keycode_next")
  void keycodeNext(KeycodeIterator i);

  @Function("xcb_keycode_end")
  GenericIterator keycodeEnd(KeycodeIterator i);

  @Function("xcb_keycode32_next")
  void keycode32Next(Keycode32Iterator i);

  @Function("xcb_keycode32_end")
  GenericIterator keycode32End(Keycode32Iterator i);

  @Function("xcb_button_next")
  void buttonNext(ButtonIterator i);

  @Function("xcb_button_end")
  GenericIterator buttonEnd(ButtonIterator i);

  @Function("xcb_point_next")
  void pointNext(PointIterator i);

  @Function("xcb_point_end")
  GenericIterator pointEnd(PointIterator i);

  @Function("xcb_rectangle_next")
  void rectangleNext(RectangleIterator i);

  @Function("xcb_rectangle_end")
  GenericIterator rectangleEnd(RectangleIterator i);

  @Function("xcb_arc_next")
  void arcNext(ArcIterator i);

  @Function("xcb_arc_end")
  GenericIterator arcEnd(ArcIterator i);

  @Function("xcb_format_next")
  void formatNext(FormatIterator i);

  @Function("xcb_format_end")
  GenericIterator formatEnd(FormatIterator i);

  @Function("xcb_visualtype_next")
  void visualtypeNext(VisualtypeIterator i);

  @Function("xcb_visualtype_end")
  GenericIterator visualtypeEnd(VisualtypeIterator i);

  @Function("xcb_depth_sizeof")
  int depthSizeof(Memory Buffer);

  @Function("xcb_depth_visuals")
  Visualtype depthVisuals(Depth R);

  @Function("xcb_depth_visuals_length")
  int depthVisualsLength(Depth R);

  @Function("xcb_depth_visuals_iterator")
  VisualtypeIterator depthVisualsIterator(Depth R);

  @Function("xcb_depth_next")
  void depthNext(DepthIterator i);

  @Function("xcb_depth_end")
  GenericIterator depthEnd(DepthIterator i);

  @Function("xcb_screen_sizeof")
  int screenSizeof(Memory Buffer);

  @Function("xcb_screen_allowed_depths_length")
  int screenAllowedDepthsLength(Screen R);

  @Function("xcb_screen_allowed_depths_iterator")
  DepthIterator screenAllowedDepthsIterator(Screen R);

  @Function("xcb_screen_next")
  void screenNext(ScreenIterator i);

  @Function("xcb_screen_end")
  GenericIterator screenEnd(ScreenIterator i);

  @Function("xcb_setup_request_sizeof")
  int setupRequestSizeof(Memory Buffer);

  @Function("xcb_setup_request_authorization_protocol_name")
  String setupRequestAuthorizationProtocolName(SetupRequest R);

  @Function("xcb_setup_request_authorization_protocol_name_length")
  int setupRequestAuthorizationProtocolNameLength(SetupRequest R);

  @Function("xcb_setup_request_authorization_protocol_name_end")
  GenericIterator setupRequestAuthorizationProtocolNameEnd(SetupRequest R);

  @Function("xcb_setup_request_authorization_protocol_data")
  String setupRequestAuthorizationProtocolData(SetupRequest R);

  @Function("xcb_setup_request_authorization_protocol_data_length")
  int setupRequestAuthorizationProtocolDataLength(SetupRequest R);

  @Function("xcb_setup_request_authorization_protocol_data_end")
  GenericIterator setupRequestAuthorizationProtocolDataEnd(SetupRequest R);

  @Function("xcb_setup_request_next")
  void setupRequestNext(SetupRequestIterator i);

  @Function("xcb_setup_request_end")
  GenericIterator setupRequestEnd(SetupRequestIterator i);

  @Function("xcb_setup_failed_sizeof")
  int setupFailedSizeof(Memory Buffer);

  @Function("xcb_setup_failed_reason")
  String setupFailedReason(SetupFailed R);

  @Function("xcb_setup_failed_reason_length")
  int setupFailedReasonLength(SetupFailed R);

  @Function("xcb_setup_failed_reason_end")
  GenericIterator setupFailedReasonEnd(SetupFailed R);

  @Function("xcb_setup_failed_next")
  void setupFailedNext(SetupFailedIterator i);

  @Function("xcb_setup_failed_end")
  GenericIterator setupFailedEnd(SetupFailedIterator i);

  @Function("xcb_setup_authenticate_sizeof")
  int setupAuthenticateSizeof(Memory Buffer);

  @Function("xcb_setup_authenticate_reason")
  String setupAuthenticateReason(SetupAuthenticate R);

  @Function("xcb_setup_authenticate_reason_length")
  int setupAuthenticateReasonLength(SetupAuthenticate R);

  @Function("xcb_setup_authenticate_reason_end")
  GenericIterator setupAuthenticateReasonEnd(SetupAuthenticate R);

  @Function("xcb_setup_authenticate_next")
  void setupAuthenticateNext(SetupAuthenticateIterator i);

  @Function("xcb_setup_authenticate_end")
  GenericIterator setupAuthenticateEnd(SetupAuthenticateIterator i);

  @Function("xcb_setup_sizeof")
  int setupSizeof(Memory Buffer);

  @Function("xcb_setup_vendor")
  String setupVendor(Setup R);

  @Function("xcb_setup_vendor_length")
  int setupVendorLength(Setup R);

  @Function("xcb_setup_vendor_end")
  GenericIterator setupVendorEnd(Setup R);

  @Function("xcb_setup_pixmap_formats")
  Format setupPixmapFormats(Setup R);

  @Function("xcb_setup_pixmap_formats_length")
  int setupPixmapFormatsLength(Setup R);

  @Function("xcb_setup_pixmap_formats_iterator")
  FormatIterator setupPixmapFormatsIterator(Setup R);

  @Function("xcb_client_message_data_next")
  void clientMessageDataNext(ClientMessageDataIterator i);

  @Function("xcb_client_message_data_end")
  GenericIterator clientMessageDataEnd(ClientMessageDataIterator i);

  @Function("xcb_create_window_value_list_serialize")
  int createWindowValueListSerialize(
      Pointer Buffer,
      UInt32 valueMask,
      CreateWindowValueList Aux);

  @Function("xcb_create_window_value_list_unpack")
  int createWindowValueListUnpack(
      Pointer Buffer,
      UInt32 valueMask,
      CreateWindowValueList Aux);

  @Function("xcb_create_window_value_list_sizeof")
  int createWindowValueListSizeof(Memory Buffer, UInt32 valueMask);

  @Function("xcb_create_window_sizeof")
  int createWindowSizeof(Memory Buffer);

  @Function("xcb_create_window_checked")
  VoidCookie createWindowChecked(
      Connection c,
      UInt8 depth,
      Window wid,
      Window parent,
      Int16 x,
      Int16 y,
      UInt16 width,
      UInt16 height,
      UInt16 borderWidth,
      UInt16 Class,
      Visualid visual,
      UInt32 valueMask,
      Pointer valueList);

  @Function("xcb_create_window")
  VoidCookie createWindow(
      Connection c,
      UInt8 depth,
      Window wid,
      Window parent,
      Int16 x,
      Int16 y,
      UInt16 width,
      UInt16 height,
      UInt16 borderWidth,
      UInt16 Class,
      Visualid visual,
      UInt32 valueMask,
      Pointer valueList);

  @Function("xcb_create_window_aux_checked")
  VoidCookie createWindowAuxChecked(
      Connection c,
      UInt8 depth,
      Window wid,
      Window parent,
      Int16 x,
      Int16 y,
      UInt16 width,
      UInt16 height,
      UInt16 borderWidth,
      UInt16 Class,
      Visualid visual,
      UInt32 valueMask,
      CreateWindowValueList valueList);

  @Function("xcb_create_window_aux")
  VoidCookie createWindowAux(
      Connection c,
      UInt8 depth,
      Window wid,
      Window parent,
      Int16 x,
      Int16 y,
      UInt16 width,
      UInt16 height,
      UInt16 borderWidth,
      UInt16 Class,
      Visualid visual,
      UInt32 valueMask,
      CreateWindowValueList valueList);

  @Function("xcb_create_window_value_list")
  Pointer createWindowValueList(CreateWindowRequest R);

  @Function("xcb_change_window_attributes_value_list_serialize")
  int changeWindowAttributesValueListSerialize(
      Pointer Buffer,
      UInt32 valueMask,
      ChangeWindowAttributesValueList Aux);

  @Function("xcb_change_window_attributes_value_list_unpack")
  int changeWindowAttributesValueListUnpack(
      Pointer Buffer,
      UInt32 valueMask,
      ChangeWindowAttributesValueList Aux);

  @Function("xcb_change_window_attributes_value_list_sizeof")
  int changeWindowAttributesValueListSizeof(Memory Buffer, UInt32 valueMask);

  @Function("xcb_change_window_attributes_sizeof")
  int changeWindowAttributesSizeof(Memory Buffer);

  @Function("xcb_change_window_attributes_checked")
  VoidCookie changeWindowAttributesChecked(
      Connection c,
      Window window,
      UInt32 valueMask,
      Pointer valueList);

  @Function("xcb_change_window_attributes")
  VoidCookie changeWindowAttributes(
      Connection c,
      Window window,
      UInt32 valueMask,
      Pointer valueList);

  @Function("xcb_change_window_attributes_aux_checked")
  VoidCookie changeWindowAttributesAuxChecked(
      Connection c,
      Window window,
      UInt32 valueMask,
      ChangeWindowAttributesValueList valueList);

  @Function("xcb_change_window_attributes_aux")
  VoidCookie changeWindowAttributesAux(
      Connection c,
      Window window,
      UInt32 valueMask,
      ChangeWindowAttributesValueList valueList);

  @Function("xcb_change_window_attributes_value_list")
  Pointer changeWindowAttributesValueList(ChangeWindowAttributesRequest R);

  @Function("xcb_get_window_attributes")
  GetWindowAttributesCookie getWindowAttributes(Connection c, Window window);

  @Function("xcb_get_window_attributes_unchecked")
  GetWindowAttributesCookie getWindowAttributesUnchecked(Connection c, Window window);

  @Function("xcb_get_window_attributes_reply")
  GetWindowAttributesReply getWindowAttributesReply(
      Connection c,
      GetWindowAttributesCookie cookie,
      Pointer e);

  @Function("xcb_destroy_window_checked")
  VoidCookie destroyWindowChecked(Connection c, Window window);

  @Function("xcb_destroy_window")
  VoidCookie destroyWindow(Connection c, Window window);

  @Function("xcb_destroy_subwindows_checked")
  VoidCookie destroySubwindowsChecked(Connection c, Window window);

  @Function("xcb_destroy_subwindows")
  VoidCookie destroySubwindows(Connection c, Window window);

  @Function("xcb_change_save_set_checked")
  VoidCookie changeSaveSetChecked(Connection c, UInt8 mode, Window window);

  @Function("xcb_change_save_set")
  VoidCookie changeSaveSet(Connection c, UInt8 mode, Window window);

  @Function("xcb_reparent_window_checked")
  VoidCookie reparentWindowChecked(
      Connection c,
      Window window,
      Window parent,
      Int16 x,
      Int16 y);

  @Function("xcb_reparent_window")
  VoidCookie reparentWindow(Connection c, Window window, Window parent, Int16 x, Int16 y);

  @Function("xcb_map_window_checked")
  VoidCookie mapWindowChecked(Connection c, Window window);

  @Function("xcb_map_window")
  VoidCookie mapWindow(Connection c, Window window);

  @Function("xcb_map_subwindows_checked")
  VoidCookie mapSubwindowsChecked(Connection c, Window window);

  @Function("xcb_map_subwindows")
  VoidCookie mapSubwindows(Connection c, Window window);

  @Function("xcb_unmap_window_checked")
  VoidCookie unmapWindowChecked(Connection c, Window window);

  @Function("xcb_unmap_window")
  VoidCookie unmapWindow(Connection c, Window window);

  @Function("xcb_unmap_subwindows_checked")
  VoidCookie unmapSubwindowsChecked(Connection c, Window window);

  @Function("xcb_unmap_subwindows")
  VoidCookie unmapSubwindows(Connection c, Window window);

  @Function("xcb_configure_window_value_list_serialize")
  int configureWindowValueListSerialize(
      Pointer Buffer,
      UInt16 valueMask,
      ConfigureWindowValueList Aux);

  @Function("xcb_configure_window_value_list_unpack")
  int configureWindowValueListUnpack(
      Pointer Buffer,
      UInt16 valueMask,
      ConfigureWindowValueList Aux);

  @Function("xcb_configure_window_value_list_sizeof")
  int configureWindowValueListSizeof(Memory Buffer, UInt16 valueMask);

  @Function("xcb_configure_window_sizeof")
  int configureWindowSizeof(Memory Buffer);

  @Function("xcb_configure_window_checked")
  VoidCookie configureWindowChecked(
      Connection c,
      Window window,
      UInt16 valueMask,
      Pointer valueList);

  @Function("xcb_configure_window")
  VoidCookie configureWindow(
      Connection c,
      Window window,
      UInt16 valueMask,
      Pointer valueList);

  @Function("xcb_configure_window_aux_checked")
  VoidCookie configureWindowAuxChecked(
      Connection c,
      Window window,
      UInt16 valueMask,
      ConfigureWindowValueList valueList);

  @Function("xcb_configure_window_aux")
  VoidCookie configureWindowAux(
      Connection c,
      Window window,
      UInt16 valueMask,
      ConfigureWindowValueList valueList);

  @Function("xcb_configure_window_value_list")
  Pointer configureWindowValueList(ConfigureWindowRequest R);

  @Function("xcb_circulate_window_checked")
  VoidCookie circulateWindowChecked(Connection c, UInt8 direction, Window window);

  @Function("xcb_circulate_window")
  VoidCookie circulateWindow(Connection c, UInt8 direction, Window window);

  @Function("xcb_get_geometry")
  GetGeometryCookie getGeometry(Connection c, Drawable drawable);

  @Function("xcb_get_geometry_unchecked")
  GetGeometryCookie getGeometryUnchecked(Connection c, Drawable drawable);

  @Function("xcb_get_geometry_reply")
  GetGeometryReply getGeometryReply(Connection c, GetGeometryCookie cookie, Pointer e);

  @Function("query_tree_sizeof")
  int queryTreeSizeof(Memory Buffer);

  @Function("query_tree")
  QueryTreeCookie queryTree(Connection c, Window window);

  @Function("query_tree_unchecked")
  QueryTreeCookie queryTreeUnchecked(Connection c, Window window);

  @Function("query_tree_children")
  Window queryTreeChildren(QueryTreeReply R);

  @Function("query_tree_children_length")
  int queryTreeChildrenLength(QueryTreeReply R);

  @Function("query_tree_children_end")
  GenericIterator queryTreeChildrenEnd(QueryTreeReply R);

  @Function("query_tree_reply")
  QueryTreeReply queryTreeReply(Connection c, QueryTreeCookie cookie, Pointer e);

  @Function("xcb_intern_atom_sizeof")
  int internAtomSizeof(Memory Buffer);

  @Function("xcb_intern_atom")
  InternAtomCookie internAtom(
      Connection c,
      UInt8 onlyIfExists,
      UInt16 nameLen,
      String name);

  @Function("xcb_intern_atom_unchecked")
  InternAtomCookie internAtomUnchecked(
      Connection c,
      UInt8 onlyIfExists,
      UInt16 nameLen,
      String name);

  @Function("xcb_intern_atom_reply")
  InternAtomReply internAtomReply(Connection c, InternAtomCookie cookie, Pointer e);

  @Function("xcb_get_atom_name_sizeof")
  int getAtomNameSizeof(Memory Buffer);

  @Function("xcb_get_atom_name")
  GetAtomNameCookie getAtomName(Connection c, Atom atom);

  @Function("xcb_get_atom_name_unchecked")
  GetAtomNameCookie getAtomNameUnchecked(Connection c, Atom atom);

  @Function("xcb_get_atom_name_name")
  String getAtomNameName(GetAtomNameReply R);

  @Function("xcb_get_atom_name_name_length")
  int getAtomNameNameLength(GetAtomNameReply R);

  @Function("xcb_get_atom_name_name_end")
  GenericIterator getAtomNameNameEnd(GetAtomNameReply R);

  @Function("xcb_get_atom_name_reply")
  GetAtomNameReply getAtomNameReply(Connection c, GetAtomNameCookie cookie, Pointer e);

  @Function("xcb_change_property_sizeof")
  int changePropertySizeof(Memory Buffer);

  @Function("xcb_change_property_checked")
  VoidCookie changePropertyChecked(
      Connection c,
      UInt8 mode,
      Window window,
      Atom property,
      Atom type,
      UInt8 format,
      UInt32 dataLen,
      Pointer data);

  @Function("xcb_change_property")
  VoidCookie changeProperty(
      Connection c,
      UInt8 mode,
      Window window,
      Atom property,
      Atom type,
      UInt8 format,
      UInt32 dataLen,
      Pointer data);

  @Function("xcb_change_property_data")
  Pointer changePropertyData(ChangePropertyRequest R);

  @Function("xcb_change_property_data_length")
  int changePropertyDataLength(ChangePropertyRequest R);

  @Function("xcb_change_property_data_end")
  GenericIterator changePropertyDataEnd(ChangePropertyRequest R);

  @Function("xcb_delete_property_checked")
  VoidCookie deletePropertyChecked(Connection c, Window window, Atom property);

  @Function("xcb_delete_property")
  VoidCookie deleteProperty(Connection c, Window window, Atom property);

  @Function("xcb_get_property_sizeof")
  int getPropertySizeof(Memory Buffer);

  @Function("xcb_get_property")
  GetPropertyCookie getProperty(
      Connection c,
      UInt8 Delete,
      Window window,
      Atom property,
      Atom type,
      UInt32 longOffset,
      UInt32 longLength);

  @Function("xcb_get_property_unchecked")
  GetPropertyCookie getPropertyUnchecked(
      Connection c,
      UInt8 Delete,
      Window window,
      Atom property,
      Atom type,
      UInt32 longOffset,
      UInt32 longLength);

  @Function("xcb_get_property_value")
  Pointer getPropertyValue(GetPropertyReply R);

  @Function("xcb_get_property_value_length")
  int getPropertyValueLength(GetPropertyReply R);

  @Function("xcb_get_property_value_end")
  GenericIterator getPropertyValueEnd(GetPropertyReply R);

  @Function("xcb_get_property_reply")
  GetPropertyReply getPropertyReply(Connection c, GetPropertyCookie cookie, Pointer e);

  @Function("xcb_list_properties_sizeof")
  int listPropertiesSizeof(Memory Buffer);

  @Function("xcb_list_properties")
  ListPropertiesCookie listProperties(Connection c, Window window);

  @Function("xcb_list_properties_unchecked")
  ListPropertiesCookie listPropertiesUnchecked(Connection c, Window window);

  @Function("xcb_list_properties_atoms")
  Atom listPropertiesAtoms(ListPropertiesReply R);

  @Function("xcb_list_properties_atoms_length")
  int listPropertiesAtomsLength(ListPropertiesReply R);

  @Function("xcb_list_properties_atoms_end")
  GenericIterator listPropertiesAtomsEnd(ListPropertiesReply R);

  @Function("xcb_list_properties_reply")
  ListPropertiesReply listPropertiesReply(
      Connection c,
      ListPropertiesCookie cookie,
      Pointer e);

  @Function("xcb_set_selection_owner_checked")
  VoidCookie setSelectionOwnerChecked(
      Connection c,
      Window owner,
      Atom selection,
      Timestamp time);

  @Function("xcb_set_selection_owner")
  VoidCookie setSelectionOwner(Connection c, Window owner, Atom selection, Timestamp time);

  @Function("xcb_get_selection_owner")
  GetSelectionOwnerCookie getSelectionOwner(Connection c, Atom selection);

  @Function("xcb_get_selection_owner_unchecked")
  GetSelectionOwnerCookie getSelectionOwnerUnchecked(Connection c, Atom selection);

  @Function("xcb_get_selection_owner_reply")
  GetSelectionOwnerReply getSelectionOwnerReply(
      Connection c,
      GetSelectionOwnerCookie cookie,
      Pointer e);

  @Function("xcb_convert_selection_checked")
  VoidCookie convertSelectionChecked(
      Connection c,
      Window requestor,
      Atom selection,
      Atom target,
      Atom property,
      Timestamp time);

  @Function("xcb_convert_selection")
  VoidCookie convertSelection(
      Connection c,
      Window requestor,
      Atom selection,
      Atom target,
      Atom property,
      Timestamp time);

  @Function("xcb_send_event_checked")
  VoidCookie sendEventChecked(
      Connection c,
      UInt8 propagate,
      Window destination,
      UInt32 eventMask,
      String event);

  @Function("xcb_send_event")
  VoidCookie sendEvent(
      Connection c,
      UInt8 propagate,
      Window destination,
      UInt32 eventMask,
      String event);

  @Function("xcb_grab_pointer")
  GrabPointerCookie grabPointer(
      Connection c,
      UInt8 ownerEvents,
      Window grabWindow,
      UInt16 eventMask,
      UInt8 pointerMode,
      UInt8 keyboardMode,
      Window confineTo,
      Cursor cursor,
      Timestamp time);

  @Function("xcb_grab_pointer_unchecked")
  GrabPointerCookie grabPointerUnchecked(
      Connection c,
      UInt8 ownerEvents,
      Window grabWindow,
      UInt16 eventMask,
      UInt8 pointerMode,
      UInt8 keyboardMode,
      Window confineTo,
      Cursor cursor,
      Timestamp time);

  @Function("xcb_grab_pointer_reply")
  GrabPointerReply grabPointerReply(Connection c, GrabPointerCookie cookie, Pointer e);

  @Function("xcb_ungrab_pointer_checked")
  VoidCookie ungrabPointerChecked(Connection c, Timestamp time);

  @Function("xcb_ungrab_pointer")
  VoidCookie ungrabPointer(Connection c, Timestamp time);

  @Function("xcb_grab_button_checked")
  VoidCookie grabButtonChecked(
      Connection c,
      UInt8 ownerEvents,
      Window grabWindow,
      UInt16 eventMask,
      UInt8 pointerMode,
      UInt8 keyboardMode,
      Window confineTo,
      Cursor cursor,
      UInt8 button,
      UInt16 modifiers);

  @Function("xcb_grab_button")
  VoidCookie grabButton(
      Connection c,
      UInt8 ownerEvents,
      Window grabWindow,
      UInt16 eventMask,
      UInt8 pointerMode,
      UInt8 keyboardMode,
      Window confineTo,
      Cursor cursor,
      UInt8 button,
      UInt16 modifiers);

  @Function("xcb_ungrab_button_checked")
  VoidCookie ungrabButtonChecked(
      Connection c,
      UInt8 button,
      Window grabWindow,
      UInt16 modifiers);

  @Function("xcb_ungrab_button")
  VoidCookie ungrabButton(Connection c, UInt8 button, Window grabWindow, UInt16 modifiers);

  @Function("xcb_change_active_pointer_grab_checked")
  VoidCookie changeActivePointerGrabChecked(
      Connection c,
      Cursor cursor,
      Timestamp time,
      UInt16 eventMask);

  @Function("xcb_change_active_pointer_grab")
  VoidCookie changeActivePointerGrab(
      Connection c,
      Cursor cursor,
      Timestamp time,
      UInt16 eventMask);

  @Function("xcb_grab_keyboard")
  GrabKeyboardCookie grabKeyboard(
      Connection c,
      UInt8 ownerEvents,
      Window grabWindow,
      Timestamp time,
      UInt8 pointerMode,
      UInt8 keyboardMode);

  @Function("xcb_grab_keyboard_unchecked")
  GrabKeyboardCookie grabKeyboardUnchecked(
      Connection c,
      UInt8 ownerEvents,
      Window grabWindow,
      Timestamp time,
      UInt8 pointerMode,
      UInt8 keyboardMode);

  @Function("xcb_grab_keyboard_reply")
  GrabKeyboardReply grabKeyboardReply(Connection c, GrabKeyboardCookie cookie, Pointer e);

  @Function("xcb_ungrab_keyboard_checked")
  VoidCookie ungrabKeyboardChecked(Connection c, Timestamp time);

  @Function("xcb_ungrab_keyboard")
  VoidCookie ungrabKeyboard(Connection c, Timestamp time);

  @Function("xcb_grab_key_checked")
  VoidCookie grabKeyChecked(
      Connection c,
      UInt8 ownerEvents,
      Window grabWindow,
      UInt16 modifiers,
      Keycode key,
      UInt8 pointerMode,
      UInt8 keyboardMode);

  @Function("xcb_grab_key")
  VoidCookie grabKey(
      Connection c,
      UInt8 ownerEvents,
      Window grabWindow,
      UInt16 modifiers,
      Keycode key,
      UInt8 pointerMode,
      UInt8 keyboardMode);

  @Function("xcb_ungrab_key_checked")
  VoidCookie ungrabKeyChecked(
      Connection c,
      Keycode key,
      Window grabWindow,
      UInt16 modifiers);

  @Function("xcb_ungrab_key")
  VoidCookie ungrabKey(Connection c, Keycode key, Window grabWindow, UInt16 modifiers);

  @Function("xcb_allow_events_checked")
  VoidCookie allowEventsChecked(Connection c, UInt8 mode, Timestamp time);

  @Function("xcb_allow_events")
  VoidCookie allowEvents(Connection c, UInt8 mode, Timestamp time);

  @Function("xcb_grab_server_checked")
  VoidCookie grabServerChecked(Connection c);

  @Function("xcb_grab_server")
  VoidCookie grabServer(Connection c);

  @Function("xcb_ungrab_server_checked")
  VoidCookie ungrabServerChecked(Connection c);

  @Function("xcb_ungrab_server")
  VoidCookie ungrabServer(Connection c);

  @Function("xcb_query_pointer")
  QueryPointerCookie queryPointer(Connection c, Window window);

  @Function("xcb_query_pointer_unchecked")
  QueryPointerCookie queryPointerUnchecked(Connection c, Window window);

  @Function("xcb_query_pointer_reply")
  QueryPointerReply queryPointerReply(Connection c, QueryPointerCookie cookie, Pointer e);

  @Function("xcb_timecoord_next")
  void timecoordNext(TimecoordIterator i);

  @Function("xcb_timecoord_end")
  GenericIterator timecoordEnd(TimecoordIterator i);

  @Function("xcb_get_motion_events_sizeof")
  int getMotionEventsSizeof(Memory Buffer);

  @Function("xcb_get_motion_events")
  GetMotionEventsCookie getMotionEvents(
      Connection c,
      Window window,
      Timestamp start,
      Timestamp stop);

  @Function("xcb_get_motion_events_unchecked")
  GetMotionEventsCookie getMotionEventsUnchecked(
      Connection c,
      Window window,
      Timestamp start,
      Timestamp stop);

  @Function("xcb_get_motion_events_events")
  Timecoord getMotionEventsEvents(GetMotionEventsReply R);

  @Function("xcb_get_motion_events_events_length")
  int getMotionEventsEventsLength(GetMotionEventsReply R);

  @Function("xcb_get_motion_events_events_iterator")
  TimecoordIterator getMotionEventsEventsIterator(GetMotionEventsReply R);

  @Function("xcb_get_motion_events_reply")
  GetMotionEventsReply getMotionEventsReply(
      Connection c,
      GetMotionEventsCookie cookie,
      Pointer e);

  @Function("xcb_translate_coordinates")
  TranslateCoordinatesCookie translateCoordinates(
      Connection c,
      Window srcWindow,
      Window dstWindow,
      Int16 srcX,
      Int16 srcY);

  @Function("xcb_translate_coordinates_unchecked")
  TranslateCoordinatesCookie translateCoordinatesUnchecked(
      Connection c,
      Window srcWindow,
      Window dstWindow,
      Int16 srcX,
      Int16 srcY);

  @Function("xcb_translate_coordinates_reply")
  TranslateCoordinatesReply translateCoordinatesReply(
      Connection c,
      TranslateCoordinatesCookie cookie,
      Pointer e);

  @Function("xcb_warp_pointer_checked")
  VoidCookie warpPointerChecked(
      Connection c,
      Window srcWindow,
      Window dstWindow,
      Int16 srcX,
      Int16 srcY,
      UInt16 srcWidth,
      UInt16 srcHeight,
      Int16 dstX,
      Int16 dstY);

  @Function("xcb_warp_pointer")
  VoidCookie warpPointer(
      Connection c,
      Window srcWindow,
      Window dstWindow,
      Int16 srcX,
      Int16 srcY,
      UInt16 srcWidth,
      UInt16 srcHeight,
      Int16 dstX,
      Int16 dstY);

  @Function("xcb_set_input_focus_checked")
  VoidCookie setInputFocusChecked(
      Connection c,
      UInt8 revertTo,
      Window focus,
      Timestamp time);

  @Function("xcb_set_input_focus")
  VoidCookie setInputFocus(Connection c, UInt8 revertTo, Window focus, Timestamp time);

  @Function("xcb_get_input_focus")
  GetInputFocusCookie getInputFocus(Connection c);

  @Function("xcb_get_input_focus_unchecked")
  GetInputFocusCookie getInputFocusUnchecked(Connection c);

  @Function("xcb_get_input_focus_reply")
  GetInputFocusReply getInputFocusReply(Connection c, GetInputFocusCookie cookie, Pointer e);

  @Function("xcb_query_keymap")
  QueryKeymapCookie queryKeymap(Connection c);

  @Function("xcb_query_keymap_unchecked")
  QueryKeymapCookie queryKeymapUnchecked(Connection c);

  @Function("xcb_query_keymap_reply")
  QueryKeymapReply queryKeymapReply(Connection c, QueryKeymapCookie cookie, Pointer e);

  @Function("xcb_open_font_sizeof")
  int openFontSizeof(Memory Buffer);

  @Function("xcb_open_font_checked")
  VoidCookie openFontChecked(Connection c, Font fid, UInt16 nameLen, String name);

  @Function("xcb_open_font")
  VoidCookie openFont(Connection c, Font fid, UInt16 nameLen, String name);

  @Function("xcb_open_font_name")
  String openFontName(OpenFontRequest R);

  @Function("xcb_open_font_name_length")
  int openFontNameLength(OpenFontRequest R);

  @Function("xcb_open_font_name_end")
  GenericIterator openFontNameEnd(OpenFontRequest R);

  @Function("xcb_close_font_checked")
  VoidCookie closeFontChecked(Connection c, Font font);

  @Function("xcb_close_font")
  VoidCookie closeFont(Connection c, Font font);

  @Function("xcb_fontprop_next")
  void fontpropNext(FontpropIterator i);

  @Function("xcb_fontprop_end")
  GenericIterator fontpropEnd(FontpropIterator i);

  @Function("xcb_charinfo_next")
  void charinfoNext(CharinfoIterator i);

  @Function("xcb_charinfo_end")
  GenericIterator charinfoEnd(CharinfoIterator i);

  @Function("xcb_query_font_sizeof")
  int queryFontSizeof(Memory Buffer);

  @Function("xcb_query_font")
  QueryFontCookie queryFont(Connection c, Fontable font);

  @Function("xcb_query_font_unchecked")
  QueryFontCookie queryFontUnchecked(Connection c, Fontable font);

  @Function("xcb_query_font_properties")
  Fontprop queryFontProperties(QueryFontReply R);

  @Function("xcb_query_font_properties_length")
  int queryFontPropertiesLength(QueryFontReply R);

  @Function("xcb_query_font_properties_iterator")
  FontpropIterator queryFontPropertiesIterator(QueryFontReply R);

  @Function("xcb_query_font_char_infos")
  Charinfo queryFontCharInfos(QueryFontReply R);

  @Function("xcb_query_font_char_infos_length")
  int queryFontCharInfosLength(QueryFontReply R);

  @Function("xcb_query_font_char_infos_iterator")
  CharinfoIterator queryFontCharInfosIterator(QueryFontReply R);

  @Function("xcb_query_font_reply")
  QueryFontReply queryFontReply(Connection c, QueryFontCookie cookie, Pointer e);

  @Function("query_text_extents_sizeof")
  int queryTextExtentsSizeof(Memory Buffer, UInt32 stringLen);

  @Function("query_text_extents")
  QueryTextExtentsCookie queryTextExtents(
      Connection c,
      Fontable font,
      UInt32 stringLen,
      Char2b string);

  @Function("query_text_extents_unchecked")
  QueryTextExtentsCookie queryTextExtentsUnchecked(
      Connection c,
      Fontable font,
      UInt32 stringLen,
      Char2b string);

  @Function("query_text_extents_reply")
  QueryTextExtentsReply queryTextExtentsReply(
      Connection c,
      QueryTextExtentsCookie cookie,
      Pointer e);

  @Function("xcb_str_sizeof")
  int strSizeof(Memory Buffer);

  @Function("xcb_str_name")
  String strName(Str R);

  @Function("xcb_str_name_length")
  int strNameLength(Str R);

  @Function("xcb_str_name_end")
  GenericIterator strNameEnd(Str R);

  @Function("xcb_str_next")
  void strNext(StrIterator i);

  @Function("xcb_str_end")
  GenericIterator strEnd(StrIterator i);

  @Function("xcb_list_fonts_sizeof")
  int listFontsSizeof(Memory Buffer);

  @Function("xcb_list_fonts")
  ListFontsCookie listFonts(
      Connection c,
      UInt16 maxNames,
      UInt16 patternLen,
      String pattern);

  @Function("xcb_list_fonts_unchecked")
  ListFontsCookie listFontsUnchecked(
      Connection c,
      UInt16 maxNames,
      UInt16 patternLen,
      String pattern);

  @Function("xcb_list_fonts_names_length")
  int listFontsNamesLength(ListFontsReply R);

  @Function("xcb_list_fonts_names_iterator")
  StrIterator listFontsNamesIterator(ListFontsReply R);

  @Function("xcb_list_fonts_reply")
  ListFontsReply listFontsReply(Connection c, ListFontsCookie cookie, Pointer e);

  @Function("xcb_list_fonts_with_info_sizeof")
  int listFontsWithInfoSizeof(Memory Buffer);

  @Function("xcb_list_fonts_with_info")
  ListFontsWithInfoCookie listFontsWithInfo(
      Connection c,
      UInt16 maxNames,
      UInt16 patternLen,
      String pattern);

  @Function("xcb_list_fonts_with_info_unchecked")
  ListFontsWithInfoCookie listFontsWithInfoUnchecked(
      Connection c,
      UInt16 maxNames,
      UInt16 patternLen,
      String pattern);

  @Function("xcb_list_fonts_with_info_properties")
  Fontprop listFontsWithInfoProperties(ListFontsWithInfoReply R);

  @Function("xcb_list_fonts_with_info_properties_length")
  int listFontsWithInfoPropertiesLength(ListFontsWithInfoReply R);

  @Function("xcb_list_fonts_with_info_properties_iterator")
  FontpropIterator listFontsWithInfoPropertiesIterator(ListFontsWithInfoReply R);

  @Function("xcb_list_fonts_with_info_name")
  String listFontsWithInfoName(ListFontsWithInfoReply R);

  @Function("xcb_list_fonts_with_info_name_length")
  int listFontsWithInfoNameLength(ListFontsWithInfoReply R);

  @Function("xcb_list_fonts_with_info_name_end")
  GenericIterator listFontsWithInfoNameEnd(ListFontsWithInfoReply R);

  @Function("xcb_list_fonts_with_info_reply")
  ListFontsWithInfoReply listFontsWithInfoReply(
      Connection c,
      ListFontsWithInfoCookie cookie,
      Pointer e);

  @Function("xcb_set_font_path_sizeof")
  int setFontPathSizeof(Memory Buffer);

  @Function("xcb_set_font_path_checked")
  VoidCookie setFontPathChecked(Connection c, UInt16 fontQty, Str font);

  @Function("xcb_set_font_path")
  VoidCookie setFontPath(Connection c, UInt16 fontQty, Str font);

  @Function("xcb_set_font_path_font_length")
  int setFontPathFontLength(SetFontPathRequest R);

  @Function("xcb_set_font_path_font_iterator")
  StrIterator setFontPathFontIterator(SetFontPathRequest R);

  @Function("xcb_get_font_path_sizeof")
  int getFontPathSizeof(Memory Buffer);

  @Function("xcb_get_font_path")
  GetFontPathCookie getFontPath(Connection c);

  @Function("xcb_get_font_path_unchecked")
  GetFontPathCookie getFontPathUnchecked(Connection c);

  @Function("xcb_get_font_path_path_length")
  int getFontPathPathLength(GetFontPathReply R);

  @Function("xcb_get_font_path_path_iterator")
  StrIterator getFontPathPathIterator(GetFontPathReply R);

  @Function("xcb_get_font_path_reply")
  GetFontPathReply getFontPathReply(Connection c, GetFontPathCookie cookie, Pointer e);

  @Function("xcb_create_pixmap_checked")
  VoidCookie createPixmapChecked(
      Connection c,
      UInt8 depth,
      Pixmap pid,
      Drawable drawable,
      UInt16 width,
      UInt16 height);

  @Function("xcb_create_pixmap")
  VoidCookie createPixmap(
      Connection c,
      UInt8 depth,
      Pixmap pid,
      Drawable drawable,
      UInt16 width,
      UInt16 height);

  @Function("xcb_free_pixmap_checked")
  VoidCookie freePixmapChecked(Connection c, Pixmap pixmap);

  @Function("xcb_free_pixmap")
  VoidCookie freePixmap(Connection c, Pixmap pixmap);

  @Function("xcb_create_gc_value_list_serialize")
  int createGcValueListSerialize(
      Pointer Buffer,
      UInt32 valueMask,
      CreateGcValueList Aux);

  @Function("xcb_create_gc_value_list_unpack")
  int createGcValueListUnpack(Pointer Buffer, UInt32 valueMask, CreateGcValueList Aux);

  @Function("xcb_create_gc_value_list_sizeof")
  int createGcValueListSizeof(Memory Buffer, UInt32 valueMask);

  @Function("xcb_create_gc_sizeof")
  int createGcSizeof(Memory Buffer);

  @Function("xcb_create_gc_checked")
  VoidCookie createGcChecked(
      Connection c,
      Gcontext cid,
      Drawable drawable,
      UInt32 valueMask,
      Pointer valueList);

  @Function("xcb_create_gc")
  VoidCookie createGc(
      Connection c,
      Gcontext cid,
      Drawable drawable,
      UInt32 valueMask,
      Pointer valueList);

  @Function("xcb_create_gc_aux_checked")
  VoidCookie createGcAuxChecked(
      Connection c,
      Gcontext cid,
      Drawable drawable,
      UInt32 valueMask,
      CreateGcValueList valueList);

  @Function("xcb_create_gc_aux")
  VoidCookie createGcAux(
      Connection c,
      Gcontext cid,
      Drawable drawable,
      UInt32 valueMask,
      CreateGcValueList valueList);

  @Function("xcb_create_gc_value_list")
  Pointer createGcValueList(CreateGcRequest R);

  @Function("xcb_change_gc_value_list_serialize")
  int changeGcValueListSerialize(
      Pointer Buffer,
      UInt32 valueMask,
      ChangeGcValueList Aux);

  @Function("xcb_change_gc_value_list_unpack")
  int changeGcValueListUnpack(Pointer Buffer, UInt32 valueMask, ChangeGcValueList Aux);

  @Function("xcb_change_gc_value_list_sizeof")
  int changeGcValueListSizeof(Memory Buffer, UInt32 valueMask);

  @Function("xcb_change_gc_sizeof")
  int changeGcSizeof(Memory Buffer);

  @Function("xcb_change_gc_checked")
  VoidCookie changeGcChecked(
      Connection c,
      Gcontext gc,
      UInt32 valueMask,
      Pointer valueList);

  @Function("xcb_change_gc")
  VoidCookie changeGc(Connection c, Gcontext gc, UInt32 valueMask, Pointer valueList);

  @Function("xcb_change_gc_aux_checked")
  VoidCookie changeGcAuxChecked(
      Connection c,
      Gcontext gc,
      UInt32 valueMask,
      ChangeGcValueList valueList);

  @Function("xcb_change_gc_aux")
  VoidCookie changeGcAux(
      Connection c,
      Gcontext gc,
      UInt32 valueMask,
      ChangeGcValueList valueList);

  @Function("xcb_change_gc_value_list")
  Pointer changeGcValueList(ChangeGcRequest R);

  @Function("xcb_copy_gc_checked")
  VoidCookie copyGcChecked(Connection c, Gcontext srcGc, Gcontext dstGc, UInt32 valueMask);

  @Function("xcb_copy_gc")
  VoidCookie copyGc(Connection c, Gcontext srcGc, Gcontext dstGc, UInt32 valueMask);

  @Function("xcb_set_dashes_sizeof")
  int setDashesSizeof(Memory Buffer);

  @Function("xcb_set_dashes_checked")
  VoidCookie setDashesChecked(
      Connection c,
      Gcontext gc,
      UInt16 dashOffset,
      UInt16 dashesLen,
      UInt8 dashes);

  @Function("xcb_set_dashes")
  VoidCookie setDashes(
      Connection c,
      Gcontext gc,
      UInt16 dashOffset,
      UInt16 dashesLen,
      UInt8 dashes);

  @Function("xcb_set_dashes_dashes")
  UInt8 setDashesDashes(SetDashesRequest R);

  @Function("xcb_set_dashes_dashes_length")
  int setDashesDashesLength(SetDashesRequest R);

  @Function("xcb_set_dashes_dashes_end")
  GenericIterator setDashesDashesEnd(SetDashesRequest R);

  @Function("xcb_set_clip_rectangles_sizeof")
  int setClipRectanglesSizeof(Memory Buffer, UInt32 rectanglesLen);

  @Function("xcb_set_clip_rectangles_checked")
  VoidCookie setClipRectanglesChecked(
      Connection c,
      UInt8 ordering,
      Gcontext gc,
      Int16 clipXOrigin,
      Int16 clipYOrigin,
      UInt32 rectanglesLen,
      Rectangle rectangles);

  @Function("xcb_set_clip_rectangles")
  VoidCookie setClipRectangles(
      Connection c,
      UInt8 ordering,
      Gcontext gc,
      Int16 clipXOrigin,
      Int16 clipYOrigin,
      UInt32 rectanglesLen,
      Rectangle rectangles);

  @Function("xcb_set_clip_rectangles_rectangles")
  Rectangle setClipRectanglesRectangles(SetClipRectanglesRequest R);

  @Function("xcb_set_clip_rectangles_rectangles_length")
  int setClipRectanglesRectanglesLength(SetClipRectanglesRequest R);

  @Function("xcb_set_clip_rectangles_rectangles_iterator")
  RectangleIterator setClipRectanglesRectanglesIterator(SetClipRectanglesRequest R);

  @Function("xcb_free_gc_checked")
  VoidCookie freeGcChecked(Connection c, Gcontext gc);

  @Function("xcb_free_gc")
  VoidCookie freeGc(Connection c, Gcontext gc);

  @Function("xcb_clear_area_checked")
  VoidCookie clearAreaChecked(
      Connection c,
      UInt8 exposures,
      Window window,
      Int16 x,
      Int16 y,
      UInt16 width,
      UInt16 height);

  @Function("xcb_clear_area")
  VoidCookie clearArea(
      Connection c,
      UInt8 exposures,
      Window window,
      Int16 x,
      Int16 y,
      UInt16 width,
      UInt16 height);

  @Function("xcb_copy_area_checked")
  VoidCookie copyAreaChecked(
      Connection c,
      Drawable srcDrawable,
      Drawable dstDrawable,
      Gcontext gc,
      Int16 srcX,
      Int16 srcY,
      Int16 dstX,
      Int16 dstY,
      UInt16 width,
      UInt16 height);

  @Function("xcb_copy_area")
  VoidCookie copyArea(
      Connection c,
      Drawable srcDrawable,
      Drawable dstDrawable,
      Gcontext gc,
      Int16 srcX,
      Int16 srcY,
      Int16 dstX,
      Int16 dstY,
      UInt16 width,
      UInt16 height);

  @Function("xcb_copy_plane_checked")
  VoidCookie copyPlaneChecked(
      Connection c,
      Drawable srcDrawable,
      Drawable dstDrawable,
      Gcontext gc,
      Int16 srcX,
      Int16 srcY,
      Int16 dstX,
      Int16 dstY,
      UInt16 width,
      UInt16 height,
      UInt32 bitPlane);

  @Function("xcb_copy_plane")
  VoidCookie copyPlane(
      Connection c,
      Drawable srcDrawable,
      Drawable dstDrawable,
      Gcontext gc,
      Int16 srcX,
      Int16 srcY,
      Int16 dstX,
      Int16 dstY,
      UInt16 width,
      UInt16 height,
      UInt32 bitPlane);

  @Function("xcb_poly_point_sizeof")
  int polyPointSizeof(Memory Buffer, UInt32 pointsLen);

  @Function("xcb_poly_point_checked")
  VoidCookie polyPointChecked(
      Connection c,
      UInt8 coordinateMode,
      Drawable drawable,
      Gcontext gc,
      UInt32 pointsLen,
      Point points);

  @Function("xcb_poly_point")
  VoidCookie polyPoint(
      Connection c,
      UInt8 coordinateMode,
      Drawable drawable,
      Gcontext gc,
      UInt32 pointsLen,
      Point points);

  @Function("xcb_poly_point_points")
  Point polyPointPoints(PolyPointRequest R);

  @Function("xcb_poly_point_points_length")
  int polyPointPointsLength(PolyPointRequest R);

  @Function("xcb_poly_point_points_iterator")
  PointIterator polyPointPointsIterator(PolyPointRequest R);

  @Function("xcb_poly_line_sizeof")
  int polyLineSizeof(Memory Buffer, UInt32 pointsLen);

  @Function("xcb_poly_line_checked")
  VoidCookie polyLineChecked(
      Connection c,
      UInt8 coordinateMode,
      Drawable drawable,
      Gcontext gc,
      UInt32 pointsLen,
      Point points);

  @Function("xcb_poly_line")
  VoidCookie polyLine(
      Connection c,
      UInt8 coordinateMode,
      Drawable drawable,
      Gcontext gc,
      UInt32 pointsLen,
      Point points);

  @Function("xcb_poly_line_points")
  Point polyLinePoints(PolyLineRequest R);

  @Function("xcb_poly_line_points_length")
  int polyLinePointsLength(PolyLineRequest R);

  @Function("xcb_poly_line_points_iterator")
  PointIterator polyLinePointsIterator(PolyLineRequest R);

  @Function("xcb_segment_next")
  void segmentNext(SegmentIterator i);

  @Function("xcb_segment_end")
  GenericIterator segmentEnd(SegmentIterator i);

  @Function("xcb_poly_segment_sizeof")
  int polySegmentSizeof(Memory Buffer, UInt32 segmentsLen);

  @Function("xcb_poly_segment_checked")
  VoidCookie polySegmentChecked(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 segmentsLen,
      Segment segments);

  @Function("xcb_poly_segment")
  VoidCookie polySegment(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 segmentsLen,
      Segment segments);

  @Function("xcb_poly_segment_segments")
  Segment polySegmentSegments(PolySegmentRequest R);

  @Function("xcb_poly_segment_segments_length")
  int polySegmentSegmentsLength(PolySegmentRequest R);

  @Function("xcb_poly_segment_segments_iterator")
  SegmentIterator polySegmentSegmentsIterator(PolySegmentRequest R);

  @Function("xcb_poly_rectangle_sizeof")
  int polyRectangleSizeof(Memory Buffer, UInt32 rectanglesLen);

  @Function("xcb_poly_rectangle_checked")
  VoidCookie polyRectangleChecked(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 rectanglesLen,
      Rectangle rectangles);

  @Function("xcb_poly_rectangle")
  VoidCookie polyRectangle(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 rectanglesLen,
      Rectangle rectangles);

  @Function("xcb_poly_rectangle_rectangles")
  Rectangle polyRectangleRectangles(PolyRectangleRequest R);

  @Function("xcb_poly_rectangle_rectangles_length")
  int polyRectangleRectanglesLength(PolyRectangleRequest R);

  @Function("xcb_poly_rectangle_rectangles_iterator")
  RectangleIterator polyRectangleRectanglesIterator(PolyRectangleRequest R);

  @Function("xcb_poly_arc_sizeof")
  int polyArcSizeof(Memory Buffer, UInt32 arcsLen);

  @Function("xcb_poly_arc_checked")
  VoidCookie polyArcChecked(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 arcsLen,
      Arc arcs);

  @Function("xcb_poly_arc")
  VoidCookie polyArc(Connection c, Drawable drawable, Gcontext gc, UInt32 arcsLen, Arc arcs);

  @Function("xcb_poly_arc_arcs")
  Arc polyArcArcs(PolyArcRequest R);

  @Function("xcb_poly_arc_arcs_length")
  int polyArcArcsLength(PolyArcRequest R);

  @Function("xcb_poly_arc_arcs_iterator")
  ArcIterator polyArcArcsIterator(PolyArcRequest R);

  @Function("xcb_fill_poly_sizeof")
  int fillPolySizeof(Memory Buffer, UInt32 pointsLen);

  @Function("xcb_fill_poly_checked")
  VoidCookie fillPolyChecked(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt8 shape,
      UInt8 coordinateMode,
      UInt32 pointsLen,
      Point points);

  @Function("xcb_fill_poly")
  VoidCookie fillPoly(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt8 shape,
      UInt8 coordinateMode,
      UInt32 pointsLen,
      Point points);

  @Function("xcb_fill_poly_points")
  Point fillPolyPoints(FillPolyRequest R);

  @Function("xcb_fill_poly_points_length")
  int fillPolyPointsLength(FillPolyRequest R);

  @Function("xcb_fill_poly_points_iterator")
  PointIterator fillPolyPointsIterator(FillPolyRequest R);

  @Function("xcb_poly_fill_rectangle_sizeof")
  int polyFillRectangleSizeof(Memory Buffer, UInt32 rectanglesLen);

  @Function("xcb_poly_fill_rectangle_checked")
  VoidCookie polyFillRectangleChecked(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 rectanglesLen,
      Rectangle rectangles);

  @Function("xcb_poly_fill_rectangle")
  VoidCookie polyFillRectangle(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 rectanglesLen,
      Rectangle rectangles);

  @Function("xcb_poly_fill_rectangle_rectangles")
  Rectangle polyFillRectangleRectangles(PolyFillRectangleRequest R);

  @Function("xcb_poly_fill_rectangle_rectangles_length")
  int polyFillRectangleRectanglesLength(PolyFillRectangleRequest R);

  @Function("xcb_poly_fill_rectangle_rectangles_iterator")
  RectangleIterator polyFillRectangleRectanglesIterator(PolyFillRectangleRequest R);

  @Function("xcb_poly_fill_arc_sizeof")
  int polyFillArcSizeof(Memory Buffer, UInt32 arcsLen);

  @Function("xcb_poly_fill_arc_checked")
  VoidCookie polyFillArcChecked(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 arcsLen,
      Arc arcs);

  @Function("xcb_poly_fill_arc")
  VoidCookie polyFillArc(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      UInt32 arcsLen,
      Arc arcs);

  @Function("xcb_poly_fill_arc_arcs")
  Arc polyFillArcArcs(PolyFillArcRequest R);

  @Function("xcb_poly_fill_arc_arcs_length")
  int polyFillArcArcsLength(PolyFillArcRequest R);

  @Function("xcb_poly_fill_arc_arcs_iterator")
  ArcIterator polyFillArcArcsIterator(PolyFillArcRequest R);

  @Function("xcb_put_image_sizeof")
  int putImageSizeof(Memory Buffer, UInt32 dataLen);

  @Function("xcb_put_image_checked")
  VoidCookie putImageChecked(
      Connection c,
      UInt8 format,
      Drawable drawable,
      Gcontext gc,
      UInt16 width,
      UInt16 height,
      Int16 dstX,
      Int16 dstY,
      UInt8 leftPad,
      UInt8 depth,
      UInt32 dataLen,
      UInt8 data);

  @Function("xcb_put_image")
  VoidCookie putImage(
      Connection c,
      UInt8 format,
      Drawable drawable,
      Gcontext gc,
      UInt16 width,
      UInt16 height,
      Int16 dstX,
      Int16 dstY,
      UInt8 leftPad,
      UInt8 depth,
      UInt32 dataLen,
      UInt8 data);

  @Function("xcb_put_image_data")
  UInt8 putImageData(PutImageRequest R);

  @Function("xcb_put_image_data_length")
  int putImageDataLength(PutImageRequest R);

  @Function("xcb_put_image_data_end")
  GenericIterator putImageDataEnd(PutImageRequest R);

  @Function("xcb_get_image_sizeof")
  int getImageSizeof(Memory Buffer);

  @Function("xcb_get_image")
  GetImageCookie getImage(
      Connection c,
      UInt8 format,
      Drawable drawable,
      Int16 x,
      Int16 y,
      UInt16 width,
      UInt16 height,
      UInt32 planeMask);

  @Function("xcb_get_image_unchecked")
  GetImageCookie getImageUnchecked(
      Connection c,
      UInt8 format,
      Drawable drawable,
      Int16 x,
      Int16 y,
      UInt16 width,
      UInt16 height,
      UInt32 planeMask);

  @Function("xcb_get_image_data")
  UInt8 getImageData(GetImageReply R);

  @Function("xcb_get_image_data_length")
  int getImageDataLength(GetImageReply R);

  @Function("xcb_get_image_data_end")
  GenericIterator getImageDataEnd(GetImageReply R);

  @Function("xcb_get_image_reply")
  GetImageReply getImageReply(Connection c, GetImageCookie cookie, Pointer e);

  @Function("poly_text_8_sizeof")
  int polyText_8Sizeof(Memory Buffer, UInt32 itemsLen);

  @Function("poly_text_8_checked")
  VoidCookie polyText_8Checked(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      Int16 x,
      Int16 y,
      UInt32 itemsLen,
      UInt8 items);

  @Function("poly_text_8")
  VoidCookie polyText_8(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      Int16 x,
      Int16 y,
      UInt32 itemsLen,
      UInt8 items);

  @Function("poly_text_8_items")
  UInt8 polyText_8Items(PolyText8Request R);

  @Function("poly_text_8_items_length")
  int polyText_8ItemsLength(PolyText8Request R);

  @Function("poly_text_8_items_end")
  GenericIterator polyText_8ItemsEnd(PolyText8Request R);

  @Function("poly_text_16_sizeof")
  int polyText_16Sizeof(Memory Buffer, UInt32 itemsLen);

  @Function("poly_text_16_checked")
  VoidCookie polyText_16Checked(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      Int16 x,
      Int16 y,
      UInt32 itemsLen,
      UInt8 items);

  @Function("poly_text_16")
  VoidCookie polyText_16(
      Connection c,
      Drawable drawable,
      Gcontext gc,
      Int16 x,
      Int16 y,
      UInt32 itemsLen,
      UInt8 items);

  @Function("poly_text_16_items")
  UInt8 polyText_16Items(PolyText16Request R);

  @Function("poly_text_16_items_length")
  int polyText_16ItemsLength(PolyText16Request R);

  @Function("poly_text_16_items_end")
  GenericIterator polyText_16ItemsEnd(PolyText16Request R);

  @Function("image_text_8_sizeof")
  int imageText_8Sizeof(Memory Buffer);

  @Function("image_text_8_checked")
  VoidCookie imageText_8Checked(
      Connection c,
      UInt8 stringLen,
      Drawable drawable,
      Gcontext gc,
      Int16 x,
      Int16 y,
      String string);

  @Function("image_text_8")
  VoidCookie imageText_8(
      Connection c,
      UInt8 stringLen,
      Drawable drawable,
      Gcontext gc,
      Int16 x,
      Int16 y,
      String string);

  @Function("image_text_8_string")
  String imageText_8String(ImageText8Request R);

  @Function("image_text_8_string_length")
  int imageText_8StringLength(ImageText8Request R);

  @Function("image_text_8_string_end")
  GenericIterator imageText_8StringEnd(ImageText8Request R);

  @Function("image_text_16_sizeof")
  int imageText_16Sizeof(Memory Buffer);

  @Function("image_text_16_checked")
  VoidCookie imageText_16Checked(
      Connection c,
      UInt8 stringLen,
      Drawable drawable,
      Gcontext gc,
      Int16 x,
      Int16 y,
      Char2b string);

  @Function("image_text_16")
  VoidCookie imageText_16(
      Connection c,
      UInt8 stringLen,
      Drawable drawable,
      Gcontext gc,
      Int16 x,
      Int16 y,
      Char2b string);

  @Function("image_text_16_string")
  Char2b imageText_16String(ImageText16Request R);

  @Function("image_text_16_string_length")
  int imageText_16StringLength(ImageText16Request R);

  @Function("image_text_16_string_iterator")
  Char2bIterator imageText_16StringIterator(ImageText16Request R);

  @Function("xcb_create_colormap_checked")
  VoidCookie createColormapChecked(
      Connection c,
      UInt8 alloc,
      Colormap mid,
      Window window,
      Visualid visual);

  @Function("xcb_create_colormap")
  VoidCookie createColormap(
      Connection c,
      UInt8 alloc,
      Colormap mid,
      Window window,
      Visualid visual);

  @Function("xcb_free_colormap_checked")
  VoidCookie freeColormapChecked(Connection c, Colormap cmap);

  @Function("xcb_free_colormap")
  VoidCookie freeColormap(Connection c, Colormap cmap);

  @Function("xcb_copy_colormap_and_free_checked")
  VoidCookie copyColormapAndFreeChecked(Connection c, Colormap mid, Colormap srcCmap);

  @Function("xcb_copy_colormap_and_free")
  VoidCookie copyColormapAndFree(Connection c, Colormap mid, Colormap srcCmap);

  @Function("xcb_install_colormap_checked")
  VoidCookie installColormapChecked(Connection c, Colormap cmap);

  @Function("xcb_install_colormap")
  VoidCookie installColormap(Connection c, Colormap cmap);

  @Function("xcb_uninstall_colormap_checked")
  VoidCookie uninstallColormapChecked(Connection c, Colormap cmap);

  @Function("xcb_uninstall_colormap")
  VoidCookie uninstallColormap(Connection c, Colormap cmap);

  @Function("xcb_list_installed_colormaps_sizeof")
  int listInstalledColormapsSizeof(Memory Buffer);

  @Function("xcb_list_installed_colormaps")
  ListInstalledColormapsCookie listInstalledColormaps(Connection c, Window window);

  @Function("xcb_list_installed_colormaps_unchecked")
  ListInstalledColormapsCookie listInstalledColormapsUnchecked(Connection c, Window window);

  @Function("xcb_list_installed_colormaps_cmaps")
  Colormap listInstalledColormapsCmaps(ListInstalledColormapsReply R);

  @Function("xcb_list_installed_colormaps_cmaps_length")
  int listInstalledColormapsCmapsLength(ListInstalledColormapsReply R);

  @Function("xcb_list_installed_colormaps_cmaps_end")
  GenericIterator listInstalledColormapsCmapsEnd(ListInstalledColormapsReply R);

  @Function("xcb_list_installed_colormaps_reply")
  ListInstalledColormapsReply listInstalledColormapsReply(
      Connection c,
      ListInstalledColormapsCookie cookie,
      Pointer e);

  @Function("xcb_alloc_color")
  AllocColorCookie allocColor(
      Connection c,
      Colormap cmap,
      UInt16 red,
      UInt16 green,
      UInt16 blue);

  @Function("xcb_alloc_color_unchecked")
  AllocColorCookie allocColorUnchecked(
      Connection c,
      Colormap cmap,
      UInt16 red,
      UInt16 green,
      UInt16 blue);

  @Function("xcb_alloc_color_reply")
  AllocColorReply allocColorReply(Connection c, AllocColorCookie cookie, Pointer e);

  @Function("xcb_alloc_named_color_sizeof")
  int allocNamedColorSizeof(Memory Buffer);

  @Function("xcb_alloc_named_color")
  AllocNamedColorCookie allocNamedColor(
      Connection c,
      Colormap cmap,
      UInt16 nameLen,
      String name);

  @Function("xcb_alloc_named_color_unchecked")
  AllocNamedColorCookie allocNamedColorUnchecked(
      Connection c,
      Colormap cmap,
      UInt16 nameLen,
      String name);

  @Function("xcb_alloc_named_color_reply")
  AllocNamedColorReply allocNamedColorReply(
      Connection c,
      AllocNamedColorCookie cookie,
      Pointer e);

  @Function("xcb_alloc_color_cells_sizeof")
  int allocColorCellsSizeof(Memory Buffer);

  @Function("xcb_alloc_color_cells")
  AllocColorCellsCookie allocColorCells(
      Connection c,
      UInt8 contiguous,
      Colormap cmap,
      UInt16 colors,
      UInt16 planes);

  @Function("xcb_alloc_color_cells_unchecked")
  AllocColorCellsCookie allocColorCellsUnchecked(
      Connection c,
      UInt8 contiguous,
      Colormap cmap,
      UInt16 colors,
      UInt16 planes);

  @Function("xcb_alloc_color_cells_pixels")
  UInt32 allocColorCellsPixels(AllocColorCellsReply R);

  @Function("xcb_alloc_color_cells_pixels_length")
  int allocColorCellsPixelsLength(AllocColorCellsReply R);

  @Function("xcb_alloc_color_cells_pixels_end")
  GenericIterator allocColorCellsPixelsEnd(AllocColorCellsReply R);

  @Function("xcb_alloc_color_cells_masks")
  UInt32 allocColorCellsMasks(AllocColorCellsReply R);

  @Function("xcb_alloc_color_cells_masks_length")
  int allocColorCellsMasksLength(AllocColorCellsReply R);

  @Function("xcb_alloc_color_cells_masks_end")
  GenericIterator allocColorCellsMasksEnd(AllocColorCellsReply R);

  @Function("xcb_alloc_color_cells_reply")
  AllocColorCellsReply allocColorCellsReply(
      Connection c,
      AllocColorCellsCookie cookie,
      Pointer e);

  @Function("xcb_alloc_color_planes_sizeof")
  int allocColorPlanesSizeof(Memory Buffer);

  @Function("xcb_alloc_color_planes")
  AllocColorPlanesCookie allocColorPlanes(
      Connection c,
      UInt8 contiguous,
      Colormap cmap,
      UInt16 colors,
      UInt16 reds,
      UInt16 greens,
      UInt16 blues);

  @Function("xcb_alloc_color_planes_unchecked")
  AllocColorPlanesCookie allocColorPlanesUnchecked(
      Connection c,
      UInt8 contiguous,
      Colormap cmap,
      UInt16 colors,
      UInt16 reds,
      UInt16 greens,
      UInt16 blues);

  @Function("xcb_alloc_color_planes_pixels")
  UInt32 allocColorPlanesPixels(AllocColorPlanesReply R);

  @Function("xcb_alloc_color_planes_pixels_length")
  int allocColorPlanesPixelsLength(AllocColorPlanesReply R);

  @Function("xcb_alloc_color_planes_pixels_end")
  GenericIterator allocColorPlanesPixelsEnd(AllocColorPlanesReply R);

  @Function("xcb_alloc_color_planes_reply")
  AllocColorPlanesReply allocColorPlanesReply(
      Connection c,
      AllocColorPlanesCookie cookie,
      Pointer e);

  @Function("xcb_free_colors_sizeof")
  int freeColorsSizeof(Memory Buffer, UInt32 pixelsLen);

  @Function("xcb_free_colors_checked")
  VoidCookie freeColorsChecked(
      Connection c,
      Colormap cmap,
      UInt32 planeMask,
      UInt32 pixelsLen,
      UInt32 pixels);

  @Function("xcb_free_colors")
  VoidCookie freeColors(
      Connection c,
      Colormap cmap,
      UInt32 planeMask,
      UInt32 pixelsLen,
      UInt32 pixels);

  @Function("xcb_free_colors_pixels")
  UInt32 freeColorsPixels(FreeColorsRequest R);

  @Function("xcb_free_colors_pixels_length")
  int freeColorsPixelsLength(FreeColorsRequest R);

  @Function("xcb_free_colors_pixels_end")
  GenericIterator freeColorsPixelsEnd(FreeColorsRequest R);

  @Function("xcb_coloritem_next")
  void coloritemNext(ColoritemIterator i);

  @Function("xcb_coloritem_end")
  GenericIterator coloritemEnd(ColoritemIterator i);

  @Function("xcb_store_colors_sizeof")
  int storeColorsSizeof(Memory Buffer, UInt32 itemsLen);

  @Function("xcb_store_colors_checked")
  VoidCookie storeColorsChecked(
      Connection c,
      Colormap cmap,
      UInt32 itemsLen,
      Coloritem items);

  @Function("xcb_store_colors")
  VoidCookie storeColors(Connection c, Colormap cmap, UInt32 itemsLen, Coloritem items);

  @Function("xcb_store_colors_items")
  Coloritem storeColorsItems(StoreColorsRequest R);

  @Function("xcb_store_colors_items_length")
  int storeColorsItemsLength(StoreColorsRequest R);

  @Function("xcb_store_colors_items_iterator")
  ColoritemIterator storeColorsItemsIterator(StoreColorsRequest R);

  @Function("xcb_store_named_color_sizeof")
  int storeNamedColorSizeof(Memory Buffer);

  @Function("xcb_store_named_color_checked")
  VoidCookie storeNamedColorChecked(
      Connection c,
      UInt8 flags,
      Colormap cmap,
      UInt32 pixel,
      UInt16 nameLen,
      String name);

  @Function("xcb_store_named_color")
  VoidCookie storeNamedColor(
      Connection c,
      UInt8 flags,
      Colormap cmap,
      UInt32 pixel,
      UInt16 nameLen,
      String name);

  @Function("xcb_store_named_color_name")
  String storeNamedColorName(StoreNamedColorRequest R);

  @Function("xcb_store_named_color_name_length")
  int storeNamedColorNameLength(StoreNamedColorRequest R);

  @Function("xcb_store_named_color_name_end")
  GenericIterator storeNamedColorNameEnd(StoreNamedColorRequest R);

  @Function("xcb_rgb_next")
  void rgbNext(RgbIterator i);

  @Function("xcb_rgb_end")
  GenericIterator rgbEnd(RgbIterator i);

  @Function("xcb_query_colors_sizeof")
  int queryColorsSizeof(Memory Buffer, UInt32 pixelsLen);

  @Function("xcb_query_colors")
  QueryColorsCookie queryColors(Connection c, Colormap cmap, UInt32 pixelsLen, UInt32 pixels);

  @Function("xcb_query_colors_unchecked")
  QueryColorsCookie queryColorsUnchecked(
      Connection c,
      Colormap cmap,
      UInt32 pixelsLen,
      UInt32 pixels);

  @Function("xcb_query_colors_colors")
  Rgb queryColorsColors(QueryColorsReply R);

  @Function("xcb_query_colors_colors_length")
  int queryColorsColorsLength(QueryColorsReply R);

  @Function("xcb_query_colors_colors_iterator")
  RgbIterator queryColorsColorsIterator(QueryColorsReply R);

  @Function("xcb_query_colors_reply")
  QueryColorsReply queryColorsReply(Connection c, QueryColorsCookie cookie, Pointer e);

  @Function("xcb_lookup_color_sizeof")
  int lookupColorSizeof(Memory Buffer);

  @Function("xcb_lookup_color")
  LookupColorCookie lookupColor(Connection c, Colormap cmap, UInt16 nameLen, String name);

  @Function("xcb_lookup_color_unchecked")
  LookupColorCookie lookupColorUnchecked(
      Connection c,
      Colormap cmap,
      UInt16 nameLen,
      String name);

  @Function("xcb_lookup_color_reply")
  LookupColorReply lookupColorReply(Connection c, LookupColorCookie cookie, Pointer e);

  @Function("xcb_create_cursor_checked")
  VoidCookie createCursorChecked(
      Connection c,
      Cursor cid,
      Pixmap source,
      Pixmap mask,
      UInt16 foreRed,
      UInt16 foreGreen,
      UInt16 foreBlue,
      UInt16 backRed,
      UInt16 backGreen,
      UInt16 backBlue,
      UInt16 x,
      UInt16 y);

  @Function("xcb_create_cursor")
  VoidCookie createCursor(
      Connection c,
      Cursor cid,
      Pixmap source,
      Pixmap mask,
      UInt16 foreRed,
      UInt16 foreGreen,
      UInt16 foreBlue,
      UInt16 backRed,
      UInt16 backGreen,
      UInt16 backBlue,
      UInt16 x,
      UInt16 y);

  @Function("xcb_create_glyph_cursor_checked")
  VoidCookie createGlyphCursorChecked(
      Connection c,
      Cursor cid,
      Font sourceFont,
      Font maskFont,
      UInt16 sourceChar,
      UInt16 maskChar,
      UInt16 foreRed,
      UInt16 foreGreen,
      UInt16 foreBlue,
      UInt16 backRed,
      UInt16 backGreen,
      UInt16 backBlue);

  @Function("xcb_create_glyph_cursor")
  VoidCookie createGlyphCursor(
      Connection c,
      Cursor cid,
      Font sourceFont,
      Font maskFont,
      UInt16 sourceChar,
      UInt16 maskChar,
      UInt16 foreRed,
      UInt16 foreGreen,
      UInt16 foreBlue,
      UInt16 backRed,
      UInt16 backGreen,
      UInt16 backBlue);

  @Function("xcb_free_cursor_checked")
  VoidCookie freeCursorChecked(Connection c, Cursor cursor);

  @Function("xcb_free_cursor")
  VoidCookie freeCursor(Connection c, Cursor cursor);

  @Function("xcb_recolor_cursor_checked")
  VoidCookie recolorCursorChecked(
      Connection c,
      Cursor cursor,
      UInt16 foreRed,
      UInt16 foreGreen,
      UInt16 foreBlue,
      UInt16 backRed,
      UInt16 backGreen,
      UInt16 backBlue);

  @Function("xcb_recolor_cursor")
  VoidCookie recolorCursor(
      Connection c,
      Cursor cursor,
      UInt16 foreRed,
      UInt16 foreGreen,
      UInt16 foreBlue,
      UInt16 backRed,
      UInt16 backGreen,
      UInt16 backBlue);

  @Function("xcb_query_best_size")
  QueryBestSizeCookie queryBestSize(
      Connection c,
      UInt8 Class,
      Drawable drawable,
      UInt16 width,
      UInt16 height);

  @Function("xcb_query_best_size_unchecked")
  QueryBestSizeCookie queryBestSizeUnchecked(
      Connection c,
      UInt8 Class,
      Drawable drawable,
      UInt16 width,
      UInt16 height);

  @Function("xcb_query_best_size_reply")
  QueryBestSizeReply queryBestSizeReply(Connection c, QueryBestSizeCookie cookie, Pointer e);

  @Function("xcb_query_extension_sizeof")
  int queryExtensionSizeof(Memory Buffer);

  @Function("xcb_query_extension")
  QueryExtensionCookie queryExtension(Connection c, UInt16 nameLen, String name);

  @Function("xcb_query_extension_unchecked")
  QueryExtensionCookie queryExtensionUnchecked(Connection c, UInt16 nameLen, String name);

  @Function("xcb_query_extension_reply")
  QueryExtensionReply queryExtensionReply(
      Connection c,
      QueryExtensionCookie cookie,
      Pointer e);

  @Function("xcb_list_extensions_sizeof")
  int listExtensionsSizeof(Memory Buffer);

  @Function("xcb_list_extensions")
  ListExtensionsCookie listExtensions(Connection c);

  @Function("xcb_list_extensions_unchecked")
  ListExtensionsCookie listExtensionsUnchecked(Connection c);

  @Function("xcb_list_extensions_names_length")
  int listExtensionsNamesLength(ListExtensionsReply R);

  @Function("xcb_list_extensions_names_iterator")
  StrIterator listExtensionsNamesIterator(ListExtensionsReply R);

  @Function("xcb_list_extensions_reply")
  ListExtensionsReply listExtensionsReply(
      Connection c,
      ListExtensionsCookie cookie,
      Pointer e);

  @Function("xcb_change_keyboard_mapping_sizeof")
  int changeKeyboardMappingSizeof(Memory Buffer);

  @Function("xcb_change_keyboard_mapping_checked")
  VoidCookie changeKeyboardMappingChecked(
      Connection c,
      UInt8 keycodeCount,
      Keycode firstKeycode,
      UInt8 keysymsPerKeycode,
      Keysym keysyms);

  @Function("xcb_change_keyboard_mapping")
  VoidCookie changeKeyboardMapping(
      Connection c,
      UInt8 keycodeCount,
      Keycode firstKeycode,
      UInt8 keysymsPerKeycode,
      Keysym keysyms);

  @Function("xcb_change_keyboard_mapping_keysyms")
  Keysym changeKeyboardMappingKeysyms(ChangeKeyboardMappingRequest R);

  @Function("xcb_change_keyboard_mapping_keysyms_length")
  int changeKeyboardMappingKeysymsLength(ChangeKeyboardMappingRequest R);

  @Function("xcb_change_keyboard_mapping_keysyms_end")
  GenericIterator changeKeyboardMappingKeysymsEnd(ChangeKeyboardMappingRequest R);

  @Function("xcb_get_keyboard_mapping_sizeof")
  int getKeyboardMappingSizeof(Memory Buffer);

  @Function("xcb_get_keyboard_mapping")
  GetKeyboardMappingCookie getKeyboardMapping(
      Connection c,
      Keycode firstKeycode,
      UInt8 count);

  @Function("xcb_get_keyboard_mapping_unchecked")
  GetKeyboardMappingCookie getKeyboardMappingUnchecked(
      Connection c,
      Keycode firstKeycode,
      UInt8 count);

  @Function("xcb_get_keyboard_mapping_keysyms")
  Keysym getKeyboardMappingKeysyms(GetKeyboardMappingReply R);

  @Function("xcb_get_keyboard_mapping_keysyms_length")
  int getKeyboardMappingKeysymsLength(GetKeyboardMappingReply R);

  @Function("xcb_get_keyboard_mapping_keysyms_end")
  GenericIterator getKeyboardMappingKeysymsEnd(GetKeyboardMappingReply R);

  @Function("xcb_get_keyboard_mapping_reply")
  GetKeyboardMappingReply getKeyboardMappingReply(
      Connection c,
      GetKeyboardMappingCookie cookie,
      Pointer e);

  @Function("xcb_change_keyboard_control_value_list_serialize")
  int changeKeyboardControlValueListSerialize(
      Pointer Buffer,
      UInt32 valueMask,
      ChangeKeyboardControlValueList Aux);

  @Function("xcb_change_keyboard_control_value_list_unpack")
  int changeKeyboardControlValueListUnpack(
      Pointer Buffer,
      UInt32 valueMask,
      ChangeKeyboardControlValueList Aux);

  @Function("xcb_change_keyboard_control_value_list_sizeof")
  int changeKeyboardControlValueListSizeof(Memory Buffer, UInt32 valueMask);

  @Function("xcb_change_keyboard_control_sizeof")
  int changeKeyboardControlSizeof(Memory Buffer);

  @Function("xcb_change_keyboard_control_checked")
  VoidCookie changeKeyboardControlChecked(
      Connection c,
      UInt32 valueMask,
      Pointer valueList);

  @Function("xcb_change_keyboard_control")
  VoidCookie changeKeyboardControl(Connection c, UInt32 valueMask, Pointer valueList);

  @Function("xcb_change_keyboard_control_aux_checked")
  VoidCookie changeKeyboardControlAuxChecked(
      Connection c,
      UInt32 valueMask,
      ChangeKeyboardControlValueList valueList);

  @Function("xcb_change_keyboard_control_aux")
  VoidCookie changeKeyboardControlAux(
      Connection c,
      UInt32 valueMask,
      ChangeKeyboardControlValueList valueList);

  @Function("xcb_change_keyboard_control_value_list")
  Pointer changeKeyboardControlValueList(ChangeKeyboardControlRequest R);

  @Function("xcb_get_keyboard_control")
  GetKeyboardControlCookie getKeyboardControl(Connection c);

  @Function("xcb_get_keyboard_control_unchecked")
  GetKeyboardControlCookie getKeyboardControlUnchecked(Connection c);

  @Function("xcb_get_keyboard_control_reply")
  GetKeyboardControlReply getKeyboardControlReply(
      Connection c,
      GetKeyboardControlCookie cookie,
      Pointer e);

  @Function("xcb_bell_checked")
  VoidCookie bellChecked(Connection c, Int8 percent);

  @Function("xcb_bell")
  VoidCookie bell(Connection c, Int8 percent);

  @Function("xcb_change_pointer_control_checked")
  VoidCookie changePointerControlChecked(
      Connection c,
      Int16 accelerationNumerator,
      Int16 accelerationDenominator,
      Int16 threshold,
      UInt8 doAcceleration,
      UInt8 doThreshold);

  @Function("xcb_change_pointer_control")
  VoidCookie changePointerControl(
      Connection c,
      Int16 accelerationNumerator,
      Int16 accelerationDenominator,
      Int16 threshold,
      UInt8 doAcceleration,
      UInt8 doThreshold);

  @Function("xcb_get_pointer_control")
  GetPointerControlCookie getPointerControl(Connection c);

  @Function("xcb_get_pointer_control_unchecked")
  GetPointerControlCookie getPointerControlUnchecked(Connection c);

  @Function("xcb_get_pointer_control_reply")
  GetPointerControlReply getPointerControlReply(
      Connection c,
      GetPointerControlCookie cookie,
      Pointer e);

  @Function("xcb_set_screen_saver_checked")
  VoidCookie setScreenSaverChecked(
      Connection c,
      Int16 timeout,
      Int16 interval,
      UInt8 preferBlanking,
      UInt8 allowExposures);

  @Function("xcb_set_screen_saver")
  VoidCookie setScreenSaver(
      Connection c,
      Int16 timeout,
      Int16 interval,
      UInt8 preferBlanking,
      UInt8 allowExposures);

  @Function("xcb_get_screen_saver")
  GetScreenSaverCookie getScreenSaver(Connection c);

  @Function("xcb_get_screen_saver_unchecked")
  GetScreenSaverCookie getScreenSaverUnchecked(Connection c);

  @Function("xcb_get_screen_saver_reply")
  GetScreenSaverReply getScreenSaverReply(
      Connection c,
      GetScreenSaverCookie cookie,
      Pointer e);

  @Function("xcb_change_hosts_sizeof")
  int changeHostsSizeof(Memory Buffer);

  @Function("xcb_change_hosts_checked")
  VoidCookie changeHostsChecked(
      Connection c,
      UInt8 mode,
      UInt8 family,
      UInt16 addressLen,
      UInt8 address);

  @Function("xcb_change_hosts")
  VoidCookie changeHosts(
      Connection c,
      UInt8 mode,
      UInt8 family,
      UInt16 addressLen,
      UInt8 address);

  @Function("xcb_change_hosts_address")
  UInt8 changeHostsAddress(ChangeHostsRequest R);

  @Function("xcb_change_hosts_address_length")
  int changeHostsAddressLength(ChangeHostsRequest R);

  @Function("xcb_change_hosts_address_end")
  GenericIterator changeHostsAddressEnd(ChangeHostsRequest R);

  @Function("xcb_host_sizeof")
  int hostSizeof(Memory Buffer);

  @Function("xcb_host_address")
  UInt8 hostAddress(Host R);

  @Function("xcb_host_address_length")
  int hostAddressLength(Host R);

  @Function("xcb_host_address_end")
  GenericIterator hostAddressEnd(Host R);

  @Function("xcb_host_next")
  void hostNext(HostIterator i);

  @Function("xcb_host_end")
  GenericIterator hostEnd(HostIterator i);

  @Function("xcb_list_hosts_sizeof")
  int listHostsSizeof(Memory Buffer);

  @Function("xcb_list_hosts")
  ListHostsCookie listHosts(Connection c);

  @Function("xcb_list_hosts_unchecked")
  ListHostsCookie listHostsUnchecked(Connection c);

  @Function("xcb_list_hosts_hosts_length")
  int listHostsHostsLength(ListHostsReply R);

  @Function("xcb_list_hosts_hosts_iterator")
  HostIterator listHostsHostsIterator(ListHostsReply R);

  @Function("xcb_list_hosts_reply")
  ListHostsReply listHostsReply(Connection c, ListHostsCookie cookie, Pointer e);

  @Function("xcb_set_access_control_checked")
  VoidCookie setAccessControlChecked(Connection c, UInt8 mode);

  @Function("xcb_set_access_control")
  VoidCookie setAccessControl(Connection c, UInt8 mode);

  @Function("xcb_set_close_down_mode_checked")
  VoidCookie setCloseDownModeChecked(Connection c, UInt8 mode);

  @Function("xcb_set_close_down_mode")
  VoidCookie setCloseDownMode(Connection c, UInt8 mode);

  @Function("xcb_kill_client_checked")
  VoidCookie killClientChecked(Connection c, UInt32 resource);

  @Function("xcb_kill_client")
  VoidCookie killClient(Connection c, UInt32 resource);

  @Function("xcb_rotate_properties_sizeof")
  int rotatePropertiesSizeof(Memory Buffer);

  @Function("xcb_rotate_properties_checked")
  VoidCookie rotatePropertiesChecked(
      Connection c,
      Window window,
      UInt16 atomsLen,
      Int16 delta,
      Atom atoms);

  @Function("xcb_rotate_properties")
  VoidCookie rotateProperties(
      Connection c,
      Window window,
      UInt16 atomsLen,
      Int16 delta,
      Atom atoms);

  @Function("xcb_rotate_properties_atoms")
  Atom rotatePropertiesAtoms(RotatePropertiesRequest R);

  @Function("xcb_rotate_properties_atoms_length")
  int rotatePropertiesAtomsLength(RotatePropertiesRequest R);

  @Function("xcb_rotate_properties_atoms_end")
  GenericIterator rotatePropertiesAtomsEnd(RotatePropertiesRequest R);

  @Function("xcb_force_screen_saver_checked")
  VoidCookie forceScreenSaverChecked(Connection c, UInt8 mode);

  @Function("xcb_force_screen_saver")
  VoidCookie forceScreenSaver(Connection c, UInt8 mode);

  @Function("xcb_set_pointer_mapping_sizeof")
  int setPointerMappingSizeof(Memory Buffer);

  @Function("xcb_set_pointer_mapping")
  SetPointerMappingCookie setPointerMapping(Connection c, UInt8 mapLen, UInt8 map);

  @Function("xcb_set_pointer_mapping_unchecked")
  SetPointerMappingCookie setPointerMappingUnchecked(Connection c, UInt8 mapLen, UInt8 map);

  @Function("xcb_set_pointer_mapping_reply")
  SetPointerMappingReply setPointerMappingReply(
      Connection c,
      SetPointerMappingCookie cookie,
      Pointer e);

  @Function("xcb_get_pointer_mapping_sizeof")
  int getPointerMappingSizeof(Memory Buffer);

  @Function("xcb_get_pointer_mapping")
  GetPointerMappingCookie getPointerMapping(Connection c);

  @Function("xcb_get_pointer_mapping_unchecked")
  GetPointerMappingCookie getPointerMappingUnchecked(Connection c);

  @Function("xcb_get_pointer_mapping_map")
  UInt8 getPointerMappingMap(GetPointerMappingReply R);

  @Function("xcb_get_pointer_mapping_map_length")
  int getPointerMappingMapLength(GetPointerMappingReply R);

  @Function("xcb_get_pointer_mapping_map_end")
  GenericIterator getPointerMappingMapEnd(GetPointerMappingReply R);

  @Function("xcb_get_pointer_mapping_reply")
  GetPointerMappingReply getPointerMappingReply(
      Connection c,
      GetPointerMappingCookie cookie,
      Pointer e);

  @Function("xcb_set_modifier_mapping_sizeof")
  int setModifierMappingSizeof(Memory Buffer);

  @Function("xcb_set_modifier_mapping")
  SetModifierMappingCookie setModifierMapping(
      Connection c,
      UInt8 keycodesPerModifier,
      Keycode keycodes);

  @Function("xcb_set_modifier_mapping_unchecked")
  SetModifierMappingCookie setModifierMappingUnchecked(
      Connection c,
      UInt8 keycodesPerModifier,
      Keycode keycodes);

  @Function("xcb_set_modifier_mapping_reply")
  SetModifierMappingReply setModifierMappingReply(
      Connection c,
      SetModifierMappingCookie cookie,
      Pointer e);

  @Function("xcb_get_modifier_mapping_sizeof")
  int getModifierMappingSizeof(Memory Buffer);

  @Function("xcb_get_modifier_mapping")
  GetModifierMappingCookie getModifierMapping(Connection c);

  @Function("xcb_get_modifier_mapping_unchecked")
  GetModifierMappingCookie getModifierMappingUnchecked(Connection c);

  @Function("xcb_get_modifier_mapping_keycodes")
  Keycode getModifierMappingKeycodes(GetModifierMappingReply R);

  @Function("xcb_get_modifier_mapping_keycodes_length")
  int getModifierMappingKeycodesLength(GetModifierMappingReply R);

  @Function("xcb_get_modifier_mapping_keycodes_end")
  GenericIterator getModifierMappingKeycodesEnd(GetModifierMappingReply R);

  @Function("xcb_get_modifier_mapping_reply")
  GetModifierMappingReply getModifierMappingReply(
      Connection c,
      GetModifierMappingCookie cookie,
      Pointer e);

  @Function("xcb_no_operation_checked")
  VoidCookie noOperationChecked(Connection c);

  @Function("xcb_no_operation")
  VoidCookie noOperation(Connection c);

  @Retention(RetentionPolicy.RUNTIME)
  @interface Function {
    String value();
  }
  class Mapper implements FunctionMapper {
    @Override
    public String getFunctionName(NativeLibrary library, Method method) {
      if (!method.isAnnotationPresent(Function.class)) { return null; }
      Function attr = method.getDeclaredAnnotation(Function.class);
      return attr == null ? null : attr.value();
    }
  }
}