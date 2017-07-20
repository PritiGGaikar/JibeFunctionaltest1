package crew_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class OilMajorsRulesMapping extends RW{
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
  //------------------------------------------------------------"Crew Details Configuration "-------------------------------------------------------------------//
	    public void Adminm(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

				// Select "crew" module
				WebElement crew = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
				Actions action = new Actions(driver);
				action.moveToElement(crew).build().perform();
				action.moveToElement(crew).perform();
				Thread.sleep(2000);

				// Select "admin"
				WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
				admin.click();
				action.moveToElement(admin).build().perform();

				// Select "crew rank"
				WebElement crewrank = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[29]/a/span"));
				crewrank.click();
				Thread.sleep(5000);
				
				// click "Additional Rule Mapping "
		  		click_element(driver, "xpath", ".//*[@id='__tab_ctl00_MainContent_TabContainer1_TabPanel1']");
		  		Thread.sleep(4000);	

		  	    // click "info"
		  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_TabContainer1_TabPanel1_gridOilMajorAssign_ctl02_imgRecordInfo']");
		  		Thread.sleep(4000);	
		  		
		  		 // click "exit info"
		  		click_element(driver, "xpath", ".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img");
		  		Thread.sleep(4000);	
		  		
		  	    // click "Rule Mapping "
		  		click_element(driver, "xpath", ".//*[@id='__tab_ctl00_MainContent_TabContainer1_rt1']");
		  		Thread.sleep(4000);	
		  		
		  		//select "oil major" dropdown
		  	     dropdown(driver, "xpath", ".//*[@id='drpOilMajorsFilter']", "M@ni 7est");
				Thread.sleep(5000);	
		  		
		  		
		  		
		  		
		  		
		  		
}
}