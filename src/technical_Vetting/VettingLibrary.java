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


public class VettingLibrary extends RW {
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
	// --------------------------------------------------------------- "mouse hover"----------------------------------------------//
	

	public void VettingLibrarym(WebDriver driver1) throws InterruptedException {
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

		// Select "Vetting library"
		WebElement Vettinglibrary = driver.findElement(By.linkText("Vetting Library"));
		Vettinglibrary.click();
		Thread.sleep(5000);
	}
	// --------------------------------------------"edit  functionality"-----------------------------------------------------//


	public void edit(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		/*
		 * // switch to iframe click_element(driver, "xpath",
		 * ".//*[@id='gvExternalInspector_ctl05_ImgDelete']");
		 * Thread.sleep(3000);
		 * 
		 * WebElement iframe = driver.findElement(By.id("IframeVetType"));
		 * driver.switchTo().frame(iframe); Thread.sleep(3000);
		 * 
		 * driver.switchTo().defaultContent(); Thread.sleep(3000); // verify
		 * record String totalrecord = driver.findElement(By.xpath(
		 * ".//*[@id='ucCustomPagerItems_lblTotalPages']")).getText();
		 * System.out.println("total record:" + totalrecord);
		 */

		/*
		 * driver.switchTo().activeElement(); Thread.sleep(3000);
		 */

		WebElement iframe = driver.findElement(By.id("IframeVetType"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);

		// click "edit button"
		click_element(driver, "xpath", ".//*[@id='gvVettingType_ctl02_Edit']");
		Thread.sleep(3000);

		// switch to edit vetting type
		driver.switchTo().activeElement();
		Thread.sleep(2000);

		// click on "vetting type name"
		sendkeys(driver, "xpath", ".//*[@id='txtVettingTypeName']", "@123#");
		Thread.sleep(3000);

		// click on "Valid for"
		sendkeys(driver, "xpath", ".//*[@id='txtExInDays']", "@abc#");
		Thread.sleep(3000);

		// deselect "Is Internal" checkbox
		click_element(driver, "xpath", ".//*[@id='chkEIsInternal']");
		Thread.sleep(3000);

		// click on save
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "save."
		Alert vettingTypeupdated = driver.switchTo().alert();
		// To read the text from alert
		String Alert1 = vettingTypeupdated.getText();
		System.out.println(" alert 1:" + Alert1);
		Thread.sleep(2000);
		vettingTypeupdated.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// search by "vessel type name"
		sendkeys(driver, "xpath", ".//*[@id='txtfilter']", "SIRE@123#");
		Thread.sleep(3000);

		// click on "search"
		click_element(driver, "xpath", ".//*[@id='btnFilter']");
		Thread.sleep(3000);

		// click on "Refresh"
		click_element(driver, "xpath", ".//*[@id='btnRefresh']");
		Thread.sleep(3000);

		/*
		 * // click on "delete" click_element(driver, "xpath",
		 * ".//*[@id='gvVettingType_ctl02_ImgDelete']"); Thread.sleep(3000);
		 * 
		 * // verifying record String verifyrecord =
		 * driver.findElement(By.xpath(
		 * ".//*[@id='ucCustomPagerItems_lblTotalPages']")).getText();
		 * System.out.println("total record:" + verifyrecord);
		 */

		// click on "info"
		click_element(driver, "xpath", ".//*[@id='gvVettingType_ctl02_imgRecordInfo']");
		Thread.sleep(3000);

		// click on "exit"
		click_element(driver, "xpath", ".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img");
		Thread.sleep(3000);

		// click on "export excel"
		click_element(driver, "xpath", ".//*[@id='ImgExpExcel']");
		Thread.sleep(3000);

		// ----------------------------------------"vessel-vetting
		// relationship"-----------------------------//

		/*
		 * public void VesselVettingrelationship(WebDriver driver1) throws
		 * Exception { WebDriver driver = driver1;
		 */

		/*
		 * // switch to iframe click_element(driver, "xpath",
		 * ".//*[@id='nav']/li[8]/ul/li[10]/ul/li[5]/a/span");
		 * Thread.sleep(3000);
		 */

		/*
		 * // switch to iframe WebElement iframe1 =
		 * driver.findElement(By.id("IframeVesselSetting"));
		 * driver.switchTo().frame(iframe1); Thread.sleep(3000);
		 */
		//driver.switchTo().frame(iframe);
		
		//Thread.sleep(2000);
		
		//click_element(driver, "id", "__tab_ctl00_MainContent_tbCntr_tabVesselSetting");
		
		//((JavascriptExecutor)driver).executeScripts("document.getElementByID('.//*[@id='__tab_ctl00_MainContent_tbCntr_tabVesselSetting']').click()");
		/*click_element(driver, "class", "ajax__tab_panel");
		Thread.sleep(4000);*/

		/*WebElement element=driver.findElement(By.xpath(".//*[@id='__tab_ctl00_MainContent_tbCntr_tabVesselSetting']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(4000);*/
		
         driver.findElement(By.id("dv_MainContent_master"));
         Thread.sleep(4000);	
		// click "Additional Rule Mapping "
  		click_element(driver, "xpath", ".//*[@id='__tab_ctl00_MainContent_tbCntr_tabVesselSetting']");
  		Thread.sleep(4000);	
  		
		/*driver.switchTo().frame(driver.findElement(By.id("IframeVesselSetting")));
		Thread.sleep(3000);
		*/
		
		
		
		/*driver.switchTo().defaultContent();
		Thread.sleep(3000);*/
		
	/*	// switch to iframe
		WebElement iframe1 = driver.findElement(By.id("IframeVesselSetting"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(3000);*/

	
		// click on "search"
		sendkeys(driver, "xpath", ".//*[@id='txtfilter']", "OFFICE");
		Thread.sleep(3000);

		// click on "search"
		click_element(driver, "xpath", ".//*[@id='btnFilter']");
		Thread.sleep(3000);

		// deselect checkbox of "OFFICE"
		click_element(driver, "xpath", ".//*[@id='gvVslVtngStng_ctl09_chkVTType_1']");
		Thread.sleep(3000);

		// select checkbox of "OFFICE"
		click_element(driver, "xpath", ".//*[@id='gvVslVtngStng_ctl09_chkVTType_1']");
		Thread.sleep(3000);

		// click on refresh
		click_element(driver, "xpath", ".//*[@id='btnRefresh']");
		Thread.sleep(3000);

		// click on "setting save"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// click on export excel
		click_element(driver, "xpath", ".//*[@id='ImgExpExcel']");
		Thread.sleep(3000);
	}

	// ---------------------------------------"Attachment type"----------------------------------------//
	 

	public void AttachmentType(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// switch to "Create New Vetting Questionnaire"
		WebElement iframe2 = driver.findElement(By.id("IframeVetAttachment"));
		driver.switchTo().frame(iframe2);
		Thread.sleep(3000);

		// click on "add button"
		click_element(driver, "xpath", ".//*[@id='ImgVetAttAdd']");
		Thread.sleep(3000);

		// switch to active element
		driver.switchTo().activeElement();
		Thread.sleep(3000);

		// click on "save"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "addnewobs."
		Alert AttachementTypeselect = driver.switchTo().alert();
		// To read the text from alert
		String Alert1 = AttachementTypeselect.getText();
		System.out.println(" alert 2:" + Alert1);
		Thread.sleep(2000);
		AttachementTypeselect.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// attachment type textbox
		sendkeys(driver, "xpath", ".//*[@id='txtVettingAttTypeName']", "ABC@123#");
		Thread.sleep(3000);

		// click on search
		sendkeys(driver, "xpath", ".//*[@id='txtVetAttfilter']", "ABC@123#");
		Thread.sleep(3000);

		// click on edit
		click_element(driver, "xpath", ".//*[@id='gvVettingAttachment_ctl02_ImgEdit']");
		Thread.sleep(3000);

		// switch to active element
		driver.switchTo().activeElement();
		Thread.sleep(3000);

		// clear textbox
		clear_element(driver, "xpath", ".//*[@id='txtVettingAttTypeName']");
		Thread.sleep(3000);

		// attachment type textbox
		sendkeys(driver, "xpath", ".//*[@id='txtVettingAttTypeName']", "AA@!12");
		Thread.sleep(3000);

		// Alert of "attachement type saved."
		Alert AttachementTypeupdated = driver.switchTo().alert();
		// To read the text from alert
		String Alert2 = AttachementTypeupdated.getText();
		System.out.println(" alert 3:" + Alert2);
		Thread.sleep(2000);
		AttachementTypeupdated.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// export excel
		click_element(driver, "xpath", ".//*[@id='ImgExpExcel']");
		Thread.sleep(3000);

	}

	// -------------------------------"External Inspector"---------------------------------------------//
	

	public void ExternalInspector(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		
		// switch to "Create New Vetting Questionnaire"
		WebElement iframe3 = driver.findElement(By.id("IframeExtInspctor"));
		driver.switchTo().frame(iframe3);
		Thread.sleep(3000);

		// click "Add inspector"
		click_element(driver, "xpath", ".//*[@id='ImgAdd']");
		Thread.sleep(3000);

		// switch to "Create New Vetting Questionnaire"
		WebElement iframe4 = driver.findElement(By.id("IframeAddExternalInspector"));
		driver.switchTo().frame(iframe4);
		Thread.sleep(3000);

		// -----------Alert for "first name"-------------//
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Module."
		Alert Module = driver.switchTo().alert();
		// To read the text from alert
		String Alert = Module.getText();
		System.out.println(" alert 1:" + Alert);
		Thread.sleep(2000);
		Module.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "first name" dropdown
		dropdown(driver, "xpath", ".//*[@id='txtFirstName']", "Tester");
		Thread.sleep(3000);

		// -----------Alert for "Last name"-------------//
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Module."
		Alert Type = driver.switchTo().alert();
		// To read the text from alert
		String Alert2 = Type.getText();
		System.out.println(" alert 2:" + Alert2);
		Thread.sleep(2000);
		Type.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "last name" dropdown
		dropdown(driver, "xpath", ".//*[@id='txtLastName']", "jibe");
		Thread.sleep(3000);

		// -----------Alert for "company"-------------//

		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='txtLastName']");
		Thread.sleep(3000);

		// Alert of "Questionnaire Name."
		Alert QuestionnaireName = driver.switchTo().alert();
		// To read the text from alert
		String Alert3 = QuestionnaireName.getText();
		System.out.println(" alert 3:" + Alert3);
		Thread.sleep(2000);
		QuestionnaireName.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Questionnaire Name" Textbox
		sendkeys(driver, "xpath", ".//*[@id='txtCompany']", "ORANGE");
		Thread.sleep(3000);

		// -----------Alert for "vetting type"-------------//
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Number."
		Alert Number = driver.switchTo().alert();
		// To read the text from alert
		String Alert4 = Number.getText();
		System.out.println(" alert 4:" + Alert4);
		Thread.sleep(2000);
		Number.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "vetting type" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='DDLVetType_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='DDLVetType_CheckBoxListItems_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='DDLVetType_btnApplyFilter']")).click();
		Thread.sleep(3000);

		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// browser button
		driver.findElement(By.xpath(".//*[@id='UplImage']"))
				.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		Thread.sleep(3000);

