package com.mylearnings.handlingalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Basic Auth")).click();
	}
}
