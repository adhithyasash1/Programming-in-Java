/*
Write a Java program that takes as input 4 Shop objects and the list of Shop objects
with attributes shop name, and number of items sold nsold. The program should add
each customer name as key and number of items as value to the map object. After
adding all objects to the map, display the shop name which has sold maximum number
of items as shown in the test cases. Complete the program as specified below:

Class Shop that has the following members :

-> String name, int nsold as private instance variable
-> Constructor to initialize the name and nsold
-> Accessor methods to all instance variables

Class MapTest has the following members:

You should define method public static void printShopName 
(ArrayList<Shop> sList) that does the following:

->	Iterates over array sList such that in each iteration, add each customer
	name as key and number of items as value to the map object.
->	Print the shop name which has sold maximum number of items.

main method has the following functionality
->	Creates a list of 4 Shop objects.
-> 	Invokes method printShopName (list) to print the shop name which has
	sold maximum number of items.

*/