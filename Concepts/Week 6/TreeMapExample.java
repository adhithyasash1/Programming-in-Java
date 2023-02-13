package openSession;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> map1 = new TreeMap<>();
        map1.put("08RF1203", "XYZ");
        map1.put("08RF1201", "ABC");
        map1.put("08RF1204", "PQR");
        map1.put("08RF1202", "UVW");
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(3, "value3");
        map2.put(5, "value5");
        map2.put(4, "value4");
        map2.put(4, "value4 overrode");
        map2.put(1, "value1");
        map2.put(2, "value2");
        map2.put(6, "value6");
        for (Map.Entry<Integer,String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
//        System.out.println(map1);
//        System.out.println(map2);
//        System.out.println(map2.containsKey(5)); // returns a boolean whether the condition is satisfied
//        System.out.println(map2.containsValue("value3")); // returns a boolean whether the condition is satisfied
//        System.out.println(map2.size());
//        System.out.println(map2.values()); // displays values in the map
//        System.out.println(map2.entrySet()); // displays both key-value pairs
//        System.out.println(map2.keySet()); // displays keys in the map
//        System.out.println(map2.remove(5));
//        System.out.println(map2.get(4)); // gets value at a particular key
        // System.out.println(map2.getOrDefault());
    }
}