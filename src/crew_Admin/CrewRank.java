
package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CrewRank extends RW {
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
	  //-----------------------------------------------------------"mouse hover crew rank"-------------------------------------------------------------//

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
	  				Thread.sleep(2000);
	  				
	  				// Select "crew rank"
	  				WebElement crewrank = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[2]/a/span"));
	  				crewrank.click();
	  				Thread.sleep(3000);
	  			}
	  //---------------------------------------"Add Rank"---------------------------------------------------------------------------//
	  	
	  		public void addrank(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;
	
	   
	  		// click "Add Rank "
	  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAddRank']");
	  		Thread.sleep(1000);	
	  		
	                                        //***************Alert capturing for mandatory fields******************//
			
			//****** Rank name ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
			Thread.sleep(3000);
			
		    // Alert of "rank name."
		    Alert rankname = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert1 = rankname.getText();
		    System.out.println(" alert :" + Alert1);
		    Thread.sleep(2000);
		    rankname.accept();
		    Thread.sleep(2000);
		    
		    //Enter rank name
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtRankName']", "Tester");
			Thread.sleep(1000);
			
			//****** Rank short name ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
			Thread.sleep(3000);
			
			  // Alert of "rank short name."
		    Alert rankshortname = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert = rankshortname.getText();
		    System.out.println(" alert :" + Alert);
		    Thread.sleep(2000);
		    rankshortname.accept();
		    Thread.sleep(2000);
			
		    //Enter rank name
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtRankShortName']", "Tester");
			Thread.sleep(1000);
			
            //****** category ************//
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
			Thread.sleep(3000);
			
			  // Alert of "category."
		    Alert category = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert2 = category.getText();
		    System.out.println(" alert :" + Alert2);
		    Thread.sleep(2000);
		    category.accept();
		    Thread.sleep(2000);
			
		     // select " category" dropdown
			dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlRankCategory']", "Tester");
			Thread.sleep(1000);
			
			//***********Deck/Engine***********//
			radioButton(driver, "xpath", ".//*[@id='ctl00_MainContent_optDeckEngine_0']");
			Thread.sleep(1000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
			Thread.sleep(3000);
	  		}
	 //---------------------------------------"search"---------------------------------------------------------------------------//
		  	
	  	/*	public void search(WebDriver driver1) throws Exception {
	  			WebDriver driver = driver1;	
			
			
		    //search by "Name / Short Name"
			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "Tester");
			Thread.sleep(3000);
						
		    //click on "search" button
		    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
		    Thread.sleep(3000);
			   
			//click on "edit" button
	    	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridViewRank_ctl06_ImgUpdate']");
			Thread.sleep(3000);	 
			
			//select "engine" radiobutton
			radioButton(driver, "xpath", ".//*[@id='ctl00_MainContent_optDeckEngine_1']");
			Thread.sleep(3000);
			
			//click on "save" button
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
			Thread.sleep(3000);
			
			//click on "info"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_GridViewRank_ctl06_imgRecordInfo']");
			Thread.sleep(3000);
			
			//click on "exit"
			click_element(driver, "xpath", ".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img");
			Thread.sleep(3000);
			
			//click on refresh
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
			Thread.sleep(3000);
	  		}*/
	//-----------------------------------------"delete rank category"----------------------------------------------------------------------//
			 public void exportexcel(WebDriver driver1) throws Exception {
				  WebDriver driver = driver1;

				//click on "export excel" button
			     click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgExpExcel']");
				 Thread.sleep(1000);
		 
	  		}
	 
}
