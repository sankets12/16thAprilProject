package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePomClass
{
private WebDriver driver;
	
	// use driver.findelemet in different way
	
	// 1 - username webelement
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;

 public void sendusername()
 {
	 username.sendKeys("standard_user");
 }


// 2 - password webelement
 
 @FindBy(xpath="//input[@id='password']")
 WebElement password;
 
 public void sendpassword()
 {
	 password.sendKeys("secret_sauce");
 }

// 3- Login
 
 @FindBy(xpath="//input[@id='login-button']")
 WebElement login;
 
 public void clicklogin()
 {
	 login.click();
	 
	
 }
 // constructor

public LoginPagePomClass(WebDriver driver)
{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	

}

}
