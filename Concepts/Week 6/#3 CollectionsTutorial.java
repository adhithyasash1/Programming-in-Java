/*
ArrayList
*/

import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_arrayList_string();
    example_arrayList_int();
  }

  public static void example_arrayList_string() {
    // Create using
    // ArrayList <Data Type> variable = new ArrayList <Data Type>();
    ArrayList<String> workingDays = new ArrayList<String>();

    workingDays.add("Monday");
    workingDays.add("Tuesday");
    workingDays.add("Wednesday");
    workingDays.add("Friday");

    // Add to a specific index
    workingDays.add(3, "Thursday");

    // Iterate over the array list
    Iterator itor = workingDays.iterator();
    System.out.println("\nWorkdays");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

    // function to check whether the value is in ArrayList
    if( workingDays.contains("Saturday") == false) {
      System.out.println("Workdays does not conatin Saturday");
    } else {
      System.out.println("Workdays does conatin Saturday");
    }

    System.out.println("Clearing the array list...");
    workingDays.clear();
    // Iterate over the array list
    itor = workingDays.iterator();
    System.out.println("\nWorkdays");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

  }

  public static void example_arrayList_int() {
    ArrayList<Integer> scores = new ArrayList<Integer>();

    scores.add(10);
    scores.add(20);
    scores.add(20);
    scores.add(10);

    Iterator itor = scores.iterator();
    System.out.println("\nScores");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

  }
}


/*
LinkedList
*/

import java.util.*;

// https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

class MyCollections {
  public static void main(String args[]) {
    example_linkedList_string();
  }

  public static void example_linkedList_string() {
    // Create using
    // LinkedList <Data Type> variable = new LinkedList <Data Type>();
    LinkedList<String> workingDays = new LinkedList<String>();

    workingDays.add("Monday");
    workingDays.add("Tuesday");
    workingDays.add("Wednesday");
    workingDays.add("Friday");

    // Add to a specific index
    workingDays.add(3, "Thursday");

    // Iterate over the array list
    Iterator itor = workingDays.iterator();
    System.out.println("\nWorkdays");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

    // function to check whether the value is in ArrayList
    if( workingDays.contains("Saturday") == false) {
      System.out.println("Workdays does not conatin Saturday");
    } else {
      System.out.println("Workdays does conatin Saturday");
    }

    System.out.println("Clearing the array list...");
    workingDays.clear();
    // Iterate over the array list
    itor = workingDays.iterator();
    System.out.println("\nWorkdays");
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

  }
}

/*
Hash Set
*/

import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_hashset_string();
  }

  public static void example_hashset_string() {
    // Create using
    // HashSet <Data Type> variable = new HashSet <Data Type>();
    HashSet<String> workingDaysSet = new HashSet <String>();

    workingDaysSet.add("Monday");
    workingDaysSet.add("Tuesday");
    workingDaysSet.add("Wednesday");
    workingDaysSet.add("Thursday");
    workingDaysSet.add("Friday");
    workingDaysSet.add("Saturday");

    // Iterate over the array list
    Iterator itor = workingDaysSet.iterator();
    System.out.println("\nWorkday Set Size : " + workingDaysSet.size() );
    while( itor.hasNext() ) {
      System.out.println( itor.next() );
    }

    // Check item is in hashset or not
    if(workingDaysSet.contains("Saturday")==true) {
      System.out.println("Saturday is in workingDaysSet" );
    } else {
      System.out.println("Saturday is not in workingDaysSet" );
    }

    // Check item is in hashset or not
    if(workingDaysSet.contains("Saturday")==true) {
      System.out.println("Removing Saturday from workingDaysSet" );
      workingDaysSet.remove("Saturday");
    }
  }
}

/*
Hash Map
*/

import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_hashMap();
  }

  public static void example_hashMap() {
    // Create using
    // HashMap <Key_dataType, Value_dataType> variable = new HashMap <Key_dataType, Value_dataType> ();
    HashMap <String, String> workingDaysMap = new HashMap <String, String> ();

    workingDaysMap.put("Day-1", "Monday");
    workingDaysMap.put("Day-2", "Tuesday");
    workingDaysMap.put("Day-3", "Wednesday");
    workingDaysMap.put("Day-4", "Thursday");
    workingDaysMap.put("Day-5", "Friday");



    // Size of the map
    System.out.println("\nWorkday Map Size : " + workingDaysMap.size() );

    // Get value of key using get function
    System.out.println("\nWeekday #2 is " + workingDaysMap.get("Day-2") );

    workingDaysMap.putIfAbsent("Day-3", "Saturday");

    // Existence
    if( workingDaysMap.containsKey("Day-3") == true) {
      System.out.println("\nDay-3 value is " + workingDaysMap.get("Day-2") );
    } else {
      System.out.println("\nDay-3 doesn't exist" );
    }

    // iterating

      // All values
      System.out.println( "\nAll Values :" );
      Collection valueCollection = workingDaysMap.values();
      System.out.println( valueCollection );

      // All Keys
      System.out.println( "\nAll Keys :" );
      Collection keys = workingDaysMap.keySet();
      System.out.println( keys );

  }
}

/*
Queue
*/

