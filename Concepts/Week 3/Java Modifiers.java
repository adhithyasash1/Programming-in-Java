/* Private vs Public methods demonstation of usecase */ 


/* class Stack outline sketch */

public class Stack {
	
	private int[] values; // array of values
	private int tos; // top of stack
	private int size; // values.length
	
	/* Constructors to set up values array */
	
	// some constructors

	/* Mutator methods */
	
	public void push (int i){
		...
	}
	
	public int pop (){
		...
	}
	
	/* Accessor Methods */ 

	public boolean is_empty (){
	
		return (tos == 0);
	}

}

/* how would you write a push items into the stack method? */

public class Stack {
	...
	public void push (int i){
		
		if (tos < size){
			
			values[tos] = i;
			tos = tos+1;
		
		}
		
		else{
			
			// Deal with stack overflow
		
		}
		...
	}
	...
}

/* deal gracefully with the stack overflow by expanding the stack */

public class Stack {
	...
	public void push (int i){
		
		if (stack_full()){
		
			extend_stack();
		
		}
	
		... // Usual push operations
	
	}
		...
	private boolean stack_full(){
		
		return(tos == size);
	
	}
	
	private void extend_stack(){
	
		/* Allocate additional space, reset size etc */
		
	}

}

/*  there is no reason for an outside object to
	know the methods stack_full() and extend_stack() 

	it will happen implicitely and its needed to maintain 
	this situation of stack overflow whenever its needed

	but it should not be public, this is a very natural 
	scenario where you have private methods

	its not useless to have private functions, they can be
	usefully put to use inside other methods which are 
	public in the class Stack in this context.
*/






/* Accessor and mutator methods */

public class Date {
	
	private int day, month year;
	
	public void getDay(int d) {...}
	public void getMonth(int m) {...}
	public void getYear(int y) {...}
	
	public void setDay(int d) {...}
	public void setMonth(int m) {...}
	public void setYear(int y) {...}

}

/*  Inconsistent updates are now possible
	Separately set invalid combinations of
	day and month

	what if the user sets 32nd of June or 
	something like that which is an invalid
	date which can be set if we are setting 
	each variable seperately without checking
	each other's value

	it would be better to replace this by a 
	single function which would set the date as
	a whole where the user has to provide all
	three values so that we can validate this
	combination before any updation.
*/

public class Date {
	
	private int day, month year;
	
	public void getDay(int d) {...}
	public void getMonth(int m) {...}
	public void getYear(int y) {...}
	
	public void setDate(int d, int m, int y) {
		...
		// Validate d-m-y combination
	}

}

/*	so when we design our accessor/mutator 
	methods it is better to design it in such
	a way that we are not blindly allowing
	updates of individual fields but also
	maintaining some internal consistency
	that we require between these fields. 
*/






/*  Static Components 
	
	Use static for components that exist
	without creating objects

		Library functions, main(), . . .
		
		Useful constants like Math.PI,
		Integer.MAX VALUE

	These static components are also
	public

	Do private static components make
	sense? 
*/

public class Order {
	
	private static int lastorderid = 0;
	// lastorderid is private static field

	private int orderid;
	....
	
	public Order(...) {
		
		lastorderid++;
		orderid = lastorderid;
		...
	
	}

}

/*  this value lastorderid is created when the class
	is defined and shared by all the objects, its a
	single memory location so whenever any object in 
	this class tries to query it or update it, it will
	work

	At the same time, its private only the objects belonging
	to this class can look it up and update it

	another example is you create a 
	private static int numberOfObjects = 0;
	to keep track of number of objects in a class
	like useful to keep track of stuff like counters and 
	other scenarios.

	one has to be very careful when we have this kind of 
	shared updates possible, this might lead to conflicts
	in concurreny when more than one object has access to
	this value and update it, there should not be any 
	inconsistencies.
*/






/*  final 
	
	final for a variable means it cannot be updated anymore, 

	final for a method means that menthod cannot be over-ridden
	function overriding is not possibe for a particular function
	with final specified in its initialization
*/

