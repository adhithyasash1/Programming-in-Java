package InterfaceWork;

interface AA {
    void add();
    // 'default' enables whichever class that is implementing this interface to not forcibly override this method
    default void show() {
        System.out.println("This is show from Interface AA");
    }
    static void display() {
        System.out.println("I am a static method in interface AA");
    }
}

interface BB {
    public abstract void show();
}

class Impl implements AA, BB {
    // if you do not override add(), show() from interface AA, BB; the class must be declared abstract
    @Override
    public void add() {
    }
    @Override
    public void show() {
        AA.super.show(); // helps us get the method defined in the interface AA with same name as the one we are overriding; possible because it is set as default
        System.out.println("This is show that's over-ridden in Impl");
    }
}

interface CC {
    int c = 10;
}

interface DD {
    int d = 100;
}

public class InterfaceTest {
    public static void main(String[] args) {
        AA.display();
        System.out.println(CC.c);
        System.out.println(DD.d);
    }
}


/*
-> In interface, we do not need to mention abstract keyword for abstract methods
   the compiler auto adds abstract during compile time.

-> If a class is using any number of interfaces, it should override all the abstract
   methods defined in the interface else there would be a compiler error.

-> 'default' enables whichever class that is implementing this interface to
    not forcibly override this method, it would override only other classes and
    uses the method that's defined in the interface.
    You can call this method on the implemented class object

-> interfaces can have static methods which can be called upon

-> if you declare any variable in an interface, by default it is 'public static final'

-> if interface AA and BB have the same function with same name and signature,
   you must definitely override that function in the class you're implementing it
   else you would have to specifically write,
   interfaceName.super.functionName(signatures)
*/
