package Number.Mathematical.Programming.java;

public class SwapTwoNumberWithotTemporaryvariable {
	public static void main(String[] args) {
		int a = 34;
		int b = 90;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a : " + a); // a : 90
		System.out.println("b : " + b); // b : 34

	}

}
