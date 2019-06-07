package com.assignment.modules;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.assignment.baseClass.BaseClass;

public class CompanyProfilePage extends BaseClass {
	static WebDriverWait wait;

	//Page Object Elements
	@FindBy(xpath="//div[contains(text(),'Complete your company profile')]")
	WebElement Complete_Profile;
	
	@FindBy(xpath="//label[contains(text(),'Company Name')]")
	WebElement Company_Name;

	@FindBy(xpath = "//div[@class='ui padded segment']//div[2]//input[1]")
	WebElement Company_Website_URL;

	@FindBy(xpath = "//div[8]//div[1]//input[1]")
	WebElement facebook;
	
	@FindBy(xpath = "//div[9]//div[1]//input[1]")
	WebElement twitter;
	
	@FindBy(xpath = "//div[10]//div[1]//input[1]")
	WebElement linkedin;
	
	@FindBy(xpath = "//*[@id='app']/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div/form/div[3]/div/div")
	WebElement Browse1;
	
	@FindBy(xpath = "//*[@id='filepond--drop-label-9xbq5j28k']")
	WebElement Browse2;
	
	@FindBy(xpath = "//body[@id='content']/div[@id='app']/div[@class='app_content_wrapper']/div[@class='settings']/div[@class='ui centered grid container']/div[@class='thirteen wide column']/div[@class='ui grid']/div[@class='sixteen wide column']/div[@class='ui grid']/div[@class='twelve wide column setting-form']/div[@class='ui segments']/div[@class='ui padded segment']/div[@class='ui grid']/div[@class='eleven wide column']/form[@class='ui form']/div[3]/div[1]/div[1]/div[3]/ul[1]/li[1]/fieldset[1]/div[1]/button[3]/*[1]\r\n")
	WebElement cancel1;
	
	@FindBy(xpath = "//body[@id='content']/div[@id='app']/div[@class='app_content_wrapper']/div[@class='settings']/div[@class='ui centered grid container']/div[@class='thirteen wide column']/div[@class='ui grid']/div[@class='sixteen wide column']/div[@class='ui grid']/div[@class='twelve wide column setting-form']/div[@class='ui segments']/div[@class='ui padded segment']/div[@class='ui grid']/div[@class='eleven wide column']/form[@class='ui form']/div[4]/div[1]/div[1]/div[3]/ul[1]/li[1]/fieldset[1]/div[1]/button[3]/*[1]")
	WebElement cancel2;
	
	@FindBy(xpath = "//div[@class='field']//textarea")
	WebElement About_Company;
	
	@FindBy(xpath = "//button[@class='ui green button']")
	WebElement save;
	
	
	//Initializing The Page Objects:
	public CompanyProfilePage() 
	{
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public void CompanyProfile() throws InterruptedException 
	{
		Complete_Profile.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Company_Website_URL.clear();
		Company_Website_URL.sendKeys("https://bdiplus.com/");
				
		cancel1.click();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Browse1.click();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('style')", Browse1);
		Browse1.sendKeys("C:\\Users\\BDIPlusLab\\Desktop\\0002.jpg");
		
		cancel2.click();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Browse2.click();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('style')", Browse2);
		Browse2.sendKeys("C:\\Users\\BDIPlusLab\\Desktop\\0002.jpg");
	
		About_Company.clear();
		About_Company.sendKeys("This is a very gd company. I am looking foward to work on this company.");
		
		facebook.clear();
		facebook.sendKeys("www.facebook.com");
		
		twitter.clear();
		twitter.sendKeys("www.twitter.com");
		
		linkedin.clear();
		linkedin.sendKeys("www.linkedin.com");
		
		//save.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
}

