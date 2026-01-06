package com.mylearnings.handlingdatepickers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerUsingDropdownMonthAndYear {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// Input Date
		String requiredYear = "2026";
		String requiredMonth = "Feb";
		String requiredDate = "13";
		WebElement requiredDateToBeSelected = driver.findElement(By.xpath("//input[@name='SelectedDate']"));
		requiredDateToBeSelected.click();
		// Select Year
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		year.click();
		Select yearNeedToSelect = new Select(year);
		yearNeedToSelect.selectByVisibleText(requiredYear);
		System.out.println("==============");
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		month.click();
		Select monthNeedToSelect = new Select(month);
		monthNeedToSelect.selectByVisibleText(requiredMonth);
		System.out.println("===============");
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement checkDate : allDates) {
			if (checkDate.getText().equals(requiredDate)) {
				checkDate.click();
				break;
			}
		}
		System.out.println("Final Date " + requiredDateToBeSelected.getAttribute("value"));
		driver.quit();
	}
}
