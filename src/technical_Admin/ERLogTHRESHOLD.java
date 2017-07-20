package technical_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ERLogTHRESHOLD extends RW{

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	 report = new ExtentReports(path.concat("Report\\TechnicalAdmin.html"));
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}
	public void Threshold(WebDriver driver1) throws InterruptedException {         //(priority=7)
		
		

		WebDriver driver = driver1;
		

		   driver.get("http://192.168.1.202/STG_OSG/Technical/PMS/PMS_AlarmUnit.aspx");  //Technical-->Admin--> 	Alarm Unit     
		     Thread.sleep(2000);
		     
		 	String actualTitle = driver.getTitle().trim();
		 	String expectedTitle = " 	Alarm Unit ".trim();
		 	Assert.assertEquals(expectedTitle,actualTitle);
			
		 	if(expectedTitle.equals(actualTitle)){
		 		System.out.println("Title Match");
		 		Thread.sleep(2000);
		 	}	else{
		 		System.out.println("Title does not Match");
		 		Thread.sleep(2000);	
		 		
		 	}
		 	
	/*	WebElement technical = driver.findElement(By.linkText(data.getData(4, 1103, 2))); // pathfor "Technical"s
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		Thread.sleep(2000);
		

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1104, 2)));// path for Admin																					
		Admin.click();
		action.moveToElement(Admin).build().perform();
		

		WebElement AlarmUnit = driver.findElement(By.linkText(data.getData(4, 1105, 2))); // path for ERLog Threshold
		AlarmUnit.click();	
		Thread.sleep(2000);*/
		
	}

	public void CopyThreshold(WebDriver driver1) throws Exception {         //(priority=8)

		WebDriver driver = driver1;
		
	dropdown(driver, "id", data.getData(4, 1106, 2),data.getData(4, 1107, 2));// Dropdown -->CopyThresholdfromVessel-->Fleet-B
	Thread.sleep(1000);
	
	click_element(driver, "id",data.getData(4, 1108, 2)); //Click on Copy Threshold
	Thread.sleep(5000);
	

	//Alert handling for Vessel is not selected
	 Alert alert = driver.switchTo().alert();                                         //Alert handling for Vessel is not selected
     String Alert = alert.getText();    	   
     System.out.println("Alert msg for:"+Alert);
     alert.accept();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     Thread.sleep(2000);
     
 	
 	dropdown(driver, "id", data.getData(4, 1109, 2),data.getData(4, 1110, 2));// Dropdown -->Vessel Name -->IMARA
 	Thread.sleep(1000);
 	
 	click_element(driver, "id",data.getData(4, 1111, 2)); //Click on Copy Threshold
	Thread.sleep(5000);
	

	//Alert handling for Threshold value's are updated.
	 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Threshold value's are updated.
     String Alert1 = alert1.getText();    	   
     System.out.println("Alert msg for:"+Alert1);
     alert1.accept();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     Thread.sleep(2000);
     
    dropdown(driver, "id", "ctl00_MainContent_DDLVersion","ctl00_MainContent_DDLVersion");// Dropdown -->History -->
   	Thread.sleep(1000);
    
   	click_element(driver, "id",data.getData(4, 1126, 2)); //Click on Save
	Thread.sleep(5000);
	
	//Alert handling for Threshold value's are updated.
		 Alert alert4 = driver.switchTo().alert();                                         //Alert handling for Threshold value's are updated.
	     String Alert4 = alert4.getText();    	   
	     System.out.println("Alert msg for:"+Alert4);
	     alert4.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		
	
   	
    dropdown(driver, "id", data.getData(4, 1112, 2),data.getData(4, 1113, 2));// Dropdown -->Vessel Name -->Demo Vessel -7
  	Thread.sleep(1000);
  	
  	clear_element(driver, "id", data.getData(4, 1114, 2));// Clear TEMPERATURE C Min
	Thread.sleep(1000);
	
	sendkeys(driver,"id", data.getData(4, 1115, 2), data.getData(4, 1116, 2)); //Sendkeys for EXHAUST-->Min
	Thread.sleep(1000);
	
	clear_element(driver, "id", data.getData(4, 1117, 2));// Clear TEMPERATURE C Max
	Thread.sleep(1000);
	
	sendkeys(driver,"id",data.getData(4, 1118, 2),data.getData(4, 1119, 2)); //Sendkeys for EXHAUST-->Max
	Thread.sleep(1000);
	
    click_element(driver, "xpath",data.getData(4, 1120, 2)); //Click on Copy Threshold
	Thread.sleep(1000);
		
	checkbox_element(driver, "id",data.getData(4, 1121, 2)); //Checkbox for Email
	Thread.sleep(1000);
	
	
	checkbox_element(driver, "id",data.getData(4, 1122, 2)); //Checkbox for C/E
	Thread.sleep(1000);
	
	checkbox_element(driver, "id",data.getData(4, 1123, 2)); //Checkbox for email
	Thread.sleep(1000);
	
	click_element(driver, "id",data.getData(4, 1124, 2)); //Click on Save
	Thread.sleep(1000);
		
	click_element(driver, "xpath",data.getData(4, 1125, 2)); //Click on CloseButton
	Thread.sleep(1000);
		
	click_element(driver, "id",data.getData(4, 1126, 2)); //Click on Save
	Thread.sleep(1000);
	
	click_element(driver, "id",data.getData(4, 1127, 2)); //Click on Copy Threshold
	Thread.sleep(5000);
	

	//Alert handling for Threshold value's are updated.
	 Alert alert2 = driver.switchTo().alert();                                         //Alert handling for Threshold value's are updated.
     String Alert2 = alert2.getText();    	   
     System.out.println("Alert msg for:"+Alert2);
     alert2.accept();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     Thread.sleep(2000);
	
  	
}
}