package com.mylearnings.usingjavascriptexecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		WebElement pathForFileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		String file1 = "C:\\Users\\Admin\\OneDrive\\Documents\\CopilotAnswers-20240612-144916.xlsx";
		String file2 = "C:\\Users\\Admin\\Downloads\\Day-31.txt";
		pathForFileUpload.sendKeys(file1 + "\n" + file2);
		List<WebElement> uploadedFiles = driver.findElements(By.xpath("//ul[@id='fileList']/li"));
		int totalFiles = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		if (totalFiles == 2) {
			System.out.println("All files are Uploaded");
		} else {
			System.out.println("Upload Faileds");
		}
		System.out.println("======================");
		boolean file1Found = false;
		boolean file2Found = false;
		for (WebElement file : uploadedFiles) {
			String fileName = file.getText();

			if (fileName.equals("CopilotAnswers-20240612-144916.xlsx")) {
				file1Found = true;
			}
			if (fileName.equals("Day-31.txt")) {
				file2Found = true;
			}
		}

		if (file1Found && file2Found) {
			System.out.println("Uploaded Successfully");
		} else {
			System.out.println("Upload Failed");
		}
		driver.quit();

	}
}
