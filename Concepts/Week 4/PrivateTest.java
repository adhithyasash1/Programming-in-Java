package PrivateClassesWork;

class BookMyShow{
    String userEmail;
    String movieName;
    double amount;

    public void bookTicket() {
        Payment payment= new Payment();
        if(payment.makePayment()) {
            System.out.println("Tickets booked");
        }
    }
    // bookMyShow class can also access all the private variables and methods defined inside private class Payment
    private class Payment {
        int cardNo;
        int cvv;
        public boolean makePayment() {
            return true;
        }
    }
}

public class PrivateTest {
    public static void main(String[] args) {
        BookMyShow myShow=new BookMyShow();
        myShow.bookTicket();
    }
}

/*
Payment is not visible outside BookMyShow class;
even all the instance variables, methods, objects of
Payment is also not available outside BookMyShow class
*/
