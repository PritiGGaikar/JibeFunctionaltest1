package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;
import common_Function.RW;



public class OilMajorsRuleGroup extends RW{
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
		
		driver.findElement(By.linkText("Oil Majors Rule Group")).click();    // Crew Status Mapping
		
		Thread.sleep(1000);
		
	}


public void AddGroup(WebDriver driver1) throws Exception 

{
	   WebDriver driver= driver1;
	 
	   Thread.sleep(1000);
	   
	   click_element(driver,"id", "ctl00_MainContent_ImgExpExcel");   // Export To Excel

	   Thread.sleep(1000);
	   
	   click_element(driver,"id", "ImgAdd");   // Add Icon
		
       Thread.sleep(2000);
       
       sendkeys(driver,"id","txtGroupName", "Generation");
       
       Thread.sleep(2000);
       
       click_element(driver,"id", "btnsave");   // Save
		
       Thread.sleep(2000);
	
       Alert alert1=driver.switchTo().alert();    // Switching to Alert  
	   String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    	   
	   System.out.println(alertMessage1);    // Displaying alert message  
	   Thread.sleep(1000);  			    
	   alert1.accept();    // Accepting alert  
	   
	   sendkeys(driver,"id","ctl00_MainContent_txtfilter", "Generation");
	   
	   Thread.sleep(2000);  
	   
	   click_element(driver,"id", "btnFilter");   // Search
		
       Thread.sleep(1000);
       
       click_element(driver,"id", "ctl00_MainContent_ImgExpExcel");   // Export To Excel
		
       Thread.sleep(1000);
       
       click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
		
       Thread.sleep(1000);
	   
	   
	
}

public void EditGroup(WebDriver driver1) throws Exception 

{
	   WebDriver driver= driver1;
	   
       sendkeys(driver,"id","ctl00_MainContent_txtfilter", "Generation");
	   
	   Thread.sleep(2000);  
	   
	   click_element(driver,"id", "btnFilter");   // Search
		
       Thread.sleep(1000);

       click_element(driver,"id", "ctl00_MainContent_gvOilMajorsRuleGroup_ctl02_Edit");   // Edit
		
       Thread.sleep(1000);
       
       clear_element(driver,"id", "txtGroupName");
       
       Thread.sleep(1000);
       
       sendkeys(driver,"id","txtGroupName", "New5G.....");   // Edited Group name
       
       Thread.sleep(2000);
       
       click_element(driver,"id", "btnsave");   // Save
		
       Thread.sleep(1000);
	
       Alert alert1=driver.switchTo().alert();    // Switching to Alert  
	   String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    	   
	   System.out.println(alertMessage1);    // Displaying alert message  
	   Thread.sleep(1000);  			    
	   alert1.accept();    // Accepting alert  
	   
	   Thread.sleep(2000);
	   
	   click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
	   
	   Thread.sleep(1000);
	   
	   sendkeys(driver,"id","ctl00_MainContent_txtfilter", "New5G.....");
	   
	   Thread.sleep(2000);  
	   
	   click_element(driver,"id", "btnFilter");   // Search
		
       Thread.sleep(2000);
       
       click_element(driver,"id", "ctl00_MainContent_ImgExpExcel");   // Export To Excel
		
       Thread.sleep(1000);
	   
	   
}


public void InfoAndDeleteGroup(WebDriver driver1) throws Exception 

{
	   WebDriver driver= driver1;
	   
	   click_element(driver,"id", "ctl00_MainContent_gvOilMajorsRuleGroup_ctl02_imgRecordInfo");   // Info
		
       Thread.sleep(1000);
       
       click_element(driver,"id", "ctl00_MainContent_gvOilMajorsRuleGroup_ctl02_ImgDelete");   // Delete
		
       Thread.sleep(1000);
       
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
	   Thread.sleep(2000);
	   
       click_element(driver,"id", "ctl00_MainContent_btnRefresh");   // Refresh
	   
	   Thread.sleep(1000);
       
       sendkeys(driver,"id","ctl00_MainContent_txtfilter", "New5G.....");
	   
	   Thread.sleep(2000);
	   
	   click_element(driver,"id", "btnFilter");   // Search
		
       Thread.sleep(2000);
       
       String joiningType = driver.findElement(By.id("ctl00_MainContent_gvOilMajorsRuleGroup")).getText();
	   System.out.println("Record of New5G..... :" + joiningType);

}






}
