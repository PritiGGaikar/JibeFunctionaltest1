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





public class QuestionBankTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	QuestionBank q = new QuestionBank();
	
  @Test(priority=57)
  public void QuestionBankModule1() throws Exception {
	  test=report.startTest("Add New Question");
	  q.AddNewQuestion(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "AddNewQuestion"); 
  }
  
  @Test(priority=58)
  public void QuestionBankModule2() throws Exception {
	  test=report.startTest("Edit Newly Added Question");
	  q.EditQuestion(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "EditQuestion"); 
  } 
  
  
  @Test(priority=59)
  public void QuestionBankModule3() throws Exception {
	  test=report.startTest("Delete Edited Question");
	  q.DeleteQuestion(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "DeleteQuestion"); 
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
   
 /*  @AfterSuite
 public void afterSu() {
       report.close();
   }*/
}
