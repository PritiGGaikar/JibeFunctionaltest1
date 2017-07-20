package purchase_Admin;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ApprovalSetting extends RW{

	 

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

	public void ApprovalSettings(WebDriver driver1) throws InterruptedException {  //(priority=27)

		WebDriver driver = driver1;
		

	     driver.get("http://192.168.1.102/JIBE/PO_LOG/Approval_Setting.aspx");      //Purchase-->Admin-->Purchase Questionnaire 
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Approval Setting ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
		
		/*WebElement technical = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																				
		Admin.click();		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement ApprovalSetting  = driver.findElement(By.linkText(data.getData(5,196,2))); // path for Approval Setting
		ApprovalSetting.click();    	
		Thread.sleep(3000);*/
		
	}

	@SuppressWarnings("unused")
	public void AddNewGroup(WebDriver driver1) throws Exception {  //(priority=28)

		WebDriver driver = driver1;
		ArrayList<Row> row= data.searchSheet("F7", 10,9);
	
		for(int i=0;i<row.size();i++)
		{
				String strControl=row.get(i).getCell(2).getStringCellValue();
				if(row.get(i).getCell(10)!=null)
				{
						
					
					String strControlTypeKey=row.get(i).getCell(10).toString();

					if(strControlTypeKey.compareTo("C11")!=0)
					{
							if(strControlTypeKey.compareTo("C2")==0)
								{
									click_element(driver, "id",strControl); //Click on Add New Group
									Thread.sleep(2000);
								}
							

							
								if(strControlTypeKey.compareTo("C3")==0)
								{
									dropdown(driver, "id", strControl,row.get(i+1).getCell(2).getStringCellValue());// Dropdown -->PO Type  -->Contract
									Thread.sleep(2000);	
									
									//System.out.println("Here");
								}
								
								if(strControlTypeKey.compareTo("C4")==0)
								{
									sendkeys(driver,"id", strControl, row.get(i+1).getCell(2).getStringCellValue()); //Sendkeys for Group Name
									Thread.sleep(1000);
								}
							
						
						}
				}
				
				
				
				
		}
		
	
		
		/*dropdown(driver, "id", (data.getData(5,198,2)),(data.getData(5,199,2)));// Dropdown -->PO Type  -->Contract
		Thread.sleep(1000);
		
		
		click_element(driver, "id",(data.getData(5,200,2))); //Click on Group Name
		Thread.sleep(2000);	
		
		sendkeys(driver,"id", (data.getData(5,201,2)), (data.getData(5,202,2))); //Sendkeys for Group Name
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,203,2))); //Click on Save
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,204,2))); //Click on close Popupbutton
		Thread.sleep(2000);
		*/
}}
