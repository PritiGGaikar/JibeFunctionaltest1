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
import crew_Admin.TrainingTypes;
import quality_Admin.FormTypeLibrary;




public class TrainingTypesTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	TrainingTypes r=new TrainingTypes();
	
	
	@Test(priority=1)
	  public void Adminm() throws Exception {
		  test=report.startTest("TrainingTypesTest ");
		  r.Adminm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->Training Types "); 
		   }
	@Test(priority=2)
	  public void addTrainingTypes() throws Exception {
		  test=report.startTest("add Training Types ");
		  r.addTrainingTypes(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "add Training Types "); 
		   }
	@Test(priority=3)
	  public void search() throws Exception {
		  test=report.startTest("search Training Types  ");
		  r.search(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search Training Types "); 
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
	  
 

