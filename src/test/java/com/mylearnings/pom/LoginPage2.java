package com.mylearnings.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;

	// constructor
	public LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	/*
	 *
	 * By locate_username = By.xpath("//input[@name='username']"); By
	 * locate_password = By.xpath("//input[@name='password']"); By
	 * locate_login_button = By.xpath("//button[@type='submit']");
	 * 
	 */

	@FindBy(xpath = "//input[@name='username']")
	WebElement txt_username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement locate_password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement locate_login_button;

	// action methods

	/*
	 * public void setUserName(String username) {
	 * driver.findElement(locate_username).sendKeys(username); }
	 * 
	 * public void setPassword(String password) {
	 * driver.findElement(locate_password).sendKeys(password);
	 * 
	 * }
	 * 
	 * public void clickLogin() { driver.findElement(locate_login_button).click();
	 * 
	 * }
	 */

	public void setUserName(String username) {
		txt_username.sendKeys(username);
	}

	public void setPassword(String password) {
		locate_password.sendKeys(password);
	}

	public void clickLogin() {
		locate_login_button.click();

	}
}
