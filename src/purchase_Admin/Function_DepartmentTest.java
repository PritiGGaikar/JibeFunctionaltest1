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

public class Function_DepartmentTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	Function_Department w = new Function_Department();
	

   @Test(priority=29)
  public void FunctionDepartment() throws InterruptedException {
	   test=report.startTest("Function Department");	  
	   w.FunctionDepartment(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Function Department"); 
  }
   @Test(priority=30)
 
   public void AddFunctionDepartment() throws Exception {
 	   test=report.startTest("Add Function Department");	  
 	   w.AddFunctionDepartment(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Add Function Department"); 
   }
   
   @Test(priority=31)
   
   public void EditFunctionDepartment() throws Exception {
 	   test=report.startTest("Edit Function Department");	  
 	   w.EditFunctionDepartment(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Edit Function Department"); 
   }
   
 @Test(priority=32)
   
   public void DeletetFunctionDepartment() throws Exception {
 	   test=report.startTest("Delete Function Department");	  
 	   w.DeletetFunctionDepartment(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Delete Function Department"); 
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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
   
 /*  @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}

