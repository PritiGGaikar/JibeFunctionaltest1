
package common_Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RW
{
	
	
	//public static String path="C:\\Users\\Priti\\workspace\\JiBeAutomation\\"; //Workspace excel path
	

	public static String path="C:\\Users\\Priti\\workspace\\JibeFunctionalTest1\\"; //Workspace excel path
	
	
	
     public ExcelRead data = new ExcelRead(path.concat("Excel\\JibeAutomation.xlsx")); // Read excel path

     public WriteExcel write_data = new WriteExcel(path.concat("Excel\\JibeAutomation.xlsx"));

     public String url = data.getData(0, 1, 1); // get the url from excel sheet

     public String Dashboard = data.getData(0, 2, 1); // get url for dashboard page while any page is crashed

 
 
 
 
 
 
 
 
 
 
 

 //All Kyeword
 
 public static String radioButton(WebDriver driver, String locatorType, String locatorvalue) throws Exception
 
 {
 
  switch(locatorType)
   {

   case "id":
          driver.findElement(By.id(locatorvalue)).click();
          break;

   case "name":
	     driver.findElement(By.name(locatorvalue)).click();
         break;

   case "xpath":
	     driver.findElement(By.xpath(locatorvalue)).click();
         break;
         
   case "linkText":
	     driver.findElement(By.linkText(locatorvalue)).click();
         break;

   }

   Thread.sleep(1000);
   
   return null;

 }

public static String click_element(WebDriver driver, String locatorType, String locatorvalue) throws Exception
 
 {
 
  switch(locatorType)
   {

   case "id":
          driver.findElement(By.id(locatorvalue)).click();
          break;

   case "name":
	     driver.findElement(By.name(locatorvalue)).click();
         break;

   case "xpath":
	     driver.findElement(By.xpath(locatorvalue)).click();
         break;
         
   case "linkText":
	     driver.findElement(By.linkText(locatorvalue)).click();
         break;

   }

   Thread.sleep(1000);
   
   return null;

 }


public static String dropdown(WebDriver driver, String locatorType, String locatorvalue,String pamarValue) throws Exception
 
 {
 
  switch(locatorType)
   {

   case "id":
          driver.findElement(By.id(locatorvalue)).sendKeys(pamarValue);
          break;

   case "name":
	     driver.findElement(By.name(locatorvalue)).sendKeys(pamarValue);
         break;

   case "xpath":
	     driver.findElement(By.xpath(locatorvalue)).sendKeys(pamarValue);
         break;
         
   case "linkText":
	     driver.findElement(By.linkText(locatorvalue)).sendKeys(pamarValue);
         break;

   }

   Thread.sleep(1000);
   
   return null;

 }


public static String sendkeys(WebDriver driver, String locatorType, String locatorvalue, String pamarValue) throws Exception
 
 {
 
  switch(locatorType)
   {

   case "id":
          driver.findElement(By.id(locatorvalue)).sendKeys(pamarValue);
          break;

   case "name":
	     driver.findElement(By.name(locatorvalue)).sendKeys(pamarValue);
         break;

   case "xpath":
	     driver.findElement(By.xpath(locatorvalue)).sendKeys(pamarValue);
         break;
         
   case "linkText":
	     driver.findElement(By.linkText(locatorvalue)).sendKeys(pamarValue);
         break;

   }

   Thread.sleep(1000);
   
   return null;

 }


public static String clear_element(WebDriver driver, String locatorType, String locatorvalue) throws Exception
 
 {
 
  switch(locatorType)
   {

   case "id":
          driver.findElement(By.id(locatorvalue)).clear();
          break;

   case "name":
	     driver.findElement(By.name(locatorvalue)).clear();
         break;

   case "xpath":
	     driver.findElement(By.xpath(locatorvalue)).clear();
         break;
         
   case "linkText":
	     driver.findElement(By.linkText(locatorvalue)).clear();
         break;

   }

   Thread.sleep(1000);
   
   return null;

 }


public static String checkbox_element(WebDriver driver, String locatorType, String locatorvalue) throws Exception
 
 {
 
  switch(locatorType)
   {

   case "id":
          driver.findElement(By.id(locatorvalue)).click();
          break;

   case "name":
	     driver.findElement(By.name(locatorvalue)).click();
         break;

   case "xpath":
	     driver.findElement(By.xpath(locatorvalue)).click();
         break;
         
   case "linkText":
	     driver.findElement(By.linkText(locatorvalue)).click();
         break;

   }

   Thread.sleep(1000);
   
   return null;

 }

public static String dropdownCheckbox(WebDriver driver, String locatorType, String locatorvalue1,String locatorvalue2,String locatorvalue3) throws Exception

{

 switch(locatorType)
  {

  case "id":
     driver.findElement(By.id(locatorvalue1)).click();   // Arrow
     Thread.sleep(1000);
     driver.findElement(By.id(locatorvalue2)).click();   // Select CheckBox
     Thread.sleep(1000);
     driver.findElement(By.id(locatorvalue3)).click();   // OK Button
         break;

  case "name":
     driver.findElement(By.name(locatorvalue1)).click();   // Arrow
     Thread.sleep(1000); 
     driver.findElement(By.name(locatorvalue2)).click();   // Select CheckBox
     Thread.sleep(1000);
     driver.findElement(By.name(locatorvalue3)).click();   // OK Button
        break;

  case "xpath":
     driver.findElement(By.xpath(locatorvalue1)).click();    // Arrow
     Thread.sleep(1000);
     driver.findElement(By.xpath(locatorvalue2)).click();    // Select CheckBox
     Thread.sleep(1000);
     driver.findElement(By.xpath(locatorvalue3)).click();    // OK Button
        break;
        
  case "linkText":
     driver.findElement(By.linkText(locatorvalue1)).click();    // Arrow
     Thread.sleep(1000);
     driver.findElement(By.linkText(locatorvalue2)).click();    // Select CheckBox
     Thread.sleep(1000);
     driver.findElement(By.linkText(locatorvalue3)).click();    // OK Button
        break;

  }

  Thread.sleep(1000);
  
  return null;

}


public static String uploadFile(WebDriver driver, String locatorType, String locatorvalue1, String locatorvalue2, String path, String locatorvalue3, String locatorvalue4) throws Exception
 
 {
 
  switch(locatorType)
   {

   case "id":
          driver.findElement(By.id(locatorvalue1)).click();        // Add Attachment
          
          Thread.sleep(1000);
         
          driver.findElement(By.id(locatorvalue2)).sendKeys(path); // Select File path
          
          Thread.sleep(1000);
          
          driver.findElement(By.id(locatorvalue3)).click();        // Upload
          
          Thread.sleep(1000);
          
          driver.findElement(By.id(locatorvalue4)).click();        // Close
          
          
          break;

   case "name":
	      driver.findElement(By.name(locatorvalue1)).click();        // Add Attachment
	      
	      Thread.sleep(1000);
          
          driver.findElement(By.name(locatorvalue2)).sendKeys(path); // Select File path
          
          Thread.sleep(1000);
          
          driver.findElement(By.id(locatorvalue3)).click();          // Upload
          
          Thread.sleep(1000);
          
          driver.findElement(By.name(locatorvalue4)).click();        // Close
	     
	     
         break;

   case "xpath":
	      driver.findElement(By.xpath(locatorvalue1)).click();        // Add Attachment
	      
	      Thread.sleep(1000);
         
          driver.findElement(By.xpath(locatorvalue2)).sendKeys(path); // Select File path
          
          Thread.sleep(1000);
          
          driver.findElement(By.id(locatorvalue3)).click();           // Upload
          
          Thread.sleep(1000);
          
          driver.findElement(By.xpath(locatorvalue4)).click();        // Close
          
          Thread.sleep(1000);
          
         break;
         
   case "linkText":
	      driver.findElement(By.linkText(locatorvalue1)).click();        // Add Attachment
	      
	      Thread.sleep(1000);
         
          driver.findElement(By.linkText(locatorvalue2)).sendKeys(path); // Select File path
          
          Thread.sleep(1000);
          
          driver.findElement(By.id(locatorvalue3)).click();              // Upload
          
          Thread.sleep(1000);
          
          driver.findElement(By.linkText(locatorvalue4)).click();        // Close
          
         break;

   }
  Thread.sleep(1000);
  
  return null;

}


	public static String frameSwitchto(WebDriver driver, String locatorType, String locatorvalue) throws Exception
	 
	 {
	 
	  switch(locatorType)
	   {

	   case "id":
		     WebElement iframe1=driver.findElement(By.id(locatorvalue));
	          
	         driver.switchTo().frame(iframe1);
	          break;

	   case "name":
		     WebElement iframe2=driver.findElement(By.name(locatorvalue));
		   
		     driver.switchTo().frame(iframe2);
	         break;

	   case "xpath":
         WebElement iframe3=driver.findElement(By.xpath(locatorvalue));
		   
		     driver.switchTo().frame(iframe3);
	         break;
	         
	   case "linkText":
		     WebElement iframe4=driver.findElement(By.linkText(locatorvalue));
		   
		     driver.switchTo().frame(iframe4);
	         break;
	         
	   case "cssSelector":
		     WebElement iframe5=driver.findElement(By.cssSelector(locatorvalue));
		   
		     driver.switchTo().frame(iframe5);
	         break;

	   }

	   Thread.sleep(1000);
	   
	   return null;

	 }
	
	
	public static String WindowSwitchto(WebDriver driver) throws Exception
	 
	 {
	 
	         for (String handle : driver.getWindowHandles()) {          //Switch to new window
		    	 
			 driver.switchTo().window(handle);}
	        
	         Thread.sleep(1000);
	   
	         return null ;

	 }
	

	public static String Alert(WebDriver driver) throws Exception
	 
	 {
		Alert alert = driver.switchTo().alert();                                         //Alert handling for Please enter a effect name
	     String Alert = alert.getText();
	     System.out.println("Alert msg for DeleteEffect:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     return null ;

	 }
	

	public static String gettext(WebDriver driver, String locatorType, String locatorvalue ) throws Exception
	 
	 {
	 
	  switch(locatorType)
	   {

	   case "id":  	        
	         driver.findElement(By.id(locatorvalue)).getText();  	        
	          break;

	   case "name":
		   
		     driver.findElement(By.name(locatorvalue)).getText();
	         break;

	   case "xpath":
		    
		    driver.findElement(By.xpath(locatorvalue)).getText();    		 
	         break;
	         
	   case "linkText":
		   
		   driver.findElement(By.linkText(locatorvalue)).getText();
	         break;

	   }
	  /*public static String gettext(WebDriver driver, String locatorType, String locatorvalue ,String pamarValue) throws Exception
 	 
 	 {
 	 String Value;
 	  switch(locatorType)
 	   {

 	   case "id":
 	        
 	          Value=driver.findElement(By.id(locatorvalue)).getText();
 	         // System.out.println(Value);
 	          break;

 	   case "name":
 		   
 		     Value=  driver.findElement(By.name(locatorvalue)).getText();
 		    // System.out.println(Value);
 	         break;

 	   case "xpath":
 		    
 		     Value=  driver.findElement(By.xpath(locatorvalue)).getText();
 		    // System.out.println(Value);
 	         break;
 	         
 	   case "linkText":
 		   
 		     Value=    driver.findElement(By.linkText(locatorvalue)).getText();
 		    // System.out.println(Value);
 		     
 	         break;

 	   }
	  */
	 

	   Thread.sleep(1000);
	   
	   return null;

	 }








public static void close_driver(WebDriver driver)

{
	driver.close();
	
}

}