package uk.calebwhiting.tk.color;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class ColorMarker {

    private final int offsetX, offsetY, rgb;

}
