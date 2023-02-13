package Practice;
import java.lang.*;

public class Xample{
    public void show() throws Exception{
        System.out.println("show() with Exception");
    }
    public void show(int a) throws RuntimeException{
        try {
            show();
        }
        catch (Exception e) {
        }
        System.out.println("show() overloaded with RuntimeException");
    }
    public void show(String a){
        show(10);
        System.out.println("show() overloaded with no Exceptions");
    }
    public static void main(String[] args){
        try{
            new Xample().show("IITM Java");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
