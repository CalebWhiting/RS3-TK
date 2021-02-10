package uk.calebwhiting.tk.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import uk.calebwhiting.tk.api.ClientContext;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class ClientSizeChanged {

    private final ClientContext context;
    private final int oldWidth, oldHeight, width, height;

}
