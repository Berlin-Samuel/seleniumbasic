package com.mylearnings.handlingmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActionHandle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement buttonContextMenu = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		Actions actionPerformed = new Actions(driver);
		actionPerformed.contextClick(buttonContextMenu).build().perform();
		WebElement pasteButton = driver.findElement(By.xpath("//li[contains(@class,'paste')]"));
		pasteButton.click();
		System.out.println("Alert Message" + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
