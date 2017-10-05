import java.util.List;

public class Grade<K> {
    private final K key;

    public Grade(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key + " ";
    }

    public static <K> boolean compareGrades(Grade<K> g1, Grade<K> g2) {
        return g1.getKey().equals(g2.getKey());

    }

    public static void printGrades(List<?> list)
    {
        for (Object element: list) {
            System.out.print(" " + element + " ");
        }
        System.out.println();
    }
}


