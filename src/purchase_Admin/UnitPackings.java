package purchase_Admin;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class UnitPackings  extends RW{

	 
	 
	/*Technical
	PMS
	CopyRunHour*/
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

	public void UnitPacking(WebDriver driver1) throws Exception {  //(priority=11)

		WebDriver driver = driver1;
		

		     ArrayList<Row> row= data.searchSheet("UnitPackingURL",2,9);//Functn key,sheetNo.,Column no.// Xpath locator

		     ArrayList<Row> row1=data.searchSheet("UnitPackingURL", 2,0);//Functn key, sheet no,//test data excel
		 	
		    
		    
		    
		    
		    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
								  }
								}
							}
					 
					 }
					 
					
							if (row.get(i).getCell(10) != null) {

								String strControlTypeKey = row.get(i).getCell(10).toString();

								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strControl);
									Thread.sleep(2000);

								}
							
						}}}
						
		
	

	public void AddUnitPacking(WebDriver driver1) throws Exception {  //(priority=12)

		WebDriver driver = driver1;
		

	     ArrayList<Row> row= data.searchSheet("AddUnitPacking",2,9);//Functn key,sheetNo.,Column no.// Xpath locator

	     ArrayList<Row> row1=data.searchSheet("AddUnitPacking", 2,2);//Functn key, sheet no,//test data excel
	 	
	    
	    
	    
	    
	    

			for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(2).toString();
							  }
							}
						}
				 
				 }
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, "id", strControl); 
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
								dropdown(driver, "id", strControl, strValue);
								Thread.sleep(2000);

								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, "id", strControl, strValue); 
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, "id", strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, "id", strControl);
							 WindowSwitchto(driver);
							 //Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, "id", strControl); 																										
								Thread.sleep(2000);
							}

							
							if(strControlTypeKey.compareTo("SendKey_Ctrl")==0)
							{
								
							
							     String Value="";
							     
							     switch(row1.get(i).getCell(2).getCellTypeEnum()){
							     
							     case NUMERIC: 
							    	 strValue=String.valueOf(row1.get(i).getCell(2).getNumericCellValue());
							    	 break;
							     case STRING:
							    	 strValue=row1.get(i).getCell(2).getStringCellValue();
							    	 break;
							     case BOOLEAN:
							    	 strValue=String.valueOf(row1.get(i).getCell(2).getBooleanCellValue());
							    	 break;
							     default:
							    	 strValue=row1.get(i).getCell(2).getStringCellValue();
							    	 break;
							     }
							     
						      
								if(Value!="")
								{
									sendkeys(driver,"id", strControl, strValue); //Sendkeys for Group Name
									Thread.sleep(1000);
								}
							}
							
							
						
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, "id", strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, "id", strControl);
			                      Thread.sleep(2000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,"id", strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(2000);
								
							}
							
							/*if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 gettext(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}*/
					}
			}
			}
	}}

		/*click_element(driver, "id",(data.getData(5,87,2))); //Click on Add New Unit Packing
		Thread.sleep(1000);		
		
		click_element(driver, "id",(data.getData(5,88,2))); //Click on Save
		Thread.sleep(2000);
		
		
		//Alert handling for Please enter main pack
		 Alert alert = driver.switchTo().alert();            //Alert handling for Please enter main pack
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
		
		sendkeys(driver,"id", (data.getData(5,89,2)), (data.getData(5,90,2))); //Sendkeys for Main Pack
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,91,2))); //Click on Save
		Thread.sleep(1000);
		
		//Alert handling for enter Abbreviation.
		 Alert alert1 = driver.switchTo().alert();            //Alert handling forenter Abbreviation.
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     Thread.sleep(2000);
		
		sendkeys(driver,"id", (data.getData(5,92,2)), (data.getData(5,93,2))); //Sendkeys for Abbreviation  
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,94,2))); //Click on Save
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,87,2))); //Click on Add New Unit Packing
		Thread.sleep(1000);	
		
		sendkeys(driver,"id", (data.getData(5,89,2)), (data.getData(5,90,2))); //Sendkeys for Main Pack
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,92,2)), (data.getData(5,93,2))); //Sendkeys for Abbreviation  
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,91,2))); //Click on Save
		Thread.sleep(1000);
		
		//Alert handling for Unit already exists
		 Alert alert2 = driver.switchTo().alert();            //Alert handling for Unit already exists.
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     Thread.sleep(2000);*/
/*
	public void EditUnitPacking(WebDriver driver1) throws Exception {  //(priority=13)

		WebDriver driver = driver1;
		
		click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(1000);
	
		clear_element(driver, "id", (data.getData(5,95,2)));// Clear Main Pack / Abbreviation
		Thread.sleep(1000);
		
		sendkeys(driver,"id",(data.getData(5,96,2)), (data.getData(5,97,2))); //Sendkeys for Pack / Abbreviation
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,98,2))); //Click on Search
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,99,2))); //Click on Edit
		Thread.sleep(3000);
		
		clear_element(driver, "id", (data.getData(5,100,2)));// Clear Abbreviation  
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,101,2)), (data.getData(5,102,2))); //Sendkeys for Abbreviation  
		Thread.sleep(1000);
	
		click_element(driver, "id",(data.getData(5,103,2))); //Click on Save
		Thread.sleep(1000);
		
	}	
	
	public void DeletetUnitPacking(WebDriver driver1) throws Exception {  //(priority=14)

		WebDriver driver = driver1;
		
		click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(1000);
		
		clear_element(driver, "id",(data.getData(5,104,2)));// Clear Main Pack / Abbreviation
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,105,2)), (data.getData(5,106,2))); //Sendkeys for Pack / Abbreviation
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,107,2))); //Click on Search
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,108,2))); //Click on Delete
		Thread.sleep(3000);
		

		//Alert handling for Delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for Delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	     //------------------------Search Deleted-----------------//
	     
	     click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
	     Thread.sleep(1000);
	     
	     sendkeys(driver,"id", (data.getData(5,105,2)), (data.getData(5,106,2))); //Sendkeys for Pack / Abbreviation
		Thread.sleep(1000);
			
		click_element(driver, "id",(data.getData(5,107,2))); //Click on Search
		Thread.sleep(1000);
		

		 String Record = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_rgdUnitPakings']/tbody/tr/td")).getText(); //  Record
		 Thread.sleep(3000);																						
		 System.out.println(Record);
		 Thread.sleep(3000);	
		
	     click_element(driver, "id",(data.getData(5,109,2))); //Click on Export to Excel
		 Thread.sleep(2000);
	}		
}*/