package com.icesdets4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableDisable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indiannationalcongress.in");
WebElement searchStore= driver.findElement(By.xpath("//div[@id=\'a-page\']") );
	System.out.println("dispaly status is"+searchStore.isDisplayed());
	System.out.println("Enable status is "+searchStore.isEnabled());
	}
}
