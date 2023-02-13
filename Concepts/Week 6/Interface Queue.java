/*
Interface Queue<E>

Type Parameters:
	E - the type of elements held in this collection

All Superinterfaces:
	Collection<E>, Iterable<E>

All Known Subinterfaces:
	BlockingDeque<E>, BlockingQueue<E>, Deque<E>, TransferQueue<E>

All Known Implementing Classes:
	AbstractQueue, ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedDeque, 
	ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue, 
	LinkedList, LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue, SynchronousQueue

A collection designed for holding elements prior to processing. Besides basic Collection operations, 
queues provide additional insertion, extraction, and inspection operations. 

Each of these methods exists in two forms: one throws an exception if the operation fails, 
the other returns a special value (either null or false, depending on the operation). 
The latter form of the insert operation is designed specifically for use with 
capacity-restricted Queue implementations; in most implementations, insert operations cannot fail.
*/

public interface Queue<E>
extends Collection<E>

boolean	add(E e)

E element()

boolean	offer(E e)

E peek()

E poll()

E remove()

/*
Methods

boolean	add(E e)
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
E	element()
Retrieves, but does not remove, the head of this queue.
boolean	offer(E e)
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
E	peek()
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
E	poll()
Retrieves and removes the head of this queue, or returns null if this queue is empty.
E	remove()
Retrieves and removes the head of this queue.
*/

/*
Methods inherited from interface java.util.Collection
	addAll, clear, contains, containsAll, equals, hashCode, 
	isEmpty, iterator, remove, removeAll, retainAll, size, toArray
*/