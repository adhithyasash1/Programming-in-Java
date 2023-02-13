public class Employee{

	private String name;
	private double salary;
	
	// Some Constructors ...

	// Employee constructor 1 
	public Employee(String n, double s){
			
			name = n; salary = s;
	
	}
	
	// Employee constructor 2
	public Employee(String n){
			
			this(n,500.00);
	
	}
	
	// "mutator" methods
	
	public boolean setName(String s){ ... }
	public boolean setSalary(double x){ ... }
	
	// "accessor" methods
	
	public String getName(){ ... }
	public double getSalary(){ ... }
	
	// other methods
	
	public double bonus(float percent){
		
		return (percent/100.0)*salary;
	
	}
}

public class Manager extends Employee{
	
	private String secretary;
	
	// constructors

	public Manager(String n, double s, String sn){
		
		super(n,s); /* super calls Employee constructor 1  */
		secretary = sn;
	
	}


	public boolean setSecretary(name s){ ... }  // mutator
	public String getSecretary(){ ... }			// accessor

	double bonus(float percent){

		return 1.5*super.bonus(percent);
		
	}

}

