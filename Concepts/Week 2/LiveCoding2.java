/*
Employee el does a set of projects. Employee e2 also does all the projects did by e1
except the first project, in place of which e2 does another project. 

Write a program that defines two classes Employee and Test. 

Define copy constructor to create e2 from el in
such a way that changing the values of instance variables 
of either e2 or el should not affect the other one. 
The code takes name of e2 and new project done by e2 as input.

Complete the program as specified below :

Class Employee that has the following members.

-> Private instance variables String name and String [] projects to store name
	and projects respectively

-> Define required constructor(s)
	Accessor methods getName ( ) and getProject ( ) to get name of employee
	and project at specific index.

-> Mutator methods setName ( ) and setProject ( ) to set name of employee
	and project at specific index.

Class Test that has the method main which does the following.

-> Two objects of Employee el and e2 are created. e2 is created using e1

-> name of e2 and second item bought by c2 are updated by taking the input.

-> name of el, e2 and first project done by el and e2 are printed
*/

import java.util.*;
class Employee{
    String name;
    String[] projects;
    public Employee(String n, String[] proj){
        name = n;
        projects = proj;
    }
    public Employee(Employee e){
        this.name = e.name;
        int l = e.projects.length;
        this.projects = new String[l];
        for(int i = 0; i < l; i++){
            this.projects[i] = e.projects[i];
        }
    }
    public void setName(String n) {
        name = n;
    }
    public void setProject(int index, String proj) {
        projects[index] = proj;
    }
    public String getName() {
        return name;
    }
    public String getProject(int indx) {
        return projects[indx];
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] proj =  {"PJ1", "PJ2", "PJ3"};
        Employee e1 = new Employee("Surya", proj);
        Employee e2 = new Employee(e1);
        e2.setName(sc.next());
        e2.setProject(0, sc.next());
        System.out.println(e1.getName() + ": " + e1.getProject(0));
        System.out.println(e2.getName() + ": " + e2.getProject(0));
    }
}