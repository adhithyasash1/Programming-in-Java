package openSession;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>();
        s.add("Sashi");
        s.add("Adhithya");
        s.add("IIT");
        s.add("Madras");
        System.out.println(s.toString());
        System.out.println(s);
    }
}

/*
-> TreeSet
sorts the elements internally,
displays them in sorted order,
does not allow duplicates,
does not allow null values
 */