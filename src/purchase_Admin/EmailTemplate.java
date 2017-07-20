package purchase_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class EmailTemplate extends RW{

	 
	
	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	report = new ExtentReports(path.concat("Report\\Purchase_Admin_Report.html"));
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}

	public void EmailTemplat(WebDriver driver1) throws InterruptedException {  //(priority=19)

		WebDriver driver = driver1;
		

	     driver.get("http://192.168.1.102/JIBE/Purchase/Purchase_EmailTemplate.aspx");      //Purchase-->Admin-->Email Template 
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Email Template ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
		
		/*
		WebElement technical = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																				
		Admin.click();		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement EmailTemplate  = driver.findElement(By.linkText(data.getData(5,154,2))); // path for EmailTemplate
		EmailTemplate.click();    	
		Thread.sleep(3000);*/
		
	}

	public void AddEmailTemplate(WebDriver driver1) throws Exception {  //(priority=0)

		WebDriver driver = driver1;
		
        //Window handle for Done Date
        String handleBefore = driver.getWindowHandle();       // Parent window

		click_element(driver, "id",(data.getData(5,155,2))); //Click on AddNewEmail Template
		Thread.sleep(2000);
							
	           
        for (String handle : driver.getWindowHandles()) {          //Switch to new window             	        	            	
        driver.switchTo().window(handle);}
        
        dropdown(driver, "id", (data.getData(5,156,2)),(data.getData(5,157,2)));// Dropdown -->Email Type -->RFQ Email Template
		Thread.sleep(1000);	
		
		clear_element(driver, "id", (data.getData(5,158,2)));// Clear Email Subject
		Thread.sleep(1000);
               
		sendkeys(driver,"id", (data.getData(5,159,2)), (data.getData(5,160,2))); //Sendkeys for Email Subject 
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,161,2))); //Click on Save
		Thread.sleep(2000);
		
		
		//Alert handling for Email Body is mandatory field
		 Alert alert = driver.switchTo().alert();            //Alert handling for Email Body is mandatory field
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
		/*clear_element(driver, "id", "cke_ctl00_MainContent_txtemailbody");// Clear Email Body
		Thread.sleep(1000);
				
		sendkeys(driver,"id", "cke_ctl00_MainContent_txtemailbody", ", I request you to grant me leave from 10/05/2017 .Kindly accept my request and approve my leave application.  ");       //Sendkeys for Email Body
		Thread.sleep(1000);
				
		click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
		Thread.sleep(2000);
		*/
        driver.switchTo().window(handleBefore);
        Thread.sleep(2000);
        
		
		click_element(driver, "id",(data.getData(5,162,2))); //Click on Refresh
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,163,2))); //Click on Export to Excel
		Thread.sleep(2000);

		
	}
}
