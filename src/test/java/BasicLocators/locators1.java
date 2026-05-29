package BasicLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {

	public static void main(String ags[]) throws InterruptedException
	{
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.id("inputUsername")).sendKeys("swapnali");
		driver.findElement(By.name("inputPassword")).sendKeys("swapnali123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Swapnali Navale");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("swapnalinavale@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("asd@gmail.com");
		//Parent to child by using tag name only
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("swapnali");
		
		//by using regular expression
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		//by using regular expression with xpath
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
	}
	
}
