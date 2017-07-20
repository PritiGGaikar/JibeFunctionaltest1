package operation_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class VslGeneralParameters extends RW{
private static ExtentReports report;
    
    public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
    	if (report == null) {
	        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\OperatiomAdmin.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
        }
        
        return report;
    }	
	
	
       public void VslGeneralIndex(WebDriver driver1) throws Exception{
		WebDriver driver = driver1; 
	     
	   
	    //Click on Operation
		WebElement Operation = driver.findElement(By.linkText(data.getData(7, 44, 2)));  
		Actions action = new Actions(driver);
		action.moveToElement(Operation).build().perform();
		Thread.sleep(2000);
		
		//Click on Admin
		WebElement Admin = driver.findElement(By.xpath(data.getData(7, 45, 2)));   
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);
		
		 //Click on Vsl General Parameters
		driver.findElement(By.linkText(data.getData(7, 46, 2))).click(); 
		Thread.sleep(3000);
		
	//--------------------------------------Add Vessel Parameters-----------------------------------//
		 // Click on Add icon
	    click_element(driver, "id", data.getData(7, 47, 2));
	   	Thread.sleep(3000);	
	   	
	    // Click on Save 
	    click_element(driver, "id", data.getData(7, 48, 2));
	   	Thread.sleep(3000);	
	   	
	    // Alert for Vessel 
	    Alert alert = driver.switchTo().alert();   
	    String Alert = alert.getText();
	    System.out.print(Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	     
	     
	     // Click on Vessel 
		 dropdown(driver, "id", data.getData(7, 49, 2),data.getData(7, 50, 2));
		 Thread.sleep(3000);
		    
		 // Click on Save
		 click_element(driver, "id", data.getData(7, 51, 2));
		 Thread.sleep(3000);	
		 
		// Alert for Propellor Pitch
		 Alert alert1 = driver.switchTo().alert();   
		 String Alert1 = alert1.getText();
		 System.out.print(Alert1);
		 alert1.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		    
		//Click on Propellor Pitch
		 sendkeys(driver,"id",data.getData(7, 52, 2),data.getData(7, 53, 2));
		 Thread.sleep(2000);
		 
		 // Click on Save
		 click_element(driver, "id", data.getData(7, 54, 2));
		 Thread.sleep(3000);
		 
		//Alert for Qmcr 
		 Alert alert2 = driver.switchTo().alert();   
		 String Alert2 = alert2.getText();
		 System.out.print(Alert2);
		 alert2.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
	   
		 
		// Click on Qmcr 
		 sendkeys(driver, "id",data.getData(7, 55, 2),data.getData(7, 56, 2));
	     Thread.sleep(3000);
		 
	    // Click on Save
	  	 click_element(driver, "id", data.getData(7, 57, 2));
	  	 Thread.sleep(3000);
	  	 
	  	 
	  	//Alert for  RPM Max  
		 Alert alert3 = driver.switchTo().alert();   
		 String Alert3 = alert3.getText();
		 System.out.print(Alert3);
		 alert3.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
	   
		 
		// Click on  RPM Max  
		 sendkeys(driver, "id",data.getData(7, 58, 2),data.getData(7, 59, 2));
	     Thread.sleep(3000);
		 
	    // Click on Save
	  	 click_element(driver, "id", data.getData(7, 60, 2));
	  	 Thread.sleep(3000);
	  	 
	  	 
	  	//Alert for  M.E.Rated Power 
		 Alert alert4 = driver.switchTo().alert();   
		 String Alert4 = alert4.getText();
		 System.out.print(Alert4);
		 alert4.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
	   
		 
		// Click on  M.E.Rated Power 
		 sendkeys(driver, "id",data.getData(7, 61, 2),data.getData(7, 62, 2));
	     Thread.sleep(3000);
		 
	    // Click on Save
	  	 click_element(driver, "id", data.getData(7, 63, 2));
	  	 Thread.sleep(3000);
	  	 
	  	//Alert for  MCR Power For Engine Curve
		 Alert alert5 = driver.switchTo().alert();   
		 String Alert5 = alert5.getText();
		 System.out.print(Alert5);
		 alert5.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
	   
		 
		// Click on  MCR Power For Engine Curve
		 sendkeys(driver, "id",data.getData(7, 64, 2),data.getData(7, 65, 2));
	     Thread.sleep(3000);
		 
	    // Click on Save
	  	 click_element(driver, "id", data.getData(7, 66, 2));
	  	 Thread.sleep(3000);
	  	 
	  	//Alert for M.E SFOC 
		 Alert alert6 = driver.switchTo().alert();   
		 String Alert6 = alert6.getText();
		 System.out.print(Alert6);
		 alert6.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
	   
		 
		// Click on M.E SFOC 
		 sendkeys(driver, "id",data.getData(7, 67, 2),data.getData(7, 68, 2));
	     Thread.sleep(3000);
		 
	    // Click on Save
	  	 click_element(driver, "id", data.getData(7, 69, 2));
	  	 Thread.sleep(3000);
	  	 
	  	//Alert for Fuel Dependent/RPM Dependent 
		 Alert alert7 = driver.switchTo().alert();   
		 String Alert7 = alert7.getText();
		 System.out.print(Alert7);
		 alert7.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
	   
		 
		// Click on Fuel Dependent/RPM Dependent
		 sendkeys(driver, "id",data.getData(7, 70, 2),data.getData(7, 71, 2));
	     Thread.sleep(3000);
		 
	    // Click on Save
	  	 click_element(driver, "id", data.getData(7, 72, 2));
	  	 Thread.sleep(3000);
	  	 
       }	 
	  	 
//--------------------------------------------Edit Vessel Parameters------------------------------------------//	  	 
	  	 public void VslGeneralEdit(WebDriver driver1) throws Exception{
	 		WebDriver driver = driver1; 
	 	     

	     // Click on Vessel 
		 dropdown(driver, "id", data.getData(7, 73, 2),data.getData(7, 74, 2));
		 Thread.sleep(3000);
		    
		 // Click on Edit icon
	  	 click_element(driver, "id", data.getData(7, 75, 2));
	  	 Thread.sleep(3000);
	  	 
	     // Clear MCR Power For Engine Curve
	  	 clear_element(driver, "id",data.getData(7, 76, 2));
	  	 Thread.sleep(3000);
	  	 // Click on  MCR Power For Engine Curve
	  	 sendkeys(driver, "id",data.getData(7, 77, 2),data.getData(7, 78, 2));
	  	 Thread.sleep(3000);
	  		 
	     // Click on Save
	  	 click_element(driver, "id", data.getData(7, 79, 2));
	  	 Thread.sleep(3000);
	  	 
	  	//Alert for Editing successfully 
		 Alert alert8 = driver.switchTo().alert();   
		 String Alert8 = alert8.getText();
		 System.out.print(Alert8);
		 alert8.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
	 }
		 
	  	//--------------------------------------------Delete Vessel Parameters------------------------------------------//	
	  	 public void VslGeneralDelete(WebDriver driver1) throws Exception{
		 		WebDriver driver = driver1;
		 		
		 // Click on Delete icon
		 click_element(driver, "id", data.getData(7, 80, 2));
	     Thread.sleep(3000);
	     
	     //Alert for Delete Confirmation
		 Alert alert9 = driver.switchTo().alert();   
		 String Alert9 = alert9.getText();
		 System.out.print(Alert9);
		 alert9.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
		 		
		 		
	  	 }     
}
