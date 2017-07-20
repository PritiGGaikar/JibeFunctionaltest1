package technical_PMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;




public class JobsUpdating  extends RW{

	
	
	 
		/*Technical
		PMS
		JobsUpdatingDetails Status*/
	private static ExtentReports report;

	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
		 if (report == null) {
	 	        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html", false);
	 	        
	 	        report
	 	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	 	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}


	public void JobsUpdatingStatus(WebDriver driver1) throws InterruptedException { //(priority=7)

		WebDriver driver = driver1;
			
	

		WebElement technical = driver.findElement(By.linkText("Technical")); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		
		Thread.sleep(2000);

		WebElement PMS = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[2]/a/span"));// path for PMS
																					
		PMS.click();
	
		action.moveToElement(PMS).build().perform();
		Thread.sleep(3000);

		WebElement CopyRunHour = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[2]/ul/li[5]/a/span")); // path for Jobs updating Detailed status
		CopyRunHour.click();
    	
		Thread.sleep(3000);
		
	}

	      //Rank-Wise
	
	public void JobsDone(WebDriver driver1) throws Exception {  //(priority=8)

		WebDriver driver = driver1;
		 
	  
	     
	     dropdown(driver, "id", (data.getData(4, 609, 2)),(data.getData(4, 610, 2))); //Fleet Dropdown-"Fleet-B"
	  
			Thread.sleep(3000);
	     
	     dropdown(driver, "id", (data.getData(4, 611, 2)),(data.getData(4, 612, 2))); //Fleet Dropdown-"HARUKA"
				Thread.sleep(3000);
			
			dropdownCheckbox( driver, "xpath",(data.getData(4, 613, 2)),(data.getData(4, 614, 2)),(data.getData(4, 615, 2))); //Dropdown Rank CheckBox  MST
		
			Thread.sleep(5000);
			
			click_element(driver, "id", (data.getData(4, 616, 2)));  //Search Button
	
			Thread.sleep(3000);
			
			//Window Handle For Email
			String parentHandle = driver.getWindowHandle(); // get the current window handle
			Thread.sleep(5000);
			
			
			click_element(driver, "id", (data.getData(4, 617, 2)));  //Send Email To Ship
		
			Thread.sleep(3000);
			

            for (String winHandle : driver.getWindowHandles()) {
             driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
            }
            Thread.sleep(3000);
            clear_element(driver, "id", "ctl00_MainContent_txtTo");
            Thread.sleep(3000);
			sendkeys(driver, "id", (data.getData(4, 618, 2)), (data.getData(4, 619, 2))); //Email id
		
				Thread.sleep(3000);
			
			
			

				click_element(driver, "id", (data.getData(4, 620, 2)));  //Click on Send
		
				Thread.sleep(3000);
				
				 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Email has been sent from your side
			     String Alert1 = alert1.getText();
			     System.out.println("Alert msg for Email has been sent from your side:"+Alert1);
			     alert1.accept();
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     Thread.sleep(4000);
			 
			     driver.switchTo().window(parentHandle);
					Thread.sleep(3000);
					
			    
			     click_element(driver, "id", (data.getData(4, 621, 2)));  //Clear Filter
			
					Thread.sleep(3000);
					driver.switchTo().window(parentHandle);
					Thread.sleep(3000);
					
	}				
	                 //Vessel-wise
					
		 public void Vesselwise(WebDriver driver1) throws Exception {  //(priority=9)

						WebDriver driver = driver1;
						 
					   
					     
					     dropdown(driver, "id", (data.getData(4, 622, 2)),(data.getData(4, 623, 2))); //Fleet Dropdown-"Fleet-B"
					   
							Thread.sleep(5000);
					     
					     dropdown(driver, "id",(data.getData(4, 624, 2)),(data.getData(4, 625, 2))); //Fleet Dropdown-"HARUKA"
					 
							Thread.sleep(5000);
							
							//dropdownCheckbox( driver, "id","ctl00_MainContent_ucf_DDLRank_txtSearchItems","ctl00_MainContent_ucf_DDLRank_CheckBoxListItems_0","ctl00_MainContent_ucf_DDLRank_btnApplyFilter" ); //Dropdown Rank CheckBox  MST
							
							Thread.sleep(5000);
							

						     radioButton(driver, "id", (data.getData(4, 626, 2)));   //Radio button for Vessel-wises
						
								Thread.sleep(5000);
								
							//click_element(driver, "xpath", (data.getData(4, 627, 2)));  //Search Button
					
							Thread.sleep(5000);
					
					

							click_element(driver, "xpath", (data.getData(4, 628, 2)));  //Click on Send Email to Ship
						
							Thread.sleep(1000);
				
							Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Please select Rank - wise option
						     String Alert1 = alert1.getText();
						     System.out.println("Alert msg for Email has been sent from your side:"+Alert1);
						     alert1.accept();
						     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						  
						     Thread.sleep(1000);
							
						     
						     
						 	click_element(driver, "id", (data.getData(4, 629, 2)));  //Export to Excel
							
							Thread.sleep(5000);
	
		
				  
				  
				  
	}			
			
			
	
	
}



