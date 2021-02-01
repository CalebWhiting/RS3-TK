package org.freedesktop.xcb.internal;

import lombok.experimental.UtilityClass;
import org.freedesktop.xcb.XcbError;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/* @formatter:off */
@UtilityClass
public class X {

	static {
		try {
			String libName = "libXcbBindings";
			Path temp;
			try (InputStream res = X.class.getResourceAsStream(String.format("/%s.so", libName))) {
				temp = Files.createTempFile(libName, ".so");
				try (OutputStream o = Files.newOutputStream(temp)) {
					res.transferTo(o);
				}
			}
			String libPath = temp.toAbsolutePath().toString();
			System.out.println("Loading library: " + libPath);
			System.load(libPath);
			Runtime.getRuntime().addShutdownHook(new Thread(() -> {
				try {
					Files.deleteIfExists(temp);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}));
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

    public static void checkError(String func, long[] err) {
        if (err[0] == 0) return;
        throw new XcbError(func);
    }

	public static native long connect(String displayName, int[] screen);
	public static native void disconnect(long connection);
    public static native long get_setup(long connection);
	public static native long query_tree(long connection, int xid);
	public static native long query_tree_reply(long p, long cookie, long[] err);
	public static native long get_window_attributes(long connection, int xid);
	public static native long get_window_attributes_reply(long connection, long cookie, long[] err);
	public static native long get_geometry(long connection, int xid);
	public static native long get_geometry_reply(long connection, long cookie, long[] err);
	public static native long get_property(long connection, boolean delete, int xid, long property, long type, long offset, int length);
	public static native long get_property_reply(long connection, long cookie, long[] err);
	public static native int get_property_value_length(long reply);
	public static native long get_property_value(long reply);
	public static native String chars_to_string(long pointer, int length);
	public static native long image_get(long connection, int xid, short x, short y, int w, int h, int planeMask, int format);
	public static native long image_get_pixel(long image, long x, long y);
	public static native void image_destroy(long image);
	public static native int query_tree_children_length(long reply);
	public static native void query_tree_children(long reply, int[] result, long len);
	public static native long setup_roots_iterator(long setup);
    public static native void screen_next(long iterator);

    public static class GenericError {
        public static native short error_code(long p);
        public static native short response_type(long p);
    }

	public static class GeometryReply {
		public static native short response_type(long p);
		public static native short depth(long p);
		public static native int root(long p);
		public static native short x(long p);
		public static native short y(long p);
		public static native int width(long p);
		public static native int height(long p);
		public static native short border_width(long p);
	}

	public static class Image {
		public static native int width(long p);
		public static native int height(long p);
		public static native int format(long p);
		public static native short scanline_pad(long p);
		public static native short depth(long p);
		public static native short bpp(long p);
		public static native short unit(long p);
		public static native int plane_mask(long p);
		public static native int byte_order(long p);
		public static native int bit_order(long p);
		public static native long stride(long p);
		public static native long size(long p);
		public static native long data(long p);
	}

	public static class QueryTreeReply {
		public static native int parent(long p);
		public static native int root(long p);
	}

	public static class Screen {
		public static native int root(long p);
		public static native long default_colormap(long p);
		public static native long white_pixel(long p);
		public static native long black_pixel(long p);
		public static native long current_input_masks(long p);
		public static native int width_in_pixels(long p);
		public static native int height_in_pixels(long p);
		public static native int width_in_millimeters(long p);
		public static native int height_in_millimeters(long p);
		public static native int min_installed_maps(long p);
		public static native int max_installed_maps(long p);
		public static native long root_visual(long p);
		public static native short backing_stores(long p);
		public static native short save_unders(long p);
		public static native short root_depth(long p);
		public static native short allowed_depths_len(long p);
	}

	public static class Setup {
		public static native long status(long p);
		public static native long protocol_major_version(long p);
		public static native long protocol_minor_version(long p);
		public static native long length(long p);
		public static native long release_number(long p);
		public static native long resource_id_base(long p);
		public static native long resource_id_mask(long p);
		public static native long motion_buffer_size(long p);
		public static native long vendor_len(long p);
		public static native long maximum_request_length(long p);
		public static native long roots_len(long p);
		public static native long pixmap_formats_len(long p);
		public static native long image_byte_order(long p);
		public static native long bitmap_format_bit_order(long p);
		public static native long bitmap_format_scanline_unit(long p);
		public static native long bitmap_format_scanline_pad(long p);
		public static native long min_keycode(long p);
		public static native long max_keycode(long p);
	}

	public static class ScreenIterator {
		public static native int rem(long p);
		public static native long data(long p);
	}

	public static class WindowAttributesReply {
		public static native short response_type(long p);
		public static native short backing_store(long p);
		public static native long length(long p);
		public static native long visual(long p);
		public static native int _class(long p);
		public static native short bit_gravity(long p);
		public static native short win_gravity(long p);
		public static native long backing_planes(long p);
		public static native long backing_pixel(long p);
		public static native short save_under(long p);
		public static native short map_is_installed(long p);
		public static native short map_state(long p);
		public static native short override_redirect(long p);
		public static native long colormap(long p);
		public static native long all_event_masks(long p);
		public static native long your_event_mask(long p);
		public static native int do_not_propagate_mask(long p);
	}

	public static class ImageFormat {
        public static native int XCB_IMAGE_FORMAT_XY_BITMAP();
        public static native int XCB_IMAGE_FORMAT_XY_PIXMAP();
        public static native int XCB_IMAGE_FORMAT_Z_PIXMAP();
    }

	public static class Atom {
		public static native int XCB_ATOM_NONE();
		public static native int XCB_ATOM_ANY();
		public static native int XCB_ATOM_PRIMARY();
		public static native int XCB_ATOM_SECONDARY();
		public static native int XCB_ATOM_ARC();
		public static native int XCB_ATOM_ATOM();
		public static native int XCB_ATOM_BITMAP();
		public static native int XCB_ATOM_CARDINAL();
		public static native int XCB_ATOM_COLORMAP();
		public static native int XCB_ATOM_CURSOR();
		public static native int XCB_ATOM_CUT_BUFFER0();
		public static native int XCB_ATOM_CUT_BUFFER1();
		public static native int XCB_ATOM_CUT_BUFFER2();
		public static native int XCB_ATOM_CUT_BUFFER3();
		public static native int XCB_ATOM_CUT_BUFFER4();
		public static native int XCB_ATOM_CUT_BUFFER5();
		public static native int XCB_ATOM_CUT_BUFFER6();
		public static native int XCB_ATOM_CUT_BUFFER7();
		public static native int XCB_ATOM_DRAWABLE();
		public static native int XCB_ATOM_FONT();
		public static native int XCB_ATOM_INTEGER();
		public static native int XCB_ATOM_PIXMAP();
		public static native int XCB_ATOM_POINT();
		public static native int XCB_ATOM_RECTANGLE();
		public static native int XCB_ATOM_RESOURCE_MANAGER();
		public static native int XCB_ATOM_RGB_COLOR_MAP();
		public static native int XCB_ATOM_RGB_BEST_MAP();
		public static native int XCB_ATOM_RGB_BLUE_MAP();
		public static native int XCB_ATOM_RGB_DEFAULT_MAP();
		public static native int XCB_ATOM_RGB_GRAY_MAP();
		public static native int XCB_ATOM_RGB_GREEN_MAP();
		public static native int XCB_ATOM_RGB_RED_MAP();
		public static native int XCB_ATOM_STRING();
		public static native int XCB_ATOM_VISUALID();
		public static native int XCB_ATOM_WINDOW();
		public static native int XCB_ATOM_WM_COMMAND();
		public static native int XCB_ATOM_WM_HINTS();
		public static native int XCB_ATOM_WM_CLIENT_MACHINE();
		public static native int XCB_ATOM_WM_ICON_NAME();
		public static native int XCB_ATOM_WM_ICON_SIZE();
		public static native int XCB_ATOM_WM_NAME();
		public static native int XCB_ATOM_WM_NORMAL_HINTS();
		public static native int XCB_ATOM_WM_SIZE_HINTS();
		public static native int XCB_ATOM_WM_ZOOM_HINTS();
		public static native int XCB_ATOM_MIN_SPACE();
		public static native int XCB_ATOM_NORM_SPACE();
		public static native int XCB_ATOM_MAX_SPACE();
		public static native int XCB_ATOM_END_SPACE();
		public static native int XCB_ATOM_SUPERSCRIPT_X();
		public static native int XCB_ATOM_SUPERSCRIPT_Y();
		public static native int XCB_ATOM_SUBSCRIPT_X();
		public static native int XCB_ATOM_SUBSCRIPT_Y();
		public static native int XCB_ATOM_UNDERLINE_POSITION();
		public static native int XCB_ATOM_UNDERLINE_THICKNESS();
		public static native int XCB_ATOM_STRIKEOUT_ASCENT();
		public static native int XCB_ATOM_STRIKEOUT_DESCENT();
		public static native int XCB_ATOM_ITALIC_ANGLE();
		public static native int XCB_ATOM_X_HEIGHT();
		public static native int XCB_ATOM_QUAD_WIDTH();
		public static native int XCB_ATOM_WEIGHT();
		public static native int XCB_ATOM_POINT_SIZE();
		public static native int XCB_ATOM_RESOLUTION();
		public static native int XCB_ATOM_COPYRIGHT();
		public static native int XCB_ATOM_NOTICE();
		public static native int XCB_ATOM_FONT_NAME();
		public static native int XCB_ATOM_FAMILY_NAME();
		public static native int XCB_ATOM_FULL_NAME();
		public static native int XCB_ATOM_CAP_HEIGHT();
		public static native int XCB_ATOM_WM_CLASS();
		public static native int XCB_ATOM_WM_TRANSIENT_FOR();
	}

}
