package travel_Admin;

import java.util.concurrent.TimeUnit;

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
import travel_Admin.TravelAdmin;



public class TravelAdminTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	TravelAdmin T=new TravelAdmin();
	
  @Test(priority=0)
  public void Travel() throws Exception {
	  test=report.startTest("Travel");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

	  T.Travel(driver);
	  Assert.assertTrue(true);
	   test.log(LogStatus.PASS, "Travel"); 
  }
  
  @Test(priority=1)
  public void TravelQtnUserAssignmentg() throws Exception {
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		test=report.startTest("TravelQtnUserAssignmentg");
	  T.TravelQtnUserAssignmentg(driver);
	  Assert.assertTrue(true);
	   test.log(LogStatus.PASS, "TravelQtnUserAssignmentg"); 
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
		 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\TravelAdmin.html");		
	}

	}