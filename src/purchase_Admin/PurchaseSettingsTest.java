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
import purchase_Admin.PurchaseSettings;
import quality_Admin.FormTypeLibrary;


public class PurchaseSettingsTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	PurchaseSettings w = new PurchaseSettings();
	

   @Test(priority=22)
  public void PurchaseSetting() throws InterruptedException {
	   test=report.startTest("PurchaseSettings");	  
	   w.PurchaseSetting(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Purchase Settings"); 
  }
   @Test(priority=23)
   public void PerchaseConfiSetting() throws Exception {
	   test=report.startTest("PerchaseConfiSetting");	  
	   w.PerchaseConfiSetting(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Perchase Confi Setting"); 
  }
   @Test(priority=24)
   public void PerchaseMandatory() throws Exception {
	   test=report.startTest("PerchaseMandatory");	  
	   w.PerchaseMandatory(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Perchase Mandatory"); 
  }
   @Test(priority=25)
   public void CaptureRank() throws Exception {
	   test=report.startTest("CaptureRank");	  
	   w.CaptureRank(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Capture Rank"); 
  }
   @Test(priority=26)
   public void AutomaticRequisition() throws Exception {
	   test=report.startTest("AutomaticRequisition");	  
	   w.AutomaticRequisition(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Automati cRequisition"); 
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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 		  
   
  /* @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}
}