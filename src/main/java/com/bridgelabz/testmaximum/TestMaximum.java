package com.bridgelabz.testmaximum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMaximum<T extends Comparable<T>> {
	T firstValue;
	T secondValue;
	T thirdValue;

	public TestMaximum(T firstValue, T secondValue, T thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

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
		System.out.println("Maximum Value is " + maximumValue);
		return maximumValue;
	}

	/* maximum of 3 Float values at test position */
	public static Float maximumFloat(Float first, Float second, Float third) {
		Float maximumValue = first; // first is larger
		if (second.compareTo(maximumValue) > 0)
			maximumValue = second; // second is larger
		if (third.compareTo(maximumValue) > 0)
			maximumValue = third; // third is larger
		System.out.println("Maximum Value is " + maximumValue);
		return maximumValue;
	}

	/* maximum of 3 String values at test positions */
	public static String maximumString(String firstString, String secondString, String thirdString) {
		String maximum = firstString;
		if (secondString.compareTo(maximum) > 0)
			maximum = secondString;
		if (thirdString.compareTo(maximum) > 0)
			maximum = thirdString;
		System.out.println("Maximum Value is " + maximum);
		return maximum;
	}

	/* maximum of values at test position */
	public static <T extends Comparable<T>> T maximumOfObject(T first, T second, T third) {
		T maximumValue = first; // first is larger
		if (second.compareTo(maximumValue) > 0)
			maximumValue = second; // second is larger
		if (third.compareTo(maximumValue) > 0)
			maximumValue = third; // third is larger
		System.out.println("Maximum Value is " + maximumValue);
		return maximumValue;
	}

	/* Method return maximum of the 3 values at any position */
	public T findMaxValueAtAnyPosition() {
		return TestMaximum.maximumOfObject(firstValue, secondValue, thirdValue);
	}

	/* maximum of values at test position */
	public static <T extends Comparable<T>> T maximumOfObject(T... value) {
		List<T> list = Arrays.asList(value);
		Collections.sort(list);
		System.out.println("Maximum Value is " + list.get(list.size() - 1));
		return list.get(list.size() - 1);
	}
}
