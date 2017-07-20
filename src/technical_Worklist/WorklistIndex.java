package technical_Worklist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;


public class WorklistIndex extends RW {
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
   


	// Test Case 1:
	public void worklistindex(WebDriver driver1) throws InterruptedException {
		WebDriver driver = driver1;

		WebElement technical = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/a/span")); // pathfor Technical"
																						
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();		
		Thread.sleep(2000);

		WebElement worklist = driver.findElement(By.xpath(".//*[@id='nav']/li[7]/ul/li[4]/a/span"));// path for worklist																					
		worklist.click();
		action.moveToElement(worklist).build().perform();
	

		WebElement worklistindex = driver.findElement(By.linkText("Worklist Index")); // path for worklistindex																							
		worklistindex.click();	
		Thread.sleep(5000);
	
	}
	

	// -----------method for counting New job created in last 24HRS---------//

	public String Newjobcreated(WebDriver driver1) throws InterruptedException { // @Test(priority=2)
		WebDriver driver = driver1;
	

		driver.findElement(By.id(data.getData(4, 4, 2))).click(); // New job created
		
		Thread.sleep(3000);
		
		String JobsCount = driver.findElement(By.id(data.getData(4, 5, 2))).getText(); // New job created in last 24HRS 
		Thread.sleep(3000);																			
		System.out.println("New job created in last 24HRS " + JobsCount);
		Thread.sleep(3000);
		
		
		String Pagejobs = driver.findElement(By.id(data.getData(4, 6, 2))).getText(); // Total available New job created in last 24HRS  are 
		Thread.sleep(3000);																
		System.out.println("Total available New job created in last 24HRS  are " + Pagejobs);
		Thread.sleep(3000);
		
		
	    if(JobsCount.equals(Pagejobs)){
	    	  System.out.println("Jobs matches");
	    	
	    }
	        else {
	        	System.out.println("Jobs does not matches");
	        }
		return (Pagejobs);
		  
	}

	// -----------method for Folloup/response recevied fromvessels in last 24

	public void Folloupresponse(WebDriver driver1) throws InterruptedException { // @Test(priority=3)
		WebDriver driver = driver1;
	

		driver.findElement(By.id(data.getData(4, 7, 2))).click(); // Folloup/response
		Thread.sleep(3000);
		
		
		String Followup = driver.findElement(By.id(data.getData(4, 8, 2))).getText(); // Folloup/response recevied fromvessels in last 24 Hrs  are 
		Thread.sleep(3000);																				
		System.out.println("Folloup/response recevied fromvessels in last 24 Hrs  are " + Followup);
		Thread.sleep(3000);
		
		
		String Followup1 = driver.findElement(By.id(data.getData(4, 9, 2))).getText(); //Total available Folloup/response recevied fromvessels in last 24 Hrs  are 
		Thread.sleep(3000);																						
		System.out.println("Total available Folloup/response recevied fromvessels in last 24 Hrs  are " + Followup1);
		Thread.sleep(3000);
		

	    if(Followup.equals(Followup1)){
	    	System.out.println("Jobs matches ");
	    }
	        else {
	            System.out.println("Jobs does not  matches ");
	        }
	}

	// -----------method for NCR response in last 7 days---------//
	public void NCRresponse(WebDriver driver1) throws InterruptedException { // @Test(priority=4)
		WebDriver driver = driver1;
	
		driver.findElement(By.id(data.getData(4, 10, 2))).click(); // NCR response in last 7 days																
		Thread.sleep(3000);

		String NCR = driver.findElement(By.id(data.getData(4, 11, 2))).getText(); //NCR response in last 7 days
		Thread.sleep(3000);
		System.out.println("NCR response in last 7 days are " + NCR);
		Thread.sleep(3000);
		
		
		String NCR1 = driver.findElement(By.id(data.getData(4, 12, 2))).getText(); // Total available NCR response in last 7 days
		Thread.sleep(3000);
		System.out.println("Total available NCR response in last 7 days " + NCR1);
		

	    if(NCR.equals(NCR1)){
	    	System.out.println("Jobs matches ");
	    }
	        else {
	            System.out.println("Jobs does not  matches ");
	        }
	}

	// -----------method for Jobs compleded in last 7days--------//

	public void Jobscompleded(WebDriver driver1) throws InterruptedException { // @Test(priority=5)
		WebDriver driver = driver1;
	

		driver.findElement(By.id(data.getData(4, 13, 2))).click(); // jobs																	
		Thread.sleep(3000);
		String Jobcomplet = driver.findElement(By.id(data.getData(4, 14, 2))).getText(); // jobs compleded  in last 7days
		Thread.sleep(3000);																					
		System.out.println("jobs compleded  in last 7days are " + Jobcomplet);
		Thread.sleep(3000);
		
		
		String Jobcomplet1 = driver.findElement(By.id(data.getData(4, 15, 2))).getText(); // Total available jobs compleded  in last 7days
		Thread.sleep(3000);																					
		System.out.println("Total available jobs compleded  in last 7days are " + Jobcomplet1);
		Thread.sleep(3000);

	    if(Jobcomplet.equals(Jobcomplet1)){
	    	System.out.println("Jobs matches ");
	    }
	        else {
	            System.out.println("Jobs doesnot  matches ");
	        }
	}

