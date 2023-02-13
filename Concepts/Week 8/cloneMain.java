package openSession;

/*

class Employee implements Cloneable {
    String name;
    int salary;

    public Employee(String n, int s){
        name = n;
        salary = s;
    }
    public Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Sashi", 1000);
        Employee e2 = e1.clone();
        e2.name = "Adhithya";
        System.out.println(e1.name + " " + e2.name);
    }
}


In order to use clone() method you need to implement Cloneable interface and
override clone method inside your creating class and
main method should also throw CloneNotSupportedException
 */

class Address implements Cloneable {
    String sn;

    public Address(String s) {
        sn = s;
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address)super.clone();
    }
}

class Employee implements Cloneable {
    String name;
    int salary;
    String[] projects;
    Address ad;
    public Employee(String n, int s, String[] p, Address a){
        name = n;
        salary = s;
        projects = p;
        ad = a;
    }
    public Employee clone() throws CloneNotSupportedException {
        Employee e = (Employee)super.clone();
        e.projects = e.projects.clone();
        e.ad = e.ad.clone();
        return e;
    }
}

public class cloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] p = {"p001", "p002", "p003"};
        Address ar = new Address("Madras");
        Employee e1 = new Employee("Sashi", 1000, p, ar);
        Employee e2 = e1.clone();
        e2.name = "Adhithya";
        e2.projects[0] = "p007";
        e2.ad = new Address("Mango Forest");
        System.out.println(e1.name + " " + e2.name);
        System.out.println(e1.projects[0] + " " + e2.projects[0]);
        System.out.println(e1.ad.sn + " " + e2.ad.sn);
    }
}

