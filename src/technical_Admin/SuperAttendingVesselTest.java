package technical_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import technical_Admin.SuperAttendingVessel;

public class SuperAttendingVesselTest extends WebDriverPass{
	
	protected ExtentReports report;
	protected ExtentTest test;
	
	SuperAttendingVessel w = new SuperAttendingVessel();
	
	  @Test(priority=20)
	  public void UserList() throws Exception {
		  test=report.startTest("UserList");	  
		   w.UserList(driver);Assert.assertTrue(true);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "User List"); 
	  }
	   
	   @Test(priority=21)
	  public void AddUserRight() throws Exception {
		   test=report.startTest("AddUserRight");	  
		   w.AddUserRight(driver);Assert.assertTrue(true);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Add User Right"); 
	  }
	   
	   @Test(priority=22)
		  public void AddUserLeft() throws Exception {
		   test=report.startTest("AddUserLeft");	  
			   w.AddUserLeft(driver);Assert.assertTrue(true);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "Add User Left"); 
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
		 report = SurveyCertificateSettings.getReporter(path.concat("Report\\TechnicalAdmin.html"));		    }
	 
	/* @AfterSuite
	public void afterSu() {
	     report.close();
	 }*/
}
