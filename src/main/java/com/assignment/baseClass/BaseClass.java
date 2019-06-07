package com.assignment.baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass()
	{
		try 
		{
			prop = new Properties();
			FileInputStream in = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/assignment/config/configfile");

			prop.load(in);
		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
	}

	public static void initializeWebdriver()
	{
	String browser = prop.getProperty("browser");
	 if(browser.equalsIgnoreCase("chrome")) 
	 {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			WebDriverManager.chromedriver().setup();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
	
			//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			// driver = new ChromeDriver(); 
      }
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(150,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	 driver.get(prop.getProperty("url"));


	}
}


