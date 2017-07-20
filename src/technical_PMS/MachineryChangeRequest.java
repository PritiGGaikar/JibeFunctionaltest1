package technical_PMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;




public class MachineryChangeRequest extends RW {  
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
public void MachineryCRIndex(WebDriver driver1) throws Exception{    //(priority=6)
		
WebDriver driver=driver1;


WebElement technical = driver.findElement(By.linkText("Technical"));   //click on Technical
 Actions action=new Actions(driver);
  action.moveToElement(technical).build().perform();
  Thread.sleep(1000);
  Thread.sleep(1000);

  
  WebElement pms =driver.findElement(By.linkText("PMS"));             //Click on PMS
  action.moveToElement(pms).build().perform();
  Thread.sleep(1000);

  
  WebElement ChangeRequest= driver.findElement(By.linkText("Machinery Change Request"));
  ChangeRequest.click();
  //Click on  Machinery Change Request

  
  
  //Foe Reject
  
  dropdown(driver,"id",(data.getData(4, 542, 2)),(data.getData(4, 543, 2)));      //Click on Fleet dropdown
  Thread.sleep(2000);

  
 
  dropdown(driver,"id",(data.getData(4, 544, 2)),(data.getData(4, 545, 2)));       //Click on Vessel dropdown
  Thread.sleep(2000);

 
   radioButton(driver,"id",(data.getData(4, 546, 2)));            //Click on Rejected
   Thread.sleep(3000);

   click_element(driver,"id",(data.getData(4, 547, 2)));            //Click on Search icon
   Thread.sleep(3000);

   String Record = driver.findElement(By.id(data.getData(4, 548, 2))).getText();
	System.out.println("Record count for Rejected before rejection is"+Record);


 click_element(driver,"id",(data.getData(4, 549, 2)));                       //Click on refresh button
 Thread.sleep(2000);

   
  String Record1 = driver.findElement(By.id(data.getData(4, 550, 2))).getText();
  System.out.println("Record count for pending before Rejection"+Record1);

     
     
  click_element(driver,"id",(data.getData(4, 551, 2)));      //Click on Action icon
  Thread.sleep(3000);

  
  WebElement iframe=driver.findElement(By.id(data.getData(4, 552, 2)));   //Switching to the frame
  driver.switchTo().frame(iframe);
 
  
  dropdown(driver,"id",(data.getData(4, 553, 2)),(data.getData(4, 554, 2)));                        //Click on Maker dropdown
  Thread.sleep(2000); 

  
  dropdown(driver,"id",(data.getData(4, 555, 2)),(data.getData(4, 556, 2)));                        //Click on Function dropdown
  Thread.sleep(2000);


  sendkeys(driver,"id",(data.getData(4, 557, 2)),(data.getData(4, 558, 2)));                     //Type on Remark
  Thread.sleep(2000);

  
  click_element(driver,"id",(data.getData(4, 559, 2)));                       //Click on Reject button
  Thread.sleep(3000);

  Alert alert = driver.switchTo().alert();   //Alert handling
     String Alert = alert.getText();
     System.out.print(Alert);
     alert.accept();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     Thread.sleep(4000);
   
     //For Verification Whether Change request has been rejected
     String VerifyRecord = driver.findElement(By.id(data.getData(4, 560, 2))).getText();
	 System.out.println("Record for Pending After Rejection"+VerifyRecord);
	 Thread.sleep(2000);
	
   
	 click_element(driver,"id",(data.getData(4, 561, 2)));                       //Click on refresh button
	 Thread.sleep(2000);
	
	 
	  dropdown(driver,"id",(data.getData(4, 562, 2)),(data.getData(4, 563, 2)));      //Click on Fleet dropdown
	  Thread.sleep(2000);
	
	 
	  dropdown(driver,"id",(data.getData(4, 564, 2)),(data.getData(4, 565, 2)));       //Click on Vessel dropdown
	  Thread.sleep(2000);
	
	 
       radioButton(driver,"id",(data.getData(4, 566, 2)));            //Click on Rejected
       Thread.sleep(3000);
   
       
       click_element(driver,"id",(data.getData(4, 567, 2)));            //Click on Search icon
	   Thread.sleep(3000);
	 
	   
	   String VerifyRecord1 = driver.findElement(By.id(data.getData(4, 568, 2))).getText();
		 System.out.println("Record for Rejected After Rejection"+VerifyRecord1);
		 Thread.sleep(2000);
		
		 
		 //For Approve
	 
  
     click_element(driver,"id",(data.getData(4, 569, 2)));                       //Click on refresh button
	 Thread.sleep(2000);

	 dropdown(driver,"id",(data.getData(4, 570, 2)),(data.getData(4, 571, 2)));      //Click on Fleet dropdown
	  Thread.sleep(2000);
	
	  
	 
	  dropdown(driver,"id",(data.getData(4, 572, 2)),(data.getData(4, 573, 2)));       //Click on Vessel dropdown
	  Thread.sleep(2000);
	
	  
	
       radioButton(driver,"id",(data.getData(4, 574, 2)));            //Click on Approved 
       Thread.sleep(3000);
    
       click_element(driver,"id",(data.getData(4, 575, 2)));            //Click on Search icon
	   Thread.sleep(3000);
	
	   String Record2 = driver.findElement(By.id(data.getData(4, 576, 2))).getText();  //Record for Approved After Approval
	   System.out.println("Record for Approved Before Approval"+Record2);
	   Thread.sleep(2000);
	
	   
		click_element(driver,"id",(data.getData(4, 577, 2)));                       //Click on refresh button
	    Thread.sleep(2000);
	 
			 
	    String Record3 = driver.findElement(By.id(data.getData(4, 578, 2))).getText();  //Record for Approved After Approval
	    System.out.println("Record for Pending Before Approval"+Record3);
	    Thread.sleep(2000);
	  
			 
			 
	  click_element(driver,"id",(data.getData(4, 579, 2)));      //Click on Action icon
	  Thread.sleep(3000);

	  
	  WebElement iframe1=driver.findElement(By.id(data.getData(4, 580, 2)));   //Switching to the frame
	  driver.switchTo().frame(iframe1);
	
	  
	  dropdown(driver,"id",(data.getData(4, 581, 2)),(data.getData(4, 582, 2)));                        //Click on Maker dropdown
	  Thread.sleep(2000);
	
	  

	  dropdown(driver,"id",(data.getData(4, 583, 2)),(data.getData(4, 584, 2)));                         //Click on Function dropdown
	  Thread.sleep(2000);
	
	
	  sendkeys(driver,"id",(data.getData(4, 585, 2)),(data.getData(4, 586, 2)));                       //Type on Remark
	  Thread.sleep(3000);
	
	  
	  
	  click_element(driver,"id",(data.getData(4, 587, 2)));                           //Click on Approve Button
	  Thread.sleep(3000);  
	
	 
	  Alert alert1 = driver.switchTo().alert();                             //Alert handling
	     String Alert1 = alert1.getText();
	     System.out.print(Alert1);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	
	
	   //For Verification whether Change request has been approved
	
	  String VerifyRecord2 = driver.findElement(By.id(data.getData(4, 588, 2))).getText();
      System.out.println("Verify record for Pending after approval"+VerifyRecord2);
   
		 
	  dropdown(driver,"id",(data.getData(4, 589, 2)),(data.getData(4, 590, 2)));      //Click on Fleet dropdown
	  Thread.sleep(2000);
	
	  
	  dropdown(driver,"id",(data.getData(4, 591, 2)),(data.getData(4, 592, 2)));       //Click on Vessel dropdown
	  Thread.sleep(2000);
	
	  
	
      radioButton(driver,"id",(data.getData(4, 593, 2)));            //d 
      Thread.sleep(3000);
  
       
      click_element(driver,"id",(data.getData(4, 594, 2)));            //Click on Search icon
	  Thread.sleep(3000);
	
	  
	  
	  String VerifyRecord3 = driver.findElement(By.id(data.getData(4, 595, 2))).getText();
      System.out.println("Verify record for approved after approval"+VerifyRecord3);
    
		 
		 
		  click_element(driver,"id",(data.getData(4, 596, 2)));                       //Click on refresh button
			 Thread.sleep(2000);
		
			 
			 
			  click_element(driver,"id",(data.getData(4, 597, 2)));      //Click on Action icon
			  Thread.sleep(3000);
			
			  
			  WebElement iframe2=driver.findElement(By.id(data.getData(4, 598, 2)));   //Switching to the frame
			  driver.switchTo().frame(iframe2);
			
			  
			  dropdown(driver,"id",(data.getData(4, 599, 2)),(data.getData(4, 600, 2)));                        //Click on Maker dropdown
			  Thread.sleep(2000);
			
			  
              click_element(driver,"name",(data.getData(4, 601, 2)));                                 //Click on close
              Thread.sleep(2000);
            
}
	}
