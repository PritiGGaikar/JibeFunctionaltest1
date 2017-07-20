package technical_SueveyCertificate;


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



public class SurveyListFilterTest extends WebDriverPass{

	ExtentReports report;
	ExtentTest test;
	
	SurveyListFilter SLF=new SurveyListFilter();
	
  @Test(priority=0)
  public void SurveyList() throws Exception{
	  
		
		
		test = report.startTest("SurveyList");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		SLF.SurveyList(driver);
	  }
  
  @Test(priority=1)
  public void FleetOffice() throws Exception{
	  	
		test = report.startTest("FleetOffice");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		SLF.FleetOffice(driver);
	  }
  
  @Test(priority=2)
  public void Fleet_A() throws Exception{
	  
		test = report.startTest("Fleet_A");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		SLF.Fleet_A(driver);
	  }
  
  @Test(priority=3)
  public void Fleet_B() throws Exception{
	  
		
		test = report.startTest("Fleet_B");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		SLF.Fleet_B(driver);
	  }
  
  @Test(priority=4)
  public void NA_SurveyCertificates() throws Exception{
		
		test = report.startTest("NA_SurveyCertificates");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		SLF.NA_SurveyCertificates(driver);
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
public void SurveyCerti() {
	report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html");	  }
	
}
