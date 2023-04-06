package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	private static WebElement LoginButton;

	public static void main(String[] args)
	{
	//System.setProperty("webdriver.edge.driver","edgedriver.exe");	
   
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.navigate().to("https://cybersuccess.icehrm.com/&quot;");
	
	WebElement username =driver.findElement(By.id("username"));
	username.sendKeys("admin");
	
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("2zuzfakn");
	WebElement LoginButton=driver.findElement(By.xpath("//button[@onclick=\"submitLogin();return false;\"]"));
	LoginButton.click();
	String homeText= driver.findElement(By.xpath("//header[@id='delegationDiv']")).getText();
	System.out.println("homeText");
	
	if (homeText.equals("home")) {
	System.out.println("test case is passed");}
	else 
	{
		System.out.println("failed to login the application"); 
	
	}
	
	
	
	
	}
}
