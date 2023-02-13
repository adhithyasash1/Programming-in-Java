package openSession;
import java.util.*;
import java.lang.reflect.*;

class Student {
    String name;

    public void fun1() {
        var value = 1000;
    }
}

class Headboy extends Student {
    Integer roll;

    public void fun2() {
        var value = 2000;
    }
}


public class typeMain {
    public static void main(String[] args) {
        var name = "Sashi Adhithya R";
        var s = new Student();
        var e = new Headboy();
        System.out.println(name.getClass());
        System.out.println(e.getClass());
        System.out.println(s.getClass());
    }
}
