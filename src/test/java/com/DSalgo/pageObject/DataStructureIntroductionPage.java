package com.DSalgo.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;
//import com.DSalgo.testCases.dsIntroPage;

public class DataStructureIntroductionPage extends BaseClass {
	
	//WebDriver ldriver;
	public DataStructureIntroductionPage()
	{
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='time-complexity' and text()='Time Complexity']")
	@CacheLookup
	WebElement DSIntroLnkTimeComplexity;
	
	public void clickDSIntroTimeComplexityLnk() throws InterruptedException {
		
		DSIntroLnkTimeComplexity.click();	
	}
}
