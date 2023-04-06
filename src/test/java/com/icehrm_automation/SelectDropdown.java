package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(5000);
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).submit();	
	Thread.sleep(5000);
	
	String dashboardText = driver.findElement(By.xpath("//h6[text()='dashboard'] ")).getText();
	
	
	if (dashboardText.equals("dashboard")) {
		
	System.out.println("Sucessfully landed on the homepage of application");
	}
	else 
	{
		throw new Exception("failed to login sucessfully");	
	}
	driver.findElement(By.xpath ("//a[@class='oxd-main-menu-item active']")).click();  //("//span[text()='PIM']")).click();
	Thread.sleep(2000);
	WebElement searchButton= driver.findElement(By.xpath("//button[@type='reset']/following-sibling::button"));
	if (searchButton.isDisplayed()) {
		System.out.println("sucessfully able to navigate on PIM module"); }
	else {
		System.out.println("unable to navigate on PIM module");}
	
	
	WebElement selectAllCheckBox = driver.findElement(By.xpath(" "));
	selectAllCheckBox.click();
	if (selectAllCheckBox.isSelected()) {
		System.out.println("Select all check box is selected"); 
		}
	else {
		System.out.println("select all checkbox is not selected");
	}
      }
	}
	

