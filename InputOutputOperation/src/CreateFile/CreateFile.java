package CreateFile;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static void main() throws IOException {
        File file = new File("MyFile.txt"); //only representing the File

        file.createNewFile(); //creating the file

    }
}
