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
public class JobStatusTest extends WebDriverPass{

	ExtentReports report;
	ExtentTest test;
	JobStatus w = new JobStatus();
	
	
  @Test(priority=14)
  public void PMSModule() throws Exception {
	  test=report.startTest("PMSindex");	
	  w.PMSindex(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "PMSindex"); 
	  
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
	  report = JobStatus.getReporter("C:\\Users\\Reshma\\workspace\\Technical\\Report.html");
	  }
 /* 
  @AfterSuite
 public void afterSu() {
      report.close();
  }*/
}
