package uk.calebwhiting.tk.color;

import org.freedesktop.xcb.XcbImage;
import uk.calebwhiting.tk.color.sample.XImageSample;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public interface Template {

    Dimension size();

    default double width() {
        return size().width;
    }

    default double height() {
        return size().height;
    }

    float compare(Sample sample);

    default Match[] query(XcbImage image) {
        return query(image, 1.0f);
    }

    default Match[] query(XcbImage image, float threshold) {
        int xw = image.getWidth();
        int xh = image.getHeight();
        List<Match> matches = new LinkedList<>();
        XImageSample sample = new XImageSample(image, 0, 0);
        for (int x = 0; x < xw - width(); x++) {
            for (int y = 0; y < xh - height(); y++) {
                sample.posX = x;
                sample.posY = y;
                float similarity = this.compare(sample);
                if (similarity >= threshold) {
                    matches.add(new Match(new Point(x, y), size(), similarity));
                }
            }
        }
        return matches.toArray(new Match[0]);
    }

}
