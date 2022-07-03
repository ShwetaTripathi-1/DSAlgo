package com.DSalgo.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class ArrayInPythonPage extends BaseClass {

	//WebDriver ldriver;
	public ArrayInPythonPage()
	{
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/tryEditor' and text()='Try here>>>']")
	@CacheLookup
	WebElement ArrayInPythonLnkTryHere;
	

	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	@CacheLookup
	WebElement txtEditor;
	
	@FindBy(xpath="//button[@type='button' and text()='Run']")
	@CacheLookup
	WebElement BtnRun;
	
	@FindBy(xpath="//a[normalize-space()='Practice Questions']")
	@CacheLookup
	WebElement LnkPracticeQuestion;
	
	public void clickLnkPracticeQuestion(){
		LnkPracticeQuestion.click();
	}
	
	
	
	
	public void clickArrayInPythonLnkTryHere(String txt) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ArrayInPythonLnkTryHere);
		ArrayInPythonLnkTryHere.click();	
		txtEditor.sendKeys(txt);
		BtnRun.click();
		driver.navigate().back();
		Thread.sleep(3000);
		js.executeScript("windows.scrollTo(0,0)");
	}
	
}
