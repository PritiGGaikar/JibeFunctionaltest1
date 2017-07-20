package operation_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import operation_Admin.VslGeneralParameters;
import quality_Admin.FormTypeLibrary;




public class VslGeneralParametersTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	
	
	VslGeneralParameters v = new VslGeneralParameters();
	
  @Test(priority=5)
  public void VslGeneralParametersModule() throws Exception {
	  test=report.startTest("Add Vessel Parameters");
	  v.VslGeneralIndex(driver);
      Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add Vessel Parameters"); 
	  
  }
  
  @Test(priority=6)
  public void VslGeneralParametersModule1() throws Exception {
	  test=report.startTest("Edit Vessel Parameters");
	  v.VslGeneralEdit(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Edit Vessel Parameters"); 
	  
  }
  
  @Test(priority=7)
  public void WaterInTankModule3() throws Exception {
	  test=report.startTest("Delete Hold Tank");
	  v.VslGeneralDelete(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete Hold Tank"); 
	  
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
    	   report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\OperatiomAdmin.html");		
 }

	  
	  
	  
  }

