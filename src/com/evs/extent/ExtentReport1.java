package com.evs.extent;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport1 {
	
//public ExtentReports ext;

	public static void main(String[] args) {
//		ExtentReport1 aa=new ExtentReport1();
//		aa.m1();
//		aa.vinay();
		
		
		
		VtigerExtentReport ver = new VtigerExtentReport();
		ver.login();

		ExtentHtmlReporter extHtml = new ExtentHtmlReporter("reports/resul.html");
		
		
		ExtentReports ext = new ExtentReports();///This is the my main class.
		ext.attachReporter(extHtml);            ///attach the reports.
		ExtentTest ct = ext.createTest("launchBrowser");//   Gives the testCaseName  or MethodName
		if(true) {
			ct.log(Status.PASS, "Passed");//Gives the message
		}else {
			ct.log(Status.FAIL, "Failed");//
		}
		
		
		ext.flush();//    write flush method reports/////10 test case  flush  10 baar or  1 baar 

		
		ExtentTest ct = ext.createTest("vinayguru");
		if() {
			ccc.log(Status.PASS, "username is editaable");
		}else {
			ct.log(Status.FAIL, "username is editaable");
		}
		ext.flush();
	}
//Generic Method ====>BrowserLaunch///1
//url  //2
//login  ///3
//username   ==>testing
	
	public WebDriver driver;
	public  void launchBrowser(String browserName,ExtentTest extent) {
		
		if(browserName.equalsIgnoreCase("CH")) {
			System.setProperty("", "");
		 driver=new ChromeDriver();
		 extent.log(Status.PASS, "broesr is suucccessfully  launch"+browserName); 
		}
		
		if(browserName.equalsIgnoreCase("FF")) {
			System.setProperty("", "");
		 driver=new FFDriver();}
		
		
		
	}
	public  void vinay() {
		//Testing ====>  Manual vs Automation
		
	
	}
}
