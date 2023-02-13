/*
Class TreeSet<E>

java.lang.Object
	java.util.AbstractCollection<E>
		java.util.AbstractSet<E>
			java.util.TreeSet<E>

Type Parameters:
	E - the type of elements maintained by this set

All Implemented Interfaces:
	Serializable, Cloneable, Iterable<E>, Collection<E>, NavigableSet<E>, Set<E>, SortedSet<E>
*/

public class TreeSet<E>
extends AbstractSet<E>
implements NavigableSet<E>, Cloneable, Serializable

TreeSet()

TreeSet(Collection<? extends E> c)

TreeSet(Comparator<? super E> comparator)

TreeSet(SortedSet<E> s)

boolean	add(E e)

boolean	addAll(Collection<? extends E> c)

E ceiling(E e)

void clear()

Object clone()

Comparator<? super E>	comparator()

boolean	contains(Object o)

Iterator<E>	descendingIterator()

NavigableSet<E>	descendingSet()

E first()

E floor(E e)

SortedSet<E> headSet(E toElement)

NavigableSet<E>	headSet(E toElement, boolean inclusive)

E higher(E e)

boolean	isEmpty()

Iterator<E>	iterator()

E last()

E lower(E e)

E pollFirst()

E pollLast()

boolean	remove(Object o)

int	size()

NavigableSet<E>	subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)

SortedSet<E> subSet(E fromElement, E toElement)

SortedSet<E> tailSet(E fromElement)

NavigableSet<E>	tailSet(E fromElement, boolean inclusive)

/*
Constructor and Description

TreeSet()
	Constructs a new, empty tree set, sorted according to the natural ordering of its elements.

TreeSet(Collection<? extends E> c)
	Constructs a new tree set containing the elements in the specified collection, sorted according to the natural ordering of its elements.

TreeSet(Comparator<? super E> comparator)
	Constructs a new, empty tree set, sorted according to the specified comparator.

TreeSet(SortedSet<E> s)
	Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set.
*/

/*
Methods

boolean	add(E e)
Adds the specified element to this set if it is not already present.

boolean	addAll(Collection<? extends E> c)
Adds all of the elements in the specified collection to this set.

E ceiling(E e)
Returns the least element in this set greater than or equal to the given element, or null if there is no such element.

void clear()
Removes all of the elements from this set.

Object clone()
Returns a shallow copy of this TreeSet instance.

Comparator<? super E>	comparator()
Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements.

boolean	contains(Object o)
Returns true if this set contains the specified element.

Iterator<E>	descendingIterator()
Returns an iterator over the elements in this set in descending order.

NavigableSet<E>	descendingSet()
Returns a reverse order view of the elements contained in this set.

E first()
Returns the first (lowest) element currently in this set.

E floor(E e)
Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.

SortedSet<E> headSet(E toElement)
Returns a view of the portion of this set whose elements are strictly less than toElement.

NavigableSet<E>	headSet(E toElement, boolean inclusive)
Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) toElement.

E higher(E e)
Returns the least element in this set strictly greater than the given element, or null if there is no such element.

boolean	isEmpty()
Returns true if this set contains no elements.

Iterator<E>	iterator()
Returns an iterator over the elements in this set in ascending order.

E last()
Returns the last (highest) element currently in this set.

E lower(E e)
Returns the greatest element in this set strictly less than the given element, or null if there is no such element.

E pollFirst()
Retrieves and removes the first (lowest) element, or returns null if this set is empty.

E pollLast()
Retrieves and removes the last (highest) element, or returns null if this set is empty.

boolean	remove(Object o)
Removes the specified element from this set if it is present.

int	size()
Returns the number of elements in this set (its cardinality).

NavigableSet<E>	subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
Returns a view of the portion of this set whose elements range from fromElement to toElement.

SortedSet<E> subSet(E fromElement, E toElement)
Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.

SortedSet<E> tailSet(E fromElement)
Returns a view of the portion of this set whose elements are greater than or equal to fromElement.

NavigableSet<E>	tailSet(E fromElement, boolean inclusive)
Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) fromElement.
*/

/*
Methods inherited from class java.util.AbstractSet
	equals, hashCode, removeAll

Methods inherited from class java.util.AbstractCollection
	containsAll, retainAll, toArray, toArray, toString

Methods inherited from class java.lang.Object
	finalize, getClass, notify, notifyAll, wait, wait, wait

Methods inherited from interface java.util.Set
	containsAll, equals, hashCode, removeAll, retainAll, toArray, toArray
*/