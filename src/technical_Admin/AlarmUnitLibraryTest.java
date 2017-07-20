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
import technical_Admin.AlarmUnitLibrary;





public class AlarmUnitLibraryTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	
	AlarmUnitLibrary w = new AlarmUnitLibrary();
	
	 @Test(priority=26)
	  public void AlarmUnit()throws Exception {
		 test=report.startTest("Alarm Units");	   
	  w.AlarmUnits(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Alarm Units"); 
	  }

	  @Test(priority=27)
	  public void PMSAlarmUnit()throws Exception {
			 test=report.startTest("PMS Alarm Unit");	  	  
	  w.PMSAlarmUnit(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "PMS Alarm Unit"); 
	  }

	 @Test(priority=28)
	  public void AddNewUnit()throws Exception {
		 test=report.startTest("Add New Unit");	  
	  w. AddNewUnit(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add New Unit"); 

	}
	/* @Test(priority=29)
	 public void EditUnit()throws Exception {
		 test=report.startTest("EditUnit");	   
	 w. EditUnit(driver);
	 Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "EditUnit"); 

	}
	 @Test(priority=30)
	 public void DeleteUnit()throws Exception {
		 test=report.startTest("Delete Unit");	  
	 w.DeleteUnit(driver);
	 Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete Unit"); 

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
		 report = SurveyCertificateSettings.getReporter(path.concat("Report\\TechnicalAdmin.html"));		    	  }
	 
	/* @AfterSuite
	public void afterSu() {
	     report.close();
	 }*/
}
