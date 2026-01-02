/**
 * FileName: CheckBoxHandling.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 02-Jan-2026
 * 
 * This file is part of a personal learning project.
 * 
 * Licensed under the MIT License.
 * 
 * Copyright (c) 2026 Berlin Samuel.
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
 * 1.0          02-Jan-2026        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 02-Jan-2026
 */
package com.mylearnings.handlingcheckbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		List<WebElement> radioButtonElements = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("label.custom-control-label")));
		System.out.println("Total no of RadioButton : " + radioButtonElements.size());
		for (int i = 1; i < radioButtonElements.size() - 1; i++) {
			radioButtonElements.get(i).click();
			// System.out.println(radioButtonElements.get(i).isSelected());

		}
	}
}
