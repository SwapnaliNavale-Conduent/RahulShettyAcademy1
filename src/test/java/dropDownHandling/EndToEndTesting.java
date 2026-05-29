package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTesting {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver  driver= new ChromeDriver();
		    //driver.manage().window().maximize();
		    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		    
		    //select radio button oneway
		    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		    //select from date
		    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		    driver.findElement(By.xpath("//a[@value='DEL']")).click();
		    
		    Thread.sleep(2000);
		    //select to date
		    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		    
		    
			   
		    driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		    
		    if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
			  {
				  System.out.println("Its disabled");
				  Assert.assertTrue(true);
			  }
			  else
			  {
				  Assert.assertTrue(false);
			  }
		    
		    //
		    driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		   
		    //selected addult from dropdown
		    driver.findElement(By.id("divpaxinfo")).click();
		    Thread.sleep(2000);
		    for(int i =1; i<5;i++)
		    {
		    	 driver.findElement(By.id("hrefIncAdt")).click();
		    }
		    
		    driver.findElement(By.id("btnclosepaxoption")).click();
		    
		    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		    
		    
		    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		    
		    Thread.sleep(1000);
		    WebElement staticdropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			   Select dropdown = new Select(staticdropdown);
			   dropdown.selectByIndex(3);
			   
			   Thread.sleep(2000);
		    driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		    

}
}
