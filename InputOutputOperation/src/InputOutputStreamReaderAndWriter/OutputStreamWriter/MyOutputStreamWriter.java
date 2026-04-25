package InputOutputStreamReaderAndWriter.OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MyOutputStreamWriter {
    public static void main(String[] args) throws Exception {

        String s = "bl7";
        OutputStream outputStream = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\InputOutputStreamReaderAndWriter\\StreamReaderWriterFile");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        char[] content = s.toCharArray();
        outputStreamWriter.write(content);

        outputStreamWriter.close();
    }
}
