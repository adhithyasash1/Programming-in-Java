package Activity;
import java.lang.Thread;

class BookMyMovie implements Runnable{
    int available=1,wanted;
    public BookMyMovie(int wanted) {
        this.wanted=wanted;
    }
    public void run() {
        String name=Thread.currentThread().getName();
        if(wanted<=available) {
            System.out.println("Ticket booked for "+name);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            available = available - wanted;
        }
        else {
            System.out.println("No tickets are available for "+name);
        }
    }
}
public class TicketBooking {
    public static void main(String[] args) {
        BookMyMovie ticket = new BookMyMovie(1);
        Thread t1 = new Thread(ticket,"Jock");
        Thread t2 = new Thread(ticket,"John");
        t1.start();
        t2.start();
    }
}

// Cannot specify the output of this program because it is a concurrent program
// and the output will be different every time you run it.
