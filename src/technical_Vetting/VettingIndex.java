package technical_Vetting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;


public class VettingIndex extends RW {
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
  //----------------------------------- "mouse hover"----------------------------------------------------------------//
		public void VettingIndexm(WebDriver driver1) throws InterruptedException {
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

			// Select "Vetting Index"
			WebElement Vettingindex = driver.findElement(By.xpath((".//*[@id='nav']/li[7]/ul/li[10]/ul/li[2]/a/span")));
			Vettingindex.click();
			Thread.sleep(5000);
		}
		//------------------------------"Search Vetting"----------------------------------------------------------//
		
		public void searchvetting(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

		
		// select "vessel" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_CheckBoxListItems_4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_btnApplyFilter']")).click();
		Thread.sleep(3000);
			
			 
		// select "status" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_CheckBoxListItems_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_btnApplyFilter']")).click();
		Thread.sleep(3000);

				
		// select "Type" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVetType_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVetType_CheckBoxListItems_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVetType_btnApplyFilter']")).click();
		Thread.sleep(3000);

		// click "Search"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
		Thread.sleep(3000);
	
		}
		//------------------------------------------"Edit"-------------------------------------------------------//
		
		public void editvetting(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
				
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		// click "report"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvVettingIndex_ctl02_ImgReport']");
		Thread.sleep(4000);
				

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

		
		//click on "Add attachments"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvVettingIndex_ctl02_ImgAttatch']");
		Thread.sleep(3000);
		
		// switch to "Add attachment frame"
		WebElement iframe3 = driver.findElement(By.id("IframeAddAttachment"));
		driver.switchTo().frame(iframe3);
		Thread.sleep(3000);

		// select " Attachment Type" dropdown
		dropdown(driver, "xpath", ".//*[@id='DDLAttachment']", "delete");
		Thread.sleep(3000);

		// browser button
		driver.findElement(By.xpath(".//*[@id='FileUpload1']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		Thread.sleep(3000);

		// click on "upload"
		click_element(driver, "xpath", ".//*[@id='btnUpload']");
		Thread.sleep(4000);

		//click on delete
		click_element(driver, "xpath", ".//*[@id='gvAttachment_ctl02_ImgDelete']");
		Thread.sleep(4000);
		
		// Alert of "vetting save"
		Alert deleteattachemnet = driver.switchTo().alert();
		// To read the text from alert
		String Alertpub = deleteattachemnet.getText();
		System.out.println(" alert 1:" + Alertpub);
		Thread.sleep(2000);
		deleteattachemnet.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		// Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);

		// click on "close"
		click_element(driver, "xpath", ".//*[@id='btnClose']");
		Thread.sleep(4000);
		}
		
		//-----------------------" details"---------------------------------------//
		
		public void details(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
		
				
		// window switching function

		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
			
		// click on details
		driver.findElement(By.cssSelector("#ctl00_MainContent_gvVettingIndex_ctl02_lblVetType")).click();
		Thread.sleep(5000);
		
		// window switching function

		for (String handle : driver.getWindowHandles()) {
					
		driver.switchTo().window(handle);
		}
		
		// click on "edit" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_BtnEdit']");
		Thread.sleep(4000);
		
		// select "oil major" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLInspector']", "Gautam K");
		Thread.sleep(3000);
		
		// select "oil major" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLOilMajor']", "D-Low Level");
		Thread.sleep(3000);
		
		//click on "save"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_BtnSave']");
		Thread.sleep(4000);
		}
		
  //-------------------------------------------------------------------------------"add obs."---------------------------------------------------------------------------//
		public void Addobs(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
		
		// click on "add observation"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAddNewObs']");
		Thread.sleep(4000);
		
     
		// switch to "Add attachment frame"
		WebElement iframe4 = driver.findElement(By.id("iFrmNewObs"));
		driver.switchTo().frame(iframe4);
		Thread.sleep(3000);
		
	    // select "Section"dropdown
		dropdown(driver, "xpath", ".//*[@id='ddlSection']", "1");
		Thread.sleep(3000);
		
		 // select "Question"dropdown
		dropdown(driver, "xpath", ".//*[@id='ddlQuestion']", "1.1.2");
		Thread.sleep(3000);
		
	
		//Enter "Job Desc."
		sendkeys(driver, "xpath", ".//*[@id='txtObsDescription']", "AutomationTester");
		Thread.sleep(2000);
		
		//click on "save and close button"
		click_element(driver, "xpath", ".//*[@id='BtnSaveClose']");
		Thread.sleep(4000);
		
		// Alert of "obs. saved"
		Alert observationsaved = driver.switchTo().alert();
		// To read the text from alert
		String Alert = observationsaved.getText();
		System.out.println(" alert :" + Alert);
		Thread.sleep(2000);
		observationsaved.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		}
		//-----------------------"clear filter"----------------------------------------------------------//
		
		public void clearfilter(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
		
			// window switching function

			for (String handle : driver.getWindowHandles()) {

				driver.switchTo().window(handle);
			}
		
		// click on clear filter button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnClearFilter']");
		Thread.sleep(5000);
		}
		
		//-----------------------------------"Advance filter"-------------------------------------------------//
		
		public void advancefilter(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
		
		
		//click on "advance filter"
		click_element(driver, "xpath", ".//*[@id='advText']");
		Thread.sleep(4000);
		
		// select" category" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLCategory_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLCategory_CheckBoxListItems_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLCategory_btnApplyFilter']")).click();
		Thread.sleep(3000);
	
		// select" risk level" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLRiskLevel_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLRiskLevel_CheckBoxListItems_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLRiskLevel_btnApplyFilter']")).click();
		Thread.sleep(3000);
		     
		//click on "search"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
	 	Thread.sleep(8000);
	 	
	 	//close advance filter
		click_element(driver, "xpath", ".//*[@id='advText']");
	 	Thread.sleep(4000);
	 	
		}
		
	//-------------------------------"delete obs"---------------------------------------------------------//
		
		public void deleteobs(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
		
		// window switching function

		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
			
		// click on delete button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvObs_ctl02_ImgDelete']");
		Thread.sleep(4000);
		
		// Alert of "delete obs."
		Alert deleteobs = driver.switchTo().alert();
		// To read the text from alert
		String Alert = deleteobs.getText();
		System.out.println(" alert 5:" + Alert);
		Thread.sleep(2000);
		deleteobs.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		

		}
		
   //---------------------------------"export pdf"-----------------------------------------------------------//
	       
	 	public void exportpdf(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
	 	
	 	
	 	
	 	    // Store the current window handle
	 		String winHandleBefore = driver.getWindowHandle();

	 		// Perform the click operation that opens new window
	 		// click "export pdf"
	 		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnPdfExport']");
	 		Thread.sleep(6000);
	 				

	 		// Switch to new window opened
	 		for(String winHandle : driver.getWindowHandles()){
	 		    driver.switchTo().window(winHandle);
	 		}

	 		// Close the new window, if that window no more required
	 		driver.close();

	 		// Switch back to original browser (first window)
	 		driver.switchTo().window(winHandleBefore);
	 	}
		
		
		
		
		
		}

