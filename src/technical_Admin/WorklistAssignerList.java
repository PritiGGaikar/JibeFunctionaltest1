package technical_Admin;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class WorklistAssignerList extends RW {
	
	
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
	
	  public void WorklistAssignerListindex(WebDriver driver1) throws Exception   {  //(priority=0)
		   WebDriver driver = driver1;  
		   

			driver.get("http://192.168.1.202/STG_OSG/Technical/Worklist/LibraryAssigners.aspx");  //Technical-->Admin-->AlarmEffects    
		     Thread.sleep(2000);
		     
		 	String actualTitle = driver.getTitle().trim();
		 	String expectedTitle = " 	Assignor ".trim();
		 	Assert.assertEquals(expectedTitle,actualTitle);
			
		 	if(expectedTitle.equals(actualTitle)){
		 		System.out.println("Title Match");
		 		Thread.sleep(2000);
		 	}	else{
		 		System.out.println("Title does not Match");
		 		Thread.sleep(2000);	
		 		
		 	}
		   
		  /* WebElement technical = driver.findElement(By.linkText(data.getData(4, 1130, 2))); // pathfor "Technical"
			Actions action = new Actions(driver);
			action.moveToElement(technical).build().perform();
			Thread.sleep(2000);
			

			WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1131, 2)));// path for "Admin"
			action.moveToElement(Admin).build().perform();
			Thread.sleep(2000);

			WebElement Certificate = driver.findElement(By.linkText(data.getData(4, 1132, 2))); // path for "Survey and Certificate Settings"
			Certificate.click();
			Thread.sleep(2000); */ 
		   
	  }	   
	  
	  public void AddWorklistAssigner(WebDriver driver1) throws Exception   {  //(priority=1)
		   WebDriver driver = driver1;  
	    //----------------------------------------------Add new Assignor-----------------------------------//	    
		     
		     click_element(driver, "id",(data.getData(4, 1133, 2))); //Clicking on-Add new Assignor
			 Thread.sleep(1000);
		     			
			click_element(driver, "id",(data.getData(4, 1136, 2))); //Click on Save
			Thread.sleep(1000);
				
			 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please enter Assignor
		     String Alert = alert.getText();
		     System.out.print("Alert msg for:"+Alert);
		     alert.accept();		   
		     Thread.sleep(2000);
		     
			sendkeys(driver,"id",(data.getData(4, 1134, 2)),(data.getData(4, 1135, 2))); //Sendkeys for Assignor Name 
			Thread.sleep(1000);
			 
			click_element(driver, "id",(data.getData(4, 1136, 2))); //Click on Save
			Thread.sleep(1000);
			 
			//-------------------Add same name---------------//
			
			click_element(driver, "id",(data.getData(4, 1142, 2))); //Click on Refresh
			Thread.sleep(1000);
			
			 click_element(driver, "id",(data.getData(4, 1133, 2))); //Clicking on-Add new Assignor
			 Thread.sleep(1000);
			 
			sendkeys(driver,"id",(data.getData(4, 1134, 2)),(data.getData(4, 1135, 2))); //Sendkeys for Assignor Name 
			Thread.sleep(1000);
				 
			click_element(driver, "id",(data.getData(4, 1136, 2))); //Click on Save
			Thread.sleep(1000);
			
				Alert alert3 = driver.switchTo().alert();                                         //Alert handling for Please enter Assignor
			     String Alert3 = alert3.getText();
			     System.out.print("Alert msg for:"+Alert3);
			     alert3.accept();		   
			     Thread.sleep(2000);
			
			 //----------------------------Search Added name-------------------------//
			click_element(driver, "id",(data.getData(4, 1142, 2))); //Click on Refresh
			Thread.sleep(1000);
					
			clear_element(driver, "id", (data.getData(4, 1137, 2)));// Clear Assignor 
			Thread.sleep(1000);
						  
			sendkeys(driver,"id",(data.getData(4, 1137, 2)),(data.getData(4, 1138, 2))); //Sendkeys for Assignor Name 
			Thread.sleep(1000);
						 
			click_element(driver, "id",(data.getData(4, 1139, 2))); //Click on Search
			Thread.sleep(1000);
		   
		    
			//------------------------Edit on Existing added name------------------------//
			
			
			click_element(driver, "id",(data.getData(4, 1140, 2))); //Click on Edit
			Thread.sleep(1000);
			
		
			clear_element(driver, "id",(data.getData(4, 1141, 2)));// Clear Assignor Name
			Thread.sleep(1000);
						  
			sendkeys(driver,"id",(data.getData(4, 1141, 2)),(data.getData(4, 1143, 2))); //Sendkeys for Assignor Name
			Thread.sleep(1000);
			
			click_element(driver, "id",(data.getData(4, 1144, 2))); //Click on Save
			Thread.sleep(1000);
		    
			 //----------------------------Search Edited name-------------------------//
			
			click_element(driver, "id",(data.getData(4, 1142, 2))); //Click on Refresh
			Thread.sleep(1000);
			
			clear_element(driver, "id", (data.getData(4, 1137, 2)));// Clear Assignor 
			Thread.sleep(1000);
						  
			sendkeys(driver,"id",(data.getData(4, 1137, 2)),(data.getData(4, 1143, 2))); //Sendkeys for Assignor Name 
			Thread.sleep(1000);
						 
			click_element(driver, "id",(data.getData(4, 1139, 2))); //Click on Search
			Thread.sleep(1000);
			   
	  }
	  
	  public void DeleteAssignorName (WebDriver driver1) throws Exception  {  //(priority=2)
		  WebDriver driver = driver1;
		  
		  click_element(driver, "id",(data.getData(4, 1142, 2))); //Click on Refresh
		  Thread.sleep(1000);
			
		  clear_element(driver, "id", (data.getData(4, 1137, 2)));// Clear Assignor 
		  Thread.sleep(1000);
						  
		  sendkeys(driver,"id",(data.getData(4, 1137, 2)),(data.getData(4, 1143, 2))); //Sendkeys for Assignor Name 
		  Thread.sleep(1000);
						 
		  click_element(driver, "id",(data.getData(4, 1139, 2))); //Click on Search
		  Thread.sleep(1000); 
		  		 
	      click_element(driver, "id",(data.getData(4, 1155, 2))); //Click on Delete
	      Thread.sleep(1000);
	      
	      Alert alert = driver.switchTo().alert();                                         //Alert handling for Delete
		     String Alert = alert.getText();
		     System.out.print("Alert msg for:"+Alert);
		     alert.accept();		   
		     Thread.sleep(2000);
		  
	      //--------------------------Serach Delete Name--------------------------//
	      
	      click_element(driver, "id",(data.getData(4, 1142, 2))); //Click on Refresh
		  Thread.sleep(1000);
		  
		  clear_element(driver, "id", (data.getData(4, 1137, 2)));// Clear Assignor 
		  Thread.sleep(1000);
						  
		  sendkeys(driver,"id",(data.getData(4, 1137, 2)),(data.getData(4, 1143, 2))); //Sendkeys for Assignor
		  Thread.sleep(1000);
						 
		  click_element(driver, "id",(data.getData(4, 1139, 2))); //Click on Search
		  Thread.sleep(1000); 		 
			
		  String Record = driver.findElement(By.xpath(data.getData(4, 1156, 2))).getText(); // Record
		  Thread.sleep(1000);	
		     
		  System.out.println(""+ Record);
		  Thread.sleep(1000); 
		    
			  //----------------------------Add deleted name ----------------------------//
		    
		 click_element(driver, "id",(data.getData(4, 1142, 2))); //Click on Refresh
		 Thread.sleep(1000);	
		   		   
		click_element(driver, "id",(data.getData(4, 1133, 2))); //Clicking on-Add new Assignor
		Thread.sleep(1000);
		
		sendkeys(driver,"id",(data.getData(4, 1134, 2)),(data.getData(4, 1143, 2))); //Sendkeys for Assignor Name 
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1136, 2))); //Click on Save
		Thread.sleep(1000);  
		
		Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Name alredy existitated and deleted
	     String Alert1 = alert1.getText();
	     System.out.print("Alert msg for:"+Alert1);
	     alert1.accept();		   
	     Thread.sleep(2000);
		 
	     click_element(driver, "id",(data.getData(4, 1142, 2))); //Click on Refresh
		 Thread.sleep(1000);	
	     
	     click_element(driver, "id",(data.getData(4, 1157, 2))); //Click on Export Excel
		 Thread.sleep(1000);  
	  }		  
	  
	
	  
	  

}
