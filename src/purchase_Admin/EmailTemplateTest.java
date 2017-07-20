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
import purchase_Admin.EmailTemplate;
import quality_Admin.FormTypeLibrary;


public class EmailTemplateTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	EmailTemplate w = new EmailTemplate();
	

   @Test(priority=20)
  public void EmailTemplat() throws InterruptedException {
	   test=report.startTest("EmailTemplate");	  
	   w.EmailTemplat(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Email Template"); 
  }
   @Test(priority=21)
   public void AddEmailTemplate() throws Exception {
	   test=report.startTest("AddEmailTemplate");	  
	   w.AddEmailTemplate(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add Email Template"); 
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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 	  }
   
  /* @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}
