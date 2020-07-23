package uk.calebwhiting.rs3tk.impl.x11;

import static uk.calebwhiting.rs3tk.impl.x11.CTypes.*;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@SuppressWarnings("unused")
public interface XcbTypes {
    @FieldOrder({ "byte1", "byte2" })
    class Char2b extends Structure {
        public UInt8 byte1;
        public UInt8 byte2;
        public static class ByReference extends Char2b
            implements Structure.ByReference { }
        public static class ByValue extends Char2b
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class Char2bIterator extends Structure {
        public Char2b data;
        public int rem;
        public int index;
        public static class ByReference extends Char2bIterator
            implements Structure.ByReference { }
        public static class ByValue extends Char2bIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class WindowIterator extends Structure {
        public Window data;
        public int rem;
        public int index;
        public static class ByReference extends WindowIterator
            implements Structure.ByReference { }
        public static class ByValue extends WindowIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class PixmapIterator extends Structure {
        public Pixmap data;
        public int rem;
        public int index;
        public static class ByReference extends PixmapIterator
            implements Structure.ByReference { }
        public static class ByValue extends PixmapIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class CursorIterator extends Structure {
        public Cursor data;
        public int rem;
        public int index;
        public static class ByReference extends CursorIterator
            implements Structure.ByReference { }
        public static class ByValue extends CursorIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class FontIterator extends Structure {
        public Font data;
        public int rem;
        public int index;
        public static class ByReference extends FontIterator
            implements Structure.ByReference { }
        public static class ByValue extends FontIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class GcontextIterator extends Structure {
        public Gcontext data;
        public int rem;
        public int index;
        public static class ByReference extends GcontextIterator
            implements Structure.ByReference { }
        public static class ByValue extends GcontextIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class ColormapIterator extends Structure {
        public Colormap data;
        public int rem;
        public int index;
        public static class ByReference extends ColormapIterator
            implements Structure.ByReference { }
        public static class ByValue extends ColormapIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class AtomIterator extends Structure {
        public Atom data;
        public int rem;
        public int index;
        public static class ByReference extends AtomIterator
            implements Structure.ByReference { }
        public static class ByValue extends AtomIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class DrawableIterator extends Structure {
        public Drawable data;
        public int rem;
        public int index;
        public static class ByReference extends DrawableIterator
            implements Structure.ByReference { }
        public static class ByValue extends DrawableIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class FontableIterator extends Structure {
        public Fontable data;
        public int rem;
        public int index;
        public static class ByReference extends FontableIterator
            implements Structure.ByReference { }
        public static class ByValue extends FontableIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class Bool32Iterator extends Structure {
        public Bool32 data;
        public int rem;
        public int index;
        public static class ByReference extends Bool32Iterator
            implements Structure.ByReference { }
        public static class ByValue extends Bool32Iterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class VisualidIterator extends Structure {
        public Visualid data;
        public int rem;
        public int index;
        public static class ByReference extends VisualidIterator
            implements Structure.ByReference { }
        public static class ByValue extends VisualidIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class TimestampIterator extends Structure {
        public Timestamp data;
        public int rem;
        public int index;
        public static class ByReference extends TimestampIterator
            implements Structure.ByReference { }
        public static class ByValue extends TimestampIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class KeysymIterator extends Structure {
        public Keysym data;
        public int rem;
        public int index;
        public static class ByReference extends KeysymIterator
            implements Structure.ByReference { }
        public static class ByValue extends KeysymIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class KeycodeIterator extends Structure {
        public Keycode data;
        public int rem;
        public int index;
        public static class ByReference extends KeycodeIterator
            implements Structure.ByReference { }
        public static class ByValue extends KeycodeIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class Keycode32Iterator extends Structure {
        public Keycode32 data;
        public int rem;
        public int index;
        public static class ByReference extends Keycode32Iterator
            implements Structure.ByReference { }
        public static class ByValue extends Keycode32Iterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class ButtonIterator extends Structure {
        public Button data;
        public int rem;
        public int index;
        public static class ByReference extends ButtonIterator
            implements Structure.ByReference { }
        public static class ByValue extends ButtonIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "x", "y" })
    class Point extends Structure {
        public Int16 x;
        public Int16 y;
        public static class ByReference extends Point
            implements Structure.ByReference { }
        public static class ByValue extends Point
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class PointIterator extends Structure {
        public Point data;
        public int rem;
        public int index;
        public static class ByReference extends PointIterator
            implements Structure.ByReference { }
        public static class ByValue extends PointIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "x", "y", "width", "height" })
    class Rectangle extends Structure {
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public static class ByReference extends Rectangle
            implements Structure.ByReference { }
        public static class ByValue extends Rectangle
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class RectangleIterator extends Structure {
        public Rectangle data;
        public int rem;
        public int index;
        public static class ByReference extends RectangleIterator
            implements Structure.ByReference { }
        public static class ByValue extends RectangleIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "x", "y", "width", "height", "angle1", "angle2" })
    class Arc extends Structure {
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public Int16 angle1;
        public Int16 angle2;
        public static class ByReference extends Arc
            implements Structure.ByReference { }
        public static class ByValue extends Arc
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class ArcIterator extends Structure {
        public Arc data;
        public int rem;
        public int index;
        public static class ByReference extends ArcIterator
            implements Structure.ByReference { }
        public static class ByValue extends ArcIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "depth", "bits_per_pixel", "scanline_pad", "pad0" })
    class Format extends Structure {
        public UInt8 depth;
        public UInt8 bits_per_pixel;
        public UInt8 scanline_pad;
        public UInt8[] pad0 = new UInt8[5];

        public static class ByReference extends Format
            implements Structure.ByReference { }
        public static class ByValue extends Format
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class FormatIterator extends Structure {
        public Format data;
        public int rem;
        public int index;
        public static class ByReference extends FormatIterator
            implements Structure.ByReference { }
        public static class ByValue extends FormatIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "visual_id", "_class", "bits_per_rgb_value", "colormap_entries", "red_mask", "green_mask",
        "blue_mask", "pad0"
    })
    class Visualtype extends Structure {
        public Visualid visual_id;
        public UInt8 _class;
        public UInt8 bits_per_rgb_value;
        public UInt16 colormap_entries;
        public UInt32 red_mask;
        public UInt32 green_mask;
        public UInt32 blue_mask;
        public UInt8[] pad0 = new UInt8[4];

        public static class ByReference extends Visualtype
            implements Structure.ByReference { }
        public static class ByValue extends Visualtype
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class VisualtypeIterator extends Structure {
        public Visualtype data;
        public int rem;
        public int index;
        public static class ByReference extends VisualtypeIterator
            implements Structure.ByReference { }
        public static class ByValue extends VisualtypeIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "depth", "pad0", "visuals_len", "pad1" })
    class Depth extends Structure {
        public UInt8 depth;
        public UInt8 pad0;
        public UInt16 visuals_len;
        public UInt8[] pad1 = new UInt8[4];

        public static class ByReference extends Depth
            implements Structure.ByReference { }
        public static class ByValue extends Depth
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class DepthIterator extends Structure {
        public Depth data;
        public int rem;
        public int index;
        public static class ByReference extends DepthIterator
            implements Structure.ByReference { }
        public static class ByValue extends DepthIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "root", "default_colormap", "white_pixel", "black_pixel", "current_input_masks",
        "width_in_pixels", "height_in_pixels", "width_in_millimeters", "height_in_millimeters",
        "min_installed_maps", "max_installed_maps", "root_visual", "backing_stores", "save_unders",
        "root_depth", "allowed_depths_len"
    })
    class Screen extends Structure {
        public Window root;
        public Colormap default_colormap;
        public UInt32 white_pixel;
        public UInt32 black_pixel;
        public UInt32 current_input_masks;
        public UInt16 width_in_pixels;
        public UInt16 height_in_pixels;
        public UInt16 width_in_millimeters;
        public UInt16 height_in_millimeters;
        public UInt16 min_installed_maps;
        public UInt16 max_installed_maps;
        public Visualid root_visual;
        public UInt8 backing_stores;
        public UInt8 save_unders;
        public UInt8 root_depth;
        public UInt8 allowed_depths_len;
        public static class ByReference extends Screen
            implements Structure.ByReference { }
        public static class ByValue extends Screen
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class ScreenIterator extends Structure {
        public Screen data;
        public int rem;
        public int index;
        public static class ByReference extends ScreenIterator
            implements Structure.ByReference { }
        public static class ByValue extends ScreenIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "byte_order", "pad0", "protocol_major_version", "protocol_minor_version",
        "authorization_protocol_name_len", "authorization_protocol_data_len", "pad1"
    })
    class SetupRequest extends Structure {
        public UInt8 byte_order;
        public UInt8 pad0;
        public UInt16 protocol_major_version;
        public UInt16 protocol_minor_version;
        public UInt16 authorization_protocol_name_len;
        public UInt16 authorization_protocol_data_len;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends SetupRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetupRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class SetupRequestIterator extends Structure {
        public SetupRequest data;
        public int rem;
        public int index;
        public static class ByReference extends SetupRequestIterator
            implements Structure.ByReference { }
        public static class ByValue extends SetupRequestIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "status", "reason_len", "protocol_major_version", "protocol_minor_version", "length"
    })
    class SetupFailed extends Structure {
        public UInt8 status;
        public UInt8 reason_len;
        public UInt16 protocol_major_version;
        public UInt16 protocol_minor_version;
        public UInt16 length;
        public static class ByReference extends SetupFailed
            implements Structure.ByReference { }
        public static class ByValue extends SetupFailed
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class SetupFailedIterator extends Structure {
        public SetupFailed data;
        public int rem;
        public int index;
        public static class ByReference extends SetupFailedIterator
            implements Structure.ByReference { }
        public static class ByValue extends SetupFailedIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "status", "length", "pad0" })
    class SetupAuthenticate extends Structure {
        public UInt8 status;
        public UInt16 length;
        public UInt8[] pad0 = new UInt8[5];

        public static class ByReference extends SetupAuthenticate
            implements Structure.ByReference { }
        public static class ByValue extends SetupAuthenticate
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class SetupAuthenticateIterator extends Structure {
        public SetupAuthenticate data;
        public int rem;
        public int index;
        public static class ByReference extends SetupAuthenticateIterator
            implements Structure.ByReference { }
        public static class ByValue extends SetupAuthenticateIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "status", "pad0", "protocol_major_version", "protocol_minor_version", "length",
        "release_number", "resource_id_base", "resource_id_mask", "motion_buffer_size",
        "vendor_len", "maximum_request_length", "roots_len", "pixmap_formats_len",
        "image_byte_order", "bitmap_format_bit_order", "bitmap_format_scanline_unit",
        "bitmap_format_scanline_pad", "min_keycode", "max_keycode", "pad1"
    })
    class Setup extends Structure {
        public UInt8 status;
        public UInt8 pad0;
        public UInt16 protocol_major_version;
        public UInt16 protocol_minor_version;
        public UInt16 length;
        public UInt32 release_number;
        public UInt32 resource_id_base;
        public UInt32 resource_id_mask;
        public UInt32 motion_buffer_size;
        public UInt16 vendor_len;
        public UInt16 maximum_request_length;
        public UInt8 roots_len;
        public UInt8 pixmap_formats_len;
        public UInt8 image_byte_order;
        public UInt8 bitmap_format_bit_order;
        public UInt8 bitmap_format_scanline_unit;
        public UInt8 bitmap_format_scanline_pad;
        public Keycode min_keycode;
        public Keycode max_keycode;
        public UInt8[] pad1 = new UInt8[4];

        public static class ByReference extends Setup
            implements Structure.ByReference { }
        public static class ByValue extends Setup
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class SetupIterator extends Structure {
        public Setup data;
        public int rem;
        public int index;
        public static class ByReference extends SetupIterator
            implements Structure.ByReference { }
        public static class ByValue extends SetupIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "detail", "sequence", "time", "root", "event", "child", "root_x", "root_y",
        "event_x", "event_y", "state", "same_screen", "pad0"
    })
    class KeyPressEvent extends Structure {
        public UInt8 response_type;
        public Keycode detail;
        public UInt16 sequence;
        public Timestamp time;
        public Window root;
        public Window event;
        public Window child;
        public Int16 root_x;
        public Int16 root_y;
        public Int16 event_x;
        public Int16 event_y;
        public UInt16 state;
        public UInt8 same_screen;
        public UInt8 pad0;
        public static class ByReference extends KeyPressEvent
            implements Structure.ByReference { }
        public static class ByValue extends KeyPressEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "detail", "sequence", "time", "root", "event", "child", "root_x", "root_y",
        "event_x", "event_y", "state", "same_screen", "pad0"
    })
    class ButtonPressEvent extends Structure {
        public UInt8 response_type;
        public Button detail;
        public UInt16 sequence;
        public Timestamp time;
        public Window root;
        public Window event;
        public Window child;
        public Int16 root_x;
        public Int16 root_y;
        public Int16 event_x;
        public Int16 event_y;
        public UInt16 state;
        public UInt8 same_screen;
        public UInt8 pad0;
        public static class ByReference extends ButtonPressEvent
            implements Structure.ByReference { }
        public static class ByValue extends ButtonPressEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "detail", "sequence", "time", "root", "event", "child", "root_x", "root_y",
        "event_x", "event_y", "state", "same_screen", "pad0"
    })
    class MotionNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 detail;
        public UInt16 sequence;
        public Timestamp time;
        public Window root;
        public Window event;
        public Window child;
        public Int16 root_x;
        public Int16 root_y;
        public Int16 event_x;
        public Int16 event_y;
        public UInt16 state;
        public UInt8 same_screen;
        public UInt8 pad0;
        public static class ByReference extends MotionNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends MotionNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "detail", "sequence", "time", "root", "event", "child", "root_x", "root_y",
        "event_x", "event_y", "state", "mode", "same_screen_focus"
    })
    class EnterNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 detail;
        public UInt16 sequence;
        public Timestamp time;
        public Window root;
        public Window event;
        public Window child;
        public Int16 root_x;
        public Int16 root_y;
        public Int16 event_x;
        public Int16 event_y;
        public UInt16 state;
        public UInt8 mode;
        public UInt8 same_screen_focus;
        public static class ByReference extends EnterNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends EnterNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "detail", "sequence", "event", "mode", "pad0" })
    class FocusInEvent extends Structure {
        public UInt8 response_type;
        public UInt8 detail;
        public UInt16 sequence;
        public Window event;
        public UInt8 mode;
        public UInt8[] pad0 = new UInt8[3];

        public static class ByReference extends FocusInEvent
            implements Structure.ByReference { }
        public static class ByValue extends FocusInEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "keys" })
    class KeymapNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8[] keys = new UInt8[31];

        public static class ByReference extends KeymapNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends KeymapNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "window", "x", "y", "width", "height", "count", "pad1"
    })
    class ExposeEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window window;
        public UInt16 x;
        public UInt16 y;
        public UInt16 width;
        public UInt16 height;
        public UInt16 count;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends ExposeEvent
            implements Structure.ByReference { }
        public static class ByValue extends ExposeEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "drawable", "x", "y", "width", "height",
        "minor_opcode", "count", "major_opcode", "pad1"
    })
    class GraphicsExposureEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Drawable drawable;
        public UInt16 x;
        public UInt16 y;
        public UInt16 width;
        public UInt16 height;
        public UInt16 minor_opcode;
        public UInt16 count;
        public UInt8 major_opcode;
        public UInt8[] pad1 = new UInt8[3];

        public static class ByReference extends GraphicsExposureEvent
            implements Structure.ByReference { }
        public static class ByValue extends GraphicsExposureEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "drawable", "minor_opcode", "major_opcode", "pad1"
    })
    class NoExposureEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Drawable drawable;
        public UInt16 minor_opcode;
        public UInt8 major_opcode;
        public UInt8 pad1;
        public static class ByReference extends NoExposureEvent
            implements Structure.ByReference { }
        public static class ByValue extends NoExposureEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "window", "state", "pad1" })
    class VisibilityNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window window;
        public UInt8 state;
        public UInt8[] pad1 = new UInt8[3];

