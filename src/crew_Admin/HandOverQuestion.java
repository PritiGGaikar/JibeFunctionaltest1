package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class HandOverQuestion extends RW {
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
	 //-----------------------------------------------------------"mouse hover Crew HandOver Question"-------------------------------------------------------------//

  		public void Adminm(WebDriver driver1) throws Exception {
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

  				// Select "Crew HandOver Question"
  				WebElement DocumentType = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[14]/a/span"));
  				DocumentType.click();
  				Thread.sleep(5000);
  				
  				//verifying record by creating variable
  				String record1=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
				System.out.println("Record :" +record1);
				
  				//click on add question button
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAdd']");
  		  		Thread.sleep(4000);	
  				
  		  		
  		  		// *********************************************** "Add question alert"******************************************************// 
  		  		
  		  		
  				//click on save
  		  	    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
		  		Thread.sleep(4000);	
  				
		  	    // Alert of " Crew Rank"
			    Alert  CrewRank = driver.switchTo().alert();
			    // To read the text from alert
			    String Alert1 = CrewRank.getText();
			    System.out.println(" alert :" + Alert1);
			    Thread.sleep(2000);
			    CrewRank.accept();
			    Thread.sleep(2000);
			    
			    //Enter Crew Rank
			    dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlRank']", "Test");
				Thread.sleep(3000);
				
				//****** question ************//
				
				//click on "save" button
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
				Thread.sleep(3000);
				
				  // Alert of "question"
			    Alert Group = driver.switchTo().alert();
			    // To read the text from alert
			    String Alert = Group.getText();
			    System.out.println(" alert :" + Alert);
			    Thread.sleep(2000);
			    Group.accept();
			    Thread.sleep(2000);
				
			    //Enter question
			    sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtQuestion']", "TesterQuestion");
				Thread.sleep(3000);
				
  			    //click on check box of checklist	
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkCheckList']");
				Thread.sleep(3000);
  				
				//click on "save" button
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
				Thread.sleep(3000);
				
				String record=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
				System.out.println("Record :" +record);
  		}
	//-----------------------------------------------------------"Search question"-------------------------------------------------------------//			
  				
				public void search(WebDriver driver1) throws Exception {
		  			WebDriver driver = driver1;
  				
  				
	           	// search question
		        sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "TesterQuestion");
		        Thread.sleep(3000);
  				
  				//search by rank dropdown
		        dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlRankFilter']", "Test");
				Thread.sleep(3000);	
  				
  				//click on "search"
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
				Thread.sleep(3000);
  				
  				//click on edit button
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvCrewContract_ctl02_ImgUpdate']");
				Thread.sleep(3000);
  				
				//clear "question" textbox"
				clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtQuestion']");
				Thread.sleep(3000);
				
				//edit question textbox
			    sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtQuestion']", "TesterQuestion1");
				Thread.sleep(3000);
  				
				//click on save
  		  	    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
		  		Thread.sleep(4000);
  				
		  		//click on "refresh"
		  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
			    Thread.sleep(4000);
		  		
		  		//click on "export excel"
			    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExpExcel']");
			    Thread.sleep(4000);
				}}
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
		  		
  			
