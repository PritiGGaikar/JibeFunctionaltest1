package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CompanySeniorityReward extends RW {
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
    //-------------------------------------------------------------"Seniority Reward Year "----------------------------------------------------------------------//
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
		
		// Select "Seniority Reward Year"
		WebElement CrewSignOffReason = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[10]/a/span"));
		CrewSignOffReason.click();
		Thread.sleep(5000);
	
	    
	    //click on "Add New Seniority Reward Year"   
	    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkAddNewSeniorityYear']");
  		Thread.sleep(1000);
	    
	    //click on "save" button
  		 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
   		Thread.sleep(6000);
	    
	    //click on "exit button alert"
   	    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ValidatorCalloutExtender1_popupTable']/tbody/tr/td[4]/div/img");
		Thread.sleep(4000);
	    
	    //enter "Seniority Year"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtSeniorityYear']", "20");
		Thread.sleep(1000);
	    
		//click on "save"
		 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
	   	Thread.sleep(6000);
		
		
		// Alert of "Seniority Year Updated"
	    Alert SeniorityYearUpdated = driver.switchTo().alert();
	    // To read the text from alert
	    String Alert2 = SeniorityYearUpdated.getText();
	    System.out.println(" alert :" + Alert2);
	    Thread.sleep(2000);
	    SeniorityYearUpdated.accept();
	    Thread.sleep(2000);
		
	    //click on delete
	    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvSeniorityYear_ctl12_LinkButton1del']");
   		Thread.sleep(6000);
	    
   	    // Alert of "Seniority Year delete"
	    Alert SeniorityYeardelete = driver.switchTo().alert();
	    // To read the text from alert
	    String Alert = SeniorityYeardelete.getText();
	    System.out.println(" alert :" + Alert);
	    Thread.sleep(2000);
	    SeniorityYeardelete.accept();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}}