        public static class ByReference extends VisibilityNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends VisibilityNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "parent", "window", "x", "y", "width", "height",
        "border_width", "override_redirect", "pad1"
    })
    class CreateNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window parent;
        public Window window;
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public UInt16 border_width;
        public UInt8 override_redirect;
        public UInt8 pad1;
        public static class ByReference extends CreateNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends CreateNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "event", "window" })
    class DestroyNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window event;
        public Window window;
        public static class ByReference extends DestroyNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends DestroyNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "event", "window", "from_configure", "pad1"
    })
    class UnmapNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window event;
        public Window window;
        public UInt8 from_configure;
        public UInt8[] pad1 = new UInt8[3];

        public static class ByReference extends UnmapNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends UnmapNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "event", "window", "override_redirect", "pad1"
    })
    class MapNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window event;
        public Window window;
        public UInt8 override_redirect;
        public UInt8[] pad1 = new UInt8[3];

        public static class ByReference extends MapNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends MapNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "parent", "window" })
    class MapRequestEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window parent;
        public Window window;
        public static class ByReference extends MapRequestEvent
            implements Structure.ByReference { }
        public static class ByValue extends MapRequestEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "event", "window", "parent", "x", "y",
        "override_redirect", "pad1"
    })
    class ReparentNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window event;
        public Window window;
        public Window parent;
        public Int16 x;
        public Int16 y;
        public UInt8 override_redirect;
        public UInt8[] pad1 = new UInt8[3];

        public static class ByReference extends ReparentNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends ReparentNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "event", "window", "above_sibling", "x", "y", "width",
        "height", "border_width", "override_redirect", "pad1"
    })
    class ConfigureNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window event;
        public Window window;
        public Window above_sibling;
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public UInt16 border_width;
        public UInt8 override_redirect;
        public UInt8 pad1;
        public static class ByReference extends ConfigureNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends ConfigureNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "stack_mode", "sequence", "parent", "window", "sibling", "x", "y", "width",
        "height", "border_width", "value_mask"
    })
    class ConfigureRequestEvent extends Structure {
        public UInt8 response_type;
        public UInt8 stack_mode;
        public UInt16 sequence;
        public Window parent;
        public Window window;
        public Window sibling;
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public UInt16 border_width;
        public UInt16 value_mask;
        public static class ByReference extends ConfigureRequestEvent
            implements Structure.ByReference { }
        public static class ByValue extends ConfigureRequestEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "event", "window", "x", "y" })
    class GravityNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window event;
        public Window window;
        public Int16 x;
        public Int16 y;
        public static class ByReference extends GravityNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends GravityNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "window", "width", "height" })
    class ResizeRequestEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window window;
        public UInt16 width;
        public UInt16 height;
        public static class ByReference extends ResizeRequestEvent
            implements Structure.ByReference { }
        public static class ByValue extends ResizeRequestEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "event", "window", "place", "pad1", "pad2" })
    class CirculateNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window event;
        public Window window;
        public UInt8 place;
        public UInt8[] pad1 = new UInt8[4];

        public UInt8[] pad2 = new UInt8[3];

        public static class ByReference extends CirculateNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends CirculateNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "window", "atom", "time", "state", "pad1" })
    class PropertyNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window window;
        public Atom atom;
        public Timestamp time;
        public UInt8 state;
        public UInt8[] pad1 = new UInt8[3];

        public static class ByReference extends PropertyNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends PropertyNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "time", "owner", "selection" })
    class SelectionClearEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Timestamp time;
        public Window owner;
        public Atom selection;
        public static class ByReference extends SelectionClearEvent
            implements Structure.ByReference { }
        public static class ByValue extends SelectionClearEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "time", "owner", "requestor", "selection", "target",
        "property"
    })
    class SelectionRequestEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Timestamp time;
        public Window owner;
        public Window requestor;
        public Atom selection;
        public Atom target;
        public Atom property;
        public static class ByReference extends SelectionRequestEvent
            implements Structure.ByReference { }
        public static class ByValue extends SelectionRequestEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "time", "requestor", "selection", "target", "property"
    })
    class SelectionNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Timestamp time;
        public Window requestor;
        public Atom selection;
        public Atom target;
        public Atom property;
        public static class ByReference extends SelectionNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends SelectionNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "window", "colormap", "_new", "state", "pad1"
    })
    class ColormapNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public Window window;
        public Colormap colormap;
        public UInt8 _new;
        public UInt8 state;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends ColormapNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends ColormapNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data8", "data16", "data32" })
    class ClientMessageData extends Structure {
        public UInt8[] data8 = new UInt8[20];

        public UInt16[] data16 = new UInt16[10];

        public UInt32[] data32 = new UInt32[5];

        public static class ByReference extends ClientMessageData
            implements Structure.ByReference { }
        public static class ByValue extends ClientMessageData
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class ClientMessageDataIterator extends Structure {
        public ClientMessageData data;
        public int rem;
        public int index;
        public static class ByReference extends ClientMessageDataIterator
            implements Structure.ByReference { }
        public static class ByValue extends ClientMessageDataIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "format", "sequence", "window", "type", "data" })
    class ClientMessageEvent extends Structure {
        public UInt8 response_type;
        public UInt8 format;
        public UInt16 sequence;
        public Window window;
        public Atom type;
        public ClientMessageData data;
        public static class ByReference extends ClientMessageEvent
            implements Structure.ByReference { }
        public static class ByValue extends ClientMessageEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "request", "first_keycode", "count", "pad1"
    })
    class MappingNotifyEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt8 request;
        public Keycode first_keycode;
        public UInt8 count;
        public UInt8 pad1;
        public static class ByReference extends MappingNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends MappingNotifyEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "extension", "sequence", "length", "event_type", "full_sequence", "pad0"
    })
    class GeGenericEvent extends Structure {
        public UInt8 response_type;
        public UInt8 extension;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 event_type;
        public UInt32 full_sequence;
        public UInt8[] pad0 = new UInt8[22];

        public static class ByReference extends GeGenericEvent
            implements Structure.ByReference { }
        public static class ByValue extends GeGenericEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "error_code", "sequence", "bad_value", "minor_opcode", "major_opcode",
        "pad0"
    })
    class RequestError extends Structure {
        public UInt8 response_type;
        public UInt8 error_code;
        public UInt16 sequence;
        public UInt32 bad_value;
        public UInt16 minor_opcode;
        public UInt8 major_opcode;
        public UInt8 pad0;
        public static class ByReference extends RequestError
            implements Structure.ByReference { }
        public static class ByValue extends RequestError
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "error_code", "sequence", "bad_value", "minor_opcode", "major_opcode",
        "pad0"
    })
    class ValueError extends Structure {
        public UInt8 response_type;
        public UInt8 error_code;
        public UInt16 sequence;
        public UInt32 bad_value;
        public UInt16 minor_opcode;
        public UInt8 major_opcode;
        public UInt8 pad0;
        public static class ByReference extends ValueError
            implements Structure.ByReference { }
        public static class ByValue extends ValueError
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "background_pixmap", "background_pixel", "border_pixmap", "border_pixel", "bit_gravity",
        "win_gravity", "backing_store", "backing_planes", "backing_pixel", "override_redirect",
        "save_under", "event_mask", "do_not_propogate_mask", "colormap", "cursor"
    })
    class CreateWindowValueList extends Structure {
        public Pixmap background_pixmap;
        public UInt32 background_pixel;
        public Pixmap border_pixmap;
        public UInt32 border_pixel;
        public UInt32 bit_gravity;
        public UInt32 win_gravity;
        public UInt32 backing_store;
        public UInt32 backing_planes;
        public UInt32 backing_pixel;
        public Bool32 override_redirect;
        public Bool32 save_under;
        public UInt32 event_mask;
        public UInt32 do_not_propogate_mask;
        public Colormap colormap;
        public Cursor cursor;
        public static class ByReference extends CreateWindowValueList
            implements Structure.ByReference { }
        public static class ByValue extends CreateWindowValueList
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "depth", "length", "wid", "parent", "x", "y", "width", "height",
        "border_width", "_class", "visual", "value_mask"
    })
    class CreateWindowRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 depth;
        public UInt16 length;
        public Window wid;
        public Window parent;
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public UInt16 border_width;
        public UInt16 _class;
        public Visualid visual;
        public UInt32 value_mask;
        public static class ByReference extends CreateWindowRequest
            implements Structure.ByReference { }
        public static class ByValue extends CreateWindowRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "background_pixmap", "background_pixel", "border_pixmap", "border_pixel", "bit_gravity",
        "win_gravity", "backing_store", "backing_planes", "backing_pixel", "override_redirect",
        "save_under", "event_mask", "do_not_propogate_mask", "colormap", "cursor"
    })
    class ChangeWindowAttributesValueList extends Structure {
        public Pixmap background_pixmap;
        public UInt32 background_pixel;
        public Pixmap border_pixmap;
        public UInt32 border_pixel;
        public UInt32 bit_gravity;
        public UInt32 win_gravity;
        public UInt32 backing_store;
        public UInt32 backing_planes;
        public UInt32 backing_pixel;
        public Bool32 override_redirect;
        public Bool32 save_under;
        public UInt32 event_mask;
        public UInt32 do_not_propogate_mask;
        public Colormap colormap;
        public Cursor cursor;
        public static class ByReference extends ChangeWindowAttributesValueList
            implements Structure.ByReference { }
        public static class ByValue extends ChangeWindowAttributesValueList
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window", "value_mask" })
    class ChangeWindowAttributesRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public UInt32 value_mask;
        public static class ByReference extends ChangeWindowAttributesRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangeWindowAttributesRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetWindowAttributesCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetWindowAttributesCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetWindowAttributesCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class GetWindowAttributesRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends GetWindowAttributesRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetWindowAttributesRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "backing_store", "sequence", "length", "visual", "_class", "bit_gravity",
        "win_gravity", "backing_planes", "backing_pixel", "save_under", "map_is_installed",
        "map_state", "override_redirect", "colormap", "all_event_masks", "your_event_mask",
        "do_not_propagate_mask", "pad0"
    })
    class GetWindowAttributesReply extends Structure {
        public UInt8 response_type;
        public UInt8 backing_store;
        public UInt16 sequence;
        public UInt32 length;
        public Visualid visual;
        public UInt16 _class;
        public UInt8 bit_gravity;
        public UInt8 win_gravity;
        public UInt32 backing_planes;
        public UInt32 backing_pixel;
        public UInt8 save_under;
        public UInt8 map_is_installed;
        public UInt8 map_state;
        public UInt8 override_redirect;
        public Colormap colormap;
        public UInt32 all_event_masks;
        public UInt32 your_event_mask;
        public UInt16 do_not_propagate_mask;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends GetWindowAttributesReply
            implements Structure.ByReference { }
        public static class ByValue extends GetWindowAttributesReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class DestroyWindowRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends DestroyWindowRequest
            implements Structure.ByReference { }
        public static class ByValue extends DestroyWindowRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class DestroySubwindowsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends DestroySubwindowsRequest
            implements Structure.ByReference { }
        public static class ByValue extends DestroySubwindowsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "mode", "length", "window" })
    class ChangeSaveSetRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 mode;
        public UInt16 length;
        public Window window;
        public static class ByReference extends ChangeSaveSetRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangeSaveSetRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window", "parent", "x", "y" })
    class ReparentWindowRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public Window parent;
        public Int16 x;
        public Int16 y;
        public static class ByReference extends ReparentWindowRequest
            implements Structure.ByReference { }
        public static class ByValue extends ReparentWindowRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class MapWindowRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends MapWindowRequest
            implements Structure.ByReference { }
        public static class ByValue extends MapWindowRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class MapSubwindowsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends MapSubwindowsRequest
            implements Structure.ByReference { }
        public static class ByValue extends MapSubwindowsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class UnmapWindowRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends UnmapWindowRequest
            implements Structure.ByReference { }
        public static class ByValue extends UnmapWindowRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class UnmapSubwindowsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends UnmapSubwindowsRequest
            implements Structure.ByReference { }
        public static class ByValue extends UnmapSubwindowsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "x", "y", "width", "height", "border_width", "sibling", "stack_mode" })
    class ConfigureWindowValueList extends Structure {
        public Int32 x;
        public Int32 y;
        public UInt32 width;
        public UInt32 height;
        public UInt32 border_width;
        public Window sibling;
        public UInt32 stack_mode;
        public static class ByReference extends ConfigureWindowValueList
            implements Structure.ByReference { }
        public static class ByValue extends ConfigureWindowValueList
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window", "value_mask", "pad1" })
    class ConfigureWindowRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public UInt16 value_mask;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends ConfigureWindowRequest
            implements Structure.ByReference { }
        public static class ByValue extends ConfigureWindowRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "direction", "length", "window" })
    class CirculateWindowRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 direction;
        public UInt16 length;
        public Window window;
        public static class ByReference extends CirculateWindowRequest
            implements Structure.ByReference { }
        public static class ByValue extends CirculateWindowRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetGeometryCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetGeometryCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetGeometryCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "drawable" })
    class GetGeometryRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public static class ByReference extends GetGeometryRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetGeometryRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "depth", "sequence", "length", "root", "x", "y", "width", "height",
        "border_width", "pad0"
    })
    class GetGeometryReply extends Structure {
        public UInt8 response_type;
        public UInt8 depth;
        public UInt16 sequence;
        public UInt32 length;
        public Window root;
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public UInt16 border_width;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends GetGeometryReply
            implements Structure.ByReference { }
        public static class ByValue extends GetGeometryReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class QueryTreeCookie extends Structure {
        public int sequence;
        public static class ByReference extends QueryTreeCookie
            implements Structure.ByReference { }
        public static class ByValue extends QueryTreeCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class QueryTreeRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends QueryTreeRequest
            implements Structure.ByReference { }
        public static class ByValue extends QueryTreeRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "root", "parent", "children_len", "pad1"
    })
    class QueryTreeReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public Window root;
        public Window parent;
        public UInt16 children_len;
        public UInt8[] pad1 = new UInt8[14];

        public static class ByReference extends QueryTreeReply
            implements Structure.ByReference { }
        public static class ByValue extends QueryTreeReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class InternAtomCookie extends Structure {
        public int sequence;
        public static class ByReference extends InternAtomCookie
            implements Structure.ByReference { }
        public static class ByValue extends InternAtomCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "only_if_exists", "length", "name_len", "pad0" })
    class InternAtomRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 only_if_exists;
        public UInt16 length;
        public UInt16 name_len;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends InternAtomRequest
            implements Structure.ByReference { }
        public static class ByValue extends InternAtomRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "atom" })
    class InternAtomReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public Atom atom;
        public static class ByReference extends InternAtomReply
            implements Structure.ByReference { }
        public static class ByValue extends InternAtomReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetAtomNameCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetAtomNameCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetAtomNameCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "atom" })
    class GetAtomNameRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Atom atom;
        public static class ByReference extends GetAtomNameRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetAtomNameRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "name_len", "pad1" })
    class GetAtomNameReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 name_len;
        public UInt8[] pad1 = new UInt8[22];

        public static class ByReference extends GetAtomNameReply
            implements Structure.ByReference { }
        public static class ByValue extends GetAtomNameReply
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "mode", "length", "window", "property", "type", "format", "data_len", "pad0"
    })
    class ChangePropertyRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 mode;
        public UInt16 length;
        public Window window;
        public Atom property;
        public Atom type;
        public UInt8 format;
        public UInt32 data_len;
        public UInt8[] pad0 = new UInt8[3];

        public static class ByReference extends ChangePropertyRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangePropertyRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window", "property" })
    class DeletePropertyRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public Atom property;
        public static class ByReference extends DeletePropertyRequest
            implements Structure.ByReference { }
        public static class ByValue extends DeletePropertyRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetPropertyCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetPropertyCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetPropertyCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "_delete", "length", "window", "property", "type", "long_offset",
        "long_length"
    })
    class GetPropertyRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 _delete;
        public UInt16 length;
        public Window window;
        public Atom property;
        public Atom type;
        public UInt32 long_offset;
        public UInt32 long_length;
        public static class ByReference extends GetPropertyRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetPropertyRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "format", "sequence", "length", "type", "bytes_after", "value_len", "pad0"
    })
    class GetPropertyReply extends Structure {
        public UInt8 response_type;
        public UInt8 format;
        public UInt16 sequence;
        public UInt32 length;
        public Atom type;
        public UInt32 bytes_after;
        public UInt32 value_len;
        public UInt8[] pad0 = new UInt8[12];

        public static class ByReference extends GetPropertyReply
            implements Structure.ByReference { }
        public static class ByValue extends GetPropertyReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class ListPropertiesCookie extends Structure {
        public int sequence;
        public static class ByReference extends ListPropertiesCookie
            implements Structure.ByReference { }
        public static class ByValue extends ListPropertiesCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class ListPropertiesRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends ListPropertiesRequest
            implements Structure.ByReference { }
        public static class ByValue extends ListPropertiesRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "atoms_len", "pad1" })
    class ListPropertiesReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 atoms_len;
        public UInt8[] pad1 = new UInt8[22];

        public static class ByReference extends ListPropertiesReply
            implements Structure.ByReference { }
        public static class ByValue extends ListPropertiesReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "owner", "selection", "time" })
    class SetSelectionOwnerRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window owner;
        public Atom selection;
        public Timestamp time;
        public static class ByReference extends SetSelectionOwnerRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetSelectionOwnerRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetSelectionOwnerCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetSelectionOwnerCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetSelectionOwnerCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "selection" })
    class GetSelectionOwnerRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Atom selection;
        public static class ByReference extends GetSelectionOwnerRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetSelectionOwnerRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "owner" })
    class GetSelectionOwnerReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public Window owner;
        public static class ByReference extends GetSelectionOwnerReply
            implements Structure.ByReference { }
        public static class ByValue extends GetSelectionOwnerReply
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "requestor", "selection", "target", "property", "time"
    })
    class ConvertSelectionRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window requestor;
        public Atom selection;
        public Atom target;
        public Atom property;
        public Timestamp time;
        public static class ByReference extends ConvertSelectionRequest
            implements Structure.ByReference { }
        public static class ByValue extends ConvertSelectionRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "propagate", "length", "destination", "event_mask", "event" })
    class SendEventRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 propagate;
        public UInt16 length;
        public Window destination;
        public UInt32 event_mask;
        public char[] event = new char[32];

        public static class ByReference extends SendEventRequest
            implements Structure.ByReference { }
        public static class ByValue extends SendEventRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GrabPointerCookie extends Structure {
        public int sequence;
        public static class ByReference extends GrabPointerCookie
            implements Structure.ByReference { }
        public static class ByValue extends GrabPointerCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "owner_events", "length", "grab_window", "event_mask", "pointer_mode",
        "keyboard_mode", "confine_to", "cursor", "time"
    })
    class GrabPointerRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 owner_events;
        public UInt16 length;
        public Window grab_window;
        public UInt16 event_mask;
        public UInt8 pointer_mode;
        public UInt8 keyboard_mode;
        public Window confine_to;
        public Cursor cursor;
        public Timestamp time;
        public static class ByReference extends GrabPointerRequest
            implements Structure.ByReference { }
        public static class ByValue extends GrabPointerRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "status", "sequence", "length" })
    class GrabPointerReply extends Structure {
        public UInt8 response_type;
        public UInt8 status;
        public UInt16 sequence;
        public UInt32 length;
        public static class ByReference extends GrabPointerReply
            implements Structure.ByReference { }
        public static class ByValue extends GrabPointerReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "time" })
    class UngrabPointerRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Timestamp time;
        public static class ByReference extends UngrabPointerRequest
            implements Structure.ByReference { }
        public static class ByValue extends UngrabPointerRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "owner_events", "length", "grab_window", "event_mask", "pointer_mode",
        "keyboard_mode", "confine_to", "cursor", "button", "pad0", "modifiers"
    })
    class GrabButtonRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 owner_events;
        public UInt16 length;
        public Window grab_window;
        public UInt16 event_mask;
        public UInt8 pointer_mode;
        public UInt8 keyboard_mode;
        public Window confine_to;
        public Cursor cursor;
        public UInt8 button;
        public UInt8 pad0;
        public UInt16 modifiers;
        public static class ByReference extends GrabButtonRequest
            implements Structure.ByReference { }
        public static class ByValue extends GrabButtonRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "button", "length", "grab_window", "modifiers", "pad0" })
    class UngrabButtonRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 button;
        public UInt16 length;
        public Window grab_window;
        public UInt16 modifiers;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends UngrabButtonRequest
            implements Structure.ByReference { }
        public static class ByValue extends UngrabButtonRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cursor", "time", "event_mask", "pad1" })
    class ChangeActivePointerGrabRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Cursor cursor;
        public Timestamp time;
        public UInt16 event_mask;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends ChangeActivePointerGrabRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangeActivePointerGrabRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GrabKeyboardCookie extends Structure {
        public int sequence;
        public static class ByReference extends GrabKeyboardCookie
            implements Structure.ByReference { }
        public static class ByValue extends GrabKeyboardCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "owner_events", "length", "grab_window", "time", "pointer_mode",
        "keyboard_mode", "pad0"
    })
    class GrabKeyboardRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 owner_events;
        public UInt16 length;
        public Window grab_window;
        public Timestamp time;
        public UInt8 pointer_mode;
        public UInt8 keyboard_mode;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends GrabKeyboardRequest
            implements Structure.ByReference { }
        public static class ByValue extends GrabKeyboardRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "status", "sequence", "length" })
    class GrabKeyboardReply extends Structure {
        public UInt8 response_type;
        public UInt8 status;
        public UInt16 sequence;
        public UInt32 length;
        public static class ByReference extends GrabKeyboardReply
            implements Structure.ByReference { }
        public static class ByValue extends GrabKeyboardReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "time" })
    class UngrabKeyboardRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Timestamp time;
        public static class ByReference extends UngrabKeyboardRequest
            implements Structure.ByReference { }
        public static class ByValue extends UngrabKeyboardRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "owner_events", "length", "grab_window", "modifiers", "key", "pointer_mode",
        "keyboard_mode", "pad0"
    })
    class GrabKeyRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 owner_events;
        public UInt16 length;
        public Window grab_window;
        public UInt16 modifiers;
        public Keycode key;
        public UInt8 pointer_mode;
        public UInt8 keyboard_mode;
        public UInt8[] pad0 = new UInt8[3];

        public static class ByReference extends GrabKeyRequest
            implements Structure.ByReference { }
        public static class ByValue extends GrabKeyRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "key", "length", "grab_window", "modifiers", "pad0" })
    class UngrabKeyRequest extends Structure {
        public UInt8 major_opcode;
        public Keycode key;
        public UInt16 length;
        public Window grab_window;
        public UInt16 modifiers;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends UngrabKeyRequest
            implements Structure.ByReference { }
        public static class ByValue extends UngrabKeyRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "mode", "length", "time" })
    class AllowEventsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 mode;
        public UInt16 length;
        public Timestamp time;
        public static class ByReference extends AllowEventsRequest
            implements Structure.ByReference { }
        public static class ByValue extends AllowEventsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class GrabServerRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends GrabServerRequest
            implements Structure.ByReference { }
        public static class ByValue extends GrabServerRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class UngrabServerRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends UngrabServerRequest
            implements Structure.ByReference { }
        public static class ByValue extends UngrabServerRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class QueryPointerCookie extends Structure {
        public int sequence;
        public static class ByReference extends QueryPointerCookie
            implements Structure.ByReference { }
        public static class ByValue extends QueryPointerCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class QueryPointerRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends QueryPointerRequest
            implements Structure.ByReference { }
        public static class ByValue extends QueryPointerRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "same_screen", "sequence", "length", "root", "child", "root_x", "root_y",
        "win_x", "win_y", "mask", "pad0"
    })
    class QueryPointerReply extends Structure {
        public UInt8 response_type;
        public UInt8 same_screen;
        public UInt16 sequence;
        public UInt32 length;
        public Window root;
        public Window child;
        public Int16 root_x;
        public Int16 root_y;
        public Int16 win_x;
        public Int16 win_y;
        public UInt16 mask;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends QueryPointerReply
            implements Structure.ByReference { }
        public static class ByValue extends QueryPointerReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "time", "x", "y" })
    class Timecoord extends Structure {
        public Timestamp time;
        public Int16 x;
        public Int16 y;
        public static class ByReference extends Timecoord
            implements Structure.ByReference { }
        public static class ByValue extends Timecoord
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class TimecoordIterator extends Structure {
        public Timecoord data;
        public int rem;
        public int index;
        public static class ByReference extends TimecoordIterator
            implements Structure.ByReference { }
        public static class ByValue extends TimecoordIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetMotionEventsCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetMotionEventsCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetMotionEventsCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window", "start", "stop" })
    class GetMotionEventsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public Timestamp start;
        public Timestamp stop;
        public static class ByReference extends GetMotionEventsRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetMotionEventsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "events_len", "pad1" })
    class GetMotionEventsReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt32 events_len;
        public UInt8[] pad1 = new UInt8[20];

        public static class ByReference extends GetMotionEventsReply
            implements Structure.ByReference { }
        public static class ByValue extends GetMotionEventsReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class TranslateCoordinatesCookie extends Structure {
        public int sequence;
        public static class ByReference extends TranslateCoordinatesCookie
            implements Structure.ByReference { }
        public static class ByValue extends TranslateCoordinatesCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "src_window", "dst_window", "src_x", "src_y" })
    class TranslateCoordinatesRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window src_window;
        public Window dst_window;
        public Int16 src_x;
        public Int16 src_y;
        public static class ByReference extends TranslateCoordinatesRequest
            implements Structure.ByReference { }
        public static class ByValue extends TranslateCoordinatesRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "same_screen", "sequence", "length", "child", "dst_x", "dst_y" })
    class TranslateCoordinatesReply extends Structure {
        public UInt8 response_type;
        public UInt8 same_screen;
        public UInt16 sequence;
        public UInt32 length;
        public Window child;
        public Int16 dst_x;
        public Int16 dst_y;
        public static class ByReference extends TranslateCoordinatesReply
            implements Structure.ByReference { }
        public static class ByValue extends TranslateCoordinatesReply
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "src_window", "dst_window", "src_x", "src_y", "src_width",
        "src_height", "dst_x", "dst_y"
    })
    class WarpPointerRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window src_window;
        public Window dst_window;
        public Int16 src_x;
        public Int16 src_y;
        public UInt16 src_width;
        public UInt16 src_height;
        public Int16 dst_x;
        public Int16 dst_y;
        public static class ByReference extends WarpPointerRequest
            implements Structure.ByReference { }
        public static class ByValue extends WarpPointerRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "revert_to", "length", "focus", "time" })
    class SetInputFocusRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 revert_to;
        public UInt16 length;
        public Window focus;
        public Timestamp time;
        public static class ByReference extends SetInputFocusRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetInputFocusRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetInputFocusCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetInputFocusCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetInputFocusCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class GetInputFocusRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends GetInputFocusRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetInputFocusRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "revert_to", "sequence", "length", "focus" })
    class GetInputFocusReply extends Structure {
        public UInt8 response_type;
        public UInt8 revert_to;
        public UInt16 sequence;
        public UInt32 length;
        public Window focus;
        public static class ByReference extends GetInputFocusReply
            implements Structure.ByReference { }
        public static class ByValue extends GetInputFocusReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class QueryKeymapCookie extends Structure {
        public int sequence;
        public static class ByReference extends QueryKeymapCookie
            implements Structure.ByReference { }
        public static class ByValue extends QueryKeymapCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class QueryKeymapRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends QueryKeymapRequest
            implements Structure.ByReference { }
        public static class ByValue extends QueryKeymapRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "keys" })
    class QueryKeymapReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt8[] keys = new UInt8[32];

        public static class ByReference extends QueryKeymapReply
            implements Structure.ByReference { }
        public static class ByValue extends QueryKeymapReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "fid", "name_len", "pad1" })
    class OpenFontRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Font fid;
        public UInt16 name_len;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends OpenFontRequest
            implements Structure.ByReference { }
        public static class ByValue extends OpenFontRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "font" })
    class CloseFontRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Font font;
        public static class ByReference extends CloseFontRequest
            implements Structure.ByReference { }
        public static class ByValue extends CloseFontRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "name", "value" })
    class Fontprop extends Structure {
        public Atom name;
        public UInt32 value;
        public static class ByReference extends Fontprop
            implements Structure.ByReference { }
        public static class ByValue extends Fontprop
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class FontpropIterator extends Structure {
        public Fontprop data;
        public int rem;
        public int index;
        public static class ByReference extends FontpropIterator
            implements Structure.ByReference { }
        public static class ByValue extends FontpropIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "left_side_bearing", "right_side_bearing", "character_width", "ascent", "descent",
        "attributes"
    })
    class Charinfo extends Structure {
        public Int16 left_side_bearing;
        public Int16 right_side_bearing;
        public Int16 character_width;
        public Int16 ascent;
        public Int16 descent;
        public UInt16 attributes;
        public static class ByReference extends Charinfo
            implements Structure.ByReference { }
        public static class ByValue extends Charinfo
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class CharinfoIterator extends Structure {
        public Charinfo data;
        public int rem;
        public int index;
        public static class ByReference extends CharinfoIterator
            implements Structure.ByReference { }
        public static class ByValue extends CharinfoIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class QueryFontCookie extends Structure {
        public int sequence;
        public static class ByReference extends QueryFontCookie
            implements Structure.ByReference { }
        public static class ByValue extends QueryFontCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "font" })
    class QueryFontRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Fontable font;
        public static class ByReference extends QueryFontRequest
            implements Structure.ByReference { }
        public static class ByValue extends QueryFontRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "min_bounds", "max_bounds",
        "min_char_or_byte2", "max_char_or_byte2", "default_char", "properties_len",
        "draw_direction", "min_byte1", "max_byte1", "all_chars_exist", "font_ascent",
        "font_descent", "char_infos_len", "pad1", "pad2"
    })
    class QueryFontReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public Charinfo min_bounds;
        public Charinfo max_bounds;
        public UInt16 min_char_or_byte2;
        public UInt16 max_char_or_byte2;
        public UInt16 default_char;
        public UInt16 properties_len;
        public UInt8 draw_direction;
        public UInt8 min_byte1;
        public UInt8 max_byte1;
        public UInt8 all_chars_exist;
        public Int16 font_ascent;
        public Int16 font_descent;
        public UInt32 char_infos_len;
        public UInt8[] pad1 = new UInt8[4];

        public UInt8[] pad2 = new UInt8[4];

        public static class ByReference extends QueryFontReply
            implements Structure.ByReference { }
        public static class ByValue extends QueryFontReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class QueryTextExtentsCookie extends Structure {
        public int sequence;
        public static class ByReference extends QueryTextExtentsCookie
            implements Structure.ByReference { }
        public static class ByValue extends QueryTextExtentsCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "odd_length", "length", "font" })
    class QueryTextExtentsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 odd_length;
        public UInt16 length;
        public Fontable font;
        public static class ByReference extends QueryTextExtentsRequest
            implements Structure.ByReference { }
        public static class ByValue extends QueryTextExtentsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "draw_direction", "sequence", "length", "font_ascent", "font_descent",
        "overall_ascent", "overall_descent", "overall_width", "overall_left", "overall_right"
    })
    class QueryTextExtentsReply extends Structure {
        public UInt8 response_type;
        public UInt8 draw_direction;
        public UInt16 sequence;
        public UInt32 length;
        public Int16 font_ascent;
        public Int16 font_descent;
        public Int16 overall_ascent;
        public Int16 overall_descent;
        public Int32 overall_width;
        public Int32 overall_left;
        public Int32 overall_right;
        public static class ByReference extends QueryTextExtentsReply
            implements Structure.ByReference { }
        public static class ByValue extends QueryTextExtentsReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "name_len" })
    class Str extends Structure {
        public UInt8 name_len;
        public static class ByReference extends Str
            implements Structure.ByReference { }
        public static class ByValue extends Str
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class StrIterator extends Structure {
        public Str data;
        public int rem;
        public int index;
        public static class ByReference extends StrIterator
            implements Structure.ByReference { }
        public static class ByValue extends StrIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class ListFontsCookie extends Structure {
        public int sequence;
        public static class ByReference extends ListFontsCookie
            implements Structure.ByReference { }
        public static class ByValue extends ListFontsCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "max_names", "pattern_len" })
    class ListFontsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public UInt16 max_names;
        public UInt16 pattern_len;
        public static class ByReference extends ListFontsRequest
            implements Structure.ByReference { }
        public static class ByValue extends ListFontsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "names_len", "pad1" })
    class ListFontsReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 names_len;
        public UInt8[] pad1 = new UInt8[22];

        public static class ByReference extends ListFontsReply
            implements Structure.ByReference { }
        public static class ByValue extends ListFontsReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class ListFontsWithInfoCookie extends Structure {
        public int sequence;
        public static class ByReference extends ListFontsWithInfoCookie
            implements Structure.ByReference { }
        public static class ByValue extends ListFontsWithInfoCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "max_names", "pattern_len" })
    class ListFontsWithInfoRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public UInt16 max_names;
        public UInt16 pattern_len;
        public static class ByReference extends ListFontsWithInfoRequest
            implements Structure.ByReference { }
        public static class ByValue extends ListFontsWithInfoRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "name_len", "sequence", "length", "min_bounds", "max_bounds",
        "min_char_or_byte2", "max_char_or_byte2", "default_char", "properties_len",
        "draw_direction", "min_byte1", "max_byte1", "all_chars_exist", "font_ascent",
        "font_descent", "replies_hint", "pad0", "pad1"
    })
    class ListFontsWithInfoReply extends Structure {
        public UInt8 response_type;
        public UInt8 name_len;
        public UInt16 sequence;
        public UInt32 length;
        public Charinfo min_bounds;
        public Charinfo max_bounds;
        public UInt16 min_char_or_byte2;
        public UInt16 max_char_or_byte2;
        public UInt16 default_char;
        public UInt16 properties_len;
        public UInt8 draw_direction;
        public UInt8 min_byte1;
        public UInt8 max_byte1;
        public UInt8 all_chars_exist;
        public Int16 font_ascent;
        public Int16 font_descent;
        public UInt32 replies_hint;
        public UInt8[] pad0 = new UInt8[4];

        public UInt8[] pad1 = new UInt8[4];

        public static class ByReference extends ListFontsWithInfoReply
            implements Structure.ByReference { }
        public static class ByValue extends ListFontsWithInfoReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "font_qty", "pad1" })
    class SetFontPathRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public UInt16 font_qty;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends SetFontPathRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetFontPathRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetFontPathCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetFontPathCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetFontPathCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class GetFontPathRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends GetFontPathRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetFontPathRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "path_len", "pad1" })
    class GetFontPathReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 path_len;
        public UInt8[] pad1 = new UInt8[22];

        public static class ByReference extends GetFontPathReply
            implements Structure.ByReference { }
        public static class ByValue extends GetFontPathReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "depth", "length", "pid", "drawable", "width", "height" })
    class CreatePixmapRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 depth;
        public UInt16 length;
        public Pixmap pid;
        public Drawable drawable;
        public UInt16 width;
        public UInt16 height;
        public static class ByReference extends CreatePixmapRequest
            implements Structure.ByReference { }
        public static class ByValue extends CreatePixmapRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "pixmap" })
    class FreePixmapRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Pixmap pixmap;
        public static class ByReference extends FreePixmapRequest
            implements Structure.ByReference { }
        public static class ByValue extends FreePixmapRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "function", "plane_mask", "foreground", "background", "line_width", "line_style",
        "cap_style", "join_style", "fill_style", "fill_rule", "tile", "stipple",
        "tile_stipple_x_origin", "tile_stipple_y_origin", "font", "subwindow_mode",
        "graphics_exposures", "clip_x_origin", "clip_y_origin", "clip_mask", "dash_offset",
        "dashes", "arc_mode"
    })
    class CreateGcValueList extends Structure {
        public UInt32 function;
        public UInt32 plane_mask;
        public UInt32 foreground;
        public UInt32 background;
        public UInt32 line_width;
        public UInt32 line_style;
        public UInt32 cap_style;
        public UInt32 join_style;
        public UInt32 fill_style;
        public UInt32 fill_rule;
        public Pixmap tile;
        public Pixmap stipple;
        public Int32 tile_stipple_x_origin;
        public Int32 tile_stipple_y_origin;
        public Font font;
        public UInt32 subwindow_mode;
        public Bool32 graphics_exposures;
        public Int32 clip_x_origin;
        public Int32 clip_y_origin;
        public Pixmap clip_mask;
        public UInt32 dash_offset;
        public UInt32 dashes;
        public UInt32 arc_mode;
        public static class ByReference extends CreateGcValueList
            implements Structure.ByReference { }
        public static class ByValue extends CreateGcValueList
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cid", "drawable", "value_mask" })
    class CreateGcRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Gcontext cid;
        public Drawable drawable;
        public UInt32 value_mask;
        public static class ByReference extends CreateGcRequest
            implements Structure.ByReference { }
        public static class ByValue extends CreateGcRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "function", "plane_mask", "foreground", "background", "line_width", "line_style",
        "cap_style", "join_style", "fill_style", "fill_rule", "tile", "stipple",
        "tile_stipple_x_origin", "tile_stipple_y_origin", "font", "subwindow_mode",
        "graphics_exposures", "clip_x_origin", "clip_y_origin", "clip_mask", "dash_offset",
        "dashes", "arc_mode"
    })
    class ChangeGcValueList extends Structure {
        public UInt32 function;
        public UInt32 plane_mask;
        public UInt32 foreground;
        public UInt32 background;
        public UInt32 line_width;
        public UInt32 line_style;
        public UInt32 cap_style;
        public UInt32 join_style;
        public UInt32 fill_style;
        public UInt32 fill_rule;
        public Pixmap tile;
        public Pixmap stipple;
        public Int32 tile_stipple_x_origin;
        public Int32 tile_stipple_y_origin;
        public Font font;
        public UInt32 subwindow_mode;
        public Bool32 graphics_exposures;
        public Int32 clip_x_origin;
        public Int32 clip_y_origin;
        public Pixmap clip_mask;
        public UInt32 dash_offset;
        public UInt32 dashes;
        public UInt32 arc_mode;
        public static class ByReference extends ChangeGcValueList
            implements Structure.ByReference { }
        public static class ByValue extends ChangeGcValueList
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "gc", "value_mask" })
    class ChangeGcRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Gcontext gc;
        public UInt32 value_mask;
        public static class ByReference extends ChangeGcRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangeGcRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "src_gc", "dst_gc", "value_mask" })
    class CopyGcRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Gcontext src_gc;
        public Gcontext dst_gc;
        public UInt32 value_mask;
        public static class ByReference extends CopyGcRequest
            implements Structure.ByReference { }
        public static class ByValue extends CopyGcRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "gc", "dash_offset", "dashes_len" })
    class SetDashesRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Gcontext gc;
        public UInt16 dash_offset;
        public UInt16 dashes_len;
        public static class ByReference extends SetDashesRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetDashesRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "ordering", "length", "gc", "clip_x_origin", "clip_y_origin" })
    class SetClipRectanglesRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 ordering;
        public UInt16 length;
        public Gcontext gc;
        public Int16 clip_x_origin;
        public Int16 clip_y_origin;
        public static class ByReference extends SetClipRectanglesRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetClipRectanglesRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "gc" })
    class FreeGcRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Gcontext gc;
        public static class ByReference extends FreeGcRequest
            implements Structure.ByReference { }
        public static class ByValue extends FreeGcRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "exposures", "length", "window", "x", "y", "width", "height" })
    class ClearAreaRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 exposures;
        public UInt16 length;
        public Window window;
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public static class ByReference extends ClearAreaRequest
            implements Structure.ByReference { }
        public static class ByValue extends ClearAreaRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "src_drawable", "dst_drawable", "gc", "src_x", "src_y",
        "dst_x", "dst_y", "width", "height"
    })
    class CopyAreaRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable src_drawable;
        public Drawable dst_drawable;
        public Gcontext gc;
        public Int16 src_x;
        public Int16 src_y;
        public Int16 dst_x;
        public Int16 dst_y;
        public UInt16 width;
        public UInt16 height;
        public static class ByReference extends CopyAreaRequest
            implements Structure.ByReference { }
        public static class ByValue extends CopyAreaRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "src_drawable", "dst_drawable", "gc", "src_x", "src_y",
        "dst_x", "dst_y", "width", "height", "bit_plane"
    })
    class CopyPlaneRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable src_drawable;
        public Drawable dst_drawable;
        public Gcontext gc;
        public Int16 src_x;
        public Int16 src_y;
        public Int16 dst_x;
        public Int16 dst_y;
        public UInt16 width;
        public UInt16 height;
        public UInt32 bit_plane;
        public static class ByReference extends CopyPlaneRequest
            implements Structure.ByReference { }
        public static class ByValue extends CopyPlaneRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "coordinate_mode", "length", "drawable", "gc" })
    class PolyPointRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 coordinate_mode;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public static class ByReference extends PolyPointRequest
            implements Structure.ByReference { }
        public static class ByValue extends PolyPointRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "coordinate_mode", "length", "drawable", "gc" })
    class PolyLineRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 coordinate_mode;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public static class ByReference extends PolyLineRequest
            implements Structure.ByReference { }
        public static class ByValue extends PolyLineRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "x1", "y1", "x2", "y2" })
    class Segment extends Structure {
        public Int16 x1;
        public Int16 y1;
        public Int16 x2;
        public Int16 y2;
        public static class ByReference extends Segment
            implements Structure.ByReference { }
        public static class ByValue extends Segment
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class SegmentIterator extends Structure {
        public Segment data;
        public int rem;
        public int index;
        public static class ByReference extends SegmentIterator
            implements Structure.ByReference { }
        public static class ByValue extends SegmentIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "drawable", "gc" })
    class PolySegmentRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public static class ByReference extends PolySegmentRequest
            implements Structure.ByReference { }
        public static class ByValue extends PolySegmentRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "drawable", "gc" })
    class PolyRectangleRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public static class ByReference extends PolyRectangleRequest
            implements Structure.ByReference { }
        public static class ByValue extends PolyRectangleRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "drawable", "gc" })
    class PolyArcRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public static class ByReference extends PolyArcRequest
            implements Structure.ByReference { }
        public static class ByValue extends PolyArcRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "drawable", "gc", "shape", "coordinate_mode", "pad1"
    })
    class FillPolyRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public UInt8 shape;
        public UInt8 coordinate_mode;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends FillPolyRequest
            implements Structure.ByReference { }
        public static class ByValue extends FillPolyRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "drawable", "gc" })
    class PolyFillRectangleRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public static class ByReference extends PolyFillRectangleRequest
            implements Structure.ByReference { }
        public static class ByValue extends PolyFillRectangleRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "drawable", "gc" })
    class PolyFillArcRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public static class ByReference extends PolyFillArcRequest
            implements Structure.ByReference { }
        public static class ByValue extends PolyFillArcRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "format", "length", "drawable", "gc", "width", "height", "dst_x", "dst_y",
        "left_pad", "depth", "pad0"
    })
    class PutImageRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 format;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public UInt16 width;
        public UInt16 height;
        public Int16 dst_x;
        public Int16 dst_y;
        public UInt8 left_pad;
        public UInt8 depth;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends PutImageRequest
            implements Structure.ByReference { }
        public static class ByValue extends PutImageRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetImageCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetImageCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetImageCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "format", "length", "drawable", "x", "y", "width", "height", "plane_mask"
    })
    class GetImageRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 format;
        public UInt16 length;
        public Drawable drawable;
        public Int16 x;
        public Int16 y;
        public UInt16 width;
        public UInt16 height;
        public UInt32 plane_mask;
        public static class ByReference extends GetImageRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetImageRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "depth", "sequence", "length", "visual", "pad0" })
    class GetImageReply extends Structure {
        public UInt8 response_type;
        public UInt8 depth;
        public UInt16 sequence;
        public UInt32 length;
        public Visualid visual;
        public UInt8[] pad0 = new UInt8[20];

        public static class ByReference extends GetImageReply
            implements Structure.ByReference { }
        public static class ByValue extends GetImageReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "drawable", "gc", "x", "y" })
    class PolyText8Request extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public Int16 x;
        public Int16 y;
        public static class ByReference extends PolyText8Request
            implements Structure.ByReference { }
        public static class ByValue extends PolyText8Request
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "drawable", "gc", "x", "y" })
    class PolyText16Request extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public Int16 x;
        public Int16 y;
        public static class ByReference extends PolyText16Request
            implements Structure.ByReference { }
        public static class ByValue extends PolyText16Request
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "string_len", "length", "drawable", "gc", "x", "y" })
    class ImageText8Request extends Structure {
        public UInt8 major_opcode;
        public UInt8 string_len;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public Int16 x;
        public Int16 y;
        public static class ByReference extends ImageText8Request
            implements Structure.ByReference { }
        public static class ByValue extends ImageText8Request
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "string_len", "length", "drawable", "gc", "x", "y" })
    class ImageText16Request extends Structure {
        public UInt8 major_opcode;
        public UInt8 string_len;
        public UInt16 length;
        public Drawable drawable;
        public Gcontext gc;
        public Int16 x;
        public Int16 y;
        public static class ByReference extends ImageText16Request
            implements Structure.ByReference { }
        public static class ByValue extends ImageText16Request
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "alloc", "length", "mid", "window", "visual" })
    class CreateColormapRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 alloc;
        public UInt16 length;
        public Colormap mid;
        public Window window;
        public Visualid visual;
        public static class ByReference extends CreateColormapRequest
            implements Structure.ByReference { }
        public static class ByValue extends CreateColormapRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap" })
    class FreeColormapRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public static class ByReference extends FreeColormapRequest
            implements Structure.ByReference { }
        public static class ByValue extends FreeColormapRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "mid", "src_cmap" })
    class CopyColormapAndFreeRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap mid;
        public Colormap src_cmap;
        public static class ByReference extends CopyColormapAndFreeRequest
            implements Structure.ByReference { }
        public static class ByValue extends CopyColormapAndFreeRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap" })
    class InstallColormapRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public static class ByReference extends InstallColormapRequest
            implements Structure.ByReference { }
        public static class ByValue extends InstallColormapRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap" })
    class UninstallColormapRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public static class ByReference extends UninstallColormapRequest
            implements Structure.ByReference { }
        public static class ByValue extends UninstallColormapRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class ListInstalledColormapsCookie extends Structure {
        public int sequence;
        public static class ByReference extends ListInstalledColormapsCookie
            implements Structure.ByReference { }
        public static class ByValue extends ListInstalledColormapsCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window" })
    class ListInstalledColormapsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public static class ByReference extends ListInstalledColormapsRequest
            implements Structure.ByReference { }
        public static class ByValue extends ListInstalledColormapsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "cmaps_len", "pad1" })
    class ListInstalledColormapsReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 cmaps_len;
        public UInt8[] pad1 = new UInt8[22];

        public static class ByReference extends ListInstalledColormapsReply
            implements Structure.ByReference { }
        public static class ByValue extends ListInstalledColormapsReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class AllocColorCookie extends Structure {
        public int sequence;
        public static class ByReference extends AllocColorCookie
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap", "red", "green", "blue", "pad1" })
    class AllocColorRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public UInt16 red;
        public UInt16 green;
        public UInt16 blue;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends AllocColorRequest
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "red", "green", "blue", "pixel", "pad1"
    })
    class AllocColorReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 red;
        public UInt16 green;
        public UInt16 blue;
        public UInt32 pixel;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends AllocColorReply
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class AllocNamedColorCookie extends Structure {
        public int sequence;
        public static class ByReference extends AllocNamedColorCookie
            implements Structure.ByReference { }
        public static class ByValue extends AllocNamedColorCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap", "name_len", "pad1" })
    class AllocNamedColorRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public UInt16 name_len;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends AllocNamedColorRequest
            implements Structure.ByReference { }
        public static class ByValue extends AllocNamedColorRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "pixel", "exact_red", "exact_green",
        "exact_blue", "visual_red", "visual_green", "visual_blue"
    })
    class AllocNamedColorReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt32 pixel;
        public UInt16 exact_red;
        public UInt16 exact_green;
        public UInt16 exact_blue;
        public UInt16 visual_red;
        public UInt16 visual_green;
        public UInt16 visual_blue;
        public static class ByReference extends AllocNamedColorReply
            implements Structure.ByReference { }
        public static class ByValue extends AllocNamedColorReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class AllocColorCellsCookie extends Structure {
        public int sequence;
        public static class ByReference extends AllocColorCellsCookie
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorCellsCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "contiguous", "length", "cmap", "colors", "planes" })
    class AllocColorCellsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 contiguous;
        public UInt16 length;
        public Colormap cmap;
        public UInt16 colors;
        public UInt16 planes;
        public static class ByReference extends AllocColorCellsRequest
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorCellsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "pixels_len", "masks_len", "pad1"
    })
    class AllocColorCellsReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 pixels_len;
        public UInt16 masks_len;
        public UInt8[] pad1 = new UInt8[20];

        public static class ByReference extends AllocColorCellsReply
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorCellsReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class AllocColorPlanesCookie extends Structure {
        public int sequence;
        public static class ByReference extends AllocColorPlanesCookie
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorPlanesCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "contiguous", "length", "cmap", "colors", "reds", "greens", "blues"
    })
    class AllocColorPlanesRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 contiguous;
        public UInt16 length;
        public Colormap cmap;
        public UInt16 colors;
        public UInt16 reds;
        public UInt16 greens;
        public UInt16 blues;
        public static class ByReference extends AllocColorPlanesRequest
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorPlanesRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "pixels_len", "red_mask", "green_mask",
        "blue_mask", "pad1", "pad2"
    })
    class AllocColorPlanesReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 pixels_len;
        public UInt32 red_mask;
        public UInt32 green_mask;
        public UInt32 blue_mask;
        public UInt8[] pad1 = new UInt8[2];

        public UInt8[] pad2 = new UInt8[8];

        public static class ByReference extends AllocColorPlanesReply
            implements Structure.ByReference { }
        public static class ByValue extends AllocColorPlanesReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap", "plane_mask" })
    class FreeColorsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public UInt32 plane_mask;
        public static class ByReference extends FreeColorsRequest
            implements Structure.ByReference { }
        public static class ByValue extends FreeColorsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "pixel", "red", "green", "blue", "flags", "pad0" })
    class Coloritem extends Structure {
        public UInt32 pixel;
        public UInt16 red;
        public UInt16 green;
        public UInt16 blue;
        public UInt8 flags;
        public UInt8 pad0;
        public static class ByReference extends Coloritem
            implements Structure.ByReference { }
        public static class ByValue extends Coloritem
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class ColoritemIterator extends Structure {
        public Coloritem data;
        public int rem;
        public int index;
        public static class ByReference extends ColoritemIterator
            implements Structure.ByReference { }
        public static class ByValue extends ColoritemIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap" })
    class StoreColorsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public static class ByReference extends StoreColorsRequest
            implements Structure.ByReference { }
        public static class ByValue extends StoreColorsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "flags", "length", "cmap", "pixel", "name_len", "pad0" })
    class StoreNamedColorRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 flags;
        public UInt16 length;
        public Colormap cmap;
        public UInt32 pixel;
        public UInt16 name_len;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends StoreNamedColorRequest
            implements Structure.ByReference { }
        public static class ByValue extends StoreNamedColorRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "red", "green", "blue", "pad0" })
    class Rgb extends Structure {
        public UInt16 red;
        public UInt16 green;
        public UInt16 blue;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends Rgb
            implements Structure.ByReference { }
        public static class ByValue extends Rgb
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class RgbIterator extends Structure {
        public Rgb data;
        public int rem;
        public int index;
        public static class ByReference extends RgbIterator
            implements Structure.ByReference { }
        public static class ByValue extends RgbIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class QueryColorsCookie extends Structure {
        public int sequence;
        public static class ByReference extends QueryColorsCookie
            implements Structure.ByReference { }
        public static class ByValue extends QueryColorsCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap" })
    class QueryColorsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public static class ByReference extends QueryColorsRequest
            implements Structure.ByReference { }
        public static class ByValue extends QueryColorsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "colors_len", "pad1" })
    class QueryColorsReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 colors_len;
        public UInt8[] pad1 = new UInt8[22];

        public static class ByReference extends QueryColorsReply
            implements Structure.ByReference { }
        public static class ByValue extends QueryColorsReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class LookupColorCookie extends Structure {
        public int sequence;
        public static class ByReference extends LookupColorCookie
            implements Structure.ByReference { }
        public static class ByValue extends LookupColorCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cmap", "name_len", "pad1" })
    class LookupColorRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Colormap cmap;
        public UInt16 name_len;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends LookupColorRequest
            implements Structure.ByReference { }
        public static class ByValue extends LookupColorRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "exact_red", "exact_green", "exact_blue",
        "visual_red", "visual_green", "visual_blue"
    })
    class LookupColorReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 exact_red;
        public UInt16 exact_green;
        public UInt16 exact_blue;
        public UInt16 visual_red;
        public UInt16 visual_green;
        public UInt16 visual_blue;
        public static class ByReference extends LookupColorReply
            implements Structure.ByReference { }
        public static class ByValue extends LookupColorReply
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "cid", "source", "mask", "fore_red", "fore_green",
        "fore_blue", "back_red", "back_green", "back_blue", "x", "y"
    })
    class CreateCursorRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Cursor cid;
        public Pixmap source;
        public Pixmap mask;
        public UInt16 fore_red;
        public UInt16 fore_green;
        public UInt16 fore_blue;
        public UInt16 back_red;
        public UInt16 back_green;
        public UInt16 back_blue;
        public UInt16 x;
        public UInt16 y;
        public static class ByReference extends CreateCursorRequest
            implements Structure.ByReference { }
        public static class ByValue extends CreateCursorRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "cid", "source_font", "mask_font", "source_char",
        "mask_char", "fore_red", "fore_green", "fore_blue", "back_red", "back_green", "back_blue"
    })
    class CreateGlyphCursorRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Cursor cid;
        public Font source_font;
        public Font mask_font;
        public UInt16 source_char;
        public UInt16 mask_char;
        public UInt16 fore_red;
        public UInt16 fore_green;
        public UInt16 fore_blue;
        public UInt16 back_red;
        public UInt16 back_green;
        public UInt16 back_blue;
        public static class ByReference extends CreateGlyphCursorRequest
            implements Structure.ByReference { }
        public static class ByValue extends CreateGlyphCursorRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "cursor" })
    class FreeCursorRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Cursor cursor;
        public static class ByReference extends FreeCursorRequest
            implements Structure.ByReference { }
        public static class ByValue extends FreeCursorRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "cursor", "fore_red", "fore_green", "fore_blue",
        "back_red", "back_green", "back_blue"
    })
    class RecolorCursorRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Cursor cursor;
        public UInt16 fore_red;
        public UInt16 fore_green;
        public UInt16 fore_blue;
        public UInt16 back_red;
        public UInt16 back_green;
        public UInt16 back_blue;
        public static class ByReference extends RecolorCursorRequest
            implements Structure.ByReference { }
        public static class ByValue extends RecolorCursorRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class QueryBestSizeCookie extends Structure {
        public int sequence;
        public static class ByReference extends QueryBestSizeCookie
            implements Structure.ByReference { }
        public static class ByValue extends QueryBestSizeCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "_class", "length", "drawable", "width", "height" })
    class QueryBestSizeRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 _class;
        public UInt16 length;
        public Drawable drawable;
        public UInt16 width;
        public UInt16 height;
        public static class ByReference extends QueryBestSizeRequest
            implements Structure.ByReference { }
        public static class ByValue extends QueryBestSizeRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "pad0", "sequence", "length", "width", "height" })
    class QueryBestSizeReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 width;
        public UInt16 height;
        public static class ByReference extends QueryBestSizeReply
            implements Structure.ByReference { }
        public static class ByValue extends QueryBestSizeReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class QueryExtensionCookie extends Structure {
        public int sequence;
        public static class ByReference extends QueryExtensionCookie
            implements Structure.ByReference { }
        public static class ByValue extends QueryExtensionCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "name_len", "pad1" })
    class QueryExtensionRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public UInt16 name_len;
        public UInt8[] pad1 = new UInt8[2];

        public static class ByReference extends QueryExtensionRequest
            implements Structure.ByReference { }
        public static class ByValue extends QueryExtensionRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "present", "major_opcode", "first_event",
        "first_error"
    })
    class QueryExtensionReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt8 present;
        public UInt8 major_opcode;
        public UInt8 first_event;
        public UInt8 first_error;
        public static class ByReference extends QueryExtensionReply
            implements Structure.ByReference { }
        public static class ByValue extends QueryExtensionReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class ListExtensionsCookie extends Structure {
        public int sequence;
        public static class ByReference extends ListExtensionsCookie
            implements Structure.ByReference { }
        public static class ByValue extends ListExtensionsCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class ListExtensionsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends ListExtensionsRequest
            implements Structure.ByReference { }
        public static class ByValue extends ListExtensionsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "names_len", "sequence", "length", "pad0" })
    class ListExtensionsReply extends Structure {
        public UInt8 response_type;
        public UInt8 names_len;
        public UInt16 sequence;
        public UInt32 length;
        public UInt8[] pad0 = new UInt8[24];

        public static class ByReference extends ListExtensionsReply
            implements Structure.ByReference { }
        public static class ByValue extends ListExtensionsReply
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "keycode_count", "length", "first_keycode", "keysyms_per_keycode", "pad0"
    })
    class ChangeKeyboardMappingRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 keycode_count;
        public UInt16 length;
        public Keycode first_keycode;
        public UInt8 keysyms_per_keycode;
        public UInt8[] pad0 = new UInt8[2];

        public static class ByReference extends ChangeKeyboardMappingRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangeKeyboardMappingRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetKeyboardMappingCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetKeyboardMappingCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetKeyboardMappingCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "first_keycode", "count" })
    class GetKeyboardMappingRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Keycode first_keycode;
        public UInt8 count;
        public static class ByReference extends GetKeyboardMappingRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetKeyboardMappingRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "keysyms_per_keycode", "sequence", "length", "pad0" })
    class GetKeyboardMappingReply extends Structure {
        public UInt8 response_type;
        public UInt8 keysyms_per_keycode;
        public UInt16 sequence;
        public UInt32 length;
        public UInt8[] pad0 = new UInt8[24];

        public static class ByReference extends GetKeyboardMappingReply
            implements Structure.ByReference { }
        public static class ByValue extends GetKeyboardMappingReply
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "key_click_percent", "bell_percent", "bell_pitch", "bell_duration", "led", "led_mode",
        "key", "auto_repeat_mode"
    })
    class ChangeKeyboardControlValueList extends Structure {
        public Int32 key_click_percent;
        public Int32 bell_percent;
        public Int32 bell_pitch;
        public Int32 bell_duration;
        public UInt32 led;
        public UInt32 led_mode;
        public Keycode32 key;
        public UInt32 auto_repeat_mode;
        public static class ByReference extends ChangeKeyboardControlValueList
            implements Structure.ByReference { }
        public static class ByValue extends ChangeKeyboardControlValueList
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "value_mask" })
    class ChangeKeyboardControlRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public UInt32 value_mask;
        public static class ByReference extends ChangeKeyboardControlRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangeKeyboardControlRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetKeyboardControlCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetKeyboardControlCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetKeyboardControlCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class GetKeyboardControlRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends GetKeyboardControlRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetKeyboardControlRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "global_auto_repeat", "sequence", "length", "led_mask",
        "key_click_percent", "bell_percent", "bell_pitch", "bell_duration", "pad0", "auto_repeats"
    })
    class GetKeyboardControlReply extends Structure {
        public UInt8 response_type;
        public UInt8 global_auto_repeat;
        public UInt16 sequence;
        public UInt32 length;
        public UInt32 led_mask;
        public UInt8 key_click_percent;
        public UInt8 bell_percent;
        public UInt16 bell_pitch;
        public UInt16 bell_duration;
        public UInt8[] pad0 = new UInt8[2];

        public UInt8[] auto_repeats = new UInt8[32];

        public static class ByReference extends GetKeyboardControlReply
            implements Structure.ByReference { }
        public static class ByValue extends GetKeyboardControlReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "percent", "length" })
    class BellRequest extends Structure {
        public UInt8 major_opcode;
        public Int8 percent;
        public UInt16 length;
        public static class ByReference extends BellRequest
            implements Structure.ByReference { }
        public static class ByValue extends BellRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "acceleration_numerator", "acceleration_denominator",
        "threshold", "do_acceleration", "do_threshold"
    })
    class ChangePointerControlRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Int16 acceleration_numerator;
        public Int16 acceleration_denominator;
        public Int16 threshold;
        public UInt8 do_acceleration;
        public UInt8 do_threshold;
        public static class ByReference extends ChangePointerControlRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangePointerControlRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetPointerControlCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetPointerControlCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetPointerControlCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class GetPointerControlRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends GetPointerControlRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetPointerControlRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "acceleration_numerator",
        "acceleration_denominator", "threshold", "pad1"
    })
    class GetPointerControlReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 acceleration_numerator;
        public UInt16 acceleration_denominator;
        public UInt16 threshold;
        public UInt8[] pad1 = new UInt8[18];

        public static class ByReference extends GetPointerControlReply
            implements Structure.ByReference { }
        public static class ByValue extends GetPointerControlReply
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "major_opcode", "pad0", "length", "timeout", "interval", "prefer_blanking",
        "allow_exposures"
    })
    class SetScreenSaverRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Int16 timeout;
        public Int16 interval;
        public UInt8 prefer_blanking;
        public UInt8 allow_exposures;
        public static class ByReference extends SetScreenSaverRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetScreenSaverRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetScreenSaverCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetScreenSaverCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetScreenSaverCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class GetScreenSaverRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends GetScreenSaverRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetScreenSaverRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "timeout", "interval", "prefer_blanking",
        "allow_exposures", "pad1"
    })
    class GetScreenSaverReply extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 timeout;
        public UInt16 interval;
        public UInt8 prefer_blanking;
        public UInt8 allow_exposures;
        public UInt8[] pad1 = new UInt8[18];

        public static class ByReference extends GetScreenSaverReply
            implements Structure.ByReference { }
        public static class ByValue extends GetScreenSaverReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "mode", "length", "family", "pad0", "address_len" })
    class ChangeHostsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 mode;
        public UInt16 length;
        public UInt8 family;
        public UInt8 pad0;
        public UInt16 address_len;
        public static class ByReference extends ChangeHostsRequest
            implements Structure.ByReference { }
        public static class ByValue extends ChangeHostsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "family", "pad0", "address_len" })
    class Host extends Structure {
        public UInt8 family;
        public UInt8 pad0;
        public UInt16 address_len;
        public static class ByReference extends Host
            implements Structure.ByReference { }
        public static class ByValue extends Host
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class HostIterator extends Structure {
        public Host data;
        public int rem;
        public int index;
        public static class ByReference extends HostIterator
            implements Structure.ByReference { }
        public static class ByValue extends HostIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class ListHostsCookie extends Structure {
        public int sequence;
        public static class ByReference extends ListHostsCookie
            implements Structure.ByReference { }
        public static class ByValue extends ListHostsCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class ListHostsRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends ListHostsRequest
            implements Structure.ByReference { }
        public static class ByValue extends ListHostsRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "mode", "sequence", "length", "hosts_len", "pad0" })
    class ListHostsReply extends Structure {
        public UInt8 response_type;
        public UInt8 mode;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 hosts_len;
        public UInt8[] pad0 = new UInt8[22];

        public static class ByReference extends ListHostsReply
            implements Structure.ByReference { }
        public static class ByValue extends ListHostsReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "mode", "length" })
    class SetAccessControlRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 mode;
        public UInt16 length;
        public static class ByReference extends SetAccessControlRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetAccessControlRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "mode", "length" })
    class SetCloseDownModeRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 mode;
        public UInt16 length;
        public static class ByReference extends SetCloseDownModeRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetCloseDownModeRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "resource" })
    class KillClientRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public UInt32 resource;
        public static class ByReference extends KillClientRequest
            implements Structure.ByReference { }
        public static class ByValue extends KillClientRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length", "window", "atoms_len", "delta" })
    class RotatePropertiesRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public Window window;
        public UInt16 atoms_len;
        public Int16 delta;
        public static class ByReference extends RotatePropertiesRequest
            implements Structure.ByReference { }
        public static class ByValue extends RotatePropertiesRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "mode", "length" })
    class ForceScreenSaverRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 mode;
        public UInt16 length;
        public static class ByReference extends ForceScreenSaverRequest
            implements Structure.ByReference { }
        public static class ByValue extends ForceScreenSaverRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class SetPointerMappingCookie extends Structure {
        public int sequence;
        public static class ByReference extends SetPointerMappingCookie
            implements Structure.ByReference { }
        public static class ByValue extends SetPointerMappingCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "map_len", "length" })
    class SetPointerMappingRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 map_len;
        public UInt16 length;
        public static class ByReference extends SetPointerMappingRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetPointerMappingRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "status", "sequence", "length" })
    class SetPointerMappingReply extends Structure {
        public UInt8 response_type;
        public UInt8 status;
        public UInt16 sequence;
        public UInt32 length;
        public static class ByReference extends SetPointerMappingReply
            implements Structure.ByReference { }
        public static class ByValue extends SetPointerMappingReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetPointerMappingCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetPointerMappingCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetPointerMappingCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class GetPointerMappingRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends GetPointerMappingRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetPointerMappingRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "map_len", "sequence", "length", "pad0" })
    class GetPointerMappingReply extends Structure {
        public UInt8 response_type;
        public UInt8 map_len;
        public UInt16 sequence;
        public UInt32 length;
        public UInt8[] pad0 = new UInt8[24];

        public static class ByReference extends GetPointerMappingReply
            implements Structure.ByReference { }
        public static class ByValue extends GetPointerMappingReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class SetModifierMappingCookie extends Structure {
        public int sequence;
        public static class ByReference extends SetModifierMappingCookie
            implements Structure.ByReference { }
        public static class ByValue extends SetModifierMappingCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "keycodes_per_modifier", "length" })
    class SetModifierMappingRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 keycodes_per_modifier;
        public UInt16 length;
        public static class ByReference extends SetModifierMappingRequest
            implements Structure.ByReference { }
        public static class ByValue extends SetModifierMappingRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "status", "sequence", "length" })
    class SetModifierMappingReply extends Structure {
        public UInt8 response_type;
        public UInt8 status;
        public UInt16 sequence;
        public UInt32 length;
        public static class ByReference extends SetModifierMappingReply
            implements Structure.ByReference { }
        public static class ByValue extends SetModifierMappingReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class GetModifierMappingCookie extends Structure {
        public int sequence;
        public static class ByReference extends GetModifierMappingCookie
            implements Structure.ByReference { }
        public static class ByValue extends GetModifierMappingCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class GetModifierMappingRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends GetModifierMappingRequest
            implements Structure.ByReference { }
        public static class ByValue extends GetModifierMappingRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "response_type", "keycodes_per_modifier", "sequence", "length", "pad0" })
    class GetModifierMappingReply extends Structure {
        public UInt8 response_type;
        public UInt8 keycodes_per_modifier;
        public UInt16 sequence;
        public UInt32 length;
        public UInt8[] pad0 = new UInt8[24];

        public static class ByReference extends GetModifierMappingReply
            implements Structure.ByReference { }
        public static class ByValue extends GetModifierMappingReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "major_opcode", "pad0", "length" })
    class NoOperationRequest extends Structure {
        public UInt8 major_opcode;
        public UInt8 pad0;
        public UInt16 length;
        public static class ByReference extends NoOperationRequest
            implements Structure.ByReference { }
        public static class ByValue extends NoOperationRequest
            implements Structure.ByValue { }
    }
    @FieldOrder({ "sequence" })
    class VoidCookie extends Structure {
        public int sequence;
        public static class ByReference extends VoidCookie
            implements Structure.ByReference { }
        public static class ByValue extends VoidCookie
            implements Structure.ByValue { }
    }
    @FieldOrder({ "data", "rem", "index" })
    class GenericIterator extends Structure {
        public Pointer data;
        public int rem;
        public int index;
        public static class ByReference extends GenericIterator
            implements Structure.ByReference { }
        public static class ByValue extends GenericIterator
            implements Structure.ByValue { }
    }
    @FieldOrder({ "responseType", "pad0", "sequence", "length" })
    class GenericReply extends Structure {
        public short responseType;
        public short pad0;
        public int sequence;
        public NativeLong length;
        public static class ByReference extends GenericReply
            implements Structure.ByReference { }
        public static class ByValue extends GenericReply
            implements Structure.ByValue { }
    }
    @FieldOrder({ "responseType", "pad0", "sequence", "pad", "fullSequence" })
    class GenericEvent extends Structure {
        public short responseType;
        public short pad0;
        public int sequence;
        public NativeLong[] pad = new NativeLong[7];

        public NativeLong fullSequence;
        public static class ByReference extends GenericEvent
            implements Structure.ByReference { }
        public static class ByValue extends GenericEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({ "responseType", "pad0", "sequence", "pad" })
    class RawGenericEvent extends Structure {
        public short responseType;
        public short pad0;
        public int sequence;
        public NativeLong[] pad = new NativeLong[7];

        public static class ByReference extends RawGenericEvent
            implements Structure.ByReference { }
        public static class ByValue extends RawGenericEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "width", "height", "format", "scanlinePad", "depth", "bpp", "unit", "planeMask",
        "byteOrder", "bitOrder", "stride", "size", "base", "data"
    })
    class Image extends Structure {
        public int width;
        public int height;
        public int format;
        public short scanlinePad;
        public short depth;
        public short bpp;
        public short unit;
        public long planeMask;
        public int byteOrder;
        public int bitOrder;
        public long stride;
        public long size;
        public Pointer base;
        public Pointer data;
        public static class ByReference extends Image
            implements Structure.ByReference { }
        public static class ByValue extends Image
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "pad0", "sequence", "length", "event_type", "pad1", "full_sequence", "pad"
    })
    class GeEvent extends Structure {
        public UInt8 response_type;
        public UInt8 pad0;
        public UInt16 sequence;
        public UInt32 length;
        public UInt16 event_type;
        public UInt16 pad1;
        public UInt32 full_sequence;
        public UInt32[] pad = new UInt32[5];

        public static class ByReference extends GeEvent
            implements Structure.ByReference { }
        public static class ByValue extends GeEvent
            implements Structure.ByValue { }
    }
    @FieldOrder({
        "response_type", "error_code", "sequence", "resource_id", "minor_code", "major_code",
        "pad0", "full_sequence", "pad"
    })
    class GenericError extends Structure {
        public UInt8 response_type;
        public UInt8 error_code;
        public UInt16 sequence;
        public UInt32 resource_id;
        public UInt16 minor_code;
        public UInt8 major_code;
        public UInt8 pad0;
        public UInt32 full_sequence;
        public UInt32[] pad = new UInt32[5];

        public static class ByReference extends GenericError
            implements Structure.ByReference { }
        public static class ByValue extends GenericError
            implements Structure.ByValue { }
    }
    @FieldOrder({ "namelen", "name", "datalen", "data" })
    class AuthInfo extends Structure {
        public int namelen;
        public String name;
        public int datalen;
        public String data;
        public static class ByReference extends AuthInfo
            implements Structure.ByReference { }
        public static class ByValue extends AuthInfo
            implements Structure.ByValue { }
    }
    class WindowError extends ValueError {
        public static class ByReference extends WindowError
            implements Structure.ByReference { }
        public static class ByValue extends WindowError
            implements Structure.ByValue { }
    }
    class PixmapError extends ValueError {
        public static class ByReference extends PixmapError
            implements Structure.ByReference { }
        public static class ByValue extends PixmapError
            implements Structure.ByValue { }
    }
    class AtomError extends ValueError {
        public static class ByReference extends AtomError
            implements Structure.ByReference { }
        public static class ByValue extends AtomError
            implements Structure.ByValue { }
    }
    class CursorError extends ValueError {
        public static class ByReference extends CursorError
            implements Structure.ByReference { }
        public static class ByValue extends CursorError
            implements Structure.ByValue { }
    }
    class FontError extends ValueError {
        public static class ByReference extends FontError
            implements Structure.ByReference { }
        public static class ByValue extends FontError
            implements Structure.ByValue { }
    }
    class MatchError extends RequestError {
        public static class ByReference extends MatchError
            implements Structure.ByReference { }
        public static class ByValue extends MatchError
            implements Structure.ByValue { }
    }
    class DrawableError extends ValueError {
        public static class ByReference extends DrawableError
            implements Structure.ByReference { }
        public static class ByValue extends DrawableError
            implements Structure.ByValue { }
    }
    class AccessError extends RequestError {
        public static class ByReference extends AccessError
            implements Structure.ByReference { }
        public static class ByValue extends AccessError
            implements Structure.ByValue { }
    }
    class AllocError extends RequestError {
        public static class ByReference extends AllocError
            implements Structure.ByReference { }
        public static class ByValue extends AllocError
            implements Structure.ByValue { }
    }
    class ColormapError extends ValueError {
        public static class ByReference extends ColormapError
            implements Structure.ByReference { }
        public static class ByValue extends ColormapError
            implements Structure.ByValue { }
    }
    class GContextError extends ValueError {
        public static class ByReference extends GContextError
            implements Structure.ByReference { }
        public static class ByValue extends GContextError
            implements Structure.ByValue { }
    }
    class IdChoiceError extends ValueError {
        public static class ByReference extends IdChoiceError
            implements Structure.ByReference { }
        public static class ByValue extends IdChoiceError
            implements Structure.ByValue { }
    }
    class NameError extends RequestError {
        public static class ByReference extends NameError
            implements Structure.ByReference { }
        public static class ByValue extends NameError
            implements Structure.ByValue { }
    }
    class LengthError extends RequestError {
        public static class ByReference extends LengthError
            implements Structure.ByReference { }
        public static class ByValue extends LengthError
            implements Structure.ByValue { }
    }
    class ImplementationError extends RequestError {
        public static class ByReference extends ImplementationError
            implements Structure.ByReference { }
        public static class ByValue extends ImplementationError
            implements Structure.ByValue { }
    }
    class Button extends UInt8 {
        public static class ByReference extends Button
            implements Structure.ByReference { }
        public static class ByValue extends Button
            implements Structure.ByValue { }
    }
    class Keycode32 extends UInt32 {
        public static class ByReference extends Keycode32
            implements Structure.ByReference { }
        public static class ByValue extends Keycode32
            implements Structure.ByValue { }
    }
    class Keycode extends UInt8 {
        public static class ByReference extends Keycode
            implements Structure.ByReference { }
        public static class ByValue extends Keycode
            implements Structure.ByValue { }
    }
    class Keysym extends UInt32 {
        public static class ByReference extends Keysym
            implements Structure.ByReference { }
        public static class ByValue extends Keysym
            implements Structure.ByValue { }
    }
    class Timestamp extends UInt32 {
        public static class ByReference extends Timestamp
            implements Structure.ByReference { }
        public static class ByValue extends Timestamp
            implements Structure.ByValue { }
    }
    class Visualid extends UInt32 {
        public static class ByReference extends Visualid
            implements Structure.ByReference { }
        public static class ByValue extends Visualid
            implements Structure.ByValue { }
    }
    class Fontable extends UInt32 {
        public static class ByReference extends Fontable
            implements Structure.ByReference { }
        public static class ByValue extends Fontable
            implements Structure.ByValue { }
    }
    class Window extends UInt32 {
        public static class ByReference extends Window
            implements Structure.ByReference { }
        public static class ByValue extends Window
            implements Structure.ByValue { }
    }
    class Pixmap extends UInt32 {
        public static class ByReference extends Pixmap
            implements Structure.ByReference { }
        public static class ByValue extends Pixmap
            implements Structure.ByValue { }
    }
    class Cursor extends UInt32 {
        public static class ByReference extends Cursor
            implements Structure.ByReference { }
        public static class ByValue extends Cursor
            implements Structure.ByValue { }
    }
    class Font extends UInt32 {
        public static class ByReference extends Font
            implements Structure.ByReference { }
        public static class ByValue extends Font
            implements Structure.ByValue { }
    }
    class Gcontext extends UInt32 {
        public static class ByReference extends Gcontext
            implements Structure.ByReference { }
        public static class ByValue extends Gcontext
            implements Structure.ByValue { }
    }
    class Colormap extends UInt32 {
        public static class ByReference extends Colormap
            implements Structure.ByReference { }
        public static class ByValue extends Colormap
            implements Structure.ByValue { }
    }
    class Atom extends UInt32 {
        public static class ByReference extends Atom
            implements Structure.ByReference { }
        public static class ByValue extends Atom
            implements Structure.ByValue { }
    }
    class Drawable extends UInt32 {
        public static class ByReference extends Drawable
            implements Structure.ByReference { }
        public static class ByValue extends Drawable
            implements Structure.ByValue { }
    }
    class Bool32 extends UInt32 {
        public static class ByReference extends Bool32
            implements Structure.ByReference { }
        public static class ByValue extends Bool32
            implements Structure.ByValue { }
    }
    class KeyReleaseEvent extends KeyPressEvent {
        public static class ByReference extends KeyReleaseEvent
            implements Structure.ByReference { }
        public static class ByValue extends KeyReleaseEvent
            implements Structure.ByValue { }
    }
    class ButtonReleaseEvent extends ButtonPressEvent {
        public static class ByReference extends ButtonReleaseEvent
            implements Structure.ByReference { }
        public static class ByValue extends ButtonReleaseEvent
            implements Structure.ByValue { }
    }
    class LeaveNotifyEvent extends EnterNotifyEvent {
        public static class ByReference extends LeaveNotifyEvent
            implements Structure.ByReference { }
        public static class ByValue extends LeaveNotifyEvent
            implements Structure.ByValue { }
    }
    class FocusOutEvent extends FocusInEvent {
        public static class ByReference extends FocusOutEvent
            implements Structure.ByReference { }
        public static class ByValue extends FocusOutEvent
            implements Structure.ByValue { }
    }
    class CirculateRequestEvent extends CirculateNotifyEvent {
        public static class ByReference extends CirculateRequestEvent
            implements Structure.ByReference { }
        public static class ByValue extends CirculateRequestEvent
            implements Structure.ByValue { }
    }
    class SpecialEvent extends PointerType {
        public static class ByReference extends SpecialEvent
            implements Structure.ByReference { }
        public static class ByValue extends SpecialEvent
            implements Structure.ByValue { }
    }
    class Extension extends PointerType {
        public static class ByReference extends Extension
            implements Structure.ByReference { }
        public static class ByValue extends Extension
            implements Structure.ByValue { }
    }
    class Connection extends PointerType {
        public static class ByReference extends Connection
            implements Structure.ByReference { }
        public static class ByValue extends Connection
            implements Structure.ByValue { }
    }
}
