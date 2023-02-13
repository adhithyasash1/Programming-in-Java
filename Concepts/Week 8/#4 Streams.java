import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;

import java.util.stream.Collectors;


public class Practice2Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		int sum = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		//Stream of number -> One result value
			//Combine them into one result => One value
			//0 and FP02Functional::sum
//		return numbers.stream().reduce(0, FP02Functional::sum);
//		return numbers.stream().reduce(0, (a,b) -> a+b);
		return numbers.stream().reduce(0, Integer::sum);
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}
}



public class Practice3Functional {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		printAllCoursesSortedByCourseLengthInListFunctional(courses);
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		printNumbersInListSortedByDesc(numbers);
		System.out.println(squaresOfNumbersInListFunctional(numbers));
		System.out.println(subListOfEvenNumbersInListFunctional(numbers));
		System.out.println(subListOfCourseLengthsInListFunctional(courses));
	}

	private static List<Integer> subListOfEvenNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
	}
	
	private static List<Integer> subListOfCourseLengthsInListFunctional(List<String> courses) {
		return courses.stream().map(c->c.length()).collect(Collectors.toList());
	}

	private static List<Integer> squaresOfNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream().map(n->n*n).collect(Collectors.toList());
	}

	private static void printNumbersInListSortedByDesc(List<Integer> numbers) {
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);		
	}

	private static void printAllCoursesSortedByCourseLengthInListFunctional(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}
}



public class Practice4MethodReferences {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		courses.stream().sorted(Comparator.comparing(x -> x.length())).map(String::toUpperCase).forEach(System.out::println);
	}
}



public class Practice5Functional {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000),
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000),
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000),
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000)
		);
		
		System.out.println(courses.stream().filter(c->c.getName().length()>11).map(c->c.getName().toUpperCase()).findFirst());
		
		List<String> courseList = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		/*remove all*/
		List<String> modifiableList = new ArrayList<>(courseList);
		modifiableList.replaceAll(s->s.toUpperCase());
		System.out.println(modifiableList);
		
		/*remove if*/
		modifiableList.removeIf(c->c.length()<6);
		System.out.println(modifiableList);
	}
}



