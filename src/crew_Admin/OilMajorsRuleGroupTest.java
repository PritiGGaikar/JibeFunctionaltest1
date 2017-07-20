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
import crew_Admin.OilMajorsRuleGroup;
import quality_Admin.FormTypeLibrary;




public class OilMajorsRuleGroupTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	
	
	
	
	OilMajorsRuleGroup r=new OilMajorsRuleGroup();
	
	
	  @Test(priority=0)
	  public void Crew() throws Exception {
		  test=report.startTest("OilMajorsRuleGroupTest ");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(1000);

		  r.Crew(driver);
		  test.log(LogStatus.PASS, "crew-->admin-->OilMajorsRuleGroup");
	  }
	  
	  @Test(priority=1)
	  public void AddGroup() throws Exception {
		  test=report.startTest("AddGroup ");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(1000);

		  r.AddGroup(driver);
		  test.log(LogStatus.PASS, "AddGroup");
	  }
	  
	  @Test(priority=2)
	  public void EditGroup() throws Exception {
		  test=report.startTest("EditGroup ");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(1000);

		  r.EditGroup(driver);
		  test.log(LogStatus.PASS, "EditGroup");
	  }
	  
	  @Test(priority=3)
	  public void InfoAndDeleteGroup() throws Exception {
		  test=report.startTest("Info & delete Group ");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(1000);

		  r.InfoAndDeleteGroup(driver);
		  test.log(LogStatus.PASS, "Info & delete Group ");
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
