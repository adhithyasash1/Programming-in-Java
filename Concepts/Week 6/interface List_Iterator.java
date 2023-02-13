Interface ListIterator<E>

/*
All Superinterfaces:
Iterator<E>

public interface ListIterator<E>
extends Iterator<E>
An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration, and obtain the iterator's current position in the list. A ListIterator has no current element; its cursor position always lies between the element that would be returned by a call to previous() and the element that would be returned by a call to next(). An iterator for a list of length n has n+1 possible cursor positions, as illustrated by the carets (^) below:
                      Element(0)   Element(1)   Element(2)   ... Element(n-1)
 cursor positions:  ^            ^            ^            ^                  ^
 
Note that the remove() and set(Object) methods are not defined in terms of the cursor position; they are defined to operate on the last element returned by a call to next() or previous().
*/

void add(E e)

boolean hasNext()

boolean hasPrevious()

E next()

int nextIndex()

E previous()

int previousIndex()

void remove()

void set(E e)


/*
void    add(E e)
Inserts the specified element into the list (optional operation).

boolean hasNext()
Returns true if this list iterator has more elements when traversing the list in the forward direction.

boolean hasPrevious()
Returns true if this list iterator has more elements when traversing the list in the reverse direction.

E   next()
Returns the next element in the list and advances the cursor position.

int nextIndex()
Returns the index of the element that would be returned by a subsequent call to next().

E   previous()
Returns the previous element in the list and moves the cursor position backwards.

int previousIndex()
Returns the index of the element that would be returned by a subsequent call to previous().

void    remove()
Removes from the list the last element that was returned by next() or previous() (optional operation).

void    set(E e)
Replaces the last element returned by next() or previous() with the specified element (optional operation).
*/