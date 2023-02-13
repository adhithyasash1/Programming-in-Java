// An interface is an abstract class with no concrete components

public interface Comparable{

	public abstract int cmp(Comparable s);
}


// Circle already extends Shape, Java does not allow Circle to also extend Comparable!


// A class that extends an interface is said to implement it:

public class Circle extends Shape implements Comparable{
	
	public double perimeter(){...}
	
	public int cmp(Comparable s){...}
	...
}

// In this way I am able to extend class Shape for class Circle and as well as use Methods from Class Comparable

// Can extend only one class, but can implement multiple interfaces



public class SortFunctions{
	public static void quicksort(Comparable[] a){
		...
		// Usual code for quicksort, except that
		// to compare a[i] and a[j] we use
		// a[i].cmp(a[j])
	}
}

public interface Comparable{
	public abstract int cmp(Comparable s);
	// return -1 if this < s,
	// 0 if this == 0,
	// +1 if this > s
}



// Adding methods to interfaces (static functions and default functions)

public interface Comparable{
	
	//Invoke directly or using interface name: Comparable.cmpdoc()
	
	public static String cmpdoc(){
		String s;
		s = "Return -1 if this < s, ";  
		s = s + "0 if this == s, ";
		s = s + "+1 if this > s.";
		return(s);

	// Invoke like normal method, using object name: a[i].cmp(a[j])

	public default int cmp(Comparable s) {
		return(0);
	}
}










/*
Another Example
*/

interface Interf
{
	/** By default : 
		- all member functions are public
		- all data members are public, static and final. So, variables need to be initialize.
	*/
    void func1();
    void func2();
}

abstract class A implements Interf 
{
    public void func1()
    {
        System.out.println("Inside Class A");
    }
}

class B extends A // sub-class B implements Interf indirectly
{
    public void func2()
    {
        System.out.println("Inside Class B");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args) {
        Interf ref; // creating reference of class Interf
        // NOTE: We cannot create object of an interface
        ref = new B(); // allocating the reference to object of class B
        ref.func1();
        ref.func2();
    }
}













/*
Another Example
*/

interface p{
    int a=0;
    public void m1();
}

interface p1 extends p{
    int b=1;
    public void m2();
}

interface p2 extends p{
    int c=2;
    public void m3();
}
//here we can use inheritance properties extends

interface p12 extends p1,p2{
    int d=3;
    public void m4();
}
//In interface, extends with multiple interface

class Q implements p12{
    public void m4(){
        System.out.println("p12 called..." + d);
    }
    public void m3(){
        System.out.println("p2 called..."+c);
    }
    public void m2(){
        System.out.println("p1 called..."+b);
    }
    public void m1(){
        System.out.println("p called..."+a);
    }
}
//interface implements by class

class Main{
    public static void main(String[] args) {
        Q q = new Q(); //object
        q.m4();
        q.m3();
        q.m2();
        q.m1();
    }
}






