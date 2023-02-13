// Querying a database

// Object stores train reservation information
// Can query availability for a given train no, date


public class RailwayBooking {
	private BookingDB railwaydb;

	public int getStatus(int trainno, Date d) {
		// Return number of seats available
		// on train number trainno on date d
		...
	}
}

// railwaydb is an object of BookingDB which contains all info of the database
// To control spamming by bots, require user to log in before querying

// Need to connect the query to the logged in status of the user






// Interaction with state

public class RailwayBooking {
	private BookingDB railwaydb;

	public QueryObject login(String u, String p){
		QueryObject qobj;
		if (valid_login(u,p)) {
			qobj = new QueryObject();
			return(qobj);
		}
	}
	private class QueryObject {
		public int getStatus(int trainno, Date d) {
			// Return number of seats available
			// on train number trainno on date d
			...
		}
	}
}

// Need to connect the query to the logged in status of the user? Use objects!
// On log in, user receives an object that can make a query
// Object is created from private class that can look up railwaydb






// How does user know the capabilities of private class QueryObject? Use an interface!

// Interface describes the capability of the object returned on login

public interface QIF{
	public abstract int
	
	getStatus(int trainno, Date d);
}

public class RailwayBooking {
	private BookingDB railwaydb;
	
	public QIF login(String u, String p) { // the type of object that it gets is no longer QueryObject but its a QIF, since its an interface QIF implementation
	QueryObject qobj;
	if (valid_login(u,p)) {
		qobj = new QueryObject();
		return(qobj);
	}
}

	private class QueryObject implements QIF {
		
		public int getStatus(int trainno, Date d){
		...
		}
	}
}


// Query object allows unlimited number of queries
// Limit the number of queries per login? Maintain a counter
// Add instance variables to object returned on login
// Query object can remember the state of the interaction

public class RailwayBooking {
	private BookingDB railwaydb;
	
	public QIF login(String u, String p){
		QueryObject qobj;
		if (valid_login(u,p)) {
			qobj = new QueryObject();
			return(qobj);
		}
	}

	private class QueryObject implements QIF {
		private int numqueries;
		private static int QLIM;
		
		public int getStatus(int trainno, Date d){
			if (numqueries < QLIM){
				// respond, increment numqueries
			}
		}
	}
}

// Combine private classes with interfaces
// External interaction is through an object of the private class
// Capabilities of this object are known through a public interface
// Object can maintain instance variables to track the state of the interaction


/* if we combine private class with the interface then we can provide controlled
access to the state of an object. We can have some kind of regulated way in which we can
interact with an object. */