package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import crew_Admin.CrewCardApprover;
import quality_Admin.FormTypeLibrary;




public class CrewCardApproverTest extends WebDriverPass {
	

	ExtentReports report;
	ExtentTest test;
	
	CrewCardApprover r=new CrewCardApprover();
	
	  @Test(priority=0)
	  public void Crew() throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

		test = report.startTest("CrewCardApproverTest");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "CrewCardApproverTest");

		r.Crew(driver);
	}
	  
	  @Test(priority=1)
	  public void AddCrewCardApprover() throws Exception {
		  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

		test = report.startTest("AddCrewCardApprover");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "AddCrewCardApprover");

		r.AddCrewCardApprover(driver);
	}
	  
  
	  @Test(priority=2)
	  public void EditCrewCardApprover() throws Exception {
		  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

		test = report.startTest("EditCrewCardApprover");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "EditCrewCardApprover");

		r.EditCrewCardApprover(driver);
	}
	  
	  @Test(priority=3)
	  public void DeleteCrewCardApprover() throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

		test = report.startTest("DeleteCrewCardApprover");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "DeleteCrewCardApprover");

		r.DeleteCrewCardApprover(driver);
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
	 public void CrewAdmin() {
		 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html");		
}}
