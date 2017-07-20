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
import technical_Admin.PMSAccess;





public class PMSAccessTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	

	PMSAccess w = new PMSAccess();
	
	

	@Test(priority=39) 
	 public void PMSAccess()throws Exception {
		 test=report.startTest("PMS Access");	  
	 w.PMSAccess(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "PMS Access"); 
	}
	 @Test(priority=40)
	public void AddPMSAccess()throws Exception {
		 test=report.startTest("AddPMSAccess");	  
	w.AddPMSAccess(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AddPMSAccess"); 
	}
	 
	 @Test(priority=41)
	 public void EditPMSAccess()throws Exception {
		 test=report.startTest("EditPMSAccess");	  
	 w.EditPMSAccess(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "EditPMSAccess"); 
	 }
	
	   @Test(priority=42)
		 public void Delete()throws Exception {
			 test=report.startTest("Delete");	   
		 w.Delete(driver);
		  Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Delete"); 
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
