package com.DSalgo.testCases;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DSalgo.pageObject.GetStartedPage;
import com.DSalgo.pageObject.HomePage;
import com.DSalgo.pageObject.LoginPage;
import com.DSalgo.Util.XlUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.setUsername(user);
		logger.info("UserName Entered");
		lp.setPassword(pwd);
		logger.info("Password Entered");
		lp.clickLogInBtn();
		}
	

	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path="C:\\Users\\HP\\Downloads\\Login_Data.xlsx";
		
		int rownum=XlUtils.getRowCount(path, "Sheet1");
		int colcount=XlUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XlUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	
	}

	
}
