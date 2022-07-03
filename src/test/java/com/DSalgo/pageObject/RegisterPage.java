package com.DSalgo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class RegisterPage extends BaseClass {
	
//WebDriver ldriver;
	
	//public RegisterPage(WebDriver rdriver )
		public RegisterPage()
		{
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//input[@name='username']" )
	@CacheLookup
	WebElement registerPageTxtUserName;
	
	@FindBy(xpath="//input[@name='password1']" )
	@CacheLookup
	WebElement registerPageTxtPassword;
	
	@FindBy(xpath="//input[@name='password2']" )
	@CacheLookup
	WebElement registerPageTxtConfirmPassword;
	
	@FindBy(xpath="//div[@class='container']//a[@href='/login']" )
	@CacheLookup
	WebElement registerPageLnkLogin;
	
	public void setRegisterPageUsername(String username)
	{
		registerPageTxtUserName.sendKeys(username);
	}
	
	public void setRegisterPagePassword(String password)
	{
		registerPageTxtPassword.sendKeys(password);
	}
	
	public void setRegisterPageConfirmPassword(String ConfirmPassword)
	{
		registerPageTxtConfirmPassword.sendKeys(ConfirmPassword);
	}
	
	

	public void clickRegisterPageLnkLogin() {
		// TODO Auto-generated method stub
		registerPageLnkLogin.click();
	}
	
}
