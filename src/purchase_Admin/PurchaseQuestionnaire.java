package purchase_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import common_Function.RW;
public class PurchaseQuestionnaire extends RW{

	 

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	report = new ExtentReports(path.concat("Report\\Purchase_Admin_Report.html"));
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}

	public void PurchaseQuestionnair(WebDriver driver1) throws InterruptedException {  //(priority=15)

		WebDriver driver = driver1;
		

	     driver.get("http://192.168.1.102/JIBE/Purchase/Purchase_Questionnaire.aspx");      //Purchase-->Admin-->Purchase Questionnaire 
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Purchase Questionnaire ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
		/*
		WebElement technical = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																					
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement PurchaseQuestionnaire= driver.findElement(By.linkText(data.getData(5,112,2))); // path for Purchase Questionnaire  
		PurchaseQuestionnaire.click();    	
		Thread.sleep(3000);*/
		
	}

	public void AddNewQuestion(WebDriver driver1) throws Exception {  //(priority=16)

		WebDriver driver = driver1;
		

		click_element(driver, "id",(data.getData(5,113,2))); //Click on Add New Question
		Thread.sleep(2000);	
				
		clear_element(driver, "id",(data.getData(5,114,2)));// Clear Question
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,115,2)), (data.getData(5,116,2))); //Sendkeys for Question
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,117,2))); //Click on Save and close
		Thread.sleep(2000);	
		
		//Alert handling for Select Requisition Type
		 Alert alert = driver.switchTo().alert();            //Alert handling for Select Requisition Type
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     		
		
		dropdown(driver, "id", (data.getData(5,118,2)),(data.getData(5,119,2)));// Dropdown -->RequisitionType -->Office
		Thread.sleep(1000);
		

		click_element(driver, "id",(data.getData(5,120,2))); //Click on Save and close
		Thread.sleep(2000);	
		
		//Alert handling for Select Grading Type
		 Alert alert1 = driver.switchTo().alert();            //Alert handling for Select Grading Type
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     Thread.sleep(2000);

		
		dropdown(driver, "id", (data.getData(5,121,2)),(data.getData(5,122,2)));// Dropdown -->GradingType -->Yes or No
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,123,2))); //Click on Save and Add New
		Thread.sleep(2000);	
		
		clear_element(driver, "id", (data.getData(5,124,2)));// Clear Question
		Thread.sleep(1000);
		
		sendkeys(driver,"id",(data.getData(5,124,2)), (data.getData(5,116,2))); //Sendkeys for Question
		Thread.sleep(1000);
		
		dropdown(driver, "id",(data.getData(5,126,2)),(data.getData(5,127,2)));// Dropdown -->RequisitionType -->Office
		Thread.sleep(1000);
		
		dropdown(driver, "id", (data.getData(5,121,2)),(data.getData(5,122,2)));// Dropdown -->GradingType -->Yes or No
		Thread.sleep(1000);
		
		

		click_element(driver, "id",(data.getData(5,130,2))); //Click on Save and close
		Thread.sleep(2000);	
		
		//--------------------------------Verify Added Question-------------------//
		
		dropdown(driver, "id","ctl00_MainContent_ddlCategory","Office");// Dropdown -->Requisition Type:  -->Office
		Thread.sleep(1000);
		
		clear_element(driver, "id", (data.getData(5,133,2)));// Clear Search
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,134,2)), (data.getData(5,116,2))); //Sendkeys for Search
		Thread.sleep(2000);
		
		/*clear_element(driver, "id", (data.getData(5,136,2)));// Clear Search
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,137,2)), (data.getData(5,138,2))); //Sendkeys for Search
		Thread.sleep(2000);*/
		
}
	public void DeleteNewQuestion(WebDriver driver1) throws Exception {  //(priority=17)

		WebDriver driver = driver1;
		
	/*	dropdown(driver, "id", (data.getData(5,139,2)),(data.getData(5,140,2)));// Dropdown -->GradingType -->Office
		Thread.sleep(1000);
		
		clear_element(driver, "id", (data.getData(5,141,2)));// Clear Search
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,142,2)), (data.getData(5,116,2))); //Sendkeys for Search
		Thread.sleep(2000);*/
		
		click_element(driver, "id",(data.getData(5,144,2))); //Click on Delete
		Thread.sleep(2000);
		
		//Alert handling for Are you sure, you want to  delete ?
		 Alert alert = driver.switchTo().alert();            //Alert handling for Are you sure, you want to  delete ?
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     
	     dropdown(driver, "id", (data.getData(5,145,2)),(data.getData(5,146,2)));// Dropdown -->GradingType -->Office
		Thread.sleep(1000);
			
		clear_element(driver, "id", (data.getData(5,147,2)));// Clear Search
		Thread.sleep(1000);
			
		sendkeys(driver,"id", (data.getData(5,148,2)), (data.getData(5,125,2))); //Sendkeys for Search
		Thread.sleep(4000);
			
		/*click_element(driver, "id",(data.getData(5,150,2))); //Click on Delete
		Thread.sleep(2000);
			
			//Alert handling for Are you sure, you want to  delete ?
			 Alert alert1 = driver.switchTo().alert();            //Alert handling for Are you sure, you want to  delete ?
		     String Alert1 = alerodt1.getText();    	   
		     System.out.println("Alert msg for:"+Alert1);
		     alert1.accept();
		     Thread.sleep(2000);*/
	}
		
	public void AddNewGrade(WebDriver driver1) throws Exception {  //(priority=18)

		WebDriver driver = driver1;
		
		
		click_element(driver, "id",data.getData(5,207,2)); //Click on Add new Grade
		Thread.sleep(2000);		
		
		sendkeys(driver,"id", data.getData(5,208,2), data.getData(5,209,2)); //Sendkeys for Grade
		Thread.sleep(1000);
		
		click_element(driver, "id",data.getData(5,210,2)); //Click on Save and  Close
		Thread.sleep(2000);
		
		//Alert handling forSelect Options
		 Alert alert = driver.switchTo().alert();            //Alert handling for Select Options
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
		
		dropdown(driver, "id", data.getData(5,211,2), data.getData(5,212,2));// Dropdown -->No of options -->3
		Thread.sleep(1000);

		clear_element(driver, "id", data.getData(5,213,2));// Clear Text
		Thread.sleep(1000);
			
		sendkeys(driver,"id", data.getData(5,214,2), data.getData(5,215,2)); //Sendkeys for Text
		Thread.sleep(2000);
		
		clear_element(driver, "id", data.getData(5,216,2));// Clear Value
		Thread.sleep(1000);
			
		sendkeys(driver,"id", data.getData(5,217,2), data.getData(5,218,2)); //Sendkeys for Value
		Thread.sleep(2000);
		
		click_element(driver, "id",data.getData(5,219,2)); //Click on Save and  Close
		Thread.sleep(2000);
		
		
	}
	

	public void DeleteAddedNewGrade(WebDriver driver1) throws Exception {  //(priority=19)

		WebDriver driver = driver1;
		
		click_element(driver, "id",data.getData(5,220,2)); //Click on Delete
		Thread.sleep(2000);	
		
		//Alert handling for Delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for Delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     
	    
	}

}