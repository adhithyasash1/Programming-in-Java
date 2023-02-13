package liveSession;
import java.util.*;
class Stud {
    private String name;
    private double marks[];
    public Stud(String name, double[] marks) {
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
    public static String getMax(Stud[] student) {
        double max_marks = 0.0;
        String max_student = "";
        for (Stud i : student) {
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
        Stud[] arr = new Stud[3];
        for(int i = 0; i < 3; i++){
            String name = sc.next();
            double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
            arr[i] = new Stud(name, m);
        }
        System.out.println(getMax(arr));
    }
}