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
import technical_Admin.AlarmEffectLibrary;




public class AlarmEffectLibraryTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	AlarmEffectLibrary w = new AlarmEffectLibrary();
	

	 @Test(priority=31)
	 public void AlarmEffects()throws Exception {
		 test=report.startTest("AlarmEffects");	  
	 w.AlarmEffects(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AlarmEffects"); 
	}
	 
	 @Test(priority=32)
	 public void AddNewEffect()throws Exception {
		 test=report.startTest("AddNewEffect");	 
	 w.AddNewEffect(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AddNewEffect"); 
	}
	 @Test(priority=33)
	 public void EditEffect()throws Exception {
		 test=report.startTest("EditEffect");	 
	 w.EditEffect(driver);
	  Assert.assertTrue(true);               
	  test.log(LogStatus.PASS, "EditEffect"); 
	}
	 @Test(priority=34)
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
		  report = SurveyCertificateSettings.getReporter(path.concat("Report\\TechnicalAdmin.html"));		  }
	 
	/* @AfterSuite
	public void afterSu() {
	     report.close();
	 }*/
	 
}
