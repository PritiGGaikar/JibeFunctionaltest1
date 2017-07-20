package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import crew_Admin.CrewStatusMapping;
import quality_Admin.FormTypeLibrary;




public class CrewStatusMappingTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	
	CrewStatusMapping r=new CrewStatusMapping();
	
	
	  @Test(priority=0)
	  public void Crew() throws Exception {
		  test=report.startTest("CrewJoiningSeniorityTest ");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "CrewStatusMapping"); 
		  r.Crew(driver);
	  }
	  
	  @Test(priority=1)
	  public void AddStatusMapping() throws Exception {
		  test=report.startTest("AddStatusMapping ");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(1000);

		  r.AddStatusMapping(driver);
		  test.log(LogStatus.PASS, "AddStatusMapping"); 
	  }
	  
	  @Test(priority=2)
	  public void EditStatusMapping() throws Exception {
		  test=report.startTest("EditStatusMapping ");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(1000);

		  r.EditStatusMapping(driver);
		  test.log(LogStatus.PASS, "EditStatusMapping"); 
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
