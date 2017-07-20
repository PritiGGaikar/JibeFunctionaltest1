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
import crew_Admin.OnBoardStaffLimit;
import quality_Admin.FormTypeLibrary;



public class OnBoardStaffLimitTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	OnBoardStaffLimit r=new OnBoardStaffLimit();
	
	@Test(priority=1)
	  public void Adminm() throws Exception {
		  test=report.startTest("Crew module ");
		  r.Adminm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->On Board Staff Limit"); 
		   }
	@Test(priority=2)
	  public void search() throws Exception {
		  test=report.startTest("On Board Staff Limit");
		  r.search(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "On Board Staff Limit"); 
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
