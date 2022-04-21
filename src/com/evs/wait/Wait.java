package com.evs.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void w1() {
		WebDriverWait expWait=new WebDriverWait(null,400);
	    expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*")));
	    
	}
public void w2() {
	WebDriver driver =new ChromeDriver();
	WebDriverWait wdw=new WebDriverWait(driver, Duration.ofSeconds(10));
//	wdw.until(ExpectedConditions.u)
}
}
