package com.bridgelabz.testmaximum;

public class TestMaximum {
	/* Welcome message */
	public static void printWelcomeMessage() {
		System.out.println("Welcome to the Test Maximum Program");
	}

	/* maximum of 3 Integer values at test position */
	public static Integer maximumInteger(Integer firstValue, Integer secondValue, Integer thirdValue) {
		Integer maximumValue = firstValue;
		if (secondValue.compareTo(maximumValue) > 0)
			maximumValue = secondValue;
		if (thirdValue.compareTo(maximumValue) > 0)
			maximumValue = thirdValue;
		return maximumValue;
	}
}
