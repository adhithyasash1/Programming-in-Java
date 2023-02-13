package openSession;
// import java.util.*;

public class ExceptionTest2 {
    public static void main(String[] args) throws ArithmeticException {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // can also use, Scanner sc = new Scanner(System.in); after importing java.util.Scanner;
        String str = sc.next();
        try {
            char b = str.charAt(12);
            System.out.println("First Character is : " + b);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Argument for the given should be atleast of length 12");
            System.out.println("Number of Indices covered -> "+(str.length()-1));
        }
    }
}
