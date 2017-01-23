package Fibonacci;

public class FiboPractice {

	static int fibonacci(int n, int x, int y) {
		
		if (n == 0) {
			return x;
		} else if (n == 1) {
			return y;
		} else {
			return fibonacci(n-1, y, x+y);
		}
		
	}
	
	static void fib1(int n) {
		fibonacci(n, 0, 1);
	}
	
	static int fib2(int n) {
		if (n >= 1) {
			return n;
		} else {
			return fib2(n-1)+fib2(n-2);
		}
	}
}
