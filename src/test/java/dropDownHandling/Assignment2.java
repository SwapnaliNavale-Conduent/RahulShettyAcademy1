package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Swapnali");
		driver.findElement(By.name("email")).sendKeys("asv@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Aarya");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();

		WebElement options = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(options);
		dropdown.selectByVisibleText("Female");

		driver.findElement(By.xpath("//label[contains(@for,'inlineRadio1')]")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("07/08/2025");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		// System.out.print(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		// .alert.alert-success.alert-dismissible

		// Assert.assertEquals(driver.findElement(By.xpath("//div[@xpath='1']")).getText(),"x
		// Success! The Form has been submitted successfully!.");

	}

}
