package Practice;

import java.util.*;
public class ArrayDequeExample{
    public static void main(String[] args){
        ArrayDeque<String> deque1=new ArrayDeque<String>();
        deque1.push("IIT");
        deque1.push("Madras");
        deque1.push("Java");
        deque1.push("Object");
        deque1.push("Oriented");
        deque1.push("Programming");
        deque1.push("Language");
        ArrayDeque<String> deque2=new ArrayDeque<String>(deque1);
        for (int i=0;i<6;i++) {
            deque1.pop();
        }
        for (int i=0;i<6;i++) {
            deque2.peek();
        }
    }
}

/*
deque1 has 1 element.
deque2 has 7 element.
 */