package Streams;
import java.util.stream.*;

public class A {
    public static void main(String[] args){
        Integer[] arr={4,2,5,8,3,2,1};
        Stream<Integer> s=Stream.of(arr);
        s.dropWhile(n->(n%2==0)).forEach(System.out::println);
    }
}


