package com.mylearnings.testngexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * 1) Open App(demo - orangehrms)
 * 2) Checking Logo
 * 3) Login
 * 4) Logout
 * */
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@Test(priority = 1)
	public void openApp() {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2)
	public void login() {
		WebElement username = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder = 'username']")));
		username.sendKeys("Admin");
		WebElement password = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder = 'password']")));
		password.sendKeys("admin123");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

	@Test(priority = 3)
	public void logoCheck() {

		boolean checkLogo = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@alt,'banner')]")))
				.isDisplayed();
		System.out.println("Does the Logo is Present ===>>> " + checkLogo);
	}

	@Test(priority = 4)
	public void logout() {
		WebElement dropdown = driver.findElement(By.xpath("//li[@class=\"oxd-userdropdown\"]"));
		dropdown.click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		driver.quit();
	}

}
