package inheritance;

abstract class B1 {
	public abstract void m1();
	public void m2() {
		System.out.println("Gold");
	}
}

abstract class B2 extends B1 {
	public abstract void m3();
	public void m1() {
		System.out.println("Purple");
	}
	public void m2() {
		System.out.println("Dark");
	}
}

public class AbstractTest extends B2 {

	public static void main(String[] args) {
		B2 b2 = new AbstractTest();
		b2.m1();
		b2.m2();
		b2.m3();
	}

	public void m1() {
		System.out.println("Yellow");
	};
	
	public void m2() {
		System.out.println("Pink");
	};
	
	@Override
	public void m3() {
		System.out.println("Blue");
		
	}

}
