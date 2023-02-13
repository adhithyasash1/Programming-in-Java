package Cloning;

class Example{
    int x;
    int y;
    Example(int a,int b){
        this.x=a;
        this.y=b;
    }
    public String toString(){
        return ""+x+y;
    }
}
public class Test{
    public static void main(String[] args){
        Example obj=new Example(0,1);
        Example obj2=obj;
        obj2.x=2;
        System.out.println(obj);
        System.out.println(obj2);
    }
}
