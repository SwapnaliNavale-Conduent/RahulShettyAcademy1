package BasicLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3ParentToSibling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/52333397/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
	    WebDriver  driver= new ChromeDriver();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//header/div/button[1]/following-sibling::button[1]
		

		// child to parent traverseheader/div/parent::div/button[2]
		////header/div/button[1]/parent::div/button[2]/parent::div/parent::header
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
	}

}
