package com.DSalgo.testCases;



import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DSalgo.pageObject.GetStartedPage;
import com.DSalgo.pageObject.HomePage;
import com.DSalgo.pageObject.LoginPage;


public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		
		//logger.info("URL is opened");
		
		
	/*	GetStartedPage gp = new GetStartedPage();
		gp.clickBtnGetStarted();
		Thread.sleep(3000);
		
		HomePage hp = new HomePage();
		hp.clickLnkSignIn();
		Thread.sleep(3000);
		
		*/
		LoginPage lp = new LoginPage();
		lp.setUsername(username);
		Thread.sleep(3000);
		logger.info("UserName Entered");
		lp.setPassword(password);
		Thread.sleep(3000);
		logger.info("Password Entered");
		lp. clickLogInBtn();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("NumpyNinja"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}
		else
		{
			
			captureScreen( driver , "loginTest");
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
			
	
		
			
			
			}
		}
	}
	


