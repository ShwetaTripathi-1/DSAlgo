package com.DSalgo.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.DSalgo.pageObject.ApplicationOfArray;
import com.DSalgo.pageObject.ArrayInPythonPage;
import com.DSalgo.pageObject.ArrayPage;
import com.DSalgo.pageObject.ArrayPracticeQuestion;
import com.DSalgo.pageObject.ArrayPracticeQuestion1;
import com.DSalgo.pageObject.ArrayPracticeQuestion2;
import com.DSalgo.pageObject.ArrayPracticeQuestion3;
import com.DSalgo.pageObject.ArrayPracticeQuestion4;
import com.DSalgo.pageObject.ArrayUsingList;
import com.DSalgo.pageObject.BasicOperationInList;
import com.DSalgo.pageObject.HomePage;
import com.DSalgo.pageObject.TryHereEditorPage;

public class TC_ArrayTest_006  extends BaseClass{
	
	@Test
	public void ArrayTest() throws InterruptedException
	{
		
		HomePage homepage = new HomePage();
		homepage.clickHomePageArrayBtnGetStarted();
	
		//landed on array page
		ArrayPage ap =new ArrayPage();
		ap.clickLnkArrayInPython();
		
		
		ap.clickArrayTryHere(TextEditor);
		Thread.sleep(2000);
		
		ap.clickLnkArrayUsingList();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(350,0)", "");
		
		ap.clickArrayTryHere(TextEditor);
		Thread.sleep(2000);
		
		
		ap.clickLnkBasicOperationsInList();
		ap.clickArrayTryHere(TextEditor);
		Thread.sleep(2000);
		
		ap.clickLnkApplicationsOfArray();
		ap.clickArrayTryHere(TextEditor);
		Thread.sleep(3000);
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
		Thread.sleep(3000);
		
		ArrayInPythonPage aip = new ArrayInPythonPage();
		aip.clickLnkPracticeQuestion();
		
		ArrayPracticeQuestion ques =new ArrayPracticeQuestion();
		ques.clickQuestion1Lnk();
		
		ArrayPracticeQuestion1 qone = new ArrayPracticeQuestion1();
		qone.txtEditorQues1(TextEditor);
		Thread.sleep(3000);
		qone.clickQues1RunBtn();
		qone.clickQues1SubmitBtn();
		 driver.navigate().back();
		 
		 ques.clickQuestion2Lnk();
		 Thread.sleep(3000);
		 ArrayPracticeQuestion2 q2 = new ArrayPracticeQuestion2(); 
		q2.txtEditorQues2(TextEditor);
		 q2.clickQues2RunBtn();
		 q2.clickQues2SubmitBtn();
		  driver.navigate().back();
		  
		 ques.clickQuestion3Lnk();
		 Thread.sleep(3000);
		 ArrayPracticeQuestion3 q3 = new ArrayPracticeQuestion3(); 
		q3.txtEditorQues3(TextEditor);
		 q3.clickQues3RunBtn();
		 q3.clickQues3SubmitBtn();
		  driver.navigate().back();
		  
		 ques.clickQuestion4Lnk();
		 Thread.sleep(3000);
		 ArrayPracticeQuestion4 q4 = new ArrayPracticeQuestion4(); 
		q4.txtEditorQues4(TextEditor);
		 q4.clickQues4RunBtn();
		 q4.clickQues4SubmitBtn();
		 }

}
