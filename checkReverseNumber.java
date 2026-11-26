package Number.Mathematical.Programming.java;

// Reverse a Number: Reversing a number means arranging its digits in the opposite order.

public class checkReverseNumber {
	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;

		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println("The reverse no is : " + rev); // The reverse no is : 4321
	}

}
