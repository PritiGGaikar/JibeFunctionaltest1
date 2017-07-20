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
import technical_PMS.JobsHistory;


public class JobsHistoryTest extends WebDriverPass{

	ExtentReports report;
	ExtentTest test;
	
	JobsHistory w = new JobsHistory();
	
	@Test(priority=15)
 
  public void Technicalt() throws Exception {
	  test=report.startTest("Technical");	
	  w.Technical(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "Technical"); 
	 	    
  }

	  @Test(priority=16)
	  public void Systemlocation1() throws Exception {
		  test=report.startTest("System location1");		  
		  w.Systemlocation1(driver);    
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "System location1"); 
	 
	  }

	/*  @Test(priority=16)
	  public void Systemlocation2() throws Exception {
		  	  
		  test=report.startTest("System location2");	
		  w.Systemlocation2(driver);  
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "System location2"); 
	 
	  }
	  

	  @Test(priority=17)
	  public void Systemlocation3() throws Exception {
		  	  
		  test=report.startTest("System location3");	
		  w.Systemlocation3(driver);   
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "System location3"); 
	 
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
		  report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html");	  }
	/* 
	 @AfterSuite
	public void afterSu() {
	     report.close();
	 }*/
	  
}
