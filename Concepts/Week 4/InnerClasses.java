package InnerClassesWork;

class Outer {
    class Inner {
        public void show() {
            System.out.println("Hi from Inner Class");
        }
    }
    static class StaticInner {
        public void show() {
            System.out.println("Hi from StaticInner Class");
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        // creating objects of Inner Classes
        Outer o = new Outer();
        Outer.Inner inn = o.new Inner();
        inn.show();

        // creating objects of Inner Classes directly since it is static
        Outer.StaticInner sinn = new Outer.StaticInner();
        sinn.show();
    }
}

/*
-> Inner class can extend any outer class but outer classes
   cannot extend inner classes

 */
