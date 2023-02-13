/*
Streams

Generate a stream of values from a
collection

Operations transform input streams to
output streams

Terminate with a result
*/

long count = words.stream()
.filter(w -> w.length() > 10)
.count();


/*
Processing can be parallelized
	filter() and count() in parallel
*/

long count = words.stream()
.filter(w -> w.length() > 10)
.count();

long count = words.parallelStream()
.filter(w -> w.length() > 10)
.count();








/*
Creating streams

1)	Apply stream() to a collection
	Part of Collections interface

2)	Use static method Stream.of() for
	arrays

3)	Static method Stream.generate()
	generates a stream from a function
	
	Provide a function that produces
	values on demand, with no argument

4)	Stream.iterate() | a stream of dependent values

	Initial value, function to generate the
	next value from the previous one
	
	Terminate using a predicate
*/

List<String> wordlist = ...;
Stream<String> wordstream = wordlist.stream();

String[] wordarr = ...;
Stream<String> wordstream = Stream.of(wordarr);

Stream<String> echos =
Stream.generate(() -> "Echo");

Stream<Double> randomds =
Stream.generate(Math::random);

Stream<Integer> integers =
Stream.iterate(0, n -> n+1)

Stream<Integer> integers =
Stream.iterate(0, n -> n < 100, n -> n+1)







/*
Processing streams

1)	filter() to select elements
	Takes a predicate as argument
	Filter out the long words

2)	map() applies a function to each
	element in the stream.
	
	Extract the first letter of each 
	long word

	What if map() function generates a list?
		Suppose we have explode(s) that
		returns the list of letters in s
		
		map() produces stream with nested
		lists

3)	flatMap() 
	flattens (collapses) nested
	list into a single stream
*/

// 1
List<String> wordlist = ...;

Stream<String> longwords =
wordlist.stream()
.filter(w -> w.length() > 10);

// 2
List<String> wordlist = ...;

Stream<String> startlongwords =
wordlist.stream()
.filter(w -> w.length() > 10)
.map(s -> s.substring(0,1));

// 3
List<String> wordlist = ...;

Stream<String> startlongwords =
wordlist.stream()
.filter(w -> w.length() > 10)
.flatMap(s -> explode(s));








/*
Stream transformations

1) 	Make a stream finite | limit(n)
		Generate 100 random numbers

2)	Skip n elements | skip(n)
		Discard first 10 random numbers

3)	Stop when element matches a criterion
	| takeWhile()
		Stop with number smaller than 0.5

4)	Start after element matches a criterion
	| dropWhile()
		Start after number larger than 0.05

5)	Can also combine streams, extract
	distinct elements, sort, ...
*/

Stream<Double> randomds =
Stream.generate(Math::random).limit(100);

Stream<Double> randomds =
Stream.generate(Math::random).skip(10);

Stream<Double> randomds =
Stream.generate(Math::random)
.takeWhile(n -> n >= 0.5);

Stream<Double> randomds =
Stream.generate(Math::random)
.dropWhile(n -> n <= 0.05);











/*
Reducing a stream to a result

1)	Number of elements | count()
		Count random numbers larger than 0.1

2)	Largest and smallest values seen
		max() and min()
		
		Requires a comparison function
	
		What happens if the stream is empty?
		Return value is optional type | later

3)	First element | findFirst()
		First random number above 0.999
		
		Again, deal with empty stream

4)	And more ...
*/

long countrand =
	Stream.generate(Math::random)
	.limit(100).
	.filter(n -> n > 0.1)
	.count();

Optional<Double> maxrand =
	Stream.generate(Math::random)
	.limit(100)
	.filter(n -> n < 0.001)
	.max(Double::compareTo);

Optional<Double> firstrand =
	Stream.generate(Math::random)
	.limit(100)
	.filter(n -> n > 0.999)
	.findFirst();

