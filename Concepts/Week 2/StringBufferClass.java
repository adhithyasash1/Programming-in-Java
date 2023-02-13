/*
StringBuffer Class

The String class has a large number of methods available, but it doesn’t
contain any methods for manipulating strings. That’s because strings in
Java are immutable. Once a String object has been created, the contents
can’t be changed unless the whole string is completely replaced. Because
most strings are never modified, this was done on purpose to make the
String class more efficient. For cases when you need a modifiable string,
you can use the StringBuffer class, which is a mutable string object.
*/

StringBuffer sb = new StringBuffer("Hello");

sb.append(" World"); // add to end of string
sb.delete(0, 5); // remove 5 first characters
sb.insert(0, "Hello"); // insert string at beginning

/*
You can convert a StringBuffer object back into a regular string with
the toString method, which returns a string representation of the object.
It exists for every class in Java, because it’s defined by Object, which is
inherited by all classes.
*/

String s = sb.toString();