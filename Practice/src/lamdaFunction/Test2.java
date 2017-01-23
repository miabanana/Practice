package lamdaFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
	public static void testAge(java.util.List<Employee> list, Predicate<Employee> predicate) {
		for(Employee pEmployee : list) {
			if (predicate.test(pEmployee)) {
				System.out.println(pEmployee.name);
			}
		}
	}
	
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Amy", 23), new Employee("Mia", 23), 
				new Employee("Tim", 41), new Employee("Jim", 46));
		
		testAge(list, p -> p.getAge() > 40);
		testAge(list, (p) -> p.getAge() > 40);
//		testAge(list, () -> p.getAge() >40);
		testAge(list, (Employee p) -> {return p.getAge() > 40;});
//		testAge(list, (Employee p) -> {p.getAge() > 40;});
		testAge(list, (Employee p) -> p.getAge() > 40);
//		testAge(list, Employee p -> p.getAge() > 40);
	}
}

class Employee {
	String name;
	Integer age;
	public Employee(String n, Integer a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
}