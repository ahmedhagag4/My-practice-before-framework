package HowToCreateAnnotation;

@VeryImportantClass
public class Cat {

    int age;

    @ImportantString
    String name;

    public Cat(){}

    public Cat(String name){this.name = name;}

    @RunMethodImmediately(times = 3)
    public void meow(){
        System.out.println("meow");
    }

    public void eat(){
        System.out.println("munch");
    }

}
