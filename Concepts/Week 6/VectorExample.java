package openSession;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();
        list.add("India");
        list.add("Madras");
        list.add("Bombay");
        list.add("Kanpur");
        System.out.println(list.contains("India"));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.add(2, "India"); // this line, pushes Bombay to position 3 and Kanpur to position 4
        list.set(3, "Kharaghpur");  // this line, updates value at position 3 to be Kharaghpur
        System.out.println(list);
        System.out.println(list.remove("Kharaghpur"));
        System.out.println(list);

        Vector<String> list2 = new Vector<String>();
        list2.add("Bharat"); // adding single element
        list2.addAll(list); // use addAll() to pass in a collection
        System.out.println(list2);
    }
}
