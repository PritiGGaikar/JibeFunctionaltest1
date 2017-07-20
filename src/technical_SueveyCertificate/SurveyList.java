package technical_SueveyCertificate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class SurveyList extends RW {
	
private static ExtentReports report;
    
    public synchronized static ExtentReports getReporter(String filePath) { ////allow only one thread to access the shared resource,To prevent thread interference.
    	if (report == null) {
	        report = new ExtentReports("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\QualityAdmin.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
        }
        
        return report;
    }
	
	
public static WebDriver driver;
	
	public void Survey(WebDriver driver1) throws Exception 
	
	{
		WebDriver driver= driver1;
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		
		
		WebElement TechnicalMenu= driver.findElement(By.linkText("Technical"));   //TechnicalMenu
		
        action.moveToElement(TechnicalMenu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		WebElement SurveyCertificatesSubmenu=driver.findElement(By.linkText("Survey/Certificates"));    // Survey/Certificates
		
		action.moveToElement(SurveyCertificatesSubmenu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Survey List")).click();
		
		
	}
	public void Search(WebDriver driver1) throws Exception{
		
		WebDriver driver= driver1;
		
		//Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlFleetList","Fleet-A");   // Fleet
		Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlVessels","SANTA MONICA");   // Vessel
		Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlMainCategory","AD");     // Main Category
		Thread.sleep(1000);
		
		radioButton(driver,"id","ctl00_MainContent_rdoExpiringIn_5");   // Expiring in
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
		
		
		
	}
	
	
     public void Validation(WebDriver driver1) throws Exception{
		
		WebDriver driver= driver1;
	
		click_element(driver,"id", "ImgAddNew");   // Add New
		Thread.sleep(1000);
		
		String handlebefore= driver.getWindowHandle();   // Parent window
		
		WindowSwitchto(driver);
		
        Thread.sleep(1000); 
		
		click_element(driver,"id", "btnSave");  // save
		
	    Alert alert=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
	    String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    
		   
	    System.out.println(alertMessage);    // Displaying alert message  
	    Thread.sleep(1000);  
		    
	    alert.accept();    // Accepting alert  
		
	    sendkeys(driver,"id","txtDateOfIssue", "26-11-2017");      //Date of Issue 
		   
		Thread.sleep(1000);
		
		click_element(driver,"id", "btnSave");  // save
		
		Thread.sleep(1000);
		
	    Alert alert1=driver.switchTo().alert();    // Switching to Alert  

		@SuppressWarnings("unused")
		String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    
			   
		System.out.println(alertMessage1);    // Displaying alert message  
		Thread.sleep(1000);  
			    
		alert1.accept();    // Accepting alert  
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","txtDateOfExpiry", "19-12-2017");     //Date of Expiry 
		
		Thread.sleep(1000);

		click_element(driver, "id", "btnSave"); // save
		
		Thread.sleep(3000);
		
		Alert alert2 = driver.switchTo().alert(); // Switching to Alert

		@SuppressWarnings("unused")
		String alertMessage2 = driver.switchTo().alert().getText(); // Capturing alert message
																	

		System.out.println(alertMessage2); // Displaying alert message
		Thread.sleep(1000);

		alert2.accept(); // Accepting alert
		
        Thread.sleep(2000); 
	    
	    close_driver(driver);
	    
	    Thread.sleep(1000); 
	    
	    driver.switchTo().window(handlebefore);
	
     }
     
     

     public void Check(WebDriver driver1) throws Exception{
		
		WebDriver driver= driver1;
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnClearSearch");  
	
		String handlebefore= driver.getWindowHandle();   // Parent window
		
		dropdown(driver,"id", "ctl00_MainContent_ddlVessels","SANTA MONICA");   // Vessel
		Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlMainCategory","AD");     // Main Category
		Thread.sleep(1000);
		
		radioButton(driver,"id","ctl00_MainContent_rdoExpiringIn_5");   // Expiring in
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_grdSurveylist_ctl02_lblVesselName");  // SANTA MONICA
		
		WindowSwitchto(driver);
		
		Thread.sleep(3000); 
		    
		close_driver(driver);
		
        Thread.sleep(1000); 
	    
	    driver.switchTo().window(handlebefore);
		
		
     }
	
	
	 public void AddNew(WebDriver driver1) throws Exception{
		
		WebDriver driver= driver1;
	
		click_element(driver,"id", "ImgAddNew");   // Add New
		Thread.sleep(1000);
		
		String handlebefore= driver.getWindowHandle();   // Parent window
		
		WindowSwitchto(driver);
		
		sendkeys(driver,"id","txtDateOfIssue", "26-04-2017");      //Date of Issue 
		   
		Thread.sleep(1000);
		
		sendkeys(driver,"id","txtDateOfExpiry", "19-05-2017");     //Date of Expiry 
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","txtExtensionDate", "23-06-2017");    //Extension Date 
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtCertificateNo", "jsdh666");    //Survey/Certificate Number 
			
		Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlAuthority","AratiDevi");     //Issuing Authority
		Thread.sleep(1000); 
		
        sendkeys(driver,"id","ctl00_MainContent_txtRemarks", "Remarks Remarks");    //Remarks
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","txtReminderDate", "16-02-2017");     //Reminder Date 
		Thread.sleep(1000); 
		
		sendkeys(driver,"id","ctl00_MainContent_txtFollowupDetails", "Details of survey");     //Details
		Thread.sleep(1000); 
		
		click_element(driver,"id", "btnSave");  // save
		
        Thread.sleep(1000); 
        
	    Alert alert=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert.accept();    // Accepting alert  
		
		click_element(driver,"id", "ctl00_MainContent_btnAdd");  // Add New Attachments
		Thread.sleep(1000);  
		
		dropdown(driver,"id", "ctl00_MainContent_ddlDocType","Aratii");   //Document Type
		Thread.sleep(1000);
		
		sendkeys(driver,"id","ctl00_MainContent_UploadAttachments", "C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");   // File path
		
		Thread.sleep(1000); 
		
		sendkeys(driver,"id","ctl00_MainContent_txtIssueDate", "26-05-2017");   // Issue Date 
		
        Thread.sleep(1000); 
		
		sendkeys(driver,"id","ctl00_MainContent_txtAtchRemarks", "Remarksqwer");   //Remarks 
		Thread.sleep(1000); 
		 
	    click_element(driver,"id", "ctl00_MainContent_btnUploadAttachments");
	    Thread.sleep(1000); 
	    
	    close_driver(driver);
	    
	    Thread.sleep(1000); 
	    
	    driver.switchTo().window(handlebefore);
	    
	    
		

	
                            //  CheckRecordClickVerify
		
	
		
		dropdown(driver,"id", "ctl00_MainContent_ddlVessels","SANTA MONICA");   // Vessel
		Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlMainCategory","AD");     // Main Category
		Thread.sleep(1000);
		
		radioButton(driver,"id","ctl00_MainContent_rdoExpiringIn_5");   // Expiring in
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_grdSurveylist_ctl02_lblVesselName");  // SANTA MONICA
		Thread.sleep(1000);
		
		
		String handlebefore1= driver.getWindowHandle();   // Parent window
		
		WindowSwitchto(driver);
		Thread.sleep(3000);
		
		click_element(driver,"id", "ctl00_MainContent_btnConfirmVerify");  //   Click Verify button
		
		Thread.sleep(3000);
 		
		Alert alert1=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage1);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert1.accept();    // Accepting alert  
	    
	    Thread.sleep(2000);  
	    
	    Alert alert2=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage2=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage2);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert2.accept();    // Accepting alert  
	    
		

    
                         //   UnverifyAndDelete
		
	
		
		
		click_element(driver,"id", "ImgDeleteCertificate");     // Delete icon
		 
		Alert alert3=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage3=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage3);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert3.accept();    // Accepting alert  
	    
	    Thread.sleep(2000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnConfirmUnVerify");
	    
	    Alert alert4=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage4=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage4);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert4.accept();    // Accepting alert  
	    
	    Thread.sleep(2000);
	    
	    Alert alert5=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage5=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage5);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert5.accept();    // Accepting alert  
	    
	    Thread.sleep(3000);
	    
	    click_element(driver,"id", "ImgDeleteCertificate");   // Delete icon
	    
        Thread.sleep(2000);
	    
	    Alert alert6=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage6=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage6);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert6.accept();    // Accepting alert  
	    
	    Thread.sleep(1000);
	    
	    close_driver(driver);
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(handlebefore1);    // Switch to parent window
	    

      
                                  //  CheckRecord
  		
  
  		
  		dropdown(driver,"id", "ctl00_MainContent_ddlVessels","SANTA MONICA");   // Vessel
		Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlMainCategory","AD");     // Main Category
		Thread.sleep(1000);
		
		radioButton(driver,"id","ctl00_MainContent_rdoExpiringIn_5");   // Expiring in
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_grdSurveylist_ctl02_lblVesselName");  // SANTA MONICA
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WindowSwitchto(driver);       // Switch Window
		
		Thread.sleep(2000);
  		
		String record = driver.findElement(By.id("pnlNavigation")).getText();      // Get total Record count
	    System.out.println("Iteration record for surveyAD certificate  " + record);
	    
        Thread.sleep(1000);
	    
	    close_driver(driver);
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(handlebefore1);    // Switch to parent window
  		
      }
	 
	 public void ClickCIAndRI(WebDriver driver1) throws Exception{
			
	    WebDriver driver= driver1;
	    
	    dropdown(driver,"id", "ctl00_MainContent_ddlVessels","HARUKA");   // Vessel
		Thread.sleep(1000);
	    
	    dropdown(driver,"id", "ctl00_MainContent_ddlMainCategory","Minu");     // Main Category
		Thread.sleep(1000);
		
		radioButton(driver,"id","ctl00_MainContent_rdoExpiringIn_5");   // Expiring in
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String handlebefore1= driver.getWindowHandle();   // Parent Window
		
		click_element(driver,"id", "ctl00_MainContent_grdSurveylist_ctl02_lblVesselName");   //  Click HARUKA
		
		Thread.sleep(1000);
		
		WindowSwitchto(driver);
		Thread.sleep(1000);
		
		String handlebefore= driver.getWindowHandle();   // Parent Window
		
		click_element(driver,"id", "txtCertInspection");   // Click Certificate Inspection 
		
		Thread.sleep(1000);
		
		WindowSwitchto(driver);
		
		String CI1 = driver.findElement(By.id("ctl00_MainContent_gvInspecrionSchedule_ctl02_lblInspectionScheduleDate")).getText();      // Vessel Inspection 
	    System.out.println("Certificate Inspection Date on Vessel Inspection Index  " + CI1);
		
		Thread.sleep(3000);
		
		close_driver(driver);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(handlebefore);
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "txtRenewwalInspection");    // Click Renewal Inspection Date 
		
		WindowSwitchto(driver);
		
		String RI1 = driver.findElement(By.id("ctl00_MainContent_gvInspecrionSchedule_ctl02_lblInspectionScheduleDate")).getText();      // Vessel Inspection 
	    System.out.println("Renewal Inspection Date on Vessel Inspection Index  " + RI1);
		
        Thread.sleep(3000);
		
		close_driver(driver);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(handlebefore);
		
        Thread.sleep(3000);
		
		close_driver(driver);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(handlebefore1);
		
		Thread.sleep(2000);	
	 
	 }
	 
	 public void MakeSurveyCertificateAsNA(WebDriver driver1) throws Exception{   // MArk As Active

		WebDriver driver = driver1;

		dropdown(driver, "id", "ctl00_MainContent_ddlVessels", "IMARA"); // Vessel
		Thread.sleep(1000);

		dropdown(driver, "id", "ctl00_MainContent_ddlMainCategory", "Minu"); // Main Category
																				
		Thread.sleep(1000);

		radioButton(driver, "id", "ctl00_MainContent_rdoExpiringIn_5"); // Expiring in
																		
		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_btnSearch"); // Search
		Thread.sleep(3000);
		
		click_element(driver, "id", "ctl00_MainContent_ImageButton2");   // Export To Excel
		
		Thread.sleep(1000);
			
		String handlebefore= driver.getWindowHandle();   // Parent Window
		
		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_grdSurveylist_ctl02_lblVesselName"); // Click IMARA
		
		WindowSwitchto(driver);
		Thread.sleep(2000);
		
		click_element(driver, "id", "ctl00_MainContent_btnMakeAsNA");  // Make Survey/Certificate As NA
		
		Alert alert=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert.accept();    // Accepting alert  
	    
        close_driver(driver);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(handlebefore);
		
		Thread.sleep(1000);
		
		click_element(driver, "id", "ctl00_MainContent_btnSearch"); // Search
		Thread.sleep(3000);
		
		String NASurvey = driver.findElement(By.id("ctl00_MainContent_grdSurveylist_ctl01_Label1")).getText();      //  Record of Minu
	    System.out.println("Show N/A Survey Certificate:  " + NASurvey);
	    
        Thread.sleep(3000);
		
		click_element(driver, "id", "ctl00_MainContent_btnShowNASurveyList"); // Click Show N/A Survey Certificate 
		Thread.sleep(2000);
		
		WindowSwitchto(driver);
		Thread.sleep(3000);
		
		String NASurvey1 = driver.findElement(By.id("ctl00_MainContent_grdSurveylist_ctl03_lblSurvey_Cert_Name")).getText();      //  Record of Minu in 
		String NASurvey2 = driver.findElement(By.id("ctl00_MainContent_grdSurveylist_ctl03_lblNA_Marked_By")).getText();
	    System.out.println("REcord of MinuAD in Show N/A Survey Certificate:  " + NASurvey1   +  NASurvey2  );
	    
	    Thread.sleep(3000);
	    
	    click_element(driver, "id", "ctl00_MainContent_grdSurveylist_ctl03_btnMarkAsActive");    // Click Mark As Active
	    
	    Alert alert1=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage1);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert1.accept();    // Accepting alert  
	    
	    Thread.sleep(1000);
	    
        close_driver(driver);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(handlebefore);
		
		Thread.sleep(1000);
		
		click_element(driver, "id", "ctl00_MainContent_btnSearch"); // Search
		Thread.sleep(3000);
		
		click_element(driver, "id", "ctl00_MainContent_ImageButton2");   // Export To Excel
		

	}
	 
	 
	 
	 public void EditAndPendingInspection(WebDriver driver1) throws Exception{
			
		WebDriver driver= driver1;
		
		//dropdown(driver,"id", "ctl00_MainContent_ddlVessels","IMARA");     // Vessel
		//Thread.sleep(1000);
	 
		//dropdown(driver,"id", "ctl00_MainContent_ddlMainCategory","444");     // Main Category
		//Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnClearSearch");   // Clear Filter
		Thread.sleep(1000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtSeachText","SABDM1");  // Search
		
		Thread.sleep(1000);
		
		radioButton(driver,"id","ctl00_MainContent_rdoExpiringIn_5");   // Expiring in  Show All
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_grdSurveylist_ctl02_lblVesselName");  // Click on IMARA
		
		String handlebefore= driver.getWindowHandle(); 
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WindowSwitchto(driver);       // Switch Window
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_ImgBtnEditRemarks");   // Click Edit 	
		
		Thread.sleep(1000);
		
		clear_element(driver,"id","ctl00_MainContent_txtCertificateRemarks");     //  Clear Survey/Certificate Remarks 
		
		Thread.sleep(2000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtCertificateRemarks","IMARA SABDM1 pending ");    // Survey/Certificate Remarks 
		
		Thread.sleep(1000);
		
		clear_element(driver,"id","ctl00_MainContent_txtMakeModel"); 
		
		Thread.sleep(2000);
		
		sendkeys(driver,"id","ctl00_MainContent_txtMakeModel","iron2345... . ");  // Make/ Model
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_ImgBtnUpdateRemarks");    // Click Update
		
		Thread.sleep(3000);
		
		clear_element(driver,"id","txtDateOfIssue"); 
		
		Thread.sleep(2000);
		
		sendkeys(driver,"id","txtDateOfIssue", "03-02-2017");      //Date of Issue 
		
		Thread.sleep(1000);
		
        clear_element(driver,"id","txtDateOfExpiry"); 
		
		Thread.sleep(2000);
		
		sendkeys(driver,"id","txtDateOfExpiry", "06-30-2017");      //Date of Expiry  
		
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
       // Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(15L, TimeUnit.SECONDS).pollingEvery(20, TimeUnit.SECONDS);
         
       // WebElement icon=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='btnCertInspection']")));
       // icon.click();
        
        
		WebElement e = driver.findElement(By.xpath(".//*[@id='btnCertInspection']"));   // Certificate Inspection 
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click();", e);

        Thread.sleep(3000);
        
        frameSwitchto(driver,"id", "IframeInspList");
        
        Thread.sleep(1000);
        
        dropdown(driver,"id", "ddlStatus","Overdue");     //   Status Overdue
		Thread.sleep(1000);
		
		dropdown(driver,"id", "DDLPort","AARHUS");     //    port AARHUS
		Thread.sleep(1000);
		
		clear_element(driver,"id","txtInspectionFromDate"); 
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","txtInspectionFromDate", "26-03-2017");     //  Inspection From : 
		
        Thread.sleep(1000);
        
        clear_element(driver,"id","txtInspectionToDate"); 
        
        Thread.sleep(1000);
		
        sendkeys(driver,"id","txtInspectionToDate", "31-05-2017");     //  Inspection To : 
		
        Thread.sleep(1000);
		
        click_element(driver,"id", "btnSearchInspection");  // Search
        
        Thread.sleep(1000);
        
        click_element(driver,"id", "gvInspectionSchedule_ctl02_btnSelectEvaluation");  // Click Select
        
        Thread.sleep(1000);
        
        driver.switchTo().defaultContent();
        
       
	//	String Certificate = driver.findElement(By.xpath(".//*[@id='txtCertInspection']")).getText();      //  Record of Certificate Inspection
	 //   System.out.println(" Certificate Inspection :  " + Certificate);
	    
        Thread.sleep(3000);
		
        WebElement e1 = driver.findElement(By.xpath(".//*[@id='btnRenewalInspection']"));   // Renewal Inspection Date
		JavascriptExecutor exe1 = (JavascriptExecutor) driver;
		exe1.executeScript("arguments[0].click();", e1);

        Thread.sleep(1000);
        
        frameSwitchto(driver,"id", "IframeInspList");     // iframe
        
        dropdown(driver,"id", "ddlStatus","Pending");     //   Status Pending
		Thread.sleep(1000);
		
		dropdown(driver,"id", "DDLPort","ABADAN");     //    port AARHUS
		Thread.sleep(1000);
		
		clear_element(driver,"id","txtInspectionFromDate"); 
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","txtInspectionFromDate", "26-12-2016");     //  Inspection From : 
		
        Thread.sleep(1000);
        
        clear_element(driver,"id","txtInspectionToDate"); 
        
        Thread.sleep(1000);
		
        sendkeys(driver,"id","txtInspectionToDate", "13-01-2018");     //  Inspection To : 
		
        Thread.sleep(1000);
		
        click_element(driver,"id", "btnSearchInspection");  // Search
        
        Thread.sleep(1000);
        
        click_element(driver,"id", "gvInspectionSchedule_ctl02_btnSelectEvaluation");  // Click Select
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
        
       // String Renewal = driver.findElement(By.id("txtRenewwalInspection")).getText();      //  Record of Renewal Inspection
	  //  System.out.println(" Renewal Inspection Date :  " + Renewal);

	    Thread.sleep(1000);
	    
		click_element(driver,"id", "btnSave");   // Save
		
		Alert alert=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
	    String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    
		   
	    System.out.println(alertMessage);    // Displaying alert message  
	    Thread.sleep(1000);  
		    
	    alert.accept();    // Accepting alert  
		    
	    Thread.sleep(2000);
	    
	    String handlebefore1= driver.getWindowHandle(); 
	    
	    click_element(driver,"id", "imgAddNew");      // Add New
	    
	    Alert alert1=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
	    String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    
		   
	    System.out.println(alertMessage1);    // Displaying alert message  
	    Thread.sleep(1000);  
		    
	    alert1.accept();    // Accepting alert  
		    
	    Thread.sleep(2000);
	    
        WindowSwitchto(driver);       // Parent Window
		
		Thread.sleep(3000); 
		
		sendkeys(driver,"id","txtDateOfIssue", "26-11-2017");      //Date of Issue 
		   
		Thread.sleep(1000);
		
		sendkeys(driver,"id","txtDateOfExpiry", "19-8-2017");     //Date of Expiry 
		
		Thread.sleep(1000);
		
		WebElement e3 = driver.findElement(By.xpath(".//*[@id='btnRenewalInspection']"));   // Renewal Inspection Date
		JavascriptExecutor exe3 = (JavascriptExecutor) driver;
		exe3.executeScript("arguments[0].click();", e3);

        Thread.sleep(1000);
        
        frameSwitchto(driver,"id", "IframeInspList");     // iframe
        
        dropdown(driver,"id", "ddlStatus","Pending");     //   Status Pending
		Thread.sleep(1000);
		
		dropdown(driver,"id", "DDLPort","ABADAN");     //    port AARHUS
		Thread.sleep(1000);
		
		clear_element(driver,"id","txtInspectionFromDate"); 
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id","txtInspectionFromDate", "15-12-2016");     //  Inspection From : 
		
        Thread.sleep(1000);
        
        clear_element(driver,"id","txtInspectionToDate"); 
        
        Thread.sleep(1000);
		
        sendkeys(driver,"id","txtInspectionToDate", "28-01-2019");     //  Inspection To : 
		
        Thread.sleep(1000);
		
        click_element(driver,"id", "btnSearchInspection");  // Search
        
        Thread.sleep(1000);
        
        click_element(driver,"id", "gvInspectionSchedule_ctl02_btnSelectEvaluation");  // Click Select
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
        
        Thread.sleep(1000);
	    
		click_element(driver,"id", "btnSave");   // Save
		
		Alert alert2=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
	    String alertMessage2=driver.switchTo().alert().getText();    // Capturing alert message.    
		   
	    System.out.println(alertMessage2);    // Displaying alert message  
	    Thread.sleep(1000);  
		    
	    alert2.accept();    // Accepting alert  
		
        Thread.sleep(3000);
		
		close_driver(driver);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(handlebefore1);
		
        Thread.sleep(3000);
		
		close_driver(driver);
		
		Thread.sleep(1000);
		
		driver.switchTo().window(handlebefore);
		
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
		Thread.sleep(1000);
			
		click_element(driver,"id", "ctl00_MainContent_ImageButton2");   // Export To Excel
      
	 }


}