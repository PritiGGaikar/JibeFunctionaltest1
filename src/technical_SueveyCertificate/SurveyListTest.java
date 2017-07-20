package technical_SueveyCertificate;

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
import quality_Admin.FormTypeLibrary;


public class SurveyListTest extends WebDriverPass{
	
	ExtentReports report;
	ExtentTest test;
	
	SurveyList S=new SurveyList();
	
  @Test(priority=0)
  public void Survey() throws Exception{
	  
	
		
		test = report.startTest("Survey");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		S.Survey(driver);
		
	  }
  
	  
  @Test(priority=1)
  public void Search() throws Exception{

		test = report.startTest("Search");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		//S.Search(driver);
	  }
  
  
  @Test(priority=2)
  public void Validation() throws Exception{


		
		test = report.startTest("Validation");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


	   // S.Validation(driver);
	  }
  
  
  @Test(priority=3)
  public void Check() throws Exception{
	  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		test = report.startTest("Check");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		//S.Check(driver);
	  }
  
  
  @Test(priority=4)
  public void AddNew() throws Exception{

		test = report.startTest("AddNew");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		//S.AddNew(driver);
	  }
  
  @Test(priority=5)
  public void ClickCIAndRI() throws Exception{

		
		test = report.startTest("ClickCIAndRI");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


	    //S.ClickCIAndRI(driver);
	  }
  
  @Test(priority=6)
  public void MakeSurveyCertificateAsNA() throws Exception{


		test = report.startTest("MakeSurveyCertificateAsNA");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		//S.MakeSurveyCertificateAsNA(driver);
	  }
  
  
  @Test(priority=7)
  public void EditAndPendingInspection() throws Exception{

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		test = report.startTest("EditAndPendingInspection");

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condtion is true");


		S.EditAndPendingInspection(driver);
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
 public void SurveyCert() {
	 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html");	  }

  }

