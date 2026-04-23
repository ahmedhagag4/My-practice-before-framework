package HowToCreateAnnotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static void main() throws InvocationTargetException, IllegalAccessException {

        //here is a built-in annotation in java
        //it's used for making the complier stop warning you about unused things(like unused object)
        @SuppressWarnings("unused")
        Cat MyCat = new Cat();

        Cat MyCat2 = new Cat("stella");

        //getClass is for getting what in the class, and we used it because the class is the one
        //who has the annotation on it not the object
        //isAnnotationPresent is returning true if the class has the annotation on it
        if (MyCat2.getClass().isAnnotationPresent(VeryImportantClass.class)){
            System.out.println("this class is very important");
        }else{
            System.out.println("this class is not very important");
        }

        //getDeclaredMethods is simply declaring all methods in the class
        //and the for loop is to check each method and see if it has the annotation or not
        for(Method method : MyCat2.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunMethodImmediately.class)){
                //now we need to make an annotation object to use the times method
                //so we can know we need to run the annotation how many times
                //getAnnotation is to know the parameters for this specific annotation's method
                RunMethodImmediately annotation = method.getAnnotation(RunMethodImmediately.class);
                for(int i=0; i<annotation.times(); i++){
                    method.invoke(MyCat2);
                }
            }
        }

        for(Field field : MyCat2.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(ImportantString.class)){

                //the (field.get(MyCat2)) get all the Field type and our annotation is only for Sting
                //so we used the (Object ObjectValue) to later be able to test if it's a String
                Object ObjectValue = field.get(MyCat2);

                //if this object is a Sting but the value in the (StringValue)
                if(ObjectValue instanceof String StringValue){
                    System.out.println(StringValue.toUpperCase());
                }
            }
        }
    }
}
