package liveSession;
import java.util.*;

class Student {
    private String name;
    private int backlog;
    private double cgpa;
    private String status;

    public Student(String a, int b, double c) {
        name = a;
        backlog = b;
        cgpa = c;
    }

    public void setStatus(String s) {
        status = s;
    }

    public int getBacklogs(){
        return backlog;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String toString() {
        return (name + " , " + status);
    }
}

class CollectionTest {
    public static boolean property(Student s) {
        return (s.getBacklogs() > 5);
    }

    public static ArrayList<Student> getUpdatedStuList(ArrayList<Student> sList) {
        ListIterator<Student> it = sList.listIterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (CollectionTest.property(s)) {
                 it.remove();
            }
            else if(s.getCgpa() >= 9.0 && s.getBacklogs() == 0){
                s.setStatus("Promoted with vertical mobility");
            }
            else if(s.getCgpa() <= 9.0 && s.getBacklogs() >= 1){
                s.setStatus("Promoted without vertical mobility");
            }
        }
        return sList;
    }

    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student("Jack", 6, 9.5));
        stuList.add(new Student("John", 2, 8.0));
        stuList.add(new Student("Joe", 3, 7.0));
        System.out.println(getUpdatedStuList(stuList));
    }
}
