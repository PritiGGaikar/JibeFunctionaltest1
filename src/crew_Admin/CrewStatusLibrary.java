package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class CrewStatusLibrary extends RW{
	
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
		
		driver.findElement(By.linkText("Crew Status Library")).click();    // Crew Status Library
		
		Thread.sleep(1000);
		
	}
	
	
public void AddStatus(WebDriver driver1) throws Exception 
	
	{
		WebDriver driver= driver1;
		
        click_element(driver,"id", "ctl00_MainContent_ImgAddStatus");   // Add Icon
		
		Thread.sleep(1000);
		
        sendkeys(driver,"id","ctl00_MainContent_txtStatus", "Flying14");   // Status :(Dynamic)
		
		Thread.sleep(1000);
		
        sendkeys(driver,"id","ctl00_MainContent_txtValue", "Plane14");   // Value  (Dynamic)
		
		Thread.sleep(2000);
		
        click_element(driver,"id", "ctl00_MainContent_btnSaveAndClose");   // Save
		
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();    // Switching to Alert  
		String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    			   
		System.out.println(alertMessage);    // Displaying alert message  
		Thread.sleep(1000);  			    
		alert.accept();    // Accepting alert  
		
		Thread.sleep(2000);
		
		click_element(driver,"id", "ctl00_MainContent_ibtnRefStatus");   // Refresh
		
		Thread.sleep(1000);
		
		clear_element(driver,"id","ctl00_MainContent_txtfilter");   // Clear
		
		Thread.sleep(1000);
		
	    sendkeys(driver,"id","ctl00_MainContent_txtfilter", "Flying14");   // Filter(Dynamic)

	    Thread.sleep(2000);
	    
	    click_element(driver,"id", "page-content");   // Click on Page
		
        Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_ibtnRefStatus");   // Refresh
		
}

public void EditStatus(WebDriver driver1) throws Exception 

{
	
	WebDriver driver= driver1;
	
	sendkeys(driver,"id","ctl00_MainContent_txtfilter", "Flying14");   // Filter(Dynamic)

    Thread.sleep(2000);
    
    click_element(driver,"id", "page-content");   // Click on Page
	
    Thread.sleep(1000);
    
    click_element(driver,"id", "ctl00_MainContent_GridView_Status_ctl02_LinkButton2");   // Edit
    
    Thread.sleep(1000);
    
    clear_element(driver,"id","ctl00_MainContent_GridView_Status_ctl02_txtStatus_Name");   // Clear  
    
    Thread.sleep(1000);
    
    sendkeys(driver,"id","ctl00_MainContent_GridView_Status_ctl02_txtStatus_Name", "FlyingAway14");   //  Status edit(Dynamic)
	
    Thread.sleep(1000);
    
    click_element(driver,"id", "ctl00_MainContent_GridView_Status_ctl02_ImgBtnAccept");   // Save
	
    Alert alert=driver.switchTo().alert();    // Switching to Alert  )
	String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    		   
	System.out.println(alertMessage);    // Displaying alert message  
	Thread.sleep(1000);  		    
	alert.accept();    // Accepting alert  
	
	click_element(driver,"id", "ctl00_MainContent_ibtnRefStatus");   // Refesh
	
	Thread.sleep(1000);
	
	clear_element(driver,"id","ctl00_MainContent_txtfilter");   // Clear 
	
	Thread.sleep(1000);
	
	sendkeys(driver,"id","ctl00_MainContent_txtfilter", "FlyingAway14");   // Filter(Dynamic)

    Thread.sleep(2000);
    
    click_element(driver,"id", "page-content");   // Click on Page
	
    Thread.sleep(1000);
    
    click_element(driver,"id", "ctl00_MainContent_ibtnRefStatus");   // Refresh
    
    Thread.sleep(2000);
	
}


public void AddSubStatus(WebDriver driver1) throws Exception 

{
	WebDriver driver= driver1;
	
	click_element(driver,"id", "ctl00_MainContent_ImgAdd_C_Status");   // Add Icon
	
	Thread.sleep(1000);
	
    sendkeys(driver,"id","ctl00_MainContent_txtStatus", "Flying14");   // Status :(Dynamic)
	
	Thread.sleep(1000);
	
    sendkeys(driver,"id","ctl00_MainContent_txtValue", "Plane14");   // Value (Dynamic)
	
	Thread.sleep(1000);
	
    click_element(driver,"id", "ctl00_MainContent_btnSaveAndClose");   // Save
	
	Thread.sleep(1000);
	
	Alert alert=driver.switchTo().alert();    // Switching to Alert  
	String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    		   
	System.out.println(alertMessage);    // Displaying alert message  
	Thread.sleep(1000);  		    
	alert.accept();    // Accepting alert  
	
	Thread.sleep(2000);
	
	click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refesh
	
	Thread.sleep(1000);
	
    sendkeys(driver,"id","ctl00_MainContent_txtfilterCal_Status", "Flying14");   // Filter(Dynamic)

    Thread.sleep(2000);
    
    click_element(driver,"id", "page-content");   // Click on Page
	
    Thread.sleep(1000);
    
    click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refesh
	
}


public void EditSubStatus(WebDriver driver1) throws Exception 

{
	WebDriver driver= driver1;
	
	sendkeys(driver,"id","ctl00_MainContent_txtfilterCal_Status", "Flying14");   // Filter(Dynamic)

    Thread.sleep(2000);
    
    click_element(driver,"id", "page-content");   // Click on Page
	
    Thread.sleep(1000);
    
    click_element(driver,"id", "ctl00_MainContent_GridView_Calc_Status_ctl02_LinkButton2");   // Edit
    
    Thread.sleep(1000);
    
    clear_element(driver,"id","ctl00_MainContent_GridView_Calc_Status_ctl02_txtEvaluation_Type");   // Clear  
    
    Thread.sleep(1000);
    
    sendkeys(driver,"id","ctl00_MainContent_GridView_Calc_Status_ctl02_txtEvaluation_Type", "FlyingAwayfrom14");   //  Status edit(Dynamic)
	
    Thread.sleep(1000);
    
    click_element(driver,"id", "ctl00_MainContent_GridView_Calc_Status_ctl02_ImgBtnAccept");   // Save
    
    Thread.sleep(2000);
	
    Alert alert=driver.switchTo().alert();    // Switching to Alert  
	
	String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    		   
	System.out.println(alertMessage);    // Displaying alert message  
	Thread.sleep(1000);  		    
	alert.accept();    // Accepting alert  
	
	click_element(driver,"id", "ctl00_MainContent_ibtnRefStatus");   // Refesh
	
	Thread.sleep(1000);
	
	clear_element(driver,"id","ctl00_MainContent_txtfilterCal_Status");   // Clear 
	
	Thread.sleep(1000);
	
	sendkeys(driver,"id","ctl00_MainContent_txtfilterCal_Status", "FlyingAwayfrom14");   // Filter(Dynamic)

    Thread.sleep(2000);
    
    click_element(driver,"id", "page-content");   // Click on Page
	
    Thread.sleep(1000);
    
    
	
}


}