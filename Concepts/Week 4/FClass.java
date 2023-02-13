package grpa2;
import java.util.*;


public class FClass {
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5);
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            sObj.addTo(sc.nextInt());
        }
        Iterator i = sObj.get_Iterator();
        while(i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}

