import lombok.Data;

import java.util.List;

public @Data
class Person<K, V> {
    private final K key;
    private final V value;

    public Person(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    public String toString() {
        return key + " " + value + " ";
    }

    public static <K, V> boolean compare(Person<K, V> p1, Person<K, V> p2) {
        return p1.getValue().equals(p2.getValue());

    }


}
