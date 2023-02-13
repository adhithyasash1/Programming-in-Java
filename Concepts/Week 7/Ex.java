package Practice;
import java.lang.*;

class A{
    public void show() throws Exception{
        System.out.println("Super class show with Exception");
    }
}
class B extends A{
    public void show() throws RuntimeException{
        System.out.println("Sub class show with RuntimeException");
    }
}
public class Ex {
    public static void main(String[] args) {
        B ob=new B();
        ob.show();
    }
}
