package HandlingAjaxMouseInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframeassignment {

	public static void main(String[] args) {
		WebDriver  driver= new ChromeDriver();

		  driver.get("https://the-internet.herokuapp.com/");
		  driver.findElement(By.linkText("Nested Frames")).click();
		  System.out.println(driver.findElements(By.cssSelector("frameset[frameborder='1']")).size());
		  driver.switchTo().frame("frame-top");
		  driver.switchTo().frame(("frame-middle"));
		  
		 
		  System.out.println(driver.findElement(By.id("content")).getText());
		  
		  


	}

}
