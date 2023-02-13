package openSession;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> s = new LinkedHashSet<>();
        s.add("Sashi");
        s.add("Adhithya");
        s.add("IIT");
        s.add("Madras");
        System.out.println(s.toString());
        System.out.println(s);
    }
}

/*
-> LinkedHashSet
no duplicates
no indexing followed
but maintains order
 */

