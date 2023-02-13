/*
Write the java program that creates 3 objects of students and prints the name of student
with highest total. Implement the code as follows:

Define class Student with following members:
-> String name, double [] marks (array length is 3) as instance variables which 
	represents the name and marks of student

-> Constructor to initialize instance variables

-> Accessor method getName () that returns the name of student

-> Method findTotal ( ) that returns the total marks of the student

Define class Test that has the following members:
	-> Method getMax () which takes Student [] as parameter and returns the name of
		the student with highest total.

	-> main () method, that creates 3 instances of Student, stores them in an array and
		invokes the method getMax () by passing that Student []
*/

import java.util.*;
class Student {
    private String name;
    private double marks [];
    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return (this.name);
    }
    public double findTotal() {
        double total = 0.0;
        for (double i : this.marks) {
            total = total + i;
        }
        return (total);
    }
}
public class Test {
    public static String getMax(Student[] student) {
        double max_marks = 0.0;
        String max_student = "";
        for (Student i : student) {
            double total_marks = i.findTotal();
            if (total_marks > max_marks) {
                max_student = i.getName();
                max_marks = total_marks;
            }
        }
        return max_student;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];   
        for(int i = 0; i < 3; i++){
            String name = sc.next();
            double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
            arr[i] = new Student(name, m);
        }
        System.out.println(getMax(arr));  
    }
}

