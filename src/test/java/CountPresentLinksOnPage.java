
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountPresentLinksOnPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver= new ChromeDriver();

		  //1.Count total number of links on page
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  System.out.println(driver.findElements(By.tagName("a")).size());
		  
		  
		  //2.Limiting webdriverscope-count total number of links on footer section
		  WebElement footerdriver =driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		  System.out.println(footerdriver.findElements(By.tagName("a")).size());
		  
		  //3.Count first column links in footer section;
		  
		  WebElement columndriver =driver.findElement((By.xpath("//table/tbody/tr/td[1]/ul")));
		  System.out.println(columndriver.findElements(By.tagName("a")).size());
		  
		  //4.Click on each links and checks links are working or not
		  
		  for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
		  {
			  String clicksonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER); //opening in new tab by using this statement
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clicksonlinktab);
			
			Thread.sleep(5000L);
		  }//open all tabs
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())  //has next teel us next index present or not
			{
				driver.switchTo().window(it.next()); //it.next() actually move to next index
				System.out.println(driver.getTitle());
				
				  
			}
			
		  }

	}


