package uk.calebwhiting.tk.color;

import lombok.Setter;

import java.awt.*;

public class DistributedColorTemplate implements Template {

    private final Dimension size;
    private final ColorMarker[] markers;

    /* this can be used to make matching faster by aborting a comparison if the similarity is too low. */
    @Setter
    private float minimumMatch = 0f;

    public DistributedColorTemplate(ColorMarker... markers) {
        if (markers.length == 0) {
            throw new IllegalArgumentException();
        }
        this.markers = markers;
        int maxX = 0, maxY = 0;
        for (ColorMarker marker : this.markers) {
            if (marker.getOffsetX() < 0 || marker.getOffsetY() < 0)
                throw new IllegalArgumentException();
            maxX = Math.max(maxX, marker.getOffsetX());
            maxY = Math.max(maxY, marker.getOffsetY());
        }
        this.size = new Dimension(maxX, maxY);
    }

    public DistributedColorTemplate(float minimumMatch, ColorMarker... markers) {
        this(markers);
        this.minimumMatch = minimumMatch;
    }

    @Override
    public Dimension size() {
        return this.size;
    }

    @Override
    public float compare(Sample sample) {
        float sum = 0f;
        for (ColorMarker marker : this.markers) {
            float similarity = sample.compare(marker.getOffsetX(), marker.getOffsetY(), marker.getRgb());
            if (similarity < this.minimumMatch) {
                return similarity;
            }
            sum += similarity;
        }
        return sum / (float) this.markers.length;
    }

}
