package InputOutputStreamReaderAndWriter.InputStreamReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyInputStreamReader {
    public static void main(String[] args) throws Exception {

        //InputStreamReader is converting from bytes to char

        //here we created InputStream (bytes) and we converted it by InputStreamReader to char

        InputStream inputStream = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\InputOutputStreamReaderAndWriter\\StreamReaderWriterFile");
        Reader inputStreamReader = new InputStreamReader(inputStream);

        int data = inputStreamReader.read();
        while(data != -1){
            char theChar = (char) data;
            System.out.print(theChar);
            data = inputStreamReader.read();
        }

        inputStreamReader.close();
    }
}
