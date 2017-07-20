package technical_VesselInspection;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;


public class ChecklistCreation extends RW{
	//-------------------------------------------------- "Report Init."--------------------------------------------------------------------//
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
		   
	//--------------------------------------------------"Inspection Checklist"-------------------------------------------------------------------//
		    
		    public void InspectionChecklist(WebDriver driver1) throws Exception{
				WebDriver driver= driver1;
				
			      
		          // Select "Technical" Module  
			
				WebElement technical = driver.findElement(By.linkText("Technical")); 
			    Actions action = new Actions(driver);
			    action.moveToElement(technical).build().perform();
			    action.moveToElement(technical).perform();
			    Thread.sleep(2000);
			    
			    //Select "Vessel Inspection" Submenu
			    WebElement vesselinspection = driver.findElement(By.linkText("Vessel Inspection"));
			   // vesselinspection.click();
			    action.moveToElement(vesselinspection).build().perform();
			    Thread.sleep(2000);
			    
			    // Select "Checklist Creation"
			    WebElement ChecklistCreation = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[7]/ul/li[7]/a/span"));
			    ChecklistCreation.click();
			    Thread.sleep(5000);
			    
			    //Click on "Checklist name"
			    sendkeys(driver,"xpath",data.getData(4, 332, 2),data.getData(4, 333, 2));
			    Thread.sleep(2000);
			    
			    //"Vessel Type" dropdown
			    dropdown(driver,"xpath",data.getData(4, 334, 2),data.getData(4, 335, 2));
			    Thread.sleep(3000);
			    
			   //"Checklist type" dropdown
			    dropdown(driver,"xpath",data.getData(4, 336, 2),data.getData(4, 337, 2));
			    Thread.sleep(3000);
			    
			   //"Location rating" dropdown
			   dropdown(driver,"xpath",data.getData(4, 338, 2),data.getData(4, 339, 2));
			   Thread.sleep(3000); 
			    
			   // click on "Save" button
			  click_element(driver, "xpath", data.getData(4, 340, 2));
	    	  Thread.sleep(3000);
			    
	    	  // Alert of "Checklist save"
	    	    Alert alert5 = driver.switchTo().alert();
	    		// To read the text from alert
	    		String Alert5 = alert5.getText();
	    		System.out.println(" checklist creation alert is:" + Alert5);
	    		Thread.sleep(2000);
	    		alert5.accept();
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    		Thread.sleep(2000);
		    }
   		    
