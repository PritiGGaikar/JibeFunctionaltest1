package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CrewLeaveWagesWithholdRules extends RW{
	
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
				
				// Select "Crew Leave Wages Withhold Rules"
				WebElement CrewLeaveWagesWithholdRules = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[26]/a/span"));
				CrewLeaveWagesWithholdRules.click();
				Thread.sleep(1000);
			
	            //select "Contract No"
				sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "1");
				Thread.sleep(1000);
	
	            //click on "search"
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
				Thread.sleep(1000);
				
				
				//click on "edit" button
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvCrewContractWithhold_ctl02_ImgUpdate']");
				Thread.sleep(1000);
				
				//clear "Effective date" textbox"
				clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtEffectiveDate']");
				Thread.sleep(1000);
				
				/*//click on "exit of alert" button
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_v4_popupTable']/tbody/tr/td[4]/div/img");
				Thread.sleep(3000);*/
				
				//select "Effective Date"
				sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtEffectiveDate']", "17-05-2017");
				Thread.sleep(1000);
/*
				  // Alert of "delete"
			    Alert Date = driver.switchTo().alert();
			    // To read the text from alert
			    String Alert = Date.getText();
			    System.out.println(" alert :" + Alert);
			    Thread.sleep(2000);
			    Date.dismiss();
			    Thread.sleep(2000);
				*/
				//clear "amount" textbox"
				clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtAmount']");
				Thread.sleep(1000);
				
				//select "amount"
				sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtAmount']", "30.00");
				Thread.sleep(1000);
				
				//click on save button
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
				Thread.sleep(3000);
				
				//click on "delete button"
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvCrewContractWithhold_ctl02_ImgDelete']");
				Thread.sleep(3000);
				
				  // Alert of "delete"
			    Alert delete = driver.switchTo().alert();
			    // To read the text from alert
			    String Alert1 = delete.getText();
			    System.out.println(" alert :" + Alert1);
			    Thread.sleep(2000);
			    delete.dismiss();
			    Thread.sleep(2000);
				
				//click on refresh button
			    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
				Thread.sleep(1000);
				
				//click on "export excel"
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExpExcel']");
				Thread.sleep(1000);
				

}}
