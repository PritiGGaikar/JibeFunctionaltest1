package technical_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;


import common_Function.RW;

public class SurveyCertificateSettings extends RW{

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	 report = new ExtentReports(path.concat("Report\\TechnicalAdmin.html"));
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}
	
	public void Survey(WebDriver driver1) throws InterruptedException {     

		WebDriver driver = driver1;
		
		driver.get("http://192.168.1.202/STG_OSG/Surveys/SurveyandCertificateSettings.aspx");  //Technical-->Admin-->AlarmEffects    
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Survey and Certificate Settings ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
		/*WebElement technical = driver.findElement(By.linkText(data.getData(4, 1789, 2))); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		Thread.sleep(2000);
		

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1790, 2)));// path for "Admin"
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);

		WebElement Certificate = driver.findElement(By.linkText(data.getData(4, 1791, 2))); // path for "Survey and Certificate Settings"
		Certificate.click();
		Thread.sleep(2000);*/
		
	}
	//--------------------------------------ADD Add New SurveyCategory -----------------------------------------------------------//
	
	public void MainCategory(WebDriver driver1) throws Exception {  //(priority=1)

		WebDriver driver = driver1;
		
		
		click_element(driver, "id",(data.getData(4, 1792, 2))); //Click on SurveyCategory
		Thread.sleep(2000);

		 
        WebElement iframe=driver.findElement(By.id(data.getData(4, 1793, 2)));   //Switching to the frame
        driver.switchTo().frame(iframe);		          
        Thread.sleep(3000);
        
		click_element(driver, "xpath",(data.getData(4, 1794, 2))); //Click on Refresh
		Thread.sleep(1000);
				
		click_element(driver, "xpath",(data.getData(4, 1795, 2))); //Add New SurveyCategory
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1796, 2))); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Category is saved successfully.
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please enter category name.
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
		
		dropdown(driver, "id",(data.getData(4, 1797, 2)),(data.getData(4, 1798, 2)));// Dropdown -->Category Type-->Main Category
		Thread.sleep(1000);
	
		clear_element(driver, "id", (data.getData(4, 1799, 2)));// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1800, 2)), (data.getData(4, 1801, 2))); //Sendkeys for Category Name-->Technical
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1802, 2))); //Click on Save
		Thread.sleep(1000);

		//Alert handling for Category is saved successfully.
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully..
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     Thread.sleep(2000);
	     	     
		click_element(driver, "xpath",(data.getData(4, 1803, 2))); //Click on Refresh
		Thread.sleep(2000);
	     		 
			 
//-----------------------------------------------------Search ADDed  New SurveyCategory ------------------------------------------//
			 
		clear_element(driver, "id",(data.getData(4, 1804, 2))); //Clear Category Name
        Thread.sleep(1000);
		    
	    sendkeys(driver,"id", (data.getData(4, 1805, 2)), (data.getData(4, 1806, 2)));//Sendkeys for Category Name
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1807, 2))); //Click on Search
		Thread.sleep(1000);
		
