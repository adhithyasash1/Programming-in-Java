package Cloning;
import java.util.*;

class Person{
    String name;
    public Person(String name){
        this.name=name;
    }
    public void setter(String name){
        this.name=name;
    }
    public String getter(){
        return name;
    }
}
public class HClass{
    public static void main(String[] args){
        ArrayList<Person> al=new ArrayList();
        al.add(new Person("Jupiter"));
        ArrayList<Person> al2=(ArrayList<Person>)al.clone();
        al.get(0).setter("Sun");
        al2.get(0).setter("Moon");
        System.out.println(al.get(0).getter()+"\n"+al2.get(0).getter());
    }
}
