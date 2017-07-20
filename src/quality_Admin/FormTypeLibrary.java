package quality_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;
public class FormTypeLibrary extends RW{

	 

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

	public void FormTypeLibrarys(WebDriver driver1) throws InterruptedException {  //(priority=0)

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

		WebElement ApprovalSetting  = driver.findElement(By.linkText(data.getData(6, 4, 2))); // path for FormTypeLibrary
		ApprovalSetting.click();    	
		Thread.sleep(3000);
		
	}

	public void FromType(WebDriver driver1) throws Exception {  //(priority=1)

		WebDriver driver = driver1;
		

		click_element(driver, "id",(data.getData(6, 5, 2))); //Click on Save
		Thread.sleep(2000);
		
		
		//Alert handling for Form Type is required.
		 Alert alert = driver.switchTo().alert();            //Alert handling for PForm Type is required.
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		
		
		clear_element(driver, "id",(data.getData(6, 6, 2))); //Clear FormType
		Thread.sleep(2000);	
			
		sendkeys(driver,"id", (data.getData(6, 7, 2)), (data.getData(6, 8, 2))); //Sendkeys for FromTyoe
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(6, 9, 2))); //Click on Save
		Thread.sleep(2000);
		
		
		//Alert handling for Form Type Updated Successfully
		 Alert alert1 = driver.switchTo().alert();            //Alert handling for PForm Type Updated Successfully
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(6, 10, 2))); //Click on Edit
		Thread.sleep(2000);
		
		
		click_element(driver, "id",(data.getData(6, 11, 2))); //Click on Save
		Thread.sleep(2000);
				
		//Alert handling for Form Type Updated Successfully
		 Alert alert11 = driver.switchTo().alert();            //Alert handling for Form Type Updated Successfully
	     String Alert11 = alert11.getText();    	   
	     System.out.println("Alert msg for:"+Alert11);
	     alert11.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	     click_element(driver, "id",(data.getData(6, 12, 2))); //Click on Delete
		 Thread.sleep(2000);
		 
		//Alert handling for Delete
		 Alert alert2 = driver.switchTo().alert();           
	     String Alert2 = alert11.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
}
}