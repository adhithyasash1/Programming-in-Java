/*
Interface Deque<E>

Type Parameters:
	E - the type of elements held in this collection

All Superinterfaces:
	Collection<E>, Iterable<E>, Queue<E>

All Known Subinterfaces:
	BlockingDeque<E>

All Known Implementing Classes:
	ArrayDeque, ConcurrentLinkedDeque, LinkedBlockingDeque, LinkedList

A linear collection that supports element insertion and removal at both ends. 
The name deque is short for "double ended queue" and is usually pronounced "deck". 

Most Deque implementations place no fixed limits on the number of elements they may contain, 
but this interface supports capacity-restricted deques as well as those with no fixed size limit.

This interface defines methods to access the elements at both ends of the deque. 
Methods are provided to insert, remove, and examine the element. 

Each of these methods exists in two forms: one throws an exception if the operation fails, 
the other returns a special value (either null or false, depending on the operation). 

The latter form of the insert operation is designed specifically for use 
with capacity-restricted Deque implementations; in most implementations, insert operations cannot fail.
*/

public interface Deque<E>
extends Queue<E>

boolean	add(E e)

void addFirst(E e)

void addLast(E e)

boolean	contains(Object o)

Iterator<E>	descendingIterator()

E element()

E getFirst()

E getLast()

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

E remove()

boolean	remove(Object o)

E removeFirst()

boolean	removeFirstOccurrence(Object o)

E removeLast()

boolean	removeLastOccurrence(Object o)

int	size()

/*
Methods

boolean	add(E e)
Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

void addFirst(E e)
Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions.

void addLast(E e)
Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.

boolean	contains(Object o)
Returns true if this deque contains the specified element.

Iterator<E>	descendingIterator()
Returns an iterator over the elements in this deque in reverse sequential order.

E element()
Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).

E getFirst()
Retrieves, but does not remove, the first element of this deque.

E getLast()
Retrieves, but does not remove, the last element of this deque.

Iterator<E>	iterator()
Returns an iterator over the elements in this deque in proper sequence.

boolean	offer(E e)
Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) 
if it is possible to do so immediately without violating capacity restrictions, 
returning true upon success and false if no space is currently available.

boolean	offerFirst(E e)
Inserts the specified element at the front of this deque unless it would violate capacity restrictions.

boolean	offerLast(E e)
Inserts the specified element at the end of this deque unless it would violate capacity restrictions.

E peek()
Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.

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
Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

E remove()
Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).

boolean	remove(Object o)
Removes the first occurrence of the specified element from this deque.

E removeFirst()
Retrieves and removes the first element of this deque.

boolean	removeFirstOccurrence(Object o)
Removes the first occurrence of the specified element from this deque.

E removeLast()
Retrieves and removes the last element of this deque.

boolean	removeLastOccurrence(Object o)
Removes the last occurrence of the specified element from this deque.

int	size()
Returns the number of elements in this deque.
*/

/*
Methods inherited from interface java.util.Collection
addAll, clear, containsAll, equals, hashCode, isEmpty, removeAll, retainAll, toArray, toArray
*/
