package Activity;
import java.util.logging.*;

class Admission extends Thread{
    Medical m;
    Admission(Medical m){
        this.m=m;
    }
    public void run() {
        try {
            m.join();
            System.out.println("Paperwork started.");
            Thread.sleep(1000);
            System.out.println("Paperwork completed.");
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admission.class.getName()).
                    log(Level.SEVERE, null, ex);

        }
    }
}

class Medical extends Thread{
    public void run() {
        try {
            System.out.println("Medical started.");
            Thread.sleep(1000);
            System.out.println("Medical passed.");
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admission.class.getName()).
                    log(Level.SEVERE, null, ex);

        }
    }
}

public class FClass{
    public static void main(String[] args) throws InterruptedException{
        Thread t=Thread.currentThread();
        Medical m=new Medical();
        Admission a=new Admission(m);
        a.start();
        m.start();
        a.join();
        System.out.println("New Admission Granted.");
    }
}
