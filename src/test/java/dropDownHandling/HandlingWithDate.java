package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingWithDate {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver  driver= new ChromeDriver();
		    //driver.manage().window().maximize();
		    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		    driver.findElement(By.xpath("//a[@value='BLR']")).click();
		    
		    Thread.sleep(2000);
		    //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		   
		    
		    //for below xpathe is related parent to child for that need to indentify hole options, then write xpath for that 2. give one space and then after 3.write xpath for particular element
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		  
		  //Selecting current date
		  driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		  
		  System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  
		 // driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled(); //This steps ois not working because it is not correctly showing button is enabled or not
            
		  
		  System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		  if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		  {
			  System.out.println("Its Enabled");
			  Assert.assertTrue(true);
		  }
		  else
		  {
			  Assert.assertTrue(false);
		  }
	}

}
