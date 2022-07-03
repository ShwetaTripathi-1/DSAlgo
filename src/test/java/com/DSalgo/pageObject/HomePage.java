package com.DSalgo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class HomePage extends BaseClass {
	
//	WebDriver ldriver;
	//public HomePage (WebDriver rdriver)
public HomePage()
{
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Sign out\"]")
	@CacheLookup
	WebElement LnkSignout;
	
	@FindBy(xpath="//div[3][@class=\"alert alert-primary\"] ")
	@CacheLookup
	WebElement HomePageErrorMsg;
	
	@FindBy(xpath="//div[2]//ul//a[@href='/login']")
	@CacheLookup
	WebElement LnkSignIn;
	
	@FindBy(xpath="//div[1]//a[text()=' Register ']")
	@CacheLookup
	WebElement HomePageLnkRegister;
	
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	@CacheLookup
	WebElement HomePageDataStructureBtnGetStarted;
	
	
	@FindBy(xpath="//a[@href='array']")
	@CacheLookup
	WebElement HomePageArrayBtnGetStarted;
	
	
	
	
	public void clickLnkSignOut() {
		
		LnkSignout.click();
	}
	
    public void clickLnkSignIn() {
		
    	LnkSignIn.click();
	}
	
	public void clickHomePageLnkRegister() {
		HomePageLnkRegister.click();
	}

	public void clickHomePageDataStructureBtnGetStarted() {
		
		HomePageDataStructureBtnGetStarted.click();
	}
	
public void clickHomePageArrayBtnGetStarted() {
		
		HomePageArrayBtnGetStarted.click();
	}
	
	
    public Boolean IsErrorMsg() {
    	HomePageErrorMsg.isDisplayed();
    	return true;
		 
	}
}
