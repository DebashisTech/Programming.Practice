package Number.Mathematical.Programming.java;

// A Palindrome Number is a number that remains the same when its digits are reversed.

public class checkPallindromeOrNot {
	public static void main(String[] args) {
		int num = 12321;
		int original = num;
		int rev = 0;

		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println("Original no : " + original); // Original no : 12321
		System.out.println("Reverse no : " + rev); // Reverse no : 12321

		if (original == rev) {
			System.out.println(original + " is a Pallindrome"); // 12321 is a Pallindrome
		} else {
			System.out.println(original + " is not a Pallindrome");
		}
	}

}
