package Number.Mathematical.Programming.java;

/* A perfect number is a positive number that is equal to the sum of its proper divisors (excluding itself)
  	6 = 1 + 2 + 3 → Perfect Number
	28 = 1 + 2 + 4 + 7 + 14 → Perfect Number
 */

public class PerfectNumber {
	public static void main(String[] args) {
		int num = 6;
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println(num + " is a Perfect number"); // 6 is a Perfect number

		} else {
			System.out.println(num + " is not a Perfect number");
		}
	}

}
