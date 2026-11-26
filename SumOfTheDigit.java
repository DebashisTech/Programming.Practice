package Number.Mathematical.Programming.java;

// The sum of digits means adding all individual digits of a number to get a single sum.

public class SumOfTheDigit {
	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println("Sum of the digit is : " + sum); // Sum of the digit is : 10

	}

}
