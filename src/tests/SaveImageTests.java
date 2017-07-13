package tests;

import graphdiagram.Arrow;
import graphdiagram.CreateImage;
import graphdiagram.DiagramImage;
import graphdiagram.Direction;
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
}
