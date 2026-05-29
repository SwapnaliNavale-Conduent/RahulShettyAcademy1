import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8RahulsirApproach {

	public static void main(String[] args) throws InterruptedException {
    WebDriver  driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		 String selectedOption = driver.findElement(By.id("autocomplete")).getDomAttribute("value");
	        System.out.println("Selected suggestion: " + selectedOption);

	        Thread.sleep(2000);
	        driver.quit();
	}

}
