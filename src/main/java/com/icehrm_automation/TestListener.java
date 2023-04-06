package com.icehrm_automation;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener ,ISuitListener {
public void onStart(ISuite suite) {
	
	System.out.println("This is onStart of Isuite from testListeners");
	String suiteName = suite.getName();
	System.out.println(suiteName);
   }

public void onFinish(ISuite suite) {
	System.out.println("This is onFinish of Isuite from testListeners");

   }
	public void onStart(ITestContext context) {
		System.out.println("This is onStart of ITestContext from testListeners");

	}
 public void onFinish(ITestContext context) {
		System.out.println("This is onFinish of ITestContext from testListeners"); 
   }
     
 public void onTestStart(ITestResult result) {
		System.out.println("This is onTestStart of ITestResult  from testListeners");
   }
	
 
 public void onTestSucess(ITestResult result) {
	 
		System.out.println("This is onTest Sucess of ITestResult  from testListeners");

   }
  public void onTestFailure(ITestResult result) {
		System.out.println("This is ontest failure of ITestResult  from testListeners");

   }
public void onTestSkipped(ITestResult result) {
	
	System.out.println("this is ontestskipped of test result from the TestListener");
    }  
}

