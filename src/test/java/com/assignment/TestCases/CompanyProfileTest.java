package com.assignment.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.assignment.baseClass.BaseClass;
import com.assignment.modules.CompanyProfilePage;
import com.assignment.modules.LoginPage;

public class CompanyProfileTest extends BaseClass
{
	LoginPage loginpage;
	CompanyProfilePage companypage;
	

	@BeforeMethod
	public void SetUp() 
	{
		initializeWebdriver();
		loginpage = new LoginPage();
		companypage = new CompanyProfilePage();
	}

	@Test(priority=1)
	public void validate_CompanyProfile() throws InterruptedException 
	{
		loginpage.login();
		companypage.CompanyProfile();
	}

	@AfterMethod
    public void terminateBrowser()
	{
        driver.close();
    }

}
