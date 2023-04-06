package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sdetpro1 {

	public static void main(String[] args) {
   WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://demo.nopcommerce.com");

	System.out.println("output will be page :"+ driver.getTitle());
	
	System.out.println("get url"+driver.getCurrentUrl());
	
    System.out.println(driver.getPageSource());  //  will give html data
	
	}
}
