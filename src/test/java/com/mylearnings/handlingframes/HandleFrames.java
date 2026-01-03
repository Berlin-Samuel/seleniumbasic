package com.mylearnings.handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");// https://ui.vision/demo/webtest/frames/
		// Frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("HELLO");
		driver.switchTo().defaultContent();
		// Frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		WebElement input = driver.findElement(By.xpath("//input[@name='mytext2']"));
		input.sendKeys("Welcome");
		System.out.println(driver.findElement(By.xpath("//form[@name='name2']")).getText());
		driver.quit();
	}
}
