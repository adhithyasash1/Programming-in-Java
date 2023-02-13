package Mock3;
import java.util.*;

class Person {
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public void show() {
        System.out.print(this.name+" ");
    }
}

class Employee extends Person {
    double Salary;
    public Employee(String n, double s) {
        super(n);
        this.Salary = s;
    }

    public void show() {
        super.show();
        System.out.print(this.Salary+" ");
    }
}

class Student extends Person {
    int semester;

    public Student(String n, int s) {
        super(n);
        this.semester = s;
    }

    public void show() {
        super.show();
        System.out.print(this.semester+" ");
    }
}

public class TClass {
    public static void printAll(List<? extends Person> pList) {
        for (Person p : pList) {
           p.show();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> lp = new ArrayList<Person>();
        List<Employee> le = new ArrayList<Employee>();
        List<Student> ls = new ArrayList<Student>();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            String s1 = sc.next();
            if (t == 2) {
                double s2 = sc.nextDouble();
                le.add(new Employee(s1, s2));
            }
            else if (t == 3) {
                int s3 = sc.nextInt();
                ls.add(new Student(s1, s3));
            }
            else {
                lp.add(new Person(s1));
            }
        }
        printAll(lp);
        System.out.println();
        printAll(le);
        System.out.println();
        printAll(ls);
    }
}
