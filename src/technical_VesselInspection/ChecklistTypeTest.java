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



public class ChecklistTypeTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
ChecklistType c = new ChecklistType();
	
  @Test(priority=60)
  public void ChecklistTypeModule() throws Exception{
	  test=report.startTest("Add New Checklist");
	  c.AddNewChecklistType(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "AddNewChecklistType"); 
  }
  
@Test(priority=61)
  public void ChecklistTypeModule1() throws Exception {
	  test=report.startTest("Add New Grade");
	  c.gradingtype(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "gradingtype"); 
  } 
  
  
  @Test(priority=62)
  public void ChecklistTypeModule2() throws Exception {
	  test=report.startTest("Add new Category");
	  c.category(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "category"); 
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
   
   /*@AfterSuite
 public void afterSu() {
       report.close();*/
   }


