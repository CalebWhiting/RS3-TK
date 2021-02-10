package uk.calebwhiting.tk.color;

public interface Sample {

    int getRGB(int x, int y);

    /**
     * @see java.awt.Color#getRed()
     */
    default int getRed(int x, int y) {
        return RGB.getRed(getRGB(x, y));
    }

    /**
     * @see java.awt.Color#getGreen()
     */
    default int getGreen(int x, int y) {
        return RGB.getGreen(getRGB(x, y));
    }

    /**
     * @see java.awt.Color#getBlue()
     */
    default int getBlue(int x, int y) {
        return RGB.getBlue(getRGB(x, y));
    }


    default float compare(int x, int y, int rgba) {
        int alpha = RGB.getAlpha(rgba);
        // if (alpha == 0) return 1f;
        float sum = 0;
        int color = getRGB(x, y);
        for (int channel = 0; channel < 3; channel++) {
            int v0, v1;
            switch (channel) {
                case 0:
                    v0 = RGB.getRed(color);
                    v1 = RGB.getRed(rgba);
                    break;
                case 1:
                    v0 = RGB.getGreen(color);
                    v1 = RGB.getGreen(rgba);
                    break;
                case 2:
                    v0 = RGB.getBlue(color);
                    v1 = RGB.getBlue(rgba);
                    break;
                default:
                    throw new RuntimeException();
            }
            float similarity = Math.abs(v0 - v1) / 255f;
            sum += similarity;
        }
        return 1.0F - (sum / 3f);
    }

}
