package operation_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ReportsRankConfig extends RW {
	
	private static ExtentReports report;
	  //------------------------------------------------------Report----------------------------------------------------------------------------------//  
	    public synchronized static ExtentReports getReporter(String filePath) { ////allow only one thread to access the shared resource,To prevent thread interference.
	    	if (report == null) {
		        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\OperatiomAdmin.html", false);
		        
		        report
		            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
		            .addSystemInfo("Environment", "QA");
	        }
	        
	        return report;
	    }	
	
       public void RankConfigIndex(WebDriver driver1) throws Exception{
		WebDriver driver = driver1; 
	     
	   
	    //Click on Operation
		WebElement Operations = driver.findElement(By.linkText(data.getData(7, 83, 2)));  
		Actions action = new Actions(driver);
		action.moveToElement(Operations).build().perform();
		Thread.sleep(2000);
		
		//Click on Admin
		WebElement Admin = driver.findElement(By.xpath(data.getData(7, 84, 2)));   
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);
		
		 //Click on Reports-Rank Config.
		driver.findElement(By.xpath(data.getData(7, 85, 2))).click(); 
		Thread.sleep(3000);
		
//------------------------------------------Assign Rank-------------------------------------------//		
		
		//Click on Master
		dropdown(driver,"id",data.getData(7, 86, 2),data.getData(7, 87, 2));
		Thread.sleep(3000);
		
		//Click on Chief Engineer 
		dropdown(driver,"id",data.getData(7, 88, 2),data.getData(7, 89, 2));
	    Thread.sleep(3000);
	    
	    //Click on Chief Officer 
	  	dropdown(driver,"id",data.getData(7, 90, 2),data.getData(7, 91, 2));
	  	Thread.sleep(3000);
	  	
	  	//Click on Save
	  	click_element(driver,"id",data.getData(7, 92, 2));
	  	Thread.sleep(3000);
	  	
	  	//Alert for Adding Data Successfully
	  	Alert alert = driver.switchTo().alert();   
	    String Alert = alert.getText();
	    System.out.print(Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	  	
	  	
	    //Click on Master
	    dropdown(driver,"id",data.getData(7, 93, 2),data.getData(7, 94, 2));
	    Thread.sleep(3000);
	  		
	    //Click on Chief Engineer 
	    dropdown(driver,"id",data.getData(7, 95, 2),data.getData(7, 96, 2));
	  	Thread.sleep(3000);
	  	    
	  	//Click on Chief Officer 
	  	dropdown(driver,"id",data.getData(7, 97, 2),data.getData(7, 98, 2));
	  	Thread.sleep(3000);
	  	  	
	  	//Click on Save
	  	click_element(driver,"id",data.getData(7, 99, 2));
	  	Thread.sleep(3000);
	  	
	    //Alert for Adding Data Successfully
	  	Alert alert1 = driver.switchTo().alert();   
	    String Alert1 = alert1.getText();
	    System.out.print(Alert1);
	    alert1.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
