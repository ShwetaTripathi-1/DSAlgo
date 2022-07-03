package com.DSalgo.testCases;

import org.testng.annotations.Test;

import com.DSalgo.pageObject.HomePage;

public class TC_HomePageTest_004 extends BaseClass{
	@Test
	public void HomePageTest()
	{
		HomePage hp = new HomePage();
		hp.clickHomePageLnkRegister();
	//	hp.clickHomePageDataStructureBtnGetStarted();
		
	}

	
}
