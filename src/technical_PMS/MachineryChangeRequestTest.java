package technical_PMS;

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






public class MachineryChangeRequestTest extends WebDriverPass {

	ExtentReports report;
	ExtentTest test;
    MachineryChangeRequest w = new MachineryChangeRequest();
	
  @Test(priority=19)
  public void MachineryCRIndex() throws Exception {
	  test=report.startTest("MachineryCRIndex");	
	  w.MachineryCRIndex(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "MachineryCRIndex"); 
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
      report.close();
  }*/
}
