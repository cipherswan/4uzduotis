@AnnotationClass(
        studentFirstName = "Albert",
        studentLastName = "Smith"
)
public class Student {


    @AnnotationMethod
    void methodOne() {
        if (true)
            throw new RuntimeException("what is happening one");
    }

    @AnnotationMethod(enabled = false)
    void methodTwo() {
        if (false)
            throw new RuntimeException("what is happening two");
    }
}
