package technical_VesselInspection;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import quality_Admin.FormTypeLibrary;




public class InspectionIndexTest extends WebDriverPass{
	
	
	 ExtentReports report;
	 ExtentTest test;

	InspectionIndex w = new InspectionIndex();
	
	
	@Test(priority=50)
	 
	  public void Inspection() throws Exception {
		  	  
		test=report.startTest("Inspection"); 
		  w.Inspection(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Inspection"); 
    
	  }
	     @Test(priority=51)
		  public void ScheduleInspection() throws Exception {
			  	  
			  test=report.startTest("ScheduleInspection"); 
			  w.ScheduleInspection(driver);    
		 Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "ScheduleInspection"); 

		 }
		 @Test(priority=52)
		  public void SearchInspection() throws Exception {
			  	  
			 test=report.startTest("SearchInspection"); 
			  w.SearchInspection(driver);    
			  Assert.assertTrue(true);
		      test.log(LogStatus.PASS, "SearchInspection"); 
		 }

		 @Test(priority=53)
		  public void UpdateInspection() throws Exception {
			  	  
			 test=report.startTest("UpdateInspection"); 
			  w.UpdateInspection(driver);    
			  Assert.assertTrue(true);
		      test.log(LogStatus.PASS, "UpdateInspection"); 

		  }
		 @Test(priority=54)
		  public void InspectionReport() throws Exception {
			  	  
			 test=report.startTest("InspectionReport"); 
			  w.InspectionReport(driver);    
			  Assert.assertTrue(true);
		      test.log(LogStatus.PASS, "InspectionReport"); 
		  } 
		 
		 
		 @Test(priority=55)
		  public void Schedule() throws Exception {
			  	  
			 test=report.startTest("Schedule"); 
			  w.Schedule(driver);    
			  Assert.assertTrue(true);
		      test.log(LogStatus.PASS, "Schedule"); 

		  } 
		 
		 @Test(priority=56)
		  public void ADD() throws Exception {
			  	  
			 test=report.startTest("ADD"); 
			  w.ADD(driver);    
			  Assert.assertTrue(true);
		      test.log(LogStatus.PASS, "ADD"); 

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
			  }
*/

		 
		 
}
