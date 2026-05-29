package BasicLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/52333397/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
	    WebDriver  driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://google.com");
	    
	    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.navigate().back();
	    driver.navigate().forward();

	}

}
