package technical_Admin;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class WorklistAccessRights extends RW {
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

	public void worklistindex(WebDriver driver1) throws Exception {
		WebDriver driver= driver1;
		

		driver.get("http://192.168.1.202/STG_OSG/Infrastructure/Libraries/WorkList_Access.aspx");  //Technical-->Admin-->AlarmEffects    
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Worklist Access ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
		
		/*WebElement technical = driver.findElement(By.linkText(data.getData(4, 1163, 2)));// path for "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		Thread.sleep(2000);
		
		WebElement admin = driver.findElement(By.xpath(data.getData(4, 1165, 2)));// path for "Admin"
		admin.click();
		Thread.sleep(2000);
		
		WebElement worklistaccess = driver.findElement(By.linkText(data.getData(4, 1166, 2))); // path for "worklistaccess"
		worklistaccess.click();
		Thread.sleep(2000);*/
	}	
		public void AddworklistAccess(WebDriver driver1) throws Exception {
			WebDriver driver= driver1;
		//--------------------Add New Worklist Access-----------------//
		
		click_element(driver, "id",(data.getData(4, 1167, 2))); //Click on--Add New Worklist Access
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1175, 2))); //Click on Save
		Thread.sleep(1000);
		
		
		Alert alert = driver.switchTo().alert();                                         //Alert handling for Please select User Name
	     String Alert = alert.getText();
	     System.out.print("Alert msg for:"+Alert);
	     alert.accept();		   
	     Thread.sleep(2000);
	     
	    dropdown(driver, "id",(data.getData(4, 1168, 2)),data.getData(4, 1169, 2));// Dropdown -->User Name -->Admin Admin
	 	Thread.sleep(1000);
	 	
		
	 	dropdown(driver, "id",(data.getData(4, 1170, 2)),(data.getData(4, 1171, 2)));// Dropdown -->Action Type -->Close
	 	Thread.sleep(1000);
		
		
	     checkbox_element(driver, "id",(data.getData(4, 1172, 2))); // Select checkboxes NCR
	     Thread.sleep(1000);
	     
	     checkbox_element(driver, "id",(data.getData(4, 1173, 2))); // Select checkboxes Defect
	     Thread.sleep(1000);
	     
	     click_element(driver, "id",(data.getData(4, 1175, 2))); //Click on Save
		 Thread.sleep(1000);
			
		
	    	//------------------Search added  New Worklist Access------------//
		
		 click_element(driver, "id",(data.getData(4, 1190, 2))); //Click on Refresh
		 Thread.sleep(1000);
		 
		 clear_element(driver, "id", (data.getData(4, 1181, 2)));// Clear User Name 
		 Thread.sleep(1000);
						  
		 sendkeys(driver,"id",(data.getData(4, 1181, 2)),(data.getData(4, 1182, 2))); //Sendkeys for User Name "Admin"
		 Thread.sleep(1000);
		 
		 dropdown(driver, "id",(data.getData(4, 1176, 2)),(data.getData(4, 1177, 2)));// Dropdown -->Action Type -->Close
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(4, 1178, 2))); //Click on Search
		 Thread.sleep(1000);
		 
		}
		 public void EditworklistAccess(WebDriver driver1) throws Exception {
				WebDriver driver= driver1;
				
		//------------------Edit added  New Worklist Access------------//
		 
		 
		 click_element(driver, "id",(data.getData(4, 1185, 2))); //Click on Edit
		 Thread.sleep(1000);
		 
		 checkbox_element(driver, "id",(data.getData(4, 1174, 2))); // Select checkboxes Note
	     Thread.sleep(1000);
		 
	     click_element(driver, "id",(data.getData(4, 1175, 2))); //Click on Save
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(4, 1190, 2))); //Click on Refresh
		 Thread.sleep(1000);
		 
		 
		 //-------------------------Add same nmae and type---------//
		 
		 click_element(driver, "id",(data.getData(4, 1167, 2))); //Click on--Add New Worklist Access
		 Thread.sleep(1000);
		 
		 dropdown(driver, "id",(data.getData(4, 1168, 2)),data.getData(4, 1169, 2));// Dropdown -->User Name -->Admin Admin
		 Thread.sleep(1000);
		 
		 dropdown(driver, "id",(data.getData(4, 1170, 2)),(data.getData(4, 1171, 2)));// Dropdown -->Action Type -->Close
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(4, 1175, 2))); //Click on Save
		 Thread.sleep(1000);
		 
		 String Alert1 = driver.findElement(By.id(data.getData(4, 1164, 2))).getText(); // Alert Note
		 Thread.sleep(1000);	
		     
		  System.out.println(""+ Alert1);
		  Thread.sleep(1000); 
		  
		  click_element(driver, "id",(data.getData(4, 1187, 2))); //Click on Close
		  Thread.sleep(1000);
		 }	 
		  
		  public void DeleteworklistAccess(WebDriver driver1) throws Exception {
				WebDriver driver= driver1;
				
		//------------------Delete added  New Worklist Access------------//
			 
		 click_element(driver, "id",(data.getData(4, 1190, 2))); //Click on Refresh
		 Thread.sleep(1000);
		 
		 clear_element(driver, "id", (data.getData(4, 1181, 2)));// Clear User Name 
		 Thread.sleep(1000);
						  
		 sendkeys(driver,"id",(data.getData(4, 1181, 2)),(data.getData(4, 1182, 2))); //Sendkeys for User Name "Admin"
		 Thread.sleep(1000);
		 
			 
	    dropdown(driver, "id",(data.getData(4, 1176, 2)),(data.getData(4, 1177, 2)));// Dropdown -->Action Type -->Close
	    Thread.sleep(1000);
			 
		click_element(driver, "id",(data.getData(4, 1178, 2))); //Click on Search
		Thread.sleep(1000);

		click_element(driver, "id",(data.getData(4, 1180, 2))); //Click on Delete
		Thread.sleep(1000); 
		
		Alert alert5 = driver.switchTo().alert();                    //Alert msg for delete                 
	    String Alert5 = alert5.getText();
	    System.out.print("Alert msg for:"+Alert5);
	    alert5.accept();
	    Thread.sleep(1000);
		 
		     //------------------Search Delete New Worklist Access------------//
		
		 click_element(driver, "id",(data.getData(4, 1190, 2))); //Click on Refresh
		 Thread.sleep(1000);
		 
		 clear_element(driver, "id", (data.getData(4, 1181, 2)));// Clear User Name 
		 Thread.sleep(1000);
						  
		 sendkeys(driver,"id",(data.getData(4, 1181, 2)),(data.getData(4, 1182, 2))); //Sendkeys for User Name "Admin"
		 Thread.sleep(1000);
		 
			 
	    dropdown(driver, "id",(data.getData(4, 1176, 2)),(data.getData(4, 1177, 2)));// Dropdown -->Action Type -->Close
	    Thread.sleep(1000);
			 
	    click_element(driver, "id",(data.getData(4, 1178, 2))); //Click on Search
		Thread.sleep(1000);
		
		String Record = driver.findElement(By.xpath(data.getData(4, 1191, 2))).getText(); // Alert Note
		Thread.sleep(1000);	
		     
		System.out.println(""+ Record);
		Thread.sleep(1000); 
		
		
	
		
		}}