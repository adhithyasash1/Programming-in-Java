/*
HashMap
*/

package Collection;

import java.util.HashMap;

public class HashMap_Demo {
    public static void main(String [] args){
        HashMap<Integer, String> employee = new HashMap<Integer, String>();

        employee.put(100, "Redwan");
        employee.put(101, "Kabila");
        employee.put(102, "Shukahash");

        System.out.println(employee);
        System.out.println(employee.get(101));

        // remove element on basis of index number
        employee.remove(101);
        System.out.println(employee);

        // check if hashmap is empty
        System.out.println(employee.isEmpty());
    }
}

/*
HashSet
*/

package Collection;

import java.util.HashSet;

public class HashSet_Demo {
    public static void main(String[] args) {
        // Stores data by Hash Table
        HashSet<String> studentName = new HashSet<String>();

        studentName.add("Redwan");
        studentName.add("Sharafat");

        System.out.println(studentName);

        for(String hashSet: studentName){
            System.out.print(hashSet + " ");
        }

        // HashSet size
        System.out.println("\nSize: " + studentName.size());

        // remove value
        studentName.remove("Sharafat");
        System.out.println(studentName);

        // clear HashSet
        studentName.clear();
        System.out.println("Cleared HashSet: " + studentName);

        // check if empty
        boolean testHashSet = studentName.isEmpty();
        System.out.println("HashSet clearing status: " + testHashSet);
    }
}

/*
LinkedList Doubly
*/

package Collection;

import java.util.LinkedList;

public class LinkedList_Doubly {
    public static void main(String [] args){
        LinkedList<String> countryNames = new java.util.LinkedList<String>();

        countryNames.add("Afghanistan");
        countryNames.add("Bangladesh");
        countryNames.add("Canada");
        countryNames.add("Egypt");

        System.out.println(countryNames);
        for(String country: countryNames){ // For each loop
            System.out.println(country);
        }
        System.out.println("Size of linkedlist: " + countryNames.size());

        // add value indicating index
        countryNames.add(2, "West Indies");
        System.out.println(countryNames);

        // addFirst() and addLast() method
        countryNames.addFirst("Armenia");
        countryNames.addLast("Fuzi");
        System.out.println(countryNames);

        countryNames.remove("Canada"); // remove the element writing direct value
        countryNames.remove(3); // remove element of index number
        countryNames.removeFirst(); // remove first element
        countryNames.removeLast(); // remove last element
        System.out.println(countryNames);

        System.out.println("First element: " + countryNames.getFirst()); // print first element
        System.out.println("Last element: " + countryNames.getLast()); // print last element
        System.out.println("Value of index 1: " + countryNames.get(1)); // print value of specific index

        // checking if linkedlist is empty
        System.out.println(countryNames.isEmpty());

        // clear the linkedlist
        countryNames.clear();
        System.out.println("Cleared linkedlist: " + countryNames);
        // checking if linkedlist is empty
        System.out.println(countryNames.isEmpty());
    }
}