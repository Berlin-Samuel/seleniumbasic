/**
 * FileName: FirstTestCase.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 04-Dec-2025
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
 * 1.0          04-Dec-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 04-Dec-2025
 */
package com.mylearnings.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case:
 * -----------
 * 1) Launch Browser
 * 2) Open URL https://www.selenium.dev/
 * 3) Validate title should be "Selenium"
 * 4) Close Browser
 * -----------
 * */

public class First_Test {
	public static void main(String[] args) {

		// 1) Launch Browser
		// ChromeDriver driver= new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		// 2) Open URL https://www.selenium.dev/
		driver.get("https://www.selenium.dev/");
		
		// 3) Validate title should be "Selenium"
		String actualTitle = driver.getTitle();
		if (actualTitle.equals("Selenium")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		// 4) close browser
		driver.quit();
		
		// seleniumbasic 
		// seleniumbasic
		// driver.close();
	}

}
