package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPagePomClass;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

public class TC001VerifyLoginFunctionality extends TestBaseClass
{
	

	
	@Test
	public void loginfunctionality() throws IOException 
	{
		// now we have to validate test case right either it is pass or failed
		ScreenShotClass.takescreenshot(driver);
		String expectedresult = "Swag Labs";
		String actualresult = driver.getTitle();
		
		Assert.assertEquals(actualresult, expectedresult);
		}
		}

	//private static void takeScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		
	
	



	
