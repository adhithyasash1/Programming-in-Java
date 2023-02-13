import static java.lang.Thread.*;

class Sample extends Thread {
    int x;
    int n;

    public Sample(int x, int n) {
        this.x = x;
        this.n = n;
    }

    public void run() {
        System.out.println(Thread.interrupted());
        try {
            for (int i = x; i < n; i++) {
                if (i%2 != 0) {
                    System.out.println(i);
                }
                else {
                    Thread.sleep(1000);
                    System.out.println(n);
                }
            }
        }
        catch(InterruptedException ex){
            System.out.println("Interrupted");
        }
    }
}

public class InterruptionTest {
    public static void main(String[] args) throws InterruptedException {
        Sample e = new Sample(1, 5);
        e.start();
        e.interrupt();
    }
}