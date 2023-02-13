package Mock6;
import java.util.*;

class Employee implements Comparable<Employee> {
    int ID;
    int experience;
    int nleaves;
    public Employee(int i, int e, int l){
        ID = i;
        experience = e;
        nleaves = l;
    }
    // Override equals(Object o) here
    public boolean equals(Employee o) {
        if (o != null) {
            return this.ID == ((Employee) o).ID;
        }
        return false;
    }
    // Override compareTo(Object o) here
    @Override
    public int compareTo(Employee o) {
            if (this.nleaves < ((Employee) o).nleaves || this.experience > ((Employee) o).experience) {
                return 1;
            }
            else if (this.nleaves > ((Employee) o).nleaves || this.experience < ((Employee) o).experience) {
                return -1;
            }
            return 0;
    }
}

public class Company {
    public static int displayID(Employee[] emp){
        int max = 0;
        int n = 0;
        for(int i = 0; i < 4; i++){
            int count = 0;
            for(int j = 0; j < 4; j++){
                if(!emp[i].equals(emp[j])){
                    count = count + emp[i].compareTo(emp[j]);
                }
            }
            if(count > max){
                max = count;
                n = emp[i].ID;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[4];
        e[0] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[1] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[2] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[3] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        int id = displayID(e);
        System.out.println(id);
    }
}
