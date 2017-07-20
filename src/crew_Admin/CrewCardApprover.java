package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class CrewCardApprover extends RW{
	
private static ExtentReports report;
    
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
		
		driver.findElement(By.linkText("Crew Card Approvers")).click();    // Crew Card Approvers
		
		Thread.sleep(1000);
		
	}
	
    public void AddCrewCardApprover(WebDriver driver1) throws Exception 
	
	{
		WebDriver driver= driver1;
		
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_ImgExpExcel");   // Export To Excel
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_ImgAdd");   // Add Icon
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkUserList_92");    // MANI CREW
		
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkUserList_95");    //Manoj Sahu
		
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnsave");    // Save
		
		Thread.sleep(1000);
		
		Alert alert=driver.switchTo().alert();    // Switching to Alert  
		String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    			   
		System.out.println(alertMessage);    // Displaying alert message  
		Thread.sleep(1000);  			    
		alert.accept();    // Accepting alert  
		
		Thread.sleep(2000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlType","Red Card");      // Approver Type
		
		Thread.sleep(1000);   
		
        click_element(driver,"id", "ctl00_MainContent_chkUserList_97");    // MANI CREW	
        
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkUserList_101");    //Manoj Sahu	
		
        Thread.sleep(1000);
        
        click_element(driver,"id", "ctl00_MainContent_btnsave");    // Save
        
        Thread.sleep(1000);
        
        Alert alert1=driver.switchTo().alert();    // Switching to Alert  
		String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    			   
		System.out.println(alertMessage1);    // Displaying alert message  
		Thread.sleep(1000);  			    
		alert1.accept();    // Accepting alert  
		
		Thread.sleep(2000);
		
		click_element(driver,"id","ctl00_MainContent_btnRefresh");   // Refresh
		
		Thread.sleep(1000);
		
	    click_element(driver,"id", "ctl00_MainContent_ImgExpExcel");   // Export To Excel
	    
	    Thread.sleep(1000);
		
		clear_element(driver,"id","ctl00_MainContent_txtfilter");   // Clear
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtfilter", "Manoj");   // User
		
		Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
		
		Thread.sleep(3000);
		
		clear_element(driver,"id","ctl00_MainContent_txtfilter");   // Clear
		
		Thread.sleep(1000);
			
		sendkeys(driver,"id", "ctl00_MainContent_txtfilter","Mani");    // Manoj Sahu	
		
        Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
		
		Thread.sleep(2000);
		
	}
		
	public void EditCrewCardApprover(WebDriver driver1) throws Exception

	{
		WebDriver driver = driver1;	
		
        click_element(driver,"id","ctl00_MainContent_btnRefresh");   // Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtfilter", "Manoj");   // User
		
		Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
		
		Thread.sleep(3000);
		
		click_element(driver,"id", "ctl00_MainContent_gvUserType_ctl02_ImgUpdate");   // Edit
		
        Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_chkUserList_0");   // UnCheck Box
		
		Thread.sleep(1000);
	        
	    click_element(driver,"id", "ctl00_MainContent_btnsave");    // Save
	    
	    Thread.sleep(1000);
	    
	    Alert alert2=driver.switchTo().alert();    // Switching to Alert  
		String alertMessage2=driver.switchTo().alert().getText();    // Capturing alert message.    			   
		System.out.println(alertMessage2);    // Displaying alert message  
		Thread.sleep(1000);  
			    
		alert2.accept();    // Accepting alert  
		
		Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtfilter", "MANI");   // User
		
		Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
		
		Thread.sleep(1000);

		click_element(driver,"id", "ctl00_MainContent_ImgExpExcel");   // Export To Excel
		
		Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
		
}
	
	public void DeleteCrewCardApprover(WebDriver driver1) throws Exception

	{
		WebDriver driver = driver1;	
		
		dropdown(driver,"id", "ctl00_MainContent_ddlApprovalType","Red Card");      // Approver Type
		Thread.sleep(1000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtfilter", "Manoj");   // User
		
		Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
		
		Thread.sleep(2000);
		
        click_element(driver,"id", "ctl00_MainContent_gvUserType_ctl02_ImgDelete");   // Delete
		
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();    // Switching to Alert  

		String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    
				   
		System.out.println(alertMessage);    // Displaying alert message  
		Thread.sleep(1000);  
				    
		alert.accept();    // Accepting alert  
		
        Thread.sleep(2000);
		
		Alert alert1=driver.switchTo().alert();    // Switching to Alert  
	  
		String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    
				   
		System.out.println(alertMessage1);    // Displaying alert message  
		Thread.sleep(1000);  
				    
		alert1.accept();    // Accepting alert  
			
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtfilter","Manoj");    // Manoj
		
        Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_btnFilter");   // Search
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_ImgExpExcel");   // Export To Excel
		
		
	
}}