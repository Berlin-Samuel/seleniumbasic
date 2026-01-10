package com.mylearnings.takingscreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScreenshot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		// 1) Full Page Screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");
		sourceFile.renameTo(targetFile);
		// 2) Capture Screenshot of specific section
		WebElement featuredElement = driver.findElement(By.xpath("//div[@class='demo-wrapper']"));
		File sourceFile1 = featuredElement.getScreenshotAs(OutputType.FILE);
		File targetFile1 = new File(System.getProperty("user.dir") + "\\screenshots\\featuredElement.png");
		sourceFile1.renameTo(targetFile1);
		// 3) Capture Screenshot of specific section
		WebElement logo = driver.findElement(By.xpath("//a[@class=\"logo\"]"));
		File sourceFile2 = logo.getScreenshotAs(OutputType.FILE);
		File targetFile2 = new File(System.getProperty("user.dir") + "\\screenshots\\logo.png");
		sourceFile2.renameTo(targetFile2);
		driver.quit();
	}
}
