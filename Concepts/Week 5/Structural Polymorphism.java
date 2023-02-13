/*
Structural Polymorphism using Universal super class Object
*/

public void reverse(Object[] objarr) {
	Object tempobj;
	int len = objarr.length;
	for (i = 0; i < n/2; i++) {
		tempobj = objarr[i];
		objarr[i] = objarr[(n-1)-i];
		objarr[(n-1)-i] = tempobj;
		}
}

public int find(Object[] objarr, Object o) {
	int i;
	for (i = 0; i < objarr.length; i++){
		if (objarr[i] == o) {return i}; // '==' translates to Object.equals() which is a predefined method in Object class
	}
	return (-1);
}




