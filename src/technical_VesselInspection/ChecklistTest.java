package technical_VesselInspection;

import org.testng.Assert;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import quality_Admin.FormTypeLibrary;





public class ChecklistTest extends WebDriverPass{
	 ExtentReports report;
	 ExtentTest test;
	
	Checklist c=new Checklist();
	
	
	
  @Test(priority=72)
  public void checklist() throws Exception {
	  test=report.startTest("checklist");
	  c.checklistindex(driver);
	  Assert.assertTrue(true);
  	   test.log(LogStatus.PASS, "checklist"); 
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

 @AfterSuite
public void afterSu() {
    report.close(); 
}

}



