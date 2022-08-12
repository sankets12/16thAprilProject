package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseActionLoginButton 
{
	WebDriver driver;
	Actions act;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;

 public void sendusername()
 {
	 username.sendKeys("standard_user");
 }

 @FindBy(xpath="//input[@id='password']")
 WebElement password;
 
 public void sendpassword()
 {
	 password.sendKeys("secret_sauce");
 }
 
 // now here we use mouse ation method
 
 @FindBy(xpath="//input[@id='login-button']")
 WebElement login;
 
 public void clicklogin()
 {
	act.click(login).perform();
	 
	
 }
 public MouseActionLoginButton(WebDriver driver)
 {
 	
 	this.driver=driver;
 	PageFactory.initElements(driver, this);
 	 
 	act = new Actions(driver);
 
 }

}
