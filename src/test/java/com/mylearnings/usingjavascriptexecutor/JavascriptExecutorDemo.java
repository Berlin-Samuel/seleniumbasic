package com.mylearnings.usingjavascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));
		// inputBox.sendKeys("Karthick");
		// alternate of sendkeys method
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		jsexe.executeScript("arguments[0].setAttribute('value','Karthick')", inputBox);
		System.out.println("=====================");
		WebElement clickEvent = driver.findElement(By.xpath("//button[@name='start']"));
		// clickEvent.click();
		jsexe.executeScript("arguments[0].click()", clickEvent);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickEvent.click();
	}
}
