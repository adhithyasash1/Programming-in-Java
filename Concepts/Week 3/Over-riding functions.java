// For instance, a class Date with instance variables day, month and year

// May wish to override equals() to compare the object state, as follows

public boolean equals(Date d){
	
	return ((this.day == d.day) && (this.month == d.month) && (this.year == d.year));

}

// Unfortunately, boolean equals(Date d) does not override boolean equals(Object o)

// Should write, instead

public boolean equals(Object d){
	
	if (d instanceof Date){
		
		Date myd = (Date) d;
		return ((this.day == myd.day) && (this.month == myd.month) && (this.year == myd.year));
	
	}
	
	return(false);

}



// Note the run-time type check and the cast


