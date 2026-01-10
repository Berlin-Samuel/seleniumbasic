package com.mylearnings.brokenlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> anchorLinks = driver.findElements(By.tagName("a"));
		System.out.println("Lotal no of links" + anchorLinks.size());
		for (WebElement linkElement : anchorLinks) {
			String hrefValue = linkElement.getAttribute("href");
			if (hrefValue == null || hrefValue.isEmpty()) {
				System.out.println("href attribute is null or empty");
				continue;
			}
		}
	}
}
