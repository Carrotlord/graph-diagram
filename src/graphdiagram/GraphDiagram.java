package graphdiagram;

import tests.SaveImageTests;

/**
 * A utility that generates diagrams of graphs. Output is saved to image files.
 * @author Oliver Chu
 */
public class GraphDiagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaveImageTests.saveBlank();
        SaveImageTests.saveWhiteBackground();
        SaveImageTests.saveArrows();
        SaveImageTests.saveText();
        SaveImageTests.saveCropped();
        SaveImageTests.saveRotatedArrows();
        System.out.println("Tests completed.");
    }
    
}
