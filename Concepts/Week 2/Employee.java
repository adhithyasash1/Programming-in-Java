package Week2_1;
import java.util.*;
public class Employee
{
    String eid;
    String ename;
    String eprojects[];

    //Define all the required methods here
    public Employee(Employee e)
    {
       this.eid = e.eid;
       this.ename = e.ename;
       this.eprojects = e.eprojects;
    }
    public Employee(String id, String name, String[] project)
    {
        eid = id;
        ename = name;
        eprojects = project;
    }
    public void display()
    {
        String projects = "P001:";
        for(int i = 1; i < eprojects.length; i++)
        {
            projects += eprojects[i] +":";
        }
        System.out.println("id:"+eid);
        System.out.println("name:"+ename);
        System.out.println("projects:");
        System.out.println(projects);
    }
    public void mutator()
    {
        this.ename = "Mr " + this.ename;
        this.eprojects[0] = null;
    }
}
