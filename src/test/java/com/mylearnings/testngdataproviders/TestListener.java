package com.mylearnings.testngdataproviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.mylearnings.testngdataproviders.MyListener.class)
public class TestListener {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void testLogo() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login_logo")))
				.isDisplayed();
		Assert.assertEquals(status, true);
	}

	@Test(priority = 2)
	public void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucessssssdemo.com/");
	}

	@Test(priority = 3, dependsOnMethods = { "testURL" })
	public void testTitle() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.close();
		}
	}
}
