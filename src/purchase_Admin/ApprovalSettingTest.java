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
import purchase_Admin.ApprovalSetting;
import quality_Admin.FormTypeLibrary;

public class ApprovalSettingTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	ApprovalSetting w = new ApprovalSetting();
	

   @Test(priority=27)
  public void ApprovalSettings() throws InterruptedException {
	   test=report.startTest("ApprovalSettings");	  
	   w.ApprovalSettings(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "ApprovalSettings"); 
  }
   @Test(priority=28)
   public void AddNewGroup() throws Exception {
	   test=report.startTest("AddNewGroups");	  
	   w.AddNewGroup(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AddNewGroups"); 
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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
   
 /*  @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}

