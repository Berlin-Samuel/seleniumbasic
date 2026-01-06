package com.mylearnings.handlingdatepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerUsingXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		String userDate = "13";
		String year = "2024";
		String month = "February";
		WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicker.click();
		while (true) {
			String monthPicker = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String YearPicker = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (monthPicker.equals(month) && YearPicker.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//a[@data-handler='prev']")).click();// previous
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement checkDate : dates) {
			if (checkDate.getText().equals(userDate)) {
				checkDate.click();
				break;
			}
		}
		System.out.println(" Final Date " + datePicker.getAttribute("value"));
		driver.quit();
	}
}
