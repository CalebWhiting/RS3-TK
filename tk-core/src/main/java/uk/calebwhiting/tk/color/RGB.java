package uk.calebwhiting.tk.color;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RGB {

    /**
     * @see java.awt.Color#getRed()
     */
    public static int getRed(int rgb) {
        return rgb >> 16 & 0xFF;
    }

    /**
     * @see java.awt.Color#getGreen()
     */
    public static int getGreen(int rgb) {
        return rgb >> 8 & 0xFF;
    }

    /**
     * @see java.awt.Color#getBlue()
     */
    public static int getBlue(int rgb) {
        return rgb & 0xFF;
    }

    /**
     * @see java.awt.Color#getAlpha()
     */
    public static int getAlpha(int rgba) {
        return (rgba >> 24) & 0xff;
    }

    /**
     * @see java.awt.Color#Color(int, int, int, int)
     */
    public static int getRGBA(int r, int g, int b, int a) {
        return (a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF);
    }

    public static int getRGB(int r, int g, int b) {
        return getRGBA(r, g, b, 255);
    }

    public static int fullColor(int rgba) {
        int r = getRed(rgba);
        int g = getGreen(rgba);
        int b = getBlue(rgba);
        return getRGBA(r, g, b, 255);
    }

}
