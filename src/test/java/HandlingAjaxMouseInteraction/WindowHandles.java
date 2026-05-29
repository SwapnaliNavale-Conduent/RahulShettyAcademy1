package HandlingAjaxMouseInteraction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		
		WebDriver  driver= new ChromeDriver();

		  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		  driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		  Set<String> windows=  driver.getWindowHandles();
		  Iterator<String> it =windows.iterator();
		  String Parentid = it.next();
		  String Childid=it.next();
		  
		  driver.switchTo().window(Childid);
		  System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		  driver.findElement(By.cssSelector(".im-para.red")).getText();
		  String emailid= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		  driver.switchTo().window(Parentid);
		  driver.findElement(By.id("username")).sendKeys(emailid);


	}

}
