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
import crew_Admin.joiningType;
import quality_Admin.FormTypeLibrary;



public class joiningTypeTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	joiningType r=new joiningType();
	
	

	@Test(priority=1)
	  public void Adminm() throws Exception {
		  test=report.startTest("joiningTypeTest ");
		  r.Adminm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->joining type"); 
		   }
	@Test(priority=2)
	  public void addrank() throws Exception {
		  test=report.startTest("add joining type");
		  r.addrank(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "add joining type"); 
		   }
	  
	  @Test(priority=3)
	  public void search() throws Exception {
		  test=report.startTest("search joining type ");
		  r.search(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search joining type"); 
		   }
	  
	  
	  @Test(priority=4)
	  public void delete() throws Exception {
		  test=report.startTest("delete joining type ");
		  r.delete(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "delete joining type"); 
		   }
	  
	  @Test(priority=5)
	  public void exportexcel() throws Exception {
		  test=report.startTest("export excel");
		  r.exportexcel(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "export excel"); 
		   }

	  @Test(priority=6)
	  public void addPermanentStatus() throws Exception {
		  test=report.startTest("add Permanent Status");
		  r.addPermanentStatus(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "add Permanent Status"); 
		   }
	  
	  
	  @Test(priority=7)
	  public void searchPermanentStatus() throws Exception {
		  test=report.startTest("search Permanent Status ");
		  r.searchPermanentStatus(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search Permanent Status"); 
		   }
	  
	  @Test(priority=8)
	  public void deletePermanentStatus() throws Exception {
		  test=report.startTest("delete Permanent Status");
		  r.deletePermanentStatus(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "delete Permanent Status"); 
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

