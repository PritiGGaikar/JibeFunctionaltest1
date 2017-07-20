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
import purchase_Admin.UnitPackings;
import quality_Admin.FormTypeLibrary;

public class UnitPackingsTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	UnitPackings w = new UnitPackings();
	

   @Test(priority=11)
   public void UnitPacking() throws Exception {
	   test=report.startTest("Unit Packing");	  
	   w.UnitPacking(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Unit Packing"); 
  }
   
   @Test(priority=12)
   public void AddUnitPacking() throws Exception {
 	   test=report.startTest("Add Unit Packing");	  
 	   w.AddUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Add Unit Packing"); 
   }
   
   
   /*@Test(priority=13)
   public void EditUnitPacking() throws Exception {
 	   test=report.startTest("Edit Unit Packing");	  
 	   w.EditUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Edit Unit Packing"); 
   }
   
   @Test(priority=14)
   public void DeletetUnitPacking() throws Exception {
 	   test=report.startTest("Delet etUni Packing");	  
 	   w.DeletetUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Deletet Unit Packing"); 
   }
   
   */
   
   
   
   
   
   
   
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
	  report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
  
 /* @AfterSuite
 public void afterSu() {
      report.close();
  }*/
}
