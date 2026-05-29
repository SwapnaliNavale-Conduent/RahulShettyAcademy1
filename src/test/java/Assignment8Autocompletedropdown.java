import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment8Autocompletedropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-menu-item")));
        
        
       List<WebElement>countries= driver.findElements(By.cssSelector(".ui-menu-item div"));
       
       for(WebElement expectedcoun:countries)
       {
    	   String text =expectedcoun.getText();
    	   System.out.println(text);
    	   
    	   if(text.equalsIgnoreCase("India"))
    	   {
    		expectedcoun.click();
    		  
    		   
    		   String selectedValue = driver.findElement(By.id("autocomplete")).getDomAttribute("value");
               Assert.assertEquals(selectedValue, "India");
               break; 
    		   
    	   }
    	  //
    	   //Assert.assertEquals(expectedcoun,"India");
       }

}
}
