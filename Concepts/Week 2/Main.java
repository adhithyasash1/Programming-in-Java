package liveSession;
import java.util.*;
import java.lang.*;

class Student {
    String name;
    double marks[];

    public Student(String n, double[] m) {
        this.name = n;
        this.marks = m;
    }

    public String getName() {
        return name;
    }

    public double findTotal() {
        double sum = 0;
        for (double x : this.marks) {
            sum += x;
        }
        return sum;
    }
}

public class Main {

    public static String getMax(ArrayList<Stud> sList) {
        double maxi = 0;
        String ans = null;
        for(Stud s : sList) {
            if (s.findTotal() > maxi){
                ans = s.getName();
                maxi = s.findTotal();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Stud> ar = new ArrayList<>();
        Stud s1 = new Stud("Sashi", new double[] {10.0, 20.0, 30.0});
        Stud s2 = new Stud("R", new double[] {20.0, 20.0, 30.0});
        Stud s3 = new Stud("Adhithya", new double[] {30.0, 20.0, 30.0});
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        System.out.println(getMax(ar));
    }
}

/*

 */