package technical_Vetting;

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




public class VettingPlannerTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	VettingPlanner v=new VettingPlanner();
	
	@Test(priority=1)
	  public void Vetting() throws Exception {
		  test=report.startTest("mouse hover on Vetting ");
		  v.Vetting(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "Technical--->vetting-->vettingPlanner"); 
		   }
	@Test(priority=2)
	  public void createnewvetting() throws Exception {
		  test=report.startTest("create new vetting");
		  v.createnewvetting(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "create new vetting and edit"); 
		   }
	
	/*  
	  @Test(priority=3)
	  public void addobservation() throws Exception {
		  test=report.startTest("adding observation");
		  v.addobservation(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "Adding observation in vetting"); 
		   }
	  
	  @Test(priority=4)
	  public void Addnewjobs() throws Exception {
		  test=report.startTest("Adding new jobs");
		  v.Addnewjobs(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "Adding new jobs in vetting"); 
		   }
	  
	  @Test(priority=5)
	  public void assignjob() throws Exception {
		  test=report.startTest("Assign jobs");
		  v.assignjob(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "Assigning new job"); 
		   }
	  */
	  
	 /* @Test(priority=6)
	  public void observationfilter() throws Exception {
		  test=report.startTest("Filter record");
		  v.observationfilter(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "Filter record"); 
		   }
	  
	  
	  @Test(priority=7)
	  public void Deleteobservation() throws Exception {
		  test=report.startTest("Delete observation");
		  v.Deleteobservation(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "Delete observation"); 
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
	  
	

	  }















	  