package openSession;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(3, "value3");
        map2.put(4, "value4");
        map2.put(5, "value5");
        map2.put(4, "value4 overrode");
        System.out.println(map1);
        System.out.println(map2);

    }
}
