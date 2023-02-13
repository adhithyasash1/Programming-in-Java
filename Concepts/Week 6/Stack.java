/*
class Stack

All Implemented Interfaces:
Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess

public class Stack<E> extends Vector<E>
The Stack class represents a last-in-first-out (LIFO) stack of objects. It extends class Vector with five operations that allow a vector to be treated as a stack. The usual push and pop operations are provided, as well as a method to peek at the top item on the stack, a method to test for whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top.
When a stack is first created, it contains no items.

A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, which should be used in preference to this class. For example:
*/

public class Stack<E> extends Vector<E>

Deque<Integer> stack = new ArrayDeque<Integer>();

public Stack()

/*
Constructor Detail
Stack

public Stack()
Creates an empty Stack.
*/

boolean empty()

E peek()

E pop()

E push(E item)

int search(Object o)

/*
Methods
Modifier and Type Method and Description

boolean  empty()
Tests if this stack is empty.

E  peek()
Looks at the object at the top of this stack without removing it from the stack.

E  pop()
Removes the object at the top of this stack and returns that object as the value of this function.

E  push(E item)
Pushes an item onto the top of this stack.

int   search(Object o)
Returns the 1-based position where an object is on this stack.
*/


/*
Methods inherited from class java.util.Vector
add, add, addAll, addAll, addElement, capacity, clear, 
clone, contains, containsAll, copyInto, elementAt, elements, 
ensureCapacity, equals, firstElement, get, hashCode, indexOf, 
insertElementAt, isEmpty, iterator, lastElement, 
lastIndexOf, lastIndexOf, listIterator, listIterator, remove, 
removeAll, removeAllElements, removeElement, removeElementAt, 
removeRange, retainAll, set, setElementAt, setSize, size, 
subList, toArray, toArray, toString, trimToSize


Methods inherited from class java.lang.Object
finalize, getClass, notify, notifyAll, wait, wait, wait
*/