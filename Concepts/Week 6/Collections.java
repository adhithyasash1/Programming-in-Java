/*
Collections

The Collection interface abstracts properties of grouped data
	-> Arrays, lists, sets, . . .
	-> But not key-value structures like dictionaries


*/

public interface Collection<E>{
	boolean add(E element);
	Iterator<E> iterator();
	...
}

public interface Iterator<E>{
	E next();
	boolean hasNext();
	void remove();
	...
}

Collection<String> cstr = new ...;
Iterator<String> iter = cstr.iterator();

while (iter.hasNext()) {
	String element = iter.next();
	// do something with element
}

/*
Here I define a collection, I take a concrete value of E called string. 
So, I define something called cstr, which is a concrete collection of 
string and I instantiated with the appropriate thing and so on. 

And now I want to run through the cstr. So, what I do is I tell cstr 
to give me back an iterator and this will be of type iterator string 
because the cstr collection was created with a parameter string.

So, now I have this iterator called iter. So, what I will do is 
I will say that so long as this iter has something more to 
provide me so long as iter.hasNext()==True, I will get the next
element and store it in a temporary variable of the type, 
which is the underlying collection in this case string.

So, I have this local variable element, which one by one will 
pick up these elements provided  by this next function of the 
iterator and then I can do whatever I want with the element, I
mean, I might want to inspect it, I want to check if it has certain value, 
I might be counting them, whatever it is, but I am guaranteed that 
this while loop will go to all of the collection. It will go through 
the elements of the collection systematically from beginning to end.
*/




/*
Using Iterators
*/

Collection<String> cstr = new ...;
Iterator<String> iter = cstr.iterator();

while (iter.hasNext()) {
	String element = iter.next();
	// do something with element
}

Collection<String> cstr = new ...;
for (String element : cstr){
	// do something with element
}

public static <E> boolean contains(Collection<E> c, Object obj) {
	for (E element : c) {
			if (element.equals(obj)) { 
				return true; 
			}
			return false;
		}
}




/*
Removing Items
*/

public interface Iterator<E>{
	E next();
	boolean hasNext();
	void remove();
	...
}

Collection<String> cstr = new ...;
Iterator<String> iter = cstr.iterator();

while (iter.hasNext()) {
	String element = iter.next();
	// Delete element if it has some property
	if (property(element)) {
		iter.remove();
	}
}

// To remove consecutive elements, must interleave a next()
// To remove the First element, need to access it First

Collection<String> cstr = new ...;
Iterator<String> iter = cstr.iterator();

// Remove first element in cstr
iter.next();
iter.remove();
// Remove second element in cstr
iter.next();
iter.remove();