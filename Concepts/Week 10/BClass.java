package Activity;
import java.lang.Thread;

public class BClass extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println(t.isAlive());
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.isAlive());
    }
    public static void main(String[] args) {
        BClass t1=new BClass();
        t1.start();
    }
}