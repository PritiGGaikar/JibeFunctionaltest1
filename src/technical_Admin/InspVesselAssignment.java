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

public class InspVesselAssignment extends RW{

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
	
	public void VesselAssignment(WebDriver driver1) throws InterruptedException {         //(priority=0)

		WebDriver driver = driver1;
		
		  driver.get("http://192.168.1.202/STG_OSG/Infrastructure/Libraries/InspectionUserVessel.aspx");  //Technical-->Admin-->AlarmEffects    
		     Thread.sleep(2000);
		     
		 	String actualTitle = driver.getTitle().trim();
		 	String expectedTitle = " 	Inspection ".trim();
		 	Assert.assertEquals(expectedTitle,actualTitle);
			
		 	if(expectedTitle.equals(actualTitle)){
		 		System.out.println("Title Match");
		 		Thread.sleep(2000);
		 	}	else{
		 		System.out.println("Title does not Match");
		 		Thread.sleep(2000);	
		 		
		 	}
		
		/*WebElement technical = driver.findElement(By.linkText(data.getData(4, 1250, 2))); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		Thread.sleep(2000);
		

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1251, 2)));// path for Admin																					
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);

		WebElement VesselAssignment = driver.findElement(By.linkText(data.getData(4, 1252, 2))); // path for Insp Vessel Assignment
		VesselAssignment.click();	
		Thread.sleep(3000);*/
		
	}
	public void SaveVesselAssignment(WebDriver driver1) throws Exception {         //(priority=1)

		WebDriver driver = driver1;
	
		
	click_element(driver, "id",data.getData(4, 1257, 2)); //Click on save Vessel Assignment
	Thread.sleep(1000);
		

		//Alert handling for Please select user
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please select user
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);	
	
	dropdown(driver, "id",data.getData(4, 1253, 2),data.getData(4, 1254, 2));// Dropdown -->Fleet-->Fleet-B
	Thread.sleep(1000);
	
	checkbox_element(driver, "id",data.getData(4, 1255, 2)); //checkbox  for IMARA
	Thread.sleep(1000);
	
	checkbox_element(driver, "id",data.getData(4, 1256, 2)); //checkbox  for TestA
	Thread.sleep(1000);
	
	click_element(driver, "id",data.getData(4, 1257, 2)); //Click on save Vessel Assignment
	Thread.sleep(1000);
	

	//Alert handling for Please select user
	 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Please select user
     String Alert1 = alert1.getText();    	   
     System.out.println("Alert msg for:"+Alert1);
     alert1.accept();
     Thread.sleep(2000);
	
    click_element(driver, "xpath",data.getData(4, 1258, 2)); //Click Search User
 	Thread.sleep(1000);
	
 	click_element(driver, "id",data.getData(4, 1259, 2)); //Click on save Vessel Assignment
	Thread.sleep(1000);
	
	//Alert handling for Vessel assignment is saved successfully.
	 Alert alert2 = driver.switchTo().alert();                                         //Alert handling for Vessel assignment is saved successfully.
    String Alert2 = alert2.getText();    	   
    System.out.println("Alert msg for:"+Alert2);
    alert2.accept();
    Thread.sleep(2000);
	
	}    
    
    
    public void SaveVesselAssignment1(WebDriver driver1) throws Exception {         //(priority=2)

		WebDriver driver = driver1;
	
    

	dropdown(driver, "id", data.getData(4, 1260, 2),data.getData(4, 1261, 2));// Dropdown -->Fleet-->Fleet-B
	Thread.sleep(1000);
	
	checkbox_element(driver, "id",data.getData(4, 1262, 2)); //checkbox  for Select All
	Thread.sleep(1000);
	
	click_element(driver, "id",data.getData(4, 1263, 2)); //Click on save Vessel Assignment
	Thread.sleep(1000);
	

	//Alert handling for Please select user
	 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please select user
     String Alert = alert.getText();    	   
     System.out.println("Alert msg for:"+Alert);
     alert.accept();
     Thread.sleep(2000);
	
    click_element(driver, "xpath",data.getData(4, 1264, 2)); //Click Search User
 	Thread.sleep(1000);
	
 	click_element(driver, "id",data.getData(4, 1265, 2)); //Click on save Vessel Assignment
	Thread.sleep(1000);
	
	//Alert handling for Vessel assignment is saved successfully.
	 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Vessel assignment is saved successfully.
    String Alert1 = alert1.getText();    	   
    System.out.println("Alert msg for:"+Alert1);
    alert1.accept();
    Thread.sleep(2000);
	
	
	
}
}