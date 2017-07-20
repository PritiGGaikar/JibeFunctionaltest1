package technical_PMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;




public class Critical_Equipments extends RW{
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

	public void CriticalEquipmentsIndex(WebDriver driver1) throws Exception{  //(priority=12)
		WebDriver driver = driver1;

		
		
		WebElement technical = driver.findElement(By.linkText("Technical"));
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		Thread.sleep(2000);
	
		
		WebElement PMS = driver.findElement(By.linkText("PMS"));
		action.moveToElement(PMS).build().perform();
		Thread.sleep(2000);
	
		driver.findElement(By.linkText("Critical Equipments")).click();
		Thread.sleep(2000);
	
		
		dropdown(driver,"id",(data.getData(4, 663, 2)),(data.getData(4, 654, 2)));       //Click on Fleet dropdown
		Thread.sleep(2000);
	
		
		dropdown(driver,"id",(data.getData(4, 665, 2)),(data.getData(4, 666, 2)));       //Click on Vessel dropdown
		Thread.sleep(2000);
		
		String Records = driver.findElement(By.id(data.getData(4, 667, 2))).getText();  //Counts for "Demo vessel -6"
		System.out.println("Counts for Demo vessel -6 is: "+Records);
		Thread.sleep(3000);
	
	
		
		

		dropdown(driver,"id",(data.getData(4, 668, 2)),(data.getData(4, 669, 2)));       //Click on Fleet dropdown
		Thread.sleep(2000);
	
		dropdown(driver,"id",(data.getData(4, 670, 2)),(data.getData(4, 671, 2)));       //Click on Vessel dropdown
		Thread.sleep(2000);

		String Records1 = driver.findElement(By.id(data.getData(4, 672, 2))).getText();  //Counts for "OFFICE"
		System.out.println("Counts for OFFICE is: "+Records1);
		Thread.sleep(3000);
	
		
		
		
		dropdown(driver,"id",(data.getData(4, 673, 2)),(data.getData(4, 674, 2)));       //Click on Fleet dropdown
		Thread.sleep(2000);
	
		dropdown(driver,"id",(data.getData(4, 675, 2)),(data.getData(4, 676, 2)));       //Click on Vessel dropdown
		Thread.sleep(2000);
		
		String Records2 = driver.findElement(By.id(data.getData(4, 677, 2))).getText();  //Counts for "IMARA"
		System.out.println("Counts for IMARA is: "+Records2);
		Thread.sleep(3000);
		
	
		
		dropdown(driver,"id",(data.getData(4, 678, 2)),(data.getData(4, 679, 2)));       //Click on Fleet dropdown
		Thread.sleep(2000);
	
		dropdown(driver,"id",(data.getData(4, 680, 2)),(data.getData(4, 681, 2)));       //Click on Vessel dropdown
		Thread.sleep(2000);
	
		
		String Records3 = driver.findElement(By.id(data.getData(4, 682, 2))).getText();  //Counts for "YELLOW MOON"
		System.out.println("Counts for YELLOW MOON is: "+Records3);
		Thread.sleep(3000);
		
		
		
		dropdown(driver,"id",(data.getData(4, 683, 2)),(data.getData(4, 684, 2)));       //Click on Fleet dropdown
		Thread.sleep(2000);
		
		dropdown(driver,"id",(data.getData(4, 685, 2)),(data.getData(4, 686, 2)));       //Click on Vessel dropdown
		Thread.sleep(2000);
		
		
		String Records4 = driver.findElement(By.id(data.getData(4, 687, 2))).getText();  //Counts for "BALEEN"
		System.out.println("Counts for BALEEN is: "+Records4);
		Thread.sleep(4000);
	
		
		

		dropdown(driver,"id",(data.getData(4, 688, 2)),(data.getData(4, 689, 2)));       //Click on Fleet dropdown
		Thread.sleep(2000);
	
		
		dropdown(driver,"id",(data.getData(4, 690, 2)),(data.getData(4, 691, 2)));       //Click on Vessel dropdown
		Thread.sleep(4000);
		
		String Records5 = driver.findElement(By.id(data.getData(4, 692, 2))).getText();  //Counts for "HARUKA"
		System.out.println("Counts for HARUKA is: "+Records5);
	
		
	}
}