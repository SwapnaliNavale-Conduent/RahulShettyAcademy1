

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6withouthardcodinganything {

	public static void main(String[] args) {
		WebDriver  driver= new ChromeDriver();

		  
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  //1.click on the options2 and extract text from it
		  WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
	        checkbox.click();

	        WebElement label = driver.findElement(By.cssSelector("label[for='benz']"));
	        
	        String labeltext=label.getText();
	        System.out.println(label.getText());
	        
	        //2 in dropedown option dynamically select option2 without hardcoding any 
	        
	        WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
	        Select select= new Select(dropdown);
	        select.selectByContainsVisibleText(labeltext);
	        System.out.println("Dropdown selected: " + select.getFirstSelectedOption().getText());
	        
	        //3.Handle alert with dynamically option2 come here
	        driver.findElement(By.id("name")).sendKeys(labeltext);
	        
	        driver.findElement(By.id("alertbtn")).click();
	        
	        Alert alert =driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.accept();
	        

	        //driver.quit();
	}

}
