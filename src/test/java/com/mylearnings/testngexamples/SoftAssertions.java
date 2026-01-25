package com.mylearnings.testngexamples;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	@Test
	public void m1() {
		System.out.println("Test SoftAssertion");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 011);
		System.out.println("Result of soft Assertion");
		sa.assertAll();
}

}
