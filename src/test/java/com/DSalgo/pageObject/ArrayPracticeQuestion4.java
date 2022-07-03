package com.DSalgo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class ArrayPracticeQuestion4 extends BaseClass{
	
	public ArrayPracticeQuestion4()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	@CacheLookup
	WebElement Ques4txteditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	@CacheLookup
	WebElement Ques4BtnRun;
	
	@FindBy(xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement Ques4BtnSubmit;
	
	public void txtEditorQues4(String Ques4)
	{
		WebElement codeLine = Ques4txteditor.findElements(By.className("CodeMirror-line")).get(0);
    	codeLine.click();
    	driver.findElement(By.cssSelector(".CodeMirror textarea")).sendKeys(Ques4);
	}
	
	public void clickQues4RunBtn()
	{
		Ques4BtnRun.click();
		if(IsAlertPresent4()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
		}
		
	}
	
	public void clickQues4SubmitBtn() {
		Ques4BtnSubmit.click();
	}
	
	public boolean IsAlertPresent4()
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
