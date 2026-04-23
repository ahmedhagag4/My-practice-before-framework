package LifeWithoutLambdaExpression;

public class WithoutLambda {

    //now here for using the only method in the FunctionInterface we needed
    //to create a class and inherit the interface class and making object and (only then)
    //we can use the method with this object

    public static void main(String[] args) {
        Cat cat = new Cat();
        printable(cat);
    }


    public static void printable(Functional_Interface thing){
        thing.print();
    }
}
