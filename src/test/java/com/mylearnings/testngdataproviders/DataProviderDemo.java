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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")
	public void testLogin(String username, String password) {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app_logo")))
				.isDisplayed();
		if (status == true) {
			driver.findElement(By.xpath("//button[contains(@id,'burger-menu-btn')]")).click();
			driver.findElement(By.xpath("//a[contains(@id,'logout')]")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@DataProvider(name = "dp", indices = { 0, 1, 2 })
	public Object[][] loginData() {

		Object[][] data = { { "standard_user", "secret_sauce" }, { "problem_user", "secret_sauce" },
				{ "error_user", "secret_sauce" } };
		return data;
	}
}
