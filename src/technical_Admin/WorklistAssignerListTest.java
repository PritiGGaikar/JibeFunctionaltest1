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
import technical_Admin.WorklistAssignerList;

public class WorklistAssignerListTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	WorklistAssignerList w=new WorklistAssignerList();
 
  @Test(priority=9)
  public void WorklistAssignerListindex() throws Exception  {
	
	  test=report.startTest("WorklistAssignerListindex");	   
    w.WorklistAssignerListindex(driver);
    Assert.assertTrue(true);
    test.log(LogStatus.PASS, "WorklistAssignerListindex");         
  }
  
  
  @Test(priority=10)
  public void AddWorklistAssigner() throws Exception  {
	  test=report.startTest("AddWorklistAssigner");	 
      w.AddWorklistAssigner(driver);
       Assert.assertTrue(true);
       test.log(LogStatus.PASS, "AddWorklistAssigner");    
}
  @Test(priority=11)
  public void DeleteAssignorName() throws Exception  {
	  test=report.startTest("DeleteAssignorName");	 
      w.DeleteAssignorName(driver);
       Assert.assertTrue(true);
       test.log(LogStatus.PASS, "DeleteAssignorName");    
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