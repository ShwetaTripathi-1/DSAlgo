package com.DSalgo.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.DSalgo.pageObject.DataStructureIntroductionPage;
import com.DSalgo.pageObject.DataStructureTimeComplexityPage;
import com.DSalgo.pageObject.HomePage;
import com.DSalgo.pageObject.TryHereEditorPage;

public class TC_DataStructureTest_005 extends BaseClass  {
	@Test
	public void DSIntroTest() throws InterruptedException
	{  
		
		//driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		
		HomePage hop = new HomePage();
		hop.clickHomePageDataStructureBtnGetStarted();
		Thread.sleep(3000);
		
		DataStructureIntroductionPage dsIntroPage =new DataStructureIntroductionPage();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,350)", "");
		dsIntroPage.clickDSIntroTimeComplexityLnk();
		Thread.sleep(3000);
		
		DataStructureTimeComplexityPage dstimeComplexityPage = new DataStructureTimeComplexityPage();
		dstimeComplexityPage.clickDataStructureTimeComplexityPageLnkPracticeQuestions();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		 js.executeScript("window.scrollBy(0,1000)", "");
		 dstimeComplexityPage.clickDataStructureTimeComplexityPageLnkTryHere();
		   
		   
		TryHereEditorPage tep = new TryHereEditorPage();
		tep.Editortxt(TextEditor);
		tep.clickBtnRun();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		
		
	}

}
