package exceptionTest;

public class Test3 {
	private static void doOne() {
		doAnother();
	}
	
	private static void doAnother() {
//		throw new Exception();
	}

	public static void main(String[] args) {
		doOne();
	}

}
