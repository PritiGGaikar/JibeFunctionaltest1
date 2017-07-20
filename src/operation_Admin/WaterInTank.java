package operation_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class WaterInTank extends RW {
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
	
	
       public void WaterInTankIndex(WebDriver driver1) throws Exception{
		WebDriver driver = driver1; 
	     
	   
	    //Click on Operation
		WebElement Operation = driver.findElement(By.linkText(data.getData(7, 1, 2)));  
		Actions action = new Actions(driver);
		action.moveToElement(Operation).build().perform();
		Thread.sleep(2000);
		
		//Click on Admin
		WebElement Admin = driver.findElement(By.xpath(data.getData(7, 2, 2)));   
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);
		
		 //Click on Water In Hold/Tank
		driver.findElement(By.linkText(data.getData(7, 3, 2))).click(); 
		Thread.sleep(3000);
		
	//--------------------------------------Add Hold Tank-----------------------------------//

		 // Click on Add icon
	    click_element(driver, "id", data.getData(7, 4, 2));
	   	Thread.sleep(3000);	
	   	
	    // Click on Save 
	    click_element(driver, "id", data.getData(7, 5, 2));
	   	Thread.sleep(3000);	
	   	
	    // Alert for Vessel Name
	    Alert alert = driver.switchTo().alert();   
	    String Alert = alert.getText();
	    System.out.print(Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	     
	     
	     // Click on Vessel Name
		 dropdown(driver, "id", data.getData(7, 6, 2),data.getData(7, 7, 2));
		 Thread.sleep(3000);
		    
		 // Click on Save
		 click_element(driver, "id", data.getData(7, 8, 2));
		 Thread.sleep(3000);	
		 
		// Alert for Hold/Tank Name
		 Alert alert1 = driver.switchTo().alert();   
		 String Alert1 = alert1.getText();
		 System.out.print(Alert1);
		 alert1.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		    
		//Click on Hold/Tank Name
		 sendkeys(driver,"id",data.getData(7, 9, 2),data.getData(7, 10, 2));
		 Thread.sleep(2000);
		 
		 // Click on Save
		 click_element(driver, "id", data.getData(7, 11, 2));
		 Thread.sleep(3000);
		 
		//Alert for Structure Type
		 Alert alert2 = driver.switchTo().alert();   
		 String Alert2 = alert2.getText();
		 System.out.print(Alert2);
		 alert2.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
	   
		 
		// Click on Structure Type
	     dropdown(driver, "id",data.getData(7, 12, 2),data.getData(7, 13, 2));
	     Thread.sleep(3000);
		 
	    // Click on Save
	  	 click_element(driver, "id", data.getData(7, 14, 2));
	  	 Thread.sleep(3000);
       }
		 
    //-------------------------------------Edit Water in Hold/Tank---------------------------------------//
       
       public void WaterInTankEdit(WebDriver driver1) throws Exception{
   		WebDriver driver = driver1; 
   		
	//-------------------------Search------------------//	 
   	   // Click on Vessel
	     dropdown(driver, "id", data.getData(7, 15, 2),data.getData(7, 16, 2));
	     Thread.sleep(3000); 
		
	   // Click on Structure Type
	     dropdown(driver, "id", data.getData(7, 17, 2),data.getData(7, 18, 2));
	     Thread.sleep(3000);
		 
	   //Click on Hold/Tank Name
		 sendkeys(driver,"id",data.getData(7, 19, 2),data.getData(7, 20, 2));
		 Thread.sleep(2000); 
		 
		// Click on Search icon
	  	 click_element(driver, "id", data.getData(7, 21, 2));
	  	 Thread.sleep(3000); 
		
	    // Click on Edit icon
	  	 click_element(driver, "xpath", data.getData(7, 22, 2));
	  	 Thread.sleep(3000);
		
	 	//Clear Hold/Tank Name Field
		 clear_element(driver,"id",data.getData(7, 23, 2));
		 Thread.sleep(2000);
		//Click on Hold/Tank Name
		 sendkeys(driver,"id",data.getData(7, 24, 2),data.getData(7, 25, 2));
		 Thread.sleep(2000);
		 
		 // Click on Save
	  	 click_element(driver, "id", data.getData(7, 26, 2));
	  	 Thread.sleep(3000); 
		 
       }	
            
//-------------------------------------Delete Water in Hold/Tank---------------------------------------//
       
       public void WaterInTankDelete(WebDriver driver1) throws Exception{
   		WebDriver driver = driver1; 
   		
   		
    	//Clear Hold/Tank Name Field
		 clear_element(driver,"id",data.getData(7, 27, 2));
		 Thread.sleep(2000);
		//Click on Hold/Tank Name
		 sendkeys(driver,"id",data.getData(7, 28, 2),data.getData(7, 29, 2));
		 Thread.sleep(2000);
		 
		// Click on Search icon
	  	 click_element(driver, "id", data.getData(7, 30, 2));
	  	 Thread.sleep(4000); 
		
	    // Click on Delete icon
	  	 click_element(driver, "id", data.getData(7, 31, 2));
	  	 Thread.sleep(3000);
		 
	  	//Alert for Confirming Delete
		 Alert alert2 = driver.switchTo().alert();   
		 String Alert2 = alert2.getText();
		 System.out.print(Alert2);
		 alert2.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(3000); 
       
       }  
}
