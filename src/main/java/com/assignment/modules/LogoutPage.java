package com.assignment.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.assignment.baseClass.BaseClass;

public class LogoutPage extends BaseClass{	
	@FindBy(xpath="//div[@class='content company_details']")
	WebElement profilemenubar;

	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement logoutbutton;

	//Initializing The Page Objects:
	public LogoutPage() 
	{
		PageFactory.initElements(driver, this);
	}
			
	//Actions:
	public void logout() 
	{
		profilemenubar.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logoutbutton);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//logoutbutton.click();
		System.out.println("Logout Successfully");
		

	}
}

