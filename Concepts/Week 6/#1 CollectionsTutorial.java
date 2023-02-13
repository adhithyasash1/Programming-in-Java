//This is my note for Java Collection Framework course taught by John.  
//Original credit: John from caveofprogramming.com
//All of his videos can be found in youtube.com
/**---------------------------------
| 1. ArrayList 
|
*/---------------------------------

1. 
-ArrayList class implements the class that is expandable. 
-All the members of the collection framework are template classes, so after you write 
the name of the class, you always have to specify the type of class you want  to store. 

ArrayList<Integer> numbers = new ArrayList<Integer>();
-You can't use primitive data type in it. 
-You must use corresponding non-primitive data type Integer. 

2. Add
numbers.add(10);
numbers.add(50);
numbers.add(40);

3. Get value 
System.out.println(numbers.get(0));

4. Iterate over all the items
for(int i=0; i<numbers.size; i++)
{
	System.out.println(numbers.get(i));
}

5. Another way to iterate through list
//Iteration number 2
for(Integer value: numbers) //type_of_list value: name_of_list
{
	System.out.println(value);
}


6. Removing items carefully
-Removing items from the start is very slow because it copies 
next item in the array list to the first item list and finally 
delete the last block of arary. 
-If you are deleting the list item, it does not have to do this, 
it's fast. Even if you remove second to last item or third to 
last item, it could be reasonably fast. 
-It does not matter if you have a small list, but if you have 
a big list, then and you are removing items from the middle of 
the list or beginning of the list, then this could be slow. 


numbers.remove(numbers.size()-1);
numbers.remove(0);



7. Last thing, collection classes are grouped by interfaces. So 
all the list objects implements the list interface. 
//List interface...
-You are not creating 
-More on next tutorial
-Use Linked list even it uses more memory than ArrayList, 
but for most purposes you will use ArrayList
-
List<String> value = new ArrayList<String>();

/**---------------------------------
| 2. Linked List
|
*/---------------------------------

1. Create a linked list and an array list
ArrayList<Integer> arrayList = new ArrayList<Integer>();
LinkedList<Integer> linkedList = new LinkedList<Integer>();

2. Let's say that we want to pass these lists to a function. 
-You can pass any type of list that implements list interface
in the following method

private static void doTimings(String type, List<Integer> list)
{
	
}

3. Call this method in the main method
doTimings("ArrayList", arrayList);

Also you can do 
doTimings("LinkedList", linkedList);

- Because both of these implements list interface, wherever you see
List<Integer> you can point it happily to a linked list or an array list. 
That's what interface is used it for. 

4. Basic Rule
a. ArrayList - If you only want to add or remove items at the end of your list
use an ArrayList. 

b. LinkedList - If you want to add or remove items from the beginnig or middle, 
then use LinkedList. 

5. Find current time 
//insert 1E5 items to a list 
for(int i=0; i<1E5; i++)
{
	list.add(i);
}
long start = System.currentTimeMillis();
//insert another 1E5 items to the end of the list
for(int i=0; i<1E5; i++)
{
	list.add(i);
}
long end = System.currentTimeMillis();
//calculate difference
System.out.println("Time taken: "+ (end-start) + " ms for "+ type);

6. Add items at the beginnig of the list synatx:
-First comment out the above code where you add items to the end of the list
-Now add items to the beginning of the list
for(int i=0; i<1E5; i++)
{
	list.add(0,i);
}
-O means add items to the beginning of the list

7. ArrayList manage arrays internally. 
[0][1][2][3][4][5].....
-traversing the array is very fast
-adding items at the end is also fast
-intial size is 10 items
-Shfiting items takes a long time. 

8. Linked list how it works?
-Linked list consits of elements where each element
stores/has reference to the previous element. 
-[0]->[1]->[2]->[3]->....
-you only have to update the reference in Linked list
so it is relatively fast

9. Interview question. Difference between how these 
lists work internally. Explain in detail and when 
you should use them. 

/**---------------------------------
| 3 HashMaps
|
*/---------------------------------
1. One member is called the key and the other is called the value. 
-Need to specify type of objet to store in it. 
-Need to implement the hash code and methods if you are implementing 
your own objects. 
-Store in my map Strings keyed  by integers. 
HashMap <Integer, String> map = new HashMap<Integer, String>();

