package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngexample.BaseClass;

public class LoginPage2 extends BaseClass{
WebDriver driver;
@FindBy (name ="username")
public By username;

@FindBy (name="password")
public By password;
@FindBy (xpath="//button[contains(text(),'Log in')]")
public WebElement loginButton;
public LoginPage2(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void login (String username ,String password)
{
enterText(this.username,username);
enterText(this.password,password);
click(loginButton);


((WebElement) this.username).sendKeys(username);
((WebElement) this.password).sendKeys(password);
this.loginButton.click();
}
private void click(WebElement loginButton2) {
	// TODO Auto-generated method stub
	
}
	
}
