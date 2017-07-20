
package technical_PMS;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class JobsHistory extends RW{
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
	 
	
	
	

	/*Technical
	PMS
	Job History*/
	public void Technical(WebDriver driver1) throws InterruptedException {      //(priority=1)

		WebDriver driver = driver1;
		
		
		WebElement technical = driver.findElement(By.linkText("Technical")); // pathfor "Technical"s
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
	
		Thread.sleep(2000);
		
		WebElement PMS = driver.findElement(By.linkText("PMS")); // pathfor "PMS"
		action.moveToElement(PMS).build().perform();
		
		Thread.sleep(2000);
		
		 driver.findElement(By.linkText("Jobs History")).click();  //Job History
		
		 
		
	
	}
          public void Systemlocation1(WebDriver driver1) throws Exception {   //(priority=2)
		  WebDriver driver = driver1;
 
	
		    dropdown( driver, "id", (data.getData(4, 443, 2)),(data.getData(4, 444, 2))); //Fleet "Fleet-B" Dropdown
		    Thread.sleep(2000);
		 
		
		/* 
		 driver.findElement(By.id("ctl00_MainContent_DDLVessel_imgCollapseExpandDDL")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("ctl00_MainContent_DDLVessel_CheckBoxListItems_1")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("ctl00_MainContent_DDLVessel_btnApplyFilter")).click();
		  Thread.sleep(2000);*/
		  
		  
	
		    dropdownCheckbox(driver, "id", (data.getData(4, 445, 2)),(data.getData(4, 446, 2)),(data.getData(4, 447, 2))); //Vessel Dropdown "HARUKA" Ok Click
		    Thread.sleep(6000);
		 
		    
		   		
		    dropdown( driver, "id",(data.getData(4, 448, 2)),(data.getData(4, 449, 2)));   //Function Worklist Dropdown
		    Thread.sleep(2000);
	

		    
		   // click_element(driver, "id", (data.getData(4, 450, 2));  //Click on Open Advance Filter
		    Thread.sleep(2000);
		    
		    	    
		    click_element(driver, "xpath", (data.getData(4, 451, 2)));  //Search Button
		    Thread.sleep(2000);
		  
		    
		    
		    //Window handle for Jobe Code
		    
		    String handleBefore = driver.getWindowHandle();    // Parent window
		    click_element(driver, "id", (data.getData(4, 452, 2)));  //Jobs Code
		    Thread.sleep(2000);
		
		    for (String handle : driver.getWindowHandles()) {          //Switch to new window
		    driver.switchTo().window(handle);}
		    driver.close();
		    driver.switchTo().window(handleBefore);
		    Thread.sleep(2000);
		    
		    
		  //Window handle for Done Date
		    String handleBefore1 = driver.getWindowHandle();       // Parent window
		    click_element(driver, "id", (data.getData(4, 453, 2)));  //Done Date
		    Thread.sleep(2000);	
		 
		    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
		    driver.switchTo().window(handle);}
		    driver.close();
		    driver.switchTo().window(handleBefore1);
		    Thread.sleep(2000);
		    
		    
		    
		    
		    click_element(driver, "id", (data.getData(4, 454, 2)));  //Action Add FeedBack
		    Thread.sleep(2000);
				    
		    click_element(driver, "id", (data.getData(4, 455, 2)));  //Path for closePopupbutton
		    Thread.sleep(2000);
		  
          }
          
          
          
		    public void Systemlocation2(WebDriver driver1) throws Exception {  //(priority=3)
				  WebDriver driver = driver1;
			
				//Window handle for Staff Code
				    String handleBefore2 = driver.getWindowHandle();       // Parent window
				  click_element(driver, "id", (data.getData(4, 456, 2)));  //Jobe code 58939
				
				    Thread.sleep(2000); 			  	   
				    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
				    driver.switchTo().window(handle);}
				    driver.close();
				    driver.switchTo().window(handleBefore2);
				    Thread.sleep(2000);
				  
				    
				    
					  //Window handle for Done Date
					    String handleBefore1 = driver.getWindowHandle();       // Parent window
					    click_element(driver, "id", (data.getData(4, 457, 2)));  //Done Date
					
					    Thread.sleep(2000);		   
					    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
					    driver.switchTo().window(handle);}
					    driver.close();
					    driver.switchTo().window(handleBefore1);
					    Thread.sleep(2000);
					    
					    click_element(driver, "id", (data.getData(4, 458, 2)));  //Action Spare Item Used
					    Thread.sleep(2000);
					
					    click_element(driver, "id", (data.getData(4, 459, 2)));  //Path for closePopupbutton
					
					    Thread.sleep(2000);
					    
					 
	}
          
		    public void Systemlocation3(WebDriver driver1) throws Exception {   //(priority=4)
				  WebDriver driver = driver1;
				
				//Window handle for Staff Code
				    String handleBefore2 = driver.getWindowHandle();       // Parent window
				  click_element(driver, "id", (data.getData(4, 460, 2)));  //Jobe code 58940
				
				    Thread.sleep(2000); 			  	   
				    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
				    driver.switchTo().window(handle);}
				    driver.close();
				    driver.switchTo().window(handleBefore2);
				    Thread.sleep(2000);


				  //Window handle forAttach item
				    String handleBefore1 = driver.getWindowHandle();       // Parent window
				  click_element(driver, "id", (data.getData(4, 461, 2)));  // path for Attached
			
				    Thread.sleep(2000); 			  	   
				    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
				    driver.switchTo().window(handle);}
				    driver.close();
				    driver.switchTo().window(handleBefore1);
				    Thread.sleep(2000);
				    

					  //Window handle Running Hrs
					    String handleBefore3 = driver.getWindowHandle();       // Parent window
					  click_element(driver, "id", (data.getData(4, 462, 2)));  // path for Running Hrs
				
					    Thread.sleep(2000); 			  	   
					    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
					    driver.switchTo().window(handle);}
					    driver.close();
					    driver.switchTo().window(handleBefore3);
					    Thread.sleep(2000);
					   
					  
		    }

}