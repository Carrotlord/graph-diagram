package graphdiagram;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Oliver Chu
 */
public class Text implements Entity {
    private final String content;
    private final int x;
    private final int y;
    
    public Text(String text, int x, int y) {
        content = text;
        this.x = x;
        this.y = y;
    }

    @Override
    public void apply(BufferedImage image) {
        Graphics2D paintbrush = image.createGraphics();
        paintbrush.setFont(new Font("Arial", Font.PLAIN, 14));
        paintbrush.setColor(Color.BLACK);
        paintbrush.drawString(content, x, y);
    }
    
}