	// -----------method for jobs compleded but not verified--------//

	public void jobsnotverified(WebDriver driver1) throws InterruptedException { // @Test(priority=6)
		WebDriver driver = driver1;
	

		driver.findElement(By.id(data.getData(4, 16, 2))).click(); // jobs
     	Thread.sleep(3000);

		String jobNotverified = driver.findElement(By.id(data.getData(4, 17, 2))).getText(); // jobs ompleded but not verified
		Thread.sleep(3000);																						
		System.out.println("jobs compleded but not verified are " + jobNotverified);
		Thread.sleep(3000);	
		
		String jobNotverified1 = driver.findElement(By.id(data.getData(4, 18, 2))).getText(); // Total available jobs compleded but not verified
		Thread.sleep(3000);																									
		System.out.println("Total available jobs compleded but not verified are " + jobNotverified1);
		Thread.sleep(3000);	

	    if(jobNotverified.equals(jobNotverified1)){
	    	System.out.println("Jobs matches ");
	    }
	        else {
	        	 System.out.println("Jobs does not  matches ");
	        }
	}

	// -----------method for counting All Type jobs---------//

	public void All(WebDriver driver1) throws Exception { // @Test(priority=7)
		WebDriver driver = driver1;


		// Fleet-B HARUKA

		Select Fleet = new Select(driver.findElement(By.id(data.getData(4, 19, 2)))); // path for Fleet Dropdown
																						
		Fleet.selectByVisibleText("Fleet-B");
	
		Thread.sleep(3000);

		Select Vesseles = new Select(driver.findElement(By.id(data.getData(4, 21, 2)))); // path for drop down Vessel
																							
		Vesseles.selectByVisibleText("HARUKA");
	
		Thread.sleep(3000);

		driver.findElement(By.id(data.getData(4, 23, 2))).click(); // path Search	
		Thread.sleep(3000);

		      //-----------All type Pending Jobs--------------//
		

		String Pending = driver.findElement(By.xpath(data.getData(4, 1457, 2))).getText(); //  In All Type Total Pending jobs
		Thread.sleep(3000);																						
		System.out.println("In All Type Pending " + Pending);
		Thread.sleep(3000);
		
		
		//---------------------------Completed Jobs---------------------//		
		
		checkbox_element(driver, "id", (data.getData(4, 1458, 2))); // UnCheckBox CheckBox Pending
		Thread.sleep(1000);
								
		checkbox_element(driver, "id", (data.getData(4, 1459, 2))); // CheckBox  Completed
		Thread.sleep(1000);
								
		click_element(driver, "id",(data.getData(4, 1460, 2))); //Click on Search
		Thread.sleep(1000);
								
		String Completed = driver.findElement(By.xpath(data.getData(4, 1461, 2))).getText(); // In All Type Total Completed jobs
		Thread.sleep(3000);																						
		System.out.println("In All Type Completed " + Completed);
		Thread.sleep(3000);	
				
		//---------------------------Reworked Jobs---------------------//		
		
		checkbox_element(driver, "id", (data.getData(4, 1462, 2))); // UnCheckBox CheckBox Completed
		Thread.sleep(1000);
								
		checkbox_element(driver, "id", (data.getData(4, 1463, 2))); // CheckBox  Reworked
		Thread.sleep(1000);
								
		click_element(driver, "id",(data.getData(4, 1464, 2))); //Click on Search
		Thread.sleep(1000);
								
		String Reworked = driver.findElement(By.xpath(data.getData(4, 1465, 2))).getText(); // In All Type Total Reworked jobs
		Thread.sleep(3000);																						
		System.out.println("In All Type Reworked " + Reworked);
		Thread.sleep(3000);
		
		//---------------------------Verified Jobs---------------------//		
		
		checkbox_element(driver, "id", (data.getData(4, 1466, 2))); // UnCheckBox CheckBox Reworked
		Thread.sleep(1000);
								
		checkbox_element(driver, "id", (data.getData(4, 1467, 2))); // CheckBox  Verified
		Thread.sleep(1000);
								
		click_element(driver, "id",(data.getData(4, 1468, 2))); //Click on Search
		Thread.sleep(1000);
								
		String Verified = driver.findElement(By.xpath(data.getData(4, 1469, 2))).getText(); // In All Type Total Verified jobs
		Thread.sleep(3000);																						
		System.out.println("In All Type Verified " + Verified);
		Thread.sleep(3000);
		
		//---------------------------Overdue Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1470, 2))); // UnCheckBox CheckBox Verified
		Thread.sleep(1000);
								
		checkbox_element(driver, "id", (data.getData(4, 1471, 2))); // CheckBox  Overdue
		Thread.sleep(1000);
								
		click_element(driver, "id",(data.getData(4, 1472, 2))); //Click on Search
		Thread.sleep(1000);
								
		String Overdue = driver.findElement(By.xpath(data.getData(4, 1473, 2))).getText(); // In All Type Total Overdue jobs
		Thread.sleep(3000);																						
		System.out.println("In All Type Overdue " + Overdue);
		Thread.sleep(3000);
		
		//---------------------------All Jobs---------------------//
		
	
								
		checkbox_element(driver, "id", (data.getData(4, 1474, 2))); // CheckBox  All
		Thread.sleep(1000);
								
		click_element(driver, "id",(data.getData(4, 1475, 2))); //Click on Search
		Thread.sleep(1000);
								
		String All = driver.findElement(By.xpath(data.getData(4, 1476, 2))).getText(); // In All Type Total All jobs
		Thread.sleep(3000);																						
		System.out.println("In All Type All " + All);
		Thread.sleep(3000);
		
	}		
		
