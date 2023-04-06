package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","chromedriver.exe");
     WebDriver driver=new ChromeDriver();		
		driver.get("https://www.amazon.in/");
		
	
		driver.navigate().to("url:https://www.amazon.in/");
driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")).click();
	
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	
	}

}
