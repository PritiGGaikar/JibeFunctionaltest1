package purchase_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import quality_Admin.FormTypeLibrary;


public class ProvisionsApprovalLimitTest  extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	ProvisionsApprovalLimit w = new ProvisionsApprovalLimit();
	

   @Test(priority=0)
   public void ProvisionsApprovalLimit() throws InterruptedException {
	   test=report.startTest("ProvisionsApprovalLimit");	  
	   w.ProvisionsApprovalLimit(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "ProvisionsApprovalLimit"); 
  }
   

   @Test(priority=1)
   public void SetApprovalLimit() throws Exception {
	   test=report.startTest("SetApprovalLimit");	  
	   w.SetApprovalLimit(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "SetApprovalLimit"); 
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
	  report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\PurchaseAdmin.html");			  
  
 /* @AfterSuite
 public void afterSu() {
      report.close();
  }*/
  }
}
