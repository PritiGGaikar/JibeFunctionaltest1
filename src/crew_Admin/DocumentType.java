package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class DocumentType extends RW {
	private static ExtentReports report;
	  //------------------------------------------------------Report----------------------------------------------------------------------------------//  
	    public synchronized static ExtentReports getReporter(String filePath) { ////allow only one thread to access the shared resource,To prevent thread interference.
	    	if (report == null) {
		        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html", false);
		        
		        report
		            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
		            .addSystemInfo("Environment", "QA");
	        }
	        
	        return report;
	    }	
	  //-----------------------------------------------------------"mouse hover crew rank"-------------------------------------------------------------//

	  		public void DocumentTypem(WebDriver driver1) throws InterruptedException {
	  			WebDriver driver = driver1;

	  				// Select "crew" module
	  				WebElement crewm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
	  				Actions action = new Actions(driver);
	  				action.moveToElement(crewm).build().perform();
	  				action.moveToElement(crewm).perform();
	  				Thread.sleep(2000);

	  				// Select "admin"
	  				WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
	  				admin.click();
	  				action.moveToElement(admin).build().perform();

	  				// Select "Document Type"
	  				WebElement DocumentType = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[5]/a/span"));
	  				DocumentType.click();
	  				Thread.sleep(5000);
	  			}
	  		 //---------------------------------------"Add Rank Category"---------------------------------------------------------------------------//
		  	
	  		public void addnewdocumentType(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;
	
	   
	  		// click "Add Document type"
	  		click_element(driver, "id", "ctl00_MainContent_lnkNewDocument");
	  		Thread.sleep(4000);	
	  		
	                                        //***************Alert capturing for mandatory fields******************//
			
			//****** Rank name ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='btnSaveDocType']");
			Thread.sleep(3000);
			
		    // Alert of "Document Type name."
		    Alert Documentname = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert1 = Documentname.getText();
		    System.out.println(" alert :" + Alert1);
		    Thread.sleep(2000);
		    Documentname.accept();
		    Thread.sleep(2000);
		    
		    //Enter Document Type name
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtDocType']", "Tester");
			Thread.sleep(3000);
			
			//****** Group ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='btnSaveDocType']");
			Thread.sleep(3000);
			
			  // Alert of "Group"
		    Alert Group = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert = Group.getText();
		    System.out.println(" alert :" + Alert);
		    Thread.sleep(2000);
		    Group.accept();
		    Thread.sleep(2000);
			
		    //Enter Group
		    dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlGroup1']", "General");
			Thread.sleep(3000);
			
			//select "vessel" checkbox
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkVesselList1_4']");
	  		Thread.sleep(4000);
			
	  	    //select "Nationality " checkbox
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkCountryList1_98']");
	  		Thread.sleep(4000);
			
	  	    //select "Rank" checkbox
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkRankList1_8']");
	  		Thread.sleep(4000);
			
	  	    //click on "save" button
			click_element(driver, "xpath", ".//*[@id='btnSaveDocType']");
			Thread.sleep(3000);
			
			 // Alert of "Document Type"
		    Alert DocumentType = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert2 = DocumentType.getText();
		    System.out.println(" alert :" + Alert2);
		    Thread.sleep(2000);
		    DocumentType.accept();
		    Thread.sleep(2000);
		    
		  //click on "clear all"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkClearFilter']");
			Thread.sleep(7000);
			
	  		}
 //---------------------------------------"search"---------------------------------------------------------------------------//
		  	
	  		public void search(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;	
			
			
		    //search by "Search"
	  		sendkeys(driver, "id", "ctl00_MainContent_txtSearchText", "Tester");
			Thread.sleep(3000);
				
			 //search by "Vessel"
	  		dropdown(driver, "id", "ctl00_MainContent_ddlVessel", "HARUKA");
			Thread.sleep(3000);
			
			//search by "group"
	  		dropdown(driver, "id", "ctl00_MainContent_ddlGroup", "General");
			Thread.sleep(3000);
				
			 //search by "Nationality"
	  		dropdown(driver, "id", "ctl00_MainContent_ddlNationality", "India");
			Thread.sleep(3000);
			
		    //click on "search" button
		    click_element(driver, "id", "ctl00_MainContent_btnSearch");
		    Thread.sleep(3000);
	  		}
 //---------------------------------------"Edit"---------------------------------------------------------------------------//
		  	
	  		public void Edit(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;	
	  			
			//click on "edit" button
	    	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridViewDocType_ctl02_btnEdit']");
			Thread.sleep(3000);	 
			
			//search by "group"
	  		dropdown(driver, "id", "ctl00_MainContent_ddlGroup1", "Group2");
			Thread.sleep(3000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='btnSaveDocType']");
			Thread.sleep(3000);
			
			 // Alert of "Document Type"
		    Alert DocumentType = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert2 = DocumentType.getText();
		    System.out.println(" alert :" + Alert2);
		    Thread.sleep(2000);
		    DocumentType.accept();
		    Thread.sleep(2000);
			
			//click on "clear all"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkClearFilter']");
			Thread.sleep(6000);
	  		}
 //---------------------------------------"search"---------------------------------------------------------------------------//
		  	
	  		public void searchgroup(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;	
			
			
		    /*//search by "Document"
	  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlDocument']", "A- Test - Passport1");
			Thread.sleep(3000);*/
				
		// search by "Search"
		sendkeys(driver, "id", "ctl00_MainContent_txtSearchText", "Tester");
		Thread.sleep(3000);
					
			 //search by "Vessel"
	  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlVessel']", "HARUKA");
			Thread.sleep(3000);
			
			//search by "group"
	  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlGroup']", "Group2");
			Thread.sleep(3000);
				
			 //search by "Nationality"
	  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlNationality']", "India");
			Thread.sleep(3000);
			
		    //click on "search" button
		    click_element(driver, "id", "ctl00_MainContent_btnSearch");
		    Thread.sleep(3000);
		    
		    
	  		}		
			
  //---------------------------------------"delete"---------------------------------------------------------------------------//
		  	
	  		public void delete(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;				
			
	  	   //click on "search" button
		   click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridViewDocType_ctl02_btnDelete']");
		   Thread.sleep(3000);
			
		   // Alert of "Delete record"
		    Alert Deleterecord = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert2 = Deleterecord.getText();
		    System.out.println(" alert :" + Alert2);
		    Thread.sleep(2000);
		    Deleterecord.accept();
		    Thread.sleep(2000);
		    
		 // Alert of "Delete record"
		    Alert Deleterecord1 = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert3 = Deleterecord1.getText();
		    System.out.println(" alert :" + Alert3);
		    Thread.sleep(2000);
		    Deleterecord1.accept();
		    Thread.sleep(2000);
		    
		    
			//click on "clear all"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkClearFilter']");
			Thread.sleep(6000);
		    
		    //export excel
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExportToExcel']");
			Thread.sleep(6000);
	  		}
		   
			
			
			
			
			
			
			
}
