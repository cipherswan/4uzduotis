public class Main {
    public static void main(String[] args) {

        Person<String, String> professorJonas = new Person("Jonas", "Jonaitis");

        Person<String, String> p1 = new Person("Petras", "Petraitis");
        Person<String, String> p2 = new Person("Antanas", "Jonaitis");
        Person<String, String> studentJuozas = new Person("Juozas", "Juozaitis");

       // Person<String, Integer> p1 = new Person("Petras", 10);
       // Person<String, Integer> p2 = new Person("Antanas", 8);
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



    }
}
