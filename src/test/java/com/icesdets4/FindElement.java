package com.icesdets4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) {
		EdgeOptions edgeOptions = new EdgeOptions();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(edgeOptions);
			driver.get("https://demo.nopcommerce.com");
WebElement searchbox = driver.findElement(By.xpath("//form[@id=\'small-search-box-form\']"));
		searchbox.sendKeys("iphone");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(((WebElement) ele).getText());	
	}
		}


//WebDriverManager.edgedriver().setup();
//WebDriver driver = new EdgeDriver();
