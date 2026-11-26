package Number.Mathematical.Programming.java;

// Counting the number of digits means finding how many individual digits are present in a given number.

public class CountNumber {
	public static void main(String[] args) {
		int num = 12345;
		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count of the no : " + count); // Count of the no : 5
	}

}
