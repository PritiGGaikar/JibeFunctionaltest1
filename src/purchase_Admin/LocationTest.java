package purchase_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import purchase_Admin.Location;
import quality_Admin.FormTypeLibrary;

public class LocationTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	Location w = new Location();
	

   @Test(priority=5)
  public void Locations() throws InterruptedException {
	   test=report.startTest("Locations");	  
	   w.Locations(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Locations"); 
  }
    @Test(priority=6)
   public void AddNewLocation() throws Exception {
	   test=report.startTest("AddNewLocation");	  
	   w.AddNewLocation(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add New Location"); 
  }
   @Test(priority=7)
   public void EditLocation() throws Exception {
	   test=report.startTest("EditLocation");	  
	   w.EditLocation(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Edit Location"); 
  }
   @Test(priority=8)
   public void DeleteLocation() throws Exception {
	   test=report.startTest("DeleteLocation");	  
	   w.DeleteLocation(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete Location"); 
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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		  }
   
  /* @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}
