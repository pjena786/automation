package com.assignment.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.assignment.baseClass.BaseClass;

public class LoginPage extends BaseClass {

	//Page Object Elements
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath="//input[@id='id_email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='btn']")
	WebElement loginbtn;

	//Initializing The Page Objects:
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public void login() throws InterruptedException 
	{
		login.click();
		Thread.sleep(1000);
		email.sendKeys("kypyjij@getnada.com");
		password.sendKeys("jena1989");
		loginbtn.click();
		System.out.println("Login Successfully");
	}
}

