package Throwable.Exception.CheckedExamples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExamples {
    public static void main(String[] args){
        //==============================================================================================
        //ClassNotFoundException
        try {
            Class.forName("com.example.NonExistentClass");
        }catch (ClassNotFoundException e){
            System.out.println("class not found");
        }
        //==============================================================================================
        //InterruptedException
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
        //==============================================================================================
        //IOException
        try {
            FileReader reader = new FileReader("filename");
        }catch (IOException e){
            System.out.println("InterruptedException");
        }
        //==============================================================================================

    }
}
