package technical_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class SuperAttendingVessel extends RW{

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
	public void UserList(WebDriver driver1) throws InterruptedException {         //(priority=0)

		WebDriver driver = driver1;
		
		driver.get("http://192.168.1.202/STG_OSG/Infrastructure/Libraries/SuperAttVessel.aspx");  //Technical-->Admin-->AlarmEffects    
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Superintendents Attending Vessel ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
		
		/*WebElement technical = driver.findElement(By.linkText(data.getData(4, 1163, 2))); // pathfor "Technical"s
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		Thread.sleep(2000);
		

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1232, 2)));// path for Admin																					
		action.moveToElement(Admin).build().perform();
		

		WebElement AlarmUnit = driver.findElement(By.linkText(data.getData(4, 1233, 2))); // path for Not use Super Attending Vessel
		AlarmUnit.click();	
		Thread.sleep(2000);*/
		
	}		
		public void AddUserRight(WebDriver driver1) throws Exception {         //(priority=1)

			WebDriver driver = driver1;
		

		clear_element(driver, "id", (data.getData(4, 1234, 2)));// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1235, 2)), (data.getData(4, 1236, 2))); //Sendkeys for User List--Amit Nandha
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1237, 2))); //Click on Search
		Thread.sleep(1000);
		
		radioButton(driver, "id",(data.getData(4, 1238, 2))); //Radio Button For Username
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1239, 2))); //Click on Add quotation
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1240, 2))); //Click on Refresh
		Thread.sleep(1000);
		

		clear_element(driver, "id", (data.getData(4, 1234, 2)));// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1235, 2)), (data.getData(4, 1236, 2))); //Sendkeys for User List--Amit Nandha
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1237, 2))); //Click on Search
		Thread.sleep(1000);
	}
	
		public void AddUserLeft(WebDriver driver1) throws Exception {         //(priority=2)

			WebDriver driver = driver1;
		

		clear_element(driver, "id", (data.getData(4, 1241, 2)));// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1242, 2)), (data.getData(4, 1243, 2))); //Sendkeys for User List--Amit Nandha
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1244, 2))); //Click on Search
		Thread.sleep(1000);
		
		radioButton(driver, "id", (data.getData(4, 1245, 2))); //Radio Button For Username
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1246, 2))); //Click on Add quotation
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1247, 2))); //Click on Refresh
		Thread.sleep(1000);
		

		clear_element(driver, "id", (data.getData(4, 1241, 2)));// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1242, 2)), (data.getData(4, 1243, 2))); //Sendkeys for User List--Amit Nandha
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1244, 2))); //Click on Search
		Thread.sleep(1000);
		
	}

}
