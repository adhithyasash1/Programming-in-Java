/*
Type Inference

Alternative to Type Declarations

Derive type information from context.
For instance, s should be String
given, s = "Hello, " + "world";
*/


/*
Type inference in Java
	-> Java allows limited type inference
	-> Only for local variables in functions
	-> Not for instance variables of a class

Use generic var to declare variables
	-> Must be initialized when declared
	-> Type is inferred from initial value

Be careful about format for numeric
constants

For classes, infer most constrained type
	e is inferred to be Manager
	Manager extends Employee
	If e should be Employee, declare
	explicitly
*/

var b = false; // boolean
var s = "Hello, world"; // String
var d = 2.0; // double
var f = 3.141f; // float
var e = new Manager(...); // Manager

