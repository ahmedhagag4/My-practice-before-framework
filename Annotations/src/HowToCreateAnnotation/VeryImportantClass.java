package HowToCreateAnnotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Target annotation is for making your custom annotation to be specific for classes or method or variables
//and .TYPE means the annotation is for classes
@Target(ElementType.TYPE)
//Retention is used for making your custom annotation to be around through the actional running of your program
//so the code can look at it and use it while program running
//and most of the time you just use .RUNTIME
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportantClass {

}
