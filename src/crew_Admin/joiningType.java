package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class joiningType extends RW{
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
	  //-----------------------------------------------------------"mouse hover joining type"-------------------------------------------------------------//

	  		public void Adminm(WebDriver driver1) throws InterruptedException {
	  			WebDriver driver = driver1;

	  				// Select "admin" module
	  				WebElement adminm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
	  				Actions action = new Actions(driver);
	  				action.moveToElement(adminm).build().perform();
	  				action.moveToElement(adminm).perform();
	  				Thread.sleep(2000);

	  				// Select "admin"
	  				WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
	  				admin.click();
	  				action.moveToElement(admin).build().perform();

	  				// Select "joining type"
	  				WebElement joiningtype = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[3]/a/span"));
	  				joiningtype.click();
	  				Thread.sleep(5000);
	  			}
	  //---------------------------------------"Add new joining type"---------------------------------------------------------------------------//
	  	
	  		public void addrank(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;
	
	   
	  		// click "Add new joining type "
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAdd']");
	  		Thread.sleep(4000);	
	  		
	                                        //***************Alert capturing for mandatory fields******************//
			
			//****** joining type ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
			
		    // Alert of "enter joining type."
		    Alert enterjoiningtype = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert1 = enterjoiningtype.getText();
		    System.out.println(" alert :" + Alert1);
		    Thread.sleep(2000);
		    enterjoiningtype.accept();
		    Thread.sleep(2000);
		    
		    //Enter joining type
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtJoiningType']", "Test@12!$%");
			Thread.sleep(3000);
			
			//****** joining code ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
			
			  // Alert of "joining code"
		    Alert rankshortname = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert = rankshortname.getText();
		    System.out.println(" alert :" + Alert);
		    Thread.sleep(2000);
		    rankshortname.accept();
		    Thread.sleep(2000);
			
		    //Enter joining code
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtJoiningCode']", "Test@!&");
			Thread.sleep(3000);
			
			//select "seniority considered" checkbox
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkSeniorityConsidered']");
			Thread.sleep(3000);
			
			//Enter "Vessel Portage Bill Considered"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkVessselPBill_Considered']");
			Thread.sleep(3000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
			
			   
		    //verifying job count
		   String record=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
		   System.out.println("record:-  " +record);
	  		}
	  		
	  	//---------------------------------------"search"---------------------------------------------------------------------------//
			public void search(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;	
			
			
		    //search by "joining type" 
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "Test@12!$%");
			Thread.sleep(3000);
						
		    //click on "search" button
		    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
		    Thread.sleep(3000);
			   
			//click on "edit" button
	    	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvJoiningType_ctl02_ImgUpdate']");
			Thread.sleep(3000);	 
			
			//Enter "Operator Exp Considered"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_chkOperatorExp']");
			Thread.sleep(3000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(3000);
			
			//click on "info"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvJoiningType_ctl02_imgRecordInfo']");
			Thread.sleep(3000);
			
			//click on "exit"
			click_element(driver, "xpath", ".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img");
			Thread.sleep(3000);
			
			//click on refresh
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
			Thread.sleep(3000);
	  		}
			
	//-----------------------------------------"delete rank category"----------------------------------------------------------------------//
			 public void delete(WebDriver driver1) throws Exception {
				  WebDriver driver = driver1;
			
			//Enter "joining type"
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "Test@12!$%");
			Thread.sleep(3000);
			
			//click on search
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
			Thread.sleep(3000);
			
			//click on "delete" button
		 	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvJoiningType_ctl02_ImgDelete']");
			Thread.sleep(3000);

			 // Alert of "delete."
		    Alert deletejoiningtype = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert = deletejoiningtype.getText();
		    System.out.println(" alert :" + Alert);
		    Thread.sleep(2000);
		    deletejoiningtype.accept();
		    Thread.sleep(2000);

		    
	       //click on "Refresh" button
		   click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
		   Thread.sleep(3000);
		   
		   //verifying job count
		   String verifyrecord=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
		   System.out.println("record:-  " +verifyrecord);
			 }
   //-----------------------------------------"export excel"----------------------------------------------------------------------//
			 public void exportexcel(WebDriver driver1) throws Exception {
				  WebDriver driver = driver1;

				//click on "export excel" button
			     click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExpExcel']");
				 Thread.sleep(4000);
			 }
			
			
	//********************************************************** "Permanent status"*****************************************************************//		
				 public void addPermanentStatus (WebDriver driver1) throws Exception {
			  			WebDriver driver = driver1;
			
			   
			  		// click "Add new Permanent Status "
			  		click_element(driver, "xpath", ".//*[@id='ImgbtnAddBranch']");
			  		Thread.sleep(4000);	
			  		
			                                        //***************Alert capturing for mandatory fields******************//
					
					//****** Permanent Status ************//
					
					//click on "save" button
					click_element(driver, "xpath", ".//*[@id='btnSavePermanent']");
					Thread.sleep(3000);
					
				    // Alert of "Permanent Status"
				    Alert PermanentStatus = driver.switchTo().alert();
				    // To read the text from alert
				    String Alert1 = PermanentStatus.getText();
				    System.out.println(" alert :" + Alert1);
				    Thread.sleep(2000);
				    PermanentStatus.accept();
				    Thread.sleep(2000);
				    
				    //Enter Permanent Status
					sendkeys(driver, "xpath", ".//*[@id='txtPermanent']", "abc@12!$%");
					Thread.sleep(3000);
					
					//click on "save" button
					click_element(driver, "xpath", ".//*[@id='btnSavePermanent']");
					Thread.sleep(3000);
					
					 // Alert of "Permanent Status"
				    Alert PermanentStatussaved = driver.switchTo().alert();
				    // To read the text from alert
				    String Alert2 = PermanentStatussaved.getText();
				    System.out.println(" alert :" + Alert2);
				    Thread.sleep(2000);
				    PermanentStatussaved.accept();
				    Thread.sleep(2000);
				    
					 //verifying job count
					   String addrecord=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerPermanent_lblTotalPages']")).getText();
					   System.out.println("record:-  " +addrecord);
				 }
	//---------------------------------------"search Permanent Status"---------------------------------------------------------------------------//	
					public void searchPermanentStatus(WebDriver driver1) throws Exception {
			  			WebDriver driver = driver1;	
					
					
				    //search by "Permanent Status" 
					sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtPermanentFilter']", "abc@12!$%");
					Thread.sleep(3000);
								
				    //click on "search" button
				    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgbtnFilterBranch']");
				    Thread.sleep(3000);
					   
					//click on "edit" button
			    	click_element(driver, "xpath", ".//*[@id='Edit']");
					Thread.sleep(3000);	 
					/*
					//search by "Permanent Status" 
					sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtPermanentFilter']", "12");
					Thread.sleep(3000);*/
					
					 //click on "save" button
					click_element(driver, "xpath", ".//*[@id='btnSavePermanent']");
					Thread.sleep(3000);
						
					// Alert of "Permanent Status"
				    Alert updatesuccessfully = driver.switchTo().alert();
				    // To read the text from alert
				    String Alert1 = updatesuccessfully.getText();
				    System.out.println(" alert :" + Alert1);
				    Thread.sleep(2000);
				    updatesuccessfully.accept();
				    Thread.sleep(2000);
				
					
					//click on "info"
					click_element(driver, "xpath", ".//*[@id='imgRecordInfo2']");
					Thread.sleep(3000);
					
					//click on "exit"
					click_element(driver, "xpath", ".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img");
					Thread.sleep(3000);
					
					//click on refresh
					click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgbtnRefreshBranch']");
					Thread.sleep(3000);
			  		}
					
					//-----------------------------------------"delete Permanent Status"----------------------------------------------------------------------//
					 public void deletePermanentStatus(WebDriver driver1) throws Exception {
						  WebDriver driver = driver1;
					
					//Enter "Permanent Status"
					sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtPermanentFilter']", "abc@12!$%");
					Thread.sleep(3000);
					
					//click on search
					click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgbtnFilterBranch']");
					Thread.sleep(3000);
					
					//click on "delete" button
				 	click_element(driver, "xpath", ".//*[@id='ImgDelete']");
					Thread.sleep(3000);

					 // Alert of "delete."
				    Alert deletePermanentStatus = driver.switchTo().alert();
				    // To read the text from alert
				    String Alert = deletePermanentStatus.getText();
				    System.out.println(" alert :" + Alert);
				    Thread.sleep(2000);
				    deletePermanentStatus.accept();
				    Thread.sleep(2000);

				    // Alert of "delete."
				    Alert deleterecord = driver.switchTo().alert();
				    // To read the text from alert
				    String Alert1 = deleterecord.getText();
				    System.out.println(" alert :" + Alert1);
				    Thread.sleep(2000);
				    deleterecord.accept();
				    Thread.sleep(2000);
				    
			       //click on "Refresh" button
				   click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgbtnRefreshBranch']");
				   Thread.sleep(3000);
				   
				   //verifying job count
				   String verifyrecord=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerPermanent_lblTotalPages']")).getText();
				   System.out.println("record:-  " +verifyrecord);
					 }			
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
}
