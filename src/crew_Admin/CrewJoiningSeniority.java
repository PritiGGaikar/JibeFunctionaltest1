package crew_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CrewJoiningSeniority extends RW{
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
				
				// Select "Crew Joining Seniority "
				WebElement CrewJoiningSeniority = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[19]/a/span"));
				CrewJoiningSeniority.click();
				Thread.sleep(1000);
				
				//select "status" dropdown
				dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlStaus']", "Onboard");
				Thread.sleep(1000);
				
				//click on "search button"
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSearch']");
		  		Thread.sleep(1000);
		  		
				//click on "edit button"
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSeniorityRecords_ctl05_Edit']");
		  		Thread.sleep(1000);
				/*
				//select "Seniority Rank" dropdown
		  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSeniorityRecords_ctl05_ddlSeniorityRank']", "MST");
				Thread.sleep(3000);*/
		  		
		    	//Clear on "search button"
				clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSeniorityRecords_ctl05_txtCompanySeniorityYear']");
		  		Thread.sleep(1000);
		  		
		  		 // sendkeys for Company Seniority Year
			  	 sendkeys(driver, "xpath",".//*[@id='ctl00_MainContent_gvSeniorityRecords_ctl05_txtCompanySeniorityYear']","5");
			  	 Thread.sleep(1000);
			  	 
			  	//Clear on Company Seniority Days"
					clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSeniorityRecords_ctl05_txtCompanySeniorityDays']");
			  		Thread.sleep(1000);
			  		
			  		 // sendkeys for 	Company Seniority Days
				  	 sendkeys(driver, "xpath",".//*[@id='ctl00_MainContent_gvSeniorityRecords_ctl05_txtCompanySeniorityDays']","15");
				  	 Thread.sleep(1000);
				  	 
				  	//Clear on 	Company Effective Date
						clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSeniorityRecords_ctl05_txtCompanyEffectiveDate']");
				  		Thread.sleep(1000);
				  		
				  		 // sendkeys for 	Company Effective Date
					  	 sendkeys(driver, "xpath",".//*[@id='ctl00_MainContent_gvSeniorityRecords_ctl05_txtCompanyEffectiveDate']","26-05-2017");
					  	 Thread.sleep(1000);
				
				//click on "save button"
				click_element(driver, "xpath", ".//*[@id='Save']");
		  		Thread.sleep(2000);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			

}
}