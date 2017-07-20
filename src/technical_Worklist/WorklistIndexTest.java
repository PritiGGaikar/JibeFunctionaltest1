package technical_Worklist;

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





public class WorklistIndexTest extends WebDriverPass{

	ExtentReports report;
	ExtentTest test;

	WorklistIndex w = new WorklistIndex();
	
	
  @Test(priority=1)
  public void WokrlistModule() throws InterruptedException {
	  test=report.startTest("WokrlistModule"); 
	  w.worklistindex(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "WokrlistModule"); 
	    
 
  }
 
  @Test(priority=2)
  public void Newjobcreated() throws InterruptedException {
	  	  
	  test=report.startTest("Newjobcreated");
	  w.Newjobcreated(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "Newjobcreated"); 	 	    

      
  }
  @Test(priority=3)
  public void Folloupresponse() throws InterruptedException {
	  	  
	  test=report.startTest("Folloupresponse");
	  w.Folloupresponse(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "Folloupresponse");    
 
  }
  @Test(priority=4)
  public void NCRresponse() throws InterruptedException {
	  	  
	  test=report.startTest("NCRresponse");
	  w.NCRresponse(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "NCRresponse");   
 
  }
  @Test(priority=5)
  public void Jobscompleded() throws InterruptedException {
	  	  
	  test=report.startTest("Jobscompleded");
	  w.Jobscompleded(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "Jobscompleded");   
 
  }
  @Test(priority=6)
  public void jobsnotverified() throws InterruptedException {
	  	  
	  test=report.startTest("jobsnotverified");
	  w.jobsnotverified(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "jobsnotverified");  
 
  }
  
 
  @Test(priority=7)
  public void All() throws Exception {
	  	  
	  test=report.startTest("All type jobs");
	  w.All(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "All type jobs"); 
 
  }
  
 
  @Test(priority=8)
  public void   NCR() throws Exception {
	  	  
	  test=report.startTest("NCR type jobs");
	  w. NCR(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "NCR type jobs"); 
  } 	

  @Test(priority=9)
  public void   Defect() throws Exception {
	  	  
	  test=report.startTest("Defect type jobs");
	  w.Defect(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "Defect type jobs"); 
  } 	
  @Test(priority=10)
  public void   Note() throws Exception {
	  	  
	  test=report.startTest("Note type jobs");
	  w.Note(driver);
	  Assert.assertTrue(true);
      test.log(LogStatus.PASS, "Note type jobs"); 
  } 	
  
  @Test(priority = 11)
	public void worklistindex() throws Exception {
		test=report.startTest("worklistindex");
		w.worklist(driver);
		Assert.assertTrue(true);
	    test.log(LogStatus.PASS, "worklistindex"); 

	}

	@Test(priority = 12)
	public void alerthandling() throws Exception {
		test=report.startTest("alerthandling");
		w.alerthandling(driver);
		 Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "alerthandling"); 
	}
	 @Test(priority=13)
	  public void WorklistModule1() throws Exception  {
	   
	 test=report.startTest("EditJob");
	 w.worklistindexs(driver);
	 Assert.assertTrue(true);
    test.log(LogStatus.PASS, "EditJob"); 

	     
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
	  
	
	  }

