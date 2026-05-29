import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollPageUsingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1.Scrolling to the windows
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//2.Scrolling to the table present in the window
		Js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//3.In the table in 4th row extract how many values is present and print sum of all values
		
		int sum=0;
	   List<WebElement> values=	driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	  	   
	   for(int i=0;i<values.size();i++)
	   {
		 sum=sum+Integer.parseInt(values.get(i).getText());
	   }
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int totalsum =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, totalsum);

	}

}
