package com.DSalgo.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class DataStructureTimeComplexityPage extends BaseClass{
	
//WebDriver ldriver;
	
	public DataStructureTimeComplexityPage ()
		{
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']" )
	@CacheLookup
	WebElement DataStructureTimeComplexityPageLnkTryHere;
	
	@FindBy(xpath="//a[@href='/data-structures-introduction/time-complexity/' and text()='Time Complexity']" )
	@CacheLookup
	WebElement DataStructureTimeComplexityPageLnkTimeComplexity;
	
	@FindBy(xpath="//a[@href='/data-structures-introduction/practice' and text()='Practice Questions']" )
	@CacheLookup
	WebElement DataStructureTimeComplexityPageLnkPracticeQuestions;
	
	
	public void clickDataStructureTimeComplexityPageLnkTryHere() throws InterruptedException {
		DataStructureTimeComplexityPageLnkTryHere.click();
	}
	
	public void clickDataStructureTimeComplexityPageLnkTimeComplexity()
	{
		DataStructureTimeComplexityPageLnkTimeComplexity.click();
	}
	
	public void clickDataStructureTimeComplexityPageLnkPracticeQuestions() {
		DataStructureTimeComplexityPageLnkPracticeQuestions.click();
	}
	
}
