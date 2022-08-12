package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMClasses.LoginPagePomClass;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

public class TestBaseClass
{
	WebDriver driver;
	
Logger log=	Logger.getLogger("SauceDemoMaven");
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		//D:\\Selenium Tool\\Chrome Extract\\

		System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");
		log.info("Chrome browser is opend");
		 driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		log.info("Website is opend");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		
		PropertyConfigurator.configure("log4j.properties");
		
		LoginPagePomClass lp = new LoginPagePomClass(driver);
		
		lp.sendusername();
		log.info("ENter user name");
		
		lp.sendpassword();
		log.info("Enter password");
		
		lp.clicklogin();
		log.info("Click on login button");
		
		// take a screenshot
		
		ScreenShotClass.takescreenshot(driver);
		
		log.info("Take a screenshot");
	}
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
		log.info("Browser is closed");
		
	}
}
