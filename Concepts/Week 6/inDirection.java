/*
IDEA

Create a hierarchy of abstract interfaces and concrete implementations
	-> Provide a level of indirection
*/


/* 
Multiple Implementations

User can choose what implementation to be used via the interface

ex : 
What if we later realize we need a flexible size dateq?
	-> Change declaration for dateq from CircularArrayQueue<Date> to LinkedListQueue<Date> but also we need to change the whole structure inside the function.. which is a con
*/

CircularArrayQueue<Date> dateq;
LinkedListQueue<String> stringq;

dateq = new CircularArrayQueue<Date>();
stringq = new LinkedListQueue<String>();


public class CircularArrayQueue<E> {
	public void add (E element){...};
	public E remove(){...};
	public int size(){...};
	...
}

public class LinkedListQueue<E> {
	public void add (E element){...};
	public E remove(){...};
	public int size(){...};
	...
}



/*
Better Solution to this problem is to use Interface

Adding indirection : 
	Benefit of indirection — to use a
	different implementation for dateq, only
	need to update the instantiation

-> Concrete implementations implement the interface

-> Use the interface to declare variables
*/

Queue<Date> dateq;

Queue<String> stringq;

dateq = new CircularArrayQueue<Date>();
stringq = new LinkedListQueue<String>();

public interface Queue<E> {
	abstract void add (E element);
	abstract E remove();
	abstract int size();
	}

public class CircularArrayQueue<E> implements Queue<E> {
	public void add (E element){...};
	public E remove(){...};
	public int size(){...};
	...
}

public class LinkedListQueue<E> implements Queue<E> {
	public void add (E element){...};
	public E remove(){...};
	public int size(){...};
	...
}

/*
Effectively I am postposning the choice of instantiation
instead of committing right at the beginning of what 
type of implementation i will be using for a block of code 

	Main Advantage being, we do not need to 
	restructure the whole code to implement a
	different data structure (reduce the amount 
	of code updates) 

Effective use of Interfaces to flexibly choose between various concrete implementations

Interfaces add a level of indirection

we first introduced interfaces partly, it looked like a reaction to the fact that
Java does not supply a support multiple inheritance. So, we said if you want to keep track of
multiple capabilities in a class, we allowed it to support these multiple abstract interfaces. But
interfaces actually have a much larger role to play in some sense in the context of object
oriented programming and object oriented thinking, they give you this level of indirection.

*/