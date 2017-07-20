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
import crew_Admin.DocumentGroups;
import quality_Admin.FormTypeLibrary;





public class DocumentGroupsTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	DocumentGroups r=new DocumentGroups();
	
	
	
	@Test(priority=1)
	  public void DocumentGroupm() throws Exception {
		
		  test=report.startTest("DocumentGroupsTest ");
		  r.DocumentGroupm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->Document Group"); 
		   }
	@Test(priority=2)
	  public void addgroupnamem() throws Exception {
		  test=report.startTest("add Document Group");
		  r.addgroupname(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "add Document Group"); 
		   }
	
	@Test(priority=3)
	  public void filtergroupname() throws Exception {
		  test=report.startTest("filter group name");
		  r.filtergroupname(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "filter group name"); 
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
