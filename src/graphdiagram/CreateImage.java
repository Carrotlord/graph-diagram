package graphdiagram;

import java.awt.image.BufferedImage;

/**
 *
 * @author Oliver Chu
 */
public class CreateImage {
    public static BufferedImage create(int width, int height) {
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }
}
