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

public class ItemCategoryTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	ItemCategory w = new ItemCategory();
	

   @Test(priority=33)
  public void ItemCategory() throws InterruptedException {
	   test=report.startTest("Item Category");	  
	   w.ItemCategorys(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Item Category"); 
  }
   
   @Test(priority=34)
   public void AddNewCategory() throws Exception {
 	   test=report.startTest("Add New Category");	  
 	   w.AddNewCategory(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Add New Category"); 
   }
    
   
   @Test(priority=35)
   public void EditNewCategory() throws Exception {
 	   test=report.startTest("Edit New Category");	  
 	   w.EditNewCategory(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Edit New Category"); 
   }
   
   @Test(priority=36)
   public void DeleteCategory() throws Exception {
 	   test=report.startTest("Delete Category");	  
 	   w.DeleteCategory(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Delete Category"); 
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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
  
/*  @AfterSuite
 public void afterSu() {
      report.close();
  }*/
}
