package com.DSalgo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class ArrayPracticeQuestion3 extends BaseClass{
	
	public ArrayPracticeQuestion3()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='CodeMirror-lines']")
	@CacheLookup
	WebElement Ques3txteditor;
	
	@FindBy(xpath="//button[normalize-space()='Run'] ")
	@CacheLookup
	WebElement Ques3BtnRun;
	
	@FindBy(xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement Ques3BtnSubmit;
	
	public void txtEditorQues3(String Ques3)
	{
		WebElement codeLine = Ques3txteditor.findElements(By.className("CodeMirror-line")).get(0);
    	codeLine.click();
    	driver.findElement(By.cssSelector(".CodeMirror textarea")).sendKeys(Ques3);
	}
	
	public void clickQues3RunBtn()
	{
		Ques3BtnRun.click();
		if(IsAlertPresent3()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
		}
		
	}
	
	public void clickQues3SubmitBtn() {
		Ques3BtnSubmit.click();
	}
	
	public boolean IsAlertPresent3()
	{
		try {
			driver.switchTo().alert();
			return true;
			}catch(NoAlertPresentException e)
		{
				return false;
			}
	}

}
