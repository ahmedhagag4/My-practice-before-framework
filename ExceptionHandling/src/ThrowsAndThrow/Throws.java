package ThrowsAndThrow;

public class Throws {

    //Throws used in the methods itself to throw check exception instead of try and catch

    //throws make program pass the exception but it crashs on run time if you are not handling it with try catch
    //in other wards it makes the checked exception act like unchecked exception

    //✅ Final truth
    //throws ≠ fixing anything
    //throws ≠ changing exception type
    //throws = delaying handling to another method


    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("com.example.NonExistentClass");
        System.out.println("hello world");
    }
}
