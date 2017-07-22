package tests;

import graphdiagram.Arrow;
import graphdiagram.CreateImage;
import graphdiagram.DiagramImage;
import graphdiagram.Direction;
import graphdiagram.RotatedArrow;
import graphdiagram.SaveImage;
import graphdiagram.Text;
import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author Oliver Chu
 */
public class SaveImageTests {
    public static void saveBlank() {
        BufferedImage image = CreateImage.create(800, 600);
        SaveImage.save(image, "blank.png");
    }
    
    public static void saveWhiteBackground() {
        DiagramImage image = new DiagramImage(800, 600);
        image.fillBackground(Color.WHITE);
        image.save("white_bg.png");
    }
    
    public static void saveArrows() {
        DiagramImage image = new DiagramImage(800, 600);
        image.fillBackground(Color.WHITE);
        image.drawEntity(new Arrow());
        image.drawEntity(new Arrow(50, 200, 100, 12, Direction.NORTH));
        image.drawEntity(new Arrow(50, 250, 100, 12, Direction.SOUTH));
        image.drawEntity(new Arrow(150, 400, 100, 12, Direction.WEST));
        image.save("arrows.png");
    }
    
    public static void saveText() {
        DiagramImage image = new DiagramImage(400, 300);
        image.fillBackground(Color.WHITE);
        image.drawEntity(new Text("Hello, world!", 50, 50));
        image.save("text.png");
    }
    
    public static void saveCropped() {
        DiagramImage image = new DiagramImage(100, 600);
        image.fillBackground(Color.WHITE);
        image.drawEntity(new Arrow());
        image.drawEntity(new Arrow(50, 200, 100, 12, Direction.NORTH));
        image.drawEntity(new Arrow(50, 250, 100, 12, Direction.SOUTH));
        image.drawEntity(new Arrow(150, 400, 100, 12, Direction.WEST));
        image.save("arrows_cropped.png");
    }
    
    public static void saveRotatedArrows() {
        DiagramImage image = new DiagramImage(800, 800);
        image.fillBackground(Color.WHITE);
        image.drawEntity(new RotatedArrow());
        image.drawEntity(new RotatedArrow(300, 150, 100, 17, 30));
        image.drawEntity(new RotatedArrow(450, 150, 100, 17, 45));
        image.drawEntity(new RotatedArrow(600, 150, 100, 17, 60));
        image.drawEntity(new RotatedArrow(150, 300, 100, 17, 90));
        image.drawEntity(new RotatedArrow(300, 300, 100, 17, 120));
        image.drawEntity(new RotatedArrow(450, 300, 100, 17, 135));
        image.drawEntity(new RotatedArrow(600, 300, 100, 17, 150));
        image.drawEntity(new RotatedArrow(150, 450, 100, 17, 180));
        image.drawEntity(new RotatedArrow(300, 450, 100, 17, 210));
        image.drawEntity(new RotatedArrow(450, 450, 100, 17, 225));
        image.drawEntity(new RotatedArrow(600, 450, 100, 17, 240));
        image.drawEntity(new RotatedArrow(150, 600, 100, 17, 270));
        image.drawEntity(new RotatedArrow(300, 600, 100, 17, 300));
        image.drawEntity(new RotatedArrow(450, 600, 100, 17, 315));
        image.drawEntity(new RotatedArrow(600, 600, 100, 17, 330));
        image.save("arrows_rotated.png");
    }
}
