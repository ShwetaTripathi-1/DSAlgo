package com.DSalgo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.DSalgo.pageObject.GetStartedPage;
import com.DSalgo.pageObject.HomePage;
import com.DSalgo.pageObject.LoginPage;
import com.DSalgo.pageObject.RegisterPage;

public class TC_RegisterTest_003 extends BaseClass {
	@Test
	public void RegisterTest() throws InterruptedException, IOException
	{
		//logger.info("URL is opened");
		
		
	/*	GetStartedPage gp = new GetStartedPage();
		gp.clickBtnGetStarted();

		HomePage hp = new HomePage();
		hp.clickHomePageLnkRegister();
		Thread.sleep(3000);
		*/
		RegisterPage rp = new RegisterPage();
		rp.setRegisterPageUsername(username);
		logger.info("UserName Entered");
		rp.setRegisterPagePassword(password);
		logger.info("Password Entered");
		rp.setRegisterPageConfirmPassword(password);
		logger.info("confirm password entered");
		Thread.sleep(3000);
		
		rp.clickRegisterPageLnkLogin();
		Thread.sleep(3000);
		
	/*	LoginPage lp = new LoginPage();
		lp.setUsername(username);
		logger.info("UserName Entered");
		lp.setPassword(password);
		logger.info("Password Entered");
		lp. clickLogInBtn();
		
		
		if(driver.getTitle().equals("NumpyNinja"))
		{
			AssertJUnit.assertTrue(true);
			logger.info("Login Test passed");
		}
		else {
			captureScreen( driver , "loginTest");
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
			
		}*/
	}

}
