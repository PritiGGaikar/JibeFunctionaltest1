package technical_VesselInspection;

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





public class ChecklistCreationTest extends WebDriverPass {
	ExtentReports report;
	 ExtentTest test;

	ChecklistCreation cr=new ChecklistCreation();
	
  @Test(priority=66)
  public void InspectionChecklist() throws Exception {
	  test=report.startTest("Inspection Checklist creation");
	  cr.InspectionChecklist(driver);
	  Assert.assertTrue(true);
 	   test.log(LogStatus.PASS, "InspectionChecklist"); 
	   }
  
  @Test(priority=67)
  public void addinggroup() throws Exception {
	  test=report.startTest("Adding checklist in group and location Type");
	  cr.addinggroup(driver);
	  Assert.assertTrue(true);
 	   test.log(LogStatus.PASS, "addinggroup"); 
	   }
  
  @Test(priority=68)
  public void publish() throws Exception {
	  test=report.startTest("publish");
	  cr.publish(driver);
	  Assert.assertTrue(true);
 	   test.log(LogStatus.PASS, "publish"); 
	   }
  
  @Test(priority=69)
  public void addingdescforlocation() throws Exception {
	  test=report.startTest("Adding Desc.for Location");
	  cr.addingdescforlocation(driver);
	  Assert.assertTrue(true);
 	   test.log(LogStatus.PASS, "addingdescforlocation"); 
	   }
  
  @Test(priority=70)
  public void addnewquestion() throws Exception {
	  test=report.startTest("Add New Question");
	  cr.addnewquestion(driver);
	  Assert.assertTrue(true);
 	   test.log(LogStatus.PASS, "addnewquestion"); 
	   }
  
  @Test(priority=71)
  public void editlocationname() throws Exception {
	  test=report.startTest("Edit Location Name");
	  cr.editlocationname(driver);
	  Assert.assertTrue(true);
 	   test.log(LogStatus.PASS, "editlocationname"); 
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
}*/
  }


