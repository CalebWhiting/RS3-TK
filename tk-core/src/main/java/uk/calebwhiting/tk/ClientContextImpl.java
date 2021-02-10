package uk.calebwhiting.tk;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.freedesktop.xcb.XID;
import uk.calebwhiting.tk.api.ClientContext;

import java.util.Map;

@Getter
@EqualsAndHashCode(of = "xid")
@RequiredArgsConstructor
public class ClientContextImpl implements ClientContext {

    private final XID xid;
    private final Map<Object, Object> vars;

    @Override
    public long getId() {
        return this.xid.getId();
    }


}
