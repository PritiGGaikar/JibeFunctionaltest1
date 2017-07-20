package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CrewSignOffReason extends RW{
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
	  //-----------------------------------------------------------"mouse hover Crew Sign Off Reason"-------------------------------------------------------------//

	  		public void Adminm(WebDriver driver1) throws InterruptedException {
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
	  				// Select "crew rank"
	  				WebElement CrewSignOffReason = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[6]/a/span"));
	  				CrewSignOffReason.click();
	  				Thread.sleep(5000);
	  			}
	  	//---------------------------------------"Add Signoff Reason"---------------------------------------------------------------------------//
		  	
	  		public void addrank(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;
	
	   
	  		// click "Add Signoff Reason "
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAdd']");
	  		Thread.sleep(1000);	
	  		
	                                        //***************Alert capturing for mandatory fields******************//
			
			//****** Add Signoff Reason ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
			
		    // Alert of "Signoff Reason"
		    Alert rankname = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert1 = rankname.getText();
		    System.out.println(" alert :" + Alert1);
		    Thread.sleep(2000);
		    rankname.accept();
		    Thread.sleep(2000);
		    
		    //Enter "Signoff Reason"
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtsingoffReason']", "XYZ");
			Thread.sleep(3000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
}
	  //---------------------------------------"search"---------------------------------------------------------------------------//  		
	  		public void search(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;	
			
			
		    //search by "Search"
	  		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "XYZ");
			Thread.sleep(1000);
				
		    //click on "search" button
		    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
		    Thread.sleep(1000);	
	  		
			
		    //click on "edit" button
		    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSnReason_ctl02_ImgUpdate']");
		    Thread.sleep(1000);	
		    
	  		//click on "Default Joining Type"
		    dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlJoinType']", "SEA SERVICE");
			Thread.sleep(1000);
					
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
	  		
			//click on "info"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSnReason_ctl02_imgRecordInfo']");
			Thread.sleep(3000);
	  		
			//click on "exit"
			click_element(driver, "xpath", ".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img");
			Thread.sleep(1000);
			
	  		//click on delete
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSnReason_ctl02_ImgDelete']");
			Thread.sleep(3000);
	  		
			 // Alert of "Signoff Reason"
		    Alert SignoffReason = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert1 = SignoffReason.getText();
		    System.out.println(" alert :" + Alert1);
		    Thread.sleep(2000);
		    SignoffReason.accept();
		    Thread.sleep(2000);
	  
	  		//click on refresh
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
			Thread.sleep(1000);
	  		
			//click on export excel
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExpExcel']");
			Thread.sleep(1000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	  		
	  		}		
}