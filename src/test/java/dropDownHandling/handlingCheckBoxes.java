package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class handlingCheckBoxes {

	public static void main(String[] args) {
		
			WebDriver  driver= new ChromeDriver();
		    //driver.manage().window().maximize();
		    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		   Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		    System.out.println( driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		    driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		    System.out.println( driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		    
		    //print total number of checkboxes
		    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		    Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		    
	}

}
