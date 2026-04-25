package BufferedReaderWriter.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class MyBufferedReader {
    public static void main(String[] args) throws Exception {

        //BufferedReader reads character such as Reader but BufferReader is faster than Reader
        //and have extra method (readLine())

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\BufferedReaderWriter\\MyBufferedFile"));

        //readLine() method return a (String) not int like read() method
        //also when the file ends it return null not -1
        String line = bufferedReader.readLine();
        while(line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }
}
