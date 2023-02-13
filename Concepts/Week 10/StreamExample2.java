package Activity;
import java.util.*;
import java.util.stream.*;

class Students{
    private int stuRollno;
    private String stuName;
    public Students(int stuRollno, String stuName) {
        this.stuRollno = stuRollno;
        this.stuName = stuName;
    }
    public int getStuRollno() {
        return stuRollno;
    }
    public String getStuName() {
        return stuName;
    }
    public static void addToMap(ArrayList<Students> students) {
        Stream<Students> student = students.stream();
        Map<Integer, String> map =student.collect(Collectors.toMap(
                Students::getStuRollno,Students::getStuName));
        System.out.println();
        var treemap=new TreeMap<Integer, String>(map);
        System.out.println(treemap);
    }
}

public class StreamExample2 {
    public static void main(String[] args) {
        ArrayList<Students> list=new ArrayList<Students>();
        list.add(new Students(101, "Virat"));
        list.add(new Students(102, "Dhoni"));
        list.add(new Students(103, "Rohit"));
        Students.addToMap(list);
    }
}