package technical_PMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class UnplannedJobDetails extends RW {
	
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
			
			
		       public void UnplannedJobDetails1(WebDriver driver1) throws Exception{
				WebDriver driver = driver1; 
			     
			   
			    //Click on Technical
				WebElement technical = driver.findElement(By.linkText(("Technical")));  
				Actions action = new Actions(driver);
				action.moveToElement(technical).build().perform();
				Thread.sleep(2000);
				
				//Click on PMS
				WebElement PMS = driver.findElement(By.linkText(("PMS")));   
				action.moveToElement(PMS).build().perform();
				Thread.sleep(2000);
				
				 //Click on UnPlannned Job Details
				driver.findElement(By.linkText(("UnPlannned Job Details"))).click(); 
				Thread.sleep(3000);
				
				
				//Click on Save
				click_element(driver,"id",(data.getData(4, 973, 2)));
				Thread.sleep(3000);
				
				//Alert for Vessel
				Alert alert = driver.switchTo().alert();   
				 String Alert = alert.getText();
				 System.out.print(Alert);
				 alert.accept();
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 Thread.sleep(3000);
			
				//click on Vessel
			    dropdown(driver,"id",(data.getData(4, 974, 2)),(data.getData(4, 975, 2)));
			    Thread.sleep(3000);
			    
			
			//Click on Yes radiobutton for "Defer to dry code"
				click_element(driver,"id",(data.getData(4, 976, 2)));
				Thread.sleep(3000);
				
			
				 //click on Priority
			    dropdown(driver,"id",(data.getData(4, 977, 2)),(data.getData(4, 978, 2)));
			    Thread.sleep(3000);
				
			    
			    //click on Primary
			    dropdown(driver,"id",(data.getData(4, 979, 2)),(data.getData(4, 980, 2)));
			    Thread.sleep(3000);
			    
			    //click on Secondary
			    dropdown(driver,"id",(data.getData(4, 981, 2)),(data.getData(4, 982, 2)));
			    Thread.sleep(3000);
			    
			    //click on PSC/SIRE Code
			    dropdown(driver,"id",(data.getData(4, 983, 2)),(data.getData(4, 984, 2)));
			    Thread.sleep(3000);
			    
			    
			  //Click on Save
				click_element(driver,"id",(data.getData(4, 985, 2)));
				Thread.sleep(3000);
			
				//Alert for Function
				Alert alert1 = driver.switchTo().alert();   
				 String Alert1= alert1.getText();
				 System.out.print(Alert1);
				 alert1.accept();
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 Thread.sleep(3000);
				 
			    //click on Function
			    dropdown(driver,"id",(data.getData(4, 986, 2)),(data.getData(4, 987, 2)));
			    Thread.sleep(3000);
			    
			     /*//Click on Save
					click_element(driver,"id",(data.getData(4, 988, 2)));
					Thread.sleep(3000);
				//Alert for  System /Location
					Alert alert2 = driver.switchTo().alert();   
					 String Alert2= alert2.getText();
					 System.out.print(Alert2);
					 alert2.accept();
					 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					 Thread.sleep(3000);
			    //click on System /Location
			    dropdown(driver,"id",(data.getData(4, 989, 2)),(data.getData(4, 990, 2)));
			    Thread.sleep(3000);
			    

			     //Click on Save
					click_element(driver,"id",(data.getData(4, 991, 2)));
					Thread.sleep(3000);
				//Alert for  Sub System /Location
					Alert alert3 = driver.switchTo().alert();   
					 String Alert3= alert3.getText();
					 System.out.print(Alert3);
					 alert3.accept();
					 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					 Thread.sleep(3000);
			    
			  //click on SubSystem /Location
			    dropdown(driver,"id",(data.getData(4, 992, 2)),(data.getData(4, 993, 2)));
			    Thread.sleep(3000);*/
			    
			     //Click on Save
					click_element(driver,"id",(data.getData(4, 994, 2)));
					Thread.sleep(3000);
					
				//Alert for Job Title
					Alert alert4 = driver.switchTo().alert();   
					 String Alert4= alert4.getText();
					 System.out.print(Alert4);
					 alert4.accept();
					 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					 Thread.sleep(3000);
					 
			  //Click on Job Title
			    sendkeys(driver,"id",(data.getData(4, 995, 2)),(data.getData(4, 996, 2)));
			    Thread.sleep(3000);
			    
			    //Click on Save
				click_element(driver,"id",(data.getData(4, 997, 2)));
				Thread.sleep(3000);
				
			//Alert for Job Description
				Alert alert5 = driver.switchTo().alert();   
				 String Alert5= alert5.getText();
				 System.out.print(Alert5);
				 alert5.accept();
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 Thread.sleep(3000);
				 
				//Click on Job Description
					sendkeys(driver,"id",(data.getData(4, 998, 2)),(data.getData(4, 999, 2)));
					Thread.sleep(3000);
					
					 
				  //Click on Save
					click_element(driver,"id",(data.getData(4, 1000, 2)));
					Thread.sleep(3000);
					
				//Alert for Expected Completion
					Alert alert6 = driver.switchTo().alert();   
					 String Alert6= alert6.getText();
					 System.out.print(Alert6);
					 alert6.accept();
					 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					 Thread.sleep(3000);
						
				//Click on Expected Completion
				sendkeys(driver,"id",(data.getData(4, 1001, 2)),(data.getData(4, 1002, 2)));
				Thread.sleep(3000);
				
				//Click on Save
				click_element(driver,"id",(data.getData(4, 1003, 2)));
				Thread.sleep(3000);
				
				Alert alert7 = driver.switchTo().alert();   
				 String Alert7= alert7.getText();
				 System.out.print(Alert7);
				 alert7.accept();
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 Thread.sleep(3000);
		//--------------------------Follow up----------------------------------------------------		 
				//Click on Add Followup
				click_element(driver,"id",(data.getData(4, 1004, 2)));
				Thread.sleep(3000);
				
				//Click on Message
				sendkeys(driver,"id",(data.getData(4, 1005, 2)),(data.getData(4, 1006, 2)));
				Thread.sleep(3000);
				
				//Click on Save and Close
				click_element(driver,"id",(data.getData(4, 1007, 2)));
				Thread.sleep(3000);
		//------------------------Add attachment-------------------------------------------------	
				
				//Click on Add attachment button
		
				 /*	  click_element(driver, "id", "ctl00_MainContent_imgAttach");  
                  Thread.sleep(4000); 

                
             driver.findElement(By.id("ctl00_MainContent_AjaxFileUpload1_Html5InputFile")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg"); // File path
                Thread.sleep(3000);
                
              //click on upload
                click_element(driver, "id", "ctl00_MainContent_AjaxFileUpload1_UploadOrCancelButton");  //upload
                  Thread.sleep(4000); 
                  
               //click on close
               driver.findElement(By.cssSelector("#closePopupbutton")).click();
               Thread.sleep(3000);
             click_element(driver,"xpath",".//*[@id='closePopupbutton']");
                Thread.sleep(3000);*/
              /*driver.switchTo().defaultContent();
                  Thread.sleep(3000);
                  
                
                  for (String handle2 : driver.getWindowHandles()) {

          			driver.switchTo().window(handle2);
          		}
          		Thread.sleep(2000);*/
            	
				//Click on Save
				click_element(driver,"id",(data.getData(4, 1008, 2)));
				Thread.sleep(3000);
				
				Alert alert8 = driver.switchTo().alert();   
				 String Alert8 = alert8.getText();
				 System.out.print(Alert8);
				 alert8.accept();
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 Thread.sleep(3000);
}
	
}		       

					
				
				
				
				
				
	

