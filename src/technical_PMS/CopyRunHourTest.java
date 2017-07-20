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


public class CopyRunHourTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	CopyRunHour w = new CopyRunHour();
	

   @Test(priority=43)
  public void CopyRunHrs() throws InterruptedException {
	   test=report.startTest("CopyRunHrs");	  
	   w.CopyRunHrs(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "CopyRunHrs"); 
  }
   
  @Test(priority=44)
   public void FleetB() throws  Exception {
	  test=report.startTest("FleetB");	  	  
 	   w.FleetB(driver);
 	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "FleetB"); 
   }
   
   @Test(priority=45)
   public void Source() throws  Exception {
	   test=report.startTest("Source");	    	  
 	   w.Source(driver);
 	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "Source"); 
   }
   
   @Test(priority=46)
   public void FleetOffice() throws  Exception {
	   test=report.startTest("FleetOffice");	  	  	  
 	   w.FleetOffice(driver);
 	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "FleetOffice"); 
   }
   @Test(priority=47)
   public void TestFleet() throws  Exception {
	   test=report.startTest("TestFleet");	  	  
 	   w.TestFleet(driver);
 	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "TestFleet"); 
   } 
   @Test(priority=48)
   public void test_fleet1() throws  Exception {
	   test=report.startTest("test_fleet1");	    	  
 	   w.test_fleet1(driver);
 	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "test_fleet1"); 
   }
   
   @Test(priority=49)
   public void test_fleet2() throws  Exception {
	   test=report.startTest("test_fleet2");	    	  
 	   w.test_fleet2(driver);
 	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "test_fleet2"); 
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
 
/* @AfterSuite
public void afterSu() {
     report.close();
 }*/
}
