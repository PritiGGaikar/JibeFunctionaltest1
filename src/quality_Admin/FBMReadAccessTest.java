package quality_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import quality_Admin.FBMReadAccess;
import quality_Admin.FormTypeLibrary;


public class FBMReadAccessTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	FBMReadAccess w = new FBMReadAccess();
	

   @Test(priority=2)
  public void FBMReadAcces() throws InterruptedException {
	   test=report.startTest("FBMReadAcces");	  
	   w.FBMReadAcces(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "FBMReadAcces"); 
  }
   @Test(priority=3)
   public void Assignment() throws Exception {
	   test=report.startTest("Assignment");	  
	   w.Assignment(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Assignment"); 
  }
   
   @AfterMethod
  	public void afterMethod(ITestResult result) {
  	    if (result.getStatus() == ITestResult.FAILURE) {
  	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
  	    } else if (result.getStatus() == ITestResult.SKIP) {
  	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
  	    } else {
  	        test.log(LogStatus.PASS, "Test passed");
  	    }
  	    report.endTest(test);
  	    report.flush();
  }
   @BeforeSuite
   public void beforeSu() {
	   report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html");	  }
 /*  
   @AfterSuite
  public void afterSu() {
       report.close();}*/
   

}
