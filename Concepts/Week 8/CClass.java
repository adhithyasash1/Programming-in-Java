package HigherOrderFunctions;

interface X{
    void message();
}
class Sample{
    int a=1;
    static int b=2;
}
public class CClass {
    void show(){
        X ref = () -> {
            System.out.println("Instance variable: "+ new Sample().a);
            System.out.println("Static variable: "+ Sample.b);
            int number=3;
            System.out.println("Local variable: "+ number);
        };
        ref.message();
    }
    public static void main(String args[]) {
        new CClass().show();
    }
}
