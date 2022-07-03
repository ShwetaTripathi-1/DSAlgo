package com.DSalgo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class TryHereEditorPage extends BaseClass {

	
	public TryHereEditorPage()
	{
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	@CacheLookup
	WebElement txtEditor;
	
	@FindBy(xpath="//button[@type='button' and text()='Run']")
	@CacheLookup
	WebElement BtnRun;
	
	public void Editortxt(String txt)
	{
		WebElement codeLine = txtEditor.findElements(By.className("CodeMirror-line")).get(0);
    	codeLine.click();
    	driver.findElement(By.cssSelector(".CodeMirror textarea")).sendKeys(txt);
    	
    }
	
	public void clickBtnRun() {
		BtnRun.click();	
	}
	
}



