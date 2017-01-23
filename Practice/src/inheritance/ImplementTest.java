package inheritance;

public class ImplementTest {
	public static void main(String[] args) {
		TestInterface testInterface = new Test(10);
		testInterface.method(10);
//		testInterface.methodA(10); //interface只取得到自己定義的method
		
		Test test = (Test)testInterface;
		test.method(10);
		test.methodA(10);
	}
}

class Test implements TestInterface {
	
	public Test(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method(int i) {
		// TODO Auto-generated method stub
		
	}
	
	public void methodA(int i) {
		
	}
}
