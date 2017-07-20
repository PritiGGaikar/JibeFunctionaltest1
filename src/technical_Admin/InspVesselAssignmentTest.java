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
import quality_Admin.FormTypeLibrary;
import technical_Admin.InspVesselAssignment;

public class InspVesselAssignmentTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	InspVesselAssignment w = new InspVesselAssignment();
	
	  @Test(priority=23)
	  public void VesselAssignment() throws Exception {
		  test=report.startTest("VesselAssignment");	  
		   w.VesselAssignment(driver);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Vessel Assignment"); 
	  }

	  @Test(priority=24)
	  public void SaveVesselAssignment() throws Exception {
		  test=report.startTest("SaveVesselAssignment");	  
		   w.SaveVesselAssignment(driver);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Save Vessel Assignment");   
	  }

	  @Test(priority=25)
	  public void SaveVesselAssignment1() throws Exception {
		  test=report.startTest("SaveVesselAssignment1");	  
		   w.SaveVesselAssignment1(driver);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Save Vessel Assignment1");  
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
