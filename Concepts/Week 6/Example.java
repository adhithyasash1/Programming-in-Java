package Practice;

import java.util.*;
public class Example{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list.indexOf(100));                  //Line 1
        System.out.println(list.get(1));                        //Line 2
        HashSet<Integer> set=new HashSet<Integer>(list);
        // System.out.println(set.indexOf(100));                //Line 3
        // System.out.println(set.get(2));                      //Line 4
    }
}

/*
HashSet doesn't have methods indexOf and get, hence error at line3 and line4!

only List maintains indices, it's an ordered collection

Set is an unordered collection with no ordering and no duplicates,
HashSet allows maximum only one null value
LinkedHashSet allows maximum only one null value
TreeSet doesn't allow null values
 */
