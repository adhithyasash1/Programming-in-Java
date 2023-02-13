package Ba1ch;
import java.util.*;

class Doctor {
    String specialization;
    String[] tools;

    //Define Constructors here
    public Doctor(String a, String[] b) {
        this.specialization = a;
        this.tools = b;
    }

//    public Doctor(Doctor x) {
//        this.specialization = x.specialization;
//        ArrayList<String> mylist = new ArrayList<String>();
//        for (String y : x.tools) {
//            mylist.add(y);
//        }
//        this.tools = (String[]) mylist.toArray();
//    }

    public Doctor(Doctor x) {
        this.specialization = x.specialization;
        String[] ans = new String[2];
        for (int i = 0; i < x.tools.length; i++) {
            ans[i] = x.tools[i];
        }
        this.tools = ans;
    }

    public void setSpecialization(String s) {
        this.specialization = s;
    }

    public void setTools(String s, int index) {
        this.tools[index] = s;
    }

    public String getSpecialization() {
        return specialization;
    }
    public String getTools(int index) {
        return tools[index];
    }
}

public class Survey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tools = {"tool1", "tool2"};
        Doctor d1 = new Doctor("Cardiologist", tools);
        Doctor d2 = new Doctor(d1);
        d2.setSpecialization(sc.next());
        d2.setTools(sc.next(), 1);
        System.out.println(d1.getSpecialization()+" "+d1.getTools(1));
        System.out.println(d2.getSpecialization()+" "+d2.getTools(1));
    }
}
