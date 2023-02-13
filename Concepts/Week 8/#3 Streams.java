import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Example02 {

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        Stream<String> arrListStream = arrList.stream();  //sized, ordered

        List<String> linkedList = new LinkedList<>();
        Stream<String> linkedListStream = linkedList.stream();  //sized, ordered

        Set<String> hashSet = new HashSet<>();
        Stream<String> hashSetStream = hashSet.stream();  //sized, distinct

        Set<String> linkedHashSet = new LinkedHashSet<>();
        Stream<String> linkedHashSetStream = linkedHashSet.stream();  //sized, distinct, ordered

        Set<String> treeSet = new TreeSet<>();
        Stream<String> treeSetStream = treeSet.stream();  //sized, distinct, sorted, ordered
    }
}


public class Example03 {

    public static void main(String[] args) {

        int number = Stream.iterate(1, n -> n * 2)
                        .filter(n -> n % 1024 == 0)
                        .findFirst().get();
    }
}


public class Example04 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        int easySum = IntStream.range(0, 100)
                .sum();

        System.out.println("Sum with for-loop:" + sum);
        System.out.println("Sum with int stream:" + easySum);
    }
}