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

public class PurchaseSettings extends RW{

	 
	
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

	public void PurchaseSetting(WebDriver driver1) throws InterruptedException {  //(priority=22)

		WebDriver driver = driver1;
		
		 driver.get("http://192.168.1.102/JIBE/Purchase/Purc_Config_Settings.aspx");      //Purchase-->Admin-->Purchase Configuration Settings 
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Purchase Configuration Settings ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
		
		/*WebElement technical = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																				
		Admin.click();		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement PurchaseSettings  = driver.findElement(By.linkText(data.getData(5,166,2))); // path for Purchase Settings
		PurchaseSettings.click();    	
		Thread.sleep(3000);
		*/
	}

	public void PerchaseConfiSetting(WebDriver driver1) throws Exception {  //(priority=23)

		WebDriver driver = driver1;
		
		click_element(driver, "id",(data.getData(5,167,2))); //Click on Requsition Type
		Thread.sleep(2000);
		
		checkbox_element(driver,"id",(data.getData(5,168,2)));  //checkbox button Spare
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,169,2))); //Click on Save
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,170,2))); //Click Supplier Type
		Thread.sleep(2000);
		
		checkbox_element(driver,"id", (data.getData(5,171,2)));  //checkbox button owner
		Thread.sleep(2000);
		
		checkbox_element(driver,"id", (data.getData(5,172,2)));  //checkbox button Broker
		Thread.sleep(2000);

		click_element(driver, "id",(data.getData(5,173,2))); //Click on Save
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,174,2))); //Click on Edit
		Thread.sleep(2000);
		

		radioButton(driver,"id", (data.getData(5,175,2)));  //Radio button Owner
		Thread.sleep(2000);
		

		radioButton(driver,"id", (data.getData(5,176,2)));  //Radio button DelvryPort 
		Thread.sleep(2000);
		

		radioButton(driver,"id", (data.getData(5,177,2)));  //Radio button DelvryDate 
		Thread.sleep(2000);
		

		radioButton(driver,"id", (data.getData(5,178,2)));  //Radio button vessel movement Date
		Thread.sleep(2000);
		

		radioButton(driver,"id", (data.getData(5,179,2)));  //Radio button Item Category 
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,180,2))); //Click on Save
		Thread.sleep(2000);
		
		//Alert handling for Mandatory Field Updated Successfully
		 Alert alert = driver.switchTo().alert();            //Alert handling for Mandatory Field Updated Successfully
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	
		
}
	public void PerchaseMandatory(WebDriver driver1) throws Exception {  //(priority=24)

		WebDriver driver = driver1;
		
		click_element(driver, "id",(data.getData(5,181,2))); //Click on Perchase Mandatory Setting
		Thread.sleep(2000);
	
		checkbox_element(driver, "id", (data.getData(5,182,2))); //CheckBox VesselMovement
		Thread.sleep(2000);
		
		checkbox_element(driver, "id", (data.getData(5,183,2))); //CheckBox Delivery Date
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,184,2))); //Click on Update
		Thread.sleep(2000);
		
		  //Alert handling for Mandatory Field Updated Successfully
		 Alert alert = driver.switchTo().alert();            //Alert handling for Mandatory Field Updated Successfully
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	}	
	
	public void CaptureRank(WebDriver driver1) throws Exception {  //(priority=25)

		WebDriver driver = driver1;

		click_element(driver, "id",(data.getData(5,185,2))); //Click on Perchase Mandatory Setting
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,186,2))); //Click on Add Rank
		Thread.sleep(3000);
		
		//Alert handling for Select Rank
		 Alert alert = driver.switchTo().alert();            //Alert handling for Select Rank
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	     dropdown(driver, "id", (data.getData(5,187,2)),(data.getData(5,188,2)));// Dropdown -->Rank  -->2/E
		 Thread.sleep(1000);
		 

		click_element(driver, "id",(data.getData(5,189,2))); //Click on Add Rank
		Thread.sleep(3000);
		
		//Alert handling for Added
		 Alert alert1 = driver.switchTo().alert();            //Alert handling for Added 
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	     click_element(driver, "id",(data.getData(5,190,2))); //Click on Add Rank
		 Thread.sleep(3000);

			//Alert handling for Added
			 Alert alert2 = driver.switchTo().alert();            //Alert handling for Added 
		     String Alert2 = alert1.getText();    	   
		     System.out.println("Alert msg for:"+Alert2);
		     alert2.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(2000);
	}
	public void AutomaticRequisition(WebDriver driver1) throws Exception {  //(priority=26)

		WebDriver driver = driver1;
		
		click_element(driver, "id",(data.getData(5,191,2))); //Click on AutomaticRequisition
		Thread.sleep(2000);
		
		checkbox_element(driver, "id", (data.getData(5,192,2))); //CheckBox Create Automatic
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,193,2))); //Click on Save
		Thread.sleep(3000);
		
		//Alert handling for Purchase Configuration Settings Saved Successfully..
		 Alert alert = driver.switchTo().alert();            
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	
	
	}	
}