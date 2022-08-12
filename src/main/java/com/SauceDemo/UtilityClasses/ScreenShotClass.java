package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{

	public static void takescreenshot(WebDriver driver) throws IOException
	{

		Date d=new Date(0);
		
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);
		
   
TakesScreenshot a = (TakesScreenshot)driver;	
   
   File sourceFile = a.getScreenshotAs(OutputType.FILE);
   
   File downldFile = new File("./ScreenShotFolder/saucedemo"+date+".jpg");
   
   // D:\\Selenium Tool\\ScreenShots//
   FileHandler.copy(sourceFile, downldFile);
		
	}
}