2. Add values
-For simplicity, this will create lookup table in this case:
map.put(5,"Five");
map.put(8,"Eight");
map.put(6,"Six");
map.put(4,"Four");
map.put(2,"Two");

- Once you got your map you got your lookup table. 

3. Get the value of a key
-Here key is not a primitive type
String text = map.get(4);

System.out.println(text);

-If you try to get key does not exits, you will get null. 
-If you try to put the same key , it will override the previous key, 
which is fine. 

4. Iterate 
-Type of key value in angle bracket
-Quite complex 
-
foreach(Map.Entry<Integer, String> entry: map.entrySet())
{
	int key = entry.getKey();
	String value = entry.getValue();
	System.out.println(key+": "+value);
} 

5. Very important
Hash Map is not sorted. 
-Order might not be maintained in hash map very important. 

/**--------------------------------------------------
| 10. Using Iterators
|
*/---------------------------------------------------

1. Create a Linked list called animals
LinkedList<String> animals = new LinkedList<String>();

2. Normal way to iterate through this loop will be through foreach loop. 
-In Java we do not have foreach keyword, but in Java we use for. 


//Add some items first
animal.put("fox");
animal.put("cat");
animal.put("dog");
animal.put("rat");


//Modern iteration, Java 5 or later
for(String animal: animals)
{
	System.out.println(animal);
}

- Run your application. 

3. Before Java 5 , we did not have this kind of foreach syntax. 
The way to do this was using an iterator. Iterator still has 
same usage now. 

Iterator<String> it = animals.iterator();

-Iterator is actually a template type, so you should specify the type 
first. 

- You can do the above action in linked list because list implements
analotical actions in iterable interface. 

-go to the internet and search for Java iterable

-Iterable interface specify that a once class should have one method 
called iterator which will return object of type iterator. 

-Iterator has a method hasNext() which tells you if it has the next
item. 

- next() method returns the next item. 

- remove() method remove the item. 

- Idea behind iterator is, it can point to each item in the list 
inturn. 
For example, 

String value = it.next(); 
System.out.println(value);

- Thhis will give the first value in the list. 


4. Run

5. When you call next again, it will make iterator to move to the next
item again and it will return the value at the same time. 

Normally you use this in a loop. 

while(it.hasNext())
{
	String value = it.next(); 
	System.out.println(value);
}

-hasNext() is an inbuilt method. 

6. Remove an item if it's equal to cat

while(it.hasNext())
{
	String value = it.next(); 
	System.out.println(value);
	if(value.equals("cat"))
	{
		it.remove();
	}
}


7. You can't do that with normal foreach loop. 
-You will get concurrent modification exception error, meaning
you are trying to modify the list concurrently while iterating
through it. And that's not allowed, and we cannot do that. 

8. If you want to remove an item while iterating through it 
you have to use iterator. 

9. Foreach actually uses iterator behind the scenes. So, iterator
is still an integral part of java. 

10. If you want to add items to the linked list while iterating 
through it, instead of using iterator use ListIterator. 
And that will return list iterator. And list iterator infact does
allow you to add items to your list. 



/**--------------------------------------------------
| 12. Deciding Which Java Collection to Use
|
*/---------------------------------------------------
1. Which collection class to use ? INTERVIEW QUESTION
-First thing you should consider is do you want a list, set or a 
map. 

