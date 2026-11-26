package Number.Mathematical.Programming.java;

/* The Fibonacci series is a sequence of numbers in which each number is the sum of the previous two numbers
   It starts with 0 and 1.
 */

public class findFibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.print(a + " " + b + " ");

		for (int i = 1; i <= 6; i++) {
			c = a + b;
			System.out.print(c + " "); // 0 1 1 2 3 5 8 13
			a = b;
			b = c;
		}
	}

}

/*
  int n = 10; int a = 0; int b = 1;
  
  for (int i = 1; i <= n; i++) {
  
  System.out.print(a + " ");
  
  int c = a + b;
   a = b; 
   b = c;
 */
