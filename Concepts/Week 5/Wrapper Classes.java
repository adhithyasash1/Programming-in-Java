// Erasure of generic information

 
// Type erasure — Java does not keep record all versions of LinkedList<T> as separate types

// Cannot write,

	if (s instanceof LinkedList<String>){ ... }

// At run time, all type variables are promoted to Object,

	LinkedList<T> becomes LinkedList<Object>

// Or, the upper bound, if one is available

	LinkedList<? extends Shape> becomes LinkedList<Shape>

// Since no information about T is preserved, cannot use T in expressions like
	
	if (o instanceof T) {...}



// Type erasure means the comparison in following code fragment returns True

o1 = new LinkedList<Employee>();
o2 = new LinkedList<Date>();

if (o1.getClass() == o2.getClass){
	// True, so this block is executed
}

// As a consequence the following overloading is illegal

public class Example {
	public void printlist(LinkedList<String> strList) { }
	public void printlist(LinkedList<Date> dateList) { }
}

// Both functions have the same signature after type erasure






// Wrapper classes

// Type erasure — at run time, all type variables are promoted to Object

LinkedList<T> becomes LinkedList<Object>

// Basic types int, float, . . . are not compatible with Object

// Cannot use basic type in place of a generic type variable T

// Cannot instantiate LinkedList<T> as LinkedList<int>, LinkedList<double>, ...

/* Wrapper class for each basic type:
	byte = Byte
	short = Short
	int = Integer
	long = Long
	float = Float
	double = Double
	boolean = Boolean
	char = Character
*/

// Now, this enables using LinkedList<Integer>, before we couldn't use LinkedList<int>

// All wrapper classes other than Boolean, Character extend the class Number 

/*   class Byte
	class Short
	class Integer
	class Long
	class Double
	class Float

	extends class Number
*/


/*
Converting from basic type to wrapper class and back
int x = 5;
Integer myx = Integer(x);
int y = myx.intValue();

Similarly, byteValue(), doubleValue(), . . .

Autoboxing — implicit conversion between base types and wrapper types (newer versions of java)
int x = 5;
Integer myx = x;
int y = myx;

Use wrapper types in generic data structures
*/