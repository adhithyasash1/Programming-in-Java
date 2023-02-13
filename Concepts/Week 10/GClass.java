package Activity;
import java.lang.Thread;

public class GClass extends Thread{
    public void run(){
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName()+" "+thread.getPriority());
    }
    public static void main(String[] args) {
        GClass t1=new GClass();
        GClass t2=new GClass();
        GClass t3=new GClass();
        t1.setPriority(10);
        t2.setPriority(50);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}

// Priorities in Java are represented by integers between 1 and 10.
// IllegalArgument Exception is thrown if the priority is not in the range 1 to 10.
