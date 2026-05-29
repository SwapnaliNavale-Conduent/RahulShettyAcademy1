\package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","/Users/52333397/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
	    WebDriver  driver= new ChromeDriver();
	    //driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	   WebElement staticdropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	   Select dropdown = new Select(staticdropdown);
	   dropdown.selectByIndex(3);
	   System.out.println(dropdown.getFirstSelectedOption().getText());
	   //driver.close();
	   dropdown.selectByVisibleText("AED");
	   System.out.println(dropdown.getFirstSelectedOption().getText());
	   
	   WebElement staticdropdown1 =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	   Select dropdown1 = new Select(staticdropdown1);
	   dropdown1.selectByIndex(3);
	   System.out.println(dropdown1.getFirstSelectedOption().getText());
	   //driver.close();
	   dropdown1.selectByVisibleText("AED");
	   System.out.println(dropdown1.getFirstSelectedOption().getText());
	   
	   driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
	}

}