2. 

     &#42; Consider:
     &#42; 1. what you need the collection to do
     &#42; 2. are you using the fastest collection for your purposes
     &#42; (think about insertion/deletion, retrieval and traversal
     &#42;/
    
    //////////////// LISTS ///////////////////////////////////
    
    // Store lists of objects
    // Duplicates are allowed. For example, shopping four bottles of coke. 
    // Objects remain in order, but they are not stored. You can sort it later as opposed to HashMap. 
    // Elements are indexed via an integer, particular number for each item on the list. 
    // cf. shopping list
    // Checking for particular item in list is slow
    // Looking an item up by index is fast
    // Iterating through lists is relatively fast
    // Note: you can sort lists if you want to.
    
    // If you only add or remove items at end of list, use ArrayList.
    List<String> list1 = new ArrayList<String>();
    
    // Removing or adding items elsewhere in the list?
    List<String> list2 = new LinkedList<String>();
    
    ////////////////SETS ///////////////////////////////////
    
    // Only store unique values
    // Great for removing duplicates or want to check for a particular object quickly. 
    // Not indexed, unlike lists. You can't say you want item 15 and get it quickly.
    // Very fast to check if a particular object exists because sets are optimized for finding particular objects. For
    // exaple, if organes in the list. You can find out very quickly. 
    // You can use objects of any type in your collection. 
    // If you want to use your own objects, you must implement hashCode() and equals().
    // By implementing hashCode() and equals() you tell whether two objects are equal or not. 
    
    // Order is unimportant and OK if it changes?
    // HashSet is not ordered.
    Set<String> set1 = new HashSet<String>();
    
    // Sorted in natural order? Use TreeSet - must implement Comparable for custom types
    // (1,2,3 ..., a,b,c.... etc)
    // Uses tree algorithm to sort items
    Set<String> set2 = new TreeSet<String>();
    
    // Elements remain in order they were added
    Set<String> set3 = new LinkedHashSet<String>();
    
    ////////////////MAPS ///////////////////////////////////
    
    // Key value pairs.
    // Like lookup tables. Key could be int or string. 
    // Retrieving a value by key is fast because Maps are optimized
    // If key is integer, and you are going to have consecutive integers then you need to use a list. 
    // But, if the integers are all over the place, then use MAP. 
    // Iterating over map values is very slow, but iterating over key is reasonably fast. 
    // Maps not really optimised for iteration
    // If you want to use your own objects as keys, you must implement hashCode() and equals().
    
    // Keys not in any particular order, and order liable to change.
    Map<String, String> map1 = new HashMap<String, String>();
    
    // Keys sorted in natural order - must implement Comparable for custom types
    Map<String, String> map2 = new TreeMap<String, String>();
    
    // Keys remain in order added 
    Map<String, String> map3 = new LinkedHashMap<String, String>();
    
    // There are also the SortedSet and SortedMap interfaces.


/**--------------------------------------------------
| 13. Complex Data Structure
|
*/---------------------------------------------------
1. Important part of any programming language. 

2. Normally you will be reading this data from a file or json server. 
-List of vehicles and list of drivers, that are qualified to operate those vehicles. 
public static String[] vehicles = {"ambulance", "helicopter", "lifeboat"};

public static String[][] drivers = 
{
	{"Fred","Sue","Pete"},
	{"Sue","Richard","Bob","Fred"},
	{"Pete","Mary","Bob"}	
};

- People are in order, so for lifeboat we will see if Pete is available. If Pete is 
available then we will choose Pete first. 

-Since we are going to look things up by using a string, so we will use maps. 

3. Do we want to use a sorted map?
-No the order of Key does not matter. 

4. Define a variable of interface type, it's considered good practice. 
-Since we dont' want names of people repeated we will use Set
Map<String, Set<String>> personnel = new HashMap<String, Set<String>>(); 


-Instantiate particular type of map, since it's not sorted let's use simpel type of map.
-If you are using Java 6 or < provide data type inside <> after HashMap. 

5. To co-relate two arrays we need to use index. 
-Remember: for simple length, length is stored in a property. 

for(int i=0; i < vehicles.length; i++)
{
	String vehicle = vehicles[i];
	String[] driverList = drivers[i];

	//Create a set to hold drivers
	//To sort set use LinkedHashSet(for orignial order) or TreeSet(for alphabetical order)
	Set<String> driverSet = new LinkedHashSet<String>();


	//Iterate through the list of drivers and add them to the set.
	for(String driver: driverList)
	{
		driverSet.add(driver);
	}

	//Add dirver list to the map
	personnel.put(vehicle, driverSet);
	//Try to see out to see here how it works


	//using curly braces to limit the scope
	{//Brackets just to scope driversList variable so can use again later
		//Iterate over all drivers for a particular vehicle & choose the top guy if he is available
		//Get list from the map
		//Example Usage
		Set<String> driverList = personnel.get("helicopter");

		for(String driver: driverList)
		{
			System.out.println(driver);
		}
	}

	//Iterate through whole thing
	for(String vehicle: personnel.keySet())
	{
		System.out.print(vehicle);
		System.out.println(": ");
		Set<String> driverList = personnel.get(vehicle);

		for(String driver: driverList)
		{
			System.out.print(driver);
			System.out.print(" ");
		}

		System.out.println();
	}

}