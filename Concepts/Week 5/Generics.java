// Generics


/* 
Polymorphic reverse in Java 

Here you should think of this angle bracket as a Type Quantifier. It saying, for every
type reverse is the function which takes an array of type T and reverses it and that type T is used
inside. So, that is the main thing. So, the T that is used here, so whatever type of array you pass
to reverse, automatically fixes the type of the object which is going to be used inside. So, the
type T is, in this case, inferred.

The moment you pass an array this type T is kind of matched to the type of the array that 
you pass and then internally it will run with an appropriate variable tempobj of that type.
*/



public <T> void reverse (T[] objarr){
	T tempobj;
	int len = objarr.length;
	for (i = 0; i < n/2; i++){
		tempobj = objarr[i];
		objarr[i] = objarr[(n-1)-i];
		objarr[(n-1)-i] = tempobj;
	}
}


/* 
Searching for a value of incompatible type is now a compile-time error 

This equality would ensure that any way two objects of incomparable type would not get compared. 
So, the equality has this built in feature that if I throw two objects of different type at it, 
it will always come out to be unequal.

We can guarantee is that if somebody calls this find with two
incompatible things, you will actually get a compiler error.

I have now constrained that this type of array must match this type of object that I am looking for, 
actually a compile time, I can check that I am not doing an inconsistency. So, even though 
it does not affect the functioning of find at all, it is still a useful check to make sure 
that this function is being called in a sensible way.
*/

public <T> int find (T[] objarr, T o){
	int i;
	for (i = 0; i < objarr.length; i++){
		if (objarr[i] == o) {return i};
	}
	return (-1);
}


/* Polymorphic arraycopy Source and target types must be identical 

For any type T, I can take an array of type T, and copy from that source array 
into another area of type T, which is the target array, so the rest of the code 
does not change at all. And this assignment is always guaranteed to work because
both target i and source i have exactly the same thing.
*/

public static <T> void arraycopy (T[] src, T[] tgt){
	int i,limit;
	limit = Math.min(src.length,tgt.length);
	for (i = 0; i < limit; i++){
		tgt[i] = src[i];
	}
}



/* 
A more generous arraycopy

Source and target types may be different
Source type must extend target type

So, this assignment from target i, from source i to target i will always work,
because wherever I am expecting a variable of type T, I am okay with the variable of type S.

S is a subtype of T, whereas S has all functionalities of T and more
T can be copied into S but vice versa not possible tho 

that is why it works in the case, source becomes S and target becomes T. 
*/


public static <S extends T,T> void arraycopy (S[] src, T[] tgt){
	int i,limit;
	limit = Math.min(src.length,tgt.length);
	for (i = 0; i < limit; i++){
		tgt[i] = src[i];
	}
}


