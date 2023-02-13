package Practice;

import java.util.*;
public class MapEx{
    public static void main(String[] args) {
        Map<String,String> map1;
        map1=new HashMap<String,String>();              //Line 1
        map1.put("India","Delhi");
        map1.put("Srilanka","Colombo");
        map1.put("Australia","Sydney");
        System.out.println(map1);                       //Line 2
        map1=new TreeMap<String,String>(map1);          //Line 3
        System.out.println(map1);                       //Line 4
    }
}

// Lines 2 and 4 may produce different output.