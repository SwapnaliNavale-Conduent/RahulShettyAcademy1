package BasicLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Locators {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		
		
		Select select = new Select(dropdown);
		select.selectByValue("Stud");

		
		driver.findElement(By.linkText("I Agree to the ")).click();
		
		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();
		

	}

}
