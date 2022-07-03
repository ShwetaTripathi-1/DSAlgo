package com.DSalgo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class ApplicationOfArray extends BaseClass{
	
	//WebDriver ldriver;
	public ApplicationOfArray()
	{
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='container']//a[ text()='Try here>>>']")
	@CacheLookup
	WebElement ApplicationOfArrayLnkTryHere;
	
	
	
	public void clickApplicationOfArrayLnkTryHere() {
		ApplicationOfArrayLnkTryHere.click();	
	}

}
