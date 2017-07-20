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
import technical_Admin.WorklistAccessRights;

//import Technical.Worklist;



public class WorklistAccessRightsTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	
	WorklistAccessRights w = new WorklistAccessRights();
	
	
	
	  @Test(priority=12)
	  public void WokrlistModule() throws Exception {
		  test=report.startTest("WokrlistModule");  
		  w.worklistindex(driver);
		  Assert.assertTrue(true);
		  System.out.println("WokrlistModule");
	 	  test.log(LogStatus.PASS, "WokrlistModule"); 
	  }
		  @Test(priority=13)
		
		  public void AddworklistAccess() throws Exception {
			  test=report.startTest("AddworklistAccess"); 	  	  
			  w.AddworklistAccess(driver);
			  Assert.assertTrue(true);
			  System.out.println("AddworklistAccess");
		 	  test.log(LogStatus.PASS, "AddworklistAccess");
		   	 
		  }
		 @Test(priority=14)
		
		  public void EditworklistAccess() throws Exception {
			 test=report.startTest("EditworklistAccess"); 		  		  
			 w.EditworklistAccess(driver);
			 Assert.assertTrue(true);
			 System.out.println("EditworklistAccess");
	 		 test.log(LogStatus.PASS, "EditworklistAccess");
		 
		 }
		 @Test(priority=15)
	
		  public void DeleteworklistAccess() throws Exception {
			 test=report.startTest("DeleteworklistAccess");   	  
			 w.DeleteworklistAccess(driver);
			 Assert.assertTrue(true);
			 System.out.println("DeleteworklistAccess");
	 		 test.log(LogStatus.PASS, "DeleteworklistAccess");
	 
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
		 	 
		 
  

