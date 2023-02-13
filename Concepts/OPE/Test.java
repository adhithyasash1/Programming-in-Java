package Mock11;
import java.util.Scanner;

class Rational{
    private int p;
    private int q;

    //Define constructor
    public Rational(int a, int b) {
        this.p = a;
        this.q = b;
    }

    //Override method toString()
    public String toString() {
        return (this.p + "/" + this.q);
    }
    //Define public Rational product(Rational r)
    public Rational product(Rational r) {
        return new Rational(this.p * r.p, this.q * r.q);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Rational r1=new Rational(scanner.nextInt(),scanner.nextInt());
        Rational r2=new Rational(scanner.nextInt(),scanner.nextInt());
        Rational r3=r1.product(r2);
        System.out.println(r3);
    }
}
