package InputOutputStream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample {

    public static void main(String[] args) {

        try {
            String s = "bl7";
            OutputStream output = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\InputOutputStream\\OutputStream\\OutputStreamFile");
            //write method with no parameter will write only one character
            //write method with one parameter (byte array) will print what all in the array
            //we made the String into byte array because the write method won't understand text
            //it's only understand bytes

            byte[] content = s.getBytes();
            output.write(content);

            //here we close the OutputStream
            output.close();
        } catch (Exception e) {
            System.out.println("Exception found");
        }
    }

}
