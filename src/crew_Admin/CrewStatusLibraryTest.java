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
import crew_Admin.CrewStatusLibrary;
import quality_Admin.FormTypeLibrary;






public class CrewStatusLibraryTest extends WebDriverPass {
	
	ExtentReports report;
	ExtentTest test;
	
	CrewStatusLibrary r=new CrewStatusLibrary();
	
	  @Test(priority=0)
	  public void Crew() throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

		test = report.startTest("CrewStatusLibraryTest");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "CrewStatusLibraryTest");

		r.Crew(driver);
	}
	  
	  @Test(priority=1)
	  public void AddStatus() throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

		test = report.startTest("AddStatus");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Add Status");

		r.AddStatus(driver);
	}
	  
	  
	  @Test(priority=2)
	  public void EditStatus() throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		test = report.startTest("EditStatus");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Edit Status");

		r.EditStatus(driver);
	}
	  
	  @Test(priority=3)
	  public void AddSubStatus() throws Exception {
		  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

		test = report.startTest("AddSubStatus");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Add Sub Status");

		r.AddSubStatus(driver);
	}
	  
	  @Test(priority=4)
	  public void EditSubStatus() throws Exception {
		  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

		test = report.startTest("EditSubStatus");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Edit Sub Status");

		r.EditSubStatus(driver);
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
	 public void  CrewStatus() {
		 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html");		
	 

	  }
}
