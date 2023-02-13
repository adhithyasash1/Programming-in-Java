package HigherOrderFunctions;

interface U{
    boolean display(int a);
}
class Xample{
    public static boolean show(int b){
        return b>10;
    }
}
public class DClass{
    public static void main(String[] args){
        U ref = Xample::show;
        System.out.println(ref.display(1));
    }
}