package com.icesdets4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTry {

	public static void main(String[] args) throws InterruptedException {
  WebDriverManager.edgedriver().setup();
   WebDriver driver = new EdgeDriver();
driver.get(" https://www.amazon.in/ ");

 WebElement dropDown  =driver.findElement(By.id("searchDropdownBox"));
Select drop = new Select(dropDown);
  drop.selectByIndex(10);//  Finally done mr KK
//drop.selectByValue("10");
//drop.selectByVisibleText("search-alias=stripbooks");
}
}




/*Thread.sleep(5000);

WebElement searchDropDown =driver.findElement(By.id("searchDropDownBox"));
Select select =new Select (searchDropDown);
select.selectByVisibleText("Electronics") ;

select.selectByIndex(16);
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
 driver.findElement(By.id("nav-search-submit-button")).click();
    }
  }
*/