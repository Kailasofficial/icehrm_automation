package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OriginalOrangeHrm20Mar {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		// driver.findElement(By.xpath("//button[@type='submit']")).submit();
	
	
	}

}
