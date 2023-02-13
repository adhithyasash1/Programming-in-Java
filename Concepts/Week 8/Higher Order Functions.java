// Passing Functions

public interface Timerowner {
	public abstract void timerdone();
}

public class Myclass extends Timerowner {
	...
}

public class Timer implements Runnable {
	private Timerowner owner;
	...
	public void start(){
		...
		owner.timerdone();
	}
}

// Customize functions

public interface Comparator<T> {
	public abstract int compare(T o1, T o2);
}

public class StringCompare implements Comparator<String> {
	public int compare(String s1, String s2){
		return s1.length() - s2.length();
	}
}

String[] strarr = new ...;
Arrays.sort(strarr,StringCompare);








/*
 Higher Order Functions
	functions which take another function as arguments


Lambda expressions denote anonymous functions
{ Seperated by '->' }

(Parameters) -> Body
Return value and type are implicit

certain amount of Type inference is going on here, 
for ex : s1.length - s2.length gives an Integer which is not explicitely stated 
*/

(String s1, String s2) -> s1.length() - s2.length()



/*
In use for previous example
*/

public interface Comparator<T> {
	public abstract int compare(T o1, T o2);
}

public class StringCompare implements Comparator<String> {
	public int compare(String s1, String s2){
		return s1.length() - s2.length();
	}
}

String[] strarr = new ...;
Arrays.sort(strarr, (String s1, String s2) -> s1.length() - s2.length()); 
// since the body evaluates to be a constant you do not have to explicitely write a return statement
// In here, s1.length() - s2.length() evaluates to some Integer value, hence no need to write return

/*
Using Type Inferences whenever possible :

We said the type inference will work for local variables defined inside 
a conventional function method inside an object, a class definition. 

But here in this lambda expression, if from the context, 
the types of the values are clear, then Java will allow you 
to go ahead so you can simplify this thing, if you are not sure,
you can always put the type thing and nothing will go wrong, 
in fact, it will always be correct.

Whereas, here if you do the wrong thing, then Java might complain, 
cannot infer a type. So, you can skip the type, type definition 
of the arguments if it is clear from the context. 

But the main thing is that it is always going to be 
allowed only when there are functional interfaces.
*/

String[] strarr = new ...;
Arrays.sort(strarr, (s1, s2) -> s1.length() - s2.length());









/*
More complicated function body can also be used :

Note that the function is anonymous only for the caller

The function that receives the lambda
expression still needs to use a functional
interface for the parameter type

public static <T> void Arrays.sort(T[] a, Comparator<T> c)

Inside Arrays.sort(), refer to the
function by the name compare() defined in the Comparator interface
*/

(String s1, String s2) -> {
	if s1.length() < s2.length()
	return -1;
	else if s1.length() > s2.length()
	return 1;
	else
	return 0;
}
// we use return statements here because of complicated if-else blocks instead of body evaluating itself to be some datatype










/*
Passing Named Functions

We saw an example with adding entries to a Map object
Here sum is a static method in Integer
*/

Map<String, Integer> scores = ...;
scores.merge(bat,newscore,Integer::sum);

/*
So, one of the ways was to use this merge thing. 

So, this is the name, this is a string and this is the new score, 
and there is an implicit value associated with this key before. 

So, what this merge function says is that if there is a key, 
then use the sum function defined in the integer class 
to combine the current value with the new value.
*/


/*
So, if I am doing something more than just calling the function, 
I cannot pass the function by name, 

I have to write an explicit expression which uses that function 
and combines it in whatever they want. 

But, if my only goal is to pass an expression that calls another function, 
I can give you the name of that function be done. 

So, that is called a method reference.
*/









/*
Method References

ClassName::StaticMethod
	Method reference is C::f
	Corresponding expression with as many arguments as f has

ClassName::InstanceMethod
	Method reference is C::f
	Called with respect to an object that becomes implicit parameter

object::InstanceMethod
	Method reference is o::f
	Arguments are passed to o.f 

Can also pass references to constructors
*/

(x1,x2,...,xk) -> f(x1,x2,...,xk)
(o,x1,x2,...,xk) -> o.f(x1,x2,...,xk)
(x1,x2,...,xk) -> o.f(x1,x2,...,xk)
