package openSession;
import java.lang.*;

public class AssertionTest {
    public static int getFactorial(int value) {
        int fact = 1;
        assert value >= 20 : "Invalid Argument";
        for (int i = 1; i <= value; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static String getFullName(String fn, String ln) {
        assert fn != "";
        assert ln != "";
        assert ln != null;
        assert fn != null;
        return fn.concat(ln);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFullName("", ""));
    }
}
