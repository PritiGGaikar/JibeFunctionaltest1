
package technical_VesselInspection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class ChecklistType extends RW {
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
	
	
       public void AddNewChecklistType(WebDriver driver1) throws Exception{
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
		driver.findElement(By.linkText(("Checklist Type"))).click(); 
		Thread.sleep(3000);

		 // click on "checklist type" button
	    click_element(driver, "xpath", (data.getData(4, 259, 2)));
	   	Thread.sleep(3000);	
	   	
	    // click on "Save and close" button
	    click_element(driver, "id", (data.getData(4, 260, 2)));
	    Thread.sleep(6000);
	   	
	    // Alert for "checklist type"
	    Alert alert1 = driver.switchTo().alert();
		// To read the text from alert
		String Alert1 = alert1.getText();
		System.out.println(Alert1);
		Thread.sleep(2000);
		alert1.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	    //Click on "Add new checklist type"
	    sendkeys(driver,"xpath",(data.getData(4, 261, 2)),(data.getData(4, 262, 2)));
	    Thread.sleep(2000);
	    
	    // click on "Save and close" button
	    click_element(driver, "id", (data.getData(4, 263, 2)));
	    Thread.sleep(6000);
	    
	    // Alert for adding "checklist type" successfully
	    Alert alert2 = driver.switchTo().alert();
		// To read the text from alert
		String Alert2 = alert2.getText();
		System.out.println(Alert2);
		Thread.sleep(2000);
		alert2.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		 // click on Edit icon
	    click_element(driver, "xpath", (data.getData(4, 264, 2)));
	   	Thread.sleep(3000);
	   	
	    //clear checklist name
	   	clear_element(driver,"xpath",(data.getData(4, 265, 2)));
	    Thread.sleep(2000);
	    
		//update checklist name
	   	sendkeys(driver,"xpath",(data.getData(4, 266, 2)),(data.getData(4, 267, 2)));
	    Thread.sleep(2000);
	    
		//click on save icon
	    click_element(driver, "xpath", (data.getData(4, 268, 2)));
	   	Thread.sleep(3000);
		//Delete
		driver.findElement(By.cssSelector((data.getData(4, 269, 2)))).click();
	 	Thread.sleep(3000);
	    Alert alert3 = driver.switchTo().alert();
	 		// To read the text from alert
	 		String Alert3 = alert3.getText();
	 		System.out.println(Alert3);
	 		Thread.sleep(2000);
	 		alert3.accept();
	 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 		Thread.sleep(2000);
	 		
	   
 }
//--------------------------------------------------"Grading Type"----------------------------------------------------------------//
		
		 public void gradingtype(WebDriver driver1) throws Exception{
				WebDriver driver= driver1;
		  // click on "Add new Grade " button
		    click_element(driver, "xpath", (data.getData(4, 270, 2)));
		   	Thread.sleep(3000);	
	    
		   	
		    // click on "Save and close" button
		    click_element(driver, "xpath", (data.getData(4, 271, 2)));
		    Thread.sleep(3000);
		    
		   //	Alert for "Grade name"
		    Alert alert4 = driver.switchTo().alert();
			String Alert4 = alert4.getText();
			System.out.println(Alert4);
			Thread.sleep(2000);
			alert4.accept();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
		   // grade name 
		   sendkeys(driver, "xpath", (data.getData(4, 272, 2)),(data.getData(4, 273, 2)));
	       Thread.sleep(3000);
		
	     
		 //select "Min.point"
	    dropdown(driver,"xpath",(data.getData(4, 274, 2)),(data.getData(4, 275, 2)));
	    Thread.sleep(3000);
		
	    //Alert for max point
	    Alert alert6 = driver.switchTo().alert();
		// To read the text from alert
		String Alert6 = alert6.getText();
		System.out.println(Alert6);
		Thread.sleep(2000);
		alert6.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
        //Select on "Max.point"
	    dropdown(driver,"xpath",(data.getData(4, 276, 2)),(data.getData(4, 277, 2)));
	    Thread.sleep(3000);
	    
		
		  //Select "No. of Options"
	    dropdown(driver,"xpath",(data.getData(4, 278, 2)),(data.getData(4, 279, 2)));
	    Thread.sleep(3000);
		
	   // click on "Save and close" button
	    click_element(driver, "xpath", (data.getData(4, 280, 2)));
	    Thread.sleep(3000);
		
		
       // Alert for Adding New Grade Successfully
	    Alert alert5 = driver.switchTo().alert();
		// To read the text from alert
		String Alert5 = alert5.getText();
		System.out.println(Alert5);
		Thread.sleep(2000);
		alert5.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		
		 // click on Edit icon
	    click_element(driver, "xpath", (data.getData(4, 281, 2)));
	   	Thread.sleep(3000);
	   	
	  //clear Grade name
	   	clear_element(driver,"xpath",(data.getData(4, 282, 2)));
	    Thread.sleep(2000);
	    
		//update Grade name
	   	sendkeys(driver,"xpath",(data.getData(4, 283, 2)),(data.getData(4, 284, 2)));
	    Thread.sleep(2000);
	    
		//click on save icon
	    click_element(driver, "xpath", (data.getData(4, 285, 2)));
	   	Thread.sleep(3000);
	   	
	 	driver.findElement(By.cssSelector((data.getData(4, 286, 2)))).click();
	 	Thread.sleep(3000);
	 	
	    Alert alert9 = driver.switchTo().alert();
			// To read the text from alert
			String Alert9 = alert9.getText();
			System.out.println(Alert9);
			Thread.sleep(2000);
			alert9.accept();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
	
		 }
		 
		 
		 
//--------------------------------------------------------- "category"-------------------------------------------------------------------------//
		
		public void category(WebDriver driver1) throws Exception{
			WebDriver driver= driver1;
			
		// click on "Add new category" button
   	    click_element(driver, "xpath", (data.getData(4, 287, 2)));
   	    Thread.sleep(3000);	
   	    
   	    
   	  // click on "Save and close" button
	    click_element(driver, "xpath", (data.getData(4, 288, 2)));
	    Thread.sleep(3000);
   	    
   	  // Alert for category
	    Alert alert6 = driver.switchTo().alert();
		// To read the text from alert
		String Alert6 = alert6.getText();
		System.out.println(Alert6);
		Thread.sleep(2000);
		alert6.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
	 // "category" textbox
   	    sendkeys(driver, "xpath", (data.getData(4, 289, 2)),(data.getData(4, 290, 2)));
        Thread.sleep(3000);
        
     // click on "Save and close" button
	    click_element(driver, "xpath", (data.getData(4, 291, 2)));
	    Thread.sleep(3000);
   	    
        // Alert for adding new category successfully
	    Alert alert7 = driver.switchTo().alert();
		// To read the text from alert
		String Alert7 = alert7.getText();
		System.out.println(Alert7);
		Thread.sleep(2000);
		alert7.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		 // click on Edit icon
	    click_element(driver, "xpath", (data.getData(4, 292, 2)));
	   	Thread.sleep(3000);
	   	
	   	
		//clear Category name
	   	clear_element(driver,"xpath",(data.getData(4, 293, 2)));
	    Thread.sleep(2000);
	    
		//update Category name
	   	sendkeys(driver,"xpath",(data.getData(4, 294, 2)),(data.getData(4, 295, 2)));
	    Thread.sleep(2000);
	    
		//click on save icon
	    click_element(driver, "xpath", (data.getData(4, 296, 2)));
	   	Thread.sleep(3000);
		
	   	driver.findElement(By.cssSelector(data.getData(4, 297, 2))).click();
	 	Thread.sleep(3000);
	 	
	
		
	    Alert alert8 = driver.switchTo().alert();
			// To read the text from alert
			String Alert8 = alert8.getText();
			System.out.println(Alert8);
			Thread.sleep(2000);
			alert8.accept();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
		 }
		
		
}
