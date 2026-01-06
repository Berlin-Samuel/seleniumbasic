package com.mylearnings.handlingwebtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		int totalRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total no of Rows: " + totalRows);
		int totalcols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total no of Columns: " + totalcols);
		String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
		System.out.println("===========================");
		System.out.println("Book Name: " + bookName);
		System.out.println("===========================");
		for (int r = 2; r <= totalRows; r++) {
			for (int c = 2; c <= totalcols; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(value + "\t ");
			}
			System.out.println();
		}
		System.out.println("===========================");
		driver.quit();
	}

}
