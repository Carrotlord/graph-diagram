package graphdiagram;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Oliver Chu
 */
public class DiagramImage {
    private BufferedImage internalImage;
    
    public DiagramImage(int width, int height) {
        this(CreateImage.create(width, height));
    }
    
    public DiagramImage(BufferedImage image) {
        internalImage = image;
    }
    
    public void fillBackground(Color color) {
        Graphics2D paintbrush = internalImage.createGraphics();
        paintbrush.setColor(color);
        paintbrush.fillRect(0, 0, internalImage.getWidth(),
                                  internalImage.getHeight());
    }
    
    public void save(String filePath) {
        SaveImage.save(internalImage, filePath);
    }
    
    public void drawEntity(Entity entity) {
        entity.apply(internalImage);
    }
}