	//-------------------------------------"Adding Group"-----------------------------------------------------------------------------------------//
	    		 public void addinggroup(WebDriver driver1) throws Exception{
	 				WebDriver driver= driver1;
	 				
	 			//click on "Checklist Name"
		 		click_element(driver, "xpath", data.getData(4, 344, 2));
		 	    Thread.sleep(3000);	
		 	   String checklistname = driver.findElement(By.xpath(data.getData(4, 344, 2))).getText(); 
			    System.out.println("added checklist Name is " + checklistname);
		 		   
	 			//Select "Checklist details"---"checklist name"
	 			sendkeys(driver,"xpath",data.getData(4, 345, 2),data.getData(4, 346, 2));
	 		    Thread.sleep(2000);	
	 		    
	 		    //"Location rating" dropdown
		        dropdown(driver,"xpath",data.getData(4, 347, 2),data.getData(4, 348, 2));
			    Thread.sleep(3000); 
			    
			    //click on "save"
			    click_element(driver, "xpath", data.getData(4, 349, 2));
		 	    Thread.sleep(3000);	
		 	    
		 	   // Alert of "Checklist save"
	    	    Alert alert6 = driver.switchTo().alert();
	    		// To read the text from alert
	    		String Alert6 = alert6.getText();
	    		System.out.println(" checklist creation alert is:" + Alert6);
	    		Thread.sleep(2000);
	    		alert6.accept();
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    		Thread.sleep(2000);
	 						
	    	    // click on "Group Name" TextBox
		       sendkeys(driver,"xpath",data.getData(4, 350, 2),data.getData(4, 351, 2));
		       Thread.sleep(2000);
		       
		       // click on "Add" Button
			   click_element(driver, "xpath", data.getData(4, 352, 2));
		   	   Thread.sleep(3000);
			    
			   //Click on "Add Location"
		   	  sendkeys(driver,"xpath",data.getData(4, 353, 2),data.getData(4, 354, 2));
		      Thread.sleep(2000);
		    		    
		       // click on "Add" Button
			  click_element(driver, "xpath", data.getData(4, 355, 2));
		   	  Thread.sleep(3000);
		   	 //for "priting location name" 
		     String locname = driver.findElement(By.xpath(data.getData(4, 355, 2))).getText(); 
		   	 System.out.println("location Name is " + locname);
	    		 }
	  //----------------------------------------" publish"------------------------------------------------------//    		 
	    		public void publish(WebDriver driver1) throws Exception{
	     				WebDriver driver= driver1;	 
	    		 
			   // click on "publish" Button
	  	       click_element(driver, "xpath", data.getData(4, 359, 2));
	 	       Thread.sleep(3000);
	 	       
	 	       // Alert of "Checklist save"
	    	    Alert alertpub = driver.switchTo().alert();
	    		// To read the text from alert
	    		String Alertpub = alertpub.getText();
	    		System.out.println(" publish alert is:" + Alertpub);
	    		Thread.sleep(2000);
	    		alertpub.accept();
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    		Thread.sleep(2000);
	 	       
	 	       //click on "edit"
	    		click_element(driver, "xpath", data.getData(4, 360, 2));
		 	   Thread.sleep(3000);
		 	   
		 	  //click on "version name"
	    	   click_element(driver, "xpath", data.getData(4, 361, 2));
		 	   Thread.sleep(3000);
	 	       String locname = driver.findElement(By.xpath(data.getData(4, 361, 2))).getText(); 
	    	   System.out.println("location Name is " + locname);	 		 
	    		}
	//----------------------------------------" For Adding Description under Location Type"------------------------------------------------------//
		   	public void addingdescforlocation(WebDriver driver1) throws Exception{
 				WebDriver driver= driver1;
		   	  
		   	  
		    // click on "already added location type" Button
		    click_element(driver, "xpath", data.getData(4, 365, 2));
	 	    Thread.sleep(3000);
			 
	 	   // Adding desc.under location type 
	 	   checkbox_element(driver, "xpath", data.getData(4, 366, 2));
	 	   Thread.sleep(3000);  
	 	   
	 	   //adding desc.
	 	   checkbox_element(driver, "xpath", data.getData(4, 367, 2));
	 	   Thread.sleep(3000);  
	 	   
	 	   //adding desc.
	 	   checkbox_element(driver, "xpath", data.getData(4, 368, 2));
	 	   Thread.sleep(5000);  
	 	   
	 	    // click on "already added location type" Button
		   click_element(driver, "xpath", data.getData(4, 369, 2));
	 	   Thread.sleep(2000);
		   	}
	//----------------------------------------------" For Add new question"------------------------------------------------------//
		   	public void addnewquestion(WebDriver driver1) throws Exception{
				WebDriver driver= driver1; 	   
	 	   
			// click on "add new question" Button
		   click_element(driver, "xpath", data.getData(4, 373, 2));
	 	   Thread.sleep(2000);
	 	   
	 	   //Enter "question"
	   	  sendkeys(driver,"xpath",data.getData(4, 374, 2),data.getData(4, 375, 2));
	      Thread.sleep(2000);
	 	   
	      // Enter "category"
		  dropdown(driver,"xpath",data.getData(4, 376, 2),data.getData(4, 377, 2));
		  Thread.sleep(3000);
		  
		  //Enter "Grading Type"
		  dropdown(driver,"xpath",data.getData(4, 378, 2),data.getData(4, 379, 2));
		  Thread.sleep(3000);
		  
		  //click on "save"
		  click_element(driver, "xpath", data.getData(4, 380, 2));
	 	  Thread.sleep(2000);
	 	  
	 	  //search "Enter Question"
	 	 sendkeys(driver,"xpath",data.getData(4, 381, 2),data.getData(4, 382, 2));
	     Thread.sleep(2000);
	     
	     // "search added question"
	     click_element(driver, "xpath", data.getData(4, 383, 2));
	 	 Thread.sleep(2000);
	 	 
	 	 // "adding new question" checkbox
	     click_element(driver, "xpath", data.getData(4, 384, 2));
	 	 Thread.sleep(2000);
	 	 
	 	 //click on "save"
	 	 click_element(driver, "xpath", data.getData(4, 385, 2));
	 	 Thread.sleep(2000);
	 	 } 
	//----------------------------------------------------"Edit Location Name"-------------------------------------------------------------//	  
	 	public void editlocationname(WebDriver driver1) throws Exception{
			WebDriver driver= driver1; 	 
		  
		 //clear Textbox of "location name"
		 clear_element(driver, "xpath", data.getData(4, 389, 2));
		 Thread.sleep(2000);
		 
		 //search "Enter Question"
    	 sendkeys(driver,"xpath",data.getData(4, 390, 2),data.getData(4, 391, 2));
	     Thread.sleep(2000);
		  
	     //click on "Add" button
	     click_element(driver, "xpath", data.getData(4, 392, 2));
	 	 Thread.sleep(3000);  
	 	 
	 	//for "priting location name" 
	     String locnamechange = driver.findElement(By.xpath(data.getData(4, 393, 2))).getText(); 
	   	 System.out.println("location Name is " +  locnamechange);
	   	 
	   	 //For "delete"
	   	 click_element(driver, "xpath", data.getData(4, 394, 2));
	 	 Thread.sleep(3000); 
	 	}
	//--------------------------------------------------------------------------------------------------------------------------------------------//
	 	

}
	 	 
	 	   
	 	   
	 	   
	 	   
	 	   
			    

