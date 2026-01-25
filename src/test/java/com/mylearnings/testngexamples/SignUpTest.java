package com.mylearnings.testngexamples;

import org.testng.annotations.Test;

public class SignUpTest {
	@Test(priority = 1,groups= {"regression"})
	public void signUpBygmail() {
		System.out.println("SignUp By gmail");
	}

	@Test(priority = 2,groups= {"regression"})
	public void signUpByFaceBook() {
		System.out.println("SignUp By FaceBook");
	}

	@Test(priority = 3,groups= {"regression"})
	public void signUpByTwitter() {
		System.out.println("SignUp By Twitter");
	}
}
