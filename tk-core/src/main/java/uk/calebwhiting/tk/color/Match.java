package uk.calebwhiting.tk.color;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Match {

    private final Point point;
    private final Dimension size;
    private final float similarity;

}
