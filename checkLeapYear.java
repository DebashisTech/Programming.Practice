package Number.Mathematical.Programming.java;

// A leap year is a year that contains 366 days instead of 365 days. February has 29 days instead of 28 days

public class checkLeapYear {
	public static void main(String[] args) {
		int year = 2016;

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a Leap year"); // 2016 is a Leap year
		} else {
			System.out.println(year + " is not a Leap year");
		}
	}

}
