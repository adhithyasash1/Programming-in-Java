package openSession;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Sashi");
        stack.push("Adhithya");
        stack.push("IIT");
        stack.push("Madras");
        stack.push("India");
        System.out.println(stack.pop()); // pop() will remove the tail element and return
        System.out.println(stack);
        System.out.println(stack.peek()); // peek() will return the tail element
        System.out.println(stack.firstElement()); // firstElement() will return the first element
        System.out.println(stack.size()); // size() returns the number of elements in the stack
        System.out.println(stack.isEmpty()); // isEmpty() returns true if the stack is empty
        System.out.println(stack.toString()); // toString() returns a string representation of the stack
        System.out.println(stack.remove("Adhithya")); // since the element is removed, we are getting true
    }
}