	//-----------------------------------------------NCR Type Jobs----------------------------------------//
	
	public void NCR(WebDriver driver1) throws Exception  { // @Test(priority=12)
		WebDriver driver = driver1;
		
		radioButton( driver, "id",(data.getData(4, 1477, 2))); // radio button NCR
		Thread.sleep(1000);
		
		
		//---------------------------Ovberdue Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1478, 2))); // UnCheckBox CheckBox All
		Thread.sleep(1000);
		
		checkbox_element(driver, "id", (data.getData(4, 1479, 2))); // CheckBox Ovberdue
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1480, 2))); //Click on Search
		Thread.sleep(1000);
		

		String Overdue = driver.findElement(By.xpath(data.getData(4, 1481, 2))).getText(); //  In NCR Type Total Overdue jobs
		Thread.sleep(3000);																						
		System.out.println("In NCR Type Overdue " + Overdue);
		Thread.sleep(3000);	
		
		//---------------------------Verified Jobs---------------------//
		checkbox_element(driver, "id", (data.getData(4, 1482, 2))); // UnCheck  CheckBox Overdue
		Thread.sleep(1000);
		
		checkbox_element(driver, "id", (data.getData(4, 1483, 2))); // CheckBox Verified
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1484, 2))); //Click on Search
		Thread.sleep(1000);
		

		String Verified = driver.findElement(By.xpath(data.getData(4, 1485, 2))).getText(); //  In NCR Type Total Verified jobs
		Thread.sleep(3000);																						
		System.out.println("In NCR Type Verified) " + Verified);
		Thread.sleep(3000);	
		

		//---------------------------Re-worked Jobs---------------------//
		checkbox_element(driver, "id", (data.getData(4, 1486, 2))); // UnCheckBox Verified
		Thread.sleep(1000);
		
		checkbox_element(driver, "id", (data.getData(4, 1487, 2))); // CheckBox Re-worked
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1488, 2))); //Click on Search
		Thread.sleep(1000);
		

		String Reworked = driver.findElement(By.xpath(data.getData(4, 1489, 2))).getText(); //  In NCR Type Total Reworked jobs
		Thread.sleep(3000);																						
		System.out.println("In NCR Type Reworked " + Reworked);
		Thread.sleep(3000);	
		
		

		//--------------------------Completed Jobs--------------------//
		checkbox_element(driver, "id", data.getData(4, 1490, 2)); // UnCheckBox Re-worked
		Thread.sleep(1000);
		
		checkbox_element(driver, "id", data.getData(4, 1491, 2)); // CheckBox Completed
		Thread.sleep(1000);
		
		click_element(driver, "id",data.getData(4, 1492, 2)); //Click on Search
		Thread.sleep(1000);
		

		String Completed = driver.findElement(By.xpath(data.getData(4, 1493, 2))).getText(); // In NCR Type Total Completed jobs
		Thread.sleep(3000);																						
		System.out.println("In NCR Type Completed " + Completed);
		Thread.sleep(3000);	
		

		//--------------------------Pending Jobs---------------------//
		checkbox_element(driver, "id", data.getData(4, 1494, 2)); // UnCheckBox Completed
		Thread.sleep(1000);
		
		checkbox_element(driver, "id", data.getData(4, 1495, 2)); // CheckBox Pending
		Thread.sleep(1000);
		
		click_element(driver, "id",data.getData(4, 1496, 2)); //Click on Search
		Thread.sleep(1000);
		

		String Pending = driver.findElement(By.xpath(data.getData(4, 1497, 2))).getText(); // In NCR Type Total Pending jobs
		Thread.sleep(3000);																						
		System.out.println("In NCR Type Pending " + Pending);
		Thread.sleep(3000);	
		
		//--------------------------All Jobs---------------------//
		checkbox_element(driver, "id", data.getData(4, 1498, 2)); // CheckBox All
		Thread.sleep(1000);				
		
		click_element(driver, "id",data.getData(4, 1499, 2)); //Click on Search
		Thread.sleep(1000);
				

		String All = driver.findElement(By.xpath(data.getData(4, 1500, 2))).getText(); // In NCR Type Total All jobs
		Thread.sleep(3000);																						
		System.out.println("In NCR Type All " + All);
		Thread.sleep(3000);	
				
	}	
	//----------------------------------------------Defect Type Jobs--------------------------------------------//
				public void Defect(WebDriver driver1) throws Exception  { // @Test(priority=13)
					WebDriver driver = driver1;
		
					
		radioButton( driver, "id",(data.getData(4, 1501, 2))); // radio button Defect
	    Thread.sleep(1000);
						
	     click_element(driver, "id",(data.getData(4, 1502, 2))); //Click on Search
		 Thread.sleep(1000);
		 
		String All = driver.findElement(By.xpath(data.getData(4, 1503, 2))).getText(); // In Defect Type Total All jobs
		Thread.sleep(3000);																						
		System.out.println("In Defect Type All " + All);
		Thread.sleep(3000);
						
		//---------------------------Pending Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1504, 2))); // UnCheckBox CheckBox All
		Thread.sleep(1000);
		
		checkbox_element(driver, "id", (data.getData(4, 1505, 2))); // CheckBox Pending
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1506, 2))); //Click on Search
		Thread.sleep(1000);
		

		String Pending = driver.findElement(By.xpath(data.getData(4, 1507, 2))).getText(); // In Defect Type Total Pending jobs
		Thread.sleep(3000);																						
		System.out.println("In Defect Type Pending " + Pending);
		Thread.sleep(3000);	
		
		//---------------------------Completed Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1508, 2))); // UnCheckBox CheckBox Pending
		Thread.sleep(1000);
				
		checkbox_element(driver, "id", (data.getData(4, 1509, 2))); // CheckBox Completed
		Thread.sleep(1000);
				
		click_element(driver, "id",(data.getData(4, 1510, 2))); //Click on Search
		Thread.sleep(1000);
				

		String Completed = driver.findElement(By.xpath(data.getData(4, 1511, 2))).getText(); // In Defect Type Total Completed jobs
		Thread.sleep(3000);																						
		System.out.println("In Defect Type Completed " + Completed);
		Thread.sleep(3000);	
				
		//---------------------------Reworked Jobs---------------------//
		

		checkbox_element(driver, "id", (data.getData(4, 1512, 2))); // UnCheckBox CheckBox Completed
		Thread.sleep(1000);
				
		checkbox_element(driver, "id", (data.getData(4, 1513, 2))); // CheckBox Reworked
		Thread.sleep(1000);
				
		click_element(driver, "id",(data.getData(4, 1514, 2))); //Click on Search
		Thread.sleep(1000);
				

		String Reworked = driver.findElement(By.xpath((data.getData(4, 1515, 2)))).getText(); // In Defect Type Total Reworked jobs
		Thread.sleep(3000);																						
		System.out.println("In Defect Type Reworked " + Reworked);
		Thread.sleep(3000);		
		
		//---------------------------Verified Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1516, 2))); // UnCheckBox CheckBox Reworked
		Thread.sleep(1000);
				
		checkbox_element(driver, "id", (data.getData(4, 1517, 2))); // CheckBox Verified
		Thread.sleep(1000);
				
		click_element(driver, "id",(data.getData(4, 1518, 2))); //Click on Search
		Thread.sleep(1000);
				

		String Verified = driver.findElement(By.xpath(data.getData(4, 1519, 2))).getText(); // In Defect Type Total Verified jobs
		Thread.sleep(3000);																						
		System.out.println("In Defect Type Verified " + Verified);
		Thread.sleep(3000);
		
		//---------------------------Overdue Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1520, 2))); // UnCheckBox CheckBox Verified
		Thread.sleep(1000);
				
		checkbox_element(driver, "id", (data.getData(4, 1521, 2))); // CheckBox Overdue
		Thread.sleep(1000);
				
		click_element(driver, "id",(data.getData(4, 1522, 2))); //Click on Search
		Thread.sleep(1000);
				

		String Overdue = driver.findElement(By.xpath(data.getData(4, 1523, 2))).getText(); // In Defect Type Total Overdue jobs
		Thread.sleep(3000);																						
		System.out.println("In Defect Type Overdue " + Overdue);
		Thread.sleep(3000);
	}
	
				//----------------------------------------------Note Type Jobs--------------------------------------------//
				public void Note(WebDriver driver1) throws Exception  { // @Test(priority=14)
					WebDriver driver = driver1;
					
					
		radioButton( driver, "id",(data.getData(4, 1524, 2))); // radio button NCR
		Thread.sleep(1000);		
		
		//---------------------------Overdue Jobs---------------------//
		click_element(driver, "id",(data.getData(4, 1525, 2))); //Click on Search
		Thread.sleep(1000);
		
		String Overdue = driver.findElement(By.xpath(data.getData(4, 1526, 2))).getText(); // In Note Type Total Overdue jobs
		Thread.sleep(3000);																						
		System.out.println("In Note Type Overdue " + Overdue);
		Thread.sleep(3000);
		
		//---------------------------Verified Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1527, 2))); // UnCheckBox CheckBox Overdue
		Thread.sleep(1000);
				
		checkbox_element(driver, "id", (data.getData(4, 1528, 2))); // CheckBox  Verified
		Thread.sleep(1000);
				
		click_element(driver, "id",(data.getData(4, 1529, 2))); //Click on Search
		Thread.sleep(1000);
				
		String Verified = driver.findElement(By.xpath((data.getData(4, 1530, 2)))).getText(); // In Note Type Total Verified jobs
		Thread.sleep(3000);																						
		System.out.println("In Note Type Verified " + Verified);
		Thread.sleep(3000);
		
		//---------------------------Reworked Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1531, 2))); // UnCheckBox CheckBox Verified
		Thread.sleep(1000);
						
		checkbox_element(driver, "id", (data.getData(4, 1532, 2))); // CheckBox  Reworked
		Thread.sleep(1000);
						
		click_element(driver, "id",(data.getData(4, 1533, 2))); //Click on Search
		Thread.sleep(1000);
						
		String Reworked = driver.findElement(By.xpath(data.getData(4, 1534, 2))).getText(); // In Note Type Total Reworked jobs
		Thread.sleep(3000);																						
		System.out.println("In Note Type Reworked " + Reworked);
		Thread.sleep(3000);
		
		//---------------------------Completed Jobs---------------------//
		
		checkbox_element(driver, "id", (data.getData(4, 1535, 2))); // UnCheckBox CheckBox Reworked
		Thread.sleep(1000);
								
		checkbox_element(driver, "id", (data.getData(4, 1536, 2))); // CheckBox  Completed
		Thread.sleep(1000);
								
		click_element(driver, "id",(data.getData(4, 1537, 2))); //Click on Search
		Thread.sleep(1000);
								
		String Completed = driver.findElement(By.xpath(data.getData(4, 1538, 2))).getText(); // In Note Type Total Completed jobs
		Thread.sleep(3000);																						
		System.out.println("In Note Type Completed " + Completed);
		Thread.sleep(3000);
				
				//---------------------------Pending Jobs---------------------//		
				

		checkbox_element(driver, "id", (data.getData(4, 1539, 2))); // UnCheckBox CheckBox Completed
		Thread.sleep(1000);
						
		checkbox_element(driver, "id", (data.getData(4, 1540, 2))); // CheckBox  Pending
		Thread.sleep(1000);
						
		click_element(driver, "id",(data.getData(4, 1541, 2))); //Click on Search
		Thread.sleep(1000);
						
		String Pending = driver.findElement(By.xpath((data.getData(4, 1542, 2)))).getText(); // In Note Type Total Pending jobs
		Thread.sleep(3000);																						
		System.out.println("In Note Type Pending " + Pending);
		Thread.sleep(3000);		
				
		//---------------------------All Jobs---------------------//		
		
		checkbox_element(driver, "id", (data.getData(4, 1543, 2))); // UnCheckBox CheckBox Pending
		Thread.sleep(1000);
						
		checkbox_element(driver, "id", (data.getData(4, 1544, 2))); // CheckBox  All
		Thread.sleep(1000);
						
		click_element(driver, "id",(data.getData(4, 1545, 2))); //Click on Search
		Thread.sleep(1000);
						
		String All = driver.findElement(By.xpath(data.getData(4, 1546, 2))).getText(); // In Note Type Total All jobs
		Thread.sleep(3000);																						
		System.out.println("In Note Type All " + All);
		Thread.sleep(3000);	
		
}
	            // -----------method for Adding New job (Test Case:1) ---------//

		        public void worklist(WebDriver driver1) throws InterruptedException{
			//	report = new ExtentReports("C:\\Users\\Priti\\workspace\\Worklist\\WorklistIndex Report.html", false);
				WebDriver driver = driver1;

				// Start Test instance
				//test = report.startTest("Add new job");
				// Categories in report
			//	test.assignCategory("Regression Test (Add New Job)");
				Thread.sleep(2000);
				
				
				/*WebElement technical = driver.findElement(By.xpath(data.getData(4, 49, 2)));//path for technical
					 
				//WebElement technical = driver.findElement(By.linkText("Technical"));																
				Actions action = new Actions(driver);
				action.moveToElement(technical).build().perform();
				action.moveToElement(technical).perform();
				test.log(LogStatus.INFO, "technical");
				Thread.sleep(2000);

				WebElement worklist = driver.findElement(By.xpath(data.getData(4, 51, 2)));//path for "Worklist "
																																		
				worklist.click();
				action.moveToElement(worklist).build().perform();
				test.log(LogStatus.INFO, "worklist");
				Thread.sleep(2000);

				WebElement worklistindex = driver.findElement(By.cssSelector(data.getData(4, 52, 2)));//path for "Worklist index"
																								
				worklistindex.click();
				test.log(LogStatus.INFO, "worklistindex");
				Thread.sleep(5000);

				// For import Image

				// driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_imgExpWithoutImg']")).click();
		*/
				WebElement addnewjob = driver.findElement(By.id(data.getData(4, 53, 2))); // Adding new job
																						
				addnewjob.click();
				//test.log(LogStatus.INFO, "addnewjob click");
				Thread.sleep(5000);

				// Window handling Function

				for (String handle : driver.getWindowHandles()) {

					driver.switchTo().window(handle);
				}
				Thread.sleep(4000);

				// Selecting Mandatory Fields

				Select vessel = new Select(driver.findElement(By.id(data.getData(4, 54, 2)))); // For
																										// "Vessel"
																										// Dropdown
				vessel.selectByVisibleText(data.getData(4, 55, 2));
			//	test.log(LogStatus.INFO, "vessel");
				driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

				Thread.sleep(3000);

				driver.findElement(By.id(data.getData(4, 56, 2))).sendKeys(data.getData(4, 57, 2)); // For
																										// "Excepted
																										// Completion"
																										// Dropdown
			//	test.log(LogStatus.INFO, "excpeted completion");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(3000);

				Select nature = new Select(driver.findElement(By.id(data.getData(4, 58, 2)))); // For
																										// "Categories-->
																										// Nature"
																										// Dropdown
				nature.selectByVisibleText(data.getData(4, 59, 2));
			//	test.log(LogStatus.INFO, "nature");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(3000);

				Select primary = new Select(driver.findElement(By.id(data.getData(4, 60, 2)))); // For
																										// "Categories-->
																										// Primary"
																										// Dropdown
				primary.selectByVisibleText(data.getData(4,61, 2));
			//	test.log(LogStatus.INFO, "primary");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(3000);

				Select secondary = new Select(driver.findElement(By.id(data.getData(4, 62, 2)))); // For
																											// "Categories-->
																											// Secondary"
																											// Dropdown
				secondary.selectByVisibleText(data.getData(4, 63, 2));
			//	test.log(LogStatus.INFO, "secondary");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(3000);

				Select ship = new Select(driver.findElement(By.id(data.getData(4, 64, 2)))); // For
																									// "Assigned
																									// Departments:-->Department
																									// On
																									// Ship
																									// "
																									// Dropdown
				ship.selectByVisibleText(data.getData(4, 65, 2));
			//	test.log(LogStatus.INFO, "dep.on ship");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(3000);

				Select office = new Select(driver.findElement(By.id(data.getData(4, 66, 2)))); // For
																										// "Assigned
																										// Departments:-->Department
																										// in
																										// Office
																										// "
																										// Dropdown
				office.selectByVisibleText(data.getData(4, 67, 2));
			//	test.log(LogStatus.INFO, "dep in ofc");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(3000);

				driver.findElement(By.id(data.getData(4, 68, 2))).sendKeys(data.getData(4, 69, 2)); // For
																									// "Describe
																									// the
																									// issue
																									// or
																									// problem
																									// here
																									// "
																									// Dropdown
			//	test.log(LogStatus.INFO, "description.");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(3000);

				driver.findElement(By.id(data.getData(4, 70, 2))).click(); // For save button								
			//	test.log(LogStatus.INFO, "save");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(4000);
		       
				Alert alert = driver.switchTo().alert(); // For "Alert" Handling
				alert.accept();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(5000);
				
				for (String handle : driver.getWindowHandles()) { // For "Window
					// switching"

		          driver.switchTo().window(handle);
		          }
		           Thread.sleep(4000);
				
		         //clear filter
					driver.findElement(By.xpath(data.getData(4, 74, 2))).click();
					Thread.sleep(2000);

				driver.findElement(By.id(data.getData(4, 71, 2))).sendKeys(data.getData(4, 72, 2)); // For checking job is added or not
		     //  test.log(LogStatus.INFO, "new job is added or not.");
		       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		       Thread.sleep(3000);
				
		        driver.findElement(By.id(data.getData(4, 73, 2))).click(); // For search button								
			//	test.log(LogStatus.INFO, "save");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(4000);
				
				

			//	report.endTest(test);
			//	report.flush();

			}
		        
		        
		        
		        
		                                // -----------method for Capturing the alert for each dropdown (Test Case:2) ---------//

			public void alerthandling(WebDriver driver1) throws Exception {
			//	test = report.startTest("alerthandling");
				WebDriver driver = driver1;

				// Add categories in Reports
				//test.assignCategory("RegressionTest Alerthandling");

				// Click on "Addnewjob"
				WebElement addnewjob1 = driver.findElement(By.id(data.getData(4, 53, 2)));
				addnewjob1.click();
			//	test.log(LogStatus.INFO, "addnewjob for alert handling");
				Thread.sleep(5000);

				// Window Handling
				for (String handle : driver.getWindowHandles()) {

					driver.switchTo().window(handle);
				}
				Thread.sleep(4000);

				// click on save button
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
			//	test.log(LogStatus.INFO, "save button");
				Thread.sleep(2000);
				// Alert handling for "job description"
				Alert alert1 = driver.switchTo().alert();
				// To read the text from alert
				String Alert1 = alert1.getText();
				System.out.println(" After clicking on save button Alert message is:" + Alert1);
				Thread.sleep(2000);
				alert1.accept();
			//	test.log(LogStatus.INFO, "alert for decription");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				// job description
				driver.findElement(By.xpath(data.getData(4, 78, 2))).sendKeys(data.getData(4, 79, 2));
			//	test.log(LogStatus.INFO, "Enter job description");
				Thread.sleep(2000);
				//click on save button
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
				Thread.sleep(2000);
				// Alert handling for "vessel dropdown"
				String jobdes = alert1.getText();
				System.out.println(" After entering job description Alert message is: " + jobdes);
				Thread.sleep(2000);
				alert1.accept();
				//test.log(LogStatus.INFO, "Alert for vessel dropdown");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				// Vessel Dropdown
				Select vessel1 = new Select(driver.findElement(By.id(data.getData(4, 80, 2))));
				vessel1.selectByVisibleText(data.getData(4, 81, 2));
				driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
				Thread.sleep(2000);
				// click on save button
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
				Thread.sleep(2000);
				// Alert handling for "vessel Dropdown"
				String vessel2 = alert1.getText();
				System.out.println(" After selecting vessel dropdown Alert message is: " + vessel2);
				Thread.sleep(2000);
				alert1.accept();
			//	test.log(LogStatus.INFO, "Alert for date dropdown");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				// Expected Completion
				driver.findElement(By.xpath(data.getData(4, 82, 2))).sendKeys(data.getData(4, 83, 2));
				Thread.sleep(2000);
				// click on save button
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
				Thread.sleep(2000);
				// Alert handling for "Expected Completion Textbox"
				String date1 = alert1.getText();
				System.out.println(" After selecting Expected Completion Alert message is: " + date1);
				Thread.sleep(2000);
				alert1.accept();
			//	test.log(LogStatus.INFO, "Alert for nature dropdown");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				// Nature Dropdown
				Select Nature1 = new Select(driver.findElement(By.id(data.getData(4, 84, 2))));
				Nature1.selectByVisibleText(data.getData(4, 85, 2));
				driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
				Thread.sleep(2000);
				// click on save button
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
				Thread.sleep(2000);
				// Alert handling for "Nature Dropdown"
				String Nature2 = alert1.getText();
				System.out.println(" After selecting Nature dropdown Alert message is: " + Nature2);
				Thread.sleep(2000);
				alert1.accept();
			//	test.log(LogStatus.INFO, "Alert for primary dropdown");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				// Primary Dropdown
				Select Primary1 = new Select(driver.findElement(By.id(data.getData(4, 86, 2))));
				Primary1.selectByVisibleText(data.getData(4, 87, 2));
				driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
				Thread.sleep(2000);
				// click on save button
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
				Thread.sleep(2000);
				// Alert handling for "primary Dropdown"
				String Primary2 = alert1.getText();
				System.out.println(" After selecting Primary dropdown Alert message is: " + Primary2);
				Thread.sleep(2000);
				alert1.accept();
			//	test.log(LogStatus.INFO, "Alert for secondary dropdown");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				// Secondary Dropdown
				Select Secondary1 = new Select(driver.findElement(By.id(data.getData(4, 88, 2))));
				Secondary1.selectByVisibleText(data.getData(4, 89, 2));
				driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
				Thread.sleep(2000);
				// click on save button
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
				Thread.sleep(2000);
				// Alert handling for "Secondary Dropdown"
				String Secondary2 = alert1.getText();
				System.out.println(" After selecting Secondary dropdown Alert message is: " + Secondary2);
				Thread.sleep(2000);
				alert1.accept();
			//	test.log(LogStatus.INFO, "Alert for department in ofc dropdown");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				// "Department in Office" Dropdown
				Select Office1 = new Select(driver.findElement(By.id(data.getData(4, 90, 2))));
				Office1.selectByVisibleText(data.getData(4, 91, 2));
				driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
				Thread.sleep(2000);
				// click on save button
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
				Thread.sleep(2000);
				// Alert handling for "Secondary Dropdown"
				String Office2 = alert1.getText();
				System.out.println(" After selecting Secondary dropdown Alert message is: " + Office2);
				Thread.sleep(2000);
				alert1.accept();
			//	test.log(LogStatus.INFO, "Alert for department in ship dropdown");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				// "Department On Ship" Dropdown
				Select Ship1 = new Select(driver.findElement(By.id(data.getData(4, 92, 2))));
				Ship1.selectByVisibleText(data.getData(4, 93, 2));
				driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
				Thread.sleep(2000);
				// click on save button//
				driver.findElement(By.xpath(data.getData(4, 77, 2))).click();
				Thread.sleep(2000);
				// Alert handling for "Secondary Dropdown"
				String Ship2 = alert1.getText();
				System.out.println(" After selecting Secondary dropdown Alert message is: " + Ship2);
				Thread.sleep(2000);
				alert1.accept();
			//	test.log(LogStatus.INFO, "Alert for job is added dropdown");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);

				
				//report.endTest(test);
			//	report.flush();
				Thread.sleep(6000);
			}

			public void worklistindexs(WebDriver driver1) throws Exception {
				//	report = new ExtentReports("C:\\Users\\Priti\\workspace\\Worklist\\WorklistIndex Report.html", false);
					WebDriver driver = driver1;
				//	test = report.startTest("Edit Job1");
					
					
			    
					// Window handling Function

							for (String handle : driver.getWindowHandles()) {

								driver.switchTo().window(handle);
							}
							Thread.sleep(2000);
							
							
							//clear filter
							driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ImgBtnClearFilter']")).click();
							Thread.sleep(2000);
							
						
							//clear job code
					        driver.findElement(By.xpath(data.getData(4, 98, 2))).clear();
					        Thread.sleep(2000);
					
					         // click on search
			                driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ImgBtnSearch']")).click();
					        Thread.sleep(2000);	
					
					driver.findElement(By.id(data.getData(4, 115, 2))).sendKeys(data.getData(4, 116, 2));// Type
																										// desired
																										// Job
				//	test.log(LogStatus.INFO, "desired Job");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(3000);

					driver.findElement(By.id(data.getData(4, 117, 2))).click();// search Job
																				// desc
					//test.log(LogStatus.INFO, "search Job desc");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(2000);

					driver.findElement(By.linkText(data.getData(4, 99, 2))).click(); // Clicking
																					// Job
																					// Description
																					
					//test.log(LogStatus.INFO, "office1");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(1000);

					for (String handle2 : driver.getWindowHandles()) { // Window Switching

						driver.switchTo().window(handle2);
					}
					Thread.sleep(4000);

					driver.findElement(By.id(data.getData(4, 100, 2))).click(); // Click on
																				// Edit job
																				// Button
					//test.log(LogStatus.INFO, "Edit job Button");
					Thread.sleep(2000);

					driver.findElement(By.id(data.getData(4, 101, 2))).clear(); // Click on
																				// Expected
																				// Date
					driver.findElement(By.id(data.getData(4, 102, 2))).sendKeys(data.getData(4, 103, 2));
					//test.log(LogStatus.INFO, "Expected Date");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(2000);

					Select nature = new Select(driver.findElement(By.id(data.getData(4, 104, 2)))); // Click
																									// on
																									// Nature
					nature.selectByVisibleText(data.getData(4, 105, 2));
					//test.log(LogStatus.INFO, "Nature");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(2000);

					Select primary = new Select(driver.findElement(By.id(data.getData(4, 106, 2)))); // Click
																									// on
																									// Primary
					primary.selectByVisibleText(data.getData(4, 107, 2));
					//test.log(LogStatus.INFO, "Primary");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(2000);

					Select secondary = new Select(driver.findElement(By.id(data.getData(4, 108, 2)))); // Click
																										// on
																										// Secondary
					secondary.selectByVisibleText(data.getData(4, 109, 2));
				//	test.log(LogStatus.INFO, "Secondary");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(2000);

					Select ship = new Select(driver.findElement(By.id(data.getData(4, 110, 2)))); // Click
																									// on
																									// Dept
																									// of
																									// Ship
					ship.selectByVisibleText(data.getData(4, 111, 2));
					//test.log(LogStatus.INFO, "Dept of Ship");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(2000);

					Select office = new Select(driver.findElement(By.id(data.getData(4, 112, 2)))); // Click
																									// on
																									// Dept
																									// of
																									// Office
					office.selectByVisibleText(data.getData(4, 113, 2));
				//	test.log(LogStatus.INFO, "Dept of Office");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(2000);

					driver.findElement(By.id(data.getData(4, 114, 2))).click(); // Click on
																				// Update
																				// Button
					//test.log(LogStatus.INFO, "Dept of Office");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(3000);

					Alert alert = driver.switchTo().alert(); // Alert handling
					String Alert = alert.getText();
					System.out.print("Alert msg for updated job is:" + Alert);
					alert.accept();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(4000);

					// Window Switching

					for (String handle2 : driver.getWindowHandles()) {

						driver.switchTo().window(handle2);
					}
					Thread.sleep(2000);

					driver.findElement(By.id(data.getData(4, 121, 2))).clear();
				//	test.log(LogStatus.INFO, "clear");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(1000);

					// searching office1 job for verification
					driver.findElement(By.id(data.getData(4, 118, 2))).sendKeys(data.getData(4, 119, 2));// Type
																										// office1
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(1000);

					driver.findElement(By.id(data.getData(4, 120, 2))).click(); // search Job
																				// desc
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(3000);

					driver.findElement(By.linkText(data.getData(4, 99, 2))).click(); // Clicking
																					// Job
																					// Description
																					// "office1
																					// "
				//	test.log(LogStatus.INFO, "office1 ");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(1000);
					// Window Switching

					for (String handle1 : driver.getWindowHandles()) {

						driver.switchTo().window(handle1);
					}	

			}
}