package CreateException;

//i used throw because it's the only methods allow you to create any exception
//and i mean creat already exits exception or you own exception

public class CreateException {
    public static void main() throws MyException {
        throw new MyException("hello world",new ClassNotFoundException());
    }
}

//now this exception is a ClassNotFoundException and print hello world