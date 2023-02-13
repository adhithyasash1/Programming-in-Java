import static java.lang.Thread.sleep;

class ParallelTest implements Runnable{
    // only the line above has changed
    private int id;
    public ParallelTest(int i){
        id = i;
    }

    public void run(){
        for (int j = 0; j < 100; j++){
            System.out.println("My id is "+id);
            try{
                sleep(1000); // Sleep for 1000 ms
            }
            catch(InterruptedException e){
            }
        }
    }
}

public class InterfaceThread {
    public static void main(String[] args){
        ParallelTest p[] = new ParallelTest[5];
        Thread t[] = new Thread[5];
        for (int i = 0; i < 5; i++){
            p[i] = new ParallelTest(i);
            t[i] = new Thread(p[i]);
            // Make a thread t[i] from p[i]
            t[i].start(); // Start off p[i].run()
            // Note: t[i].start(),
        } // not p[i].start()
    }
}
