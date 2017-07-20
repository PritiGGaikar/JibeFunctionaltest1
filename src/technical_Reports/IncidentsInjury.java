package technical_Reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;


public class IncidentsInjury extends RW{
	private static ExtentReports report;

	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
		if (report == null) {
	        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
    }

    
    public void IncidentsInjuryIndex(WebDriver driver1) throws Exception{
		WebDriver driver= driver1;
		
	      
          // Select "Technical" Module  
	
		WebElement technical = driver.findElement(By.linkText("Technical")); 
	    Actions action = new Actions(driver);
	    action.moveToElement(technical).build().perform();
	    action.moveToElement(technical).perform();
	    Thread.sleep(3000);
	    
	    //Select "Reports" Submenu
	    WebElement vesselinspection = driver.findElement(By.linkText("Reports"));
	    vesselinspection.click();
	    action.moveToElement(vesselinspection).build().perform();
	    Thread.sleep(3000);
	    
	    // Select "Incidents with Injury"
	    WebElement ChecklistCreation = driver.findElement(By.linkText("Incidents with Injury"));
	    ChecklistCreation.click();
	    Thread.sleep(3000);
	    
	   // select "Vessel Name" dropdown checkbox
	     driver.findElement(By.xpath(data.getData(4, 1040, 2))).click(); //xpath of dropdown arrow
	     Thread.sleep(2000);
	     driver.findElement(By.xpath(data.getData(4, 1041, 2))).click();//xpath of ALL
	     Thread.sleep(4000);
	     
	    
	     
	     driver.findElement(By.xpath(data.getData(4, 1042, 2))).click(); //xpath of dropdown arrow
	     Thread.sleep(3000);
	     
	   //Alert For "Atleast 1 vessel should be selected"      
	     Alert alert = driver.switchTo().alert();   
	     String Alert = alert.getText();
	     System.out.print(Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(3000);
	     
	     
	     driver.findElement(By.xpath(data.getData(4, 1043, 2))).click(); //xpath of dropdown arrow
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath(data.getData(4, 1044, 2))).click();//xpath of Demo Vessel-7
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(data.getData(4, 1045, 2))).click();//xpath of HARUKA
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(data.getData(4, 1046, 2))).click();//xpath of Demo Vessel-6
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath(data.getData(4, 1047, 2))).click(); //xpath of dropdown arrow
	     Thread.sleep(6000);
	     
	    
    }

}
