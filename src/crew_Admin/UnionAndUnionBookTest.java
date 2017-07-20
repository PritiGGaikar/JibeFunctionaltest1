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
import crew_Admin.UnionAndUnionBook;
import quality_Admin.FormTypeLibrary;



public class UnionAndUnionBookTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	UnionAndUnionBook u = new UnionAndUnionBook();
	
 @Test(priority=1)
  public void UnionAndUnionBookModule() throws Exception {
	 test=report.startTest("Union And Union Branch");
	  u.UnionAndUnionBranch(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Union And Union Branch"); 
  }
 
 @Test(priority=2)
 public void OilMajorModule1() throws Exception {
	  test=report.startTest("Union Book");
	  u.UnionBook(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Union Book"); 
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

