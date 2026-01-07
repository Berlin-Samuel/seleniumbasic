package com.mylearnings.handlingmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop");
		driver.manage().window().maximize();
		Actions dandDElement = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement target = driver
				.findElement(By.xpath("//div[@class='ui-widget-content']/ol[contains(@class,'field14 ')]"));
		dandDElement.dragAndDrop(source, target).perform();
		// System.out.println(source.getText() + " " + target.getAttribute("value"));
		driver.quit();
	}

}
