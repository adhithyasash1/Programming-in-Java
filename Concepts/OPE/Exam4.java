package Mock12;
import java.lang.reflect.Array;
import java.util.*;

abstract class Voter implements Comparable<Voter> {
    String voter_id;
    int age;

    public Voter(String id,int a){
        voter_id = id;
        age = a;
    }

    public int hashCode() {
        // overriding hashCode to generate the object's id/hash code only
        // on the basis of voter_id
        return voter_id.hashCode();
    }

    // override compareTo method here
    public int compareTo(Voter obj) {
        if (this.age > obj.age) {
            return -1;
        }
        else if (this.age < obj.age) {
            return 1;
        }
        return 0;
    }
    // override equals method here
    public boolean equals(Object obj) {
        if (obj instanceof Voter) {
        return this.hashCode() == ((Voter)obj).hashCode();
        }
        return false;
    }
}

class FemaleVoter extends Voter {
    public FemaleVoter(String voter_id, int age) {
        super(voter_id,age);
    }

    public String toString() {
        return "Female Voter:"+voter_id+", age:"+age;
    }
}

class MaleVoter extends Voter {
    public MaleVoter(String voter_id, int age) {
        super(voter_id,age);
    }

    public String toString() {
        return "Male Voter:"+voter_id+", age:"+age;
    }
}

public class Exam4 {
    // Define voterChart method here
    public static void voterChart(ArrayList<Voter> reg) {
        ArrayList<Integer> hp = new ArrayList<>();
        LinkedHashSet<Voter> ar = new LinkedHashSet<>();
        TreeSet<Voter> ans = new TreeSet<>();
        for (Voter x : reg) {
            if (!hp.contains(x.hashCode())) {
                ar.add(x);
            }
            else {
                continue;
            }
        }
        ans.addAll(ar);
        for (Voter a : ans) {
            System.out.println(a.toString());
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Voter> registrations = new ArrayList<Voter>();
        //reading the number of Female voters
        int female_voters = s.nextInt();
        for(int i=1;i<= female_voters;i++) {
            //reading voter_id
            String id = s.next();
            //reading age
            int age = s.nextInt();
            FemaleVoter f1 = new FemaleVoter(id,age);
            registrations.add(f1);
        }
        //reading the number of Male voters
        int male_voters = s.nextInt();
        for(int i=1;i<= male_voters;i++) {
            //reading voter_id
            String id = s.next();
            //reading age
            int age = s.nextInt();
            MaleVoter m1 = new MaleVoter(id,age);
            registrations.add(m1);
        }
        voterChart(registrations);
    }
}
