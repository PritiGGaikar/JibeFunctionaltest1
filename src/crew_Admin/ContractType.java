package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ContractType extends RW {
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
  				
  				// Select "Contract Type"
  				WebElement joiningtype = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[12]/a/span"));
  				joiningtype.click();
  				Thread.sleep(1000);
  			
  				//click on "add new contract"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkAddNewContract']");
  				Thread.sleep(1000);
  				
  				//click on save button
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
  				Thread.sleep(3000);
  				
  				// alert
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ValidatorCalloutExtender1_popupTable']/tbody/tr/td[4]/div/img");
  				Thread.sleep(1000);
  				
  				//Enter "Contract Name"
  				sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtContractName']", "AABB@#$%^&*");
  				Thread.sleep(1000);
  				
  				//select "countries"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkCountryList1_98']");
  				Thread.sleep(1000);
  				
  				//click on "save button"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
  				Thread.sleep(3000);
  				
  				//click on edit
  				//click on vessel flags
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvContract_ctl02_btnEdit']");
  				Thread.sleep(1000);
  				
  				//select radio button "vessel flag"
  				radioButton(driver, "xpath", ".//*[@id='ctl00_MainContent_rdbContractType_1']");
  				Thread.sleep(1000);
  				
  			    //select vessel flag
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkVesselFlagList1_1']");
  				Thread.sleep(1000);
  				
  				//click on save button
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
  				Thread.sleep(3000);
  				
  				//click on "delete"
  				click_element(driver, "id", "ctl00_MainContent_gvContract_ctl02_LinkButton1del");
  				Thread.sleep(3000);
  				
  			    // Alert of "delete Contract Type."
  			    Alert deleteContractType = driver.switchTo().alert();
  			    // To read the text from alert
  			    String Alert1 = deleteContractType.getText();
  			    System.out.println(" alert :" + Alert1);
  			    Thread.sleep(2000);
  			     deleteContractType.accept();
  			    Thread.sleep(2000);
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				

}}
