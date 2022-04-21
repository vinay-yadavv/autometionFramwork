package com.evs.extent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerExtentReport {
	
	private WebDriver driver;
	public void login() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8888/");
	WebElement weUsr=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUsr.clear();
		weUsr.sendKeys("admin");
		
		
		
		WebElement weid=driver.findElement(By.xpath("//input[@user_password']"));
		weid.clear();
		weid.sendKeys("admin");
		
		
		String name;
		driver.findElement(By.xpath(name="Login"));
		
		
	}

}
