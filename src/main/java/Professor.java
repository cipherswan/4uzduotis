import java.util.List;

public class Professor implements  Comparable<Professor> {
    private String firstName;
    private String lastName;
    private int age;

    public Professor(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Professor compareProfessor) {
        int compareAge = ((Professor) compareProfessor).getAge();

        return this.age - compareAge;
    }
}
