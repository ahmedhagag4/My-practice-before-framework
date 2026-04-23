package HowToCreateAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunMethodImmediately {
    //now if we want to make this annotation to take a parameter like int
    //we need to declare it as a method
    int times() default 1;
    //after using default now this not necessary to give the annotation a parameter
}
