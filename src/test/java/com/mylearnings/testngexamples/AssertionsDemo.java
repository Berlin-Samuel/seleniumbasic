package com.mylearnings.testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	@Test
	public void testTitle() {
		String exp_title = "Opencart";
		String actual_title = "Openkart";
		if (exp_title.equals(actual_title)) {
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(exp_title, actual_title);
	}
}
