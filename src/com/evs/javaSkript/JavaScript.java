package com.evs.javaSkript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		driver.get("http://localhost:8888/");
		WebElement userName=	driver.findElement(By.xpath("//input[@name='user_name']"));
		executor.executeScript("arguments[0].value='admin';", userName);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");


		WebElement loginBtn=	driver.findElement(By.xpath("//input[@alt=\"Login [Alt+L]\"]"));

		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginBtn);
	}

}
