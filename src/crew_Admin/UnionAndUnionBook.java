package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class UnionAndUnionBook extends RW{

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
	
       public void UnionAndUnionBranch(WebDriver driver1) throws Exception{
		WebDriver driver = driver1; 
	     
	   
	    //Click on Crew
		WebElement Crew = driver.findElement(By.linkText("Crew"));  
		Actions action = new Actions(driver);
		action.moveToElement(Crew).build().perform();
		Thread.sleep(1000);
		
		//Click on Admin
		WebElement Admin = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/a/span"));   
		action.moveToElement(Admin).build().perform();
		Thread.sleep(1000);
		
		//Click on Union And Union Book
		driver.findElement(By.linkText("Union And Union Book")).click(); 
		Thread.sleep(1000);
		
	//--------------------------------------Add Union-----------------------------------//
		//Click on Add icon
		click_element(driver,"id","ImgAdd");
		Thread.sleep(1000);
		
		//Click on Save button
		click_element(driver,"id","btnsave");
		Thread.sleep(3000);
		
		// Alert for Union
	    Alert alert = driver.switchTo().alert();   
	    String Alert = alert.getText();
	    System.out.print(Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
		
	    //Click on Union
		sendkeys(driver,"id","txtUnion","Tester");
		Thread.sleep(1000);
		
		//Click on Save button
		click_element(driver,"id","btnsave");
		Thread.sleep(3000);
				
		// Alert for Union Added Successfully
	    Alert alert1 = driver.switchTo().alert();   
	    String Alert1 = alert1.getText();
	    System.out.print(Alert1);
	    alert1.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);


       
       //--------------------------------------Edit Union--------------------------------------//
        //Click on Union
  		sendkeys(driver,"id","txtfilter","Tester");
  		Thread.sleep(1000);
      
   	    //Click on Search icon
  		click_element(driver,"id","btnFilter");
  		Thread.sleep(1000);
      
  	    //Click on Edit icon
  	    click_element(driver,"id","ctl00_MainContent_TabPanel_tabUnionBranch_gvUnion_ctl02_Edit");
  	    Thread.sleep(1000);
      
  		//Clear Union
  		clear_element(driver,"id","txtUnion");
  		Thread.sleep(1000);
     	//Click on Union
  		sendkeys(driver,"id","txtUnion","Tester1");
  		Thread.sleep(1000);
  		
    	//Click on Save button
  		click_element(driver,"id","btnsave");
  		Thread.sleep(1000);
      
  	    // Alert for Editing Union Successfully
	    Alert alert2 = driver.switchTo().alert();   
	    String Alert2 = alert2.getText();
	    System.out.print(Alert2);
	    alert2.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(1000);
	    
	 
	    //--------------------------------------Delete Union--------------------------------------//
	    
	    //Clear Union
	    clear_element(driver,"id","txtfilter");
	    Thread.sleep(3000);
  		sendkeys(driver,"id","txtfilter","Tester1");
  		Thread.sleep(1000);
      
   	    //Click on Search icon
  		click_element(driver,"id","btnFilter");
  		Thread.sleep(1000);
  		
	   //Click on Delete
       	click_element(driver,"id","ctl00_MainContent_TabPanel_tabUnionBranch_gvUnion_ctl02_ImgDelete");
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
       
       
       public void UnionBook(WebDriver driver1) throws Exception{
   		WebDriver driver = driver1; 
   		
   		    //Click on Union Book
   		    click_element(driver,"xpath",".//*[@id='__tab_ctl00_MainContent_TabPanel_tabUnionBook']");
			Thread.sleep(1000);
   	//--------------------------------------Add Union Book-----------------------------------//
   			//Click on Add icon
   			click_element(driver,"id","ImgBtnAddNewUnionBook");
   			Thread.sleep(1000);
   			
   			//Click on Save button
   			click_element(driver,"id","btnSaveUnionBook");
   			Thread.sleep(1000);
   			
   			// Alert for Union Book 
   		    Alert alert = driver.switchTo().alert();   
   		    String Alert = alert.getText();
   		    System.out.print(Alert);
   		    alert.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(1000);
   			
   		    //Click on Union Book 
   			sendkeys(driver,"id","txtUnionBook","Regression");
   			Thread.sleep(1000);
   			
   			//Click on Save button
   			click_element(driver,"id","btnSaveUnionBook");
   			Thread.sleep(3000);
   					
   			// Alert for Union Book Added Successfully
   		    Alert alert1 = driver.switchTo().alert();   
   		    String Alert1 = alert1.getText();
   		    System.out.print(Alert1);
   		    alert1.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(3000);


   	       
   	       //--------------------------------------Edit Union Book--------------------------------------//
   	        //Click on Union Book
   	  		sendkeys(driver,"id","ctl00_MainContent_TabPanel_tabUnionBook_txtUnionBookFilter","Regression");
   	  		Thread.sleep(1000);
   	      
   	   	    //Click on Search icon
   	  		click_element(driver,"id","ctl00_MainContent_TabPanel_tabUnionBook_ImgBtnFilterUnionBook");
   	  		Thread.sleep(1000);
   	      
   	  	    //Click on Edit icon
   	  	    click_element(driver,"id","ctl00_MainContent_TabPanel_tabUnionBook_gvUnionBook_ctl02_Edit");
   	  	    Thread.sleep(1000);
   	      
   	  		//Clear Union Book
   	  		clear_element(driver,"id","txtUnionBook");
   	  		Thread.sleep(3000);
   	     	//Click on Union
   	  		sendkeys(driver,"id","txtUnionBook","Testing");
   	  		Thread.sleep(1000);
   	  		
   	    	//Click on Save button
   	  		click_element(driver,"id","btnSaveUnionBook");
   	  		Thread.sleep(3000);
   	      
   	  	    // Alert for Editing Union Book Successfully
   		    Alert alert2 = driver.switchTo().alert();   
   		    String Alert2 = alert2.getText();
   		    System.out.print(Alert2);
   		    alert2.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(3000);
   		    
   		    //--------------------------------------Delete Union Book--------------------------------------//
   		    
   		    //Clear Union Book
   		    clear_element(driver,"id","ctl00_MainContent_TabPanel_tabUnionBook_txtUnionBookFilter");
   		    Thread.sleep(3000);
   	  		sendkeys(driver,"id","ctl00_MainContent_TabPanel_tabUnionBook_txtUnionBookFilter","Testing");
   	  		Thread.sleep(1000);
   	      
   	   	    //Click on Search icon
   	  		click_element(driver,"id","ctl00_MainContent_TabPanel_tabUnionBook_ImgBtnFilterUnionBook");
   	  		Thread.sleep(1000);
   	  		
   		   //Click on Delete
   	       	click_element(driver,"id","ctl00_MainContent_TabPanel_tabUnionBook_gvUnionBook_ctl02_ImgDelete");
   	       	Thread.sleep(2000);
   	       
   	        // Alert for Delete Confirmation
   		    Alert alert3 = driver.switchTo().alert();   
   		    String Alert3 = alert3.getText();
   		    System.out.print(Alert3);
   		    alert3.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(2000);
   		    
   		    // Alert for Union Deleted Successfully
   		    Alert alert4 = driver.switchTo().alert();   
   		    String Alert4 = alert4.getText();
   		    System.out.print(Alert4);
   		    alert4.accept();
   		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   		    Thread.sleep(2000);
   	       

   	}
       
   	     
       
}