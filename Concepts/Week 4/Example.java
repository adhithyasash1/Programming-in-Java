package grpa1;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        UpdatedStrings str = new UpdatedStrings();
        System.out.println("Reverse of "+ s + " is "+ str.reverse(s));
        System.out.println("Vowel count of "+ s + " is "+ str.vowelCount(s));
    }
}
