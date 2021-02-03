package uk.calebwhiting.tk.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.opencv.core.Mat;
import uk.calebwhiting.tk.inject.ClientContextImpl;

@Getter
@RequiredArgsConstructor
public class FrameCaptured {

    private final ClientContextImpl context;

    private final Mat frame;
    private final Mat osd;

}
