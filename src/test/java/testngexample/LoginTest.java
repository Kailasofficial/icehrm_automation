package testngexample;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
 @Test
public class LoginTest extends BaseClass{
String firstName = "Cyber";
String lastName = "Sucess";
String empId ="001";
	public void beforeMethod()
{ System.out.println("this is launch browser method from @beforeMethod");
launchBrowser ("chrome");
 driver.navigate().to("https://cybersucess.icehrm.com/");
 enterText(By.id("username"),"admin");
 enterText(By.id("password"),"2zuzfakn");
 click(By.xpath("//button[contains(text(),'Log in')]"));
 click(By.xpath("//span[text()='Employees']"));
 click(By.xpath("//ul[@id='admin_Employees']/li[1]/a"));
 
	}
 

 public void addEmp() {
  	System.out.println("this is create Emp from @Test"); 
	 click(By.xpath("//div[@id='EmployeeTable']/descendant::span[contains(text(),'Add New')]"));
     enterText(By.xpath("empNum"),empId);
    enterText(By.xpath("firstName"),firstName);
    enterText(By.xpath("lastName"),lastName);
   }


 @Test
 public void verifyEmp() {
	 System.out.println ("this is a verify method from @Test");
 }
 @AfterMethod
 public void tearDown() {
	 System.out.println("this is a teardown methode from @AfterMethod"); 
 }
 }