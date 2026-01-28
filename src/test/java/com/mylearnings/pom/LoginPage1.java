package com.mylearnings.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	WebDriver driver;

	// constructor
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By locate_username = By.xpath("//input[@name='username']");
	By locate_password = By.xpath("//input[@name='password']");
	By locate_login_button = By.xpath("//button[@type='submit']");

	// action methods
	public void setUserName(String username) {
		driver.findElement(locate_username).sendKeys(username);
	}

	public void setPassword(String password) {
		driver.findElement(locate_password).sendKeys(password);

	}

	public void clickLogin() {
		driver.findElement(locate_login_button).click();

	}
}
