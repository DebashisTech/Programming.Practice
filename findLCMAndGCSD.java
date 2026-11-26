package Number.Mathematical.Programming.java;

public class findLCMAndGCSD {
	public static void main(String[] args) {
		int a = 12;
		int b = 18;

		int x = a;
		int y = b;

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else if (b > a) {
				b = b - a;
			}
		}
		int gcd = a;
		int lcm = (x * y) / gcd;

		System.out.println("GCD : " + gcd); // GCD : 6
		System.out.println("LCM : " + lcm); // LCM : 36
	}

}

/* "I calculate GCD using the subtraction-based Euclidean algorithm
   First, I store the original values of both numbers because they change during the calculation
   Once both numbers become equal, I get the GCD. Then I calculate LCM using the formula (a × b) / GCD."
 */   
