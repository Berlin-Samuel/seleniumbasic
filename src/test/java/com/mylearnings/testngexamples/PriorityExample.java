package com.mylearnings.testngexamples;

import org.testng.annotations.Test;

public class PriorityExample {
	@Test(priority = 1)
	public void signUp() {
		System.out.println("Account created");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("Search Product");
	}

	@Test(priority = 4)
	public void orderProduct() {
		System.out.println("Ordered Product");
	}

	@Test(priority = 5)
	public void logOut() {
		System.out.println("Log Out");
	}
}
