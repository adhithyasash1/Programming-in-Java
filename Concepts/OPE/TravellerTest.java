package Mock1;
import java.util.*;

class Tourist {
    String tName;
    ArrayList<String> tPlaces;

    public Tourist(String vName, ArrayList<String> vPlaces) {
        this.tName = vName;
        this.tPlaces = vPlaces;
    }

    public Tourist(Tourist t) {
        this.tName = t.tName;
        this.tPlaces = new ArrayList<String>(t.tPlaces);
    }

    public String toString() {
        return (this.tName+" : "+this.tPlaces);
    }
}

public class TravellerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vp = new ArrayList<String>();
        String n = sc.next();
        vp.add(sc.next());
        vp.add(sc.next());
        Tourist t1 = new Tourist(n, vp);
        Tourist t2 = new Tourist(t1);
        t2.tName = sc.next();
        t2.tPlaces.add(sc.next());
        System.out.println(t1+"\n"+t2);
        sc.close();
    }
}
