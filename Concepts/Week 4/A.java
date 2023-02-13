package AbstractWork;

abstract public class A {
    String fact = "You can call this abstract class variable using subclass object if its not private, else you would be using accessor/mutator methods!";
    public A() {
        System.out.println("This is printed from Abstract class A.");
        System.out.println("It has no Abstract methods but the class is Abstract!");
        System.out.println();
    }
    public void show() {
        System.out.println("Show from A");
    }
}
