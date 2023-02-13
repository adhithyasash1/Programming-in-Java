package Streams;
import java.util.*;

public class E{
    public static void main(String[] args){
        var num=new ArrayList<Integer>();
        for(int i=5;i>2;i--){
            num.add(i);
        }
        num.stream().map(n->n*n).forEach(System.out::println);
    }
}