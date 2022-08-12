package com.SauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.MouseActionLoginButton;

public class VerifyMouseActionMethodOnLoginButton
{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium Tool\\Chrome Extract\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		MouseActionLoginButton ma= new MouseActionLoginButton(driver);
		
		ma.sendusername();
		ma.sendpassword();
		ma.clicklogin();
		
	
		String expectedresult = "Swag Labs";
		String actualresult = driver.getTitle();
		
		if (expectedresult.equals(actualresult)) {
	
			System.out.println("test case is pass");
		}
		
		else {
			System.out.println("end of program");
		}	
	System.out.println("end of program");
	
	driver.close();
	
	}

}
