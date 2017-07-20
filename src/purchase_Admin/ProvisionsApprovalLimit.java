package purchase_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ProvisionsApprovalLimit  extends RW{

	 

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\PurchaseAdmin.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}

	public void ProvisionsApprovalLimit(WebDriver driver1) throws InterruptedException {  

		WebDriver driver = driver1;
		
		WebElement technical = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																					
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement ProvisionsApprovalLimit = driver.findElement(By.linkText("Provision's Approval Limi")); // path for ProvisionsApprovalLimit  
		ProvisionsApprovalLimit.click();    	
		Thread.sleep(3000);
		
	}
	
	public void SetApprovalLimit(WebDriver driver1) throws Exception {  
		
	
		WebDriver driver = driver1;
		
		dropdown(driver, "id","ctl00_MainContent_ddlFleet","Mtest1");// Dropdown -->Fleet -->Mtest1
		Thread.sleep(1000);
		
		checkbox_element(driver,"id", "ctl00_MainContent_chkVesselListSelectAll");//Checkbox for Select All
		Thread.sleep(1000);
		
		dropdown(driver, "id","ctl00_MainContent_ddlSubCatalogue","-- All --");// Dropdown -->Sub Catalogue -->All
		Thread.sleep(1000);
		
		clear_element(driver, "id","ctl00_MainContent_txtSearchItems");// Clear Item 
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchItems", "BEANS FRESH "); //Sendkeys for Item "BEANS FRESH "
		Thread.sleep(1000);
		
		checkbox_element(driver,"id", "ctl00_MainContent_chkMaxQty");//Checkbox for Qty > 0
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnSearch"); //Click on Search
		Thread.sleep(2000);
		
		click_element(driver, "id","ctl00_MainContent_btnExport"); //Click on Export To Excel
		Thread.sleep(2000);
	}
}