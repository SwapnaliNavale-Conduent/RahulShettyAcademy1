import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7WebTables2 {

	public static void main(String[] args) {
		WebDriver  driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
		//1.Total number of column
		
		List<WebElement> rowcount = driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println("Total number of rows: " + rowcount.size());
		
		//2.Total number of column
		
		List<WebElement> columncount = driver.findElements(By.cssSelector(".table-display th"));
		System.out.println("Total number ofcolumn: " + columncount.size());
		
		//3.3rd column data print
		List<WebElement> secondrowdata = driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
		
		for (WebElement cell : secondrowdata) {
            System.out.print(cell.getText());
        }
        System.out.println();

	}

}
