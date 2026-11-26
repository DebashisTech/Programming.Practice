package Number.Mathematical.Programming.java;

/* Swapping means exchanging the values of two variables
   We use a temporary variable (temp) to store one variable's value so that it is not lost during swapping.
 */

public class SwapTwoNumUsingtemporaryvariable {
	public static void main(String[] args) {
		int a = 23;
		int b = 90;

		int temp = a;
		a = b;
		b = temp;

		System.out.println("a : " + a); // a : 90
		System.out.println("b : " + b); // b : 23
	}

}
