package technical_PMS;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import quality_Admin.FormTypeLibrary;



public class ManageSystemTest extends WebDriverPass {

	ExtentReports report;
	ExtentTest test;
	ManageSystem m = new ManageSystem();
	
  @Test(priority=29)
  public void ManageSystemModule() throws Exception {
	  test=report.startTest("ManageSystemIndex");
	  m.ManageSystemIndex(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "ManageSystemIndex"); 
  }

@Test(priority=30)
  public void ManageSystemModule1() throws Exception {
	 test=report.startTest("AddSystem");
	  m.AddSystem(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "AddSystem"); 
}
 @Test(priority=31)
  public void ManageSystemModule2() throws Exception {
	 test=report.startTest("EditSystem");
	  m.EditSystem(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "EditSystem"); 
}
  
  @Test(priority=32)
  public void ManageSystemModule3() throws Exception {
	  test=report.startTest("DeleteSystem");
	  m.DeleteSystem(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "DeleteSystem"); 
}


  @Test(priority=33)
  public void ManageSystemModule4() throws Exception {
	  test=report.startTest("DeleteSubSystem");
	  m.DeleteSubSystem(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "DeleteSubSystem"); 
}

  
  @Test(priority=34)
  public void ManageSystemModule5() throws Exception {
	  test=report.startTest("EditSubSystem");
	  m.EditSubSystem(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "EditSubSystem"); 
}
 
  @Test(priority=35)
  public void ManageSystemModule6() throws Exception {
	  test=report.startTest("AddJob");
	  m.AddJob(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "AddJob"); 
}

  @Test(priority=36)
  public void ManageSystemModule7() throws Exception {
	  test=report.startTest("AddSpareItem");
	  m.AddSpareItem(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "AddSpareItem"); 
}
  @Test(priority=37)
  public void ManageSystemModule8() throws Exception {
	  test=report.startTest("EditJob");
	  m.EditJob(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "EditJob"); 
}
  
  
  @Test(priority=38)
  public void ManageSystemModule9() throws Exception {
	  test=report.startTest("EditItem");
	  m.EditItem(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "EditItem"); 
}
  @Test(priority=39)
  public void ManageSystemModule10() throws Exception {
	  test=report.startTest("DeleteItem");
	  m.DeleteItem(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "DeleteItem"); 
}
  
  @Test(priority=40)
  public void ManageSystemModule11() throws Exception {
	  test=report.startTest("DeleteJob");
	     m.DeleteJob(driver);
	     Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "DeleteJob"); 
}

  
  @Test(priority=41)
  public void ManageSystemModule12() throws Exception {
	  test=report.startTest("eformAssign");
	  m.eformAssign(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "DeleteJob"); 
}
  
 
  
  @Test(priority=42)
  public void ManageSystemModule13() throws Exception {
	  test=report.startTest("CopyMoveJobs");
	  m.CopyMoveJobs(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "CopyMoveJobs"); 
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
	  report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html");	  }
 
  @AfterSuite
 public void afterSu() {
      report.close();
  }

}





	 
