package Activity;
import java.util.concurrent.*;

class BookTicket{
    static int available = 3;
    static synchronized void extract (String name, int book) {
        if (book <= available) {
            System.out.println(name + " booked " + book + " ticket. ");
            available = available - book;
        }
        else{
            System.out.println(name + ", you can not book " + book + " ticket.");
            System.out.println("Tickets available: " + available);
        }
    }
}

class Passenger implements Runnable {
    BookTicket obj;
    String name;
    int number;

    Passenger(BookTicket obj, String name, int number) {
        this.obj = obj;
        this.name = name;
        this.number = number;
    }

    public void run () {
            BookTicket.extract(name, number);
    }
}

public class AClass {
    public static void main(String[] args) {
        BookTicket obj = new BookTicket();
        BookTicket obj1 = new BookTicket();
        BookTicket obj2 = new BookTicket();

        Thread t1 = new Thread(new Passenger(obj, "Sun", 2));
        Thread t2 = new Thread(new Passenger(obj1, "Moon", 1));
        Thread t3 = new Thread(new Passenger(obj2, "Earth", 2));
        t1.start();
        t2.start();
        t3.start();
    }
}
