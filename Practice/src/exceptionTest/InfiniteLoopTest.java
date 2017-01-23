package exceptionTest;

public class InfiniteLoopTest {

	public static void main(String[] args) {
		int row = 11;
		for(;row>0;) {
			int col = row;
			while (col>=0) {
				System.out.print(col + " ");
				col -= 2;
			}
			
			row = row/col;
		}

	}

}
