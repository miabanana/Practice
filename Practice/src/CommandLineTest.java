
public class CommandLineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("arg[" + i + "] = " + args[i]);
		}
		
	}
	
	public static void main(int[] args) {
		System.out.println("main with int : " + args[0]);
	}
	
}
