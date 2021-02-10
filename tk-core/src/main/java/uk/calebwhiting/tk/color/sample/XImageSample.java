package uk.calebwhiting.tk.color.sample;

import org.freedesktop.xcb.XcbImage;
import uk.calebwhiting.tk.color.Sample;

public class XImageSample implements Sample {

    private final XcbImage image;

    public int posX, posY;

    public XImageSample(XcbImage image, int x, int y) {
        this.image = image;
        this.posX = x;
        this.posY = y;
    }

    @Override
    public int getRGB(int x, int y) {
        return (int) image.getPixel(posX + x, posY + y);
    }

}
