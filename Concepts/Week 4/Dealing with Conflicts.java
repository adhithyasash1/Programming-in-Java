// Dealing with conflicts
// Old problem of multiple inheritance returns

// Which getName() method will class Employee implement? the one from interface Person or interface Designation? 

public interface Person {
	public default String getName() {
		return("No name");
	}
}

public interface Designation {
	public default String getName() {
		return("No designation");
	}
}

public class Employee implements Person, Designation {
	...
	public String getName(){
	...
}

/* 
In such cases, class Employee should have its own definition of getName() 
which will be implemented(over-rided) over others, 
like class Person and Interface Designation.
*/ 

// It could also work in the other way

public class Person{
	public String getName() {
		return("No name");
	}
}

public interface Designation{
	public default String getName() {
		return("No designation");
	}
}

public class Employee
	extends Person implements Designation {
	...
}

/* 
In the above case, if getName() is not defined inside class Employee, 
java will use getName() from class Person over getName() from interface
Designation

When it comes to class vs Interface, java prefers class. Reason for this
is before interface could have any functions people could have written
something implementing an interface and then someone else comes along and 
updates that interface to introduce a function, this function can collide with
some function that's already been written.

When it comes to dealing with two interfaces, then you're forced to override
by writing the function definition inside the class again in which you're 
implementing
*/








