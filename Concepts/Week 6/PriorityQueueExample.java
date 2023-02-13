package openSession;
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.add(200);
        queue.add(150);
        queue.add(300);
        queue.add(400);
        queue.add(600);
        while(queue.size() > 0){ System.out.println(queue.remove()); }
        // queue.remove(); removes the element from the queue with the highest priority (lowest valued)
        // queue.poll(); while the collection is empty and we use poll(), we get null value
        //               whereas when the collection is empty and we use remove() we get an error
    }
}

/*
the priority goes to the lowest value element of the queue
consider the queue [100, 200, 150, 300, 400, 600]

first priority -> 100
second priority -> 150
third priority -> 200
fourth priority -> 300
fifth priority -> 400
last priority -> 600

If values are String, then values are determined based on ASCII values
 */