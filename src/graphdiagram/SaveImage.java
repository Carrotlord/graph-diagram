package graphdiagram;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Oliver Chu
 */
public class SaveImage {
    /**
     * Saves an image to a file.
     * @param image
     * @param filePath
     * @return true if successful
     */
    public static boolean save(BufferedImage image, String filePath) {
        try {
            ImageIO.write(image, "png", new File(filePath));
            return true;
        } catch (IOException ex) {
            System.err.println("Could not save image to " + filePath);
            return false;
        }
    }
}
