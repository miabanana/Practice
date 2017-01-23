package inheritance;

interface Z {}

class InheritanceTest implements Z {
	public String toString() {
		return "X";
	}
	
	public static void main(String[] args) {
		Y y = new Y();
		InheritanceTest x = y;
		Z z = x;
		System.out.println("x = " + x);
		System.out.println("(Y)x = " + (Y)x);
		System.out.println("z = " + z);
	}

}

class Y extends InheritanceTest {
	public String toString() {
		return "Y";
	}
}
