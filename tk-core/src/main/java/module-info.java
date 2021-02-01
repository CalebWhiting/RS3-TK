module uk.calebwhiting.tk.core {

  /*requires com.sun.jna;
  requires com.sun.jna.platform;*/

    requires lombok;
    requires opencv;

    requires com.sun.jna;

    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;

    requires com.google.guice;
    requires com.google.common;

    requires java.desktop;

    requires org.freedesktop.xcb;

    requires uk.calebwhiting.tk.api;
    requires uk.calebwhiting.tk.annotations;

    exports uk.calebwhiting.tk;
    exports uk.calebwhiting.tk.inject;
    exports uk.calebwhiting.tk.event;

    opens uk.calebwhiting.tk;
    opens uk.calebwhiting.tk.inject;
    opens uk.calebwhiting.tk.event;
    opens uk.calebwhiting.tk.plugins;

}
