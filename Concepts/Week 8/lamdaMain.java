package openSession;

// functional Interface
interface Readable {
    public abstract int yourOperation(int n1, int n2);
    public static void fun() {
        System.out.println("fun");
    }
}

class Addition {
    Integer x;
    Integer y;

    public Addition() {

    }

    public Addition(int a, int b) {
        this.x = a;
        this.y = b;
    }
    public int youAdd(int a, int b) {
        return (a + b);
    }
    public static int youSubtract(int a, int b) {
        return (a - b);
    }
}

public class lamdaMain {
    public static void main(String[] args) {
        Addition a = new Addition();
        Readable s = a::youAdd; // / acts like a bridge, using this interface variable we are defining whatever method we want on an Object on which it can be invoked
        Readable r = Addition::youSubtract;  // if the method is static, then you can call the classname instead of objects of that class
        System.out.println(r.yourOperation(5, 5));
        System.out.println(s.yourOperation(5, 5));
    }
}


/*
Intro Codes:


interface Readable {
    public abstract void read();
    public static void fun1() {
        System.out.println("fun1");
    }
}
public class lamdaMain {
    public static void main(String[] args) {
        Readable r = () -> {System.out.println("Hello");};
        r.read();
    }
}


Instead of creating new class and overriding read method in abstract class
we are overriding thru this

functions with single abstract method is called functional interface
(more than one abstract methods give us error)
thru these interfaces only we can implement functional codes in main method
 */

/*
interface Readable {
    public abstract void read(String s);
    public static void fun1() {
        System.out.println("fun1");
    }
}
public class lamdaMain {
    public static void main(String[] args) {
        Readable r = (s) -> {for(int i = 0; i <5; i++){System.out.println(i);}};
        r.read("hi");
    }
}
*/

/*
interface Readable {
    public abstract int read(int n1, int n2);
    public static void fun() {
        System.out.println("fun");
    }
}
public class lamdaMain {
    public static void main(String[] args) {
       Readable r = Integer::sum;
       System.out.println(r.read(5, 5));
    }
}
*/

