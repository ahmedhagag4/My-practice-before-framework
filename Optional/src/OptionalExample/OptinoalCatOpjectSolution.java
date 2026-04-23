package OptionalExample;

import java.util.Optional;

public class OptinoalCatOpjectSolution {

    public static void main() {
        //the solution here is to use Optional the name of the class object here and with the method FindThatCat
        Optional<Cat> stella = FindThatCat("stella");

        //===================================================================================================
        //there is the (isPresent and get) way
        if(stella.isPresent()){
            //the get method is getting the value of the object if it exists
            System.out.println(stella.get().getAge());
        }else{
            System.out.println("null");
        }

        //===================================================================================================
        //there is the orElse -> if it has a value it will return it and if not it will return a default value
        Cat MyCat = stella.orElse(new Cat("defaults",0));
        System.out.println(MyCat.getAge());

        //====================================================================================================
        //map is for return the value of the method without crashing the program if it null
        System.out.println(stella.map(Cat::getAge));
        //and we can give if a default value by orElse
        System.out.println(stella.map(Cat::getAge).orElse(0));

    }


    private static Optional<Cat> FindThatCat (String name){
        Cat cat = new Cat(name,3);
//        return Optional.ofNullable(cat);
        return Optional.ofNullable(null);

    }
}
