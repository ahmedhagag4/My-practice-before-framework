package CreateException;

//after i extends Exception now MyException act like Exception (checked exception)

public class MyException extends Exception{
    public MyException(String massage){
        super(massage);
    }
    public MyException(String massage,Exception cuse){
        //Exception have all checked and unchecked so we can use it here as data type
        super(massage,cuse);
    }
}

