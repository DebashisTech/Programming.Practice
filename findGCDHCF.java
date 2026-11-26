package Number.Mathematical.Programming.java;

/* The greatest number that divides two or more numbers exactly without leaving a remainder
     GCD (Greatest Common Divisor) 
     HCF (Highest Common Factor).
 */

public class findGCDHCF {
	public static void main(String[] args) {
		int a = 12;
		int b = 18;

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else if (b > a) {
				b = b - a;
			}
		}
		System.out.println("GCD / HCF is : " + a); // GCD / HCF is : 6
	}

}
