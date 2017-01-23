package inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceTest1 {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Test");
		String string = stringBuilder.toString();
		List<String> list = new ArrayList<>();
		System.out.println(stringBuilder.getClass());
		System.out.println(string.getClass());
		System.out.println(list.getClass());
	}
}
