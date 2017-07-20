
package technical_VesselInspection;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class InspectionIndex extends RW{
	
	
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

		/*Technical
		Vessel Inspection
		Inspection Index*/

		public void Inspection(WebDriver driver1) throws Exception {  //(priority=0)

			WebDriver driver = driver1;
		

			WebElement technical = driver.findElement(By.linkText("Technical")); // pathfor "Technical"
			Actions action = new Actions(driver);
			action.moveToElement(technical).build().perform();
			
			action.moveToElement(technical).perform();
			Thread.sleep(2000);
			

			WebElement VesselInspectio = driver.findElement(By.linkText("Vessel Inspection"));// path for Vessel Inspection
																						
			VesselInspectio.click();
			action.moveToElement(VesselInspectio).build().perform();
			

			WebElement InspectionIndex = driver.findElement(By.linkText("Inspection Index")); // path for Inspection Index
			InspectionIndex.click();
			Thread.sleep(5000);
			

			
		}

		
		public void ScheduleInspection(WebDriver driver1) throws Exception {  //(priority=1)

		     	WebDriver driver = driver1;
			
		     	click_element(driver, "id", data.getData(4, 129, 2)); //Click on ScheduleInspection
		        Thread.sleep(2000);
		        
		        //frame(driver, "id", data.getData(4, 130, 2));
		        
		        WebElement iframe=driver.findElement(By.id(data.getData(4, 130, 2)));   //Switching to the frame
		        driver.switchTo().frame(iframe);		          
		        Thread.sleep(3000);
		        
		        click_element(driver, "id", data.getData(4, 131, 2)); //Click on Save InspectinAndClose
		        Thread.sleep(2000);
		        
		        

				 Alert alert = driver.switchTo().alert();                                         //Alert handling for Vessel is required field.
			     String Alert = alert.getText();
			     System.out.println("Alert msg for:"+Alert);
			     alert.accept();
			     Thread.sleep(4000);
		        
		     	dropdown(driver, "xpath", (data.getData(4, 132, 2)),data.getData(4, 133, 2));   //Fleet Dropdown-"Fleet-B"
			        Thread.sleep(2000);
			        
			        
			        dropdown(driver, "id",data.getData(4, 134, 2),data.getData(4, 135, 2));  //Vessel Dropdown-"HARUKA"
			        Thread.sleep(2000);
			        
			        
			        dropdown(driver, "id",data.getData(4, 136, 2),data.getData(4, 137, 2));  //Inspector Dropdown-"Eitan Low"
			        Thread.sleep(2000);
			        
			        
			        dropdown(driver, "xpath", data.getData(4, 138, 2),data.getData(4, 139, 2));  //Inspector type Dropdown-"jibe3"
			        Thread.sleep(2000);
			        
			     /*   
			        radioButton(driver, "id", data.getData(4, 140, 2));  //Frequency Radio"One time"
			        Thread.sleep(2000);*/
			        
			        click_element(driver,"id", data.getData(4, 141, 2)); //Click on Save InspectinAndClose
			        Thread.sleep(2000);
			
					 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Schedule date is required field.
				     String Alert1 = alert1.getText();
				     System.out.println("Alert msg for:"+Alert1);
				     alert1.accept();
				     Thread.sleep(4000);
				     
				     
				     clear_element(driver,"id",data.getData(4, 142, 2));   //ClearSchedule Date
				     Thread.sleep(2000);
				     
			        sendkeys(driver, "id", data.getData(4, 143, 2), data.getData(4, 144, 2)); //Schedule Date "14/Apr/17"  (dynamic data)
			        Thread.sleep(5000);
			        
			        dropdown(driver, "id",data.getData(4, 145, 2),data.getData(4, 146, 2)); //port dropdown-Zara
			       
				     
			        clear_element(driver,"id", data.getData(4, 147, 2));   //Clear Inspection duration (days)
			        Thread.sleep(2000);
			        
			        
			        sendkeys(driver, "id", data.getData(4, 148, 2),data.getData(4, 149, 2)); //Inspection duration (days)
			        Thread.sleep(2000);
			        

			        click_element(driver, "id", data.getData(4, 150, 2)); //Click on Save InspectinAndClose
			        Thread.sleep(90000);
					
			        Alert alert2 = driver.switchTo().alert();                                         //Alert handling for Schedule date is required field.
				     String Alert2 = alert2.getText();
				     System.out.println("Alert msg for:"+Alert2);
				     alert2.accept();
				     Thread.sleep(2000);
				     
				   
				
				  driver.switchTo().defaultContent();
					  Thread.sleep(5000);
				  
}
		
		public void SearchInspection(WebDriver driver1) throws Exception {  //(priority=2)

	     	WebDriver driver = driver1;
	     	
	     	

	                dropdown(driver, "id", data.getData(4, 151, 2),data.getData(4, 152, 2));  //Fleet Dropdown-"Fleet-B"
	                Thread.sleep(4000);
	       
	        
	               dropdown(driver, "id", data.getData(4, 153, 2),data.getData(4, 154, 2));  //Fleet Dropdown-"HARUKA"
	               Thread.sleep(4000);
	        
	               clear_element(driver,"id", data.getData(4, 155, 2));   //ClearSchedule Date
				    Thread.sleep(2000);
				     
			        sendkeys(driver, "id", data.getData(4, 156, 2), data.getData(4, 157, 2)); //Schedule Date "12/Apr/17"
			        Thread.sleep(4000);
		
			       
			       
			        dropdown(driver, "id", data.getData(4, 158, 2),data.getData(4, 159, 2));  //Inspector Dropdown-"Eitan Low"
		            Thread.sleep(4000);
	

				     click_element(driver, "id", data.getData(4, 160, 2)); //Click on Search
				     Thread.sleep(2000);

		            
		       
		  }		
		      public void UpdateInspection(WebDriver driver1) throws Exception {  //(priority=3)
 
	             WebDriver driver = driver1;
	     	        
	     	       click_element(driver, "id",  data.getData(4, 161, 2)); //Click on Inspection From
		           Thread.sleep(2000);

		
		           click_element(driver, "id",  data.getData(4, 162, 2)); //Click on Update Inspection
		           Thread.sleep(60000);
	
		           
		           Alert alert = driver.switchTo().alert();                                         //Alert handling for Inspection updated successfully
				     String Alert = alert.getText();
				     System.out.println("Alert msg for:"+Alert);
				     alert.accept();
				     Thread.sleep(2000);
				    
		           click_element(driver, "id",  data.getData(4, 163, 2)); //Click on Inspection From
		           Thread.sleep(2000);

		           radioButton(driver, "id",  data.getData(4, 164, 2));  //radio button for Completed
			       Thread.sleep(2000);
			       
			       clear_element(driver, "id", data.getData(4, 165, 2));//Clear On board (days)
			       Thread.sleep(2000);
			       
			       sendkeys(driver, "id", data.getData(4, 166, 2), data.getData(4, 167, 2)); //Sendkeys On board (days)
			       Thread.sleep(4000);
		
			       clear_element(driver, "id",  data.getData(4, 168, 2)); //ClearOn shore (days)
			       Thread.sleep(2000);
			       
			       sendkeys(driver, "id",  data.getData(4, 169, 2),  data.getData(4, 170, 2)); //Sendkeys On shore (days)
			       Thread.sleep(4000);
			       
			       click_element(driver, "id",  data.getData(4, 171, 2)); //Click on Update Inspection
		           Thread.sleep(60000);

		           Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Inspection updated successfully
				     String Alert1 = alert1.getText();
				     System.out.println("Alert msg for:"+Alert1);
				     alert1.accept();
				     Thread.sleep(2000);
				     
				     click_element(driver, "id", data.getData(4, 172, 2)); //Click on Action Reopen
			         Thread.sleep(2000);
			         
			         click_element(driver, "id", data.getData(4, 173, 2)); //Click on Reopen Inspection
			         Thread.sleep(2000);
			         
				  /*  
			       click_element(driver, "id", "ctl00_MainContent_gvInspecrionSchedule_ctl03_lnkEdit"); //Click on Schedule Duration
		           Thread.sleep(2000);
			      
		           click_element(driver, "id", "closePopupbutton"); //Click on Close button 
		           Thread.sleep(2000);*/
		           
		           
		}		
		  	
		      public void InspectionReport(WebDriver driver1) throws Exception {  //(priority=4)
 
	             WebDriver driver = driver1;
	           
			  //Window handle for Inspection Checklist Report
			    String handleBefore1 = driver.getWindowHandle();       // Parent window
			    click_element(driver, "id", data.getData(4, 174, 2));  //Inspection Checklist Report
			    Thread.sleep(4000);	
			 
			    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
			    driver.switchTo().window(handle);}
			    driver.close();
			    driver.switchTo().window(handleBefore1);
			    Thread.sleep(2000);
			    
			    
				  //Window handle for Inspection worklist Report
				    String handleBefore = driver.getWindowHandle();       // Parent window
				    click_element(driver, "xpath", data.getData(4, 175, 2));  //Inspection worklist Report
				    Thread.sleep(4000);	
				 
				    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
				    driver.switchTo().window(handle);}
				    driver.close();
				    driver.switchTo().window(handleBefore);
				    Thread.sleep(1000);
		      }	    
		      
		    
		      
		      public void Schedule(WebDriver driver1) throws Exception {  //(priority=5)
		    	  
		             WebDriver driver = driver1;
		             
		         
		             click_element(driver, "id", data.getData(4, 176, 2)); //Click on Assign Jobs
			         Thread.sleep(2000);
			         
			          WebElement iframe=driver.findElement(By.id(data.getData(4, 177, 2)));   //Switching to the frame
				      driver.switchTo().frame(iframe);		          
				      Thread.sleep(3000);
			        
				      
				       sendkeys(driver, "id",data.getData(4, 178, 2), data.getData(4, 179, 2)); //Sendkyes for search Tester
				        Thread.sleep(4000);
				        

				        click_element(driver, "id",data.getData(4, 180, 2)); //Search
				        Thread.sleep(4000);
				        
				        click_element(driver, "id", data.getData(4, 181, 2)); //Clear Filter
				        Thread.sleep(4000);
				
			            radioButton(driver, "id", data.getData(4, 182, 2)); //Select Radio button All
			            Thread.sleep(2000);
			         			          
				         String  AllJobs = driver.findElement(By.xpath(data.getData(4, 183, 2))).getText();  //Total  All  jobs
				 		 System.out.println(" All available " + AllJobs );
				 		 Thread.sleep(2000);
				 		 
			          			      		            

				 		radioButton(driver, "id", data.getData(4, 184, 2)); //Select Radio button for Pending
				         Thread.sleep(2000);
				         
				         String  Pending = driver.findElement(By.xpath(data.getData(4, 185, 2))).getText();  //Total Pending jobs 
				 		 System.out.println("Pending " + Pending );
				 		 Thread.sleep(2000);
				 		 
				 		 
				 		 

					 		radioButton(driver, "id", data.getData(4, 186, 2)); //Select Radio button for Completed
					         Thread.sleep(2000);
					         
					         String  Completed = driver.findElement(By.xpath(data.getData(4, 187, 2))).getText();  //Total Completed jobs 
					 		 System.out.println("Completed " + Completed );
					 		 Thread.sleep(2000);
			 		 

					 		 
						 	radioButton(driver, "id", data.getData(4, 188, 2)); //Select Radio button for Reworked
						    Thread.sleep(2000);
						         
						     String  Reworked = driver.findElement(By.xpath(data.getData(4, 189, 2))).getText();  //Total Reworked jobs 
						 	 System.out.println("Reworked " + Reworked );
						 	 Thread.sleep(2000);
				 		 
						 		 



						radioButton(driver, "id", data.getData(4, 190, 2)); //Select Radio button for Verified
					    Thread.sleep(2000);
							         
						 String  Verified = driver.findElement(By.xpath(data.getData(4, 191, 2))).getText();  //Total Verified jobs 
						 System.out.println("Verified " + Verified );
					     Thread.sleep(2000);
					 		
							 		 

						 radioButton(driver, "id", data.getData(4, 192, 2)); //Select Radio button for Overdue
					     Thread.sleep(2000);
							         
						 String  Overdue = driver.findElement(By.xpath(data.getData(4, 193, 2))).getText();  //Total Overdue jobs 
					     System.out.println("Overdue " + Overdue );
						 Thread.sleep(2000);
							 	 
				      
                   //Job Description
					    radioButton(driver, "id", data.getData(4, 194, 2)); //Select Radio button for Pending
					   Thread.sleep(2000);
					   
					   
					  					 					    					    					    

						  //Window handle for Job Description
						    String handleBefore = driver.getWindowHandle();       // Parent window
						    click_element(driver, "id", data.getData(4, 195, 2));  //Job Description
						    Thread.sleep(4000);	
						 
						    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
						    driver.switchTo().window(handle);}
						    driver.close();
						    driver.switchTo().window(handleBefore);						   
						    Thread.sleep(4000);
						    
						    checkbox_element(driver, "xapth",data.getData(4, 196, 2)); //Check box 
						   Thread.sleep(2000);
						   
						 
				             click_element(driver, "xpath", data.getData(4, 197, 2)); //Click on Close
					         Thread.sleep(5000);
					        

							 
							  
					         driver.switchTo().defaultContent();
					         Thread.sleep(5000);

		      
		      }         
		      public void ADD(WebDriver driver1) throws Exception {  //(priority=6)
		    	  
		             WebDriver driver = driver1;
		            
		         click_element(driver, "xpath", data.getData(4, 198, 2)); //ADD
			         Thread.sleep(5000);
		     
			         WebElement iframe=driver.findElement(By.id(data.getData(4, 199, 2)));   //Switching to the frame
				        driver.switchTo().frame(iframe);		          
				        Thread.sleep(3000);
				        
				        
				        driver.findElement(By.xpath(data.getData(4, 200, 2))).sendKeys(data.getData(4, 201, 2)); // File path
				        Thread.sleep(3000);
				        
				        click_element(driver, "xpath", data.getData(4, 202, 2));  //upload
					    Thread.sleep(4000);	
					    
					

			             click_element(driver, "id",data.getData(4, 203, 2));  //Refresh
						    Thread.sleep(4000);	
						    
						    driver.switchTo().defaultContent();
	
						    Thread.sleep(5000);
					         
					         
						    click_element(driver, "id", data.getData(4, 204, 2));  //Close
						    Thread.sleep(4000);	
						    
						    

					          //Window Handle for Checklist Rating
						         String handleBefore4 = driver.getWindowHandle();       // Parent window
								    click_element(driver, "xpath", data.getData(4, 205, 2));  //Checklist Rating
								    Thread.sleep(4000);	
								 
								    for (String handle : driver.getWindowHandles()) {          //Switch to new window		          
								    driver.switchTo().window(handle);}
								    driver.close();
								    driver.switchTo().window(handleBefore4);						   
								    Thread.sleep(4000);
							
		    
								 
								    click_element(driver, "xpath", data.getData(4, 206, 2));  //Delete
								    Thread.sleep(8000);	


							           Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Delete
									     String Alert1 = alert1.getText();
									     System.out.println("Alert msg for:"+Alert1);
									     alert1.accept();
									     Thread.sleep(2000);
									     
								
		      }	      
		      
		      
}