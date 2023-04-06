package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	public static void main(String[] args) {

		
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.get("https://cybersuccess.icehrm.com/&quot;");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("2zuzfakn");
driver.findElement(By.xpath("//button[@onclick=\'submitLogin();return false;\']")).submit();
String dashboardText = driver.findElement(By.xpath("//section[@class=\'content\']")).getText();	
driver.findElement(By.xpath("//div[@id=\'plainMessageModel\']")).click();

	
	//driver.findElement(By.xpath( "//a[@href="https://icehrm.com/app/cybersuccess/?g=admin&n=billing&m=admin_System"]/parent::p")).click();
	
	
	
	}
}
