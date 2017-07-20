package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CashAdvanceLimit extends RW{
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
	    //-----------------------------------------------------------"mouse hover Cash Advance Limit"-------------------------------------------------------------//

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

				// Select "Cash Advance Limit"
				WebElement CashAdvanceLimit = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[16]/a/span"));
				CashAdvanceLimit.click();
				Thread.sleep(1000);
						
				//click on "Add Cash Advance Limit"
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkAddNew']");
				Thread.sleep(1000);
	
				
				//************************************************ alert capturing**************************************************************//
				//click on "save and add new" button
				click_element(driver, "xpath", ".//*[@id='btnSave']");
				Thread.sleep(1000);
				
				 // Alert of "Rank."
  			    Alert Rank = driver.switchTo().alert();
  			    // To read the text from alert
  			    String Alert1 = Rank.getText();
  			    System.out.println(" alert :" + Alert1);
  			    Thread.sleep(1000);
  			    Rank.accept();
  			    Thread.sleep(1000);
  				
				//select "Rank category"
  			    dropdown(driver, "xpath", ".//*[@id='ddlRnkCat']", "jibe");
  			    Thread.sleep(1000);
				
				                       //**************************************************************//
  			    
				
  			     //click on "save and add new" button
				click_element(driver, "xpath", ".//*[@id='btnSave']");
				Thread.sleep(2000);
				
				 // Alert of "% of Salary."
  			    Alert Salary = driver.switchTo().alert();
  			    // To read the text from alert
  			    String Alert2 = Salary.getText();
  			    System.out.println(" alert :" + Alert2);
  			    Thread.sleep(2000);
  			    Salary.accept();
  			    Thread.sleep(2000);
  				
  			    //enter "% of Salary"
  				sendkeys(driver, "xpath", ".//*[@id='txtPercent']", "12");
  				Thread.sleep(1000);
				
  				//click on "save and add new" button
				click_element(driver, "xpath", ".//*[@id='btnSaveAndClose']");
				Thread.sleep(2000);
				
				 
				//**************************************************** edit record**********************************************************//
				
				//click on "Edit" button
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView_CashLimit_ctl02_LinkButton2']");
				Thread.sleep(1000);
				
				//clear "Percentage" textbox"
				clear_element(driver, "xpath", ".//*[@id='txtPercentage']");
				Thread.sleep(1000);
				
				//Enter "Percentage" textbox
			    sendkeys(driver, "xpath", ".//*[@id='txtPercentage']", "2");
				Thread.sleep(2000);
  				
				//select "Rank category"
  			    dropdown(driver, "xpath", ".//*[@id='ddlRankCat']", "jibe");
  			    Thread.sleep(1000);
				
  			    
				//click on "save"
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView_CashLimit_ctl02_ImgBtnAccept']");
				Thread.sleep(2000);
			
				//***************************************************** delete*****************************************************************//
				
				//click on "delete" button
				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView_CashLimit_ctl22_LinkButton1del']");
				Thread.sleep(2000);
				
				 // Alert of "delete"
  			    Alert delete = driver.switchTo().alert();
  			    // To read the text from alert
  			    String Alert3 = delete.getText();
  			    System.out.println(" alert :" + Alert3);
  			    Thread.sleep(2000);
  			    Salary.accept();
  			    Thread.sleep(1000);

}
}