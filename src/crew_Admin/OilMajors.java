package crew_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class OilMajors extends RW {
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
	
	
       public void OilMajorIndex(WebDriver driver1) throws Exception{
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
		
		//Click on Oil Majors
		driver.findElement(By.linkText("Oil Majors")).click(); 
		Thread.sleep(3000);
		
	//--------------------------------------Add Oil majors-----------------------------------//
		//Click on Add icon
		click_element(driver,"id","ImgAdd");
		Thread.sleep(3000);
		
		//Click on Save button
		click_element(driver,"id","btnsave");
		Thread.sleep(3000);
		
		// Alert for Oil Major Name 
	    Alert alert = driver.switchTo().alert();   
	    String Alert = alert.getText();
	    System.out.print(Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
		
	    //Click on Oil Major Name
		sendkeys(driver,"id","txtOilMajorName","Tester");
		Thread.sleep(3000);
		
		//Click on Display Name
	    sendkeys(driver,"id","txtDisplayName","Test");
		Thread.sleep(3000);
		
		//Click on Remarks
	    sendkeys(driver,"id","cke_ctl00_MainContent_txtRemarks","Automation");
		Thread.sleep(3000);
		
	    //Upload Image	
		
		//Click on Browse and give Image Path
	    sendkeys(driver,"id","ctl00_MainContent_FileUpload1","C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg");
		Thread.sleep(3000);
		
		//Click on Save
		click_element(driver,"id","btnsave");
	    Thread.sleep(3000);
	    
	   // Alert for successful Addition
	    Alert alert3 = driver.switchTo().alert();   
	    String Alert3 = alert3.getText();
	    System.out.print(Alert3);
	    alert3.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    
	 }
       
     //--------------------------------------Edit Oil Major--------------------------------------//  
       
       public void OilMajorEdit(WebDriver driver1) throws Exception{
   		WebDriver driver = driver1;    
       
      	//Click on Oil Major 
   		sendkeys(driver,"id","ctl00_MainContent_txtfilter","Tester");
   		Thread.sleep(3000);
       
    	//Click on Search icon
   		click_element(driver,"id","ctl00_MainContent_btnFilter");
   		Thread.sleep(3000);
       
   	    //Click on Edit icon
   	    click_element(driver,"id","ctl00_MainContent_gvOilMajors_ctl02_Edit");
   	    Thread.sleep(3000);
       
   	    //Click on Oil Major Name
   		sendkeys(driver,"id","txtOilMajorName","2");
   		Thread.sleep(3000);
       
   	    //Click on Save
   		click_element(driver,"id","btnsave");
   		Thread.sleep(3000);
       
   	   // Alert for successful Updation 
	    Alert alert1 = driver.switchTo().alert();   
	    String Alert1 = alert1.getText();
	    System.out.print(Alert1);
	    alert1.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
       }
       
       
//--------------------------------------Delete Oil Major--------------------------------------//  
       
   	   public void OilMajorDelete(WebDriver driver1) throws Exception{
      		WebDriver driver = driver1;  
       
   		//Clear Oil Major field
      	clear_element(driver,"id","ctl00_MainContent_txtfilter");
       	Thread.sleep(3000);
        //Click on Oil Major field 
   		sendkeys(driver,"id","ctl00_MainContent_txtfilter","Tester2");
   		Thread.sleep(3000);
       
   	    //Click on Search icon
   		click_element(driver,"id","ctl00_MainContent_btnFilter");
   		Thread.sleep(3000);
       
   	    //Click on Delete icon
   	    click_element(driver,"id","ctl00_MainContent_gvOilMajors_ctl06_ImgDelete");
   	    Thread.sleep(3000);
   	    
   	   // Alert for Delete Confirmation
	    Alert alert2 = driver.switchTo().alert();   
	    String Alert2 = alert2.getText();
	    System.out.print(Alert2);
	    alert2.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
       
   	   }
}  
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    






























