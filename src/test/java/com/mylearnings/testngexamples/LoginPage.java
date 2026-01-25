package com.mylearnings.testngexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 1) Open App(demo - orangehrms)
 * 2) Checking Logo
 * 3) Login
 * 4) Logout
 * */

public class LoginPage {

	public static WebDriver driver = new ChromeDriver();
	// public static WebDriverWait wait = new WebDriverWait(driver,
	// Duration.ofSeconds(20));

	@Test(priority = 1)
	public void openApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 2)
	public void login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder, 'name')]"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder
		// = 'username']")));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder, 'word')]"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder
		// = 'password']")));
		password.sendKeys("admin123");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

	@Test(priority = 3)
	public void logoCheck() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		boolean checkLogo = driver.findElement(By.xpath("//img[contains(@alt,'banner')]")).isDisplayed();
		System.out.println("===============");
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@alt,'banner')]"))).isDisplayed();
		System.out.println("Does the Logo is Present ===>>> " + checkLogo);
		System.out.println("===============");
	}

	@Test(priority = 4)
	public void logout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown = driver.findElement(By.xpath("//li[@class=\"oxd-userdropdown\"]"));
		dropdown.click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		driver.quit();
	}

}
