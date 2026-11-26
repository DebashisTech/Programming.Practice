package Number.Mathematical.Programming.java;

// A prime number is a number that is greater than 1 and has exactly two factors: 1 and itself.

public class checkPrimeNumber {
	public static void main(String[] args) {
		int num = 17;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " is a Prime number"); // 17 is a Prime number
		} else {
			System.out.println(num + " is not a Prime number");
		}
	}

}
