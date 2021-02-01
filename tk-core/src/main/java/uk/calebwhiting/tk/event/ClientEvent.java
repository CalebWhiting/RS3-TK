package uk.calebwhiting.tk.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import uk.calebwhiting.tk.inject.ClientContextImpl;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
public class ClientEvent {

    public static final int CLIENT_WINDOW_ADDED = 0;
    public static final int CLIENT_WINDOW_REMOVED = 1;

    private final int id;
    private final ClientContextImpl context;

}
