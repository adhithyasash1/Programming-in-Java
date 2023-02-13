package Ba3ch;
import java.util.*;

class Voter {
    String voterID;
    String voterName;

    public Voter(String id, String name) {
        voterID = id;
        voterName = name;
    }

    public String toString() {
        return(voterID + " " + voterName);
    }
}

public class MapsVoterTest {
    public static TreeMap<String, Voter> getSortedVoterList(HashMap<String,Voter> x ) {
        TreeMap<String,Voter> y = new TreeMap<String,Voter>();
        for (Map.Entry<String, Voter> entry : x.entrySet()) {
            y.put(entry.getKey(), entry.getValue());
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Voter> ar = new HashMap<>();
        for (int i=0; i < 3; i++) {
            String token = sc.next();
            String id = sc.next();
            String name = sc.next();
            Voter v = new Voter(id, name);
            ar.put(token, v);
        }
        Map<String, Voter> ans = getSortedVoterList(ar);
        for (Map.Entry<String,Voter> entry : ans.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
