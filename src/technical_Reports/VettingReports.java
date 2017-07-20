package technical_Reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class VettingReports extends RW {
	
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

    
    public void VettingReportsIndex(WebDriver driver1) throws Exception{
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
	    
	    // Select "Vetting Reports"
	    WebElement ChecklistCreation = driver.findElement(By.linkText("Vetting Reports"));
	    ChecklistCreation.click();
	    Thread.sleep(6000);
	    
	    
	    
	    
	    
	    
        // Select Fleet
	
		WebElement Fleet = driver.findElement(By.xpath(".//*[@id='dropdownlistContentjqxFleet']/span")); 
	    Actions action1 = new Actions(driver);
	    action1.moveToElement(Fleet).build().perform();
	    action1.moveToElement(Fleet).perform();
	    Thread.sleep(3000);
	    
	    //Select "Reports" Submenu
	    WebElement All = driver.findElement(By.xpath(".//*[@id='listitem0innerListBoxjqxFleet']/span"));
	     All.click();
	    action1.moveToElement(All).build().perform();
	    Thread.sleep(3000);
	    
	    // Select "Vetting Reports"
	    WebElement Vessel = driver.findElement(By.xpath(".//*[@id='dropdownlistContentjqxVessel']/span"));
	    Vessel.click();
	    Thread.sleep(6000);
	    
	    /*// select "Fleet" dropdown checkbox
	     driver.findElement(By.linkText("All")).click(); //xpath of dropdown 
	     Thread.sleep(2000);
	     driver.findElement(By.xpath(".//*[@id='listitem0innerListBoxjqxFleet']/span")).click();//xpath of ALL
	     Thread.sleep(4000);
	     
	    
	     
	     driver.findElement(By.linkText("All")).click(); //xpath of dropdown 
	     Thread.sleep(3000);
	     */
	   //Alert For "Atleast 1 vessel should be selected"      
	     Alert alert = driver.switchTo().alert();   
	     String Alert = alert.getText();
	     System.out.print(Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(3000);
	     
	     
	     driver.findElement(By.linkText("All")).click(); //xpath of dropdown 
	     Thread.sleep(3000);
	     
	     
	     driver.findElement(By.xpath(".//*[@id='listitem2innerListBoxjqxFleet']/span")).click();//xpath of Fleet A
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(".//*[@id='listitem3innerListBoxjqxFleet']/span")).click();//xpath of Fleet B
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(".//*[@id='listitem4innerListBoxjqxFleet']/span")).click();//xpath of Fleet C
	     Thread.sleep(3000);
	     
	     driver.findElement(By.cssSelector("#dropdownlistContentjqxFleet>span")).click(); //xpath of dropdown
	     Thread.sleep(6000);
	     
	    
	
	    
	    
	   // select "Vessel Name" dropdown checkbox
	     driver.findElement(By.xpath(".//*[@id='dropdownlistContentjqxVessel']/span")).click(); //xpath of dropdown 
	     Thread.sleep(2000);
	     driver.findElement(By.xpath(".//*[@id='listitem0innerListBoxjqxVessel']/span")).click();//xpath of ALL
	     Thread.sleep(4000);
	     
	    
	     
	     driver.findElement(By.xpath(".//*[@id='dropdownlistContentjqxVessel']/span")).click(); //xpath of dropdown 
	     Thread.sleep(3000);
	     
	   //Alert For "Atleast 1 vessel should be selected"      
	     Alert alert1 = driver.switchTo().alert();   
	     String Alert1 = alert1.getText();
	     System.out.print(Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(3000);
	     
	     
	     driver.findElement(By.xpath(".//*[@id='dropdownlistContentjqxVessel']/span")).click(); //xpath of dropdown 
	     Thread.sleep(3000);
	     
	     
	     driver.findElement(By.xpath(".//*[@id='listitem4innerListBoxjqxVessel']/span")).click();//xpath of IMARA
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(".//*[@id='listitem2innerListBoxjqxVessel']/span")).click();//xpath of BALEEN
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(".//*[@id='listitem3innerListBoxjqxVessel']/span")).click();//xpath of HARUKA
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath(".//*[@id='dropdownlistContentjqxVessel']/span")).click(); //xpath of dropdown 
	     Thread.sleep(6000);
	     
	    
    }



}
