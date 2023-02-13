package Activity;
import java.util.logging.*;

public class BClass{
    static final Object scanner=new Object() ;
    static final Object printer=new Object();

    public static void main(String[] args) {
        Desktop d = new Desktop();
        Laptop l = new Laptop();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(l);
        t1.start();
        t2.start();
    }
    private static class Desktop implements Runnable {
        public void run() {
            synchronized (scanner) {
                System.out.println("Desktop: Scanner busy");

                try {
                    Thread.sleep(0, 1);
                } catch (InterruptedException ex) {
                    Logger.getGlobal().log(Level.SEVERE, ex.getMessage());
                }

                System.out.println("Desktop: Waiting for printer");

                synchronized (printer) {
                    System.out.println("Desktop: Scanner and printer busy");
                    try {
                        Thread.sleep(0, 1);
                    } catch (InterruptedException ex) {
                        Logger.getGlobal().log(Level.SEVERE, ex.getMessage());
                    }
                }
            }
        }
    }

    private static class Laptop implements Runnable {
        public void run() {
            synchronized (printer) {
                System.out.println("Laptop: Printer busy");
                try {
                    Thread.sleep(0, 1);
                }
                catch (InterruptedException ex) {
                    Logger.getGlobal().log(Level.SEVERE, ex.getMessage());
                }
                System.out.println("Laptop: Waiting for scanner");

                synchronized (scanner) {
                    System.out.println("Laptop: printer and scanner busy");
                }
                try {
                    Thread.sleep(0, 1);
                }
                catch (InterruptedException ex) {
                    Logger.getGlobal().log(Level.SEVERE, ex.getMessage());
                }
            }
        }
    }
}
