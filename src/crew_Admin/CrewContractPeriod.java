package crew_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CrewContractPeriod extends RW{
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

  		public void Adminm(WebDriver driver1) throws Exception {
  			WebDriver driver = driver1;

  				// Select "admin" module
  				WebElement adminm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
  				Actions action = new Actions(driver);
  				action.moveToElement(adminm).build().perform();
  				action.moveToElement(adminm).perform();
  				Thread.sleep(2000);

  				// Select "admin"
  				WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
  				admin.click();
  				action.moveToElement(admin).build().perform();
  				Thread.sleep(2000);
  				
  				// Select "Crew Contract Period"
  				WebElement CrewContractPeriod  = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[15]/a/span"));
  				CrewContractPeriod.click();
  				Thread.sleep(5000);
  			
  				
  			    //select "rank" dropdown
				dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlRankFilter']","MST");
			  	Thread.sleep(1000);
			  	
			  	
  				//click on "search"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
  				Thread.sleep(1000);  
	    
	           //click on "edit" button
  			   click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvCrewContract_ctl02_ImgUpdate']");
  			   Thread.sleep(1000);
	    
  			    //clear "days" textbox"
				clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtDays']");
				Thread.sleep(1000);
				
  				//Enter "Days"
 				sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtDays']", "365");
 				Thread.sleep(1000);
	    
 				
 				//click on "save button"
 				 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
 	  			 Thread.sleep(3000);
 				
 				
	            //click on "refresh"
 				 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
 	  			 Thread.sleep(1000);
	           
 	  			 //click on "export excel"
 	  			 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExpExcel']");
 	  			 Thread.sleep(1000);
 	  			 
 	  			 
	    
}
}