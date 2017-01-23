package stringTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("012345");
		
		sb.delete(0, 2);
		System.out.println(sb);

	}

}
