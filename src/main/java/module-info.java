module uk.calebwhiting.rs3tk {

  requires com.sun.jna;
  requires com.sun.jna.platform;

  requires javafx.base;
  requires javafx.controls;
  requires javafx.graphics;

  exports uk.calebwhiting.rs3tk to javafx.graphics;

  exports uk.calebwhiting.rs3tk.impl.x11;

}