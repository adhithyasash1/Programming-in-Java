package Week3_1;
public class Employee extends Person{
    private double salary;

    //implement the constructor
    public Employee(String name, long aadharno, double salary) {
        super(name, aadharno);
        this.salary = salary;
    }
    public Employee(String name, long aadharno) {
        super(name, aadharno);
        this.salary = 0;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double s) {
        this.salary = s;
    }
    //override print method
    public void print() {
        super.print();
        System.out.println("salary : " + salary);
    }
}
