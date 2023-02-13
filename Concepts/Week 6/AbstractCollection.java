/*
Class AbstractCollection<E>

This class provides a skeletal implementation of the Collection interface, to minimize the effort required to implement this interface.

java.lang.Object
java.util.AbstractCollection<E>

All Implemented Interfaces:
	Iterable<E>, Collection<E>

Direct Known Subclasses:
	AbstractList, AbstractQueue, AbstractSet, ArrayDeque, ConcurrentLinkedDeque
*/

public abstract class AbstractCollection<E>
extends Object
implements Collection<E>

protected AbstractCollection()

boolean	add(E e)

boolean	addAll(Collection<? extends E> c)

void clear()

boolean	contains(Object o)

boolean	containsAll(Collection<?> c)

boolean	isEmpty()

abstract Iterator<E> iterator()

boolean	remove(Object o)

boolean	removeAll(Collection<?> c)

boolean	retainAll(Collection<?> c)

abstract int size()

Object[] toArray()

<T> T[]	toArray(T[] a)

String toString()


/*
Constructors 

protected	AbstractCollection()
	Sole constructor.
*/

/*
Methods

boolean	add(E e)
Ensures that this collection contains the specified element (optional operation).

boolean	addAll(Collection<? extends E> c)
Adds all of the elements in the specified collection to this collection (optional operation).

void	clear()
Removes all of the elements from this collection (optional operation).

boolean	contains(Object o)
Returns true if this collection contains the specified element.

boolean	containsAll(Collection<?> c)
Returns true if this collection contains all of the elements in the specified collection.

boolean	isEmpty()
Returns true if this collection contains no elements.

abstract Iterator<E>	iterator()
Returns an iterator over the elements contained in this collection.

boolean	remove(Object o)
Removes a single instance of the specified element from this collection, if it is present (optional operation).

boolean	removeAll(Collection<?> c)
Removes all of this collection's elements that are also contained in the specified collection (optional operation).

boolean	retainAll(Collection<?> c)
Retains only the elements in this collection that are contained in the specified collection (optional operation).

abstract int	size()
Returns the number of elements in this collection.

Object[]	toArray()
Returns an array containing all of the elements in this collection.

<T> T[]	toArray(T[] a)
Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.

String	toString()
Returns a string representation of this collection.
*/

/*
Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait

Methods inherited from interface java.util.Collection
equals, hashCode
*/