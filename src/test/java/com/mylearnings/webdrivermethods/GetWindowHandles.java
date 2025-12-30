/**
 * FileName: GetWindowHandles.java
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
package com.mylearnings.webdrivermethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		Set<String> windowIds = driver.getWindowHandles();
		List<String> Ids = new ArrayList<String>(windowIds);
		String parentId = Ids.get(0);
		String childId = Ids.get(1);
		System.out.println("Parent ID : " + parentId + "\n" + "Child ID : " + childId);
		driver.switchTo().window(childId);
		System.out.println("Child Browser Window : " + driver.switchTo().window(childId).getTitle());
		driver.switchTo().window(parentId);
		System.out.println("Parent Browser Window : " + driver.switchTo().window(parentId).getTitle());

		// 2nd approach
		for (String WinIds : Ids) {
			String title = driver.switchTo().window(WinIds).getTitle();
			if (title.equals("Human Resources Management Software | HRMS | OrangeHRM")) {
				// driver.switchTo().window(WinIds);
				System.out.println(driver.getCurrentUrl());
			} else {
				System.out.println(driver.getCurrentUrl());
			}
		}
		driver.quit();
	}
}