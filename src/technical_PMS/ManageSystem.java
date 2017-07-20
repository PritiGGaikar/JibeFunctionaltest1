package technical_PMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;





public class ManageSystem extends RW{
	private static ExtentReports report;

	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	report = new ExtentReports("C:\\Users\\Reshma\\workspace\\Technical\\Report.html",false);
	        
	        report
	            .addSystemInfo("Host Name", "Nidhi") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
		}


		public void ManageSystemIndex(WebDriver driver1) throws Exception{

		        WebDriver driver = driver1;  
		      
		
			WebElement technical = driver.findElement(By.linkText(data.getData(4, 749, 2)));  //Click on Technical
			Actions action = new Actions(driver);
			action.moveToElement(technical).build().perform();
		
			Thread.sleep(2000);
			
			WebElement PMS = driver.findElement(By.linkText(data.getData(4, 750, 2)));   //Click on PMS
			action.moveToElement(PMS).build().perform();
		
			Thread.sleep(2000);
			
			driver.findElement(By.linkText(data.getData(4, 751, 2))).click();  ///Click on Manage System
			
			Thread.sleep(2000);
			
			
			dropdown(driver,"id",(data.getData(4, 752, 2)),(data.getData(4, 753, 2)));       //Click on Vessel dropdown
			
			Thread.sleep(2000);
			  
			
			dropdown(driver,"id",(data.getData(4, 754, 2)),(data.getData(4, 755, 2)));       //Click on Department dropdown
			
			Thread.sleep(2000);
			 
		}
		public void AddSystem(WebDriver driver1) throws Exception{
			WebDriver driver = driver1;
		    click_element(driver,"xpath",(data.getData(4, 756, 2)));            //Click on System
		
		    Thread.sleep(3000);
			
			click_element(driver,"id",(data.getData(4, 757, 2)));            //Click on Add System
		
			Thread.sleep(3000);
			
			 
			dropdown(driver,"id",(data.getData(4, 758, 2)),(data.getData(4, 759, 2)));       //Click on function
		
			Thread.sleep(2000);
			

			dropdown(driver,"id",(data.getData(4, 760, 2)),(data.getData(4, 761, 2)));       //Click on vessel
			
			Thread.sleep(2000);
			
			click_element(driver,"id",(data.getData(4, 762, 2)));            //Click on Save
			
			Thread.sleep(3000);
			
			
			Alert alert5 = driver.switchTo().alert();   //Alert handling
		    String Alert5 = alert5.getText();
		    System.out.print(Alert5);
		    alert5.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Thread.sleep(4000);
		    
			sendkeys(driver,"id",(data.getData(4, 763, 2)),(data.getData(4, 764, 2)));   //Click on Sets Installed 
		
			Thread.sleep(2000);
			
			click_element(driver,"id",(data.getData(4, 765, 2)));            //Click on Save
	
			Thread.sleep(2000);
			
			
			Alert alert6 = driver.switchTo().alert();   //Alert handling
		    String Alert6 = alert6.getText();
		    System.out.print(Alert6);
		    alert6.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Thread.sleep(4000); 
		    
			sendkeys(driver,"id",(data.getData(4, 766, 2)),(data.getData(4, 767, 2)));   //Click on Name
		
			Thread.sleep(2000);
			
			
			click_element(driver,"id",(data.getData(4, 768, 2)));            //Click on Save
		
			Thread.sleep(2000);
			
			Alert alert7 = driver.switchTo().alert();   //Alert handling
		    String Alert7 = alert7.getText();
		    System.out.print(Alert7);
		    alert7.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Thread.sleep(4000);
		    
			dropdown(driver,"id",(data.getData(4, 769, 2)),(data.getData(4, 770, 2)));       //Click on Dept
		
			Thread.sleep(2000);
			
			
			click_element(driver,"id",(data.getData(4, 771, 2)));            //Click on Save
		
			Thread.sleep(3000);
			
			Alert alert = driver.switchTo().alert();   //Alert handling
		    String Alert = alert.getText();
		    System.out.print(Alert);
		    alert.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Thread.sleep(6000);
		    
		}
		    
		    public void EditSystem(WebDriver driver1)throws Exception{
		    WebDriver driver = driver1;
		    
		    click_element(driver,"xpath",(data.getData(4, 772, 2)));            //Click on function arrow
		
		    Thread.sleep(4000);
			
			click_element(driver,"xpath",(data.getData(4, 773, 2)));        //Click on subsystem  
			
			Thread.sleep(4000);
			
			click_element(driver,"id",(data.getData(4, 774, 2)));                          //Click on edit System
	
			Thread.sleep(3000);
		 	 driver.findElement(By.cssSelector(data.getData(4, 775, 2))).sendKeys(data.getData(4, 776, 2));   //Click on function
			//dropdown(driver,"id",(data.getData(11, 27, 2)),(data.getData(11, 28, 2)));       
		
		 	 Thread.sleep(4000);
			 driver.findElement(By.cssSelector(data.getData(4, 777, 2))).click();
			//click_element(driver,"id",(data.getData(11, 29, 2)));            //Click on Save
		
			 Thread.sleep(3000);
			
			Alert alert13 = driver.switchTo().alert();   //Alert handling
		    String Alert13 = alert13.getText();
		    System.out.print(Alert13);
		    alert13.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Thread.sleep(4000);
		 	
		 	}
		    
		    public void DeleteSystem(WebDriver driver1)throws Exception{
		    	WebDriver driver = driver1;
		    	  click_element(driver,"xpath",(data.getData(4, 778, 2)));            //Click on function arrow
		    
		    	  Thread.sleep(3000);
		  		
		  		click_element(driver,"xpath",(data.getData(4, 779, 2)));        //Click on subsystem  
		  	
		  		Thread.sleep(3000);
				click_element(driver,"id",(data.getData(4, 780, 2)));            //Click on Delete system  
			
				Thread.sleep(3000);
				
				Alert alert30 = driver.switchTo().alert();   //Alert handling
			    String Alert30 = alert30.getText();
			    System.out.print(Alert30);
			    alert30.accept();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			    Thread.sleep(4000);
			    
			    Alert alert31 = driver.switchTo().alert();   //Alert handling
			    String Alert31 = alert31.getText();
			    System.out.print(Alert31);
			    alert31.accept();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			    Thread.sleep(4000);
				
		    
		    }
		    
		    
			/*public void Addsubsystem(WebDriver driver1)throws Exception{
			WebDriver driver = driver1;
			click_element(driver,"xpath",(data.getData(4, 781, 2));            //Click on function arrow
			Thread.sleep(4000);
			
			click_element(driver,"xpath",(data.getData(4, 782, 2));        //Click on subsystem  
			Thread.sleep(3000);
			
			click_element(driver,"id",(data.getData(4, 783, 2);            //Click on Add subsystem  
			Thread.sleep(3000);
			
			

			click_element(driver,"id",(data.getData(4, 784, 2)));            //Click on Save
			Thread.sleep(3000);
			
			Alert alert8 = driver.switchTo().alert();   //Alert handling
		    String Alert8 = alert8.getText();
		    System.out.print(Alert8);
		    alert8.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(4000);
		    
		    sendkeys(driver,"id",(data.getData(4, 785, 2)),(data.getData(4, 786, 2))
			
			click_element(driver,"id",(data.getData(4, 787, 2)));            //Click on Save
			Thread.sleep(3000);
			
			Alert alert9 = driver.switchTo().alert();   //Alert handling
		    String Alert9 = alert9.getText();
		    System.out.print(Alert9);
		    alert9.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(4000);
			
		    sendkeys(driver,"id",(data.getData(4, 788, 2)),(data.getData(4, 789, 2)));   //Click on Name
			Thread.sleep(2000);

			
			
			checkbox_element(driver,"xpath",(data.getData(4, 790, 2))); //Click on "Run Hour" checkbox
			Thread.sleep(2000);
			

			click_element(driver,"id",(data.getData(4, 791, 2));            //Click on Save
			Thread.sleep(3000);
			
			Alert alert1 = driver.switchTo().alert();   //Alert handling
		    String Alert1 = alert1.getText();
		    System.out.print(Alert1);
		    alert1.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(3000);
		    
		    //driver.findElement(By.cssSelector((data.getData(4, 792, 2)))).click();
		    click_element(driver,"xpath",(data.getData(3, 793, 2)));            //Click on close button
			Thread.sleep(4000);
		    
		    }
			*/
		    public void DeleteSubSystem(WebDriver driver1)throws Exception{
		    	WebDriver driver = driver1;
		    	click_element(driver,"xpath",(data.getData(4, 792, 2)));            //Click on system arrow
		  
		    	Thread.sleep(3000);
				
				click_element(driver,"xpath",(data.getData(4, 793, 2)));            //Click on subsystem  arrow
			
				Thread.sleep(3000);
			    
				
				click_element(driver,"xpath",(data.getData(4, 794, 2)));            //Click on subsystem  
			
				Thread.sleep(3000);
				
				
				click_element(driver,"id",(data.getData(4, 795, 2)));            //Click on delete subsystem  
				
				Thread.sleep(3000);
				
				Alert alert25 = driver.switchTo().alert();   //Alert handling
			    String Alert25 = alert25.getText();
			    System.out.print(Alert25);
			    alert25.accept();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			    Thread.sleep(4000);
				
				Alert alert26 = driver.switchTo().alert();   //Alert handling
			    String Alert26 = alert26.getText();
			    System.out.print(Alert26);
			    alert26.accept();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			    Thread.sleep(2000);
			    

			    
			   
		    	
		    }
		    public void EditSubSystem(WebDriver driver1)throws Exception{
		    WebDriver driver = driver1;
		    
		    click_element(driver,"xpath",(data.getData(4, 796, 2)));            //Click on function arrow
		 
		    Thread.sleep(4000);
			
			click_element(driver,"xpath",(data.getData(4, 797, 2)));        //Click on subsystem arrow 
			
			Thread.sleep(3000);
		    
		    
			click_element(driver,"xpath",(data.getData(4, 798, 2)));            //Click on subsystem  
		
			Thread.sleep(3000);
		    
		  
			click_element(driver,"id",(data.getData(4, 799, 2)));            //Click on Edit SubSystem
			
			Thread.sleep(3000);
			

			clear_element(driver,"id",(data.getData(4, 800, 2)));   //Clear Sets Installed 
		
			Thread.sleep(1000);
			sendkeys(driver,"id",(data.getData(4, 801, 2)),(data.getData(4, 802, 2)));   //Click on Sets Installed 
		
			Thread.sleep(2000);
			
			click_element(driver,"id",(data.getData(4, 803, 2)));            //Click on save 
			
			Thread.sleep(3000);
			
			Alert alert14 = driver.switchTo().alert();   //Alert handling
		    String Alert14 = alert14.getText();
		    System.out.print(Alert14);
		    alert14.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Thread.sleep(4000);
		    
		    }
		  
		    
		    
		    public void AddJob(WebDriver driver1)throws Exception{
		    WebDriver driver = driver1;
		    click_element(driver,"xpath",(data.getData(4, 804, 2)));            //Click on function arrow
		 
		    Thread.sleep(4000);
			
			click_element(driver,"xpath",(data.getData(4, 805, 2)));        //Click on subsystem arrow 
			
			Thread.sleep(3000);
		    
		    
			click_element(driver,"xpath",(data.getData(4, 806, 2)));            //Click on subsystem  
			
			Thread.sleep(3000);
			
			click_element(driver,"id",(data.getData(4, 807, 2)));            //Click on Add Job
			
			Thread.sleep(3000);
			

			click_element(driver,"id",(data.getData(4, 808, 2)));            //Click on Save
			
			Thread.sleep(3000);
			
			Alert alert10 = driver.switchTo().alert();   //Alert handling
		    String Alert10 = alert10.getText();
		    System.out.print(Alert10);
		    alert10.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Thread.sleep(4000);
		    
			sendkeys(driver,"id",(data.getData(4, 809, 2)),(data.getData(4, 810, 2)));      //Click on Job Title
	
			Thread.sleep(2000);
			
			

			click_element(driver,"id",(data.getData(4, 811, 2)));            //Click on Save
			
			Thread.sleep(3000);
			
			Alert alert11 = driver.switchTo().alert();   //Alert handling
		    String Alert11 = alert11.getText();
		    System.out.print(Alert11);
		    alert11.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Thread.sleep(4000);
		    
			sendkeys(driver,"id",(data.getData(4, 812, 2)),(data.getData(4, 813, 2)));      //Click on Description
		
			Thread.sleep(2000);
			
			

			click_element(driver,"id",(data.getData(4, 814, 2)));            //Click on Save
	
			Thread.sleep(3000);
			
			Alert alert12 = driver.switchTo().alert();   //Alert handling
		    String Alert12 = alert12.getText();
		    System.out.print(Alert12);
		    alert12.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Thread.sleep(4000);
		    
			sendkeys(driver,"id",(data.getData(4, 815, 2)),(data.getData(4, 816, 2)));      //Click on Frequency
		
			Thread.sleep(2000);
			
			
			click_element(driver,"id",(data.getData(4, 817, 2)));            //Click on Save
		
			Thread.sleep(3000);
			
		
			Alert alert2 = driver.switchTo().alert();   //Alert handling
		    String Alert2 = alert2.getText();
		    System.out.print(Alert2);
		    alert2.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Thread.sleep(4000);
			
			dropdown(driver,"id",(data.getData(4, 818, 2)),(data.getData(4, 819, 2)));       //Click on Rank
			
			Thread.sleep(2000);
			
		
			click_element(driver,"id",(data.getData(4, 820, 2)));            //Click on Save
			 
			Thread.sleep(3000);
			
			

			Alert alert3 = driver.switchTo().alert();   //Alert handling
		    String Alert3 = alert3.getText();
		    System.out.print(Alert3);
		    alert3.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Thread.sleep(3000);
		    
		    }
			
			
			 public void AddSpareItem(WebDriver driver1)throws Exception{
			WebDriver driver = driver1;
			
		    click_element(driver,"id",(data.getData(4, 821, 2)));            //Click on Add Spare/Store Item
		   
		    Thread.sleep(3000);
			

			
		    click_element(driver,"id",(data.getData(4, 822, 2)));            //Click on save
		  
		    Thread.sleep(3000);
			
			Alert alert15 = driver.switchTo().alert();   //Alert handling
		    String Alert15 = alert15.getText();
		    System.out.print(Alert15);
		    alert15.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Thread.sleep(4000);
		    
		   
		    sendkeys(driver,"id",(data.getData(4, 823, 2)),(data.getData(4, 824, 2)));      //Click on Part number
		
		    Thread.sleep(2000);
		
			
			click_element(driver,"id",(data.getData(4, 825, 2)));            //Click on save
		
			Thread.sleep(2000);
			
			Alert alert16 = driver.switchTo().alert();   //Alert handling
		    String Alert16 = alert16.getText();
		    System.out.print(Alert16);
		    alert16.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Thread.sleep(4000);
			
		    sendkeys(driver,"id",(data.getData(4, 826, 2)),(data.getData(4, 827, 2)));      //Click on Name
		
		    Thread.sleep(2000);
			
			
			click_element(driver,"id",(data.getData(4, 828, 2)));            //Click on save
			
			Thread.sleep(2000);
			
			Alert alert4 = driver.switchTo().alert();   //Alert handling
		    String Alert4 = alert4.getText();
		    System.out.print(Alert4);
		    alert4.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Thread.sleep(4000);
		    
		    driver.findElement(By.id(data.getData(4, 829, 2))).click();        // Click on Browse
		 
		    Thread.sleep(4000);
		    
		    WebElement iframe=driver.findElement(By.id(data.getData(4, 830, 2)));   //Switching to the frame
			driver.switchTo().frame(iframe);
		
			Thread.sleep(3000);
			
			driver.findElement(By.id(data.getData(4, 831, 2))).sendKeys(data.getData(4, 832, 2)); // File path
			
			Thread.sleep(2000);
		  	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		    
		    
		    driver.findElement(By.id(data.getData(4, 833, 2))).click();   //upload
		
		    Thread.sleep(2000);
		
		    
		  driver.switchTo().activeElement();  //Back to original window
		  Thread.sleep(2000);
		
			click_element(driver,"id",(data.getData(4, 834, 2)));            //Click on save
			
			Thread.sleep(4000);
		     

		 
			Alert alert17 = driver.switchTo().alert();   //Alert handling
		    String Alert17 = alert17.getText();
		    System.out.print(Alert17);
		    alert17.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Thread.sleep(3000);
			
		
			
			
		}
			
			public void EditJob(WebDriver driver1)throws Exception{
			WebDriver driver = driver1;

			click_element(driver,"xpath",(data.getData(4, 835, 2)));            //Click on Job Libraries
			
			Thread.sleep(3000);
				
			sendkeys(driver,"id",(data.getData(4, 836, 2)),(data.getData(4, 837, 2)));            //Click on search Text Box
			
			Thread.sleep(3000);
		    
		    click_element(driver,"xpath",(data.getData(4, 838, 2)));            //click on search icon
		  
		    Thread.sleep(3000);

			click_element(driver,"xpath",(data.getData(4, 839, 2)));            //click on desired job
			
			Thread.sleep(3000);
				
			clear_element(driver,"id",(data.getData(4, 840, 2)));      //Clear Job Title field
			
			Thread.sleep(2000);
			sendkeys(driver,"id",(data.getData(4, 841, 2)),(data.getData(4, 842, 2)));      //Click on Job Title
			
			Thread.sleep(2000);
			
			
			clear_element(driver,"id",(data.getData(4, 843, 2)));      //Clear Description field
			 
			Thread.sleep(2000);
			sendkeys(driver,"id",(data.getData(4, 844, 2)),(data.getData(4, 845, 2)));      //Click on Description field
		
			Thread.sleep(2000);
			
			
			click_element(driver,"id",(data.getData(4, 846, 2)));            //Click on save
			
			Thread.sleep(2000);
			

			Alert alert18 = driver.switchTo().alert();   //Alert handling
		    String Alert18 = alert18.getText();
		    System.out.print(Alert18);
		    alert18.accept();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Thread.sleep(4000);
		    
		}
		    
			public void EditItem(WebDriver driver1)throws Exception{
			WebDriver driver = driver1;
				
		   
			   	
		    click_element(driver,"xpath",(data.getData(4, 847, 2)));            //Click on Items
		  
		    Thread.sleep(3000);
			
		    sendkeys(driver,"id",(data.getData(4, 848, 2)),(data.getData(4, 849, 2)));            //Click on search Text Box
		
		    Thread.sleep(3000);

		    click_element(driver,"xpath",(data.getData(4, 850, 2)));            //Click on Search icon
		
		    Thread.sleep(5000);
		    
			 click_element(driver,"xpath",(data.getData(4, 851, 2)));            //Click on Edit icon For Item
		
			 Thread.sleep(2000);
			 
			 clear_element(driver,"id",(data.getData(4, 852, 2)));      //Clear field
		
			 Thread.sleep(2000);
			 sendkeys(driver,"id",(data.getData(4, 853, 2)),(data.getData(4, 854, 2)));      //Click on Part number
		
			 Thread.sleep(2000);
			 
			 clear_element(driver,"id",(data.getData(4, 855, 2)));      //Clear field
			
			 Thread.sleep(2000);
			 sendkeys(driver,"id",(data.getData(4, 856, 2)),(data.getData(4, 857, 2)));      //Click on Name
			
			 Thread.sleep(2000);
			  
			  click_element(driver,"id",(data.getData(4, 858, 2)));            //Click on save
			
			  Thread.sleep(3000);
			  
	            Alert alert19 = driver.switchTo().alert();   //Alert handling
			    String Alert19 = alert19.getText();
			    System.out.print(Alert19);
			    alert19.accept();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			    Thread.sleep(4000);
			    
			}   
			

			public void DeleteItem(WebDriver driver1)throws Exception{
				WebDriver driver = driver1;
				
				
			    click_element(driver,"xpath",(data.getData(4, 859, 2)));            //Click on Items
			
			    Thread.sleep(3000);
				
			    clear_element(driver,"id",(data.getData(4, 860, 2)));            //Clear text on search Text Box
			
			    Thread.sleep(3000);
				
				 sendkeys(driver,"id",(data.getData(4, 861, 2)),(data.getData(4, 862, 2)));            //Click on search Text Box
				
				 Thread.sleep(3000);
				 
			    click_element(driver,"xpath",(data.getData(4, 863, 2)));            //Click on Search icon
			
			    Thread.sleep(5000);
			   
			    //For Deleting items
			    click_element(driver,"xpath",(data.getData(4, 864, 2)));            //Click on Delete icon
			
			    Thread.sleep(2000);
				  
				  Alert alert22 = driver.switchTo().alert();   //Alert handling
				    String Alert22 = alert22.getText();
				    System.out.print(Alert22);
				    alert22.accept();
				    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
				    Thread.sleep(4000);
			    
				 radioButton(driver,"id",(data.getData(4, 865, 2)));      //click on Deleted radiobutton to verify deleted item
				
				 Thread.sleep(2000);
				    
			}
			public void DeleteJob(WebDriver driver1)throws Exception{
				WebDriver driver = driver1;
				
			   
				click_element(driver,"xpath",(data.getData(4, 866, 2)));            //Click on Job Libraries
			
				Thread.sleep(3000);
					
				clear_element(driver,"id",(data.getData(4, 867, 2)));            //Clear text on search Text Box
				
				Thread.sleep(3000);
				sendkeys(driver,"id",(data.getData(4, 868, 2)),(data.getData(4, 869, 2)));            //Click on search Text Box
				
				Thread.sleep(3000);

			    click_element(driver,"xpath",(data.getData(4, 870, 2)));            //click on search icon
			 
			    Thread.sleep(3000);
				
				 //For Deleting Job Library
				 click_element(driver,"xpath",(data.getData(4, 871, 2)));            //click on Deleted icon
				
				 Thread.sleep(2000);
				 
				 Alert alert23 = driver.switchTo().alert();   //Alert handling
				    String Alert23 = alert23.getText();
				    System.out.print(Alert23);
				    alert23.accept();
				    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				    Thread.sleep(3000);
				    
				    radioButton(driver,"id",(data.getData(4, 872, 2)));      //click on Deleted icon to verify deleted item
				 
				    Thread.sleep(4000);
			}
			
			
			   public void eformAssign(WebDriver driver1)throws Exception{
				WebDriver driver = driver1;
		
				
				radioButton(driver,"id",(data.getData(4, 873, 2)));      //click on active radiobutton
				
				Thread.sleep(2000);
					
				
				driver.findElement(By.cssSelector(data.getData(4, 874, 2))).clear();  //Clear field 
				
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(data.getData(4, 875, 2))).sendKeys(data.getData(4, 876, 2));     //Click on search Text Box
			
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(data.getData(4, 877, 2))).click();     //Click on search icon
				
				Thread.sleep(3000);
				
			     click_element(driver,"xpath",(data.getData(4, 878, 2)));            //Click on e-form assign
			
			     Thread.sleep(2000);
				  
				checkbox_element(driver,"xpath",(data.getData(4, 879, 2))); //Click on 2nd checkbox
			
				Thread.sleep(2000);
					
			     checkbox_element(driver,"xpath",(data.getData(4, 880, 2))); //Click on 4th checkbox
				
			     Thread.sleep(2000);
				 
				 
				click_element(driver,"id",(data.getData(4, 881, 2)));            //Click on save
			
				Thread.sleep(2000);
				
				Alert alert20 = driver.switchTo().alert();   //Alert handling
			    String Alert20 = alert20.getText();
			    System.out.print(Alert20);
			    alert20.accept();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			    Thread.sleep(4000);
			    
			    
			    Alert alert24 = driver.switchTo().alert();   //Alert handling
			    String Alert24 = alert24.getText();
			    System.out.print(Alert24);
			    alert24.accept();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			    Thread.sleep(2000);
				 
			    driver.findElement(By.xpath((data.getData(4, 882, 2)))).click();   //Click on cancel button
			
			    Thread.sleep(3000);
		
		}
			   
			   
			   public void CopyMoveJobs(WebDriver driver1)throws Exception{
					WebDriver driver = driver1;
			 
			/* click_element(driver,"xpath",(data.getData(4, 883, 2));            //Click on function arrow
			 Thread.sleep(4000);
					
		     click_element(driver,"xpath",(data.getData(4, 884, 2));        //Click on subsystem  
			Thread.sleep(3000);
				    
				    
		     click_element(driver,"xpath",(data.getData(4, 885, 2));            //Click on subsystem  
			 Thread.sleep(3000);*/
					
					
			 radioButton(driver,"xpath",(data.getData(4, 886, 2)));      //click on All radiobutton
			
			 Thread.sleep(2000);
					
			  click_element(driver,"id",(data.getData(4, 887, 2)));       //Click on copy jobs button
			
			  Thread.sleep(2000);
			  
			    WebElement iframe=driver.findElement(By.id(data.getData(4, 888, 2)));   //Switching to the frame
				driver.switchTo().frame(iframe);
				
				Thread.sleep(3000);
				
				dropdown(driver,"id",(data.getData(4, 889, 2)),(data.getData(4, 890, 2)));       //Click on Vessel dropdown
				
				Thread.sleep(2000);
		   
			  
				dropdown(driver,"id",(data.getData(4, 891, 2)),(data.getData(4, 892, 2)));       //Click on Department dropdown
			
				Thread.sleep(2000);
				 
				dropdown(driver,"id",(data.getData(4, 893, 2)),(data.getData(4, 894, 2)));       //Click on System dropdown
			
				Thread.sleep(2000);
				
				 
				dropdown(driver,"id",(data.getData(4, 895, 2)),(data.getData(4, 896, 2)));       //Click on subsystem dropdown
				
				Thread.sleep(2000);
			     
			   click_element(driver,"id",(data.getData(4, 897, 2)));       //Click on Overwrite Button
				
			   Thread.sleep(3000);
				
				 click_element(driver,"xpath",(data.getData(3, 898, 2)));       //Click on Yes Button
				
				 Thread.sleep(3000);
					
					
					driver.switchTo().defaultContent();  //Back to original window
					  Thread.sleep(5000);
					  
				driver.findElement(By.cssSelector((data.getData(4, 899, 2)))).click();      //Click on copy jobs button
			
				Thread.sleep(2000);
				  
				  WebElement iframe2=driver.findElement(By.id((data.getData(4, 900, 2))));   //Switching to the frame
					driver.switchTo().frame(iframe2);
				
					Thread.sleep(3000);
					
					dropdown(driver,"id",(data.getData(4, 901, 2)),(data.getData(4, 902, 2)));       //Click on Department dropdown
				
					Thread.sleep(2000);
					 
					dropdown(driver,"id",(data.getData(4, 903, 2)),(data.getData(4, 904, 2)));       //Click on System dropdown
				
					Thread.sleep(2000);
					
					 
					dropdown(driver,"id",(data.getData(4, 905, 2)),(data.getData(4, 906, 2)));       //Click on subsystem dropdown
				
					Thread.sleep(2000);
				     
				   click_element(driver,"id",(data.getData(4, 907, 2)));       //Click on Append Button
				
				   Thread.sleep(3000);
					


					 click_element(driver,"xpath",(data.getData(4, 908, 2)));       //Click on Yes Button
					
					 Thread.sleep(3000);
						
						
						driver.switchTo().defaultContent();  //Back to original window
						  Thread.sleep(5000);
						  
						  
			
				 checkbox_element(driver,"id",(data.getData(4, 909, 2))); //Click on 1st checkbox
				
				 Thread.sleep(2000);
				 
				 checkbox_element(driver,"id",(data.getData(4, 910, 2))); //Click on 2nd checkbox
				
				 Thread.sleep(2000);
				 
				  click_element(driver,"id",(data.getData(4, 911, 2)));       //Click on Move jobs button
				
				  Thread.sleep(3000);
				  
				  
				  WebElement iframe4=driver.findElement(By.id((data.getData(4, 912, 2))));   //Switching to the frame
					driver.switchTo().frame(iframe4);
				
					Thread.sleep(3000);
				  
				  
				  
				 dropdown(driver,"id",(data.getData(4, 913, 2)),(data.getData(4, 914, 2)));       //Click on System dropdown
				
				 Thread.sleep(2000);
					
					 
				dropdown(driver,"id",(data.getData(4, 915, 2)),(data.getData(4, 916, 2)));       //Click on subsystem dropdown
				
				Thread.sleep(2000);
				
				click_element(driver,"id",(data.getData(4, 917, 2)));       //Click on Move Button
				
				Thread.sleep(3000);
					
				click_element(driver,"xpath",(data.getData(4, 918, 2)));       //Click on Yes Button
			
			   }
	}
