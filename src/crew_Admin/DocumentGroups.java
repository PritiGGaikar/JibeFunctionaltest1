package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class DocumentGroups extends RW {
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
  //-----------------------------------------------------------"mouse hover DocumentGroup"-------------------------------------------------------------//

  		public void DocumentGroupm(WebDriver driver1) throws InterruptedException {
  			WebDriver driver = driver1;

  				// Select "admin" module
  				WebElement crewm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
  				Actions action = new Actions(driver);
  				action.moveToElement(crewm).build().perform();
  				action.moveToElement(crewm).perform();
  				Thread.sleep(2000);

  				// Select "admin"
  				WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
  				admin.click();
  				action.moveToElement(admin).build().perform();

  				// Select "DocumentGroup"
  				WebElement DocumentGroup = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[4]/a/span"));
  				DocumentGroup.click();
  				Thread.sleep(5000);
  			}
  	//---------------------------------------"Add new group"---------------------------------------------------------------------------//
	  	
  		public void addgroupname(WebDriver driver1) throws Exception {
  			WebDriver driver = driver1;

   
  		// click "Add Rank "
  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkAddNewGroup']");
  		Thread.sleep(4000);	
  		
  	    //****** Add new group ************//
		
		//click on "save & close" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
		Thread.sleep(3000);
		
		//click on "exit" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ValidatorCalloutExtender1_popupTable']/tbody/tr/td[4]/div");
		Thread.sleep(3000);
		
	    //Enter Add new group
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtGroupName']", "Test@!$%");
		Thread.sleep(3000);  
		
		//click on "save & close" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
		Thread.sleep(3000);
  		}
		//----------------------------------------------------"search" group name------------------------------------------------------------------//
		
		public void filtergroupname(WebDriver driver1) throws Exception {
  			WebDriver driver = driver1;
		
  			 //search added name
  			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']", "Test@!$%");
  			Thread.sleep(6000);  
		
  		    //click on "any element for search" button
	    	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_dvPageContent']");
			Thread.sleep(3000);
			
  		 /*  	//clear search textbox
  			clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfilter']");
  			Thread.sleep(6000);
  			*/
  		    //click on "edit" button
	    	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvDocumentGroup_ctl02_LinkButton2']");
			Thread.sleep(3000);
			
  			/*//edit group name
  		    //click on "edit" button
	    	click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvDocumentGroup_ctl04_LinkButton2']");
			Thread.sleep(3000);	*/ 
			
		   	/*//clear search textbox
  			clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvDocumentGroup_ctl02_txtGroup_Name']");
  			Thread.sleep(6000);
  			
			//enter  some charater in edit textbox
  			sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_gvDocumentGroup_ctl02_txtGroup_Name']", "@!$%");
  			Thread.sleep(3000); */
			
		    //click on save
  			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvDocumentGroup_ctl02_ImgBtnAccept']");
			Thread.sleep(3000);	
			
		
		    //click on "delete"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvDocumentGroup_ctl02_LinkButton1del']");
			Thread.sleep(3000);	
			
		
			 // Alert of "delete."
		    Alert deletegroupname = driver.switchTo().alert();
		    // To read the text from alert
		    String Alert = deletegroupname.getText();
		    System.out.println(" alert :" + Alert);
		    Thread.sleep(2000);
		    deletegroupname.accept();
		    Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}