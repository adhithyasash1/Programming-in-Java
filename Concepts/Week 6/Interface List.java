/*

Interface List<E>

Type Parameters:
	E - the type of elements in this list

All Superinterfaces:
	Collection<E>, Iterable<E>

All Known Implementing Classes:
	AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, LinkedList, RoleList, RoleUnresolvedList, Stack, Vector


An ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.
*/

public interface List<E> extends Collection<E>

boolean	add(E e)

void add(int index, E element)

boolean	addAll(Collection<? extends E> c)

boolean	addAll(int index, Collection<? extends E> c)

void clear()

boolean	contains(Object o)

boolean	containsAll(Collection<?> c)

boolean	equals(Object o)

E get(int index)

int	hashCode()

int	indexOf(Object o)

boolean	isEmpty()

Iterator<E>	iterator()

int	lastIndexOf(Object o)

ListIterator<E>	listIterator()

ListIterator<E>	listIterator(int index)

E remove(int index)

boolean	remove(Object o)

boolean	removeAll(Collection<?> c)

boolean	retainAll(Collection<?> c)

E set(int index, E element)

int	size()

List<E>	subList(int fromIndex, int toIndex)

Object[] toArray()

<T> T[]	toArray(T[] a)

/*
Modifier and Type	Method and Description

boolean	add(E e)
Appends the specified element to the end of this list (optional operation).

void	add(int index, E element)
Inserts the specified element at the specified position in this list (optional operation).

boolean	addAll(Collection<? extends E> c)
Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator (optional operation).

boolean	addAll(int index, Collection<? extends E> c)
Inserts all of the elements in the specified collection into this list at the specified position (optional operation).

void	clear()
Removes all of the elements from this list (optional operation).

boolean	contains(Object o)
Returns true if this list contains the specified element.

boolean	containsAll(Collection<?> c)
Returns true if this list contains all of the elements of the specified collection.

boolean	equals(Object o)
Compares the specified object with this list for equality.

E	get(int index)
Returns the element at the specified position in this list.

int	hashCode()
Returns the hash code value for this list.

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

E	remove(int index)
Removes the element at the specified position in this list (optional operation).

boolean	remove(Object o)
Removes the first occurrence of the specified element from this list, if it is present (optional operation).

boolean	removeAll(Collection<?> c)
Removes from this list all of its elements that are contained in the specified collection (optional operation).

boolean	retainAll(Collection<?> c)
Retains only the elements in this list that are contained in the specified collection (optional operation).

E	set(int index, E element)
Replaces the element at the specified position in this list with the specified element (optional operation).

int	size()
Returns the number of elements in this list.

List<E>	subList(int fromIndex, int toIndex)
Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

Object[]	toArray()
Returns an array containing all of the elements in this list in proper sequence (from first to last element).

<T> T[]	toArray(T[] a)
Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
*/