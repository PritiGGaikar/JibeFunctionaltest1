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
import crew_Admin.Schools;
import quality_Admin.FormTypeLibrary;


public class SchoolTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	Schools s = new Schools();
	
 @Test(priority=1)
  public void SchoolModule() throws Exception {
	 test=report.startTest("Add School");
	  s.SchoolAdd(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add School"); 
  }
 
 @Test(priority=2)
 public void SchoolModule1() throws Exception {
	  test=report.startTest("Edit School");
	  s.SchoolEdit(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Edit School"); 
	  }
 
 @Test(priority=3)
 public void SchoolModule2() throws Exception {
	  test=report.startTest("Delete School");
	  s.SchoolDelete(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete School"); 
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
	 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html");		
}

}

