package technical_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class FunctionLibrary  extends RW {
	
	
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
     	Function Library*/
     	public void FunctionsLibrary(WebDriver driver1) throws Exception {  //(priority=0)

           	WebDriver driver = driver1;	
           	
            driver.get("http://192.168.1.202/STG_OSG/Technical/PMS/PMSFunctionsLibraryPage.aspx");  //Technical-->Admin--> 	Alarm Unit     
		     Thread.sleep(2000);
		     
		 	String actualTitle = driver.getTitle().trim();
		 	String expectedTitle = " 	Functions Library ".trim();
		 	Assert.assertEquals(expectedTitle,actualTitle);
			
		 	if(expectedTitle.equals(actualTitle)){
		 		System.out.println("Title Match");
		 		Thread.sleep(2000);
		 	}	else{
		 		System.out.println("Title does not Match");
		 		Thread.sleep(2000);	
		 		
		 	} 	
         
           /*	WebElement technical = driver.findElement(By.linkText(data.getData(4, 1391, 2))); // pathfor "Technical"s
     		Actions action = new Actions(driver);
     		action.moveToElement(technical).build().perform();
     		Thread.sleep(2000);

     		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1392, 2)));// path for Admin
     		action.moveToElement(Admin).build().perform();
     		Thread.sleep(2000);
     		
     		WebElement FunctionLibrary = driver.findElement(By.linkText(data.getData(4, 1393, 2))); // path for Function Library
     		FunctionLibrary.click();
  		    Thread.sleep(5000);*/
     		
     	}
     	
     	
     	public void AddFunction(WebDriver driver1) throws Exception {  //(priority=1)

           	WebDriver driver = driver1;	
         	Thread.sleep(2000);
         	
           	click_element( driver, "id",(data.getData(4, 1394, 2)));  //path for add Function
           	Thread.sleep(1000);
   
           	sendkeys( driver,"xpath",(data.getData(4, 1395, 2)), (data.getData(4, 1396, 2)));  //Sendkye for Function name
     		Thread.sleep(1000);
     		
     		click_element( driver, "id",(data.getData(4, 1399, 2)));  //path for save button
           	Thread.sleep(2000);
      
           	 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for FPlease Enter Short Code.
      	     String Alert1 = alert1.getText();
      	     System.out.println("Alert msg for:"+Alert1);
      	     alert1.accept();
      		Thread.sleep(1000);
      		
     		sendkeys( driver,"xpath",(data.getData(4, 1397, 2)), (data.getData(4, 1398, 2)));  //Path for short code-9867
     		Thread.sleep(2000);
     	
     		click_element( driver, "id",(data.getData(4, 1399, 2)));  //path for save button
           	Thread.sleep(1000);
      
           	Alert alert2 = driver.switchTo().alert();                                         //Alert handling for Function saved successfully
      	     String Alert2 = alert2.getText();
      	     System.out.println("Alert msg for:"+Alert2);
      	     alert2.accept();      	
      	     Thread.sleep(1000);
      	     
      		click_element( driver, "id",(data.getData(4, 1417, 2)));  //path for Refresh
           	Thread.sleep(2000);

           	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1396, 2)));  //Path for Function name-
     		Thread.sleep(1000);
     		
     		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
           	Thread.sleep(1000);
     	}     	
     	
     	
     	
     	public void EditFunction(WebDriver driver1) throws Exception {  //(priority=2)

           	WebDriver driver = driver1;
         
           	click_element( driver, "id",(data.getData(4, 1417, 2)));  //path for Refresh
           	Thread.sleep(1000);
           	
           	sendkeys( driver,"id",(data.getData(4, 1418, 2)), (data.getData(4, 1396, 2)));  //Path for name
     		Thread.sleep(1000);    	
           	
     		click_element( driver, "id",(data.getData(4, 1420, 2)));  //path for Search button
           	Thread.sleep(1000);
         
           	click_element( driver, "id",(data.getData(4, 1421, 2)));  //path for Edit 
           	Thread.sleep(1000);
       
           	clear_element( driver, "id", (data.getData(4, 1422, 2))); //Clear Function Name
         	Thread.sleep(1000);
     
           	sendkeys( driver,"xpath",(data.getData(4, 1423, 2)), (data.getData(4, 1424, 2)));  //Sendkye for Edit Function name
     		Thread.sleep(1000);
     		    		
     		click_element( driver, "id",(data.getData(4, 1425, 2)));  //path for save button
           	Thread.sleep(1000);
           
           	
           	Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Function saved successfully
      	     String Alert1 = alert1.getText();
      	     System.out.println("Alert msg for:"+Alert1);
      	     alert1.accept();
      	     Thread.sleep(4000);
      	     
      	     //----------Search Edited Function---------//
      	     
      		click_element( driver, "id",(data.getData(4, 1417, 2)));  //path for Refresh
           	Thread.sleep(1000);
           	          	          	
        	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1424, 2)));  //Sendkye for Edit Function name
     		Thread.sleep(1000);
     	
     		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
           	Thread.sleep(2000);
     	
           	click_element( driver, "id",(data.getData(4, 1404, 2)));  //path for Action
           	Thread.sleep(2000);
           	
           	WebElement e = driver.findElement(By.xpath(data.getData(4, 1402, 2)));   // Close  
            JavascriptExecutor exe = (JavascriptExecutor) driver;
            exe.executeScript("arguments[0].click();", e);

     	}  
     	public void DeleteFunction(WebDriver driver1) throws Exception {  //(priority=3)

           	WebDriver driver = driver1;
           

     	click_element( driver, "id",(data.getData(4, 1426, 2)));  //path for Refresh
       	Thread.sleep(1000);
      	
       	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1424, 2)));  //Path for Function name
 		Thread.sleep(1000);
 				
 		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
       	Thread.sleep(1000);
       	
       	click_element( driver, "id",(data.getData(4, 1430, 2)));  //path for Delete
       	Thread.sleep(2000);
      
       	Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Delet Function 
  	     String Alert1 = alert1.getText();
  	     System.out.println("Alert msg for:"+Alert1);
  	     alert1.accept();
  	     Thread.sleep(2000);
  	     
  	    Alert alert = driver.switchTo().alert();                                         //Alert handling for Delete Function 
 	     String Alert = alert.getText();
 	     System.out.println("Alert msg for:"+Alert);
 	     alert.accept(); 
 	     Thread.sleep(2000);
 	     
 	    click_element( driver, "id",(data.getData(4, 1426, 2)));  //path for Refresh
       	Thread.sleep(2000);

       	
       	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1424, 2)));  //Path for Function name
 		Thread.sleep(2000);
 		
 		
 		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
       	Thread.sleep(2000);
 	     
       	String Record = driver.findElement(By.xpath(data.getData(4, 1454, 2))).getText(); // Record
        Thread.sleep(1000);	
        
        System.out.println(""+ Record);
        Thread.sleep(1000);	 

  }
     	
           	
}

