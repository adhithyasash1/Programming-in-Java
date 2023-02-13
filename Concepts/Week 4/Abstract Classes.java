/* Abstract Classes */

public abstract class Shape {
...
public abstract double perimeter();
...
}


/* Can still declare variables whose type is an abstract class */

Shape shapearr[] = new Shape[3];
int sizearr[] = new int[3];
shapearr[0] = new Circle(...);
shapearr[1] = new Square(...);
shapearr[2] = new Rectangle(...);

for (i = 0; i < 2; i++){
	sizearr[i] = shapearr[i].perimeter();
	// each shapearr[i] calls the appropriate method
	...
}


/* Abstract Classes to define Generic Properties */

public abstract class Comparable {
	
	public abstract int cmp(Comparable s);
	//{
		// return -1 if this < s,
		// 0 if this == 0,
		// +1 if this > s
	//}
	
}

/* Now we can sort any array of objects that extend Comparable
 because class Sortfunctions sort on basis of object type Comparable[] a */

public class SortFunctions{
	
	public static void quicksort(Comparable[] a){
	...
	// Usual code for quicksort, except that
	// to compare a[i] and a[j] we use a[i].cmp(a[j])
	}
}

public class SortFunctions{
	public static void quicksort(Comparable[] a){
	...
	}
}

// To use this definition of quicksort, we write

public class Myclass extends Comparable{
	private double size; // quantity used for comparison

	public int cmp(Comparable s){
		if (s instanceof Myclass) // we can only sort if (Comparable s) is of same instance as that of (Myclass)
		{ 
		// we use quicksort belonging to class SortFunctions as it sorts objects of instance Comparable
		// compare this.size and ((Myclass) s).size
		// Note the cast to access s.size
		}
	}
}


/* 
Circle already extends Shape
Java does not allow Circle to also extend Comparable!

to get over this we use Interface

*/

public interface Comparable{
	
	public abstract int cmp(Comparable s);
}

public class Circle extends Shape implements Comparable{
	
	public double perimeter(){...}
	
	public int cmp(Comparable s){...}
	...
}









/*
Another Example
*/

/**
 * A program to demonstrate the usage of Abstract class
 * An Abstract class is a class in which we define the method signature but not the implementation or body of the method. Such no body methods are called abstract methods.
 * 
 * we use abstract keyword before class and method to make it abstract class and method respectively.
 * Any class that contains one or more abstract methods, the class must also be declared abstract.
 * An abstract class may contain non-abstract members.
 * If all the abstract methods are not defined in each sub-classes of the abstract class, then the sub-classes should also be make abstact using abstract keyword.
 * We cannot instantiate an abstract class.
 * 
 * This program contains an abstract super class: Area
 * An abstract method is defined and overriden in sub-classes: Rectangle, Square & Circle.
 * Type: Hiearchical inheritance
 */
abstract class Area {
    String shape; // stores the 2D-shape name
    Area(String shape)
    {
        this.shape = shape;
    }
    abstract double calcArea(); // function to compute Area

    void show() // displays area
    {
        System.out.println("Area of " + shape + " is: " + calcArea());
    }
} // end of abstract super-class Area

class Square extends Area
{
    private double side;
    Square(double side)
    {
        super("Square");
        this.side = side;
    }

    double calcArea()
    {
        return side * side;
    }

    void show()
    {
        System.out.println("Side: " + side);
        super.show();
    }

} // end of sub-class Square

class Rectangle extends Area
{
    private double length, breadth;
    Rectangle(double length, double breadth)
    {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    double calcArea()
    {
        return length * breadth;
    }

    void show()
    {
        System.out.println("Length: "+ length);
        System.out.println("Breadth: "+ breadth);
        super.show();
    }
} // end of sub-class Rectangle

class Triangle extends Area
{
    private double height, base;
    Triangle(double height, double base)
    {
        super("Triangle");
        this.height = height;
        this.base = base;
    }

    double calcArea()
    {
        return 0.5 * base * height;
    }

    void show()
    {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        super.show();
    }
} // end of sub-class Triangle

class Circle extends Area
{
    private double radius;
    Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }

    double calcArea()
    {
        return 4 * Math.PI * radius * radius;
    }

    void show()
    {
        System.out.println("Radius: " + radius);
        super.show();
    }
} // end of sub-class Circle

class Area_2Dshapes // Driver class
{
    public static void main(String[] args) {
        /** NOTE:
         * Dynamic method dispatch is a concept by which the Java run-time environment determines (or decides) which version of an overriden method will be executed.
         * this method implements run-time polymorphism,
         * as it resolves the calls of overriding methods at run time.
         * Here, the show() method is overriden in all the sub classes
         * By making referrence of class Area we are referring to other classes;
         * in order to implement Dynamic Method Dispatch
         */ 
        Area a; // creating a reference of class Area as 'a'
        System.out.println("-------------------------------------");
        a = new Square(6); // a is referring to class Square's object
        a.show(); // calling the show() of Square class
        System.out.println("-------------------------------------");
        a = new Rectangle(3, 4); // a is referring to class Rectangle's object
        a.show(); // calling the show() of Rectangle class
        System.out.println("-------------------------------------");
        a = new Triangle(5, 6); // a is referring to class Triangle's object
        a.show(); // calling the show() of Triangle class
        System.out.println("-------------------------------------");
        a = new Circle(7); // a is referring to class Circle's object
        a.show(); // calling the show() of Circle class
        System.out.println("-------------------------------------");
    } // end of main()
} // end of class


/*
OUTPUT:
-------------------------------------
Side: 6.0
Area of Square is: 36.0
-------------------------------------
Length: 3.0
Breadth: 4.0
Area of Rectangle is: 12.0
-------------------------------------
Base: 6.0
Height: 5.0
Area of Triangle is: 15.0
-------------------------------------
Radius: 7.0
Area of Circle is: 615.7521601035994
-------------------------------------
*/













/*
Another Example
*/

abstract class Sphere
{
	int r;
	Sphere(int r)
	{
		this.r = r;
	}
	abstract float getVol();
	abstract float getArea();
	void show()
	{
		System.out.printf("Radius of sphere: %d units\n", r);
	}
}

abstract class Area extends Sphere
{
	// we need to make class Area as abstract because getVol() is not defined here.
	Area(int radius)
	{
		super(radius);
	}

	float getArea()
	{
		return (float) (2 * Math.PI * r * r);
	}

	void show()
	{
		super.show();
		System.out.printf("Area of sphere  : %.2f sq. units\n", getArea());
	}
}

class Volume extends Area
{
	Volume()
	{
		super(7);
	}

	float getVol()
	{
		return (float) ((4/3) * Math.PI * r * r * r);
	}

	void show()
	{
		super.show();
		System.out.printf("Volume of sphere: %.2f cubic units\n", getVol());
	}
}

class Driver
{
	public static void main(String []args)
	{
		Sphere s;
		s = new Volume();
		s.show();
	}
}

/**
 * OUTPUT:
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Inheritance/Abstract$ javac Sphere.java
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Inheritance/Abstract$ java Driver
Radius of sphere: 7 units
Area of sphere  : 307.88 sq. units
Volume of sphere: 1077.57 cubic units
*/
