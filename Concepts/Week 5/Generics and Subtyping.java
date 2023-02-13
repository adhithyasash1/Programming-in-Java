// Generics and subtypes

/* 
Java generics are not covariant, unlike arrays

Extending subtyping in contexts, If S is compatible with T, S[] is compatible with T[] 
*/

ETicket[] elecarr = new ETicket[10];
Ticket[] ticketarr = elecarr;

/* 
OK. ETicket[] is a subtype of Ticket[], But... 
*/

ticketarr[5] = new Ticket();

/* 
Not OK. ticketarr[5] refers to an ETicket!
A type error at run time!
*/


/*
Generic classes are not covariant
-> LinkedList<String> is not compatible with LinkedList<Object>

a linked list of a subtype is not compatible the linked list of a supertype.

*/

public class LinkedList<T>{...}

public static void printlist(LinkedList<Object> l){
	Object o;
	Iterator i = l.get_iterator();
	while (i.has_next()){
		o = i.get_next();
		System.out.println(o);
}

/* 
the above code is not valid for any type other than Object,
we cannot use the context of universal class Object being able to
print linked list of type String, Date, Employee etc
*/






// Generic methods

/*
Cannot substitute Object for T to get most general type

As we have seen, we can make the method generic by introducing a type variable
*/

public class LinkedList<T>{...}
	public static <T> void printlist(LinkedList<T> l){
		Object o;
		Iterator i = l.get_iterator();
		while (i.has_next()){
			o = i.get_next();
			System.out.println(o);
	}

/*
<T> is a type quantifier: For every type T, . . .
Note that T is not actually used inside the function
We use Object o as a generic variable to cycle through the list
*/






// Wildcards

/* 

Wild card can be used wherever the type T is not required within the function
When T is not needed for return type, or to declare local variables

Instead, use ? as a wildcard type variable
*/

public class LinkedList<T>{...}
	public static void printlist(LinkedList<?> l){
	Object o;
	Iterator i = l.get_iterator();
	while (i.has_next()){
		o = i.get_next();
		System.out.println(o);
	}
}

/*
? stands for an arbitrary unknown type
Avoids unnecessary type variable quantification 
when the type variable is not needed elsewhere
*/






// Bounded wildcards

/*

Wild cards can be bounded
LinkedList<? extends T>
LinkedList<? super T>

-> Suppose Circle, Square and Rectangle all extend Shape
-> Shape has a method draw()
-> All subclasses override draw()
-> Want a function to draw all elements in a list of Shape compatible objects
*/

public static void drawAll(LinkedList<? extends Shape> l){
	Object o;
	Iterator i = l.get_iterator();
	while (i.has_next()){
		o = i.get_next();
		o.draw();
	}
}


// Copying a LinkedList, using a wildcard

public static <? extends T,T> void listcopy (LinkedList<?> src, LinkedList<T> tgt){
	Object o;
	Iterator i = srt.get_iterator();
	while (i.has_next()){
		o = i.get_next();
		trt.add(o);
	}
}

// Another way, Can reverse the constraint, using super

public static <T,? super T> void listcopy (LinkedList<T> src, LinkedList<?> tgt){
	Object o;
	Iterator i = srt.get_iterator();
	while (i.has_next()){
		o = i.get_next();
		trt.add(o);
	}
}




