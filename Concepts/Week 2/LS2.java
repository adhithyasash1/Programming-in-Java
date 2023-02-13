class Student {
	
	private String name;
	private double marks [];

	public Student(String name, double[] marks){	
		this.name = name;
		this.marks = marks;
	}

	public String getName(){
		return(this.name);
	}

	public double findTotal(){
		double total = 0;	
		for (double i :this.marks){
			total += i;
		}
		return(total);
	}
}

class Main {
	
	public static String getMax(Student[] student) {
		double max_marks= 0.0;
		String max_student = "";
		for (Student i : student) {
			double total_marks = i.findTotal();
			if (total_marks > max_marks){
				max_student = i.getName();
				max_marks = total_marks;
			}
		}
		return max_student;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		for (int i = 0; i < 3; i++) {
			String name = sc.next();
			double[] m = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			arr[i] = new Student(name, m);
		}
		System.out.println(getMax(arr));
	}
}
