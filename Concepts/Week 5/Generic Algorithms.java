/*
Bounded type parameters are key to the implementation of generic algorithms. 

Consider the following method that counts the number of elements in 
an array T[] that are greater than a specified element elem.
*/

public static <T> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
        if (e > elem)  // compiler error
            ++count;
    return count;
}

/*
The implementation of the method is straightforward, but it does not compile 
because the greater than operator (>) applies only to primitive types such as 
short, int, double, long, float, byte, and char. 

You cannot use the > operator to compare objects. To fix the problem, 
use a type parameter bounded by the Comparable<T> interface:
*/

public interface Comparable<T> {
    public int compareTo(T o);
}

public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
        if (e.compareTo(elem) > 0)
            ++count;
    return count;
}

