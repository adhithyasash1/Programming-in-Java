// Polymorphic data structures

/* 
Generic Classes 

-> A polymorphic list
-> The type parameter T (<T>) applies to the class as a whole
-> Internally, the T in Node is the same T
-> Also the return value of head() and the argument of insert()

So, you should read it as a linked list of type T.
this is a class which creates a linked list of type T.

When I insert now, I am only allowed to insert values which are the same type T as a list type

*/

public class LinkedList<T>{
	private int size;
	private Node first;
	
	public T head(){
		T returnval;
		...
		return(returnval);
	}
	
	public void insert(T newdata){...}
	
	private class Node {
		private T data;
		private Node next;
		...
	}
}


/* 
Parameterized Generic Class

So, for instance, if I have these classes as before Ticket and Date, I can create a
Linked List which holds tickets by using LinkedList and Ticket as a concrete class name

-> ticketlist belongs to the class LinkedList<Ticket> which only accepts datatype of type Ticket
	class Ticket must have been declared earlier as well

-> datelist belongs to the class LinkedList<Date> which only accepts datatype of type Date
	class Date must have been declared earlier as well

So, I say that LinkedList of ticket is a new linked list of this type. LinkedList of date, on the other
hand, is a new linked list of this type. So, in each case the T is being instantiated to a different
type. The first case T is being instantiated to Ticket, second case to Date. And therefore, now,
when I create a ticket, I can insert it into the first one, when I create a date, I can insert it into
second one. (vice-versa is not possible, will throw a type error)

class Ticket and class Date should be defined somewhere which is available to me in my program.
*/

public class LinkedList<T>{
	...
}

LinkedList<Ticket> ticketlist = new LinkedList<Ticket>();
LinkedList<Date> datelist = new LinkedList<Date>();
Ticket t = new Ticket();
Date d = new Date();
ticketlist.insert(t);
datelist.insert(d);



// Note 

/* 
Be careful not to accidentally hide a type variable
like,

public <T> void insert(T newdata){...}

-> T in the argument of insert() becomes the new T
-> Quantifier <T> masks the type parameter T of LinkedList
*/

public class LinkedList<T>{
	private int size;
	private Node first;
	
	public T head(){
		T returnval;
		...
		return(returnval);
	}
	
	public <T> void insert(T newdata){...}
	
	private class Node {
		private T data;
		private Node next;
		...
	}
}


/*
You should be careful when you are writing these functions inside a parameterized class, 
inside a generic class, which has a type variable associated with the class,
then you do not re-quantify the same variable

If you do it inside a method which belongs to the class which is associated with the instance
of the class, then it is an error. 

Contrast with,
public <T> static void arraycopy (T[] src, T[] tgt){...}

Be careful not to accidentally hide type variables,

public <T> void insert(T newdata){...} inside class LinearList<T>
vs
public <T> static void arraycopy (T[] src, T[] tgt){...}

*/

