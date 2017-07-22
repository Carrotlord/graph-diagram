package graphdiagram;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Oliver Chu
 */
public class RotatedLine implements Entity {
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;
    
    public RotatedLine(int x, int y, int length, double degrees) {
        x0 = x;
        y0 = y;
        double radians = Trig.toRadians(degrees);
        int opposite = (int) (length * Math.sin(radians));
        int adjacent = (int) (length * Math.cos(radians));
        x1 = x + adjacent;
        y1 = y - opposite;
    }

    @Override
    public void apply(BufferedImage image) {
        Graphics2D paintbrush = image.createGraphics();
        paintbrush.setColor(Color.BLACK);
        paintbrush.setStroke(
            new BasicStroke(2.0f, BasicStroke.CAP_ROUND,
                            BasicStroke.JOIN_ROUND)
        );
        paintbrush.drawLine(x0, y0, x1, y1);
    }
    
}
