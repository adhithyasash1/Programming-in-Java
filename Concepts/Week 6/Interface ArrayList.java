/*
Class ArrayList<E>
java.lang.Object
java.util.AbstractCollection<E>
java.util.AbstractList<E>
java.util.ArrayList<E>

All Implemented Interfaces:
	Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess

Direct Known Subclasses:
	AttributeList, RoleList, RoleUnresolvedList

Resizable-array implementation of the List interface. 
Implements all optional list operations, and permits all elements, including null. 

In addition to implementing the List interface, 
this class provides methods to manipulate the size of the array that is used internally to store the list. 
(This class is roughly equivalent to Vector, except that it is unsynchronized.)

The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. 

The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. 

All of the other operations run in linear time (roughly speaking). 

The constant factor is low compared to that for the LinkedList implementation.

Each ArrayList instance has a capacity. 
The capacity is the size of the array used to store the elements in the list. 
It is always at least as large as the list size. As elements are added to an ArrayList, its capacity grows automatically. 
The details of the growth policy are not specified beyond the fact that adding an element has constant amortized time cost.

An application can increase the capacity of an ArrayList instance before adding a large number of elements using the ensureCapacity operation. 
This may reduce the amount of incremental reallocation.
*/

public class ArrayList<E>
extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, Serializable

//Contructors

ArrayList()

ArrayList(Collection<? extends E> c)

ArrayList(int initialCapacity)

// Methods

boolean	add(E e)

void add(int index, E element)

boolean	addAll(Collection<? extends E> c)

boolean	addAll(int index, Collection<? extends E> c)

void clear()

Object clone()

boolean	contains(Object o)

void ensureCapacity(int minCapacity)

E get(int index)

int	indexOf(Object o)

boolean	isEmpty()

Iterator<E>	iterator()

int	lastIndexOf(Object o)

ListIterator<E>	listIterator()

ListIterator<E>	listIterator(int index)

E remove(int index)

boolean	remove(Object o)

boolean	removeAll(Collection<?> c)

protected void	removeRange(int fromIndex, int toIndex)

boolean	retainAll(Collection<?> c)

E set(int index, E element)

int	size()

List<E>	subList(int fromIndex, int toIndex)

Object[] toArray()

<T> T[]	toArray(T[] a)

void trimToSize()


/*
Constructors 

ArrayList()
	Constructs an empty list with an initial capacity of ten.

ArrayList(Collection<? extends E> c)
	Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.

ArrayList(int initialCapacity)
	Constructs an empty list with the specified initial capacity.
*/

/*
Methods

boolean	add(E e)
Appends the specified element to the end of this list.

void add(int index, E element)
Inserts the specified element at the specified position in this list.

boolean	addAll(Collection<? extends E> c)
Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.

boolean	addAll(int index, Collection<? extends E> c)
Inserts all of the elements in the specified collection into this list, starting at the specified position.

void clear()
Removes all of the elements from this list.

Object clone()
Returns a shallow copy of this ArrayList instance.

boolean	contains(Object o)
Returns true if this list contains the specified element.

void ensureCapacity(int minCapacity)
Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.

E get(int index)
Returns the element at the specified position in this list.

int	indexOf(Object o)
Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

boolean	isEmpty()
Returns true if this list contains no elements.

Iterator<E>	iterator()
Returns an iterator over the elements in this list in proper sequence.

int	lastIndexOf(Object o)
Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

ListIterator<E>	listIterator()
Returns a list iterator over the elements in this list (in proper sequence).

ListIterator<E>	listIterator(int index)
Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.

E remove(int index)
Removes the element at the specified position in this list.

boolean	remove(Object o)
Removes the first occurrence of the specified element from this list, if it is present.

boolean	removeAll(Collection<?> c)
Removes from this list all of its elements that are contained in the specified collection.

protected void	removeRange(int fromIndex, int toIndex)
Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.

boolean	retainAll(Collection<?> c)
Retains only the elements in this list that are contained in the specified collection.

E set(int index, E element)
Replaces the element at the specified position in this list with the specified element.

int	size()
Returns the number of elements in this list.

List<E>	subList(int fromIndex, int toIndex)
Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

Object[] toArray()
Returns an array containing all of the elements in this list in proper sequence (from first to last element).

<T> T[]	toArray(T[] a)
Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.

void trimToSize()
Trims the capacity of this ArrayList instance to be the list's current size.
*/

/*
Methods inherited from class java.util.AbstractList
	equals, hashCode

Methods inherited from class java.util.AbstractCollection
	containsAll, toString

Methods inherited from class java.lang.Object
	finalize, getClass, notify, notifyAll, wait, wait, wait

Methods inherited from interface java.util.List
	containsAll, equals, hashCode
*/