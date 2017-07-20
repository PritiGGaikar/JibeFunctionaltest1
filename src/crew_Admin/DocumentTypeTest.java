package crew_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import crew_Admin.DocumentType;
import quality_Admin.FormTypeLibrary;




public class DocumentTypeTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	DocumentType r=new DocumentType();
	
	
	@Test(priority=1)
	  public void DocumentTypem() throws Exception {
		  test=report.startTest("DocumentTypeTest ");
		  r.DocumentTypem(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->Document type"); 
		   }
	@Test(priority=2)
	  public void addnewdocumentType() throws Exception {
		  test=report.startTest("add Document type");
		  r.addnewdocumentType(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "add Document type"); 
		   }
	
	@Test(priority=3)
	  public void search() throws Exception {
		  test=report.startTest("filter type name");
		  r.search(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "filter  type"); 
		   }
	
	
	@Test(priority=4)
	  public void Edit() throws Exception {
		  test=report.startTest("filter type name");
		  r.Edit(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "filter type name"); 
		   }
	
	
	@Test(priority=5)
	  public void searchgroup() throws Exception {
		  test=report.startTest("filter type name");
		  r.searchgroup(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "filter type name"); 
		   }
	
	@Test(priority=6)
	  public void delete() throws Exception {
		  test=report.startTest("add Document type");
		  r.delete(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "add Document type"); 
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
		 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html");		
  }
}