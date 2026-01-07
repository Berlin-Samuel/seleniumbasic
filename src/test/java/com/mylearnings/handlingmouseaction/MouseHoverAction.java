package com.mylearnings.handlingmouseaction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement waitforWebElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		waitforWebElement.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		} catch (TimeoutException e) {
			System.out.println("No alert present");
		}
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		WebElement waitforlist = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//nav[@role='navigation']//span[text()='Job ']")));
		waitforlist.click();
		WebElement jobTitles = driver.findElement(By.xpath("//a[normalize-space()='Job Titles']"));
		WebElement jobCategories = driver.findElement(By.xpath("//a[normalize-space()='Job Categories']"));
		Actions act = new Actions(driver);
		// act.moveToElement(jobTitles).moveToElement(jobCategories).click().build().perform();
		act.moveToElement(jobTitles).moveToElement(jobCategories).click().perform();
		driver.quit();
	}

}
