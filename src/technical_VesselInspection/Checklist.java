package technical_VesselInspection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class Checklist extends RW {
	
	     //-------------------------------------------------- "Report Init."--------------------------------------------------------------------//
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
   
  //------------------------------------------"Inspection Checklist Index "-------------------------------------------------------------------------------------------------//
	                 public void checklistindex(WebDriver driver1) throws Exception{
		                                 WebDriver driver= driver1;
	          
	            
	            
	          // Select "Technical" Module  
		
			WebElement technical = driver.findElement(By.linkText("Technical")); 
		    Actions action = new Actions(driver);
		    action.moveToElement(technical).build().perform();
		   // action.moveToElement(technical).perform();
		    Thread.sleep(2000);
		    
		    //Select "Vessel Inspection" Submenu
		    WebElement vesselinspection = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[7]/a/span"));
		    //vesselinspection.click();
		    action.moveToElement(vesselinspection).build().perform();
		    Thread.sleep(2000);
		    
		    // Select "Checklist"
		    WebElement Checklist = driver.findElement(By.linkText("Checklist"));
		    Checklist.click();
		    Thread.sleep(5000);
		    
		    //clear filter
		    click_element(driver,"xpath",data.getData(4, 410, 2));
		    Thread.sleep(3000);
		    
		    // Select "Vessel Type" Dropdown
		    dropdown(driver,"id",data.getData(4, 402, 2),data.getData(4, 403, 2));
		    Thread.sleep(3000);
		    
		   // Select "checklist filter" Dropdown
		    dropdown(driver,"xpath",data.getData(4, 404, 2),data.getData(4, 405, 2));
		    Thread.sleep(3000);
		    
		   // Select "Checklist Name" Dropdown
		    dropdown(driver,"xpath",data.getData(4, 406, 2),data.getData(4, 407, 2));
		    Thread.sleep(3000);
		    
		    //"Search Button"
		    click_element(driver, "xpath", data.getData(4, 408, 2));
    	    Thread.sleep(3000);
    	    
    	    //click on "edit"
    	    click_element(driver, "xpath", data.getData(4, 409, 2));
    	    Thread.sleep(3000);
	                 }}
    	 
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    

