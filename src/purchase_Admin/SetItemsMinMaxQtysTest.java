package purchase_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import purchase_Admin.SetItemsMinMaxQty;
import quality_Admin.FormTypeLibrary;



public class SetItemsMinMaxQtysTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	SetItemsMinMaxQty w = new SetItemsMinMaxQty();
	

   @Test(priority=9)
  public void MinMaxQuantity() throws InterruptedException {
	   test=report.startTest("Min Max Quantity");	  
	   w.MinMaxQuantity(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Min Max Quantity"); 
  }
   @Test(priority=10)
   public void CatalogueItem() throws Exception {
 	   test=report.startTest("Catalogue Item");	  
 	   w.CatalogueItem(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Catalogue Item"); 
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
	  report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		  		  }
  
 /* @AfterSuite
 public void afterSu() {
      report.close();
  }*/
   
   
   
}
