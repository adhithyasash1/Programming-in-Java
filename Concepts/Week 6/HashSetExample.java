package openSession;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Sashi");
        set.add("Adhithya");
        set.add("IIT");
        set.add("Madras");
        set.add("Madras");
        System.out.println(set);
    }
}

/*
does not follow any ordering
does not allow duplicates
-> HashSet does not guarantee the order of the elements
 */