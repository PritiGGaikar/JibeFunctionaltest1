package technical_Vetting;

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





public class ObservationIndexTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	ObseravtionIndex v=new ObseravtionIndex();
	
	@Test(priority=1)
	  public void ObseravtionIndexm() throws Exception {
		  test=report.startTest("vetting module ");
		  v.ObseravtionIndexm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "technical-->vetting-->vettingIndex"); 
		   }
	@Test(priority=2)
	  public void search() throws Exception {
		  test=report.startTest("search vetting");
		  v.search(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting"); 
		   }
	  
	  @Test(priority=3)
	  public void report() throws Exception {
		  test=report.startTest("edit vetting");
		  v.report(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "edit vetting"); 
		   }
	  
	  @Test(priority=4)
	  public void Details() throws Exception {
		  test=report.startTest("details of vetting");
		  v.Details(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "details of vetting"); 
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
