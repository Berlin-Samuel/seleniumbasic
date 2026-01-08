package com.mylearnings.handlekeyboardEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		// Selenium4.x
		// driver.switchTo().newWindow(WindowType.TAB); //opens the new tab
		driver.switchTo().newWindow(WindowType.WINDOW);// opens the new window
		driver.get("https://orangehrm.com/");
	}

}
