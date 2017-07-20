package technical_PMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;




public class JobStatus extends RW {
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
	 public void PMSindex(WebDriver driver1) throws Exception   { //(priority=0)
		  WebDriver driver = driver1;
		
		  WebElement Technical=driver.findElement(By.linkText("Technical"));   //Click on Technical
		  Actions action=new Actions(driver);
		  action.moveToElement(Technical).build().perform();
	
		  Thread.sleep(1000);
	
		  
		  WebElement PMS=driver.findElement(By.linkText("PMS"));              //Click on PMS
		  action.moveToElement(PMS).build().perform();
	
		  Thread.sleep(1000);
		   
		  driver.findElement(By.linkText("Jobs Status")).click();  //Job Ststus
		  Thread.sleep(1000);
		  
		  dropdown(driver,"id",(data.getData(4, 420, 2)),(data.getData(4, 421, 2)));      //Click on Fleet dropdown
		
		  Thread.sleep(1000);
		  
		  dropdown(driver,"id",(data.getData(4, 422, 2)),(data.getData(4, 423, 2)));       //Click on Vessel dropdown
		
		  Thread.sleep(2000);
		  
		  dropdown(driver,"id",(data.getData(4, 424, 2)),(data.getData(4, 425, 2)));       //Click on Function dropdown
		
		  Thread.sleep(2000);
		  
		  
         click_element(driver,"xpath",(data.getData(4, 426, 2))); //Click on advanced Filter
       
         Thread.sleep(3000);
	  
		 
		 
	    //  sendkeys(driver,"id",(data.getData(4, 427, 2)),(data.getData(4, 428, 2)));  //Click n type on search textbox
	     
	      Thread.sleep(2000);
		
		   
		   
	  click_element(driver,"id",(data.getData(4, 429, 2)));  //Click on search icon
		
		  Thread.sleep(2000);
		  
		  String Records = driver.findElement(By.id(data.getData(4, 430, 2))).getText();
		  System.out.println("Records found:"+Records);
		
		  Thread.sleep(3000);
		 /* 
		  click_element(driver,"id",(data.getData(4, 431, 2))); //Click on  done
		
		  Thread.sleep(3000); 
		  
		  click_element(driver,"id",(data.getData(4, 432, 2))); //Click on  due
		
		  Thread.sleep(3000); 
		  */
		 click_element(driver,"id",(data.getData(4, 433, 2))); //Click on  Job code
		
		  Thread.sleep(3000);
		  
		  
		  String handleBefore = driver.getWindowHandle();       // Parent window

		  for (String handle : driver.getWindowHandles()) {          //Switch to new window
		        
		  driver.switchTo().window(handle);
		  String title = driver.getTitle();
		  System.out.print(title);}
		  driver.close();
		  driver.switchTo().window(handleBefore);
		  String title = driver.getTitle();
		  System.out.print(title);
		
		  Thread.sleep(3000);
		  
		 
		  click_element(driver,"xpath",(data.getData(4, 434, 2))); //Click on  Job History
		
		  Thread.sleep(3000);
		  
		  
		  
		  String handleBefore1 = driver.getWindowHandle();       // Parent window

		  for (String handle : driver.getWindowHandles()) {          //Switch to new window
		        
		  driver.switchTo().window(handle);
		  String title1 = driver.getTitle();
		  System.out.print(title1);}
		  driver.close();
		  driver.switchTo().window(handleBefore1);
		  String title1 = driver.getTitle();
		  System.out.print(title1);
		
		  Thread.sleep(3000);
		  
		 /* click_element(driver,"xpath",(data.getData(4, 435, 2))); //Click on Running Hrs
		
		  Thread.sleep(3000);
		  
		  
		  String handleBefore2 = driver.getWindowHandle();       // Parent window

		  for (String handle : driver.getWindowHandles()) {          //Switch to new window
		        
		  driver.switchTo().window(handle);
		  String title2 = driver.getTitle();
		  System.out.print(title2);}
		  driver.close();
		  driver.switchTo().window(handleBefore2);
		  String title2 = driver.getTitle();
		  System.out.print(title2);
		
		  Thread.sleep(3000);*/
		  
		/*  
		  click_element(driver,"id",(data.getData(4, 436, 2))); //Click on  Add Feedback
		
		  Thread.sleep(3000);
		  
		  driver.switchTo().defaultContent();
	         Thread.sleep(5000);
          
		 // click_element(driver,"xpath",(data.getData(4, 437, 2))); //Click on close button
		 
		  Thread.sleep(3000);*/
		
		 
	 }}  
	  