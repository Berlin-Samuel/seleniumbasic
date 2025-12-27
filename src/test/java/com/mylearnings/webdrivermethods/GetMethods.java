/**
 * FileName: GetMethods.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 19-Dec-2025
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
 * 1.0          19-Dec-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 19-Dec-2025
 */
package com.mylearnings.webdrivermethods;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.html");
		System.out.println(driver.getTitle());
		System.out.println("=================");
		System.out.println(driver.getCurrentUrl());
		System.out.println("=================");
		System.out.println(driver.getPageSource());
		System.out.println("=================");
		System.out.println(driver.getWindowHandle());
		System.out.println("=================");
		driver.switchTo().newWindow(WindowType.TAB).get("http://www.linkedin.com");
		Set<String> windowsIDs = driver.getWindowHandles();
		System.out.println(windowsIDs);
		driver.close();
	}

}
