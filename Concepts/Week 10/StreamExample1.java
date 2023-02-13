package Activity;
import java.util.*;
import java.util.stream.*;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> lap = new ArrayList<String>();
        lap.add("HP Laptop");
        lap.add("Dell Laptop");
        lap.add("Lenevo Laptop");
        lap.add("Lenevo Laptop");
        lap.add("Sony Laptop");
        lap.add("Apple Laptop");
        lap.add("Apple Laptop");
        Stream<String> laptops=lap.stream();
        TreeSet<String> result =
                laptops.collect(Collectors.toCollection(TreeSet::new));
        for(String str:result)
            System.out.println(str);
    }
}