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





public class VettingLibraryTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	VettingLibrary v=new VettingLibrary();
	
	
	@Test(priority=1)
	  public void VettingLibrarym() throws Exception {
		  test=report.startTest("vetting module ");
		  v.VettingLibrarym(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "technical-->vetting-->vettingLibrary"); 
		   }
	
	@Test(priority=2)
	  public void edit() throws Exception {
		  test=report.startTest("search vetting");
		  v.edit(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting"); 
		   }
	

/*	@Test(priority=3)
	  public void VesselVettingrelationship() throws Exception {
		  test=report.startTest("search vetting");
		  v.VesselVettingrelationship(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting"); 
		   }*/
	

	@Test(priority=4)
	  public void AttachmentType() throws Exception {
		  test=report.startTest("search vetting");
		  v.AttachmentType(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting"); 
		   }
	

	@Test(priority=4)
	  public void ExternalInspector() throws Exception {
		  test=report.startTest("search vetting");
		  v.ExternalInspector(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting"); 
		   }
	

	@Test(priority=4)
	  public void ObservationCategories() throws Exception {
		  test=report.startTest("search vetting");
		  v.ObservationCategories(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting"); 
		   }
	@AfterMethod //* this annotation would run once test script execution would complete*/
	public void afterMethod(ITestResult result) {
	    if (result.getStatus() == ITestResult.FAILURE) {
	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
	    } else if (result.getStatus() == ITestResult.SKIP) {
	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	    } else {
	        test.log(LogStatus.PASS, "Test passed");
	    }
	    report.endTest(test);// ending test
	    report.flush();//// writing everything to document
}
  @BeforeSuite //The annotated method will be run before all tests in this suite have run.
  public void beforeSu() {
	  report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html");	  }
}
