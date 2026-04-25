package ReaderWriter;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class Mywriter {

    public static void main(String[] args) {

        try {
            String s = "bl7";
            Writer writer = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\InputOutputStream\\OutputStream\\OutputStreamFile");


            //the only difference from InputStream that Writer read with char but InputStream read with bytes
            char[] content = s.toCharArray();
            writer.write(content);

            writer.close();
        } catch (Exception e) {
            System.out.println("Exception found");
        }
    }
}
