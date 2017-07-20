package technical_PMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;




public class JobupdatingDaily extends RW{

	
	
	/*Technical
	PMS
	JobsUpdatingDaily*/
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


		public void JobupdatingDailyStatus(WebDriver driver1) throws InterruptedException { //(priority=10)

			WebDriver driver = driver1;
				
			
			WebElement technical = driver.findElement(By.linkText("Technical")); // pathfor "Technical"
			Actions action = new Actions(driver);
			action.moveToElement(technical).build().perform();
			action.moveToElement(technical).perform();
			
			Thread.sleep(2000);

			WebElement PMS = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[2]/a/span"));// path for PMS
																						
			action.moveToElement(PMS).build().perform();
			Thread.sleep(3000);

			WebElement CopyRunHour = driver.findElement(By.linkText("Jobs updating Daily progress")); // path for Jobs updating Daily progress
			CopyRunHour.click();
	    	
			Thread.sleep(3000);
			
		}
		
		public void JobSummary(WebDriver driver1) throws Exception {  //(priority=11)

			WebDriver driver = driver1;
		
			
			

		     dropdown(driver, "id", (data.getData(4, 636, 2)),(data.getData(4, 637, 2))); //Fleet Dropdown---SELECT FLEET--
		  
				Thread.sleep(3000);
				
				click_element(driver, "xpath", (data.getData(4, 638, 2)));  //Search Button
			
				Thread.sleep(3000);
				
				 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Please select fleet
			     String Alert1 = alert1.getText();
			     System.out.println("Alert msg for Please select fleet:"+Alert1);
			     alert1.accept();
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     Thread.sleep(4000);
			   
			
			
			
			
			
			
			
				//For Fleet-B

		     dropdown(driver, "id", (data.getData(4, 639, 2)),(data.getData(4, 640, 2))); //Fleet Dropdown-"Fleet-B"
		  
				Thread.sleep(3000);
				
				
				clear_element(driver, "id", (data.getData(4, 641, 2)));  //Clear element"From"
			
				
				sendkeys(driver, "id", (data.getData(4, 642, 2)), (data.getData(4, 643, 2))); //Date From"01-01-2017"
			  
					Thread.sleep(3000);
					
					
					clear_element(driver, "id", (data.getData(4, 644, 2)));  //Clear element"To"
				
					Thread.sleep(3000);
					
					sendkeys(driver, "id", (data.getData(4, 645, 2)), (data.getData(4, 646, 2))); //Date To"06-04-2017"
				 
						Thread.sleep(3000);

						click_element(driver, "xpath", (data.getData(4, 647, 2)));  //Search Button
				
						Thread.sleep(3000);
						
						
						//For Fleet-C
						

					     dropdown(driver, "id", (data.getData(4, 648, 2)),(data.getData(4, 649, 2))); //Fleet Dropdown-"Fleet-c"
					
							Thread.sleep(3000);
							
							
							clear_element(driver, "id", (data.getData(4, 650, 2)));  //Clear element"From"
					
							Thread.sleep(3000);
							
							sendkeys(driver, "id", (data.getData(4, 651, 2)), (data.getData(4, 652, 2))); //Date From"01-01-2017"
						 
								Thread.sleep(3000);
								
								
								clear_element(driver, "id", (data.getData(4, 653, 2)));  //Clear element"To"
							 
								Thread.sleep(3000);
								
								sendkeys(driver, "id", (data.getData(4, 654, 2)), (data.getData(4, 655, 2))); //Date To"06-04-2017"
							
									Thread.sleep(3000);

									click_element(driver, "xpath", (data.getData(4, 656, 2)));  //Search Button
								
									Thread.sleep(3000);
									
									
		
		}	
		
	}
