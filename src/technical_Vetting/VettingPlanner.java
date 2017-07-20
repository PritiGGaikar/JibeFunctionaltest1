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


public class VettingPlanner extends RW {
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

	// -------------------------------------------------mouse hover [Vetting]--------------------------------------------------//
	

	public void Vetting(WebDriver driver1) throws InterruptedException {
		WebDriver driver = driver1;

		// Select "technical" module
		WebElement technical = driver.findElement(By.xpath((".//*[@id='nav']/li[7]/a/span")));
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		// test.log(LogStatus.INFO, "Technical");
		Thread.sleep(2000);

		// Select "Vetting"
		WebElement Vetting = driver.findElement(By.xpath((".//*[@id='nav']/li[7]/ul/li[10]/a/span")));
		Vetting.click();
		action.moveToElement(Vetting).build().perform();

		// Select "Vetting Planner"
		WebElement VettingPlanner = driver.findElement(By.xpath((".//*[@id='nav']/li[7]/ul/li[10]/ul/li[1]/a/span")));
		VettingPlanner.click();
		Thread.sleep(5000);
	}

	// -------------------------------------------------"create New vetting"--------------------------------------------------------------------------//


	public void createnewvetting(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// click "create new vetting"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_tbCntr_tbVetOverview_ImgAddNewVetting']");
		Thread.sleep(3000);

		// switch to iframe
		WebElement iframe1 = driver.findElement(By.id("iFrmNewVetting")); 
		driver.switchTo().frame(iframe1);
		Thread.sleep(3000);

		// "vessel" dropdown
		dropdown(driver, "xpath", ".//*[@id='ddlVessel']", "HARUKA");
		Thread.sleep(3000);

		// "Type" dropdown
		dropdown(driver, "xpath", ".//*[@id='ddlType']", "Internal");
		Thread.sleep(3000);

		// "Date" textbox
		sendkeys(driver, "xpath", ".//*[@id='txtDate']", "3-3-2060");
		Thread.sleep(3000);

		// "Questionnaire" dropdown
		dropdown(driver, "xpath", ".//*[@id='ddlQuestionaire']", "Q44");
		Thread.sleep(3000);

		// click on "create vetting button"
		click_element(driver, "xpath", ".//*[@id='btnCreatVetting']");
		Thread.sleep(3000);

		// Alert of "vetting save"
		Alert vettingsave = driver.switchTo().alert();
		// To read the text from alert
		String Alertpub = vettingsave.getText();
		System.out.println(" alert 1:" + Alertpub);
		Thread.sleep(2000);
		vettingsave.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		
		

                                  //---------------------"Edit vetting"------------//
	 
	
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);
		
		// click on " edit create vetting button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_BtnEdit']");
		Thread.sleep(3000);

		// select "Inspector" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLInspector']", "Pradeep Negi");
		Thread.sleep(3000);

		// select "oil major" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLOilMajor']", "D-High Level");
		Thread.sleep(3000);

		// select "port" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLPort']", "ABBOT POINT");
		Thread.sleep(3000);

		// clear "vetting date" textbox
		clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtVetDate']");
		Thread.sleep(3000);

		// "vetting Date" textbox
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtVetDate']", "3-3-2050");
		Thread.sleep(3000);

		// clear "Number Of Days" textbox
		clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_txtNoOfDays']");
		Thread.sleep(3000);

		// "Number Of Days" textbox
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtNoOfDays']", "6");
		Thread.sleep(3000);

