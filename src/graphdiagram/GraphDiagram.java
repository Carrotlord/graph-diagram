package graphdiagram;

import fileio.DirectoryTools;
import fileio.FileTools;
import java.util.Arrays;
import tests.GraphTests;
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
        /*
        SaveImageTests.saveBlank();
        SaveImageTests.saveWhiteBackground();
        SaveImageTests.saveArrows();
        SaveImageTests.saveText();
        SaveImageTests.saveCropped();
        SaveImageTests.saveRotatedArrows();
        */
        
        /*
        GraphTests.orderedDirectedGraphTest();
        System.out.println("Tests completed.");
        */
        
        String currentDir = DirectoryTools.getCurrentDirectory();
        System.out.println(
            Arrays.toString(DirectoryTools.listFilepaths(currentDir))
        );
        System.out.println(FileTools.fileToString("test.txt"));
    }
    
}
