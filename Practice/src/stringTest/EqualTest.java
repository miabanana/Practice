package stringTest;

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Jim";
		String s2 = new String("Jim");
		
		//case A
		System.out.print("case A: ");
		String s3 = s2;
		if (s1==s3) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//case B
		System.out.print("case B: ");
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//case C
		System.out.print("case C: ");
		String s4 = s2;
		if (s1.equals(s4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		//case D
		System.out.print("case D: ");
		if (s1.toLowerCase() == s2.toLowerCase()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		//case E
		System.out.print("case E StringBuilder: ");
		StringBuilder sb = new StringBuilder(0);
		String s = "";
		if (sb.equals(s)) {
			System.out.println("sb.equals(s)");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("sb.toString().equals(s.toString())");
		} else {
			System.out.println("other case");
		}
		
		//case F
		System.out.print("case F: ");
		String string1 = "Duke";
		char c[] = {'D','u','k','e'};
		String string2 = null;
		
		for(char c1 : c) {
			string2 += c1;
		}
		
		if (string2.equals(string1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No, string1 = "+string1+", string2 = "+string2);
		}
	}

}
