package Number.Mathematical.Programming.java;

// The smallest positive number that is exactly divisible by two or more given numbers.

public class findLCM {
	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		int lcm;

		if (a > b) {
			lcm = a;
		} else {
			lcm = b;
		}
		while (true) {
			if (lcm % a == 0 && lcm % b == 0) {
				break;
			}
			lcm++;
		}
		System.out.println("The LCM is : " + lcm); // The LCM is : 36
	}

}
