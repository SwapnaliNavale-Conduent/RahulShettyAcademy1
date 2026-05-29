
package HandlingAjaxMouseInteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main (String args[])
	{
		//System.setProperty("webdriver.chrome.driver","/RahulShettyAcademy1/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","/Users/52333397/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
	    WebDriver  driver= new ChromeDriver();

	  driver.get( "https://www.spicejet.com/ ");
	 
	  Actions a = new Actions(driver);
	 
	  a.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
	  driver.findElement(By.xpath("//div[text()='SpiceMax']")).click();
	  
	 

	}

}
