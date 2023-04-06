package com.icehrm_automation;
import java.util.List;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.opencart.com/");
	//driver.get("https://www.amazon.in/");
	
	WebElement dropEle = driver.findElement(By.id("input-country"));
  Select dropDownCountry = new Select(dropEle);
   //dropDownCountry.selectByVisibleText("Denmark ");
   //dropDownCountry.selectByValue("49");//  Congo direct number is equal to value assign
	//dropDownCountry.selectByIndex(26); // you have start from 0 so when zero is there option value that counted so 26 is 26 ha..
	
	// Without using this select by method we also call to perform the operation by using different method..
  
  List<WebElement>alloptions=dropDownCountry.getOptions();
	for (WebElement option:alloptions)
	{  if (option.getText().equals("Canada"))
			   { option.click();
			     break ; }
	}
	}
}
//select[@id="input-country"]//https://www.opencart.com/index.php?route=account/register