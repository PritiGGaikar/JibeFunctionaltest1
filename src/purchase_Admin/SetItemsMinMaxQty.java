package purchase_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class SetItemsMinMaxQty extends RW{
	 
		/*Technical
		PMS
		CopyRunHour*/
		private static ExtentReports report;
		public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
		    if (report == null) {
		    	report = new ExtentReports(path.concat("Report\\Purchase_Admin_Report.html"));
		        
		        report
		            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
		            .addSystemInfo("Environment", "QA");
		    }
		    
		    return report;
		}

		public void MinMaxQuantity (WebDriver driver1) throws InterruptedException {  //(priority=9)

			WebDriver driver = driver1;
			

		     driver.get("http://192.168.1.102/JIBE/purchase/PURC_Items_Quantity_List.aspx");      //Purchase-->Admin--> Min-Max Quantity 
		     Thread.sleep(2000);
		     
		 	String actualTitle = driver.getTitle().trim();
		 	String expectedTitle = " 	Min-Max Quantity ".trim();
		 	Assert.assertEquals(expectedTitle,actualTitle);
			
		 	if(expectedTitle.equals(actualTitle)){
		 		System.out.println("Title Match");
		 		Thread.sleep(2000);
		 	}	else{
		 		System.out.println("Title does not Match");
		 		Thread.sleep(2000);	
		 		
		 	}
			
			/*WebElement Purchase = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
			Actions action = new Actions(driver);
			action.moveToElement(Purchase).build().perform();
			action.moveToElement(Purchase).perform();	
			Thread.sleep(2000);

			WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																				
			Admin.click();		
			action.moveToElement(Admin).build().perform();
			Thread.sleep(3000);

			WebElement SetItemsMinMaxQty  = driver.findElement(By.linkText(data.getData(5,62,2))); // path for Set Item's Min Max Qty
			SetItemsMinMaxQty.click();    	
			Thread.sleep(3000);*/
			
		}
		
		public void CatalogueItem(WebDriver driver1) throws Exception {  //(priority=10)

			WebDriver driver = driver1;
			
			
			 
		dropdownCheckbox(driver,"id", "ctl00_MainContent_DDLFleet_imgCollapseExpandDDL","ctl00_MainContent_DDLFleet_CheckBoxListItems_1","ctl00_MainContent_DDLFleet_btnApplyFilter");// Dropdown -->Fleet -->Fleet-B
		Thread.sleep(1000);
			 
			 
		dropdownCheckbox(driver,"id", "ctl00_MainContent_DDLVessel_imgCollapseExpandDDL","ctl00_MainContent_DDLVessel_CheckBoxListItems_1","ctl00_MainContent_DDLVessel_btnApplyFilter");// Dropdown -->Vessel -->Imara
	    Thread.sleep(1000);
			
		
		click_element(driver, "id","ctl00_MainContent_btnSearch"); //Click on Search
		Thread.sleep(2000);	
			
		
			click_element(driver, "id",(data.getData(5,63,2))); //Click on EDit
			Thread.sleep(2000);
			
			clear_element(driver, "id", (data.getData(5,64,2)));// Clear Effect Date
			 Thread.sleep(1000);
			 
			sendkeys(driver,"id", (data.getData(5,65,2)),"01/01/2017"); //Sendkeys for Effect Date
			Thread.sleep(1000);
			
			 clear_element(driver, "id", (data.getData(5,67,2)));// Clear Min Qty
			 Thread.sleep(1000);
			 
			 sendkeys(driver,"id", (data.getData(5,68,2)), (data.getData(5,69,2))); //Sendkeys for Min Qty
			 Thread.sleep(1000);
			 
			 clear_element(driver, "id", (data.getData(5,70,2)));// Clear Max Qty
			 Thread.sleep(1000);
			 
			 sendkeys(driver,"id", (data.getData(5,71,2)),(data.getData(5,72,2))); //Sendkeys for Max Qty
			 Thread.sleep(1000);
			 					 
			 WebElement e = driver.findElement(By.xpath(data.getData(5,73,2)));   // Certificate Inspection 
             JavascriptExecutor exe = (JavascriptExecutor) driver;
             exe.executeScript("arguments[0].click();", e);
             Thread.sleep(2000);
             
             WebElement e1 = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_gvPurcItems_ctl02_imgRecordInfo']"));   // verify
             JavascriptExecutor exe1 = (JavascriptExecutor) driver;
             exe1.executeScript("arguments[0].click();", e1);
             Thread.sleep(3000);
             
             
             WebElement e2 = driver.findElement(By.xpath(".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img"));   // Close
             JavascriptExecutor exe2 = (JavascriptExecutor) driver;
             exe2.executeScript("arguments[0].click();", e2);
             Thread.sleep(2000);
             
			/* 							
			 click_element(driver, "xpath",".//*[@id='dvChangeMinmaxQty_M']/table/tbody/tr[4]/td/img[1]"); //Click on save
			 Thread.sleep(4000);*/
			 
			 
			/* 
			 dropdownCheckbox(driver, "id","ctl00_MainContent_DDLFleet_imgCollapseExpandDDL", "ctl00_MainContent_DDLFleet_CheckBoxListItems_2","ctl00_MainContent_DDLFleet_btnApplyFilter");//Fleet
			 Thread.sleep(2000);*/
			/* 
			 dropdownCheckbox(driver, "id","ctl00_MainContent_DDLVessel_imgCollapseExpandDDL", "ctl00_MainContent_DDLVessel_CheckBoxListItems_1","ctl00_MainContent_DDLVessel_btnApplyFilter");//Vessel
			 Thread.sleep(2000);
			 */
			 radioButton(driver,"id",(data.getData(5,74,2)));//Department Type:
			 Thread.sleep(2000);
			 
			 dropdown(driver, "id", (data.getData(5,75,2)),(data.getData(5,76,2)));//Department 
			 Thread.sleep(2000);
			 
			 dropdown(driver, "id", (data.getData(5,77,2)),(data.getData(5,78,2)));//Catalogue  
			 Thread.sleep(2000);
			 
			 dropdown(driver, "id", (data.getData(5,79,2)),(data.getData(5,80,2)));//Sub Catalogue 
			 Thread.sleep(2000);
			 
			 click_element(driver, "id",(data.getData(5,81,2))); //Click on Search
			 Thread.sleep(5000);
			 
			 String Record = driver.findElement(By.xpath(data.getData(5,82,2))).getText(); //  Record
			 Thread.sleep(3000);																						
			 System.out.println(Record);
			 Thread.sleep(3000);	
			 
			 click_element(driver, "id",(data.getData(5,83,2))); //Click on Export to  Excel
			 Thread.sleep(2000);
}
}