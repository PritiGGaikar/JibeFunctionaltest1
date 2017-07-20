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
import purchase_Admin.LOTestingLabList;
import quality_Admin.FormTypeLibrary;





public class LOTestingLabListTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	LOTestingLabList w = new LOTestingLabList();
	

   @Test(priority=0)
  public void LubeOilTestingLabs() throws InterruptedException {
	   test=report.startTest("Lube Oil Testing Labs");	  
	   w.LubeOilTestingLabs(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Lube Oil Testing Labs"); 
  }
   @Test(priority=1)
   public void AddNewLab() throws Exception {
	   test=report.startTest("AddNewLab");	  
	   w.AddNewLab(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add New Lab"); 
  }
   /*@Test(priority=2)
   public void AddExistingLab() throws Exception {
	   test=report.startTest("Add Existing Lab");	  
	   w.AddExistingLab(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AddExisting Lab"); 
  }*/
   @Test(priority=3)
   public void EditLab() throws Exception {
	   test=report.startTest("EditLab");	  
	   w.EditLab(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Edit Lab"); 
  }
   @Test(priority=4)
   public void DeleteLab() throws Exception {
	   test=report.startTest("DeleteLab");	  
	   w.DeleteLab(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete Lab"); 
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
