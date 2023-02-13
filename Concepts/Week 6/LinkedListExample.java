package openSession;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
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

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Bharat"); // adding single element
        list2.addAll(list); // use addAll() to pass in a collection
        System.out.println(list2);
    }
}

/*
ArrayList uses internally an Array to organize the elements
LinkedList uses internally a Doubly Linked List to organize the elements
 */