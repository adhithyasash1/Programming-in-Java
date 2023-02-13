// Implementing callbacks

public class Myclass{
	
	public void f(){
		..
		Timer t =
		new Timer(this);
		// this object
		// created t
		...
		t.start(); // Start t
		...
	}

	public void timerdone(){...}
}

public class Timer implements Runnable{
	
	// Timer can be invoked in parallel by using this internal interface provided by java called Runnable
	
	private Myclass owner;
	
	public Timer(Myclass o){
		owner = o; // My creator
	}
	
	public void start(){
		...
		owner.timerdone();
		// I’m done
	}
}





// A generic timer

public class Myclass{
	
	public void f(){
		..
		Timer t =
		new Timer(this);
		// this object
		// created t
		...
		t.start(); // Start t
		...
	}

	public void timerdone(){...}
}

public class Timer implements Runnable{
	
	// Timer can be invoked in parallel by using this internal interface provided by java called Runnable
	
	private Object owner;
	
	public Timer(Object o){
		owner = o; // My creator
	}
	
	public void start(){
		...
		((Myclass) owner).timerdone(); // Need to cast owner back to Myclass
		// I’m done
	}
}





// Use interfaces (Define an interface for callback)

public interface Timerowner {
	
	public abstract void timerdone();
}


public class Myclass implements Timerowner {
	public void f(){
		..
		Timer t =
		new Timer(this);
		// this object
		// created t
		...
		t.start(); // Start t
		...
	}

	public void timerdone(){...}
}


public class Timer implements Runnable {
	
	// Timer can be invoked in parallel using this predefined interface Runnable inherent in java
	// so this generic timer class accepts objects of Interface Timerowner 
	// so if a class can implement Timerowner, Timer class can notify that class; both can co-operate 
	
	private Timerowner owner;
	
	public Timer(Timerowner o){
		owner = o; // My creator
	}
	
	public void start(){
		...
		owner.timerdone();
		// I’m done
	}
}


// Modify Myclass to implement Timerowner
// Modify Timer so that owner is compatible with Timerowner
// Interface Runnable enables the timer to run parellely and interrupt Myclass whenever its timer is done
// this Concurrency is enabled thru interface Runnable which is predefined in java


