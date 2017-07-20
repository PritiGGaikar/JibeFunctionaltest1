package technical_Reports;

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



public class PortStateTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	
	PortState p = new PortState();
	
  @Test
  public void PortStateModule() throws Exception {
	  test=report.startTest("Port State Control Deficiencies");
	  p.PortStateIndex(driver);
	  
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "Assert pass as condtion is true"); 
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
   
	  
	  
	  
  
}
