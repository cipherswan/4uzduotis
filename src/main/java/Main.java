import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person<String, String> professorJonas = new Person("Jonas", "Jonaitis");

        Person<String, String> p1 = new Person("Petras", "Petraitis");
        Person<String, String> p2 = new Person("Antanas", "Jonaitis");
        Person<String, String> studentJuozas = new Person("Juozas", "Juozaitis");


        Grade<Integer> g1 = new Grade(10);
        Grade<Integer> g2 = new Grade(10);


        boolean same = Person.compare(p1, p2);
        boolean sameGrades = Grade.compareGrades(g1, g2);
        System.out.println("Tikrinami " + p1 + p2 + ": " + same);
        System.out.println("Are lygūs pažymiai " + g1 + ", " + g2 + ": " + sameGrades);
        System.out.println(professorJonas);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(studentJuozas);

        List<Integer> gradeList = Arrays.asList(10, 9, 9, 8, 6, 7, 7, 10, 10);
        List<String> gradeListAlt = Arrays.asList("A", "A+", "B", "D", "C-", "D+", "A+");

        Grade.printGrades(gradeList);
        Grade.printGrades(gradeListAlt);



    }
}
