package purchase_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ItemCategory  extends RW{

	 

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
	public void ItemCategorys(WebDriver driver1) throws InterruptedException {  //(priority=33)

		WebDriver driver = driver1;
		

	     driver.get("http://192.168.1.102/JIBE/Purchase/PURC_ItemCategoryLibrary.aspx");      //Purchase-->Admin-->Purchase Questionnaire 
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	ItemCategory ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}	}
	public void AddNewCategory(WebDriver driver1) throws Exception {  //(priority=34)

		WebDriver driver = driver1;
		
		click_element(driver, "id","ctl00_MainContent_ImgAdd"); //Click on Add Category
		Thread.sleep(2000);	
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);	
		
		//Alert handling for Please Select the Category Type
		 Alert alert = driver.switchTo().alert();            //Alert handling for Please Select the Category Type
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     
		
		sendkeys(driver,"id", "ctl00_MainContent_TxtCatName", "JibeCategory"); //Sendkeys for Category Name 
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);	
		
		//Alert handling for Please Select the Category Type
		 Alert alert1 = driver.switchTo().alert();            //Alert handling for Please Select the Category Type
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     Thread.sleep(2000);
		
		 dropdown(driver, "id", "ctl00_MainContent_ddlcatType","ItemCategory");// Dropdown -->Category Type  -->ItemCategory
		 Thread.sleep(1000);
		
		 click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);		
			
			//Alert handling for Please enter Functions Short Name
			 Alert alert2= driver.switchTo().alert();            //Alert handling for Please enter Functions Short Name
		     String Alert2 = alert2.getText();    	   
		     System.out.println("Alert msg for:"+Alert2);
		     alert2.accept();
		     Thread.sleep(2000);
		
		sendkeys(driver,"id", "ctl00_MainContent_TxtShrtName", "22"); //Sendkeys for Category Short Code
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);	
		

		//Alert handling forItem Category Added
		 Alert alert3= driver.switchTo().alert();            //Alert handling for Item Category Added
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     Thread.sleep(2000);
	
	     //-----------Search Added-----------------//
	     
	    click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);	
		
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "JibeCategory"); //Sendkeys for Item Category Name
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(2000);	
	}	
		public void EditNewCategory(WebDriver driver1) throws Exception {  //(priority=34)

			WebDriver driver = driver1;	
		
		click_element(driver, "id","ctl00_MainContent_rgdItmCat_ctl02_ImgUpdate"); //Click on Edit
		Thread.sleep(2000);	
		
		clear_element(driver, "id", "ctl00_MainContent_TxtCatName");// Clear Category Name
		Thread.sleep(1000);
			
		sendkeys(driver,"id", "ctl00_MainContent_TxtCatName", "JibeDevelopment"); //Sendkeys for Category Name
		Thread.sleep(2000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(3000);
		
		//Alert handling for Item Category Updated Successfully
		 Alert alert3= driver.switchTo().alert();            //Alert handling for Item Category Updated Successfully
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     Thread.sleep(2000);
	     
	     //------Search Eddited----------------//
	     
	   
		click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);	
			
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "JibeDevelopment"); //Sendkeys for Item Category Name
		Thread.sleep(1000);
			
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(2000);	  
	}
		public void DeleteCategory(WebDriver driver1) throws Exception {  //(priority=34)

			WebDriver driver = driver1;	
		
		click_element(driver, "id","ctl00_MainContent_rgdItmCat_ctl02_ImgDelete"); //Click on Delete
		Thread.sleep(2000);	
		
		//Alert handling for Are you sure want to delete?
		 Alert alert3= driver.switchTo().alert();            //Alert handling for Are you sure want to delete?
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     Thread.sleep(2000);
	     
	   //Alert handling for Please enter Functions Short Name
		 Alert alert2= driver.switchTo().alert();            //Alert handling for Please enter Functions Short Name
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     Thread.sleep(2000);
	     
	     //------Search Deleted----------------//
	     
		   
		click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);	
				
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "JibeDevelopment"); //Sendkeys for Item Category Name
		Thread.sleep(1000);
				
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(2000);	  
		
		String Record = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_rgdItmCat']/tbody/tr/td")).getText(); // Record
		Thread.sleep(1000);	
			    
		System.out.println(""+ Record);
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgExpExcel"); //Click on Export to Excel
		Thread.sleep(2000);
		}
}
