package technical_PMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;


public class CopyRunHour extends RW{

	 
	 
	/*Technical
	PMS
	CopyRunHour*/
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

	public void CopyRunHrs(WebDriver driver1) throws InterruptedException {  //(priority=15)

		WebDriver driver = driver1;
		
		
		
		
		WebElement technical = driver.findElement(By.linkText("Technical")); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		
		Thread.sleep(2000);

		WebElement PMS = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[2]/a/span"));// path for PMS
																					
		//PMS.click();
		
		action.moveToElement(PMS).build().perform();
		Thread.sleep(3000);

		WebElement CopyRunHour = driver.findElement(By.linkText("Copy Run Hour")); // path for Copy Run Hour
		CopyRunHour.click();
    	
		Thread.sleep(3000);
		
	}
	
	
	public void FleetB(WebDriver driver1) throws Exception {  //(priority=16)

		WebDriver driver = driver1;
	  
		dropdown(driver, "id", (data.getData(4, 929, 2)),(data.getData(4, 930, 2)));            //Fleet Fleet-B drowpdown
		Thread.sleep(3000);
		
		
		dropdown(driver, "id", (data.getData(4, 931, 2)),(data.getData(4, 932, 2)));      //Vessel "HARUKA" Dropdown
		Thread.sleep(5000);
		
		
		
		click_element(driver,"xpath", (data.getData(4, 933, 2)));      // Click on Add System#1
		Thread.sleep(3000);
		
		
		sendkeys( driver, "id", (data.getData(4, 934, 2)),(data.getData(4, 935, 2)));  //path for search Test#1 
		Thread.sleep(3000);
	
		
		
		click_element(driver,"id", (data.getData(4, 936, 2)));      // Click on Search button
		Thread.sleep(3000);
    
		checkbox_element(driver, "id", (data.getData(4, 937, 2)));         //Click on CheckBox
		Thread.sleep(3000);
	
		
		
		click_element(driver,"id", (data.getData(4, 938, 2)));      // Click on save button
		Thread.sleep(3000);
		
		

		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Equipment run hour settings saved successfully
	     String Alert = alert.getText();
	     System.out.println("Alert msg for Equipment run hour settings saved successfully:"+Alert);
	     alert.accept();
	
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
		
	     
	     
	     sendkeys( driver, "id", (data.getData(4, 939, 2)), (data.getData(4, 940, 2)));  //path for search Test LIfe Boat-2#1 
			Thread.sleep(3000);
		
			
			click_element(driver,"id", (data.getData(4, 941, 2)));      // Click on Search button
			Thread.sleep(3000);
			
			
			checkbox_element(driver, "id", (data.getData(4, 942, 2)));         //Click on CheckBox
			Thread.sleep(3000);
		
			
			
			click_element(driver,"id", (data.getData(4, 943, 2)));      // Click on save button
			Thread.sleep(3000);
		
			

			 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Equipment run hour settings saved successfully
		     String Alert1 = alert1.getText();
		     System.out.println("Alert msg for Equipment run hour settings saved successfully:"+Alert1);
		     alert1.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(4000);
		   
			
}
	public void Source(WebDriver driver1) throws Exception {  //(priority=17)

		WebDriver driver = driver1;
		
		click_element(driver,"xpath", (data.getData(4, 944, 2)));      // Click on  Alarm System A#1
		Thread.sleep(3000);
		
		
		sendkeys( driver, "id", (data.getData(4, 945, 2)), (data.getData(4, 946, 2)));  //path for search Test Pump#1 
		Thread.sleep(3000);
		
		
		click_element(driver,"id", (data.getData(4, 947, 2)));      // Click on Search button
		Thread.sleep(3000);
	
		
		
		click_element(driver,"id", (data.getData(4, 948, 2)));      // Click on save button
		Thread.sleep(3000);
	

		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Unable to save data.
	     String Alert = alert.getText();
	     System.out.println("Alert msg for Unable to save data.:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	     Thread.sleep(4000);
		
	     checkbox_element(driver, "id", (data.getData(4, 949, 2)));         //Click on CheckBox
			Thread.sleep(3000);
		
	    

			click_element(driver,"id", (data.getData(4, 950, 2)));      // Click on save button
			Thread.sleep(3000);
		
			
			 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Equipment run hour settings saved successfully
		     String Alert1 = alert1.getText();
		     System.out.println("Alert msg for Equipment run hour settings saved successfully:"+Alert1);
		     alert1.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		     Thread.sleep(4000);
		 
	
	
	}
	
	//Fleet -office ,Demo Vessel-7
	
	
	
	 public void FleetOffice(WebDriver driver1) throws Exception {    //(priority=18)
		 WebDriver driver = driver1;
	
		   dropdown(driver, "id", (data.getData(4, 951, 2)),(data.getData(4, 952, 2)));            //Fleet Fleet-Office drowpdown
		   Thread.sleep(3000);
		 
		
		   dropdown(driver, "id", (data.getData(4, 953, 2)),(data.getData(4, 954, 2)));      //Vessel "Demo Vessel -7" Dropdown
		  Thread.sleep(5000);	
	
		
		  Alert alert = driver.switchTo().alert();                                         //Alert handling for No data available
		     String Alert = alert.getText();
		     System.out.println("Alert msg for No data available:"+Alert);
		     alert.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		     Thread.sleep(4000);
		 
							
	}
	 
	 //TestFleet

	 public void TestFleet(WebDriver driver1) throws Exception {   //(priority=19)
		 WebDriver driver = driver1;
		
		
		   dropdown(driver, "id",(data.getData(4, 955, 2)),(data.getData(4, 956, 2)));            //Fleet Test_fleet drowpdown
		   Thread.sleep(3000);
		 
		
		   dropdown(driver, "id", (data.getData(4, 957, 2)),(data.getData(4, 958, 2)));      //Vessel "Demo Vessel -7" Dropdown
		  Thread.sleep(5000);
		
	      System .out.println("No Data Available TestFleet");
	 
	 }	 
	 
	
		 
		//test_fleet1

		 public void test_fleet1(WebDriver driver1) throws Exception {  //(priority=20)
			 WebDriver driver = driver1;
			
			
			   dropdown(driver, "id", (data.getData(4, 959, 2)),(data.getData(4, 960, 2)));            //Fleet test_fleet1 drowpdown
			   Thread.sleep(3000);
		
			   
			   dropdown(driver, "id", (data.getData(4, 961, 2)),(data.getData(4, 962, 2)));      //Vessel "--SELECT ALL-- Dropdown
			  Thread.sleep(5000);
		
		      System .out.println("No Data Available on test_fleet1");
		
 }	 

		
		//test_fleet2

		 public void test_fleet2(WebDriver driver1) throws Exception {   //(priority=21)
			 WebDriver driver = driver1;
			
			
			   dropdown(driver, "id", (data.getData(4, 963, 2)),(data.getData(4, 964, 2)));            //Fleet test_fleet2 drowpdown
			   Thread.sleep(3000);
			
			   dropdown(driver, "id",(data.getData(4, 965, 2)),(data.getData(4, 966, 2)));      //Vessel "--SELECT ALL--Demo Vessel -7" Dropdown
			  Thread.sleep(5000);
			
		     System .out.println("No Data Available on test_fleet2");
		
		 }	 
		   
		
}