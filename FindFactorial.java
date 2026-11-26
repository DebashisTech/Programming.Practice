package Number.Mathematical.Programming.java;

// The factorial of a number is the product of all positive integers from 1 to that number. It is represented by the symbol

public class FindFactorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;

		while (num > 0) {
			fact = fact * num;
			num--;
		}
		System.out.println("The factorial is : " + fact); // The factorial is : 120
	}

}
