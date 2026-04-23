package OptionalExample;

public class OptionalCatObject {
    //let say we are gonna make a method to give here a name of Car as a parameter to fetch an object of that name
    //from the database
    //but here we won't use database, but we will simulate it

    public static void main() {
        Cat stella = FindThatCat("stella"); //now here it may get a null exception if "stella" is not in database

        System.out.println(stella.getAge());
    }


    private static Cat FindThatCat (String name){
        Cat cat = new Cat(name,3); //this two line is simulating database for know
//      return cat;  //this if the database have stella will return the object
        return null;   // this if the database don't have stella so it gonna return null ((and it's the problem))
    }
}




