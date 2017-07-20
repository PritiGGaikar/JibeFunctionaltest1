package crew_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CrewRankScale extends RW{
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
	//-----------------------------------------------------------"mouse hover Crew Rank Scale"-------------------------------------------------------------//

  		public void Adminm(WebDriver driver1) throws Exception {
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

  				// Select "Crew Rank Scale "
  				WebElement crewrankscale = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[13]/a/span"));
  				crewrankscale.click();
  				Thread.sleep(1000);
  				
  				//click on "add new rank scale"
  		  		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkAddNewGroup']");
  		  		Thread.sleep(1000);	
  		  		
  				//click on "save and close button"
  		  	    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
		  		Thread.sleep(1000);	
  				
  				//click on "exit of alert"
		  		 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ValidatorCalloutExtender1_popupTable']/tbody/tr/td[4]/div/img");
			  	Thread.sleep(1000);	
  				
			  	//enter " Rank Scale Name"
			  	sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtRankScaleName']", "Tester1");
				Thread.sleep(1000);
  				
  				//select "rank" dropdown
				dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlRank']","Tester");
			  	Thread.sleep(1000);	
		  		
			  //click on "save and close button"
  		  	    click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveAndClose']");
		  		Thread.sleep(2000);
		  		
  				//search by "rank dropdown"
			  	dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlRank1']","Tester");
			  	Thread.sleep(1000);	
  				
  			
  				//click on edit button of previously aaded rank scale
				click_element(driver, "id", "ctl00_MainContent_gvRankScale_ctl02_LinkButton2");
				Thread.sleep(1000);
  				
				
				
  				//click on save button
				click_element(driver, "id", "ctl00_MainContent_gvRankScale_ctl02_ImgBtnAccept");
				Thread.sleep(1000);
  				
				//select "rank" dropdown
				dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlRank1']","TRG. MGR");
			  	Thread.sleep(2000);	
			  	
				//select "rank" dropdown
				dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlRank1']","Tester");
			  	Thread.sleep(1000);	
			  	
  				//click on delete button
				click_element(driver, "id", "ctl00_MainContent_gvRankScale_ctl02_LinkButton1del");
				Thread.sleep(1000);
  				
				
			    // Alert of "rank scale delete"
			    Alert rankscaledelete = driver.switchTo().alert();
			    // To read the text from alert
			    String Alert1 = rankscaledelete.getText();
			    System.out.println(" alert :" + Alert1);
			    Thread.sleep(2000);
			    rankscaledelete.accept();
			    Thread.sleep(2000);
  				
  				
  				
  				
  				
  				
  			}
}
