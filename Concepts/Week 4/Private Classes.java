// An instance variable can be a user defined type, Employee uses Date
// Date is a public class, also available to other classes

public class Employee{
	private String name;
	private double salary;
	private Date joindate;
	...
}

public class Date {
	private int day, month year;
	...
}

// class LinkedList is built using class Node

public class Node {
	public Object data;
	public Node next;
	...
}

public class LinkedList{
	private int size;
	private Node first;

	public Object head(){
		Object returnval = null;
		if (first != null){
			returnval = first.data;
			first = first.next;
		}
		return(returnval);
	}
}

// Why should Node be public? May want to enhance with prev field, to create doubly linked list
// This does not affect interface of LinkedList

public class LinkedList{
	private int size;
	private Node first;

	public Object head(){ ... }
	
	public void insert(Object newdata){ ... }

	private class Node {
		public Object data;
		public Node next;
		...
	}
}

// Instead, make class Node a private class, Nested within class LinkedList
// Private classes are also called an inner classes

// Objects of private class can see private components of enclosing class


// Private classes allow an additional degree of data encapsulation
// Combine private classes with interfaces to provide controlled access to the state of an object










// Example

package InnerClassesWork;

class BookMyshow{
    String userEmail;
    String movieName;
    double amount;

    public void bookTicket() {
        Payment payment=new Payment();
        if(payment.makePayment()) {
            System.out.println("Tickets booked");
        }
    }
    private class Payment{
        int cardNo;
        int cvv;
        public boolean makePayment() {
            return true;
        }
    }
}

public class PrivateTest {
    public static void main(String[] args) {
        BookMyshow myShow=new BookMyshow();
        myShow.bookTicket();
    }
}