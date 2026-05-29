import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalanderTest {

	public static void main(String[] args) {
		String monthnumber ="6";
		String date="15";
		String year="2027";
		String[] expecteddate= {monthnumber,date,year};
				
		
		
		WebDriver  driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		 
		// Click to open calendar
		 driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		 
		// Click twice to go to year selection
		 driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		 driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		 
		// Select year
		 driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
	    
		// Select month (0-based index)
		 driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthnumber)-1).click();
		 
		 //int monthIndex = Integer.parseInt(monthnumber) - 1;
	        //driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
	             // .get(monthIndex).click();

		 
		 
		// Select date
		 driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		 
		 //System.out.println(driver.findElement(By.cssSelector("react-date-picker__inputGroup__input")).getText());
		 
		 List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		 
		 for(int i=0; i<actualList.size();i++)
		 {
			 System.out.println(actualList.get(i).getDomAttribute("Value"));
			 Assert.assertEquals(actualList.get(i).getDomAttribute("Value"),expecteddate[i]);;
		 }
		 driver.close();
	}

}
