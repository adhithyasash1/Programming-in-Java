/*
Class AbstractQueue<E>
java.lang.Object
java.util.AbstractCollection<E>
java.util.AbstractQueue<E>

Type Parameters:
	E - the type of elements held in this collection
All Implemented Interfaces:
	Iterable<E>, Collection<E>, Queue<E>
Direct Known Subclasses:
	ArrayBlockingQueue, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue, 
	LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue, SynchronousQueue
*/

public abstract class AbstractQueue<E>
extends AbstractCollection<E>
implements Queue<E>

protected AbstractQueue()

boolean	add(E e)

boolean	addAll(Collection<? extends E> c)

void clear()

E element()

E remove()

/*
Constructors 

protected	AbstractQueue()

Constructor for use by subclasses.
*/

/*
Methods 

boolean	add(E e)
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

boolean	addAll(Collection<? extends E> c)
Adds all of the elements in the specified collection to this queue.

void	clear()
Removes all of the elements from this queue.

E	element()
Retrieves, but does not remove, the head of this queue.

E	remove()
Retrieves and removes the head of this queue.
*/

/*
Methods inherited from class java.util.AbstractCollection
contains, containsAll, isEmpty, iterator, remove, removeAll, retainAll, size, toArray, toArray, toString

Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait

Methods inherited from interface java.util.Queue
offer, peek, poll

Methods inherited from interface java.util.Collection
contains, containsAll, equals, hashCode, isEmpty, iterator, remove, removeAll, retainAll, size, toArray, toArray
*/