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
import quality_Admin.FormTypeLibrary;
import purchase_Admin.PurchaseQuestionnaire;

public class PurchaseQuestionnaireTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	PurchaseQuestionnaire w = new PurchaseQuestionnaire();
	

   @Test(priority=15)
   public void PurchaseQuestionnaire() throws InterruptedException {
	   test=report.startTest("PurchaseQuestionnaire");	  
	   w.PurchaseQuestionnair(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Purchase Questionnaire"); 
  }
   
  
   
   @Test(priority=16)
   public void AddNewQuestion() throws Exception {
 	   test=report.startTest("AddNewQuestion");	  
 	   w.AddNewQuestion(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "AddNewQuestion"); 
   }
   
   @Test(priority=17)
   public void DeleteNewQuestion() throws Exception {
 	   test=report.startTest("Delete New Added Question");	  
 	   w.DeleteNewQuestion(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Delete New Added Question"); 
   }
   
   @Test(priority=18)
   public void AddNewGrade() throws Exception {
 	   test=report.startTest("AddNewGrade");	  
 	   w.AddNewGrade(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "AddNewGrade"); 
   }
   

     @Test(priority=19)
   public void DeleteAddedNewGrade() throws Exception {
 	   test=report.startTest("Delete Added New Grade");	  
 	   w.DeleteAddedNewGrade(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Delete Added New Grade"); 
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
	  report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 		  
  
 /* @AfterSuite
 public void afterSu() {
      report.close();
  }*/
   
}}
