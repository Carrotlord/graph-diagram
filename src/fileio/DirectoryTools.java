package fileio;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Oliver Chu
 */
public class DirectoryTools {
    public static String getCurrentDirectory() {
        return System.getProperty("user.dir");
    }
    
    public static String[] listFilepaths(String path) {
        File[] files = (new File(path)).listFiles();
        ArrayList<String> filenames = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                filenames.add(file.getPath());
            }
        }
        String[] filenamesArray = new String[filenames.size()];
        filenames.toArray(filenamesArray);
        return filenamesArray;
    }
}
