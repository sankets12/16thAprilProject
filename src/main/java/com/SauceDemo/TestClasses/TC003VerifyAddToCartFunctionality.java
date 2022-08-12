package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePomClass;
import com.SauceDemo.POMClasses.LoginPagePomClass;

public class TC003VerifyAddToCartFunctionality extends TestBaseClass
{
	
	
	@Test
	public void productaddtocartfuntionality()
	{
		
		HomePagePomClass hp = new HomePagePomClass(driver);
		
		hp.clickonaddtocart();
		hp.gettextfromcartbutton();
		
		String actualcount = hp.gettextfromcartbutton();
		
		String expectedresult = "6";
	
		Assert.assertEquals(actualcount, expectedresult);
		}
}
      

