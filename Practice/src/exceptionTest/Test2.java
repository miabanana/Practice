package exceptionTest;

public class Test2 {
	void read(int c) throws Exception {
		System.out.println("Reading");
	}
	
	void check(int c) throws RuntimeException {
		System.out.println("Checking");
	}
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		int c = 999;
		test2.check(c);
//		test2.read(c);
	}

}
