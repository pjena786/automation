package com.assignment.modules;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.assignment.baseClass.BaseClass;

public class OfficeLocationPage extends BaseClass {
	static WebDriverWait wait;

	//Page Object Elements
	@FindBy(xpath="//div[@class='header'][contains(text(),'Add office locations')]")
	WebElement Office_Locations;
	
	@FindBy(xpath="//div[@class='ui green button']")
	WebElement Add_office_location;

	@FindBy(xpath = "//input[@placeholder='e.g. Head Office']")
	WebElement Location_Name;

	@FindBy(xpath = "//div[contains(text(),'Select City')]")
	WebElement City;
	
	@FindBy(xpath = "//input[@name='state']")
	WebElement State ;
	
	@FindBy(xpath = "//input[@name='zipcode']")
	WebElement Zip_Code;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[6]/div/div[2]/div/div[3]/div[2]/div/input[2]")
	WebElement Country;
	
	@FindBy(xpath = "//div[contains(text(),'Select Timezone')]")
	WebElement Timezone;
	
	@FindBy(xpath = "//div[@class='actions']//div[@class='ui green button'][contains(text(),'Add')]")
	WebElement Add;
	
	@FindBy(partialLinkText = "Office Locatio")
	WebElement Office_Locationslink;
	
	//Initializing The Page Objects:
	public OfficeLocationPage() 
	{
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public void OfficeLocation() throws InterruptedException 
	{
		Office_Locations.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Add_office_location.click();
		
		Location_Name.sendKeys("Head Office, India");
		
		Actions actcity = new Actions(driver);
		actcity.click(City).sendKeys("Bengaluru").sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		
		State.sendKeys("Karnataka");
		
		Zip_Code.sendKeys("560037");
			
		
		Actions actcountry = new Actions(driver);
		actcountry.click(Country).sendKeys("India").sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();

	
		Actions acttime = new Actions(driver);
		acttime.click(Timezone).sendKeys("Asia/Kolkata").sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		
		Add.click();
	}
}

