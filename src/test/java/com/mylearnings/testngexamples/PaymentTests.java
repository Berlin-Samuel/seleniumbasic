package com.mylearnings.testngexamples;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority = 1, groups = { "sanity", "regression" })
	public void paymentInRupees() {
		System.out.println("Payment In Rupees");
	}

	@Test(priority = 2, groups = { "sanity", " regression" })
	public void paymentInDollar() {
		System.out.println("Payment In Dollar");

	}

	int ab = 123;
	String a = "" + ab;

}
