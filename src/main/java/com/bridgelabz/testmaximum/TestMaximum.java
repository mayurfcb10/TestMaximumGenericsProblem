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

	/* maximum of 3 Float values at test position */
	public static Float maximumFloat(Float first, Float second, Float third) {
		Float maximumValue = first; // first is larger
		if (second.compareTo(maximumValue) > 0)
			maximumValue = second; // second is larger
		if (third.compareTo(maximumValue) > 0)
			maximumValue = third; // third is larger
		return maximumValue;
	}

	/* maximum of 3 String values at test positions */
	public static String maximumString(String firstString, String secondString, String thirdString) {
		String maximum = firstString;
		if (secondString.compareTo(maximum) > 0)
			maximum = secondString;
		if (thirdString.compareTo(maximum) > 0)
			maximum = thirdString;
		return maximum;
	}
}
