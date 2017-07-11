package graphdiagram;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * A directed edge that can be drawn to an image.
 * @author Oliver Chu
 */
public class Arrow implements Entity {
    private int x;
    private int y;
    private int length;
    private int headSize;
    private Direction direction;
    
    public Arrow() {
        this(50, 50, 100, 12, Direction.EAST);
    }
    
    public Arrow(int x, int y, int length, int headSize, Direction direction) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.headSize = headSize;
        this.direction = direction;
    }

    @Override
    public void apply(BufferedImage image) {
        Graphics2D paintbrush = image.createGraphics();
        paintbrush.setColor(Color.BLACK);
        paintbrush.setStroke(
            new BasicStroke(2.0f, BasicStroke.CAP_ROUND,
                            BasicStroke.JOIN_ROUND)
        );
        switch (direction) {
            case NORTH:
                paintbrush.drawLine(x, y, x, y - length);
                paintbrush.drawLine(x, y - length,
                                    x - headSize, y - length + headSize);
                paintbrush.drawLine(x, y - length,
                                    x + headSize, y - length + headSize);
                break;
            case SOUTH:
                paintbrush.drawLine(x, y, x, y + length);
                paintbrush.drawLine(x, y + length,
                                    x - headSize, y + length - headSize);
                paintbrush.drawLine(x, y + length,
                                    x + headSize, y + length - headSize);
                break;
            case EAST:
                paintbrush.drawLine(x, y, x + length, y);
                paintbrush.drawLine(x + length, y,
                                    x + length - headSize, y - headSize);
                paintbrush.drawLine(x + length, y,
                                    x + length - headSize, y + headSize);
                break;
            case WEST:
                paintbrush.drawLine(x, y, x - length, y);
                paintbrush.drawLine(x - length, y,
                                    x - length + headSize, y - headSize);
                paintbrush.drawLine(x - length, y,
                                    x - length + headSize, y + headSize);
                break;
            default:
                break;
        }
    }
    
}
