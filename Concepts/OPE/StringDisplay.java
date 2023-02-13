package Mock5;
import java.util.*;

public class StringDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> ar = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (ar.contains(s.charAt(i))){
                continue;
            }
            ar.add(s.charAt(i));
        }
        String x = "";
        for (int i = 0; i < ar.toArray().length; i++) {
            x += ar.get(i);
        }
        System.out.println(x);
        sc.close();
    }
}
