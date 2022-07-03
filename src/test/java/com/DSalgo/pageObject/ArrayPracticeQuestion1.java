package com.DSalgo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class ArrayPracticeQuestion1 extends BaseClass{
	
	public ArrayPracticeQuestion1()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	@CacheLookup
	WebElement Ques1txteditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	@CacheLookup
	WebElement Ques1BtnRun;
	
	@FindBy(xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement Ques1BtnSubmit;
	
	public void txtEditorQues1(String Ques1)
	{
		WebElement codeLine1 = Ques1txteditor.findElements(By.className("CodeMirror-line")).get(0);
    	codeLine1.click();
    	driver.findElement(By.cssSelector(".CodeMirror textarea")).sendKeys(Ques1);;
	}
	
	public void clickQues1RunBtn()
	{
		Ques1BtnRun.click();
		if(IsAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
		}
		
	}
	
	public void clickQues1SubmitBtn() {
		Ques1BtnSubmit.click();
	}
	
	public boolean IsAlertPresent()
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
