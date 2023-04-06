package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest4 {

	private static WebElement username;
	private static WebElement password;
	private static WebElement loginButton;
	private static Object homeText;

	public static void main(String[] args) {
	//	System.setProperty(webdrive.chrome.driver)
   WebDriver driver = new EdgeDriver();
			
			
		driver.navigate().to("https://cybersuccess.icehrm.com/&quot;");
		driver.findElement(By.xpath("logout xpath")).click();
		driver.findElement(By.xpath("sign out xpath")).click();
		
		username.sendKeys("dfghj");
		password.sendKeys("1234567");
		loginButton.click();
		
		if (homeText.equals("Home")) {
		System.out.println("Test Case is passed");
		} else {
		System.out.println("failed to login to application");
		// throw new Exception("failed to login to application");
		}

	}

}
