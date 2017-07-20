package quality_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class FBMReadAccess extends RW{

	 

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

	public void FBMReadAcces(WebDriver driver1) throws InterruptedException {  //(priority=2)

		WebDriver driver = driver1;
		
		WebElement technical = driver.findElement(By.linkText(data.getData(6, 2, 2))); // pathfor "Quality"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(6, 3, 2)));// path for Admin																				
		Admin.click();		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement ApprovalSetting  = driver.findElement(By.linkText(data.getData(6, 15, 2))); // path for FormTypeLibrary
		ApprovalSetting.click();    	
		Thread.sleep(3000);
		
	}

	public void Assignment(WebDriver driver1) throws Exception {  //(priority=3)

		WebDriver driver = driver1;
			
		click_element(driver, "id",(data.getData(6, 16, 2))); //Click on Delete
		Thread.sleep(2000);
		
		//Alert handling for Delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for Delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	     checkbox_element(driver, "id",(data.getData(6, 17, 2))); //Click on Read Access Checkbox
		 Thread.sleep(2000);
		
		dropdown(driver, "id",(data.getData(6, 18, 2)),(data.getData(6, 19, 2)));// Dropdown -->Rank -->MST
		Thread.sleep(1000);
		
		dropdown(driver, "id", (data.getData(6, 20, 2)),(data.getData(6, 21, 2)));// Dropdown -->Category -->Security
		Thread.sleep(1000);
		
		clear_element(driver, "id",(data.getData(6, 22, 2))); //Clear Search
		Thread.sleep(2000);	
			
		sendkeys(driver,"id", (data.getData(6, 23, 2)), (data.getData(6, 24, 2))); //Sendkeys for Search
		Thread.sleep(1000); 
		
		click_element(driver, "id",(data.getData(6, 25, 2))); //Click on Search
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(6, 26, 2))); //Click on Clear Filter
		Thread.sleep(2000);
	
		click_element(driver, "id",(data.getData(6, 27, 2))); //Click on Export to excel
		Thread.sleep(2000);
}
}