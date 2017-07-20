package technical_PMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;





public class JobChangeRequest extends RW {  
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
	
	

	public void JobCRIndex(WebDriver driver1) throws Exception{ //(priority=5)
		WebDriver driver = driver1;
		
		
		WebElement technical = driver.findElement(By.linkText("Technical"));
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		Thread.sleep(2000);
	
	
		WebElement PMS = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[2]/a/span"));
		action.moveToElement(PMS).build().perform();
		Thread.sleep(2000);
	
		
		WebElement JobchangeReq =driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[2]/ul/li[3]/a/span"));
		JobchangeReq.click();
		
		Thread.sleep(2000);
	
		
		dropdown(driver,"id",(data.getData(4, 470, 2)),(data.getData(4, 471, 2)));      
		Thread.sleep(2000);
	
		 
	    radioButton(driver,"id",(data.getData(4, 472, 2)));            //Click on Rejected
	    Thread.sleep(3000);
	 
	       
	    click_element(driver,"id",(data.getData(4, 473, 2)));            //Click on Search icon
		Thread.sleep(3000);
	
		String Record = driver.findElement(By.id(data.getData(4, 474, 2))).getText();
	
	    System.out.println("Record count for Rejected before rejection is"+Record);
		 
	  
	    click_element(driver,"id",(data.getData(4, 475, 2)));                       //Click on refresh button
		Thread.sleep(2000);
	
		String Record1 = driver.findElement(By.id(data.getData(4, 476, 2))).getText();
	
		System.out.println("Record count for pending before Rejection"+Record1);
		     
		     
	    click_element(driver,"id",(data.getData(4, 477, 2)));      //Click on Action icon
	   
		Thread.sleep(3000);
		  
		WebElement iframe=driver.findElement(By.id(data.getData(4, 478, 2)));   //Switching to the frame
		
		driver.switchTo().frame(iframe);
		
		click_element(driver,"id",(data.getData(4, 479, 2)));               //Click on Reject Button
		
		Thread.sleep(2000);
          
		Alert alert = driver.switchTo().alert();   //Alert handling
	     String Alert = alert.getText();
	     System.out.print(Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	   
		
		
		sendkeys(driver,"id",(data.getData(4, 480, 2)),(data.getData(4, 481, 2)));    //Click n type on Actioned Remarks
		
		Thread.sleep(2000);
		
		click_element(driver,"id",(data.getData(4, 482, 2)));               //Click on Reject Button
		Thread.sleep(2000);
		
		
	//For Reject
		
		Alert alert1 = driver.switchTo().alert();   //Alert handling
	     String Alert1 = alert1.getText();
	     System.out.print(Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	   
	     
	    /* //For Verification Whether Change request has been rejected
	     String VerifyRecord = driver.findElement(By.id(data.getData(4, 483, 2))).getText();
		 System.out.println("Record for Pending After Rejection"+VerifyRecord);
		 Thread.sleep(2000);
		 test.log(LogStatus.INFO, "Record for Pending After Rejection");
	   
		 click_element(driver,"id",(data.getData(4, 484, 2));                       //Click on refresh button
		 Thread.sleep(2000);
		 test.log(LogStatus.INFO, "Click on refresh button");
		
		dropdown(driver,"id",(data.getData(4, 485, 2)),(data.getData(4, 486, 2));       //Click on Vessel dropdown
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Click on Vessel dropdown");
			  
			 
		radioButton(driver,"id",(data.getData(4, 487, 2));            //Click on Rejected
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Click on Rejected");
	       
		click_element(driver,"id",(data.getData(4, 488, 2));            //Click on Search icon
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Click on Search icon");
			
		 String VerifyRecord1 = driver.findElement(By.id(data.getData(4, 489, 2)).getText();
	     System.out.println("Record for Rejected After Rejection"+VerifyRecord1);
	     Thread.sleep(2000);
	     test.log(LogStatus.INFO, "Record for Rejected After Rejection");
		
		//For Verification Whether a particular Job change request is rejected

	     dropdown(driver,"id",(data.getData(4, 490, 2)),(data.getData(4, 491, 2));       //Click on Vessel dropdown
		 Thread.sleep(2000);
		 test.log(LogStatus.INFO, "Click on Rejected");
			  
		  radioButton(driver,"id",(data.getData(4, 492, 2));            //Click on Rejected
		  Thread.sleep(3000);
		  test.log(LogStatus.INFO, "Click on Rejected");
		  
	     sendkeys(driver,"id",(data.getData(4, 493, 2)),(data.getData(4, 494, 2));    //Click n type on Search By
		 Thread.sleep(2000);
		 test.log(LogStatus.INFO, "Click n type on Search By");
			
	     click_element(driver,"id",(data.getData(4, 495, 2));         //Click on Search icon
		 Thread.sleep(3000);
		 test.log(LogStatus.INFO, "Search icon");
		   
		 */
		//For Approve
		 
		 click_element(driver,"id",(data.getData(4, 496, 2)));                       //Click on refresh button
		 Thread.sleep(2000);
		
		 
		 
		 radioButton(driver,"id",(data.getData(4, 497, 2)));            //Click on Approve
		    Thread.sleep(3000);
		 
		       
		    click_element(driver,"id",(data.getData(4, 498, 2)));            //Click on Search icon
			Thread.sleep(3000);
		
			
			String Record2 = driver.findElement(By.id(data.getData(4, 499, 2))).getText();
		    System.out.println("Record count for Approve before Approval is"+Record2);
		 
		  
		    click_element(driver,"id",(data.getData(4, 500, 2)));                       //Click on refresh button
			Thread.sleep(2000);
		
			   
			String Record3 = driver.findElement(By.id(data.getData(4, 501, 2))).getText();
			System.out.println("Record count for Pending before Approval"+Record3);
		
			     
		    click_element(driver,"id",(data.getData(4, 502, 2)));      //Click on Action icon
			Thread.sleep(3000);
			
			WebElement iframe1=driver.findElement(By.id(data.getData(4, 503, 2)));   //Switching to the frame
			driver.switchTo().frame(iframe1);
		
			
			clear_element(driver,"id",(data.getData(4, 504, 2)));                     //Clear Job Title
			Thread.sleep(2000);
		
			sendkeys(driver,"id",(data.getData(4, 505, 2)),(data.getData(4, 506, 2)));                   //Click n type on Job Title
			Thread.sleep(2000);
			
			
			clear_element(driver,"id",(data.getData(4, 507, 2)));                //Clear Job Description
			Thread.sleep(2000);
		
			sendkeys(driver,"id",(data.getData(4, 508, 2)),(data.getData(4, 509, 2)));                //Click n type on Job Description
			Thread.sleep(2000);
		
			
			clear_element(driver,"id",(data.getData(4, 510, 2)));                //Clear Frequency
			Thread.sleep(2000);
		
			sendkeys(driver,"id",(data.getData(4, 511, 2)),(data.getData(4, 512, 2)));                //Click n type on Frequency
			Thread.sleep(2000);
			
			
			click_element(driver,"xpath",(data.getData(4, 513, 2)));       //Click on Frequency Type
			Thread.sleep(3000);
		
			
			click_element(driver,"xpath",(data.getData(4, 514, 2)));       //Click on Dept
			Thread.sleep(2000);
		
			
			radioButton(driver,"id",(data.getData(4, 515, 2)));                 //Click on Non-CMS Radiobutton
			Thread.sleep(2000);
		
			
			radioButton(driver,"id",(data.getData(4, 516, 2)));                 //Click on Non-Critical Radiobutton
			Thread.sleep(2000);
		
			
			dropdown(driver,"id",(data.getData(4, 517, 2)),(data.getData(4, 518, 2)));     //Click on Rank dropdown
			Thread.sleep(3000);
		
		
			
			sendkeys(driver,"id",(data.getData(4, 519, 2)),(data.getData(4, 520, 2)));    //Click n type on Actioned Remarks
			Thread.sleep(2000);
		
			
			click_element(driver,"id",(data.getData(4, 521, 2)));               //Click on Approved Button
			Thread.sleep(2000);
		
			
		
			
			Alert alert2 = driver.switchTo().alert();   //Alert handling for approved
		     String Alert2 = alert2.getText();
		     System.out.print(Alert2);
		     alert.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(4000);
		   
		     
		     //For Verification Whether Change request has been Approved
		     String VerifyRecord2 = driver.findElement(By.id(data.getData(4, 522, 2))).getText();
			 System.out.println("Record for Pending After Approval"+VerifyRecord2);
			 Thread.sleep(2000);
			
		   
			 click_element(driver,"id",(data.getData(4, 523, 2)));                       //Click on refresh button
			 Thread.sleep(2000);
			
			
			 dropdown(driver,"id",(data.getData(4, 524, 2)),(data.getData(4, 525, 2)));       //Click on Vessel dropdown
			 Thread.sleep(2000);
			
				  
				 
			  radioButton(driver,"id",(data.getData(4, 526, 2)));            //Click on Approve
			  Thread.sleep(3000);
			
		       
			   
			  click_element(driver,"id",(data.getData(4, 527, 2)));            //Click on Search icon
		      Thread.sleep(3000);
		  
		
			  String VerifyRecord3 = driver.findElement(By.id(data.getData(4, 528, 2))).getText();
			  System.out.println("Record for Approve After Approval"+VerifyRecord3);
			  Thread.sleep(2000);
			
				
			/*	//For Verification Whether a particular Job change request is approved

			   dropdown(driver,"id",(data.getData(4, 529, 2)),(data.getData(4, 530, 2));       //Click on Vessel dropdown
			   Thread.sleep(2000);
			   test.log(LogStatus.INFO, "Vessel dropdown");
					  
			   radioButton(driver,"id",(data.getData(4, 531, 2));            //Click on approve
			   Thread.sleep(3000);
			   test.log(LogStatus.INFO, "approve");
				  
			   sendkeys(driver,"id",(data.getData(4, 532, 2),(data.getData(4, 533, 2));    //Click n type on Search By
			   Thread.sleep(2000);
			   test.log(LogStatus.INFO, "type on Searc");
					
			   click_element(driver,"id",(data.getData(4, 534, 2));         //Click on Search icon
			   Thread.sleep(3000);
			   test.log(LogStatus.INFO, "Search icon");
					*/
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}