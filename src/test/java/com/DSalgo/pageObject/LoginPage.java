package com.DSalgo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSalgo.testCases.BaseClass;

public class LoginPage extends BaseClass
{
	public LoginPage()
		{
	
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(name="username" )
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password" )
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	@CacheLookup
	WebElement BtnLogin;
	 
/*	@FindBy(xpath="/a[normalize-space()='Sign out']")
	@CacheLookup
	static
	WebElement BtnSignout;
*/	
	@FindBy(xpath="//a[@href=\"/register\" and text() = 'Register!'] ")
	@CacheLookup
	WebElement LinkRegister;
	
/*	public static boolean SignOutBtnVisibility()
	{
		return BtnSignout.isDisplayed();
		
	}
*/	
	public void setUsername(String uname)
	{
		txtUserName.sendKeys(uname);
		}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		}
	
	public void clickLogInBtn()
	{
		BtnLogin.click();
		
	}
	
	public void clickRegister()
	{
		LinkRegister.sendKeys();
		
	}

}
