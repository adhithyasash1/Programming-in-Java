package OPE2;
import java.util.*;

class School{
    //Code here
}
class Student implements Comparable<Student>{
    //Code here
}

public class Mock1 {
    public static void findStudent(ArrayList<Student> chart) {

        //Code here

        highest_score_girl.ifPresentOrElse(
                e -> System.out.println(e),
                () -> System.out.println("No girls from govt schools.")
        );
    }

    public static void main(String args[]) {
        ArrayList<Student> stud = new ArrayList<>();
        School s1 = new School("PSBP", true);
        School s2 = new School("BSPP", false);
        School s3 = new School("SPBB", true);
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            String roll_num = s.next();
            boolean is_girl = s.nextBoolean();
            int marks = s.nextInt();
            stud.add(new Student(roll_num, is_girl, marks, s1));
        }
    }
}