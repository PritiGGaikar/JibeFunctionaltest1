package technical_PMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;


public class MachineryRunningHours extends RW {
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
	 public void runninghours(WebDriver driver1) throws Exception{  //(priority=14)
			
			WebDriver driver= driver1;

				  
		          
	//------------------------------------------"System Running Hours"-------------------------------------------------------------------------------------------------//	            
		            
		          // Select "Technical" Module  
			
				WebElement technical = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/a/span")); 
			    Actions action = new Actions(driver);
			    action.moveToElement(technical).build().perform();
			    action.moveToElement(technical).perform();
			
			    Thread.sleep(2000);
			    
			    //Select "PMS" Submenu
			    WebElement PMS = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[2]/a/span"));
			    PMS.click();
			    action.moveToElement(PMS).build().perform();
			
			    Thread.sleep(2000);
			    
			    // Select "Machinery Running Hours"
			    WebElement machineryhours = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[2]/ul/li[11]/a/span"));//path for "worklist index"
			    machineryhours.click();
			
			    Thread.sleep(5000);
			    
			    // Select "Fleet" Dropdown
			    dropdown(driver,"id",data.getData(4, 726, 2),data.getData(4, 727, 2));
		
			    Thread.sleep(3000);
			    
			    //Select "Vessel" Dropdown
			    dropdown(driver,"id",data.getData(4, 728, 2),data.getData(4, 729, 2));
			
			    Thread.sleep(3000);
			    
			    //Select "Function" Dropdown
			    dropdown(driver, "xpath",data.getData(4, 730, 2),data.getData(4, 731, 2));
			 
			    Thread.sleep(3000);
			    
			    //Select "System /Location" dropdown
			    dropdown(driver,"xpath",data.getData(4, 732, 2),data.getData(4, 733, 2));
			
			    Thread.sleep(3000);
			    
			    //Select "Subsystem / Location" dropdown
			    dropdown(driver,"id",data.getData(4, 734, 2),data.getData(4, 735, 2));
			
			    Thread.sleep(3000);
			    
			    //Select "Radio Button"
			    radioButton(driver, "xpath", data.getData(4, 736, 2));
			 
			    Thread.sleep(3000);
			    
			    //Click "Search"
			    click_element(driver, "xpath", data.getData(4, 737, 2));
			 
			    Thread.sleep(3000);
			    
	//----------------------------------------------------- Clear Function-----------------------------------------------------------------------------------------------//
			    
			    click_element(driver, "id", data.getData(4, 738, 2));
			
			    Thread.sleep(3000);
			    
	//---------------------------------------------------"Excel"-------------------------------------------------------------------------------------------------//
			    driver.findElement(By.xpath(data.getData(4, 739, 2))).click();
			
			    Thread.sleep(4000);
			 
	}}
