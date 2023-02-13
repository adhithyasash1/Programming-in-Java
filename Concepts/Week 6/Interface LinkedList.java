/*
Class LinkedList<E>

java.lang.Object
	java.util.AbstractCollection<E>
		java.util.AbstractList<E>
			java.util.AbstractSequentialList<E>
				java.util.LinkedList<E>

Type Parameters:
	E - the type of elements held in this collection

All Implemented Interfaces:
	Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, List<E>, Queue<E>
*/

public class LinkedList<E>
extends AbstractSequentialList<E>
implements List<E>, Deque<E>, Cloneable, Serializable

boolean	add(E e)

void add(int index, E element)

boolean	addAll(Collection<? extends E> c)

boolean	addAll(int index, Collection<? extends E> c)

void addFirst(E e)

void addLast(E e)

void clear()

boolean	contains(Object o)

Iterator<E>	descendingIterator()

E element()

Object clone()

E get(int index)

E getFirst()

E getLast()

int	indexOf(Object o)

int	lastIndexOf(Object o)

ListIterator<E>	listIterator(int index)

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

E remove()

E remove(int index)


boolean	remove(Object o)

E removeFirst()

boolean	removeFirstOccurrence(Object o)

E removeLast()

boolean	removeLastOccurrence(Object o)

E set(int index, E element)

int	size()

Object[] toArray()

<T> T[]	toArray(T[] a)

/*
Constructor and Description

LinkedList()
	Constructs an empty list.
LinkedList(Collection<? extends E> c)
	Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
*/

/*
boolean	add(E e)
Appends the specified element to the end of this list.

void add(int index, E element)
Inserts the specified element at the specified position in this list.

boolean	addAll(Collection<? extends E> c)
Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.

boolean	addAll(int index, Collection<? extends E> c)
Inserts all of the elements in the specified collection into this list, starting at the specified position.

void addFirst(E e)
Inserts the specified element at the beginning of this list.

void addLast(E e)
Appends the specified element to the end of this list.

void clear()
Removes all of the elements from this list.

Object clone()
Returns a shallow copy of this LinkedList.

boolean	contains(Object o)
Returns true if this list contains the specified element.

Iterator<E>	descendingIterator()
Returns an iterator over the elements in this deque in reverse sequential order.

E element()
Retrieves, but does not remove, the head (first element) of this list.

E get(int index)
Returns the element at the specified position in this list.

E getFirst()
Returns the first element in this list.

E getLast()
Returns the last element in this list.

int	indexOf(Object o)
Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

int	lastIndexOf(Object o)
Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

ListIterator<E>	listIterator(int index)
Returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.

boolean	offer(E e)
Adds the specified element as the tail (last element) of this list.

boolean	offerFirst(E e)
Inserts the specified element at the front of this list.

boolean	offerLast(E e)
Inserts the specified element at the end of this list.

E peek()
Retrieves, but does not remove, the head (first element) of this list.

E peekFirst()
Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.

E peekLast()
Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

E poll()
Retrieves and removes the head (first element) of this list.

E pollFirst()
Retrieves and removes the first element of this list, or returns null if this list is empty.

E pollLast()
Retrieves and removes the last element of this list, or returns null if this list is empty.

E pop()
Pops an element from the stack represented by this list.

void push(E e)
Pushes an element onto the stack represented by this list.

E remove()
Retrieves and removes the head (first element) of this list.

E remove(int index)
Removes the element at the specified position in this list.

boolean	remove(Object o)
Removes the first occurrence of the specified element from this list, if it is present.

E removeFirst()
Removes and returns the first element from this list.

boolean	removeFirstOccurrence(Object o)
Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).

E removeLast()
Removes and returns the last element from this list.

boolean	removeLastOccurrence(Object o)
Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).

E set(int index, E element)
Replaces the element at the specified position in this list with the specified element.

int	size()
Returns the number of elements in this list.

Object[] toArray()
Returns an array containing all of the elements in this list in proper sequence (from first to last element).

<T> T[]	toArray(T[] a)
Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
*/

/*
Methods inherited from class java.util.AbstractSequentialList
	iterator

Methods inherited from class java.util.AbstractList
	equals, hashCode, listIterator, removeRange, subList

Methods inherited from class java.util.AbstractCollection
	containsAll, isEmpty, removeAll, retainAll, toString

Methods inherited from class java.lang.Object
	finalize, getClass, notify, notifyAll, wait, wait, wait

Methods inherited from interface java.util.List
	containsAll, equals, hashCode, isEmpty, iterator, listIterator, removeAll, retainAll, subList

Methods inherited from interface java.util.Deque
	iterator
*/