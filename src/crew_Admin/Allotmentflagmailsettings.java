package crew_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class Allotmentflagmailsettings extends RW{
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
	//-----------------------------------------------------------"mouse hover Crew Rank Scale"-------------------------------------------------------------//

		public void Admin(WebDriver driver1) throws Exception {
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
				Thread.sleep(2000);
				
				// Select "Mail setting for Allotment Flag"
				WebElement MailsettingforAllotmentFlag = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[17]/a/span"));
				MailsettingforAllotmentFlag.click();
				Thread.sleep(2000);
				
	//**************************************************** search*********************************************************************//
				
				//enter "userName"
			  	sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtUsername']", "Tester");
				Thread.sleep(1000);
				
				//click on "search"
				 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSearch']");
				 Thread.sleep(1000);	
				
				//click on "send mail" checkbox
				 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvUserList_ctl02_chkUser']");
				 Thread.sleep(2000);
				
				//click on "save changes" button
				 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
				 Thread.sleep(2000);
				
				//***************************************************** deselect checkbox***************************************************************//
				
		// clear "username" textbox"
		clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtUsername']");
		Thread.sleep(1000);

		// click on search button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSearch']");
		Thread.sleep(1000);

		// enter "userName"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtUsername']", "Tester");
		Thread.sleep(1000);

		// click on "search"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSearch']");
		Thread.sleep(1000);

		// click on "send mail" checkbox
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvUserList_ctl02_chkUser']");
		Thread.sleep(1000);

		// click on "save changes" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
		Thread.sleep(1000);

}
}