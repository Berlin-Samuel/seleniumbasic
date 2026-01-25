package com.mylearnings.testngexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class AllAnnotations {
	@Test
	public void test() {
		System.out.println("Test Method Executed");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("Before Method Executed");
	}

	@AfterMethod
	public void am() {
		System.out.println("After Method Executed");
	}

	@BeforeClass
	public void bc() {
		System.out.println("Before Class Executed");
	}

	@AfterClass
	public void ac() {
		System.out.println("After Class Executed");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Before Test Executed");
	}

	@AfterTest
	public void at() {
		System.out.println("After Test Executed");
	}

	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite Executed");

	}

	@AfterSuite
	public void as() {
		System.out.println("After Suite Executed");

	}
}
