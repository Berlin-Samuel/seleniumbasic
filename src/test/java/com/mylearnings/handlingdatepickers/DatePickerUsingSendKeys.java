package com.mylearnings.handlingdatepickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerUsingSendKeys {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		WebElement datePicker = driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
		datePicker.sendKeys("08/23/2024");
		System.out.println("Selected Date : " + datePicker.getAttribute("value"));
		driver.quit();
	}
}
