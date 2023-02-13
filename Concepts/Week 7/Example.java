package Practice;
import java.lang.*;

public class Example{
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a,b,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        String name = "IIT madras java";
        int index=scanner.nextInt();
        try{
            c = a/b;
            System.out.println("Quotient is "+c);
            System.out.println(name.charAt(index));
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ // | is the OR operator
            System.out.println(e);
        }
    }
}

