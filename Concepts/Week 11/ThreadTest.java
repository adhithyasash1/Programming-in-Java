import java.lang.Thread.*;

class Parallel extends Thread{
    private int id;
    public Parallel(int i){ id = i; }
    public void run(){
        for (int j = 0; j < 100; j++){
            System.out.println("My id is "+id);
            try{
                sleep(1000); // Sleep for 1000 ms
            }
            catch(InterruptedException e){}
        }
    }
}

public class ThreadTest {
    public static void main(String[] args){
        ParallelTest p[] = new ParallelTest[5];
        for (int i = 0; i < 5; i++){
            p[i] = new ParallelTest(i);
            p[i].start(); // Start p[i].run()
        } // in concurrent thread
    }
}