package openSession;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "value3");
        map2.put(4, "value4");
        map2.put(5, "value5");
        map2.put(4, "value4 overrode");
        System.out.println(map1);
        System.out.println(map2);

    }
}