		// click on "save" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_BtnSave']");
		Thread.sleep(3000);
		
		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}
	

	// ------------------------------------------------------------"Add Note/Observation"------------------------------------------------------------//
	 

	/*public void addobservation(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		
        //window switching
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);
		
		//click on any one vessel name
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_tbCntr_tbVetOverview_gvVetting']/tbody/tr[7]/td[17]/a");
		Thread.sleep(3000);
		
		//window switching
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);
			
		//click on add observation
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ImgAddNewObs']");
		Thread.sleep(4000);
			
		// switch to iframe
		WebElement iframe3 = driver.findElement(By.id("iFrmNewObs"));
		driver.switchTo().frame(iframe3);
		Thread.sleep(3000);

		
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		// select " Section" dropdown
		dropdown(driver, "xpath", ".//*[@id='ddlSection']", "2");
		Thread.sleep(3000);

		// select " question" dropdown
		dropdown(driver, "xpath", ".//*[@id='ddlQuestion']", "0");
		Thread.sleep(3000);

		//click on edit
		click_element(driver, "xpath", ".//*[@id='ImgUpdate']");
		Thread.sleep(4000);
		
		// Enter "observation" in textbox
		sendkeys(driver, "xpath", ".//*[@id='txtObsDescription']", "Tester8");
		Thread.sleep(3000);

		// click on "save and close" button
		click_element(driver, "xpath", ".//*[@id='BtnSaveClose']");
		Thread.sleep(4000);

		// Alert of "perform vetting"
		Alert observation = driver.switchTo().alert();
		// To read the text from alertttt
		String Alert = observation.getText();
		System.out.println(" alert 3:" + Alert);
		Thread.sleep(2000);
		observation.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

	}*/

	// -------------------------------------------------------------------"addnewjobs"-------------------------------------------------------------//
	
	/*public void Addnewjobs(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// window switching function

				for (String handle : driver.getWindowHandles()) {

					driver.switchTo().window(handle);
				}
				Thread.sleep(4000);
				
		// click on "add new job"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvObs_ctl02_ImgNewJob']");
		Thread.sleep(4000);

		// window switching function

		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);

		// +++++++++++++++++++++++++++++++++++++++++++++++++++ alert capturing of add new job"+++++++++++++++++++++++++++++++++++++++++++++//
	

		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveJob']");
		Thread.sleep(4000);

		// Alert of "job desc."
		Alert adddesc = driver.switchTo().alert();
		// To read the text from alert
		String Alert1 = adddesc.getText();
		System.out.println(" alert of add new job 1:" + Alert1);
		Thread.sleep(2000);
		adddesc.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// Enter "Description" in text box
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtDescribe']", "Tester");
		Thread.sleep(3000);


		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveJob']");
		Thread.sleep(4000);

		// Alert of "Expected date completion"
		Alert expdate = driver.switchTo().alert();
		// To read the text from alert
		String Alert2 = expdate.getText();
		System.out.println(" alert of add new job 1:" + Alert2);
		Thread.sleep(2000);
		expdate.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// Enter "Description" in textbox
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtExpectedComp']", "29/04/2017");
		Thread.sleep(3000);



		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveJob']");
		Thread.sleep(4000);

		// Alert of "Nature dropdown"
		Alert nature = driver.switchTo().alert();
		// To read the text from alert
		String Alert4 = nature.getText();
		System.out.println(" alert of add new job 1:" + Alert4);
		Thread.sleep(2000);
		nature.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select " Section" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlNature']", "Equipment");
		Thread.sleep(3000);



		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveJob']");
		Thread.sleep(4000);

		// Alert of "primary dropdown"
		Alert primary = driver.switchTo().alert();
		// To read the text from alert
		String Alert5 = primary.getText();
		System.out.println(" alert of add new job 1:" + Alert5);
		Thread.sleep(2000);
		primary.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select " Section" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlPrimary']", "Accomodation");
		Thread.sleep(3000);

	

		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveJob']");
		Thread.sleep(4000);

		// Alert of "secondary dropdown"
		Alert Secondary = driver.switchTo().alert();
		// To read the text from alert
		String Alert6 = Secondary.getText();
		System.out.println(" alert of add new job 1:" + Alert6);
		Thread.sleep(2000);
		Secondary.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select " Section" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlSecondary']", "Medicines");
		Thread.sleep(3000);

		

		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveJob']");
		Thread.sleep(4000);

		// Alert of "department in ofc" dropdown"
		Alert depinofc = driver.switchTo().alert();
		// To read the text from alert
		String Alert7 = depinofc.getText();
		System.out.println(" alert of add new job 1:" + Alert7);
		Thread.sleep(2000);
		depinofc.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select " Section" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlInOffice']", "Accounts");
		Thread.sleep(3000);


		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveJob']");
		Thread.sleep(4000);

		// Alert of "department on ship" dropdown"
		Alert deponship = driver.switchTo().alert();
		// To read the text from alert
		String Alert8 = deponship.getText();
		System.out.println(" alert of add new job 1:" + Alert8);
		Thread.sleep(2000);
		deponship.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// select " Section" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlOnShip']", "Deck");
		Thread.sleep(3000);
		
	
		//click on "observation"
		click_element(driver, "xpath", ".//*[@id='__tab_ctl00_MainContent_tbCntr_tbObservation']");
		Thread.sleep(4000);

		//click on "Obs.job"
		click_element(driver, "xpath", ".//*[@id='__tab_ctl00_MainContent_tbCntr_tbObservationJob']");
		Thread.sleep(4000);

		//click on "vetting jobs"
		click_element(driver, "xpath", ".//*[@id='__tab_ctl00_MainContent_tbCntr_tbVettingdJobs']");
		Thread.sleep(4000);
		
		//click on "save" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveJob']");
		Thread.sleep(4000);
		
		// Alert of "job added" dropdown"
		Alert jobadded = driver.switchTo().alert();
		// To read the text from alert
		String Alert9 = jobadded.getText();
		System.out.println(" alert of add new job 1:" + Alert9);
		Thread.sleep(2000);
		jobadded.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
}
*/
	//------------------------------------------------------------------"Assign job"-------------------------------------------------------------------------//
	
	    /* public void assignjob(WebDriver driver1) throws Exception {
		 WebDriver driver = driver1;
	
		// window switching function

			for (String handle : driver.getWindowHandles()) {

				driver.switchTo().window(handle);
			}
			Thread.sleep(4000);
			
			
	       //click  on "assign job"
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvObs_ctl02_ImgAssignJob']");
			Thread.sleep(4000);	
	
			// switch to iframe
			WebElement iframe5 = driver.findElement(By.id("iFrmAssignJobs")); 
			driver.switchTo().frame(iframe5);
			Thread.sleep(3000);
	
	        //click on "clear filter"
			click_element(driver, "xpath", ".//*[@id='ImgBtnClearFilter']");
			Thread.sleep(4000);	
	
	         // click on "linked jobs--no" radiobutton
			radioButton(driver, "xpath", ".//*[@id='rbtnLinkedJobs_1']");
			Thread.sleep(4000);	
			
			// click on "search" button
			click_element(driver, "xpath", ".//*[@id='ImgBtnSearch']");
			Thread.sleep(4000);
			
	         // selecting "checkbox of pending" radiobutton
			checkbox_element(driver, "xpath", ".//*[@id='grdJoblist_ctl07_checkRow']");
			Thread.sleep(4000);	
	        
		
	        //select "overdue filter"
			radioButton(driver, "xpath", ".//*[@id='rblJobStaus_5']");
			Thread.sleep(4000);	
	
			// click on "search" button
			click_element(driver, "xpath", ".//*[@id='ImgBtnSearch']");
			Thread.sleep(4000);
	
			// selecting "checkbox of pending" radiobutton
			checkbox_element(driver, "xpath", ".//*[@id='grdJoblist_ctl05_checkRow']");
			Thread.sleep(4000);	
	
			// selecting "checkbox of pending" radiobutton
			checkbox_element(driver, "xpath", ".//*[@id='grdJoblist_ctl06_checkRow']");
			Thread.sleep(4000);	
	
	        // click on "save"
			click_element(driver, "xpath", ".//*[@id='btnAssignandClose']");
			Thread.sleep(4000);
	
			// Alert of "job added" dropdown"
			Alert worklistassign = driver.switchTo().alert();
			// To read the text from alert
			String Alert10 = worklistassign.getText();
			System.out.println(" alert of worklist:" + Alert10);
			Thread.sleep(2000);
			worklistassign.accept();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
	}*/
	
	     /*//---------------------------------------------------"Observation and jobs"Filter-------------------------------------------------------------//
	
	         public void observationfilter(WebDriver driver1) throws Exception {
			 WebDriver driver = driver1;
	
			// window switching function

				for (String handle : driver.getWindowHandles()) {

					driver.switchTo().window(handle);
				}
				Thread.sleep(4000);
				
		//click on "section" dropdown		
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLSection_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLSection_CheckBoxListItems_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLSection_btnApplyFilter']")).click();
		Thread.sleep(3000);
	            
		//click on "Question"
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestion_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestion_CheckBoxListItems_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLQuestion_btnApplyFilter']")).click();
		Thread.sleep(3000);
				
		//click on "Observation Status"	 
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLObsStatus_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLObsStatus_CheckBoxListItems_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLObsStatus_btnApplyFilter']")).click();
		Thread.sleep(3000);
				
		//click on "Type"
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLObsType_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLObsType_CheckBoxListItems_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLObsType_btnApplyFilter']")).click();
		Thread.sleep(3000);
		
		//click on search
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
		Thread.sleep(5000);
	         }	
	         
	 //------------------------------------------------------------------"Assign job"-------------------------------------------------------------------------//
	     	
		     public void Deleteobservation(WebDriver driver1) throws Exception {
			 WebDriver driver = driver1;	  
			 
			 
			 //clear filter
			 click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnClearFilter']");
			Thread.sleep(2000);
			 
			//click on delete
			click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvObs_ctl02_ImgDelete']");
			Thread.sleep(5000);
			 
			// Alert of "delete observation" dropdown"
			Alert deleteobservation = driver.switchTo().alert();
			// To read the text from alert
			String Alert = deleteobservation.getText();
			System.out.println(" alert :" + Alert);
			Thread.sleep(2000);
			deleteobservation.accept();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000); 
			 
	         }*/

}
	

