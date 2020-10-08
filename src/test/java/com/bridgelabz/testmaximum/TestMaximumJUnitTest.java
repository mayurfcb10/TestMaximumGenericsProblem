package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMaximumJUnitTest {
	/* Welcome message test method */
	@BeforeClass
	public static void shouldPrintWelcomeMessage() {
		TestMaximum.printWelcomeMessage();
	}

	/* Maximum Integer element at the position 1 */
	@Test
	public void maximumIntegerAtPosition1() {
		Integer maximumInteger = TestMaximum.maximumInteger(12, 4, 11);
		Assert.assertSame(12, maximumInteger);
	}

	/* Maximum Integer element at the position 2 */
	@Test
	public void maximumIntegerAtPosition2() {
		Integer maximumInteger = TestMaximum.maximumInteger(4, 15, 11);
		Assert.assertSame(15, maximumInteger);
	}

	/* Maximum Integer element at the position 3 */
	@Test
	public void maximumIntegerAtPosition3() {
		Integer maximumInteger = TestMaximum.maximumInteger(4, 11, 22);
		Assert.assertSame(22, maximumInteger);
	}

	/* Maximum Float element at the position 1 */
	@Test
	public void maximumFloatAtPosition1() {
		Float maximumFloat = TestMaximum.maximumFloat(12.25f, 4.249f, 12.2495f);
		Assert.assertEquals((Float) 12.25f, maximumFloat);
	}

	/* Maximum Float element at the position 2 */
	@Test
	public void maximumFloatAtPosition2() {
		Float maximumFloat = TestMaximum.maximumFloat(12.25f, 19.99f, 6.62f);
		Assert.assertEquals((Float) 19.99f, maximumFloat);
	}

	/* Maximum Float element at the position 3 */
	@Test
	public void maximumFloatAtPosition3() {
		Float maximumFloat = TestMaximum.maximumFloat(4.46f, 11.0f, 13.25f);
		Assert.assertEquals((Float) 13.25f, maximumFloat);
	}

	/* Maximum String at the position 1 */
	@Test
	public void maximumStringAtPosition1() {
		String maximumString = TestMaximum.maximumString("Peach", "Apple", "Banana");
		Assert.assertEquals("Peach", maximumString);
	}

	/* Maximum String at the position 2 */
	@Test
	public void maximumStringAtPosition2() {
		String maximumString = TestMaximum.maximumString("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", maximumString);
	}

	/* Maximum String at the position 3 */
	@Test
	public void maximumStringAtPosition3() {
		String maximumString = TestMaximum.maximumString("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", maximumString);
	}

	/* Maximum Integer among the given Generic set */
	@Test
	public void maximumObjectInteger() {
		Integer maximumObject = TestMaximum.maximumOfObject(240, 250, 220);
		Assert.assertEquals((Integer) 250, maximumObject);
	}

	/* Maximum Float among the given Generic set */
	@Test
	public void maximumObjectFloat() {
		Float maximumObject = TestMaximum.maximumOfObject(9.999f, 10.001f, 10.0f);
		Assert.assertEquals((Float) 10.001f, maximumObject);
	}

	/* Maximum String among the given Generic set */
	@Test
	public void maximumObjectString() {
		String maximumObject = TestMaximum.maximumOfObject("BridgeLabz", "Capgemini", "Sogeti");
		Assert.assertEquals((String) "Sogeti", maximumObject);
	}

	/* Maximum Integer among the given Generic set */
	@Test
	public void given_Generic_IntegerValues_returns_true() {
		Integer maxValueInteger = new TestMaximum<Integer>(6, 7, 8).findMaxValueAtAnyPosition();
		Assert.assertEquals((Integer) 8, maxValueInteger);
	}

	/* Maximum Float among the given Generic set */
	@Test
	public void given_Generic_FloatValues_returns_true() {
		Float maxValueFloat = new TestMaximum<Float>(6.9f, 9.9f, 8.0f).findMaxValueAtAnyPosition();
		Assert.assertEquals((Float) 9.9f, maxValueFloat);
	}

	/* Maximum String among the given Generic set */
	@Test
	public void given_Generic_StringValues_returns_true() {
		String maxValueString = new TestMaximum<String>("Yahoo", "Google", "Microsoft").findMaxValueAtAnyPosition();
		Assert.assertEquals((String) "Yahoo", maxValueString);
	}

	/* Maximum Integer Value in multiple argument case */
	@Test
	public void givenVarArguments_return_maxInteger_as_true() {
		Integer maxValueInteger = TestMaximum.maximumOfObject(46, 87, 98, 354, 23, 54, 65, 5, 23, 12, 214);
		Assert.assertEquals((Integer) 354, maxValueInteger);
	}

	/* Maximum Float Value in multiple argument case */
	@Test
	public void givenVarArguments_return_maxFloat_as_true() {
		Float maxValueInteger = TestMaximum.maximumOfObject(999.99f, 999.998f, 999.9989f, 999.997f, 999.0f, 996f);
		Assert.assertEquals((Float) 999.9989f, maxValueInteger);
	}

	/* Maximum String Value in multiple argument case */
	@Test
	public void givenVarArguments_return_maxString_as_true() {
		String maxValueInteger = TestMaximum.maximumOfObject("Rcb", "Mi", "Kkr", "Csk", "Kxip", "Srh", "Rr", "Dc");
		Assert.assertEquals((String) "Srh", maxValueInteger);
	}

}
