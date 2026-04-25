package InputOutputStream.InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {

    public static void main(String[] args){
        try {
            //InputStream is an abstract class so to use it you need there subclasses like FileInputStream

            InputStream input = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\InputOutputStream\\InputStream\\InputStreamFile");

            //the read method with no parameter return the ASCII value of the first character
            //the read method with one parameter return the number of bytes in the file and
            //save every byte ASCII value in the byte array

            byte[] content = new byte[100];
            int count = input.read(content);
            System.out.println(count);
            //here we're converting the bytes ASCII value to String by the new String
            //and made him only print from 0 to count
            System.out.println(new String(content,0,count));

            //we can print again because the content of the file is already saved in variable
            System.out.println(new String(content,0,count));


            //this loop here is to mention important concept in read method
            //read method when it read a char or byte (those char or byte) can't be readable again
            //that is why the next loop can't print anything
            int theCharNum = input.read();
            while(theCharNum != -1) {
                char theChar = (char) theCharNum;

                System.out.print(theChar);

                theCharNum = input.read();
            }


            //close the inputStream after finish it
            input.close();
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }

}
