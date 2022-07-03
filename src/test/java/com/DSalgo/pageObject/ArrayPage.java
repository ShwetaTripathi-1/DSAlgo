package com.DSalgo.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class ArrayPage extends BaseClass {
	
	//WebDriver ldriver;
	public ArrayPage()
	{
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='arrays-in-python' and text()='Arrays in Python']")
	@CacheLookup
	WebElement LnkArrayInPython;
	
	@FindBy(xpath="//a[@href='arrays-using-list' and text()='Arrays Using List']")
	@CacheLookup
	WebElement LnkArrayUsingList;
	
	@FindBy(xpath="//a[@href='basic-operations-in-lists' and text()='Basic Operations in Lists']")
	@CacheLookup
	WebElement LnkBasicOperationsInList;
	
	@FindBy(xpath="//a[@href='applications-of-array' and text()='Applications of Array']")
	@CacheLookup
	WebElement LnkApplicationsOfArray;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	@CacheLookup
	WebElement txtEditor;
	
	@FindBy(xpath="//button[@type='button' and text()='Run']")
	@CacheLookup
	WebElement BtnRun;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	@CacheLookup
	WebElement LnkTryHere;
	
	public void clickLnkArrayInPython()
	{
		LnkArrayInPython.click();
	}
	
	public void clickLnkArrayUsingList()
	{
		LnkArrayUsingList.click();
	}
	
	public void clickLnkBasicOperationsInList() {
		LnkBasicOperationsInList.click();
		
	}
	
	public void clickLnkApplicationsOfArray() {
		LnkApplicationsOfArray.click();
	}

	
	
	public void clickArrayTryHere(String txt) {
	   
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	        	LnkTryHere = driver.findElement(By.xpath("//a[normalize-space()='Try here>>>']"));
	        	
	        	
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	    		js.executeScript("arguments[0].scrollIntoView()",LnkTryHere);
	    		
	    		
	    		LnkTryHere.click();	
	    		sendTxtKeys(TextEditor);
	    		txtEditor.sendKeys(txt);
	    		BtnRun.click();
	    		driver.navigate().to("https://dsportalapp.herokuapp.com/array/");;
	    		js.executeScript("window.scrollTo(0,350)");
	            
	            break;
	        } catch(StaleElementReferenceException e) {
	        	System.out.print(e);
	        }
	        catch(Exception e) {
	        	System.out.print(e);
	        }
	        attempts++;
	    }
	   
	}
	public void sendTxtKeys(String txt) {
		   
	    int attempts = 0;
	    while(attempts < 10) {
	        try {
	        	
	        	txtEditor = driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']"));
	        	BtnRun = driver.findElement(By.xpath("//button[@type='button' and text()='Run']"));
	        	
	        	WebElement codeLine = txtEditor.findElements(By.className("CodeMirror-line")).get(0);
	        	codeLine.click();
	        	
	        	
	        	driver.findElement(By.cssSelector(".CodeMirror textarea")).sendKeys(TextEditor);
	        	
	        	
	        	
	    		
	    		BtnRun.click();
	    	
	            
	            break;
	        } catch(StaleElementReferenceException e) {
	        	System.out.print(e);
	        }
	        catch(Exception e) {
	        	System.out.print(e);
	        }
	        attempts++;
	    }
	   
	}
	
	
	
}


