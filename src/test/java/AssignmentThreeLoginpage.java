import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentThreeLoginpage {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.id("usertype")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

	
				
		
		
		//driver.findElement(By.id("okayBtn")).click();
		
		WebElement staticdropdown =  driver.findElement(By.cssSelector(".form-control"));
		   Select dropdown = new Select(staticdropdown);
		   dropdown.selectByVisibleText("Consultant");
		   System.out.println(dropdown.getFirstSelectedOption().getText());
		   
		   driver.findElement(By.id("terms")).click();
		   
		   driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		   
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//input[@value='Sign In']")));

		   
		   //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
	       //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Sign In']")));
		
		
	}

}
