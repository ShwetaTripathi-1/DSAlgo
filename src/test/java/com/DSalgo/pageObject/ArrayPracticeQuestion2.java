package com.DSalgo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class ArrayPracticeQuestion2 extends BaseClass {
	
	public ArrayPracticeQuestion2()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	@CacheLookup
	WebElement Ques2txteditor;
	
	@FindBy(xpath=" //button[normalize-space()='Run']")
	@CacheLookup
	WebElement Ques2BtnRun;
	
	@FindBy(xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement Ques2BtnSubmit;

	public void txtEditorQues2(String Ques2)
	{
		WebElement codeLine = Ques2txteditor.findElements(By.className("CodeMirror-line")).get(0);
    	codeLine.click();
    	driver.findElement(By.cssSelector(".CodeMirror textarea")).sendKeys(Ques2);
	}
	
	public void clickQues2RunBtn()
	{
		Ques2BtnRun.click();
		if(IsAlertPresent2()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
		}
		
	}
	
	public void clickQues2SubmitBtn() {
		Ques2BtnSubmit.click();
	}
	
	public boolean IsAlertPresent2()
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


