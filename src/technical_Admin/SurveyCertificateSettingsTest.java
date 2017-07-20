package technical_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import technical_Admin.SurveyCertificateSettings;



public class SurveyCertificateSettingsTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	SurveyCertificateSettings w = new SurveyCertificateSettings();
	

	   @Test(priority=0)
	  public void Survey() throws InterruptedException {
		   test=report.startTest("Survey");	  
		   w.Survey(driver);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Survey"); 
	  }
   
 
	   @Test(priority=1)
	  public void MainCategory() throws Exception {
		  test=report.startTest("MainCategory");	  
		   w.MainCategory(driver);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Main Category"); 
	  }
	   @Test(priority=2)
		  public void SubCategory() throws Exception {
		 test=report.startTest("SubCategory");	  
			   w.SubCategory(driver);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "Sub Category"); 
		  }
	   @Test(priority=3)
		  public void SurveyCertificate() throws Exception {
			  test=report.startTest("SurveyCertificate");	  
			   w.SurveyCertificate(driver);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "Survey Certificate"); 
		  } 
	   @Test(priority=4)
		  public void SurveyAssign() throws Exception {
			  test=report.startTest("SurveyAssign");	  
			   w.SurveyAssign(driver);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "Survey Assign"); 
		  } 
	   @Test(priority=5)
		  public void CertificateAuthority() throws Exception {
			  test=report.startTest("CertificateAuthority");	  
			   w.CertificateAuthority(driver);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "Certificate Authority"); 
		  }   
	   @Test(priority=6)
		  public void SurveyDocType() throws Exception {
			   test=report.startTest("SurveyDocType");	  
			   w.SurveyDocType(driver);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "Survey DocType"); 
		  }    
	   
	   @Test(priority=7)
		  public void DeleteSurveyCategary() throws Exception {
			   test=report.startTest("DeleteSurveyCategary");	  
			   w.DeleteSurveyCategary(driver);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "DeleteSurveyCategary"); 
		  }  
	   
	   @Test(priority=8)
		  public void DeleteSurveyCertificate() throws Exception {
			   test=report.startTest("DeleteSurveyCertificate");	  
			   w.DeleteSurveyCertificate(driver);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "DeleteSurveyCertificate"); 
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
		 report = SurveyCertificateSettings.getReporter(path.concat("Report\\TechnicalAdmin.html"));		    }
	 
	/* @AfterSuite
	public void afterSu() {
	     report.close();
	 }*/
}
