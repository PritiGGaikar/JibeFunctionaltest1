package operation_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class PiracyAlarmSettings extends RW {
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
	
	
       public void PiracyAlarmIndex(WebDriver driver1) throws Exception{
		WebDriver driver = driver1; 
	     
	   
	    //Click on Operation
		WebElement Operation = driver.findElement(By.linkText(data.getData(7, 34, 2)));  
		Actions action = new Actions(driver);
		action.moveToElement(Operation).build().perform();
		Thread.sleep(2000);
		
		//Click on Admin
		WebElement Admin = driver.findElement(By.xpath(data.getData(7, 35, 2)));   
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);
		
		 //Click on Water In Hold/Tank
		driver.findElement(By.linkText(data.getData(7, 36, 2))).click(); 
		Thread.sleep(3000);
		
	//--------------------------------------Alarm Status-----------------------------------//
		
		//Click on Alarm Status for AGNI
		click_element(driver,"xpath",data.getData(7, 37, 2));
		Thread.sleep(3000);
		
		//Click on "Reasons for Status Change"
		sendkeys(driver,"id",data.getData(7, 38, 2),data.getData(7, 39, 2));
		Thread.sleep(3000);
		
		//Click on New Status
		click_element(driver,"id",data.getData(7, 40, 2));
		Thread.sleep(3000);
		
		//Click on Save
		click_element(driver,"id",data.getData(7, 41, 2));
		Thread.sleep(3000);
		
		

}
}
