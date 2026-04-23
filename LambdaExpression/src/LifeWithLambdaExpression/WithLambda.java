package LifeWithLambdaExpression;

public class WithLambda {
    public static void main(String[] args) {

        //now here after using Lambda we used the method directly without
        //creating new class or making object of it
        //we only calls the method we wanted to use

        //public void print(){
        //        System.out.println("meow");
        //    }

        //but we deleted public void print from it because we don't need it in this Lambda
        //and deleted {} because we uses now one line method
        //if it's multiple line we will use the {}

        printable(
                ()-> System.out.println("meow")
        );

        //here in case the method have parameter or return

        printable2(
                (s)-> {
                    return "meow" + s ;
                }

                //Or we can type also

//                 s -> "meow" + s
        );


    }

    public static void printable(Functional_Interface thing){
        thing.print();
    }

    public static void printable2(Functional_Interface2 thing){
        System.out.println(thing.print(" meow2 "));
    }
}
