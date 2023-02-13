/*
Interface Deque, double ended queue methods
*/

boolean addFirst(E element);
boolean addLast(E element);
boolean offerFirst(E element);
boolean offerLast(E element);
E pollFirst();
E pollLast();
E getFirst();
E getLast();
E peekFirst();
E peekLast();












/*
Maps

Key-value structures come under the Map interface

Two type parameters :
	K is the type for keys
	V is the type for values

get(k) fetches value for key k
put(k,v) updates value for key k
*/

public interface Map<K,V>{
	V get(Object key);
	V put(K key, V Value);
	boolean containsKey(Object key);
	boolean containsValue(Object value);
	...
}


// Map has the following default method
V getOrDefault(Object key, V defaultValue)

// For instance
Map<String, Integer> scores = ...;
int score = scores.getOrDefault(bat,0);

// sets score to 0 if key bat is not present Now, we can update the entry for key bat as follows
scores.put(bat,
scores.getOrDefault(bat,0)+newscore); // Add newscore to value of bat

// Alternatively, use putIfAbsent() to initialize a missing key
scores.putIfAbsent(bat,0);
scores.put(bat,scores.get(bat)+newscore);

// Or use merge()
scores.merge(bat,newscore,Integer::sum);

// Initialize to newscore if no key bat Otherwise, combine current value with newscore using Integer::sum (Return type is Integer and sum is the defined function)






/*
Extracting keys and values
*/

Set<K> keySet();
Collection<V> values();
Set<Map.Entry<K, V>> entrySet()

// Can now iterate through a Map

Set<String> keys = strmap.keySet();
for (String key : keys) {
	// do something with key
}

// Use entrySet() to operate on key and associated value without looking up map again

for (Map.Entry<String, Employee> entry : staff.entrySet()) {
	String k = entry.getKey();
	Employee v = entry.getValue();
	// do something with k, v
}

