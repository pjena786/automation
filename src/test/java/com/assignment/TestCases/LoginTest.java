package com.assignment.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.assignment.baseClass.BaseClass;
import com.assignment.modules.LoginPage;

public class LoginTest  extends BaseClass
{
	LoginPage loginpage;

	@BeforeMethod
	public void SetUp() 
	{
		initializeWebdriver();
		loginpage = new LoginPage();
	}

	@Test(priority=1)
	public void validate_Loginpage() throws InterruptedException 
	{
		loginpage.login();
	}

	@AfterMethod
    public void terminateBrowser()
	{
         driver.close();
    }

}
