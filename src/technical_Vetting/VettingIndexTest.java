package technical_Vetting;

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






public class VettingIndexTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	VettingIndex v=new VettingIndex();
	
	@Test(priority=1)
	  public void VettingIndex() throws Exception {
		  test=report.startTest("vetting module ");
		  v.VettingIndexm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "technical-->vetting-->vettingIndex"); 
		   }
	@Test(priority=2)
	  public void searchvetting1() throws Exception {
		  test=report.startTest("search vetting");
		  v.searchvetting(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting"); 
		   }
	  
	  @Test(priority=3)
	  public void editvetting1() throws Exception {
		  test=report.startTest("edit vetting");
		  v.editvetting(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "edit vetting"); 
		   }
	  
	  @Test(priority=4)
	  public void details() throws Exception {
		  test=report.startTest("details of vetting");
		  v.details(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "details of vetting"); 
		   }
	  
	  
	  @Test(priority=5)
	  public void Addobs() throws Exception {
		  test=report.startTest("details of vetting");
		  v.Addobs(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "adding observation"); 
		   }
	  
	  
	  @Test(priority=7)
	  public void clearfilter() throws Exception {
		  test=report.startTest("clear filter");
		  v.clearfilter(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "clear filter"); 
		   }
	
	  
	  @Test(priority=8)
	  public void advancefilter() throws Exception {
		  test=report.startTest("advance filter");
		  v.advancefilter(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting using advance filter"); 
		   }
	  
	  /*@Test(priority=9)
	  public void deleteobs() throws Exception {
		  test=report.startTest("delete vetting");
		  v.deleteobs(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "delete vetting"); 
		   }*/
	  
	  @Test(priority=10)
	  public void exportpdf() throws Exception {
		  test=report.startTest("export pdf");
		  v.exportpdf(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "export pdf"); 
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
	  
	

	  }















	  
