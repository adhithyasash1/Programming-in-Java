package openSession;
import java.util.stream.*;
import java.util.*;

/*

public class streamMain {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.stream().filter(i -> i%2 == 0).forEach(System.out::println);
        l.stream().filter(i -> i%2 == 0).map((i) -> i+2).forEach((i) -> System.out.println(i));
        long c = l.stream().filter(i -> i%2 != 0).map((i) -> i+2).count();
        System.out.println(c);
    }
}


convert any collection to a stream, (flow of data)

and you can use filter function that takes some predicate (condition)
only elements that satisfy this predicate can pass thru this stream

apply another function forEach, takes some method and applies that to each
element of that stream

in stream there are lots of methods, we can also create our own stream
like a stream of doubles
 */

public class streamMain {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(2).forEach(System.out::println);
        Stream.generate(() -> "hello").limit(3).forEach(System.out::println);
        Stream<Integer> s = Stream.iterate(1, i -> i <= 10, i -> i+1);
        s.forEach(System.out::println);
    }
}

