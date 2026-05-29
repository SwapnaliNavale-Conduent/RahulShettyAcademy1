package streamTutorials;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamGreenCartSorting {

	public static void main(String[] args) {
		WebDriver  driver= new ChromeDriver();

		  
		  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		  
		  //click on the column
		  driver.findElement(By.xpath("//tr/th[1]")).click();
		  
		  //capture all webelement into list(this is original list)
          List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));
		  List<String> originalList =elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		  
		  //sort in the list of step 3(Sorted list)
		  List<String> sortedList =originalList.stream().sorted().collect(Collectors.toList());
		  
		  //compare original list VS sorted list
		  Assert.assertTrue(originalList.equals(sortedList));
		  List<String> price;
		  //scan name column with get text (rice) and then print the price of the rice
		  do
		  {
			  List<WebElement> row= driver.findElements(By.xpath("//tr/td[1]"));
		 price=row.stream().filter(s->s.getText().contains("Rice")).
		  map(s->getVeggiePrice(s)).collect(Collectors.toList());
		  price.forEach(a->System.out.println(a));
		  if(price.size()<1)
		  {
			  driver.findElement(By.xpath("(//a[@aria-label='Next'])[1]")).click();
		  }
	      }while(price.size()<1); 


		  
}

	private static String getVeggiePrice(WebElement s) {
		
		//{//tr/td[1]/following-sibling::td[1]} here we are inserting only following sibling part because {//tr/td[1]} already present viggies list
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
