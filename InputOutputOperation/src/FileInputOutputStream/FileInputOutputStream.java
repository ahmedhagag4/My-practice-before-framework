package FileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputOutputStream {
    static void main() throws FileNotFoundException {
        //also important thing to know that FileInputStream can create files
        FileInputStream input = new FileInputStream("CanCreateFile.txt");

        //letterly as same as InputStream but InputStream is better
        //because using abstracts always better and InputStream is an abstract
    }
}
