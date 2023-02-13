/*
Given as input two integers n_1,n_2 and two double values d_1,d_2 
complete the Java code to form two complex numbers c_1 and c_2, 
as described below, and print their sum.

The real parts of c_1 and c_2 are n_1 and d_1 respectively, 
whereas their imaginary parts are n_2 and d_2, respectively.

Define a generic class ComplexNum with the following members :

-> Instance variables r and i
-> A constructor to initialize r and i	
-> A method add()to return the sum of the two instances of generic type ComplexNum
-> A method that overrides the toString() method in the Object class so that the format of the output is in accordance with those in the test cases.
*/

import java.util.*;
//Add your code for ComplexNum here
class ComplexNum <T extends Number> {
    private T r;
    private T i;

    public ComplexNum (T r2, T i2){
        this.r = r2;
        this.i = i2;
    }

    public ComplexNum <Double> add (ComplexNum<Double> c){
        return new ComplexNum <Double> (
                r.doubleValue () + c.r,
                i.doubleValue () + c.i
        );
    }

    public String toString (){
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

class FClass{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}
