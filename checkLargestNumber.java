package Number.Mathematical.Programming.java;

// The largest number is the number that has a greater value when compared with another number.

public class checkLargestNumber {
	public static void main(String[] args) {
		int a = 12;
		int b = 56;

		if (a > b) {
			System.out.println(a + " is the largest no");
		} else if (b > a) {
			System.out.println(b + " is the largest no"); // 56 is the largest no
		} else {
			System.out.println("Both are equal no");
		}
	}

}
