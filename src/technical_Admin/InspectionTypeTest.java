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
import technical_Admin.InspectionType;



public class InspectionTypeTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	InspectionType w = new InspectionType();
	
	
  @Test(priority=16)
  
private void InspectionType() throws Exception {
	  test=report.startTest("InspectionType");	  
	 w.InspectionTypes(driver);
	 Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Inspection Type"); 
	
}

  @Test(priority=17)
  public void AddInspection() throws Exception {
	  test=report.startTest("Add Inspection");	  
	  
	  w.AddInspection(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add Inspection"); 
  }
  
  
  @Test(priority=18)
  public void EditInspection() throws Exception {
	  test=report.startTest("EditInspection");	  
	  
	  w.EditInspection(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "EditInspection"); 
  }
@Test(priority=19)
  public void DeleteInspection() throws Exception {
	  	  
	  test=report.startTest("DeleteInspection");	  
	  w.DeleteInspection(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "DeleteInspection"); 
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
  
  
  
  

