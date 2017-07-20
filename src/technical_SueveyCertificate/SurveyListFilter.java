package technical_SueveyCertificate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class SurveyListFilter extends RW{
	
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
	
	public void SurveyList(WebDriver driver1) throws Exception 
	
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
	
      public void FleetOffice(WebDriver driver1) throws Exception{
		
		WebDriver driver= driver1;
		
		dropdown(driver,"id", "ctl00_MainContent_ddlFleetList","Fleet-Office");     // Fleet
		Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlVessels","Demo Vessel -6");     // Vessel
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_4");   // Custom Date
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(3000);
		
		String DemoVessel6 = driver.findElement(By.id("ctl00_MainContent_grdSurveylist_ctl01_Label1")).getText();      // Get total Record count
	    System.out.println("record for Demo Vessel -6  " + DemoVessel6);
	    
	    Thread.sleep(1000);
	    
	    dropdown(driver,"id", "ctl00_MainContent_ddlVessels","Demo Vessel -7");     // Vessel
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String DemoVessel7 = driver.findElement(By.id("ctl00_MainContent_grdSurveylist_ctl01_Label1")).getText();      // Get total Record count
	    System.out.println("record for Demo Vessel -7  " + DemoVessel7);
	
        Thread.sleep(1000);
        
        //--------------------------------  OFFICE Custom Dates  ------------------------------------------------------------------------------
	    
	    dropdown(driver,"id", "ctl00_MainContent_ddlVessels","OFFICE");     // Vessel
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String OFFICE = driver.findElement(By.id("ctl00_MainContent_grdSurveylist_ctl01_Label1")).getText();      // Get total Record count
	    System.out.println("record for OFFICE  " + OFFICE);
	    
	//------------------------------------ OFFICE  Overdue ---------------------------------------------------------------------------------------------
	    
	    
      //  click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_0");     // Radio Overdue
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String OFFICEOverdue = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for OFFICE Overdue jobs " + OFFICEOverdue);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String OFFICEOverdue1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified OFFICE Overdue jobs  " + OFFICEOverdue1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String OFFICEOverdue2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified OFFICE Overdue jobs " + OFFICEOverdue2);
		
	    Thread.sleep(3000);
	    
	    
	    //--------------------------------------------------   30 days   --------------------------------------------------------------------
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_0");     // Radio Overdue
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String OFFICE30Days = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for OFFICE 30Days " + OFFICE30Days);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String OFFICE30Days1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified OFFICE 30Days  " + OFFICE30Days1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String OFFICE30Days2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified OFFICE 30Days " + OFFICE30Days2);
		
	    Thread.sleep(3000);
	    
	    
	
      }
      
      public void Fleet_A(WebDriver driver1) throws Exception{
  		
  		WebDriver driver= driver1;
  		
 //----------------------------------------------------    	AGNI   -------------------------------------------------------------------------------------------	
  		
  		dropdown(driver,"id", "ctl00_MainContent_ddlFleetList","Fleet-A");     // Fleet
		Thread.sleep(1000);
		
		dropdown(driver,"id", "ctl00_MainContent_ddlVessels","AGNI");     // Vessel AGNI
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_4");   // Custom Date
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(3000);
		
		String AGNI = driver.findElement(By.id("ctl00_MainContent_grdSurveylist_ctl01_Label1")).getText();      // Get total Record count
	    System.out.println("record for AGNI  " + AGNI);
	    
	    Thread.sleep(1000);
  //-----------------------------------------------		IMARA   -----------------------------------------------------------------------------------------------
	                                                 // Custom Dates Radio button
	    
	    dropdown(driver,"id", "ctl00_MainContent_ddlVessels","IMARA");     // Vessel  IMARA
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(3000);
  		
		String IMARA = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for IMARA  " + IMARA);
	    
        Thread.sleep(1000);
        
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Radio not Verified
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARA1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for not verified IMARA  " + IMARA1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // Radio Verified
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARA2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for verified IMARA  " + IMARA2);
	    
	    Thread.sleep(2000);
	    
	    //--------------------------------------- IMARA Overdue   -----------------------------------------------------------------------------------
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_0");     // Radio Overdue
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String IMARAOverdue = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for IMARA Overdue jobs " + IMARAOverdue);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARAOverdue1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified IMARA Overdue jobs  " + IMARAOverdue1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARAOverdue2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified IMARA Overdue jobs " + IMARAOverdue2);
		
	    Thread.sleep(3000);
	    //--------------------------------------------- 30 days  ---------------------------------------------------------------------------
	    
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_1");     // Radio 30 Days
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String IMARA30Days = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for IMARA 30Days " + IMARA30Days);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARA30Days1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified IMARA 30Days  " + IMARA30Days1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARA30Days2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified IMARA 30Days " + IMARA30Days2);
		
	    Thread.sleep(3000);
	    
	//----------------------------------------  60 Days  ---------------------------------------------------------------------------------------
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_2");     // Radio 60 Days
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String IMARA60Days = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for IMARA 60Days " + IMARA60Days);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARA60Days1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified IMARA 60Days  " + IMARA60Days1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARA60Days2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified IMARA 60Days " + IMARA60Days2);
		
	    Thread.sleep(3000);
	    
	    
	    
	// ----------------------------------------------------------  90 Days  -------------------------------------------------------------------  
	    
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_3");     // Radio 90 Days
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String IMARA90Days = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for IMARA 90Days " + IMARA90Days);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARA90Days1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified IMARA 90Days  " + IMARA90Days1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARA90Days2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified IMARA 90Days " + IMARA90Days2);
		
	    Thread.sleep(3000);
	    
	//--------------------------------------------------------------      Show All   --------------------------------------------------------------------
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_5");     // Radio 90 Days
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String IMARAShowAll = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for IMARA Show All " + IMARAShowAll);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARAShowAll1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified IMARA Show All   " + IMARAShowAll1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String IMARAShowAll2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified IMARA Show All  " + IMARAShowAll2);
		
	    Thread.sleep(3000);
	    
  	//-----------------------------------------------        YELLOW MOON       ----------------------------------------------------------------------	
	  
	                                                        // Custom Dates
	    dropdown(driver,"id", "ctl00_MainContent_ddlVessels","YELLOW MOON");     // Vessel  YELLOW MOON
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_4");   // Custom Date
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String YELLOWMOON  = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for YELLOW MOON Custom Dates " + YELLOWMOON);
	    
        Thread.sleep(1000);
        
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Radio not Verified
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String YELLOWMOON1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for not verified YELLOW MOON Custom Dates " + YELLOWMOON1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // Radio Verified
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String YELLOWMOON2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for verified YELLOW MOON Custom Dates " + YELLOWMOON2);
	    
	    Thread.sleep(2000);
	    
	    
	 //----------------------------------------------------  YELLOW MOON Overdue Jobs  ----------------------------------------------------------------------------
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_0");     // Radio Overdue
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String YELLOWMOONOverdue = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for YELLOW MOON Overdue jobs " + YELLOWMOONOverdue);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String YELLOWMOONOverdue1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified YELLOW MOON Overdue jobs  " + YELLOWMOONOverdue1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String YELLOWMOONOverdue2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified YELLOW MOON Overdue jobs " + YELLOWMOONOverdue2);
		
	    Thread.sleep(3000);
	    
	    
	    
	}

	public void Fleet_B(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;
//------------------------------------------   HARUKA    Custom Dates ---------------------------------------------------------------------------------------
		
		
		dropdown(driver, "id", "ctl00_MainContent_ddlFleetList", "Fleet-B"); // Fleet
		Thread.sleep(1000);

		dropdown(driver, "id", "ctl00_MainContent_ddlVessels", "HARUKA"); // Vessel HARUKA
																		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
		
		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_rdoExpiringIn_4"); // Custom Dates
																			
		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_btnSearch"); // Search
		Thread.sleep(2000);

		String HARUKA = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText(); // Get total Record count
																											
		System.out.println("record for HARUKA Custom Dates  " + HARUKA);
		
	    Thread.sleep(1000);
	        
	    click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Radio not Verified
		Thread.sleep(1000);
			
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
			
		String HARUKA1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
		System.out.println("record for not verified HARUKA Custom Dates " + HARUKA1);
		    
	    Thread.sleep(1000);
			
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // Radio Verified
		Thread.sleep(1000);
			
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
			
		String HARUKA2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
		System.out.println("record for verified HARUKA Custom Dates  " + HARUKA2);
		    
		Thread.sleep(2000);
		
  //----------------------------------------------------   HARUKA   Overdue Jobs   ------------------------------------------------------------------
		
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_0");     // Radio Overdue
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String HARUKAOverdue = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for HARUKA Overdue jobs " + HARUKAOverdue);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKAOverdue1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified HARUKA Overdue jobs  " + HARUKAOverdue1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKAOverdue2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified HARUKA Overdue jobs " + HARUKAOverdue2);
		
	    Thread.sleep(3000);
		
 //--------------------------------------------- 30 days  ---------------------------------------------------------------------------
	    
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_1");     // Radio 30 Days
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String HARUKA30Days = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for HARUKA 30Days " + HARUKA30Days);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKA30Days1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified HARUKA 30Days  " + HARUKA30Days1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKA30Days2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified HARUKA 30Days " + HARUKA30Days2);
		
	    Thread.sleep(3000);
	    
	//----------------------------------------  60 Days  ---------------------------------------------------------------------------------------
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_2");     // Radio 60 Days
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String HARUKA60Days = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for HARUKA 60Days " + HARUKA60Days);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKA60Days1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified HARUKA 60Days  " + HARUKA60Days1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKA60Days2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified HARUKA 60Days " + HARUKA60Days2);
		
	    Thread.sleep(3000);
	    
	    
	    
	// ----------------------------------------------------------  90 Days  -------------------------------------------------------------------  
	    
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_3");     // Radio 90 Days
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String HARUKA90Days = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for HARUKA 90Days " + HARUKA90Days);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKA90Days1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified HARUKA 90Days  " + HARUKA90Days1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKA90Days2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified HARUKA 90Days " + HARUKA90Days2);
		
	    Thread.sleep(3000);
	    
	//--------------------------------------------------------------      Show All   --------------------------------------------------------------------
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");   // Radio All
	    
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoExpiringIn_5");     // Radio Show All 
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		
	    Thread.sleep(1000);
		
		String HARUKAShowAll = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for HARUKA Show All " + HARUKAShowAll);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");   // Not verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKAShowAll1 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Not Verified HARUKA Show All   " + HARUKAShowAll1);
	    
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");   // verified
		
	    Thread.sleep(1000);
	    
	    click_element(driver,"id", "ctl00_MainContent_btnSearch");   // Search
		Thread.sleep(1000);
		
		String HARUKAShowAll2 = driver.findElement(By.id("ctl00_MainContent_ucCustomPager_lblTotalPages")).getText();      // Get total Record count
	    System.out.println("record for Verified HARUKA Show All  " + HARUKAShowAll2);
		
	    Thread.sleep(3000);

	}
	
	
	public void NA_SurveyCertificates(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;
		
     //----------------------------------------------		BALEEN  -----------------------------------------------------------------------------------
		
		dropdown(driver, "id", "ctl00_MainContent_ddlVessels", "BALEEN"); // Vessel BALEEN
																				
		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_rdoVerified_0"); // Radio All
			
		Thread.sleep(1000);
		
	    click_element(driver,"id", "ctl00_MainContent_btnShowNASurveyList");     // N/A survey certificate
		    
	    Thread.sleep(1000);
	    
	    String handlebefore= driver.getWindowHandle();   // Parent window
	    
	    WindowSwitchto(driver);       // Switch Window
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");     //  Radio Button All
	    
        Thread.sleep(1000);
        
        dropdown(driver,"id", "ctl00_MainContent_ddlPageSize","100");     // Pagination
		Thread.sleep(1000);
		
		String BALEEN_All = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText();      // Get total Record count  20
	    System.out.println("records found for BALEEN(All)  " + BALEEN_All);
		
	    Thread.sleep(1000);
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");     //  Radio Button Verified
	    
        Thread.sleep(1000);
        
        dropdown(driver,"id", "ctl00_MainContent_ddlPageSize","100");     // Pagination
		Thread.sleep(1000);
		
		String BALEEN_Verified = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText();      // Get total Record count 17
	    System.out.println("records found for BALEEN(Verified)  " + BALEEN_Verified);
		
	    Thread.sleep(1000);
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");     //  Radio Button Not Verified
	    
        Thread.sleep(1000);
        
        dropdown(driver,"id", "ctl00_MainContent_ddlPageSize","100");     // Pagination
		Thread.sleep(1000);
		
		String BALEEN_NotVerified = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText();      // Get total Record count 3
	    System.out.println("records found for BALEEN(Not Verified)  " + BALEEN_NotVerified);
	    
	    Thread.sleep(1000);
	    
	    close_driver(driver);
	    
	    driver.switchTo().window(handlebefore);    // Switch to parent window
	    
	    
	//---------------------------------------------------------    HARUKA    --------------------------------------------------------------------------
	    
	    
	    
	    dropdown(driver, "id", "ctl00_MainContent_ddlVessels", "HARUKA"); // Vessel HARUKA
			
		Thread.sleep(1000);
		
	    click_element(driver,"id", "ctl00_MainContent_btnShowNASurveyList");     // N/A survey certificate
		    
	    Thread.sleep(1000);
	    
	    String handlebefore1= driver.getWindowHandle();   // Parent window
	    
	    WindowSwitchto(driver);       // Switch Window
	    
	    click_element(driver,"id", "ctl00_MainContent_rdoVerified_0");     //  Radio Button All
	    
        Thread.sleep(1000);
        
        dropdown(driver,"id", "ctl00_MainContent_ddlPageSize","100");     // Pagination
		Thread.sleep(1000);
		
		String HARUKA_All = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText();      // Get total Record count  19
	    System.out.println("records found for HARUKA(All)  " + HARUKA_All);
		
	    Thread.sleep(1000);
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_1");     //  Radio Button Verified
	    
        Thread.sleep(1000);
        
        dropdown(driver,"id", "ctl00_MainContent_ddlPageSize","100");     // Pagination
		Thread.sleep(1000);
		
		String HARUKA_Verified = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText();      // Get total Record count 16
	    System.out.println("records found for HARUKA(Verified)  " + HARUKA_Verified);
		
	    Thread.sleep(1000);
	    
        click_element(driver,"id", "ctl00_MainContent_rdoVerified_2");     //  Radio Button Not Verified
	    
        Thread.sleep(1000);
        
        dropdown(driver,"id", "ctl00_MainContent_ddlPageSize","100");     // Pagination
		Thread.sleep(1000);
		
		String HARUKA_NotVerified = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText();      // Get total Record count 3
	    System.out.println("records found for HARUKA(Not Verified)  " + HARUKA_NotVerified);
	    
	    Thread.sleep(1000);
	    
	    close_driver(driver);
	    
	    driver.switchTo().window(handlebefore1);    // Switch to parent window
	    
	 //------------------------------------------------------   IMARA   ----------------------------------------------------------------------------------
	    
	    dropdown(driver, "id", "ctl00_MainContent_ddlVessels", "IMARA"); // Vessel IMARA
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnShowNASurveyList");     // N/A survey certificate
		    
		Thread.sleep(1000);
		    
		String handlebefore2 = driver.getWindowHandle(); // Parent window

		WindowSwitchto(driver); // Switch Window

		click_element(driver, "id", "ctl00_MainContent_rdoVerified_0"); // Radio Button All
							
		Thread.sleep(1000);

		dropdown(driver, "id", "ctl00_MainContent_ddlPageSize", "100"); // Pagination
		Thread.sleep(1000);

		String IMARA_All = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText(); // Get total Record count 15
																										
		System.out.println("records found for IMARA(All)  " + IMARA_All);

		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_rdoVerified_1"); // Radio Button Verified
							
		Thread.sleep(1000);

		dropdown(driver, "id", "ctl00_MainContent_ddlPageSize", "100"); // Pagination
		Thread.sleep(1000);

		String IMARA_Verified = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText(); // Get total Record count 13
		System.out.println("records found for IMARA(Verified)  " + IMARA_Verified);

		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_rdoVerified_2"); // Radio// Button// Not// Verified
			
		Thread.sleep(1000);

		dropdown(driver, "id", "ctl00_MainContent_ddlPageSize", "100"); // Pagination
		Thread.sleep(1000);

		String IMARA_NotVerified = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText(); // Get total Record count 2
																												
		System.out.println("records found for IMARA(Not Verified)  " + IMARA_NotVerified);

		Thread.sleep(1000);

		close_driver(driver);

		driver.switchTo().window(handlebefore2); // Switch to parent window
		
//--------------------------------------------------------------------		YELLOW MOON      -----------------------------------------------------------------
		
		
        dropdown(driver, "id", "ctl00_MainContent_ddlVessels", "YELLOW MOON"); // Vessel YELLOW MOON
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnShowNASurveyList");     // N/A survey certificate
		    
		Thread.sleep(1000);
		    
		String handlebefore3 = driver.getWindowHandle(); // Parent window

		WindowSwitchto(driver); // Switch Window

		click_element(driver, "id", "ctl00_MainContent_rdoVerified_0"); // Radio Button All
							
		Thread.sleep(1000);

		dropdown(driver, "id", "ctl00_MainContent_ddlPageSize", "100"); // Pagination
		Thread.sleep(1000);

		String YELLOWMOON_All = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText(); // Get total Record count 18
																										
		System.out.println("records found for YELLOW MOON(All)  " + YELLOWMOON_All);

		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_rdoVerified_1"); // Radio Button Verified
							
		Thread.sleep(1000);

		dropdown(driver, "id", "ctl00_MainContent_ddlPageSize", "100"); // Pagination
		Thread.sleep(1000);

		String YELLOWMOON_Verified = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText(); // Get total Record count 15
		System.out.println("records found for YELLOW MOON(Verified)  " + YELLOWMOON_Verified);

		Thread.sleep(1000);

		click_element(driver, "id", "ctl00_MainContent_rdoVerified_2"); // Radio// Button// Not// Verified
			
		Thread.sleep(1000);

		dropdown(driver, "id", "ctl00_MainContent_ddlPageSize", "100"); // Pagination
		Thread.sleep(1000);

		String YELLOWMOON_NotVerified = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText(); // Get total Record count 3
																												
		System.out.println("records found for YELLOW MOON(Not Verified)  " + YELLOWMOON_NotVerified);

		Thread.sleep(1000);
		
		click_element(driver, "id", "ctl00_MainContent_rdoVerified_0"); // Radio Button All
		
        Thread.sleep(1000);
		
		click_element(driver, "id", "ctl00_MainContent_grdSurveylist_ctl08_btnVerify"); // Click Verify
		
		Alert alert=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert.accept();    // Accepting alert  
	    
	    Thread.sleep(2000);  
	    
        click_element(driver, "id", "ctl00_MainContent_grdSurveylist_ctl08_btnUnVerify"); // Click Undo-Verify
		
		Alert alert1=driver.switchTo().alert();    // Switching to Alert  

	    @SuppressWarnings("unused")
		String alertMessage1=driver.switchTo().alert().getText();    // Capturing alert message.    
	   
	    System.out.println(alertMessage1);    // Displaying alert message  
	    Thread.sleep(1000);  
	    
	    alert1.accept();    // Accepting alert  
	    
	    Thread.sleep(2000);  
	    
		close_driver(driver);

		//driver.switchTo().window(handlebefore3); // Switch to parent window
		
		//Thread.sleep(1000);
		
		//dropdown(driver, "id", "ctl00_MainContent_ddlVessels", "BALEEN"); // Vessel BALEEN
		
		//Thread.sleep(1000);


	}
}