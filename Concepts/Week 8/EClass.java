package HigherOrderFunctions;

interface V{
    int display(int a);
}
class Ex{
    public int show(int b){
        return (int)Math.pow(b,2);
    }
}
public class EClass{
    public static void main(String[] args){
        V ref=new Ex()::show;
        System.out.println(ref.display(5));
    }
}
