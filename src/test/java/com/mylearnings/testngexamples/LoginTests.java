
package com.mylearnings.testngexamples;

import org.testng.annotations.Test;

public class LoginTests {
	@Test(priority = 1, groups = { "sanity" })
	public void loginBygmail() {
		System.out.println("Login By gmail");
	}

	@Test(priority = 2, groups = { "sanity" })
	public void loginByFaceBook() {
		System.out.println("Login By FaceBook");
	}

	@Test(priority = 3, groups = { "sanity" })
	public void loginByTwitter() {
		System.out.println("Login By Twitter");
	}
}
