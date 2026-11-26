package Number.Mathematical.Programming.java;

/* A positive number is a number greater than zero
   A negative number is a number less than zero
   Zero is neither positive nor negative.
 */

public class checkPossitiveNegativezero {
	public static void main(String[] args) {
		int num = 123;

		if (num > 0) {
			System.out.println(num + " is a Possitive no");// 123 is a Possitive no
		} else if (num < 0) {
			System.out.println(num + " is a Negative no");
		} else {
			System.out.println("Zero");
		}
	}

}
