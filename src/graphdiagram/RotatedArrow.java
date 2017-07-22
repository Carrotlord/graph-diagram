package graphdiagram;

import java.awt.image.BufferedImage;

/**
 *
 * @author Oliver Chu
 */
public class RotatedArrow implements Entity {
    private final RotatedLine body;
    private final RotatedLine rightHead;
    private final RotatedLine leftHead;
    
    public RotatedArrow() {
        this(150, 150, 100, 17, 0);
    }
    
    public RotatedArrow(int x, int y, int length, int headLength,
                        double degrees) {
        body = new RotatedLine(x, y, length, degrees);
        rightHead = new RotatedLine(x, y, headLength, degrees - 45.0);
        leftHead = new RotatedLine(x, y, headLength, degrees + 45.0);
    }

    @Override
    public void apply(BufferedImage image) {
        body.apply(image);
        rightHead.apply(image);
        leftHead.apply(image);
    }
    
}