import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_queue();
  }

  public static void example_queue() {
    // Create using
    // Queue <Data Type> workingDaysInQueue = new Queue <Data Type> ();
    Queue <String> workingDaysInQueue = new LinkedList<String> ();

    workingDaysInQueue.add("Monday");
    workingDaysInQueue.add("Tuesday");
    workingDaysInQueue.add("Wednesday");
    workingDaysInQueue.add("Thursday");
    workingDaysInQueue.add("Friday");

    // Size of the map
    System.out.println("\nWorkday Map Size : " + workingDaysInQueue.size() );

    // In a queue, elements are added at the end
    workingDaysInQueue.add("Saturday");

    // In a queue, elements are removed from the start
    String item = workingDaysInQueue.remove();
    System.out.println("Removed item {" + item + "} from the queue");

    // Accessing elements in a queue
    System.out.println("\nIterator : ");
    Iterator itor = workingDaysInQueue.iterator();
    while( itor.hasNext() ){
      System.out.println("Element = " + itor.next() );
    }

    // Another way to access elements in a queue
    System.out.println("\nforEach : ");
    workingDaysInQueue.forEach( element -> {
      System.out.println("Element = " + element );
    });
  }
}

/*
Stack
*/

import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_stack();
  }

  public static void example_stack() {
    // LIFO = Last In, Fast Out

    // Create using
    // Stack <Data Type> variable = new Stack <String> ();
    Stack <String> workingDaysInStack = new Stack <String> ();

    // Items are added on top
    workingDaysInStack.push("Monday");
    workingDaysInStack.push("Tuesday");
    workingDaysInStack.push("Wednesday");
    workingDaysInStack.push("Thursday");
    workingDaysInStack.push("Friday");

    // Size of the map
    System.out.println("\nWorkday Stack Size : " + workingDaysInStack.size() );

    // In a Stack, elements are added at the top
    workingDaysInStack.push("Saturday");

    // In a Stack, elements are removed from the top
    String item = workingDaysInStack.pop();
    System.out.println("Removed item {" + item + "} from the queue");

    // Accessing elements in a queue
    System.out.println("\nIterator : ");
    Iterator itor = workingDaysInStack.iterator();
    while( itor.hasNext() ){
      System.out.println("Element = " + itor.next() );
    }

    // Another way to access elements in a queue
    System.out.println("\nforEach : ");
    workingDaysInStack.forEach( element -> {
      System.out.println("Element = " + element );
    });
  }
}

/*
Deque
*/

import java.util.*;

// double ended queue
// Pronounced as "Deck"
// Allow insertion and removal from both the ends
//
class MyCollections {
  public static void main(String args[]) {
    example_queue();
  }

  public static void example_queue() {
    // Create using
    // Deque <Data Type> workingDaysInQueue = new List <Data Type> ();
    Deque <String> workingDaysInDeque = new LinkedList<String> ();

    workingDaysInDeque.add("Monday");
    workingDaysInDeque.add("Tuesday");
    workingDaysInDeque.add("Wednesday");
    workingDaysInDeque.add("Thursday");
    workingDaysInDeque.add("Friday");

    // Size of the dequeue
    System.out.println("\nWorkday DQ Size : " + workingDaysInDeque.size() );

    // In a dequeue, elements are added at the end using regular add method
    workingDaysInDeque.add("Saturday");

    // In a dequeue, elements are added at the start using addFirst method
    workingDaysInDeque.addFirst("xxx");

    // In a dequeue, elements are added at the end using addLast method = add method
    workingDaysInDeque.addLast("Sunday");

    // In a dequeue, elements are removed from the start
    String item = workingDaysInDeque.remove();
    System.out.println("Removed item {" + item + "} from the DQ");

    // In a dequeue, elements are removed from the start using poll
    item = workingDaysInDeque.poll();
    System.out.println("Removed item {" + item + "} from the DQ");

    // In a dequeue, elements are removed from the start using pollLast
    item = workingDaysInDeque.pollLast();
    System.out.println("Removed item {" + item + "} from the DQ");

    // Accessing elements in a queue
    System.out.println("\nIterator : ");
    Iterator itor = workingDaysInDeque.iterator();
    while( itor.hasNext() ){
      System.out.println("Element = " + itor.next() );
    }

    // Another way to access elements in a dequeue
    System.out.println("\nforEach : ");
    workingDaysInDeque.forEach( element -> {
      System.out.println("Element = " + element );
    });
  }
}

/*
Sorting
*/

import java.util.*;

class MyCollections {
  public static void main(String args[]) {
    example_arrayList_string();
  }

  public static void example_arrayList_string() {
    // Create using
    // ArrayList <Data Type> variable = new ArrayList <Data Type>();
    ArrayList<String> workingDays = new ArrayList<String>();

    workingDays.add("Monday");
    workingDays.add("Tuesday");
    workingDays.add("Wednesday");
    workingDays.add("Friday");

    // Add to a specific index
    workingDays.add(3, "Thursday");

    // Iterate over the array list
    Iterator itor = workingDays.iterator();
    System.out.println("\nUnorted Workdays");
    while( itor.hasNext() ) {
      System.out.println(" - " + itor.next() );
    }

    // SORTING
    Collections.sort(workingDays);

    // Iterate over the array list
    itor = workingDays.iterator();
    System.out.println("\nSorted Workdays");
    while( itor.hasNext() ) {
      System.out.println(" - " + itor.next() );
    }

    // SORTING in Reverse Order
    Collections.sort(workingDays, Collections.reverseOrder());

    // Iterate over the array list
    itor = workingDays.iterator();
    System.out.println("\nSorted (Reverse) Workdays");
    while( itor.hasNext() ) {
      System.out.println(" - " + itor.next() );
    }

  }
}