package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePomClass 
{

	private WebDriver driver;
	Select s;
	
	@FindBy (xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
     List<WebElement> addtocart;
	
	public void clickonaddtocart() 
	{
	// this is for each loop
		for(WebElement a:addtocart)
		a.click();
		
		//simple for loop
//		for (int i=0; i<addtocart.size(); i++)
//		{
//			addtocart.get(i).click();
//			
//		}
	}
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	WebElement addtocartbutton;
	
	public String gettextfromcartbutton() 
	{
		String totalproducts= addtocartbutton.getText();
		return totalproducts;
	}
	
	
	// drop down fucntionality
	
	@FindBy (xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	public void clickondropdown()
	{
		Select s= new Select(dropdown);
		
s.selectByVisibleText("Price (low to high)");	}
 
 
 
	
	
	
	public HomePagePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 s= new Select(dropdown);	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
