package fileio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Oliver Chu
 */
public class FileTools {
    public static String fileToString(String filename) {
        Path path = (new File(filename)).toPath();
        String contents;
        try {
            contents = new String(Files.readAllBytes(path));
        } catch (IOException ex) {
            return null;
        }
        return contents;
    }
}
