package uk.calebwhiting.tk.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import uk.calebwhiting.tk.inject.ClientContextImpl;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class ClientSizeChanged {

    private final ClientContextImpl context;
    private final int oldWidth, oldHeight, width, height;

}
