package Activity;
import java.util.*;

public class ArrayListEx{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("IIT");
        list1.add("Madras");
        list1.add("Java");
        list1.add("Programming");
        ArrayList<String> list2;
        list2 = new ArrayList<String>();
        // or list2 = new<String> ArrayList();
        list2.addAll(list1);
        // or list2 = new ArrayList<String>(list1);
        System.out.println(list2);
    }
}
