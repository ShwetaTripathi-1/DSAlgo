package com.DSalgo.testCases;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.DSalgo.Util.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig readConfig = new ReadConfig();
	public String TextEditor=readConfig.getTxtEditor();
	public String BaseUrl=readConfig.getApplicationUrl();
	public String username =readConfig.getUserName();
	public String password=readConfig.getPassword();
	public static WebDriver driver ;
	
	public static Logger logger;
	
	
	@Parameters("brower")
	@BeforeTest
	public void setup( String br)
	{
		logger = Logger.getLogger("DSalgo");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equalsIgnoreCase("chrome")) {
			 driver = WebDriverManager.chromedriver().create();
		}
		else if (br.equalsIgnoreCase("FireFox")) {
				driver = WebDriverManager.firefoxdriver().create();
		}
		else if(br.equalsIgnoreCase("IE")) {
		driver = WebDriverManager.iedriver().create();
		}
		driver.get(BaseUrl);
		driver.manage().window().maximize();
		
	}
    
	@AfterTest
	public void tearDown() throws InterruptedException
	
	{
		Thread.sleep(3000);
		driver.quit();
	}
 
	public void captureScreen(WebDriver driver , String tname) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshot/" + tname +".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenhot Taken");
		
	}
}
