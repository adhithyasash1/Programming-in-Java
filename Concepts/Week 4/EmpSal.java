package openSession;

interface Appraisal {
    default void increment(Employee e){
        e.setSalary(e.getSalary() + 5000);
    }
    abstract void checkAndUpdateSalary();
}

interface SpecialAppraisal extends Appraisal {
    default void spIncrement(Employee e) {
        e.setSalary(e.getSalary() + 7000);
    }
}

class Employee implements SpecialAppraisal {
    private String name;
    private double salary;
    private int numLeaves;

    //constructor
    public Employee(String name, double salary, int numLeaves) {
        this.name = name;
        this.salary = salary;
        this.numLeaves = numLeaves;
    }

    //access and mutate methods
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return this.salary;
    }
    public String toString() {
        return (this.name + " " + this.salary + " " + this.numLeaves);
    }

    @Override
    public void checkAndUpdateSalary() {
        if (this.salary >= 50000 && this.numLeaves <= 6) {
            this.increment(this);
        }
        else if (this.salary < 50000 && this.numLeaves <=6) {
            this.spIncrement(this);
        }
        else if (this.salary < 50000 && this.numLeaves > 6) {
            this.increment(this);
        }
    }
}

class InterfaceTest {
    public static void printUpdatedEmpList(Employee[] eList) {
        for (int i = 0; i < eList.length; i++) {
            Employee e = eList[i];
            e.checkAndUpdateSalary();
            System.out.println(e.toString());
        }
    }
}
public class EmpSal {
    public static void main(String[] args) {
        Employee[] eList = new Employee[3];
        eList[0] = new Employee("Sashi", 52000d, 6);
        eList[1] = new Employee("Adhithya", 48000d, 4);
        eList[2] = new Employee("adhithyasashi", 54000d, 7);
        InterfaceTest.printUpdatedEmpList(eList);
    }
}
