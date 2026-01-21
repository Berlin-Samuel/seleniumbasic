package com.mylearnings.testngexamples;

import org.testng.annotations.Test;

/*
 * 1) Open App
 * 2) Login
 * 3) Logout
 * */
public class FirstTestCase {
	@Test(priority = 1)
	public void openApp() {
		System.out.println("Opening Application");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("Login to Application");

	}

	@Test(priority = 3)
	public void logout() {
		System.out.println("Logout from Application");

	}
}
