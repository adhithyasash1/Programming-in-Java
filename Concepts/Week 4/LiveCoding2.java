/*
Write Java code as instructed.

Define an interface Appraisale that has the following members :

-> Default method default void appraisal (Teacher t) that increments the
	salary of an Employee by (stuPassPer/100)*5000.
-> Abstract method public abstract void checkAndUpdateSalary ()

Define an interface SpecialAppraisale that extends Appraisale and has the following members :

-> Default method default void spAppraisal (Teacher t) that increments the
	salary of an Employee by (stuPassPer/100) *10000.

Class Teacher that implements the interface SpecialAppraisale and has the following members :

-> String name, double salary and private double stuPassPer as private instance variables
-> Constructor to initialize the instance variables
-> Mutator method to update salary
-> Accessor method to access salary
-> Accessor method to access stuPassPer
-> Override method toString () that returns name, salary and stuPassPer of
	the Teacher as a single concatenated string (each separated by a single space)
-> Overriding method public void checkAndUpdateSalary () that has the following functionality.
		* If stuPassPer>=60 and stuPassPer<75 then invoke the appraisal () method
			from Appraisale interface
		* Else, if stuPassPer>=75 and stuPassPer<=100 then invoke thespAppraisal()
			method from SpecialAppraisale interface

Class InterfaceTest that has the following members :
    -> You should define method public static void printUpdatedTeachList
     	(Teacher []tList) that has the following functionality
        * Iterate over array tList and invoke method checkAndUpdateSalary () on
        	each Teacher object.
        * Then, iterate over tList and display each Teacher object.

    -> Main method has the following functionality :
        * Creates and initializes an array tArr of three Teacher objects
        * Invokes method printUpdatedTeachList (Teacher[] tList) to print the
    	  updated details of each Teacher after the appraisal is applied
*/

import java.util.*;
interface Appraisable{
    default void appraisal(Teacher t){
        t.setSalary(t.getSalary()+(t.getstuPassPer()/100)*5000);
    }
    public abstract void checkAndUpdateSalary();
}
interface SpecialAppraisable extends Appraisable{
    default void spAppraisal(Teacher t){
        t.setSalary(t.getSalary()+(t.getstuPassPer()/100)*10000);
    }
}
class Teacher implements SpecialAppraisable{
    private String name;
    private double salary;
    private double stuPassPer;
    public Teacher(String name, double salary, double stuPassPer) {
        this.name = name;
        this.salary = salary;
        this.stuPassPer = stuPassPer;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getstuPassPer() {
        return stuPassPer;
    }
    public String toString() {
        return name + ", " + salary + ", " + stuPassPer;
    }
    public void checkAndUpdateSalary() {
        if(stuPassPer >= 60 && stuPassPer < 75)
            appraisal(this);
        else if(stuPassPer >= 75 && stuPassPer <= 100)
            spAppraisal(this);
     }
}
public class InterfaceTest {
    public static void printUpdatedTeachList(Teacher[] tList) {
        for (int i = 0; i < tList.length; i++)
            tList[i].checkAndUpdateSalary();
        for (int i = 0; i < tList.length; i++)
            System.out.println(tList[i]);
    }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Teacher tArr[] = new Teacher[3];
for (int i = 0; i < tArr.length; i++)
tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());
InterfaceTest.printUpdatedTeachList(tArr);
}
}