package uk.calebwhiting.tk.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.freedesktop.xcb.XcbImage;
import uk.calebwhiting.tk.api.ClientContext;

@Getter
@RequiredArgsConstructor
public class FrameCaptured {

    private final ClientContext context;

    private final XcbImage image;

}
