package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class Schools extends RW {

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
	
	
       public void SchoolAdd(WebDriver driver1) throws Exception{
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
		
		//Click on Schools
		driver.findElement(By.linkText("Schools")).click(); 
		Thread.sleep(3000);
		
	//--------------------------------------Add Union-----------------------------------//
		//Click on Add icon
		click_element(driver,"id","ImgAdd");
		Thread.sleep(1000);
		
		//Click on Save button
		click_element(driver,"id","btnsave");
		Thread.sleep(2000);
		
		// Alert for Add School
		
	    Alert alert = driver.switchTo().alert();   
	    String Alert = alert.getText();
	    System.out.print(Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(1000);
		
	    //Click on School
		sendkeys(driver,"id","txtSchool","I.E.S");
		Thread.sleep(1000);
		
		//Click on Save button
		click_element(driver,"id","btnsave");
		Thread.sleep(2000);
				
		// Alert for School Added Successfully
	    Alert alert1 = driver.switchTo().alert();   
	    String Alert1 = alert1.getText();
	    System.out.print(Alert1);
	    alert1.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(1000);
       }

	    public void SchoolEdit(WebDriver driver1) throws Exception{
			WebDriver driver = driver1; 
       
       //--------------------------------------Edit Union--------------------------------------//
        //Click on School
  		sendkeys(driver,"id","ctl00_MainContent_txtfilter","I.E.S");
  		Thread.sleep(1000);
      
   	    //Click on Search icon
  		click_element(driver,"id","ctl00_MainContent_btnFilter");
  		Thread.sleep(1000);
      
  	    //Click on Edit icon
  	    click_element(driver,"id","ctl00_MainContent_gvSchool_ctl02_Edit");
  	    Thread.sleep(1000);
      
  		//Clear School
  		clear_element(driver,"id","txtSchool");
  		Thread.sleep(1000);
     	//Click on School
  		sendkeys(driver,"id","txtSchool","V.Y.K");
  		Thread.sleep(1000);
  		
    	//Click on Save button
  		click_element(driver,"id","btnsave");
  		Thread.sleep(3000);
      
  	    //Alert for Editing School Successfully
	    Alert alert2 = driver.switchTo().alert();   
	    String Alert2 = alert2.getText();
	    System.out.print(Alert2);
	    alert2.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
	    }
	    public void SchoolDelete(WebDriver driver1) throws Exception{
			WebDriver driver = driver1; 
	    //--------------------------------------Delete Union--------------------------------------//
	    
	    //Clear School
	    clear_element(driver,"id","ctl00_MainContent_txtfilter");
	    Thread.sleep(1000);
  		sendkeys(driver,"id","ctl00_MainContent_txtfilter","V.Y.K");
  		Thread.sleep(1000);
      
   	    //Click on Search icon
  		click_element(driver,"id","ctl00_MainContent_btnFilter");
  		Thread.sleep(1000);
  		
	   //Click on Delete
       	click_element(driver,"id","ctl00_MainContent_gvSchool_ctl02_ImgDelete");
       	Thread.sleep(1000);
       
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
       
      
   		
   		
   		
   		
     


