package HigherOrderFunctions;

interface Example{
    void show();
    default void display(){
        System.out.println(2);
    }
    static void reveal(){
        System.out.println(3);
    }
}
public class AClass{
    public static void main(String[] args){
        Example ref=()-> System.out.println(1);
        ref.show();
    }
}