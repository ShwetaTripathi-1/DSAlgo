package com.DSalgo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.DSalgo.pageObject.GetStartedPage;

public class TC_GetStartedTest extends BaseClass {
	@Test
	public void  getStartedTest() throws IOException, InterruptedException 
	{
		logger.info("URL is Opened");
		GetStartedPage gp= new GetStartedPage();
		gp.clickBtnGetStarted();
		
		if(driver.getTitle().equals("NumpyNinja"))
		{
			AssertJUnit.assertTrue(true);
			logger.info("Login Test passed");
			//Thread.sleep(3000);
		}
		else
		{
			
			captureScreen( driver , "loginTest");
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
	}

}
}
