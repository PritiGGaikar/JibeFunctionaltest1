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





public class VettingQuestionnaireTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	VettingQuestionnaire v=new VettingQuestionnaire();
	
	@Test(priority=1)
	  public void VettingQuestionnairem() throws Exception {
		  test=report.startTest("vetting module ");
		  v.VettingQuestionnairem(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "technical-->vetting-->vettingQuestionnaire"); 
		   }
	@Test(priority=2)
	  public void CreateNewQuestionnaire() throws Exception {
		  test=report.startTest("search vetting");
		  v.CreateNewQuestionnaire(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting"); 
		   }
	  
	  @Test(priority=3)
	  public void AdvanceFilter() throws Exception {
		  test=report.startTest("advance filter");
		  v.AdvanceFilter(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search vetting using advance filter"); 
		   }
	  
	  @Test(priority=4)
	  public void delete() throws Exception {
		  test=report.startTest("export pdf");
		  v.delete(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "export pdf"); 
		   }
	  
	  @Test(priority=5)
	  public void openadvancefilter() throws Exception {
		  test=report.startTest("export excel");
		  v.openadvancefilter(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "export excel"); 
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


