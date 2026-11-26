package Number.Mathematical.Programming.java;

/* An Armstrong number is a number whose sum of its digits raised to the power of the total number of digits is equal to the original number
  153 = \(1^3 + 5^3 + 3^3 = 153\) → Armstrong
 */

public class findAmstrongNumber {
	public static void main(String[] args) {

		int num = 153;
		int original = num;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (original == sum) {
			System.out.println(original + " is a Amstrong number"); // 153 is a Amstrong number

		} else {
			System.out.println(original + " is not a Amstrong number");
		}
	}

}
