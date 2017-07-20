package crew_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import crew_Admin.OilMajors;
import quality_Admin.FormTypeLibrary;


public class OilMajorTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	OilMajors o = new OilMajors();
	
  @Test(priority=1)
  public void OilMajorModule() throws Exception {
	  test=report.startTest("Add Oil Majors");
	  o.OilMajorIndex(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add Oil Majors"); 
	  }
  
  @Test(priority=2)
  public void OilMajorModule1() throws Exception {
	  test=report.startTest("Edit Oil Major");
	  o.OilMajorEdit(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Edit Oil Major"); 
	  }
  
  /*
  @Test(priority=3)
  public void OilMajorModule2() throws Exception {
	  test=report.startTest("Delete Oil Major");
	  o.OilMajorDelete(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete Oil Major"); 
	  }*/
  
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
    	 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html");		
        }
  
 
}
