package lamdaFunction;

@FunctionalInterface
interface MyI1 {
	int getInt();
}

@FunctionalInterface
interface MyI2 {
	int getInt(int x);
}

@FunctionalInterface
interface MyI3 {
	int getInt(int x, int y);
}

@FunctionalInterface
interface MyI4 {
	boolean get(String a, String b);
}

@FunctionalInterface
interface MyI5 {
	void noGet(String a, String b);
}

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//方法未帶參數
		MyI1 myI11 = () -> 100;
//		MyI1 myI12 = -> 100;
		
		//方法帶1個參數
		MyI2 myI21 = (int x) -> 2*x;
		MyI2 myI22 = (x) -> 2*x;
		MyI2 myI23 = x -> 2*x;
		
		//方法帶2個以上參數
		MyI3 myI31 = (int x, int y) -> x+y;
		MyI3 myI32 = (x, y) -> x+y;
//		MyI3 myI33 = x, y -> x+y;
		
		//方法有回傳
		MyI4 myI41 = (a, b) -> a.startsWith(b);
		MyI4 myI42 = (a, b) -> a.length() > b.length();
		
		//方法無回傳
		MyI5 myI51 = (a, b) -> a.startsWith(b);
//		MyI5 myI52 = (a, b) -> a.length() > b.length();
	}

}
