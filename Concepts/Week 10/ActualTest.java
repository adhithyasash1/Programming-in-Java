package Concurrency;
import static java.lang.Thread.sleep;

class RealParallel implements Runnable{
    // only the line above has changed
    private int id;

    // Constructor
    public RealParallel(int i){
        id = i;
    }

    // run() method
    public void run(){
        for (int j = 0; j < 100; j++){
            System.out.println("My id is "+id);
            try {
                sleep(1000); // Sleep for 1000 ms
            }
            catch (InterruptedException e){
            }
        }
    }
}

public class ActualTest {
    public static void main(String[] args){
        RealParallel p[] = new RealParallel[5];
        Thread t[] = new Thread[5];
        for (int i = 0; i < 5; i++){
            p[i] = new RealParallel(i);
            t[i] = new Thread(p[i]);
            // Make a thread t[i] from p[i]
            t[i].start(); // Start off p[i].run()
            // Note: t[i].start(),
        } // not p[i].start()
    }
}
