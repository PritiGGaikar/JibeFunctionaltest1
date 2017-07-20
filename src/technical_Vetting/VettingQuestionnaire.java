package technical_Vetting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class VettingQuestionnaire extends RW {
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
public void VettingQuestionnairem(WebDriver driver1) throws InterruptedException {
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

	// Select "Vetting Questionnaire"
	WebElement VettingQuestionnaire = driver.findElement(By.xpath((".//*[@id='nav']/li[7]/ul/li[10]/ul/li[4]/a/span")));
	VettingQuestionnaire.click();
	Thread.sleep(5000);
}
  //---------------------------------------"Create New Questionnaire"&"validation"---------------------------------------------//

	public void CreateNewQuestionnaire(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// click "Create New Questionnaire"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAdd']");
		Thread.sleep(3000);

		// switch to "Create New Vetting Questionnaire"
		WebElement iframe1 = driver.findElement(By.id("IframeAddQuestionnaire"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(3000);

		                        // -----------Alert for "module"-------------//
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Module."
		Alert Module = driver.switchTo().alert();
		// To read the text from alert
		String Alert = Module.getText();
		System.out.println(" alert :" + Alert);
		Thread.sleep(2000);
		Module.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Module" dropdown
		dropdown(driver, "xpath", ".//*[@id='DDLModule']", "Vetting");
		Thread.sleep(3000);

		                        // -----------Alert for "Type"-------------//
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Module."
		Alert Type = driver.switchTo().alert();
		// To read the text from alert
		String Alert2 = Type.getText();
		System.out.println(" alert :" + Alert2);
		Thread.sleep(2000);
		Type.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Type" dropdown
		dropdown(driver, "xpath", ".//*[@id='DDLVetType']", "Internal");
		Thread.sleep(3000);

		// -----------Alert for "Questionnaire Name"-------------//

		
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Questionnaire Name."
		Alert QuestionnaireName = driver.switchTo().alert();
		// To read the text from alert
		String Alert3 = QuestionnaireName.getText();
		System.out.println(" alert :" + Alert3);
		Thread.sleep(2000);
		QuestionnaireName.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Questionnaire Name" Textbox
		sendkeys(driver, "xpath", ".//*[@id='txtQuestionnaireName']", "Question10");
		Thread.sleep(3000);
				
		// -----------Alert for "Number"-------------//
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Number."
		Alert Number = driver.switchTo().alert();
		// To read the text from alert
		String Alert4 = Number.getText();
		System.out.println(" alert :" + Alert4);
		Thread.sleep(2000);
		Number.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Number" Textbox
		sendkeys(driver, "xpath", ".//*[@id='txtNumber']", "98");
		Thread.sleep(3000);

		
		 // -----------Alert for "Version"-------------//
		 
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Version."
		Alert Version = driver.switchTo().alert();
		// To read the text from alert
		String Alert5 = Version.getText();
		System.out.println(" alert :" + Alert5);
		Thread.sleep(2000);
		Version.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Version" Textbox
		sendkeys(driver, "xpath", ".//*[@id='txtVersion']", "3.4");
		Thread.sleep(3000);
		
		
		                     // -----------Alert for "Vessel Type"-------------//

		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Vessel Type."
		Alert VesselType = driver.switchTo().alert();
		// To read the text from alert
		String Alert6 = VesselType.getText();
		System.out.println(" alert :" + Alert6);
		Thread.sleep(2000);
		VesselType.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//select" vessel type" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='DDLVesselType_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
	     driver.findElement(By.xpath(".//*[@id='DDLVesselType_CheckBoxListItems_3']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(".//*[@id='DDLVesselType_btnApplyFilter']")).click();
	 	Thread.sleep(3000);
	     
	    
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='btnSave']");
		Thread.sleep(3000);

		// Alert of "Questionnaire created."
		Alert Questionnairecreated = driver.switchTo().alert();
		// To read the text from alert
		String Alert7 = Questionnairecreated.getText();
		System.out.println(" alert :" + Alert7);
		Thread.sleep(2000);
		Questionnairecreated.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);	
        String handleBefore = driver.getWindowHandle();       // Parent window

	//}
	
	//----------------------------------"Add Question" & capturing alert---------------------------------------------------------------------------------//
	
	 /*public void Addquestion(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;
	*/
	
		// window switching function

		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);
	
		


		// click on "Add Question"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAdd']");
		Thread.sleep(3000);
	
	
		// switch to "Add Section / Question"
		WebElement iframe2 = driver.findElement(By.id("IframeAddQuestion"));
		driver.switchTo().frame(iframe2);
		Thread.sleep(3000);
	
	                             //----------alert for "section"-------//

		// click on "save&close button"
		click_element(driver, "xpath", ".//*[@id='btnSaveAndClose']");
		Thread.sleep(3000);

		// Alert of "Section No."
		Alert SectionNo = driver.switchTo().alert();
		// To read the text from alert
		String Alert71 = SectionNo.getText();
		System.out.println(" alert :" + Alert71);
		Thread.sleep(2000);
		SectionNo.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Section No" Textbox
		sendkeys(driver, "xpath", ".//*[@id='txtSection']", "15");
		Thread.sleep(3000);
		
	
	                               //-------------"alert for "Level 2"------------//
		// click on "save&close button"
		click_element(driver, "xpath", ".//*[@id='btnSaveAndClose']");
		Thread.sleep(3000);

		// Alert of "Level 2."
		Alert Level2 = driver.switchTo().alert();
		// To read the text from alert
		String Alert8 = Level2.getText();
		System.out.println(" alert :" + Alert8);
		Thread.sleep(2000);
		Level2.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Level 2" Textbox
		sendkeys(driver, "xpath", ".//*[@id='txtLevl2']", "21");
		Thread.sleep(3000);
			                    
		
	                              //-------------"alert for "Question"------------//
		// click on "save&close button"
		click_element(driver, "xpath", ".//*[@id='btnSaveAndClose']");
		Thread.sleep(3000);

		// Alert of "Question."
		Alert Question  = driver.switchTo().alert();
		// To read the text from alert
		String Alert9 = Question.getText();
		System.out.println(" alert :" + Alert9);
		Thread.sleep(2000);
		Question.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select "Question" Textbox
		sendkeys(driver, "xpath", ".//*[@id='txtQuestion']", "question@8745");
		Thread.sleep(3000);
	
		// click on "save&close button"
		click_element(driver, "xpath", ".//*[@id='btnSaveAndClose']");
		Thread.sleep(3000);

		// Alert of "Question."
		Alert Question1 = driver.switchTo().alert();
		// To read the text from alert
		String Alert10 = Question1.getText();
		System.out.println(" alert :" + Alert10);
		Thread.sleep(2000);
		Question1.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
	// }
	
	 //-------------------------------------"add attachment"-----------------------------------------------------//
	 /*public void addattachment(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
	 
		// window switching function

		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);
		
			
		// click on "add attachment"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAttach']");
		Thread.sleep(3000);

		// switch to "Add attachment frame"
		WebElement iframe3 = driver.findElement(By.id("IframeAddAttachment"));
		driver.switchTo().frame(iframe3);
		Thread.sleep(3000);

		// browser button
		driver.findElement(By.xpath(".//*[@id='FileUpload1']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		Thread.sleep(3000);

		// click on "upload"
		click_element(driver, "xpath", ".//*[@id='btnUpload']");
		Thread.sleep(4000);

	
		// Alert of "Attachmentsaved."
		Alert Attachmentsaved = driver.switchTo().alert();
		// To read the text from alert
		String Alert11 = Attachmentsaved.getText();
		System.out.println(" alert 11:" + Alert11);
		Thread.sleep(2000);
		Attachmentsaved.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
	 
		
		//driver.findElement(By.id("closePopupbutton")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//switch back to main page
	driver.switchTo().window(null);
	 
		//*driver.switchTo().activeElement();
		//Thread.sleep(2000);
	 }*/
	 
	 
	 //--------------------------------------------"publish"-------------------------------------------------//
	/* 
	 public void publish(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;*/
		

			// window switching function

			for (String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
			Thread.sleep(4000);
			
			
		// click on "publish button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnPublish']");
		Thread.sleep(3000);
	 
	 
		// Alert of "publish."
		Alert publish = driver.switchTo().alert();
		// To read the text from alert
		String Alert101 = publish.getText();
		System.out.println(" alert :" + Alert101);
		Thread.sleep(2000);
		publish.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
	 
	// }
	 
	 //----------------------------------"info"---------------------------------------------------//
	 
		/* public void info(WebDriver driver1) throws Exception {
				WebDriver driver = driver1;*/
	 
		// click on "info button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvQuestionnaire_ctl02_imgRecordInfo']");
		Thread.sleep(5000);
		
		//click on exit
		click_element(driver, "xpath", ".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img");
		Thread.sleep(7000);
		// }
		 
	  //---------------------------------------"filter"----------------------------------//
		 /*public void filter(WebDriver driver1) throws Exception {
				WebDriver driver = driver1; */
		 
		
		// window switching function

		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);
		
		// click on "clear filter"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnClearFilter']");
		Thread.sleep(5000);
				
		// select" Vetting Type" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestion_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestion_CheckBoxListItems_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestion_btnApplyFilter']")).click();
		Thread.sleep(3000);
		
		/*// click on "question" dropdown
		dropdownCheckbox(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLQuestion_imgCollapseExpandDDL']",".//*[@id='ctl00_MainContent_DDLQuestion_CheckBoxListItems_0']", ".//*[@id='ctl00_MainContent_DDLQuestion_btnApplyFilter']");
		Thread.sleep(2000);*/
		 
		// click on "search"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
		Thread.sleep(5000);
		
		for (String handle : driver.getWindowHandles()) {          //Switch to new window                     
            driver.switchTo().window(handle);}
            driver.close();
            driver.switchTo().window(handleBefore);
            Thread.sleep(2000);
            


	 
	 }
		 //----------------------------------"Filter"-------------------------------------------------------------//
		  public void AdvanceFilter(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
		
			// Window Switching

/*
            //Window handle for Done Date
              String handleBefore = driver.getWindowHandle();       // Parent window
              click_element(driver, "xpath", (".//*[@id='btnSave']"));  //Done Date
          
              Thread.sleep(2000);             
              for (String handle : driver.getWindowHandles()) {          //Switch to new window                     
              driver.switchTo().window(handle);}
              driver.close();
              driver.switchTo().window(handleBefore);
              Thread.sleep(2000);
              
*/


			// window switching function

			for (String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
			Thread.sleep(4000);
			
		// click on "clear filter"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnClearFilter']");
		Thread.sleep(5000);
			
		// click on "Module" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLModule']", "Vetting");
		Thread.sleep(3000);	
			
		// select" Vetting Type" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVetType_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVetType_CheckBoxListItems_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVetType_btnApplyFilter']")).click();
		Thread.sleep(3000);
			     
		/*// click on "Vetting Type"
		dropdownCheckbox(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLVetType_imgCollapseExpandDDL']",".//*[@id='ctl00_MainContent_DDLVetType_CheckBoxListItems_2']", ".//*[@id='ctl00_MainContent_DDLVetType_btnApplyFilter']");
		Thread.sleep(2000);	*/
		
		/*// click on "Vessel Type"
		dropdownCheckbox(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLVeseelType_imgCollapseExpandDDL']",".//*[@id='ctl00_MainContent_DDLVeseelType_CheckBoxListItems_3']", ".//*[@id='ctl00_MainContent_DDLVeseelType_btnApplyFilter']");
		Thread.sleep(2000);*/	
		
		// select" Vetting Type" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_CheckBoxListItems_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_btnApplyFilter']")).click();
		Thread.sleep(3000);
		
		/*// click on "Status"
		dropdownCheckbox(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLStatus_imgCollapseExpandDDL']",".//*[@id='ctl00_MainContent_DDLStatus_CheckBoxListItems_0']", ".//*[@id='ctl00_MainContent_DDLStatus_btnApplyFilter']");
		Thread.sleep(2000);	
		*/
		// select "status" dropdown checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_CheckBoxListItems_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLStatus_btnApplyFilter']")).click();
		Thread.sleep(3000);
		
		//click on "search"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
		Thread.sleep(5000);
		  }
		//-----------------------------------------"Delete"----------------------------------------------------------------------------------------//
		
		public void delete(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

		// Get total Record count
		String Record = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']")).getText();
		System.out.println("total record counts are  " + Record);
			
			
		// click on "delete vetting"
        click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvQuestionnaire_ctl04_ImgDelete']");
		Thread.sleep(5000);
		
		// Alert of "delete."
		Alert delete = driver.switchTo().alert();
		// To read the text from alert
		String Alert11 = delete.getText();
		System.out.println(" alert :" + Alert11);
		Thread.sleep(2000);
		delete.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		// Get total Record count
		String Record1 = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucCustomPagerItems_lblTotalPages']"))	.getText();
		System.out.println("total record counts are  " + Record1);
		}
		
		//------------------------------------------------"open advance filter"------------------------------------------------------------//
		
		public void openadvancefilter(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

		// click on "clear filter"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnClearFilter']");
		Thread.sleep(5000);
			
		// click on "open advance filter"
	    click_element(driver, "xpath", ".//*[@id='advText']");
    	Thread.sleep(5000);
		
		//enter "number"
    	sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtNumber']", "15");
		Thread.sleep(3000);
		
		//enter "version"
    	sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtVersion']", "2.8");
		Thread.sleep(3000);
		
		// click on "search"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
		Thread.sleep(5000);
		
		
		//export excel
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnExport']");
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
