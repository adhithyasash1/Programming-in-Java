// Consider the following assignment

Employee e = new Manager(...)


/* Can we get e.setSecretary() to work?
	 
	 Static type-checking disallows this */


// Type casting — convert e to Manager

((Manager) e).setSecretary(s)


/* Cast fails (error at run time) if e is not
	a Manager ie if Employee e = new Manager(...) is not declared initially */


// Can test if e is a Manager

if (e instanceof Manager){
	((Manager) e).setSecretary(s);
}


// Can also use type casting for basic types

double d = 29.98;
int x = (int) d;

/* converts double variable into an int variable but be careful about implications, while converting to 
	int, we may not get 29.98 instead we get 29 hence read about type casting from java references */
