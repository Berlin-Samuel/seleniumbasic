/**
 * FileName: CheckBox.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 30-Dec-2025
 * 
 * This file is part of a personal learning project.
 * 
 * Licensed under the MIT License.
 * 
 * Copyright (c) 2025 Berlin Samuel.
 * Permission is hereby granted, free of charge, to any person obtaining a copy  
 * of this software and associated documentation files (the "Software"), to deal  
 * in the Software without restriction, including without limitation the rights  
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
 * copies of the Software, and to permit persons to whom the Software is  
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * 
 * REVISION     DATE           NAME         DESCRIPTION  
 * 1.0          30-Dec-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 30-Dec-2025
 */
package com.mylearnings.handlingcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkBoxElements = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("No Of CheckBoxes : " + checkBoxElements.size());// 7
		for (WebElement eachCheckBox : checkBoxElements) {
			eachCheckBox.click();
		}
		System.out.println("------------------------");
		Thread.sleep(3000);
		for (int i = 0; i < checkBoxElements.size(); i++) {
			checkBoxElements.get(i).click();
		}
		// Select Last 3 no of checkboxes(Total no of check boxes - last check boxes)
		for (int i = 4; i < checkBoxElements.size(); i++) {
			checkBoxElements.get(i).click();
		}
		// First 3 no of elements
		Thread.sleep(3000);
		for (int i = 0; i < 3; i++) {
			checkBoxElements.get(i).click();
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
