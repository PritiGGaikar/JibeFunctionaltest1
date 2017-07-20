package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class TrainingTypes extends RW{
	private static ExtentReports report;
	  //------------------------------------------------------Report----------------------------------------------------------------------------------//  
	    public synchronized static ExtentReports getReporter(String filePath) { ////allow only one thread to access the shared resource,To prevent thread interference.
	    	if (report == null) {
		        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html", false);
		        
		        report
		            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
		            .addSystemInfo("Environment", "QA");
	        }
	        
	        return report;
	    }	
	  //-----------------------------------------------------------"mouse hover Crew Sign Off Reason"-------------------------------------------------------------//

	  		public void Adminm(WebDriver driver1) throws InterruptedException {
	  			WebDriver driver = driver1;

		// Select "crew" module
		WebElement crewm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
		Actions action = new Actions(driver);
		action.moveToElement(crewm).build().perform();
		action.moveToElement(crewm).perform();
		Thread.sleep(2000);

		// Select "admin"
		WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
		admin.click();
		action.moveToElement(admin).build().perform();

		// Select "Training Types"
		WebElement TrainingTypes = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[7]/a/span"));
		TrainingTypes.click();
		Thread.sleep(5000);
	  	}
	  		
	  		
//---------------------------------------"Training Types"---------------------------------------------------------------------------//
		  	
	  		public void addTrainingTypes(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;
	
	   
	  		// click "Training Types "
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAdd']");
	  		Thread.sleep(4000);	
	  		
	                                        //***************Alert capturing for mandatory fields******************//
			
			//****** Training Types ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
			
			 // Alert of "Training Types"
		    Alert TrainingTypes = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert1 = TrainingTypes.getText();
		    System.out.println(" alert :" + Alert1);
		    Thread.sleep(2000);
		    TrainingTypes.accept();
		    Thread.sleep(2000);
		    
		    //Enter "Training Types"
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtTrainingType']", "XYZ");
			Thread.sleep(1000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
			
			//creating variable for checking record
			String addrecord=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
			System.out.println("Record :" +addrecord);
}
	  //---------------------------------------"search"---------------------------------------------------------------------------//  		
	  		public void search(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;	
			
			
		    //search by "Search"
	  		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtFilter_TrainingType']", "XYZ");
			Thread.sleep(1000);
				
		    //click on "search" button
		    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
		    Thread.sleep(1000);	
	  		
		  //click on refresh
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
			Thread.sleep(1000);
			
		    //click on "edit" button
		    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvTrainingTypes_ctl03_ImgUpdate']");
		    Thread.sleep(1000);	
		    
		    //Enter "Training Types"
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtTrainingType']", "123");
			Thread.sleep(1000);
					
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
	  		
			//click on refresh
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
			Thread.sleep(1000);
			
	  		//click on delete
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvTrainingTypes_ctl03_ImgDelete']");
			Thread.sleep(3000);
	  		
			 // Alert of "Training Types"
		    Alert TrainingTypes = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert1 = TrainingTypes.getText();
		    System.out.println(" alert :" + Alert1);
		    Thread.sleep(1000);
		    TrainingTypes.accept();
		    Thread.sleep(1000);
	  
	  		//click on refresh
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
			Thread.sleep(1000);
	  		
			//creating variable for checking record
			String record=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
			System.out.println("Record :" +record);
			
			//click on export excel
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExpExcel']");
			Thread.sleep(1000);
			
			

	  		}}
