import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person<String, String> professorJonas = new Person("Jonas", "Jonaitis");

        Person<String, String> p1 = new Person("Petras", "Petraitis");
        Person<String, String> p2 = new Person("Antanas", "Jonaitis");
        Person<String, String> studentJuozas = new Person("Juozas", "Juozaitis");

        
        Professor[] professors = new Professor[2];
        Professor professorGediminas = new Professor("Gediminas", "Gediminaitis", 50);
        Professor professorAlgirdas = new Professor("Žygimantas", "Augustas", 35);
        professors[0] = professorGediminas;
        professors[1] = professorAlgirdas;
        Arrays.sort(professors);

        System.out.println("Comparable.compareTo sort by age ASC: ");
        for (Professor temp: professors) {
            System.out.println(temp.getFirstName() + " " + temp.getLastName() + " " + temp.getAge());
        }

        System.out.println("");
        System.out.println("Comparator sort by first name: ");
        Arrays.sort(professors, Professor.ProfessorNameComparator);
        for (Professor temp: professors) {
            System.out.println(temp.getFirstName() + " " + temp.getLastName() + " " + temp.getAge());
        }

        System.out.println("");
        System.out.println("Comparator sort by last name: ");
        Arrays.sort(professors, Professor.ProfessorLastNameComparator);
        for (Professor temp: professors) {
            System.out.println(temp.getFirstName() + " " + temp.getLastName() + " " + temp.getAge());
        }

        System.out.println("");




        Grade<Integer> g1 = new Grade(10);
        Grade<Integer> g2 = new Grade(10);


        boolean same = Person.compare(p1, p2);
        boolean sameGrades = Grade.compareGrades(g1, g2);

        System.out.println("Tikrinami " + p1 + p2 + ": " + same);
        System.out.println("Are lygūs pažymiai " + g1 + ", " + g2 + ": " + sameGrades);

        //System.out.println(professorJonas);
       // System.out.println(p1);
       // System.out.println(p2);
       // System.out.println(studentJuozas);


        List<String> studentList = Arrays.asList("Jonas", "Petras", "Antanas");
        List<Integer> gradeList = Arrays.asList(10, 9, 9, 8, 6, 7, 7, 10, 10);
        List<Double> gradeListDouble = Arrays.asList(9.5, 8.5, 7.5, 4.5);
        List<Professor> professorList = new ArrayList();
        Grade.insertProfessors(professorList);


        Grade.printStudents(studentList);
        System.out.println("Pažymių sąrašas: ");
        Grade.printGrades(gradeList);
        System.out.println("Pažymių sąrašas (double): ");
        Grade.printGrades(gradeListDouble);


        System.out.println(" ");
        System.out.println("Testing annotations.");

        Class<Student> studentObj = Student.class;

        if (studentObj.isAnnotationPresent(AnnotationClass.class)) {

            Annotation annotation = studentObj.getAnnotation(AnnotationClass.class);
            AnnotationClass annotationClass = (AnnotationClass) annotation;

            System.out.println("Student name: " + annotationClass.studentFirstName() + " "
                                                + annotationClass.studentLastName());
        }
    }
}
