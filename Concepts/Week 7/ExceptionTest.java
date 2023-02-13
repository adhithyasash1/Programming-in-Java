package openSession;
import java.util.*;

public class ExceptionTest {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arguments for the given division not viable");
        }
        catch (InputMismatchException e) {
            System.out.println("Arguments for the given division is not Integer");
        }
    }
}
