package crew_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CrewDetailsConfiguration extends RW{
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
  				Thread.sleep(2000);
  				
  				// Select "crew rank"
  				WebElement crewrank = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[32]/a/span"));
  				crewrank.click();
  				Thread.sleep(1000);
  				
  				//click on "checkbox of Social Security Number(US)"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView1_ctl06_chkDisplay']");
  				Thread.sleep(1000);
  				
  				//click on "checkbox of School"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView1_ctl11_chkDisplay']");
  				Thread.sleep(1000);
  				
  			    //click on "checkbox of Configurable Field 3"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView1_ctl21_chkDisplay']");
  				Thread.sleep(1000);
  				
  				
  				                    //***************** Confidential****************//
  				
  				 //click on "checkbox of Configurable Field 3"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView1_ctl21_chkConfidential']");
  				Thread.sleep(1000);
  				
  				
  			    //click on "checkbox of Social Security Number(US)"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView1_ctl06_chkConfidential']");
  				Thread.sleep(1000);
  				
  				//click on "checkbox of School"
  				click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridView1_ctl11_chkConfidential']");
  				Thread.sleep(1000);
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  			}}
