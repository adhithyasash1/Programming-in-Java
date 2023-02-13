package openSession;
import java.util.*;

public class listIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("India");
        list.add("Madras");
        list.add("Bombay");
        list.add("Kanpur");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // to traverse in both directions thru a list, we use listIterator
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
