package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPagePomClass
{
 private WebDriver driver;

  //button[@id='react-burger-menu-btn']


    @FindBy (xpath="//button[@id='react-burger-menu-btn']")
    private WebElement setting;

       public void clickonsetting() 
       {
    	   setting.click();
    	   
       }
       
     //a[@id='logout_sidebar_link']
       
       
       @FindBy(xpath="//a[@id='logout_sidebar_link']")
      private WebElement logout;
       
       public void clickonlogout()
       {
    	   logout.click();
       }
       
       

       // now crate a constructor
      
       public LogoutPagePomClass(WebDriver driver)
       {
    	   this.driver=driver;
    	   
    	   PageFactory.initElements(driver, this);
       }
       
       
       
}