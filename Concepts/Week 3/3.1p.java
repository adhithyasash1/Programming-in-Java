/*  Write a class named Calculator that has the following methods:
        sum(double a, double b) that prints the value of a + b
        subtraction(double a, double b) that prints the value of a - b
        multiply(double a, double b) that prints the value of a * b
        division(double a, double b) that prints the value of a / b

    Write another class named UpdatedCalculator that inherits all the methods of Calculator and also has the following method:
    remainder(double a, double b) that prints the value of a % b
*/

import java.util.*;
    
class Calculator{

    double a;
    double b;
    
    public void sum(double h, double k){
        this.a=h;
        this.b=k;
        double sum=a+b;
        System.out.println(sum);
    }
    
    public void subtraction(double h, double k){
        this.a=h;
        this.b=k;
        double subtraction=a-b;
        System.out.println(subtraction);
    }
    
    public void multiply(double h, double k){
        this.a=h;
        this.b=k;
        double multiply=a*b;
        System.out.println(multiply);
    }
    
    public void division(double h, double k){
        this.a=h;
        this.b=k;
        double division=a/b;
        System.out.println(division);
    }
}
   
class UpdatedCalculator extends Calculator{

    public void remainder(double h, double k){
        super.a=h;
        super.b=k;
        double remainder=super.a%super.b;
        System.out.println(remainder);
    }
} 
    
public class CalculatorCheck{
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        Calculator c = new Calculator();
        c.sum(n1, n2);
        c.subtraction(n1, n2);
        c.multiply(n1, n2);
        c.division(n1, n2);
        UpdatedCalculator uc = new UpdatedCalculator();
        uc.remainder(n1, n2);
    }
}