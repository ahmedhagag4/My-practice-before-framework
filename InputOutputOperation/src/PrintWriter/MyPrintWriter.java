package PrintWriter;


import java.io.PrintWriter;

public class MyPrintWriter {
    public static void main(String[] args) throws Exception {

        //PrintWriter is the best way to write to a File
        //because with it you can write any type of value (int,String,boolean)
        PrintWriter printWriter = new PrintWriter("C:\\Users\\Lenovo\\IdeaProjects\\InputOutputOperation\\src\\PrintWriter\\MyPrintWriterFile");

        //PrintWriter has System out way to print such as our normal print
        //so it have print and println and printf
        printWriter.println("bl7");
        printWriter.println(234);
        printWriter.println(true);

        //printf examples
        printWriter.printf("Name: %s \n", "Ali");
        printWriter.printf("Age: %d \n", 20);
        printWriter.printf("Name: %s, Age: %d \n", "Ali", 20);
        printWriter.printf("%.2f \n", 3.14159);
        printWriter.printf("%10d \n", 123); //the length of the integer
        printWriter.printf("Grade: %c \n", 'A');
        printWriter.printf("Is Java fun? %b \n", true);

        printWriter.flush();
        printWriter.close();
    }
}
