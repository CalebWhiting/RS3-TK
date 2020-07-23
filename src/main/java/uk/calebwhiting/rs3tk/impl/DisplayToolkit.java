package uk.calebwhiting.rs3tk.impl;

import java.io.Closeable;

public interface DisplayToolkit extends Closeable {

  String id();

  void initialize();

  Window[] getWindows();

  @Override
  void close();
}
