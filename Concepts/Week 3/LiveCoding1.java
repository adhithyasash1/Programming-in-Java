/*
// 1
Write Java code as instructed. 

• Define class Employee that has the following members.
 – String name, double salary as private instance 
   variables
 – Mutator methods to update the instance variables of an 
   Employee
 – Accessor methods to access the instance variables of 
   an Employee
 – Method public double bonus(float percent) that returns 
   the bonus computed as (percent/100.0)*salary

• Define class Manager that extends class Employee and h 
  as the following members.
  – String secretary as private instance variable
  – Mutator method to update the instance variable
  – Accessor method to access the instance variable
  – Override public double bonus(float percent) that 
    returns the bonus of a Manager as 50 percent extra 
    bonus than a regular employee

• Define class InheritanceTest that has the main method.
  – Create object obj1 of Manager using an Employee class 
    reference variable
  – Mutator methods to set the values of name and salary
  – Create object obj2 of Manager using an Manager class 
    reference variable
  – Mutator method to set the value of secretary for obj2
  – Accessor methods for name and salary using obj1
  – Invoke method bonus(float percent) using obj1
  – Accessor method of secretary using obj2

// 2
Write Java code as instructed. 
• Define class Employee that has the following members.
  – String name, double salary as private instance     
    variables
  – Constructor to initialize the instance variables
  – Define method print() to display name and salary of 
    an Employee
  – Overload method print() as print(float percent) to 
    display the name, salary and bonus of an Employee
  – Method public double bonus(float percent) that 
    returns the bonus computed as (percent/100.0)*salary

• Define class Manager that extends class Employee and 
  has the following members.
  – String secretary as private instance variable
  – Define a constructor to initialize the instance 
    variables of Manager that includes the instance 
    variables of Employee
  – Override method print() to display the name, salary       and secretary of Manager.
  – Override method print(float percent) to display the       name, salary, secretary and bonus of a Manager
  – Override public double bonus(float percent) that          returns the bonus of a Manager as 50 percent extra        bonus than a regular employee

• Define class InheritanceTest that has the main method.
  – Here, take two reference variables obj1 and obj2 of       an Employee.
  – Initialize obj1 with Employee class object.
  – Initialize obj2 with Manager class object.
  – call print() and print(float percent) methods using       both obj1 and obj2.
*/

// 1

import java.util.*;

class Employee {
  private String name;
  private double salary;

  // contructor 
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
  
  // accessor methods
  public String getName() {
    return(this.name);
  }

  public double getSalary() {
    return(this.salary);
  }
  
  public double Salary() {
    return(this.salary);
  }

  // mutator methods
  public void setName(String nname) {
    this.name = nname;
  }

  public void setSalary(double ssalary) {
    this.salary = ssalary;
  }
  
  public double bonus(float percent) {
    return ((percent/100.0)*this.salary);
  }  
}

class Manager extends Employee {
  private String secretary;

  // contructor 
  public Manager(String name, double salary, String secretary) {
    super(name, salary);
    this.secretary = secretary;
  }
  
  //accessor method
  public String getSecretary() {
    return(this.secretary);
  }

  //mutator method
  public void setSecretary(String sec) {
    this.secretary = sec;
  }
  
  public double bonus(float percent) {
    return(1.5*super.bonus(percent));
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ename = sc.next();
    double esalary = sc.nextDouble();
    String mname = sc.next();
    double msalary = sc.nextDouble();
    String msec = sc.next();
    Employee obj1 = new Employee(ename, esalary);
    Manager obj2 = new Manager(mname, msalary, msec);
    System.out.println(obj1.getName());
    System.out.println(obj1.getSalary());
    System.out.println(obj1.bonus(10));
    System.out.println(obj2.getName());
    System.out.println(obj2.getSecretary());
    System.out.println(obj2.bonus(20));
  }
}


// 2 

import java.util.*;

class Employee {
  private String name;
  private double salary;

  // contructor 
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
  
  // accessor methods

  public void print() {
    System.out.println("Name : "+this.name);
    System.out.println("Salary : "+this.salary);
  }

  public void print(float percent) {
    System.out.println("Name : "+this.name);
    System.out.println("Salary : "+this.salary);
    System.out.println("Bonus : "+bonus(percent));
  }

  // mutator methods

  public double bonus(float percent) {
    return ((percent/100.0)*this.salary);
  }  
}

class Manager extends Employee {
  private String secretary;

  // contructor 
  public Manager(String name, double salary, String secretary) {
    super(name, salary);
    this.secretary = secretary;
  }
  
  //accessor method

  public void print() {
    super.print();
    System.out.println("Secretary : "+this.secretary);
  }

  public void print(float percent) {
    this.print();
    System.out.println("Bonus : "+ 1.5*super.bonus(percent));
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ename = sc.next();
    double esalary = sc.nextDouble();
    String mname = sc.next();
    double msalary = sc.nextDouble();
    String msec = sc.next();
    Employee obj1 = new Employee(ename, esalary);
    Manager obj2 = new Manager(mname, msalary, msec);
    System.out.println("");
    obj1.print();
    System.out.println("");
    obj1.print(10);
    System.out.println("");
    obj2.print();
    System.out.println("");
    obj2.print(20);
  }
}