//------------------------------------------------- Edit ADD Add New SurveyCategory -----------------------------------------------------------//
		
		click_element(driver, "id",(data.getData(4, 1808, 2))); //Click on Edit
		Thread.sleep(1000);
		
		clear_element(driver, "id",(data.getData(4, 1809, 2))); //Clear Category Name
		Thread.sleep(1000);
		    
		sendkeys(driver,"id", (data.getData(4, 1810, 2)), (data.getData(4, 1811, 2))); //Retype categary name
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1812, 2))); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Category is updated successfully.
		 Alert alert2= driver.switchTo().alert();                                         //Alert handling for Category is updated successfully.
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);

	     click_element(driver, "xpath",(data.getData(4, 1813, 2))); //Click on Refresh
	     Thread.sleep(2000);
	   //-----------------------------------------------------Search ADD Add New SurveyCategory ------------------------------------------//
		 
			clear_element(driver, "id",(data.getData(4, 1814, 2))); //Clear Category Name
	        Thread.sleep(1000);
			    
		    sendkeys(driver,"id",(data.getData(4, 1815, 2)), (data.getData(4, 1816, 2)));//Sendkeys for Category Name
			Thread.sleep(1000);
			
			click_element(driver, "id",(data.getData(4, 1817, 2))); //Click on Search
			Thread.sleep(1000);
			
	}
	//--------------------------------------------------ADD  New Sub Category -----------------------------------------------------------//
	
	public void SubCategory(WebDriver driver1) throws Exception {  //(priority=2)

		WebDriver driver = driver1;
	
		click_element(driver, "xpath",(data.getData(4, 1818, 2))); //Click on Refresh
		Thread.sleep(2000);
				
		click_element(driver, "xpath",(data.getData(4, 1819, 2))); //Add New SurveyCategory
		Thread.sleep(1000);
		
	     
		dropdown(driver, "id", (data.getData(4, 1820, 2)),(data.getData(4, 1821, 2)));// Dropdown -->Category Type-->Sub Category
		Thread.sleep(1000);		

		click_element(driver, "id",(data.getData(4, 1822, 2))); //Click on Save
		Thread.sleep(1000);

		//Alert handling for Please enter category name
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please enter category name
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	
		clear_element(driver, "id", (data.getData(4, 1823, 2)));// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1824, 2)), (data.getData(4, 1825, 2))); //Sendkeys for Category Name"Technical"
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1826, 2))); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Main category is mandatory.
		 Alert alert2 = driver.switchTo().alert();                                         //Alert handling for Main category is mandatory.
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	    
	     dropdown(driver, "id", (data.getData(4, 1827, 2)),(data.getData(4, 1828, 2)));// Dropdown -->Main Category:-->PritiGaikar
		 Thread.sleep(1000);		

		click_element(driver, "id",(data.getData(4, 1829, 2))); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Category is saved successfully
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	  
	     
	    click_element(driver, "id",(data.getData(4, 1830, 2))); //Click on Refresh
		Thread.sleep(1000);
		
		click_element(driver, "xpath",(data.getData(4, 1831, 2))); //Add New SurveyCategory
		Thread.sleep(1000);
		
	     
		dropdown(driver, "id", (data.getData(4, 1832, 2)),(data.getData(4, 1833, 2)));// Dropdown -->Category Type-->Sub Category
		Thread.sleep(1000);	
		
		clear_element(driver, "id", (data.getData(4, 1834, 2)));// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1835, 2)),(data.getData(4, 1836, 2))); //Sendkeys for Category Name"Technical"
		Thread.sleep(1000);
		
		 
	     dropdown(driver, "id", (data.getData(4, 1837, 2)),(data.getData(4, 1838, 2)));// Dropdown -->Main Category:-->PritiGaikar
		 Thread.sleep(1000);		

		click_element(driver, "id",(data.getData(4, 1839, 2))); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Category is saved successfully
		 Alert alert3 = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		
	     click_element(driver, "id",(data.getData(4, 1840, 2))); //Click on Cloce
		 Thread.sleep(1000);
		//-----------------------------Verifying Added Sub category---------------------//
		

		clear_element(driver, "id", (data.getData(4, 1841, 2)));// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1842, 2)), (data.getData(4, 1843, 2))); //Sendkeys for Category Name"Technical"
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1844, 2))); //Click on Search
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1845, 2))); //Click on Refresh
		Thread.sleep(1000);
			

		click_element(driver, "id",(data.getData(4, 1846, 2))); //Click on Export to excel
		Thread.sleep(1000);
		
		 driver.switchTo().defaultContent();
		 Thread.sleep(5000);
		 
		
	}	
	//-------------------------------------------------Survey Certificate-----------------------------------------------------------//
	
		public void SurveyCertificate(WebDriver driver1) throws Exception {  //(priority=3)

			WebDriver driver = driver1;  

		click_element(driver, "xpath",(data.getData(4, 1847, 2))); //Click on SurveyCertificate
		System.out.println("clicked");
		Thread.sleep(1000);
				
		 
        WebElement iframe=driver.findElement(By.id(data.getData(4, 1848, 2)));   //Switching to the frame
        driver.switchTo().frame(iframe);		          
        Thread.sleep(3000);	
        
		Thread.sleep(1000);
		click_element(driver, "id",(data.getData(4, 1849, 2))); //Click on Add Certificate
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1850, 2)), (data.getData(4, 1851, 2))); //Sendkeys for Certificate Name "Jibe Development"
		Thread.sleep(1000);
		
		dropdown(driver, "id", (data.getData(4, 1852, 2)),(data.getData(4, 1853, 2)));// Dropdown -->Main Category Name-->PritiGaikar
		Thread.sleep(1000);
		
		dropdown(driver, "id", (data.getData(4, 1854, 2)),(data.getData(4, 1855, 2)));// Dropdown -->Sub Category Name-->Technical
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1856, 2)), (data.getData(4, 1857, 2))); //Sendkeys for Tern " 2"
		Thread.sleep(1000);

		sendkeys(driver,"id", (data.getData(4, 1858, 2)), (data.getData(4, 1859, 2))); //Sendkeys for Rang "1"
		Thread.sleep(1000);
		
		radioButton(driver, "id", (data.getData(4, 1860, 2)));//Radio button for Alert
		Thread.sleep(1000);
		
		radioButton(driver, "id",(data.getData(4, 1861, 2)));  //Radio button for Inspection Required
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1862, 2))); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Category is saved successfully
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
//----------------------------------------------Saving second cerificate------------------------------------------------------------------//
	     
		click_element(driver, "id",(data.getData(4, 1863, 2))); //Click on Add Certificate
		Thread.sleep(1000);
				     
	    sendkeys(driver,"id", (data.getData(4, 1864, 2)), (data.getData(4, 1865, 2))); //Sendkeys for Certificate Name "Jibe Development"
		Thread.sleep(1000);
			
		dropdown(driver, "id", (data.getData(4, 1866, 2)),(data.getData(4, 1867, 2)));// Dropdown -->Main Category Name-->PritiGaikar
		Thread.sleep(1000);
			
		dropdown(driver, "id", (data.getData(4, 1868, 2)),(data.getData(4, 1869, 2)));// Dropdown -->Sub Category Name-->Technical
		Thread.sleep(1000);
			
		sendkeys(driver,"id",(data.getData(4, 1870, 2)), (data.getData(4, 1871, 2))); //Sendkeys for Tern " 2"
		Thread.sleep(1000);

		sendkeys(driver,"id", (data.getData(4, 1872, 2)), (data.getData(4, 1873, 2))); //Sendkeys for Rang "1"
		Thread.sleep(1000);
			
		radioButton(driver, "id", (data.getData(4, 1874, 2)));//Radio button for Alert
		Thread.sleep(1000);
			
		radioButton(driver, "id", (data.getData(4, 1875, 2)));  //Radio button for Inspection Required
		Thread.sleep(1000);
			
		click_element(driver, "id",(data.getData(4, 1876, 2))); //Click on Save
		Thread.sleep(1000);
			

			//Alert handling for Category name already exists in the selected category.
			 Alert alert = driver.switchTo().alert();                                         //Alert handling for Category name already exists in the selected category.
		     String Alert = alert.getText();    	   
		     System.out.println("Alert msg for:"+Alert);
		     alert.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(2000);
		     
		clear_element(driver, "id",(data.getData(4, 1877, 2))); //Clear Certificate Name
		Thread.sleep(1000);
			
		     
	    sendkeys(driver,"id", (data.getData(4, 1878, 2)), (data.getData(4, 1879, 2))); //Sendkeys for Certificate Name "Jibe Development1"
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1880, 2))); //Click on Save
		Thread.sleep(1000);

		//Alert handling for Category is saved Successfully.
		 Alert alert3 = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
