package overload;

public class OverloadTest {

	abstract class X {
		public abstract void method();
	}
	
	interface Y {
		public void method();
	}
	
//	class A extends X implements Y {
//		public void methodTest() {}
//	}
	
	abstract class B extends X implements Y {
		
	}
}
