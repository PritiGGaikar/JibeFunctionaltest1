package technical_Admin;

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
import technical_Admin.FunctionLibrary;




public class FunctionLibraryTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	FunctionLibrary w = new FunctionLibrary();
	
	
	@Test(priority=35)
	   public void FunctionsLibrary()throws Exception {
		 test=report.startTest("Functions Library");	   	 
	   w.FunctionsLibrary(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Functions Library"); 
	   }
	   
	   
	   @Test(priority=36)
	   public void AddFunction()throws Exception {
		   test=report.startTest("AddFunction");	  
	   w.AddFunction(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Add Function"); 
	   }
	  
	  
	   @Test(priority=37)
	   public void EditFunction()throws Exception {
		   test=report.startTest("EditFunction");	  
	   w.EditFunction(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Edi tFunction"); 
	   }
	   @Test(priority=38)
	   public void DeleteFunction()throws Exception {
		   test=report.startTest("DeleteFunction");	  
	   w.DeleteFunction(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Delete Function"); 
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
		 report = SurveyCertificateSettings.getReporter(path.concat("Report\\TechnicalAdmin.html"));		  }
	 
	/* @AfterSuite
	public void afterSu() {
	     report.close();
	 }*/
}
