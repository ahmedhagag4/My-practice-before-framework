package BufferedReaderWriter.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MyBufferedWriter {
    public static void main(String[] args) throws Exception {

        //there important thing here
        //BufferedWriter Write the text in the buffer first and to write in the file you need flush
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("BufferWriterFile.txt"));
        bufferedWriter.write("bl7");

        //what flush do is to say to the program to write what in the buffer (now)
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
