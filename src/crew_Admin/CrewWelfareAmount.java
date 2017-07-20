package crew_Admin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CrewWelfareAmount extends RW{
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

	  		public void Adminm(WebDriver driver1) throws InterruptedException {
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

	  				// Select "Crew Welfare Amount "
	  				WebElement crewrank = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[8]/a/span"));
	  				crewrank.click();
	  				Thread.sleep(5000);
	  			}
	  //---------------------------------------"Welfare Details"---------------------------------------------------------------------------//
		  	
	  		public void addWelfareDetails(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;
	
	  		// verifying record
	  		String Record= driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_pagerWf_lblTotalPages']")).getText();
	  		System.out.println("record :" + Record);
	   
	  		// click "Add Welfare Details "
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnAddNew']");
	  		Thread.sleep(4000);	
	  		
	  		//click on "vessel name" dropdown
	  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlVesselUpd']","HARUKA");
	  		Thread.sleep(3000);
		    
		   /* //Enter Amount
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtWelfareAmount']", "Test12@#$%&");
			Thread.sleep(3000);
			
			//click on "amount textbox"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtEffectiveDate']");
			Thread.sleep(3000);
			  
			//click on "amount" alert
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_vcotxtWelfareAmount_popupTable']/tbody/tr/td[4]/div/img");
			Thread.sleep(3000);*/
			
			//clear "amount textbox"
			clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtWelfareAmount']");
			Thread.sleep(3000);
			
			 
		  
		    //Enter "Effective Date"
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtEffectiveDate']", "05-04-2017");
			Thread.sleep(3000);
			
			  //Enter Amount
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtWelfareAmount']", "1200.40");
			Thread.sleep(3000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='btnSaveDetails']");
			Thread.sleep(3000);
			
			//verifying record using varibale
			
			String verifyrecord=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_pagerWf_lblTotalPages']")).getText();
			System.out.println("Record :" +verifyrecord);
	  		}
	  	
	 //--------------------------------------------------------------"filter"-----------------------------------------------------------------------------// 		
	  		
	  		public void filter(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;
	
	  		//select "vessel" filter
	  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlVessel']","HARUKA");
		  	Thread.sleep(3000);	
	  		
		    //select "Effective Date"
		  	dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlEectiveDates']","27-01-2017");
		  	Thread.sleep(3000);	
	  		
	  		//click on "search"
		  	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSearch']");
			Thread.sleep(3000);
	  		
			
			                //******************************* "edit" *******************************************//
	  		//click on "edit"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvWelfare_ctl02_imgEdit']");
			Thread.sleep(3000);
	  		
			//enter "amount"
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtWelfareAmount']", "0");
			Thread.sleep(3000);
	  		
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='btnSaveDetails']");
			Thread.sleep(3000);
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
}}