		// click on "upload"
		click_element(driver, "xpath", ".//*[@id='btnUpload']");
		Thread.sleep(4000);

		/*
		 * // Alert of "Attachmentsaved." Alert Attachmentsaved =
		 * driver.switchTo().alert(); // To read the text from alert String
		 * Alert11 = Attachmentsaved.getText(); System.out.println(" alert 11:"
		 * + Alert11); Thread.sleep(2000); Attachmentsaved.accept();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * Thread.sleep(4000);
		 */

		// switch back previous iframe
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(4000);

		// click on delete
		click_element(driver, "xpath", ".//*[@id='gvExternalInspector_ctl05_ImgDelete']");
		Thread.sleep(4000);

		// Alert of "delete."
		Alert delete = driver.switchTo().alert();
		// To read the text from alert
		String Alert11 = delete.getText();
		System.out.println(" alert 11:" + Alert11);
		Thread.sleep(2000);
		delete.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
	}
	// -------------------------------"Observation
	// Categories"-----------------------------------------------------------------------------------//

	public void ObservationCategories(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// switch to "Create New Vetting Questionnaire"
		WebElement iframe3 = driver.findElement(By.id("IframeObsCategory"));
		driver.switchTo().frame(iframe3);
		Thread.sleep(3000);

		// click "Add inspector"
		click_element(driver, "xpath", ".//*[@id='ImgAdd']");
		Thread.sleep(3000);

		driver.switchTo().activeElement();
		Thread.sleep(3000);

		// -----------Alert for "category name"-------------//
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "category name."
		Alert Module = driver.switchTo().alert();
		// To read the text from alert
		String Alert = Module.getText();
		System.out.println(" alert :" + Alert);
		Thread.sleep(2000);
		Module.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "category name" dropdown
		dropdown(driver, "xpath", ".//*[@id='txtCategoryName']", "Tester");
		Thread.sleep(3000);

		// click on edit
		click_element(driver, "xpath", ".//*[@id='gvCategory_ctl02_Edit']");
		Thread.sleep(3000);

		// switch to active element
		driver.switchTo().activeElement();
		Thread.sleep(3000);

		// clear textbox
		clear_element(driver, "xpath", ".//*[@id='txtVettingAttTypeName']");
		Thread.sleep(3000);

		// select "Edit category" Textbox
		sendkeys(driver, "xpath", ".//*[@id='txtCompany']", "ORan@123#");
		Thread.sleep(3000);

		// click on "save"
		clear_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// search category name
		sendkeys(driver, "xpath", ".//*[@id='txtfilter']", "ORan@123#");
		Thread.sleep(3000);

		// click on search
		click_element(driver, "xpath", ".//*[@id='btnFilter']");
		Thread.sleep(3000);

		// click on delete
		click_element(driver, "xpath", ".//*[@id='gvCategory_ctl02_ImgDelete']");
		Thread.sleep(3000);

		// Alert of "delete."
		Alert delete = driver.switchTo().alert();
		// To read the text from alert
		String Alert11 = delete.getText();
		System.out.println(" alert 11:" + Alert11);
		Thread.sleep(2000);
		delete.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);

		// click on refresh
		click_element(driver, "xpath", ".//*[@id='btnRefresh']");
		Thread.sleep(3000);

		// click on "export excel"
		click_element(driver, "xpath", ".//*[@id='ImgExpExcel']");
		Thread.sleep(5000);

	}

}
