package com.mylearnings.testngdataproviders;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext result) {
		System.out.println("Test Execution Started");
		System.out.println("==================");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started........");
		System.out.println("==================");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed......");
		System.out.println("==================");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed......");
		System.out.println("==================");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped......");
		System.out.println("==================");
	}

	public void onFinish(ITestContext result) {
		System.out.println("Test Execution Completed");
		System.out.println("==================");
	}

}