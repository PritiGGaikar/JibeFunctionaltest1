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
import operation_Admin.WaterInTank;
import quality_Admin.FormTypeLibrary;





public class WaterInTankTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	
	WaterInTank w = new WaterInTank();
	
  @Test(priority=1)
  public void WaterInTankModule1() throws Exception {
	  test=report.startTest("Add Hold Tank");
	  
	  w.WaterInTankIndex(driver);
	  
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add Hold Tank"); 
	  
  }
  
  @Test(priority=2)
  public void WaterInTankModule2() throws Exception {
	  test=report.startTest("Edit Hold Tank");
	  
	  w.WaterInTankEdit(driver);
	  
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Edit Hold Tank"); 
	  
  }
  
  @Test(priority=3)
  public void WaterInTankModule3() throws Exception {
	  test=report.startTest("Delete Hold Tank");
	  
	  w.WaterInTankDelete(driver);
	  
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
