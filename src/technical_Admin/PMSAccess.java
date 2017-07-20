package technical_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class PMSAccess extends RW {
	
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
	
	/*Technical
	Admin
	PMS Access*/
	public void PMSAccess(WebDriver driver1) throws Exception {  //(priority=0)

      	WebDriver driver = driver1;
      	
      	driver.get("http://192.168.1.202/STG_OSG/Infrastructure/Libraries/PMS_Access.aspx");  //Technical-->Admin-->AlarmEffects    
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	PMS Access ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
  
     	/*WebElement technical = driver.findElement(By.linkText(data.getData(4, 1349, 2))); // path for "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1350, 2)));// path for Admin
																					
		Admin.click();
		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);

		WebElement Access = driver.findElement(By.linkText(data.getData(4, 1351, 2))); // path for "PMS Access"
		Thread.sleep(5000);
		Access.click();
	*/
	}   	
	public void AddPMSAccess(WebDriver driver1) throws Exception {  //(priority=1)(Verify)

      	WebDriver driver = driver1;
    
      	click_element( driver, "id",(data.getData(4, 1352, 2)));  //path for Add PMS Access
		Thread.sleep(2000);
		
		dropdown(driver, "id", (data.getData(4, 1353, 2)),(data.getData(4, 1354, 2)));//Dropdown Add PMS Access-J/E
		Thread.sleep(2000);
		
		
		dropdown(driver, "id", (data.getData(4, 1355, 2)),(data.getData(4, 1356, 2)));//Dropdown Add PMS Access-VERIFY
		Thread.sleep(2000);
	
		
		click_element( driver, "id",(data.getData(4, 1357, 2)));  //path for Save Button
		Thread.sleep(2000);
		
		
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Add Access Verify
	     String Alert = alert.getText();
	     System.out.println("Alert msg for Add Access Verify:"+Alert);
	     alert.accept();
	     Thread.sleep(3000);
	     
	     //------------------------Add New PMS Access for Delete---------------------//
	     
	      	click_element( driver, "id",(data.getData(4, 1363, 2)));  //path for Add PMS Access
			Thread.sleep(2000);
			
			dropdown(driver, "id", (data.getData(4, 1364, 2)),(data.getData(4, 1365, 2)));//Dropdown Add PMS Access-J/E
			Thread.sleep(2000);
			
			
			dropdown(driver, "id", (data.getData(4, 1366, 2)),(data.getData(4, 1367, 2)));//Dropdown Add PMS Access-J/E DELETE
			Thread.sleep(2000);
			
						
			click_element( driver, "id",(data.getData(4, 1368, 2)));  //path for Save Button
			Thread.sleep(2000);
			
			
			 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Add Access Verify
		     String Alert1 = alert1.getText();
		     System.out.println("Alert msg for Add Access Verify:"+Alert1);
		     alert1.accept();		  
		     Thread.sleep(3000);
	    
	// -----------------------------Verify Added--------------------------------------//	
		     
			 click_element( driver, "id",(data.getData(4, 1381, 2)));  //path for Refresh
		     Thread.sleep(2000);		      
		      
		     sendkeys(driver,"id",(data.getData(4, 1385, 2)),(data.getData(4, 1386, 2))); //Sendkeys for Rank
		 	 Thread.sleep(1000);
		 	 
		     dropdown(driver, "id", (data.getData(4, 1382, 2)),(data.getData(4, 1374, 2)));//Dropdown Action Type Verify
		 	 Thread.sleep(2000);
		 		
		 	click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
		 	Thread.sleep(2000);
			 

	      	click_element( driver, "id",(data.getData(4, 1381, 2)));  //path for Refresh
	      	Thread.sleep(2000);
	     
	      	 sendkeys(driver,"id",(data.getData(4, 1385, 2)),(data.getData(4, 1386, 2))); //Sendkeys for Rank
		 	 Thread.sleep(1000);
		 	 
	      	dropdown(driver, "id", (data.getData(4, 1389, 2)),(data.getData(4, 1367, 2)));//Dropdown Action Type Delete
	 		Thread.sleep(1000);
	 		

	 		click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
		 	Thread.sleep(1000);
	}  	
	
	public void EditPMSAccess(WebDriver driver1) throws Exception {  //(priority=2)(Verify)

      	WebDriver driver = driver1;
	
      	 
		 click_element( driver, "id",(data.getData(4, 1381, 2)));  //path for Refresh
	     Thread.sleep(2000);	
	     
	     sendkeys(driver,"id",(data.getData(4, 1385, 2)),(data.getData(4, 1386, 2))); //Sendkeys for Rank
	 	 Thread.sleep(1000);
	      	
	     dropdown(driver, "id", (data.getData(4, 1382, 2)),(data.getData(4, 1374, 2)));//Dropdown Action Type Verify
	 	 Thread.sleep(2000);
	 		
	 	click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
	 	Thread.sleep(2000);	
	
	 	click_element( driver, "id",(data.getData(4, 1388, 2)));  //path for Edit
	 	Thread.sleep(2000);
	
	 	dropdown(driver, "id", (data.getData(4, 1371, 2)),(data.getData(4, 1372, 2)));//Dropdown Add PMS Access-4/E
		Thread.sleep(2000);
	
		click_element( driver, "id",(data.getData(4, 1368, 2)));  //path for Save Button
		Thread.sleep(2000);
		
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Add Access Verify
	     String Alert1 = alert1.getText();
	     System.out.println("Alert msg for Add Access Verify:"+Alert1);
	     alert1.accept();		  
	     Thread.sleep(3000);
	    
	} 	
	 	
	public void Delete(WebDriver driver1) throws Exception {  //(priority=3)

      	WebDriver driver = driver1;
      	
      	 click_element( driver, "id",(data.getData(4, 1381, 2)));  //path for Refresh
	     Thread.sleep(2000);	
      
      	 sendkeys(driver,"id",(data.getData(4, 1385, 2)),(data.getData(4, 1383, 2))); //Sendkeys for Rank
	 	 Thread.sleep(1000);
	      	
	 	 
    	dropdown(driver, "id", (data.getData(4, 1389, 2)),(data.getData(4, 1374, 2)));//Dropdown Action Type Verify
 		Thread.sleep(2000);
 		

 		click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
		Thread.sleep(2000);
		
 		
		click_element( driver, "id",(data.getData(4, 1387, 2)));  //path for Delete
     	Thread.sleep(2000);
      	
      	Alert alert = driver.switchTo().alert();                                         //Alert handling for Are you sure want to delete
 	     String Alert = alert.getText();
 	     System.out.println("Alert msg for Access updated successfully:"+Alert);
 	     alert.accept();  
 	     Thread.sleep(4000);
 	     
 		
       	Alert alert4 = driver.switchTo().alert();                                         //Alert handling for Are you sure want to delete
  	     String Alert4 = alert4.getText();
  	     System.out.println("Alert msg for Access updated successfully:"+Alert4);
  	     alert4.accept();  
  	     Thread.sleep(4000);
  	     
  	   click_element( driver, "id",(data.getData(4, 1381, 2)));  //path for Refresh
	     Thread.sleep(2000);;
	
	     sendkeys(driver,"id",(data.getData(4, 1385, 2)),(data.getData(4, 1386, 2))); //Sendkeys for Rank
	 	 Thread.sleep(1000);
	      	

     	dropdown(driver, "id", (data.getData(4, 1389, 2)),(data.getData(4, 1367, 2)));//Dropdown Action Type Delete
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
		Thread.sleep(2000);
     	
		click_element( driver, "id",(data.getData(4, 1387, 2)));  //path for Delete
     	Thread.sleep(2000);
     	
		
		Alert alert3 = driver.switchTo().alert();                                         //Alert handling for Access updated successfully
 	     String Alert3 = alert3.getText();
 	     System.out.println("Alert msg for Access updated successfully:"+Alert3);
 	     alert3.accept();  
 	     Thread.sleep(4000);
 	     
 		
      	Alert alert6 = driver.switchTo().alert();                                         //Alert handling for Are you sure want to delete
 	     String Alert6 = alert6.getText();
 	     System.out.println("Alert msg for Access updated successfully:"+Alert6);
 	     alert6.accept();  
 	     Thread.sleep(4000);

 	    click_element( driver, "id",(data.getData(4, 1381, 2)));  //path for Refresh
	     Thread.sleep(2000);
	     

      	 sendkeys(driver,"id",(data.getData(4, 1385, 2)),(data.getData(4, 1383, 2))); //Sendkeys for Rank
	 	 Thread.sleep(1000);
	      	
	 	 
    	dropdown(driver, "id", (data.getData(4, 1389, 2)),(data.getData(4, 1374, 2)));//Dropdown Action Type Verify
 		Thread.sleep(2000);
 		

 		click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
		Thread.sleep(2000);
		
		String Record = driver.findElement(By.xpath(data.getData(4, 1348, 2))).getText(); // Record
	    Thread.sleep(1000);	
	    
	    System.out.println(""+ Record);
	    Thread.sleep(1000);	
	    
		click_element( driver, "id",(data.getData(4, 1381, 2)));  //path for Refresh
	     Thread.sleep(2000);;
	
	     sendkeys(driver,"id",(data.getData(4, 1385, 2)),(data.getData(4, 1386, 2))); //Sendkeys for Rank
	 	 Thread.sleep(1000);
	      	

    	dropdown(driver, "id", (data.getData(4, 1389, 2)),(data.getData(4, 1367, 2)));//Dropdown Action Type Delete
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
		Thread.sleep(2000);
		
		String Record1 = driver.findElement(By.xpath(data.getData(4, 1348, 2))).getText(); // Record
	    Thread.sleep(1000);	
	    
	    System.out.println(""+ Record);
	    Thread.sleep(1000);	
    	
    	
	}
	
		

}
