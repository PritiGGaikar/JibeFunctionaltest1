package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class OnBoardStaffLimit extends RW {
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
	    
	  //-----------------------------------------------------------"mouse hover On Board Staff Limit "-------------------------------------------------------------//

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

  				// Select "On Board Staff Limit "
  				WebElement OnBoardStaffLimit  = driver.findElement(By.linkText("OnBoard Staff Limit"));
  				OnBoardStaffLimit.click();
  				Thread.sleep(3000);
  			}
  		
  //--------------------------------------------------search-------------------------------------------------------------------------------------------//		
  		
  		public void search(WebDriver driver1) throws Exception {
  			WebDriver driver = driver1;
  		
  		
  		//Select "Fleet" dropdown
  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlFleet']", "Fleet-B");
		Thread.sleep(1000);
  		
		//Select "Vessel Name" dropdown
  		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlVessel']", "HARUKA");
		Thread.sleep(1000);
  		
		//Clear "maximum limit"
	    clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankLimit_ctl02_txtMaxLimit']");
		Thread.sleep(1000);
		
  		//change "maximum limit"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankLimit_ctl02_txtMaxLimit']", "1");
		Thread.sleep(1000);
		
		//Clear "minimum limit"
	    clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankLimit_ctl02_txtMinLimit']");
		Thread.sleep(1000);
					
		//change "minimum limit"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankLimit_ctl02_txtMinLimit']", "1");
		Thread.sleep(1000);
  		
		//click on "save" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
		Thread.sleep(1000);
		
		  // Alert of "limit."
	    Alert limit = driver.switchTo().alert();
	    // To read the text from alert
	    String Alert2 = limit.getText();
	    System.out.println(" alert :" + Alert2);
	    Thread.sleep(2000);
	    limit.accept();
	    Thread.sleep(2000);
  		
  		//**************************************************//
		//Clear "maximum limit"
	    clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankLimit_ctl03_txtMaxLimit']");
		Thread.sleep(1000);
		
		// change "maximum limit"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankLimit_ctl03_txtMaxLimit']", "2");
		Thread.sleep(1000);
		
		//Clear "minimum limit"
	    clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankLimit_ctl03_txtMinLimit']");
		Thread.sleep(1000);

		// change "minimum limit"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankLimit_ctl03_txtMinLimit']", "2");
		Thread.sleep(1000);

		// click on "save" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
		Thread.sleep(3000);

		// Alert of "limit."
		Alert limit1 = driver.switchTo().alert();
		// To read the text from alert
		String Alert = limit.getText();
		System.out.println(" alert :" + Alert);
		Thread.sleep(2000);
		limit1.accept();
		Thread.sleep(2000);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
}
}