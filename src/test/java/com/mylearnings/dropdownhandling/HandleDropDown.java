package com.mylearnings.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		Select listOfDropDown = new Select(dropdown);
		// listOfDropDown.selectByIndex(2);
		listOfDropDown.selectByValue("france");
		listOfDropDown.selectByVisibleText("Japan");
		List<WebElement> options = listOfDropDown.getOptions();
		System.out.println(options.size());
		System.out.println("========================");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		for (WebElement DpDoptions : options) {
			System.out.println(DpDoptions.getText());
		}
	}
}
