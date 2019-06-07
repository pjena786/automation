package com.assignment.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.assignment.baseClass.BaseClass;
import com.assignment.modules.LoginPage;
import com.assignment.modules.LogoutPage;

public class LogoutTest extends BaseClass {
    LoginPage loginpage;
	LogoutPage logoutpage;
   
	@BeforeMethod
	public void SetUp() 
	{
		initializeWebdriver();
		loginpage = new LoginPage();
		logoutpage = new LogoutPage();
	}
		
	@Test
	public void validate_Logoutpage() throws InterruptedException 
	{
		loginpage.login();
		logoutpage.logout();
	}

	@AfterMethod
	public void terminateBrowser()
	{
	     driver.close();
	}

}
