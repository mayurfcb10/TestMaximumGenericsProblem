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
		Float maximumFloat = TestMaximum.maximumFloat(4.46f, 11.0f, 12.25f);
		Assert.assertEquals((Float) 12.25f, maximumFloat);
	}

}
