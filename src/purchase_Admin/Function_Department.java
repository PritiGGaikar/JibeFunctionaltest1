package purchase_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class Function_Department extends RW{

	 

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

	public void FunctionDepartment(WebDriver driver1) throws InterruptedException {  //(priority=29)

		WebDriver driver = driver1;
		

	     driver.get("http://192.168.1.102/JIBE/Purchase/PURC_FunctionsLibrary.aspx");      //Purchase-->Admin-->Purchase Questionnaire 
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Deprtment/Function ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}	}
	
	public void AddFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=30)

		WebDriver driver = driver1;
		
		click_element(driver, "id","ctl00_MainContent_ImgAdd"); //Click on Add New FunctionDepartment
		Thread.sleep(2000);	
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);	
		
		//Alert handling for Please Select the Requisition Type
		 Alert alert = driver.switchTo().alert();            //Alert handling for Please Select the Requisition Type
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     
		
		sendkeys(driver,"id", "ctl00_MainContent_TxtFuncName", "InformationTech"); //Sendkeys for Department/Function Name
		Thread.sleep(1000);
		
		 dropdown(driver, "id", "ctl00_MainContent_cmbReqsnType","Stores");// Dropdown -->Requisition Type  -->Stores
		 Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);	
			
			//Alert handling for Please enter Functions Short Name
			 Alert alert1= driver.switchTo().alert();            //Alert handling for Please enter Functions Short Name
		     String Alert1 = alert1.getText();    	   
		     System.out.println("Alert msg for:"+Alert1);
		     alert1.accept();
		     Thread.sleep(2000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txt_Func_SName", "IT"); //Sendkeys for Short  Department/Function Name
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);
		

		//Alert handling for Function Inserted Sucessfully
		 Alert alert2= driver.switchTo().alert();            //Alert handling for Function Inserted Sucessfully
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     Thread.sleep(2000);
	
	    click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);	
		
		//--------------Search AddedFunction--------------//
		
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "InformationTech"); //Sendkeys for Department/Function Name
		Thread.sleep(1000);
		
		dropdown(driver, "id", "ctl00_MainContent_ddlREqsnType","Stores");// Dropdown -->Requisition Type  -->Stores
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(2000);	
		
}
	public void EditFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=31)

		WebDriver driver = driver1;
		
		click_element(driver, "id","ctl00_MainContent_rgdFunc_ctl02_ImgUpdate"); //Click on Add New FunctionDepartment
		Thread.sleep(2000);	
	
		clear_element(driver, "id", "ctl00_MainContent_txt_Func_SName");// Clear Short  Department/Function Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txt_Func_SName", "ITTech"); //Sendkeys for Short  Department/Function Name
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);
		

		//Alert handling for Function Updated Successfully
		 Alert alert2= driver.switchTo().alert();            //Alert handling for Function Updated Successfully
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     Thread.sleep(2000);
	     
	     //-------------------Search edtied---------------//
	     
	    click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);	
		
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "InformationTech"); //Sendkeys for Department/Function Name
		Thread.sleep(1000);
		
		dropdown(driver, "id", "ctl00_MainContent_ddlREqsnType","Stores");// Dropdown -->Requisition Type  -->Stores
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(2000);	
				
}
	public void DeletetFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=32)

		WebDriver driver = driver1;
		
		click_element(driver, "id","ctl00_MainContent_rgdFunc_ctl02_ImgDelete"); //Click on Delete
		Thread.sleep(2000);	
		
		//Alert handling for Are you sure want to delete?
		 Alert alert2= driver.switchTo().alert();            //Alert handling for Are you sure want to delete?
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     Thread.sleep(2000);
	     

			//Alert handling for Are you sure want to delete?
			 Alert alert= driver.switchTo().alert();            //Alert handling for Are you sure want to delete?
		     String Alert = alert.getText();    	   
		     System.out.println("Alert msg for:"+Alert);
		     alert.accept();
		     Thread.sleep(2000);
		     
		     //----------------Search Delete Function------------//
		     click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
			Thread.sleep(2000);	
				
			sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "InformationTech"); //Sendkeys for Department/Function Name
			Thread.sleep(1000);
				
			dropdown(driver, "id", "ctl00_MainContent_ddlREqsnType","Stores");// Dropdown -->Requisition Type  -->Stores
			Thread.sleep(1000);
				
			click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
			Thread.sleep(2000);	
		
			String Record = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_rgdFunc']/tbody/tr/td")).getText(); // Record
			Thread.sleep(1000);	
				    
			System.out.println(""+ Record);
			Thread.sleep(1000);
				 
		   click_element(driver, "id","ctl00_MainContent_ImgExpExcel"); //Click on Export to Excel
		  Thread.sleep(2000);		
				
	}
}