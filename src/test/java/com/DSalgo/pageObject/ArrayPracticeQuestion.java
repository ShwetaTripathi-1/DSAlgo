package com.DSalgo.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class ArrayPracticeQuestion extends BaseClass {
	
	public ArrayPracticeQuestion()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Search the array']")
	@CacheLookup
	WebElement Question1;
	
	@FindBy(xpath="//a[normalize-space()='Max Consecutive Ones']")
	@CacheLookup
	WebElement Question2;
	
	@FindBy(xpath="//a[normalize-space()='Find Numbers with Even Number of Digits']")
	@CacheLookup
	WebElement Question3;
	
	@FindBy(xpath="//a[contains(text(),'Squares of')]")
	@CacheLookup
	WebElement Question4;
	
	public void clickQuestion1Lnk() {
		Question1.click();
	}
	public void clickQuestion2Lnk() {
		Question2.click();
		
	}
	public void clickQuestion3Lnk() {
		Question3.click();
	}
	public void clickQuestion4Lnk() {
		Question4.click();
	}
	
}
