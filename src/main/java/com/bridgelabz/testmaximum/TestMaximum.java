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

	/* maximum of values at test position */
	public static <T extends Comparable<T>> T maximumOfObject(T first, T second, T third, T... value) {
		T maximumValue = first; // first is larger
		if (second.compareTo(maximumValue) > 0)
			maximumValue = second; // second is larger
		if (third.compareTo(maximumValue) > 0)
			maximumValue = third; // third is larger
		if (value.length != 0) {
			maximumValue = maximumOfObjectOptional(maximumValue, value);
		}
		return maximumValue;
	}

	/* Method return maximum of the 3 values at any position */
	public T findMaxValueAtAnyPosition() {
		printMaximumValue(firstValue, secondValue, thirdValue, maximumOfObject(firstValue, secondValue, thirdValue));
		return TestMaximum.maximumOfObject(firstValue, secondValue, thirdValue);
	}

	/* maximum of values at test position */
	public static <T extends Comparable<T>> T maximumOfObjectOptional(T maximum, T... values) {
		for (T value : values) {
			if (value.compareTo(maximum) > 0)
				maximum = value;
		}
		return maximum;
	}

	// Method for printing max of three variables of any type
	public static <T> void printMaximumValue(T firstValue, T secondValue, T thirdValue, T maximumValue) {
		System.out.println("The maximum of " + firstValue + "," + secondValue + "," + thirdValue + " is " + maximumValue);
	}
}
