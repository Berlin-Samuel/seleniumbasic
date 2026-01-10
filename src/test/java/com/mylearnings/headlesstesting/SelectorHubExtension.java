package com.mylearnings.headlesstesting;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectorHubExtension {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		File file = new File("E:\\Eclipse_workspace\\seleniumbasic\\crx files\\SelectorsHub-Chrome-Web-Store.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.tamil-bible.com/tabletype.php?Type=Tml");
	}
}
