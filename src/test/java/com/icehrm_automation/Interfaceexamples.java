package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Interfaceexamples {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://cybersuccess.icehrm.com/&quot;");
		
		WebElement username1 =driver.findElement(By.id("username"));
		   username1.sendKeys("admin2");
		   
		WebElement password1= driver.findElement(By.id("password"));
		password1.sendKeys("2zuzfakn2");    
		
		WebElement loginButton1 = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	      loginButton1.click();
		String homeText= driver.findElement(By.xpath("//header[@id='delegationDiv']/a")).getText();
		System.out.println("hometext");
		if (homeText.equals("Home")) {
			System.out.println("Test case is passed "); }
		else {
			System.out.println("failed to go on home page ");}
		} 
}
		//driver.quit();

/*public class LoginTest {
public static void main(String[] arg) {
//Setup the system property for edgedriver file
System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

//create instance of edge driver class to launch the browser
WebDriver driver = new EdgeDriver();
driver.navigate().to("https://cybersuccess.icehrm.com/&quot;);

WebElement username = driver.findElement(By.id("username"));

//enter the text (admin) in the username field
username.sendKeys("admin");

//enter the text (2zuzfakn) in the password field
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("2zuzfakn");

//locate the Login button and perform click operation
WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
loginButton.click();
String homeText = driver.findElement(By.xpath("//header[@id='delegationDiv']/a")).getText();

System.out.println(homeText);

if (homeText.equals("Home")) {
System.out.println("Test Case is passed");
} else {
System.out.println("failed to login to application");
// throw new Exception("failed to login to application");
}

// verify login feature with invalid username and password
driver.findElement(By.xpath("logout xpath")).click();
driver.findElement(By.xpath("sign out xpath")).click();
username.sendKeys("fdfdf");
password.sendKeys("12t482384");
loginButton.click();
if (homeText.equals("Home")) {
System.out.println("Test Case is passed");
} else {
System.out.println("failed to login to application");
// throw new Exception("failed to login to application");
}

// verify login feature with valid username and invalid password
driver.findElement(By.xpath("logout xpath")).click();
driver.findElement(By.xpath("sign out xpath")).click();
username.sendKeys("admin");
password.sendKeys("12t482384");
loginButton.click();
if (homeText.equals("Home")) {
System.out.println("Test Case is passed");
} else {
System.out.println("failed to login to application");
// throw new Exception("failed to login to application");
}

// verify login feature with invalid username and invalid password
driver.findElement(By.xpath("logout xpath")).click();
driver.findElement(By.xpath("sign out xpath")).click();
username.sendKeys("");
password.sendKeys("");
loginButton.click();
if (homeText.equals("Home")) {
System.out.println("Test Case is passed");
} else {
System.out.println("failed to login to application");
// throw new Exception("failed to login to application");
}


}
}*/