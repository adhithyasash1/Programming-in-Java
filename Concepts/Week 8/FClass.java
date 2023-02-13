package Cloning;

class Employee{
    int x;
    String str;
    Employee(int x,String b){
        this.x=x;
        this.str=b;
    }
    public String toString(){
        return "ID: "+x+" Name: "+str;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class FClass{
    public static void main(String[] args){
        try{
            Employee obj=new Employee(1,"Sun");
            System.out.println(obj);
            Employee obj2=new Employee(2,"Moon");
            System.out.println(obj2);
            Employee obj3=(Employee)obj.clone();
            obj3.x=3;
            System.out.println(obj);
        }
        catch(CloneNotSupportedException e){
            System.out.println("No permission to clone");
        }
    }
}
