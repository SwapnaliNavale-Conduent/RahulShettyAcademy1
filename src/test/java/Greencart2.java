import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greencart2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); this is deprecated so use below code
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//WebDriverWait w = new WebDriverWait(driver,5);
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));

		
		

		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Potato" };
		// driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		//base b = new base();
		//b.addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
 		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	
	}



public static void addItems(WebDriver driver,String[] itemsNeeded)
{
	int j = 0;

	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	// button[type='button'] 35 elements matching

	for (int i = 0; i < products.size(); i++) 
	{
		String[] name = products.get(i).getText().split("-");
		String formatedName = name[0].trim();

		// check wheather extracted name is presnt in aarray o not
		// for that convert array to arrayList

		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		if (itemsNeededList.contains(formatedName)) 
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if (j == itemsNeeded.length)
			{
				break;

			}
		}


}
}
}
