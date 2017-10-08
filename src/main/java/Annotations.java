import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationClass {
    String studentFirstName();
    String studentLastName();
    int studentAge() default 21;

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationMethod {
    public boolean enabled() default true;
}
