/*
Class ArrayDeque<E>

java.lang.Object
	java.util.AbstractCollection<E>
		java.util.ArrayDeque<E>

Type Parameters:
	E - the type of elements held in this collection

All Implemented Interfaces:
	Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, Queue<E>
*/

public class ArrayDeque<E>
extends AbstractCollection<E>
implements Deque<E>, Cloneable, Serializable

ArrayDeque()

ArrayDeque(Collection<? extends E> c)

ArrayDeque(int numElements)

boolean	add(E e)

void addFirst(E e)

void addLast(E e)

void clear()

ArrayDeque<E> clone()

boolean	contains(Object o)

Iterator<E>	descendingIterator()

E element()

E getFirst()

E getLast()

boolean	isEmpty()

Iterator<E>	iterator()

boolean	offer(E e)

boolean	offerFirst(E e)

boolean	offerLast(E e)

E peek()

E peekFirst()

E peekLast()

E poll()

E pollFirst()

E pollLast()

E pop()

void push(E e)

E remove()E remove()
E remove()

boolean	remove(Object o)

E removeFirst()

boolean	removeFirstOccurrence(Object o)

E removeLast()

boolean	removeLastOccurrence(Object o)

int	size()

Object[] toArray()

<T> T[]	toArray(T[] a)


/*
Constructor and Description

ArrayDeque()
	Constructs an empty array deque with an initial capacity sufficient to hold 16 elements.

ArrayDeque(Collection<? extends E> c)
	Constructs a deque containing the elements of the specified collection, in the order they are returned by the collection's iterator.

ArrayDeque(int numElements)
	Constructs an empty array deque with an initial capacity sufficient to hold the specified number of elements.
*/

/*
Methods

boolean	add(E e)
Inserts the specified element at the end of this deque.

void addFirst(E e)
Inserts the specified element at the front of this deque.

void addLast(E e)
Inserts the specified element at the end of this deque.

void clear()
Removes all of the elements from this deque.

ArrayDeque<E> clone()
Returns a copy of this deque.

boolean	contains(Object o)
Returns true if this deque contains the specified element.

Iterator<E>	descendingIterator()
Returns an iterator over the elements in this deque in reverse sequential order.

E element()
Retrieves, but does not remove, the head of the queue represented by this deque.

E getFirst()
Retrieves, but does not remove, the first element of this deque.

E getLast()
Retrieves, but does not remove, the last element of this deque.

boolean	isEmpty()
Returns true if this deque contains no elements.

Iterator<E>	iterator()
Returns an iterator over the elements in this deque.

boolean	offer(E e)
Inserts the specified element at the end of this deque.

boolean	offerFirst(E e)
Inserts the specified element at the front of this deque.

boolean	offerLast(E e)
Inserts the specified element at the end of this deque.

E peek()
Retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this deque is empty.

E peekFirst()
Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.

E peekLast()
Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.

E poll()
Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.

E pollFirst()
Retrieves and removes the first element of this deque, or returns null if this deque is empty.

E pollLast()
Retrieves and removes the last element of this deque, or returns null if this deque is empty.

E pop()
Pops an element from the stack represented by this deque.

void push(E e)
Pushes an element onto the stack represented by this deque.

E remove()
Retrieves and removes the head of the queue represented by this deque.

boolean	remove(Object o)
Removes a single instance of the specified element from this deque.

E removeFirst()
Retrieves and removes the first element of this deque.

boolean	removeFirstOccurrence(Object o)
Removes the first occurrence of the specified element in this deque (when traversing the deque from head to tail).

E removeLast()
Retrieves and removes the last element of this deque.

boolean	removeLastOccurrence(Object o)
Removes the last occurrence of the specified element in this deque (when traversing the deque from head to tail).

int	size()
Returns the number of elements in this deque.

Object[] toArray()
Returns an array containing all of the elements in this deque in proper sequence (from first to last element).

<T> T[]	toArray(T[] a)
Returns an array containing all of the elements in this deque in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
*/

/*
Methods inherited from class java.util.AbstractCollection
	addAll, containsAll, removeAll, retainAll, toString

Methods inherited from class java.lang.Object
	equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait

Methods inherited from interface java.util.Collection
	addAll, containsAll, equals, hashCode, removeAll, retainAll
*/