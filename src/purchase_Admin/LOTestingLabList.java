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

public class LOTestingLabList extends RW{

	 
	 
	/*Technical
	PMS
	CopyRunHour*/
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

	public void LubeOilTestingLabs(WebDriver driver1) throws InterruptedException {  //(priority=0)

		WebDriver driver = driver1;
		

	     driver.get("http://192.168.1.102/JIBE/Operations/LOAnalysis/LOTestingLabs.aspx");      
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Lube Oil Testing Labs ".trim();
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
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement LOtesting = driver.findElement(By.linkText(data.getData(5,4,2))); // path for LO Testing Lab List
		LOtesting.click();    	
		Thread.sleep(3000);
	*/
	}
	
	public void AddNewLab(WebDriver driver1) throws Exception {  //(priority=1)

		WebDriver driver = driver1;
	
		click_element(driver, "id",(data.getData(5,5,2))); //Click on AddNewLab
		Thread.sleep(1000);
		
		click_element(driver, "xpath",(data.getData( 5, 9, 2))); //Click on Save
		Thread.sleep(2000);
		

		//Alert handling for Please Enter Lab Name.
		 Alert alert = driver.switchTo().alert();            //Alert handling for Please Enter Lab Name.
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
		
		
		clear_element(driver, "id",(data.getData(5,6,2)));// Clear Lab Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,7,2)), (data.getData(5,8,2))); //Sendkeys for Lab Name-->PracticalLab
		Thread.sleep(1000);
		
		click_element(driver, "xpath",(data.getData( 5, 9, 2))); //Click on Save
		Thread.sleep(5000);
		

		//Alert handling for Please select country
		 Alert alert1 = driver.switchTo().alert();            //Alert handling for Please select country
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     Thread.sleep(2000);
		
		dropdown(driver, "id", (data.getData( 5, 10, 2)),(data.getData( 5, 11, 2)));// Dropdown -->Country -->
		Thread.sleep(1000);
						
		sendkeys(driver,"id", (data.getData(5,12,2)), (data.getData(5,13,2))); //Sendkeys for Address-->Belapur
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,14,2)), (data.getData(5,15,2))); //Sendkeys for EMail-->pritigaikar@gmail.com
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,16,2)), (data.getData(5,17,2))); //Sendkeys for Phone-->7856475886
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,18,2))); //Click on Save
		Thread.sleep(5000);
		
		click_element(driver, "id",(data.getData(5,19,2))); //Click on Refresh
		Thread.sleep(2000);
		
		//-------------------Verifing Add New Lab-----------//
		
		dropdown(driver, "id", "ctl00_MainContent_ddlSearchCountry",(data.getData(5,21,2)));// Dropdown -->Country -->INDIA
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,22,2))); //Click on Search
		Thread.sleep(2000);
		
		
	}
	/*
	public void AddExistingLab(WebDriver driver1) throws Exception {  //(priority=2)

		WebDriver driver = driver1;
		

		click_element(driver, "id",(data.getData(5,19,2))); //Click on Refresh
		Thread.sleep(2000);
		

		click_element(driver, "id",(data.getData(5,5,2))); //Click on AddNewLab
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,7,2)), (data.getData(5,8,2))); //Sendkeys for Lab Name-->PracticalLab
		Thread.sleep(1000);
		
		dropdown(driver, "id", (data.getData( 5, 10, 2)),(data.getData( 5, 11, 2)));// Dropdown -->Country -->
		Thread.sleep(1000);
						
		sendkeys(driver,"id", (data.getData(5,12,2)), (data.getData(5,13,2))); //Sendkeys for Address-->Belapur
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,14,2)), (data.getData(5,15,2))); //Sendkeys for EMail-->pritigaikar@gmail.com
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,16,2)), (data.getData(5,17,2))); //Sendkeys for Phone-->7856475886
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,18,2))); //Click on Save
		Thread.sleep(5000);
		

		//Alert handling for delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     
	     click_element(driver, "id","closePopupbutton"); //Click on close button
		 Thread.sleep(5000);
			
	}	*/
	public void EditLab(WebDriver driver1) throws Exception {  //(priority=3)

		WebDriver driver = driver1;
		
		click_element(driver, "id",(data.getData(5,23,2))); //Click on Edit
		Thread.sleep(2000);
		
		clear_element(driver, "id", (data.getData(5,24,2)));// Clear Address
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,25,2)), (data.getData(5,26,2))); //Sendkeys forAddress
		Thread.sleep(1000);
		

		dropdown(driver, "id", "ctl00_MainContent_ddlAddCountry","ICELAND");// Dropdown -->Country -->ICELAND
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,27,2))); //Click on Save
		Thread.sleep(1000);
		
		
		//-------------------Verifing Edited New Lab-----------//
		
		click_element(driver, "id",(data.getData(5,19,2))); //Click on Refresh
		Thread.sleep(2000);
		
		dropdown(driver, "id", (data.getData(5,20,2)),"ICELAND");// Dropdown -->Country -->ICELAND
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,22,2))); //Click on Search
		Thread.sleep(2000);
	}	
	
		public void DeleteLab(WebDriver driver1) throws Exception {  //(priority=4)

			WebDriver driver = driver1;
		
		click_element(driver, "id",(data.getData(5,28,2))); //Click on Delete
		Thread.sleep(2000);
		
		//Alert handling for delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	    
	     //-------------------Verifing Delete Lab-----------//
			
			click_element(driver, "id",(data.getData(5,19,2))); //Click on Refresh
			Thread.sleep(2000);
			
			dropdown(driver, "id", (data.getData(5,20,2)),"ICELAND");// Dropdown -->Country -->ICELAND
			Thread.sleep(1000);
			
			click_element(driver, "id",(data.getData(5,22,2))); //Click on Search
			Thread.sleep(2000);
	     
			String Record = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_GridView_Labs']/tbody/tr/td")).getText(); // Record
		    Thread.sleep(1000);	
		    
		    System.out.println(""+ Record);
		    Thread.sleep(1000);
	     
		click_element(driver, "id",(data.getData(5,29,2))); //Click on Refresh
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,30,2))); //Click on Export to Excel
		Thread.sleep(2000);
	}	
}