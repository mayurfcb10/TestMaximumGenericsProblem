package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumJUnitTest {
	/* Welcome message test method */
	@Test
	public void shouldPrintWelcomeMessage() {
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
		Integer maximumInteger = TestMaximum.maximumInteger(4, 12, 11);
		Assert.assertSame(12, maximumInteger);
	}

	/* Maximum Integer element at the position 3 */
	@Test
	public void maximumIntegerAtPosition3() {
		Integer maximumInteger = TestMaximum.maximumInteger(4, 11, 12);
		Assert.assertSame(12, maximumInteger);
	}
}
