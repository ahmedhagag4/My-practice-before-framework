package ReaderWriter;

import java.io.FileReader;
import java.io.Reader;

public class MyReader {
    static void main() throws Exception {

        //the only difference between it and InputStream is reader work with char and InputStream work with bytes

        //also you need to know that FileReader can create files
        Reader reader = new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\ReaderWriter\\ReaderWriter");

        int theCharNum = reader.read();
        while(theCharNum != -1) {
            char theChar = (char) theCharNum;

            System.out.print(theChar);

            theCharNum = reader.read();
        }

        Reader reader2 = new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\ReaderWriter\\ReaderWriter");


        char[] theChars = new char[128];

        int charsRead = reader2.read(theChars, 0, theChars.length);
        while(charsRead != -1) {
            System.out.println(new String(theChars, 0, charsRead));
            charsRead = reader2.read(theChars, 0, theChars.length);
        }
    }
}
