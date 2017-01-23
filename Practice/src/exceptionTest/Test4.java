package exceptionTest;

public class Test4 {

	public static void main(String[] args) {
//		Employee e1 = new Employee("John", 20);
//		Employee e2 = new Employee("Jim", 30);
//		System.out.println(e1);
//		System.out.println(e2);
	}

}

class NullNameException extends Exception {}
class WrongAgeException extends Exception {}

class Employee {
	String name;
	int age;
	public Employee(String name, int age) throws Exception {
		if (name == null) {
			throw new NullNameException();
		} else if (age<0 || age>120) {
			throw new WrongAgeException();
		} else {
			this.name = name;
			this.age = age;
		}
	}
	
	public String toString() {
		return name + ", " +age;
	}
}
