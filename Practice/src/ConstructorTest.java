
public class ConstructorTest {
	String string = "test";
	
	public ConstructorTest(String string) {
		this.string = string;
	}
	
	void print() {
		System.out.println(string);
	}
	
	public static void main(String[] strings) {
		new ConstructorTest("java").print();
	}
}
