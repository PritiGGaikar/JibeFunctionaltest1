package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class CrewStatusMapping extends RW{
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
	
public static WebDriver driver;
	
	public void Crew(WebDriver driver1) throws Exception 
	
	{
		WebDriver driver= driver1;
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		
		WebElement CrewMenu= driver.findElement(By.linkText("Crew"));   //CrewMenu
		
        action.moveToElement(CrewMenu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		WebElement AdminSubmenu=driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/a/span"));    // Admin
		
		action.moveToElement(AdminSubmenu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Crew Status Mapping")).click();    // Crew Status Mapping
		
		Thread.sleep(1000);
		
	}
	
	

	public void AddStatusMapping(WebDriver driver1) throws Exception 
	
	{
		WebDriver driver= driver1;
		
        click_element(driver,"id", "ctl00_MainContent_ImgAdd");   // Add Icon
		
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_chkCalc_Status_7");   // Joining Type   DRY DOCK
		
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_chkJoiningType_5");   // Joining Type  VACATION
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnsave");   // Save
			
		Thread.sleep(1000);
		
		Alert alert=driver.switchTo().alert();    // Switching to Alert  

		String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    
			   
		System.out.println(alertMessage);    // Displaying alert message  
		Thread.sleep(1000);  
			    
		alert.accept();    // Accepting alert  
		
		Thread.sleep(1000);
		
		dropdown(driver,"id","ctl00_MainContent_ddlMainStatus", "FlyingAway1 ......./////");   // Status
		
		Thread.sleep(2000);
		
       // Thread.sleep(1000);
		
       click_element(driver,"id", "ctl00_MainContent_chkJoiningType_0");   // Joining Type   DRY DOCK
		
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_chkJoiningType_5");   // Joining Type  VACATION
		
		Thread.sleep(1000);
		
		 click_element(driver,"id", "ctl00_MainContent_chkJoiningType_4");   // Joining Type  SICK LEAVE
			
		 Thread.sleep(1000);
		
		
		click_element(driver,"id", "ctl00_MainContent_btnsave");   // Save
		
		Thread.sleep(1000);
		
		Alert alert1=driver.switchTo().alert();    // Switching to Alert  

		String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    
			   
		System.out.println(alertMessage1);    // Displaying alert message  
		Thread.sleep(1000);  
			    
		alert1.accept();    // Accepting alert  
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtfilter", "FlyingAway11");   // Status
		
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
		
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
		
		Thread.sleep(1000);

}
	

	public void EditStatusMapping(WebDriver driver1) throws Exception 
	
	{
		WebDriver driver= driver1;
	
		sendkeys(driver,"id","ctl00_MainContent_txtfilter", "FlyingAway11");   // Status
		
        Thread.sleep(1000);
        
        click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
		
        Thread.sleep(1000);
        
        click_element(driver,"id", "ctl00_MainContent_gvStatusStructure_ctl02_ImgUpdate");   // Edit
		
        Thread.sleep(1000);
        
        click_element(driver,"id", "ctl00_MainContent_chkJoiningType_0");   // Uncheck abc123
		
        Thread.sleep(1000);
        
        click_element(driver,"id", "ctl00_MainContent_chkJoiningType_5");   // Uncheck Sick Leave
		
		Thread.sleep(1000);
        
       /* click_element(driver,"id", "ctl00_MainContent_chkJoiningType_6");   // Vacation
		
        Thread.sleep(1000);
        
        
        click_element(driver,"id", "ctl00_MainContent_chkJoiningType_6");   // Vacation
		
        Thread.sleep(1000);
        */
        click_element(driver,"id", "ctl00_MainContent_btnsave");   // Save
		
		Thread.sleep(1000);
		
		Alert alert1=driver.switchTo().alert();    // Switching to Alert  

		String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    
			   
		System.out.println(alertMessage1);    // Displaying alert message  
		Thread.sleep(1000);  
			    
		alert1.accept();    // Accepting alert  
		
		Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
		
	    Thread.sleep(1000);
		
        sendkeys(driver,"id","ctl00_MainContent_txtfilter", "FlyingAway11");   // Status
		
        Thread.sleep(2000);
        
        click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
        
        Thread.sleep(2000);
        
        String status = driver.findElement(By.id("ctl00_MainContent_gvStatusStructure_ctl02_lblName")).getText();      // Get total Record count
        String joiningType = driver.findElement(By.id("ctl00_MainContent_gvStatusStructure_ctl02_lblJoiningType")).getText();
	    System.out.println("Status And JoiningType  " + status  + joiningType);
	   
	    Thread.sleep(3000);
	
}
	
	
	
	
	
	
	
	
}