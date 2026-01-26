package com.mylearnings.testngdataproviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String br) {
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid Browser");
			return;
		}
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
	public void testTitle() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}

	@Test(priority = 3)
	public void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.close();
		}
	}
}
