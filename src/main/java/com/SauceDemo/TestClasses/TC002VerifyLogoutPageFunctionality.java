package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LogoutPagePomClass;
import com.SauceDemo.POMClasses.LoginPagePomClass;

public class TC002VerifyLogoutPageFunctionality extends TestBaseClass
{
	
	
	@Test
	public void logoutfunctionality()
	{
		
		String expectedresult="Swag Labs";
		
		String actualresult= driver.getTitle();
		
		Assert.assertEquals(actualresult, expectedresult);
	
	
	}
	
	

}
