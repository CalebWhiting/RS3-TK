module uk.calebwhiting.tk.core {

    requires lombok;

    requires com.sun.jna;

    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;

    requires java.desktop;

    requires org.freedesktop.xcb;

    requires uk.calebwhiting.tk.api;
    requires uk.calebwhiting.tk.annotations;

    requires com.google.common;
    requires com.google.guice;

    exports uk.calebwhiting.tk;
    exports uk.calebwhiting.tk.bus;
    exports uk.calebwhiting.tk.event;

    opens uk.calebwhiting.tk;
    opens uk.calebwhiting.tk.plugins;

}
