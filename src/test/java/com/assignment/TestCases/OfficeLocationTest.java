package com.assignment.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.assignment.baseClass.BaseClass;
import com.assignment.modules.LoginPage;
import com.assignment.modules.OfficeLocationPage;

public class OfficeLocationTest extends BaseClass
{
	LoginPage loginpage;
	OfficeLocationPage officelocationpage;
	

	@BeforeMethod
	public void SetUp() 
	{
		initializeWebdriver();
		loginpage = new LoginPage();
		officelocationpage = new OfficeLocationPage();
	}

	@Test(priority=1)
	public void validate_OfficeLocation() throws InterruptedException 
	{
		loginpage.login();
		officelocationpage.OfficeLocation();
	}

	@AfterMethod
    public void terminateBrowser()
	{
        driver.close();
    }

}
