package openSession;

import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        String[] players = {"A", "B", "C", "D", "E", "F", "G"};
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("A", 100);
        map.put("B", 50);
        map.put("C", 25);
        map.put("D", 15);
        for (int i = 0; i < players.length ; i++) {
            System.out.println(players[i] + " : " + map.get(players[i]));
        }
        System.out.println();
        for (int i = 0; i < players.length ; i++) {
            System.out.println(players[i] + " : " + map.getOrDefault(players[i],0));
        }
        System.out.println();

        String[] players1 = {"U", "V", "W", "X", "Y", "Z"};
        TreeMap<String,Integer> map1 = new TreeMap<>();
        map1.put("U", 100);
        map1.put("V", 50);
        map1.put("W", 25);
        map1.put("U", map1.getOrDefault("U", 0) + 75);
        for (int i = 0; i < players1.length ; i++) {
            System.out.println(players1[i] + " : " + map1.getOrDefault(players1[i],0));
        }
    }
}
