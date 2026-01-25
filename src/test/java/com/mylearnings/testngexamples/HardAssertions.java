package com.mylearnings.testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	public void testString() {
		Assert.assertEquals("xyz", "XYZ");
	}

	@Test
	public void testnum() {
		Assert.assertEquals(123, 0123);
	}
	@Test
	public void testnotequal() {
		Assert.assertNotEquals(123, 0123);
	}
}
