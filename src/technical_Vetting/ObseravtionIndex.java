package technical_Vetting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class ObseravtionIndex extends RW{
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
		
		
  //-----------------------------------------------------------"mouse hover observation index"-------------------------------------------------------------//

		public void ObseravtionIndexm(WebDriver driver1) throws InterruptedException {
			WebDriver driver = driver1;

				// Select "technical" module
				WebElement technical = driver.findElement(By.xpath((".//*[@id='nav']/li[7]/a/span")));
				Actions action = new Actions(driver);
				action.moveToElement(technical).build().perform();
				action.moveToElement(technical).perform();
				Thread.sleep(2000);

				// Select "Vetting"
				WebElement Vetting = driver.findElement(By.xpath((".//*[@id='nav']/li[7]/ul/li[10]/a/span")));
				Vetting.click();
				action.moveToElement(Vetting).build().perform();

				// Select "observation index"
				WebElement Vettinglibrary = driver.findElement(By.linkText("Observation Index"));
				Vettinglibrary.click();
				Thread.sleep(5000);
			}
			
	//----------------------------------------"	search functionality"-----------------------------------------------------------------------------------//		
			

		public void search(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
			
		// select "Questionnaire" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestionnaire_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestionnaire_CheckBoxListItems_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestionnaire_btnApplyFilter']")).click();
		Thread.sleep(3000);

		// select "Vessel " dropdown checkbox

		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVesselObs_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVesselObs_CheckBoxListItems_4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVesselObs_btnApplyFilter']")).click();
		Thread.sleep(3000);

		// deselect "Is Internal" checkbox
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieveData']");
		Thread.sleep(3000);
		}	
		
	//--------------------------------------------------"report"-------------------------------------------------------------//	
		public void report(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;	
			
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		// click "report"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvObservationIndex_ctl02_ImgReport']");
		Thread.sleep(4000);

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		}
			
	//---------------------------------------"Details"------------------------------------------------------------------------------------//		
		public void Details(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;		
			
		// click on save and close button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvObservationIndex_ctl02_ImgDetails']");
		Thread.sleep(4000);	
			
		// switch to "Add attachment frame"
		WebElement iframe3 = driver.findElement(By.id("IframeAddNote_Observation"));
		driver.switchTo().frame(iframe3);
		Thread.sleep(3000);
		
		//click on add response
		click_element(driver, "xpath", ".//*[@id='ImgAddResponse']");
		Thread.sleep(4000);	
		
		// switch to "Add attachment frame"
		WebElement iframe1 = driver.findElement(By.id("IframeAddResponse"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(3000);
		
		// Enter "reponse" in text box
		sendkeys(driver, "xpath", ".//*[@id='txtResponse']", "Tester77");
		Thread.sleep(3000);
		
		//click on save button
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(4000);
		
		
		// Alert of "reponse"
		Alert reponse = driver.switchTo().alert();
		// To read the text from alert
		String Alert = reponse.getText();
		System.out.println(" alert :" + Alert);
		Thread.sleep(2000);
		reponse.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
	
		
	

				
			//Click on "save and close" button
			click_element(driver, "xpath", ".//*[@id='BtnSaveClose']");
			Thread.sleep(4000);
			
		}
	
}
		
		
		
		
		

		
		
		



		