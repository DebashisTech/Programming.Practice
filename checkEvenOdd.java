package Number.Mathematical.Programming.java;

/* An even number is a number that is completely divisible by 2 (remainder is 0)
   An odd number is a number that is not completely divisible by 2 (remainder is 1).
 */

public class checkEvenOdd {
	public static void main(String[] args) {
		int num = 14;
		if (num % 2 == 0) {
			System.out.println(num + " is a Even no"); // 14 is a Even no
		} else if (num % 2 != 0) {
			System.out.println(num + " is a Odd no");
		}
	}

}
