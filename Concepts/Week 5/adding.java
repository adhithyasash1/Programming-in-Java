package Activity;
import java.util.*;

class adding{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hola");
        list.add("Hey");
        addin(list);
        System.out.println(list);
    }
    static void addin(ArrayList l){
        l.add(false);
        l.add(10);
    }
}

/*
ArrayList is a part of Java collection framework;
and it is a class of java.util package.
It provides us with dynamic arrays in Java.

That is why we are able to add boolean and int values from
addin method even tho its declared as ArrayList <String>
 */