package HandlingAjaxMouseInteraction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandlingassignement {

	public static void main(String[] args) {
		
		WebDriver  driver= new ChromeDriver();

		  driver.get("https://the-internet.herokuapp.com/");
		  driver.findElement(By.linkText("Multiple Windows")).click();
		  
		  
		  
		  driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		  Set<String>windows1=driver.getWindowHandles();
		  Iterator<String> it1=windows1.iterator();
		  String Parentid1= it1.next();
		  String childid1=it1.next();
		  driver.switchTo().window(childid1);
		  
		  System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		  driver.switchTo().window(Parentid1);
		  
		  System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		  
	}

}
