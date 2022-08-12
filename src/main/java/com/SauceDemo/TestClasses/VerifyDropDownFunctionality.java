package com.SauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.SauceDemo.POMClasses.HomePagePomClass;
import com.SauceDemo.POMClasses.LoginPagePomClass;
import com.SauceDemo.POMClasses.MouseActionLoginButton;

public class VerifyDropDownFunctionality 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium Tool\\Chrome Extract\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		LoginPagePomClass lp = new LoginPagePomClass(driver);
		
		lp.sendusername();
		lp.sendpassword();
		lp.clicklogin();
		
		HomePagePomClass hp = new HomePagePomClass(driver);
		
		hp.clickondropdown();
		
		
	
		String expectedresult = "Price (high to low)";
		String actualresult = driver.getCurrentUrl();
		
		if (expectedresult.equals(actualresult)) {
			System.out.println("tc is passed");
		}
		else {
			System.out.println("tc is failed");
		
	}
		System.out.println("end of program");
	driver.quit();
	
	}

}
