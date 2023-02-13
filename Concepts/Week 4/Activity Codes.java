// 1

public abstract class A{
        final static int current_sem(){
        return 4;
        }
        abstract String sem_subjects();
   }
   public class B extends A{
        public String sem_subjects(){
              return "MAD2, BDM and Programming concept using Java.";
        }
        public static void main(String args[]){
              A obj=new B();
             System.out.println("Current Semester: "+ A.current_sem() +"\nSubjects: "+ obj.sem_subjects());
        }
   }


// 2

 public abstract class Maths {
         int num = 1;
         int store = 0;
         public String find_factorial(int y) {
              this.store = y;
              while(y != 0){
                   this.num = num*y;
                   y = y-1;
              }
              return "The factorial of "+store+" is: "+num;
         }
}

public class Factorial extends Maths{
         public static void main(String args[]) {
              System.out.print(new Factorial().find_factorial(1));
         }
} 


// 3

public interface A{
      default String goAhead(){
          return "Started.";
      }
      abstract String stop();
}

public class B implements A{
      public String stop(){
            return "Break Pressed.";
      }
      public static void main(String args[]){
          //correct code to invoke the goAhead method.
          new B().goAhead();
      }
}

// 4

public class Fibo {

  int fibonacci(int x){
    int a=0, b=1, c=0;
    for(int i=1;i<=x-2;i++){
      c=a+b;
      a=b;
      b=c;
    }
    return c;
  }
}
   

public interface Statement {

  abstract String display();
}
   
public class Example extends Fibo implements Statement {
  
  public String display(){
    return "The required fibonacci number is:";
  }
    
  public static void main(String args[]){
    System.out.println(new Example().display()+" "+new Fibo().fibonacci(7));
  }
}

// 5

public interface Areas{
  
  void area(float a,float b);
}
   
public class Triangle implements Areas{
          
  public void area(float a,float b){
    System.out.println("Triangle area is "+(0.5*a*b));
  }
}
   
public class Rect implements Areas{
  public void area(float a,float b){
    System.out.println("Rectangle area is "+(a*b));
  }
}
   
public class Example{
  public static void main(String[] args) {
    Areas triangle=new Triangle();
    Areas rectangle=new Rect();
    triangle.area(1.3f,2.4f);
    rectangle.area(5.4f,1.25f);
  }
}

// 6

public class Test {
  private int a;
  private int b;
      
  public int getA() {
    return a;
  }
      
  public int getB() {
    return b;
  }
      
  public void set(int a,int b) {
    this.a=a;
    this.b=b;
  }
}

public class ExampleProgram {
  public static void main(String[] args) {
    Test program=new Test();
    program.set(10, 20);
    System.out.println(program.getA());
    System.out.println(program.getB());
  }
}


// 7

import java.util.Date;
   
public class Timer{
  private Employee e;
         
  public Timer(Employee e){
    this.e=e;
  }
    
  @SuppressWarnings("deprecation")
  public void start(Date date){
    if(date.getDay()==6 || date.getDay()==0){
      e.notification1();
    }
    else{
      e.notification2();
    }
  }
}

public class Employee {
        
  public void check(){
    Timer obj=new Timer(this);
    Date d=new Date();
    obj.start(d);
  }
        
  public void notification1(){
    System.out.println("Happy weekend...");
  }
        
  public void notification2(){
    System.out.println("Today is a working day, stay at work.");
  }
       
  public static void main(String[] args) {
    Employee e=new Employee();
    e.check();
    }
  }

/*

Note that the getDay() method returns an integer value from 0 to 6. Each integer
represents a day of the week as follows:
0: Sunday, 1: Monday, 2: Tuesday, 3: Wednesday, 4: Thursday, 5: Friday, 6: Saturday.
If this program in run on a Sunday, what will be the output?

Solution: Assume if you execute this program on Sunday, getDay() method will
return 0.
If getDay() is equal to 0 or 6 it will call notification1(), otherwise notification2().

*/


// 8

public interface City{
  public abstract void travel(String name);
}
   
public class Mumbai implements City{
  public void travel(String name) {
    System.out.println(name+" Travelling to Mumbai");
  }
}

public class Hyderabad implements City{
  public void travel(String name) {
    System.out.println(name+" Travelling to Hyderabad");
  }
}
   
public class Traveller{
  private City city;
  private String name;
         
  public Traveller(City city,String name) {
    this.city = city;
    this.name = name;
  }
         
  public void journey(){
    city.travel(name);
  }
}
   
public class Example{
  public static void main(String[] args) {
    Traveller traveller1=new Traveller(new Hyderabad(),"Johny");
    traveller1.journey();
    Traveller traveller2=new Traveller(new Mumbai(),"Virat");
    traveller2.journey();
  }
}

/*
Solution: interface can hold its implemented classes objects.
traveller1.journey(); generates Johny Travelling to Hyderabad as output.
traveller2.journey(); generates Virat Travelling to Mumbai as output.
*/



// 9

public interface Rectangle{
     abstract int areaRectangle(int length,int breadth);
}

public interface Circle{
     abstract int areaCircle(int radius);
}

public interface Shape extends Rectangle,Circle{
}

public class TwoDimension implements Shape{
  public int areaRectangle(int length,int breadth){
    return length*breadth;
  }
      
  public int areaCircle(int radius){
    return (int)(Math.PI*Math.pow(radius,2));
  }
}

public class Example{
  public static void main(String[] args){
    TwoDimension ref=new TwoDimension();
      System.out.println("The area of the rectangle is: "+ ref.areaRectangle(5,2) +"\n"+"The area of the Circle is: "+ref.areaCircle(5));
  }
}




// 10

public abstract class NewYear {
  abstract String resolution();
             
  public NewYear(){
    System.out.println("Resolution: ");
  }
}
      
public class Year_2022 extends NewYear{
  
  public String resolution() {
    return "Walk up early, exercise and take shower everyday.";
  }
             
  public static void main(String args[]) {
    System.out.print(new Year_2022().resolution());
  }
}

/*
Solution: The compiler adds a constructor to an abstract class if a programmer
does not declare it explicitly. Constructor of an abstract class is necessary because
the subclass constructors calls the base class constructor by default.
*/



// 11

public interface Comparable{
  public abstract int comp(Comparable x);
}
   
public class Name implements Comparable{
  private String fname;
  private String lname;

  public Name(String fname, String lname){
    this.fname = fname;
    this.lname = lname;
  }
         
  public int comp(Comparable x) {
    if(lname.compareTo(((Name)x).lname) == 0) {
      return fname.compareTo(((Name)x).fname);
    }
    return lname.compareTo(((Name)x).lname);
  }
         
  public void print() {
    System.out.println(fname + " " + lname);
  }
}
   
public class FClass{
  
  public static void sort(Comparable[] names) {
    for(int i = 0; i < names.length - 1; i++) {
      for(int j = 0; j < names.length - i - 1; j++) {
        if(names[j].comp(names[j + 1]) > 0) {
          Comparable tname = names[j];
          names[j] = names[j + 1];
          names[j + 1] = tname;
        }
      }
    }
  }
          
  public static void main(String[] args) {
    
    Name[] names = new Name[] {new Name("Charlotte", "Brown"), new Name("Ava", "Smith"), new Name("Emma", "Williams"), new Name("Olivia", "Smith"), new Name("Emma", "Johnson")};
    sort(names);
    for(int i = 0; i < names.length; i++) {
      names[i].print();
    }
  }
}

/*
Solution: As per the comp() implementation in Name class, the names will be first
sort by lname, and in case of equality of lname, sort by fname.
*/