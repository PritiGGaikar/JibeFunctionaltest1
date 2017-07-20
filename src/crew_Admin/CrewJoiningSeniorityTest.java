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
import crew_Admin.CrewJoiningSeniority;
import quality_Admin.FormTypeLibrary;



public class CrewJoiningSeniorityTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	CrewJoiningSeniority r=new CrewJoiningSeniority();
	
	
	
	@Test(priority=1)
	  public void Adminm() throws Exception {
		  test=report.startTest("CrewJoiningSeniorityTest ");
		  r.Adminm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->Crew Joining Seniority"); 
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