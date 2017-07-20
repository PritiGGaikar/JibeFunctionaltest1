package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class RaceAndVeteranStatus extends RW {

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}
	
	
       public void RaceIndex(WebDriver driver1) throws Exception{
		WebDriver driver = driver1; 
	     
	   
	    //Click on Crew
		WebElement Crew = driver.findElement(By.linkText("Crew"));  
		Actions action = new Actions(driver);
		action.moveToElement(Crew).build().perform();
		Thread.sleep(2000);
		
		//Click on Admin
		WebElement Admin = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/a/span"));   
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);
		
		//Click on Race And Veteran Status
		driver.findElement(By.linkText("Race And Veteran Status")).click(); 
		Thread.sleep(3000);
		
	//--------------------------------------Add Union-----------------------------------//
		//Click on Add icon
		click_element(driver,"id","ImgAdd");
		Thread.sleep(3000);
		
		//Click on Save button
		click_element(driver,"id","btnsave");
		Thread.sleep(3000);
		
		// Alert for Race
	    Alert alert = driver.switchTo().alert();   
	    String Alert = alert.getText();
	    System.out.print(Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
		
	    //Click on Race
		sendkeys(driver,"id","txtRace","BLACK INDIAN");
		Thread.sleep(3000);
		
		//Click on Save button
		click_element(driver,"id","btnsave");
		Thread.sleep(3000);
				
		// Alert for Race Added Successfully
	    Alert alert1 = driver.switchTo().alert();   
	    String Alert1 = alert1.getText();
	    System.out.print(Alert1);
	    alert1.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);


       
       //--------------------------------------Edit Union--------------------------------------//
        //Click on Race
  		sendkeys(driver,"id","ctl00_MainContent_Tabs_TabRace_txtfilter","BLACK INDIAN");
  		Thread.sleep(2000);
      
   	    //Click on Search icon
  		click_element(driver,"id","ctl00_MainContent_Tabs_TabRace_btnFilter");
  		Thread.sleep(5000);
      
  	    //Click on Edit icon
  	    click_element(driver,"id","ctl00_MainContent_Tabs_TabRace_gvRace_ctl02_Edit");
  	    Thread.sleep(3000);
      
  		//Clear Race
  		clear_element(driver,"id","txtRace");
  		Thread.sleep(3000);
     	//Click on Union
  		sendkeys(driver,"id","txtRace","WHITE INDIAN");
  		Thread.sleep(3000);
  		
    	//Click on Save button
  		click_element(driver,"id","btnsave");
  		Thread.sleep(3000);
      
  	    // Alert for Editing Race Successfully
	    Alert alert2 = driver.switchTo().alert();   
	    String Alert2 = alert2.getText();
	    System.out.print(Alert2);
	    alert2.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    
	 
	    //--------------------------------------Delete Union--------------------------------------//
	    
	    //Clear Race
	    clear_element(driver,"id","ctl00_MainContent_Tabs_TabRace_txtfilter");
	    Thread.sleep(3000);
  		sendkeys(driver,"id","ctl00_MainContent_Tabs_TabRace_txtfilter","WHITE INDIAN");
  		Thread.sleep(2000);
      
   	    //Click on Search icon
  		click_element(driver,"id","ctl00_MainContent_Tabs_TabRace_btnFilter");
  		Thread.sleep(5000);
  		
	   //Click on Delete
       	click_element(driver,"id","ctl00_MainContent_Tabs_TabRace_gvRace_ctl02_ImgDelete");
       	Thread.sleep(3000);
       
        // Alert for Delete Confirmation
	    Alert alert3 = driver.switchTo().alert();   
	    String Alert3 = alert3.getText();
	    System.out.print(Alert3);
	    alert3.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    
	    // Alert for Race Deleted Successfully
	    Alert alert4 = driver.switchTo().alert();   
	    String Alert4 = alert4.getText();
	    System.out.print(Alert4);
	    alert4.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(4000);
       

}
       
       
       public void VeteranStatus(WebDriver driver1) throws Exception{
   		WebDriver driver = driver1; 
   		
   		    //Click on Veteran Status
   		    click_element(driver,"xpath",".//*[@id='__tab_ctl00_MainContent_Tabs_TabVeteranStatus']");
			Thread.sleep(3000);
   	//--------------------------------------Add Union Book-----------------------------------//
   			//Click on Add icon
   			click_element(driver,"id","ImgAddVeteran");
   			Thread.sleep(3000);
   			
   			//Click on Save button
   			click_element(driver,"id","btnSaveVeteranStatus");
   			Thread.sleep(3000);
   			
   			// Alert for Veteran Status 
   		    Alert alert = driver.switchTo().alert();   
   		    String Alert = alert.getText();
   		    System.out.print(Alert);
   		    alert.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(3000);
   			
   		    //Click on Veteran Status 
   			sendkeys(driver,"id","txtVeteranStatus","B1");
   			Thread.sleep(3000);
   			
   			//Click on Save button
   			click_element(driver,"id","btnSaveVeteranStatus");
   			Thread.sleep(3000);
   					
   			// Alert for Veteran Status Added Successfully
   		    Alert alert1 = driver.switchTo().alert();   
   		    String Alert1 = alert1.getText();
   		    System.out.print(Alert1);
   		    alert1.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(3000);


   	       
   	       //--------------------------------------Edit Union Book--------------------------------------//
   	        //Click on Union Book
   	  		sendkeys(driver,"id","ctl00_MainContent_Tabs_TabVeteranStatus_txtVeteranStatusFilter","B1");
   	  		Thread.sleep(2000);
   	      
   	   	    //Click on Search icon
   	  		click_element(driver,"id","ctl00_MainContent_Tabs_TabVeteranStatus_btnFilterVeteran");
   	  		Thread.sleep(5000);
   	      
   	  	    //Click on Edit icon
   	  	    click_element(driver,"id","ctl00_MainContent_Tabs_TabVeteranStatus_gvVeteranStatus_ctl02_Edit");
   	  	    Thread.sleep(3000);
   	      
   	  		//Clear Veteran Status 
   	  		clear_element(driver,"id","txtVeteranStatus");
   	  		Thread.sleep(3000);
   	     	//Click on Union
   	  		sendkeys(driver,"id","txtVeteranStatus","B2");
   	  		Thread.sleep(3000);
   	  		
   	    	//Click on Save button
   	  		click_element(driver,"id","btnSaveVeteranStatus");
   	  		Thread.sleep(3000);
   	      
   	  	    // Alert for Editing Veteran Status Successfully
   		    Alert alert2 = driver.switchTo().alert();   
   		    String Alert2 = alert2.getText();
   		    System.out.print(Alert2);
   		    alert2.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(3000);
   		    
   		    //--------------------------------------Delete Union Book--------------------------------------//
   		    
   		    //Clear Union Book
   		    clear_element(driver,"id","ctl00_MainContent_Tabs_TabVeteranStatus_txtVeteranStatusFilter");
   		    Thread.sleep(3000);
   	  		sendkeys(driver,"id","ctl00_MainContent_Tabs_TabVeteranStatus_txtVeteranStatusFilter","B2");
   	  		Thread.sleep(2000);
   	      
   	   	    //Click on Search icon
   	  		click_element(driver,"id","ctl00_MainContent_Tabs_TabVeteranStatus_btnFilterVeteran");
   	  		Thread.sleep(5000);
   	  		
   		   //Click on Delete
   	       	click_element(driver,"id","ctl00_MainContent_Tabs_TabVeteranStatus_gvVeteranStatus_ctl02_ImgDelete");
   	       	Thread.sleep(3000);
   	       
   	        // Alert for Delete Confirmation
   		    Alert alert3 = driver.switchTo().alert();   
   		    String Alert3 = alert3.getText();
   		    System.out.print(Alert3);
   		    alert3.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(3000);
   		    
   		    // Alert for Union Deleted Successfully
   		    Alert alert4 = driver.switchTo().alert();   
   		    String Alert4 = alert4.getText();
   		    System.out.print(Alert4);
   		    alert4.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(3000);
   	       

   	}
       
   	     
       

}
