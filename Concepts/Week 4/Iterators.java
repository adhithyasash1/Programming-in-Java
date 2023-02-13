// Linear List

public class Linearlist {
	
	private Node head;
	private int size;
	
	public Linearlist(){ size = 0; }
	
	public void append(Object o){
		Node m;
		
		for (m = head; m.next != null; m = m.next){}
		Node n = new Node(o);
		m.next = n;
		
		size++;
	}
	...
	private class Node (...)
}

// A generic linear list of objects
// Internal implementation may vary
// An array implementation
// A linked list implementation






// Iterators

// Need the following abstraction

Start at the beginning of the list;

while (there is a next element){
	get the next element;
	do something with it
}

// Encapsulate this functionality in an interface called Iterator

public interface Iterator{
	public abstract boolean has_next();
	public abstract Object get_next();
}

// How do we implement Iterator in Linearlist?
// Need a “pointer” to remember position of the iterator

// How do we handle nested loops?

for (i = 0; i < data.length; i++){
	for (j = 0; j < data.length; j++){
		... // do something with data[i] and data[j]
	}
}

// Solution: Create an Iterator object and export it!





// Iterator

public class Linearlist{
	
	private class Iter implements Iterator{
		private Node position;
		
		public Iter(){...} // Constructor
		public boolean has_next(){...}
		public Object get_next(){...}
	}

	// Export a fresh iterator
	public Iterator get_iterator(){
		Iter it = new Iter();
		return(it);
	}
}

// Definition of Iter depends on linear list

// Now, we can traverse the list externally as follows:

Linearlist l = new Linearlist();
...
Object o;
Iterator i = l.get_iterator();
while (i.has_next()){
	o = i.get_next();
	... // do something with o
}
...


// For nested loops, acquire multiple iterators!

Linearlist l = new Linearlist();
...
Object oi,oj;
Iterator i,j;
i = l.get_iterator();

while (i.has_next()){

	oi = i.get_next();
	j = l.get_iterator();

	while (j.has_next()){
		oj = j.get_next();
		... // do something with oi, oj
	}
}
...




// The new Java for over lists implicitly constructs and uses an iterator

for (type x : a) {
	do something with x;
}

