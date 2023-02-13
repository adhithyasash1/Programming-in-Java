package Activity;
import java.util.*;

class ExampleCodeClass{
    Optional<Integer> op;

    ExampleCodeClass(Optional<Integer> op){
        this.op=op;
    }
    void show(){
        System.out.println(op.get());
    }
}
public class Test{
    public static void main(String[] args){
        Optional<Integer> op=Optional.ofNullable(null);
        new ExampleCodeClass(op).show();
    }
}