//---------------------------------------------------------Delete cerificate------------------------------------------------------------------//	
		     
		    
	click_element(driver, "id",(data.getData(4, 1881, 2))); //Click on Refresh
	Thread.sleep(1000);
	    
    clear_element(driver, "id",(data.getData(4, 1882, 2))); //Click on Refresh
    Thread.sleep(1000);
		
	 sendkeys(driver,"id", (data.getData(4, 1883, 2)), (data.getData(4, 1884, 2))); //Send keys For Certificate Name
	 Thread.sleep(1000); 
	 
	 click_element(driver, "id",(data.getData(4, 1885, 2))); //Click on Search
	 Thread.sleep(1000);
	 
	 click_element(driver, "id",(data.getData(4, 1886, 2))); //Click on Delete
	 Thread.sleep(1000);
	 

		//Alert handling for delete Certificate
		 Alert alert2 = driver.switchTo().alert();                                         //Alert handling for  delete Certificate
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	 click_element(driver, "id",(data.getData(4, 1887, 2))); //Click on Refresh
	 Thread.sleep(1000);
	 
		
	dropdown(driver, "id", (data.getData(4, 1888, 2)),(data.getData(4, 1889, 2)));// Dropdown -->Main Category Name-->PritiGaikar
	Thread.sleep(1000);
	
	
	dropdown(driver, "id", (data.getData(4, 1890, 2)),(data.getData(4, 1891, 2)));// Dropdown -->Sub Category Name-->Technical
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 1892, 2))); //Click on Search
    Thread.sleep(1000);
    
    driver.switchTo().defaultContent();
	 Thread.sleep(3000);
 

		     
}	
//-------------------------------------------------------------Survey Vessel assignment------------------------------------------------------------------//
		
			public void SurveyAssign(WebDriver driver1) throws Exception {  //(priority=4)

				WebDriver driver = driver1;  
				
	click_element(driver, "xpath",(data.getData(4, 1893, 2))); //Click on Survey Vessel assignment
	Thread.sleep(1000);		
	
	 
    WebElement iframe=driver.findElement(By.id(data.getData(4, 1894, 2)));   //Switching to the frame
    driver.switchTo().frame(iframe);		          
    Thread.sleep(3000);	
	
	
	dropdown(driver, "id", (data.getData(4, 1895, 2)),(data.getData(4, 1896, 2)));// Dropdown -->Main Category Name-->PritiGaikar
	Thread.sleep(1000);
	
	dropdown(driver, "id", (data.getData(4, 1897, 2)),(data.getData(4, 1898, 2)));// Dropdown -->Sub Category Name-->Technical
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 1899, 2))); //Click on Assign
	Thread.sleep(1000);	
	
	//Alert handling for Please select vesse
	 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please select vessel
    String Alert = alert.getText();    	   
    System.out.println("Alert msg for:"+Alert);
    alert.accept();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(2000);
    

	dropdown(driver, "id", (data.getData(4, 1900, 2)),(data.getData(4, 1901, 2)));// Dropdown -->Fleet---->US FLEET 1
	Thread.sleep(1000);
	
	dropdown(driver, "id", (data.getData(4, 1902, 2)),(data.getData(4, 1903, 2)));// Dropdown -->Vessel---->Demo OSG Production 1
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 1904, 2))); //Click on Assign
	Thread.sleep(1000);	
	
	clear_element(driver, "id",(data.getData(4, 1905, 2))); //Clear Equipment Type
	Thread.sleep(1000);	
	
	 sendkeys(driver,"id", (data.getData(4, 1906, 2)), (data.getData(4, 1907, 2))); //Send keys For Equipment Type"Technical Assign "
	 Thread.sleep(1000); 
	 
	 click_element(driver, "id",(data.getData(4, 1908, 2))); //Click on Save Assignment
	 Thread.sleep(1000);
	//-------------------------------------------------------------Verify -----------------------------------------------------------------//
		
	 click_element(driver, "id",(data.getData(4, 1909, 2))); //Click on Refresh
	 Thread.sleep(1000);
	 
	dropdown(driver, "id", (data.getData(4, 1910, 2)),(data.getData(4, 1911, 2)));// Dropdown -->Main Category Name-->PritiGaikar
	Thread.sleep(1000);
		

	dropdown(driver, "id", (data.getData(4, 1912, 2)),(data.getData(4, 1913, 2)));// Dropdown -->Fleet---->US FLEET 1
	Thread.sleep(1000);
	
	dropdown(driver, "id", (data.getData(4, 1914, 2)),(data.getData(4, 1915, 2)));// Dropdown -->Vessel---->Demo OSG Production 1
	Thread.sleep(1000);
	
	dropdown(driver, "id", (data.getData(4, 1916, 2)),(data.getData(4, 1917, 2)));// Dropdown -->Sub Category Name-->Technical
	Thread.sleep(1000);
	 
	 driver.switchTo().defaultContent();
	 Thread.sleep(5000);								
}				
//-------------------------------------------------------------Certificate Authority-----------------------------------------------------------------//
			
			public void CertificateAuthority(WebDriver driver1) throws Exception {  //(priority=5)

				WebDriver driver = driver1;  
				
	click_element(driver, "xpath",(data.getData(4, 1918, 2))); //Click on Certificate Authority
	Thread.sleep(1000);		
				
				 
	WebElement iframe=driver.findElement(By.id(data.getData(4, 1919, 2)));   //Switching to the frame
	driver.switchTo().frame(iframe);		          
	Thread.sleep(3000);	
	
	click_element(driver, "id",(data.getData(4, 1920, 2))); //Click on Add New Certificate Authority
	Thread.sleep(1000);
	
	clear_element(driver, "id",(data.getData(4, 1921, 2))); //Clear Authority name
	Thread.sleep(1000);	
	
	sendkeys(driver,"id", (data.getData(4, 1922, 2)), (data.getData(4, 1923, 2))); //Send keys For Authority "My new Authority"
	Thread.sleep(1000); 
	
	click_element(driver, "id",(data.getData(4, 1924, 2))); //Click on Save & Addnew
	Thread.sleep(1000);	
	
	//Alert handling for Authority saved successfuly
		 Alert alert = driver.switchTo().alert();                                         //Alert handling forAuthority saved successfuly
	    String Alert = alert.getText();    	   
	    System.out.println("Alert msg for:"+Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
    sendkeys(driver,"id", (data.getData(4, 1925, 2)), (data.getData(4, 1926, 2))); //Send keys For Authority "My new Authority"
	Thread.sleep(1000); 
		
	 click_element(driver, "id",(data.getData(4, 1927, 2))); //Click on Save And close
	 Thread.sleep(1000);	
	
	//Alert handling for Authority is already exists
	 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Authority is already exists
   String Alert1 = alert.getText();    	   
   System.out.println("Alert msg for:"+Alert1);
   alert1.accept();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   Thread.sleep(2000);
   
   click_element(driver, "id",(data.getData(4, 1928, 2))); //Refresh
   Thread.sleep(1000);	
   
    clear_element(driver, "id",(data.getData(4, 1929, 2))); //Clear Authority Name
    Thread.sleep(1000);	
   
    sendkeys(driver,"id", (data.getData(4, 1930, 2)), (data.getData(4, 1931, 2))); //Send keys For Authority Name "My new Authority"
  	Thread.sleep(1000); 
  	
  	 click_element(driver, "id",(data.getData(4, 1932, 2))); //Search
     Thread.sleep(1000);	
 //-------------------------------------------------------------Delete Certificate Authority-----------------------------------------------------------------//	 
   
    click_element(driver, "id",(data.getData(4, 1933, 2))); //Refresh
    Thread.sleep(1000);	
     
    clear_element(driver, "id",(data.getData(4, 1934, 2))); //ClearAuthority Name
	Thread.sleep(1000);	
	
	sendkeys(driver,"id", (data.getData(4, 1935, 2)), (data.getData(4, 1936, 2))); //Send keys For Authority "My new Authority"
	Thread.sleep(1000); 
	
	click_element(driver, "id",(data.getData(4, 1937, 2))); //Click on Search
	 Thread.sleep(1000);
	
	 click_element(driver, "id",(data.getData(4, 1938, 2))); //Click on Delete
	 Thread.sleep(1000);
	 
	//Alert handling for Delete
	 Alert alert4 = driver.switchTo().alert();                                         //Alert handling for Delete
    String Alert4 = alert4.getText();    	   
    System.out.println("Alert msg for:"+Alert4);
    alert4.accept();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(2000);		
    
    click_element(driver, "id",(data.getData(4, 1939, 2))); //Click on Refresh
	Thread.sleep(1000);	
	
	clear_element(driver, "id",(data.getData(4, 1940, 2))); //ClearAuthority Name
	Thread.sleep(1000);	
		
	sendkeys(driver,"id", (data.getData(4, 1941, 2)), (data.getData(4, 1942, 2))); //Send keys For Authority "My new Authority"
	Thread.sleep(1000); 
		
	click_element(driver, "id",(data.getData(4, 1943, 2))); //Click on Search
	Thread.sleep(1000);
	
	 String Record = driver.findElement(By.xpath(data.getData(4, 1944, 2))).getText(); // Record
     Thread.sleep(1000);	
     
     System.out.println(""+ Record);
     Thread.sleep(1000);
	
	 driver.switchTo().defaultContent();
	 Thread.sleep(5000);		
}
			
//------------------------------------------------------------- Survey Doc Type----------------------------------------------------------------//
			
			public void SurveyDocType(WebDriver driver1) throws Exception {  //(priority=6)

				WebDriver driver = driver1;  
				
	click_element(driver, "xpath",(data.getData(4, 1945, 2))); //Click on SurveyDocType
	Thread.sleep(1000);
	
	WebElement iframe=driver.findElement(By.id(data.getData(4, 1946, 2)));   //Switching to the frame
	driver.switchTo().frame(iframe);		          
	Thread.sleep(3000);	
	
	click_element(driver, "id",(data.getData(4, 1947, 2))); //Click on Add New SurveyDocType
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 1948, 2))); //Click on Save
	Thread.sleep(1000);

	//Alert handling for Please enter Document Type
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please enter Document Type
	    String Alert = alert.getText();    	   
	    System.out.println("Alert msg for:"+Alert);
	    alert.accept();
	    Thread.sleep(2000);	
	
	sendkeys(driver,"id", (data.getData(4, 1949, 2)), (data.getData(4, 1950, 2))); //Send keys For Document Type "Document1"
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 1951, 2))); //Click on Save
	Thread.sleep(1000);
	    
	click_element(driver, "id",(data.getData(4, 1952, 2))); //Click on Add New SurveyDocType
	Thread.sleep(1000);  
	    
	sendkeys(driver,"id", (data.getData(4, 1953, 2)), (data.getData(4, 1954, 2))); //Send keys ForDocument Type "Document1"
	Thread.sleep(1000);
		

	click_element(driver, "id",(data.getData(4, 1955, 2))); //Click on Save
	Thread.sleep(1000);
	

	//Alert handling for Please enter Document Type
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Please enter Document Type
	    String Alert1 = alert1.getText();    	   
	    System.out.println("Alert msg for:"+Alert1);
	    alert1.accept();
	    Thread.sleep(2000);	
	    
		    
	click_element(driver, "id",(data.getData(4, 1956, 2))); //Click on Close Button
	Thread.sleep(1000); 
		
	click_element(driver, "id",(data.getData(4, 1957, 2))); //Click on Refresh
	Thread.sleep(1000);
	
	clear_element(driver, "id",(data.getData(4, 1958, 2))); //Clear Document Type
	Thread.sleep(1000);	
	
	sendkeys(driver,"id", (data.getData(4, 1959, 2)), (data.getData(4, 1960, 2))); //Send keys For Document Type "Document1"
	Thread.sleep(1000); 
	
	click_element(driver, "id",(data.getData(4, 1961, 2))); //Click on Search
	 Thread.sleep(1000);
	 
	click_element(driver, "id",(data.getData(4, 1962, 2))); //Click on Edit
	Thread.sleep(1000);   
	
	clear_element(driver, "id",(data.getData(4, 1963, 2))); //Clear Document Type
	Thread.sleep(1000);	
	
	sendkeys(driver,"id", (data.getData(4, 1964, 2)), (data.getData(4, 1965, 2))); //Send keys For Document Type "Document"
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 1966, 2))); //Click on Save
	Thread.sleep(1000);
	
	//-------------------------------------------------------------Delete Document Type-----------------------------------------------------------------//	 
	  
		click_element(driver, "id",(data.getData(4, 1967, 2))); //Click on Refresh
		Thread.sleep(1000);
		
	    clear_element(driver, "id",(data.getData(4, 1968, 2))); //Clear Document Type
		Thread.sleep(1000);	
		
		sendkeys(driver,"id", (data.getData(4, 1969, 2)), (data.getData(4, 1970, 2))); //Send keys For Document Type "Document"
		Thread.sleep(1000); 
		
		click_element(driver, "id",(data.getData(4, 1971, 2))); //Click on Search
		 Thread.sleep(1000);
		
		 click_element(driver, "id",(data.getData(4, 1972, 2))); //Click on Delete
		 Thread.sleep(1000);
		 
		//Alert handling for Delete
		 Alert alert3 = driver.switchTo().alert();                                         //Alert handling for Delete
	    String Alert3 = alert3.getText();    	   
	    System.out.println("Alert msg for:"+Alert3);
	    alert3.accept();	   
	    Thread.sleep(2000);		
	    
	    click_element(driver, "id",(data.getData(4, 1973, 2))); //Click on Refresh
		Thread.sleep(1000);	  

	    clear_element(driver, "id",(data.getData(4, 1974, 2))); //Clear Document Type
		Thread.sleep(1000);	
		
		sendkeys(driver,"id", (data.getData(4, 1975, 2)), (data.getData(4, 1976, 2))); //Send keys For Document Type " Document"
		Thread.sleep(1000); 
		
		click_element(driver, "id",(data.getData(4, 1977, 2))); //Click on Search
		 Thread.sleep(1000);
	
		 String Record = driver.findElement(By.xpath(data.getData(4, 1978, 2))).getText(); // Record
	     Thread.sleep(1000);	
	     
	     System.out.println(""+ Record);
	     Thread.sleep(1000);
	     
	driver.switchTo().defaultContent();
	 Thread.sleep(5000);
}

	public void DeleteSurveyCategary(WebDriver driver1) throws Exception {  //(priority=7)

				WebDriver driver = driver1;  
			click_element(driver, "id",(data.getData(4, 1979, 2))); //Click on SurveyCategory
			Thread.sleep(2000);

			 
	        WebElement iframe=driver.findElement(By.id(data.getData(4, 1980, 2)));   //Switching to the frame
	        driver.switchTo().frame(iframe);		          
	        Thread.sleep(3000);
	        
			click_element(driver, "xpath",(data.getData(4, 1981, 2))); //Click on Refresh
			Thread.sleep(2000);	
			
			clear_element(driver, "id",(data.getData(4, 1982, 2))); //Clear Category Name
			Thread.sleep(1000);	
			
			sendkeys(driver,"id", (data.getData(4, 1983, 2)), (data.getData(4, 1984, 2))); //Send keys For  Category Name"PritiGaikar"
			Thread.sleep(1000); 
			
			click_element(driver, "id",(data.getData(4, 1985, 2))); //Click on Search
			Thread.sleep(1000);
			
			click_element(driver, "id",(data.getData(4, 1986, 2))); //Click on Delete
			Thread.sleep(1000);
			
			//Alert handling for Delete
			 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Delete
		    String Alert1 = alert1.getText();    	   
		    System.out.println("Alert msg for:"+Alert1);
		    alert1.accept();
		    Thread.sleep(2000);	
		    
		    click_element(driver, "xpath",(data.getData(4, 1987, 2))); //Click on Refresh
			Thread.sleep(2000);	
			
			clear_element(driver, "id",(data.getData(4, 1988, 2))); //Clear Category Name
			Thread.sleep(1000);	
			
			sendkeys(driver,"id", (data.getData(4, 1989, 2)),(data.getData(4, 1990, 2))); //Send keys For  Category Name"PritiGaikar"
			Thread.sleep(1000); 
			
			click_element(driver, "id",(data.getData(4, 1991, 2))); //Click on Search
			Thread.sleep(1000);
			
			click_element(driver, "id",(data.getData(4, 1992, 2))); //Click on Delete
			Thread.sleep(1000);
			
			//Alert handling for Delete
			 Alert alert4 = driver.switchTo().alert();                                         //Alert handling for Delete
		    String Alert4 = alert4.getText();    	   
		    System.out.println("Alert msg for:"+Alert4);
		    alert4.accept();
		    Thread.sleep(2000);	
		    
		    
		    click_element(driver, "xpath",(data.getData(4, 1993, 2))); //Click on Refresh
			Thread.sleep(2000);	
			
			clear_element(driver, "id",(data.getData(4, 1994, 2))); //Clear Category Name
			Thread.sleep(1000);	
			
			sendkeys(driver,"id", (data.getData(4, 1995, 2)), (data.getData(4, 1996, 2))); //Send keys For  Category Name"PritiGaikar"
			Thread.sleep(1000); 
			
			click_element(driver, "id",(data.getData(4, 1997, 2))); //Click on Search
			Thread.sleep(1000);

		    
		    click_element(driver, "xpath",(data.getData(4, 1998, 2))); //Click on Refresh
			Thread.sleep(2000);	
			
			 String Record = driver.findElement(By.xpath(data.getData(4, 1999, 2))).getText(); // Record
		     Thread.sleep(1000);	
		     
		     System.out.println(""+ Record);
		     Thread.sleep(1000);
			
			 driver.switchTo().defaultContent();
			 Thread.sleep(5000);
}
	public void DeleteSurveyCertificate(WebDriver driver1) throws Exception {  //(priority=8)

		WebDriver driver = driver1;  

	click_element(driver, "xpath",(data.getData(4, 2000, 2))); //Click on SurveyCertificate
	System.out.println("clicked");
	Thread.sleep(1000);
			
	 
    WebElement iframe=driver.findElement(By.id(data.getData(4, 2001, 2)));   //Switching to the frame
    driver.switchTo().frame(iframe);		          
    Thread.sleep(3000);	
    
    clear_element(driver, "id",(data.getData(4, 2002, 2))); //Clear Certificate Name
	Thread.sleep(1000);	
	
	sendkeys(driver,"id", (data.getData(4, 2003, 2)), (data.getData(4, 2004, 2))); //Sendkeys for Certificate Name "Jibe Development"
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 2005, 2))); //Click on Search
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 2006, 2))); //Click on Delete
	Thread.sleep(1000);
	

	//Alert handling for Delete
	 Alert alert5 = driver.switchTo().alert();                                         //Alert handling for Delete
    String Alert5 = alert5.getText();    	   
    System.out.println("Alert msg for:"+Alert5);
    alert5.accept();
    Thread.sleep(2000);	
    
    click_element(driver, "id",(data.getData(4, 2007, 2))); //Click on Refresh
	Thread.sleep(1000);
	
	sendkeys(driver,"id", (data.getData(4, 2008, 2)), (data.getData(4, 2009, 2))); //Sendkeys for Certificate Name "Jibe Development"
	Thread.sleep(1000);
	
	click_element(driver, "id",(data.getData(4, 2010, 2))); //Click on Search
	Thread.sleep(1000);
		
	String Record = driver.findElement(By.xpath(data.getData(4, 2011, 2))).getText(); // Record
    Thread.sleep(1000);	
    
    System.out.println(""+ Record);
    Thread.sleep(1000);	
}}