package liveSession;
import java.lang.reflect.Array;
import java.util.*;

class Shop {
    private String name;
    private int nsold;

    public Shop(String n, int s) {
        name = n;
        nsold = s;
    }

    public String getName(){
        return name;
    }

    public int getNsold(){
        return nsold;
    }
}

public class MapTest {

    public static void printShopName(ArrayList<Shop> sList){
    Iterator<Shop> it = sList.listIterator();
    int maxi = 0;
    String maxiname = null;
    HashMap<String,Integer> map = new HashMap<String, Integer>();
    while (it.hasNext()) {
            Shop shop = it.next();
            map.put(shop.getName(), shop.getNsold());
        }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            if (v > maxi) {
                maxi = v;
                maxiname = k;
            }
        }
    System.out.println(maxiname);
    }

    public static void main(String[] args){
        ArrayList<Shop> list = new ArrayList<>();
        list.add(new Shop("Sashi", 41));
        list.add(new Shop("Sash", 45));
        list.add(new Shop("Sas", 70));
        list.add(new Shop("Sa", 46));
        printShopName(list);
    }
}
