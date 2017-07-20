package travel_Admin;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class TravelAdmin extends RW {
	private static ExtentReports report;
	  //------------------------------------------------------Report----------------------------------------------------------------------------------//  
	    public synchronized static ExtentReports getReporter(String filePath) { ////allow only one thread to access the shared resource,To prevent thread interference.
	    	if (report == null) {
		        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\TravelAdmin.html", false);
		        
		        report
		            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
		            .addSystemInfo("Environment", "QA");
	        }
	        
	        return report;
	    }	
	
public static WebDriver driver;
	
	public void Travel(WebDriver driver1) throws Exception 
	
	{
		WebDriver driver= driver1;
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		
		WebElement TravelMenu= driver.findElement(By.linkText("Travel"));   //TravelMenu
		
        action.moveToElement(TravelMenu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		WebElement AdminSubmenu=driver.findElement(By.xpath(".//*[@id='nav']/li[8]/ul/li[1]/a/span"));    // Admin
		
		action.moveToElement(AdminSubmenu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Travel Qtn UserAssignment")).click();
		
		Thread.sleep(1000);
		
	}
	
	public void TravelQtnUserAssignmentg(WebDriver driver1) throws Exception

	{
		WebDriver driver = driver1;
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkLstUser_18");   // Amit Nandha
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkLstUser_29");  // arati Devi
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnMoveRight");  // Arrow mark
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtUserListSearch","Amit Nandha");  // Amit Nandha

		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnUserFilter");  // Search
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnUserRefresh");   //Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtUserListSearch","Arati Devi");    // Arati Devi

		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnUserFilter");  // Search
		
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_btnQtnRefresh");   //Refresh
		
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_chkLstQtnUser_6");   //click
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkLstQtnUser_9");   //click
		
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnMoveLeft");   //Back Arrow
		
        Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_btnQtnRefresh");   //Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtQtnUserListSearch","Amit Nandha");  // Amit Nandha

		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnUserFilter");  // Search
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnRefresh");   //Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtQtnUserListSearch","Arati Devi");    // Arati Devi

		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnUserFilter");  // Search
		
		Thread.sleep(1000);
		
		
}
	
	
	
}