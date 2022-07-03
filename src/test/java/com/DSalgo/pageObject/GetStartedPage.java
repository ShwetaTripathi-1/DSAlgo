package com.DSalgo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class GetStartedPage extends BaseClass {
	
	//WebDriver ldriver;
	
	public GetStartedPage()
	{
	//ldriver=rdriver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text() ='Get Started']" )
	@CacheLookup
	WebElement BtnGetStarted;
	
	public void clickBtnGetStarted()
	{
		BtnGetStarted.click();
	}
}