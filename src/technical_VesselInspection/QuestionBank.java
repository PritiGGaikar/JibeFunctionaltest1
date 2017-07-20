package technical_VesselInspection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;


import common_Function.RW;



public class QuestionBank extends RW {
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
	
	
       public void AddNewQuestion(WebDriver driver1) throws Exception{
		WebDriver driver = driver1; 
	     
	   
	    //Click on Technical
		WebElement technical = driver.findElement(By.linkText(("Technical")));  
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		Thread.sleep(2000);
		
		//Click on Vessel Inspection
		WebElement PMS = driver.findElement(By.linkText(("Vessel Inspection")));   
		action.moveToElement(PMS).build().perform();
		Thread.sleep(2000);
		
		 //Click on Question bank
		driver.findElement(By.linkText(("Question bank"))).click(); 
		Thread.sleep(3000);
		
	     //Add new Question
		
		//Click on Add New Question
        click_element(driver,"id",(data.getData(4, 213, 2)));  
        Thread.sleep(3000);
		
        //Click on Save And Add New Button
        click_element(driver,"id",(data.getData(4, 214, 2)));  
        Thread.sleep(3000);
        
        
        Alert alert = driver.switchTo().alert();   
		 String Alert = alert.getText();
		 System.out.print(Alert);
		 alert.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(4000);
		 
		 
		
       //click on Questions
		sendkeys(driver,"id",(data.getData(4, 215, 2)),(data.getData(4, 216, 2)));
		Thread.sleep(3000);
		
	    //click on Category
	    dropdown(driver,"id",(data.getData(4, 217, 2)),(data.getData(4, 218, 2)));
	    Thread.sleep(3000);
	    
	    //click on Grading Type
	    dropdown(driver,"id",(data.getData(4, 219, 2)),(data.getData(4, 220, 2)));
	    Thread.sleep(3000);
	    
	    //Click on Save And Add New Button
        click_element(driver,"id",(data.getData(4, 221, 2)));  
        Thread.sleep(3000);
	    
        //Adding 1 more item by clicking on save and Add new
        //click on Questions
		sendkeys(driver,"id",(data.getData(4, 222, 2)),(data.getData(4, 223, 2)));  
		Thread.sleep(3000);
		
	    //click on Category
	    dropdown(driver,"id",(data.getData(4, 224, 2)),(data.getData(4, 225, 2)));
	    Thread.sleep(3000);
	    
	    //click on Grading Type
	    dropdown(driver,"id",(data.getData(4, 226, 2)),(data.getData(4, 227, 2)));
	    Thread.sleep(3000);
	    
	    //Click on Save And Close Button
        click_element(driver,"id",(data.getData(4, 228, 2)));  
        Thread.sleep(3000);
       
	    
	}
	  //Editing the newly added questions  
	public void EditQuestion(WebDriver driver1) throws Exception{
		WebDriver driver = driver1;  
	     
		//Clear search textbox
		 clear_element(driver,"xpath",(data.getData(4, 229, 2)));  
	     Thread.sleep(2000);
		//Click  and type on search textbox
        sendkeys(driver,"xpath",(data.getData(4, 230, 2)),(data.getData(4, 231, 2)));  
        Thread.sleep(4000);
	      
        
        //Click on Category 
        dropdown(driver,"xpath",(data.getData(4, 232, 2)),(data.getData(4, 254, 2)));
	    Thread.sleep(3000);
	    
	    //Click on Edit icon of selected Question
	    driver.findElement(By.cssSelector((data.getData(4, 233, 2)))).click();
	    Thread.sleep(4000);
        
        
        /*click_element(driver,"xpath",(data.getData(4, 233, 2)));  
        Thread.sleep(4000);*/
        
        //Edit Question Textbox 
		clear_element(driver,"id",(data.getData(4, 234, 2)));  
	    Thread.sleep(3000);
	    //Click  and type on search textbox
        sendkeys(driver,"id",(data.getData(4, 235, 2)),(data.getData(4, 236, 2)));  
        Thread.sleep(5000);
	      
        
        //Edit Category
        dropdown(driver,"id",(data.getData(4, 237, 2)),(data.getData(4, 238, 2)));
	    Thread.sleep(3000);
	      
	    //Edit Criteria Options
        dropdown(driver,"id",(data.getData(4, 239, 2)),(data.getData(4, 240, 2)));
	    Thread.sleep(4000);
	    
	    //Click on Save icon of the selected question
	  	click_element(driver,"xpath",(data.getData(4, 241, 2)));  
	  	Thread.sleep(4000);
	  	
	} 
	    //Deleting the Edited question
	public void DeleteQuestion(WebDriver driver1) throws Exception{
		WebDriver driver = driver1;  
		//Clear search textbox
		clear_element(driver,"id",(data.getData(4, 242, 2)));
		 Thread.sleep(2000);
		
		//Click  and type on search textbox
       sendkeys(driver,"id",(data.getData(4, 243, 2)),(data.getData(4, 244, 2))); 
       Thread.sleep(2000);
       //Click on Category
       dropdown(driver,"id",(data.getData(4, 245, 2)),(data.getData(4, 246, 2)));
       Thread.sleep(2000);
       
	  
	    //Click on delete icon of the Edited question
	  	click_element(driver,"xpath",(data.getData(4, 247, 2)));  
	  	Thread.sleep(2000);
	  	
	  	//Alert for Confirming Delete
	  	
	  	 Alert alert1 = driver.switchTo().alert();   
		 String Alert1 = alert1.getText();
		 System.out.print(Alert1);
		 alert1.accept();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(4000);
	    
		 
		 //Deleting other question
			//Clear search textbox
			clear_element(driver,"id",(data.getData(4, 248, 2)));
			 Thread.sleep(2000);
			
			//Click  and type on search textbox
	       sendkeys(driver,"id",(data.getData(4, 249, 2)),(data.getData(4, 250, 2))); 
	       Thread.sleep(2000);
	       dropdown(driver,"id",(data.getData(4, 251, 2)),(data.getData(4, 252, 2)));
	       Thread.sleep(2000);
	       
		  
		    //Click on delete icon of the Edited question
		  	click_element(driver,"xpath",(data.getData(4, 253, 2)));  
		  	Thread.sleep(2000);
		  	
		  	//Alert for Confirming Delete
		  	
		  	 Alert alert2 = driver.switchTo().alert();   
			 String Alert2 = alert2.getText();
			 System.out.print(Alert2);
			 alert2.accept();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 Thread.sleep(4000);
		    
	    
	} 
		
}

