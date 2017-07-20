package crew_Admin;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class RankCategory extends RW {
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
	  //-----------------------------------------------------------"mouse hover crew category"-------------------------------------------------------------//

	  		public void Adminm(WebDriver driver1) throws InterruptedException {
	  			WebDriver driver = driver1;
	  			
	  				// Select "crew" module
	  				WebElement crew = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
	  				Actions action = new Actions(driver);
	  				action.moveToElement(crew).build().perform();
	  				action.moveToElement(crew).perform();
	  				Thread.sleep(2000);

	  				// Select "admin"
	  				WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
	  				admin.click();
	  				action.moveToElement(admin).build().perform();

	  				// Select "crew category"
	  				WebElement crewcategory = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[1]/a/span"));
	  				crewcategory.click();
	  				Thread.sleep(5000);
	  			}
	  //---------------------------------------"Add Rank Category"---------------------------------------------------------------------------//
	  		public void addrankcategory(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;
	
	   
	  		// click "Add Rank Category"
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAdd']");
	  		Thread.sleep(1000);	
	  		
	                                        //***************Alert capturing for mandatory fields******************//
			
			
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(2000);
			
		    // Alert of "category name."
		    Alert addednewcategory = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert1 = addednewcategory.getText();
		    System.out.println(" alert :" + Alert1);
		    Thread.sleep(2000);
		    addednewcategory.accept();
		    Thread.sleep(2000);
		    
		    //Enter category name
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtRankcategory']", "Tester");
			Thread.sleep(1000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
			Thread.sleep(1000);
			
			  // Alert of "category name."
		    Alert newcategoryadded = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert = newcategoryadded.getText();
		    System.out.println(" alert :" + Alert);
		    Thread.sleep(2000);
		    newcategoryadded.accept();
		    Thread.sleep(1000);
			
		    //click on "Refresh" button
		    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
		    Thread.sleep(1000);
			   
		    //verifying job count
		   String record=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
		   System.out.println("record:-  " +record);
	  		}
	 
	// -----------------------------------------------------"Search"------------------------------------------------------------//
	      public void search(WebDriver driver1) throws Exception {
		  WebDriver driver = driver1;
		
			
		// Enter "category name"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "Tester");
		Thread.sleep(1000);
			
		//click on search
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
		Thread.sleep(1000);
	      }	
			
	//-----------------------------------------"Edit rank category"----------------------------------------------------------------------//		
		 public void edit(WebDriver driver1) throws Exception {
			  WebDriver driver = driver1;
			
		//click on "edit" button
    	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankCategory_ctl02_ImgUpdate']");
		Thread.sleep(1000);	  
			
		/*//clear category name textbox
		clear_element( driver,"xpath",".//*[@id='ctl00_MainContent_txtRankcategory']");
		Thread.sleep(3000);
		
		//Enter "category name"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtRankcategory']", "aa");
		Thread.sleep(3000);*/
	
		//click on "save" button
    	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnsave']");
		Thread.sleep(3000);

		
		 // Alert of "category name."
	    Alert editrankcategory = driver.switchTo().alert();
	    // To read the text from alert
	    String Alert = editrankcategory.getText();
	    System.out.println(" alert :" + Alert);
	    Thread.sleep(2000);
	    editrankcategory.accept();
	    Thread.sleep(2000);
	    
	  //click on "Refresh" button
	  click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
	  Thread.sleep(1000);
         }
		 
		//-----------------------------------------"delete rank category"----------------------------------------------------------------------//
		 public void delete(WebDriver driver1) throws Exception {
			  WebDriver driver = driver1;
		
		//Enter "category name"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "Tester");
		Thread.sleep(1000);
		
		//click on search
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
		Thread.sleep(1000);
		
		//click on "delete" button
	 	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvRankCategory_ctl02_ImgDelete']");
		Thread.sleep(2000);

		 // Alert of "delete."
	    Alert deleterankcategory = driver.switchTo().alert();
	    // To read the text from alert
	    String Alert = deleterankcategory.getText();
	    System.out.println(" alert :" + Alert);
	    Thread.sleep(2000);
	    deleterankcategory.accept();
	    Thread.sleep(2000);

       //click on "Refresh" button
	   click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
	   Thread.sleep(1000);

	   //verifying job count
	   String verifyrecord=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
	   System.out.println("record:-  " +verifyrecord);
		 }

	 //-----------------------------------------"delete rank category"----------------------------------------------------------------------//
		 public void exportexcel(WebDriver driver1) throws Exception {
			  WebDriver driver = driver1;

			//click on "export excel" button
		     click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExpExcel']");
			 Thread.sleep(1000);




}
}