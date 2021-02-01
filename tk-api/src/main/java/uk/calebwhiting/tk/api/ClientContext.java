package uk.calebwhiting.tk.api;

import java.util.Map;

public interface ClientContext {

    long getId();

    Map<Object, Object> getVars();

}
