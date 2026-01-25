package com.mylearnings.testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	@Test(priority = 1)
	public void openApp() {
		Assert.assertTrue(false);
		// Assert.assertTrue(true);

	}

	@Test(priority = 2, dependsOnMethods = { "openApp" })
	public void login() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = { "login" })
	public void search() {
		Assert.assertTrue(true);
	}

	@Test(priority = 4, dependsOnMethods = { "search" })
	public void advSearch() {
		Assert.assertTrue(true);
	}

	@Test(priority = 5, dependsOnMethods = { "openApp" })
	public void logout() {
		Assert.assertTrue(true);
	}
}
