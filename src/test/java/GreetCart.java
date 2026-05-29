import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreetCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		int j = 0;

		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Potato" };
		// driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);
		//additems(driver,itemsNeeded);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// button[type='button'] 35 elements matching

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();

			// check wheather extracted name is presnt in aarray o not
			// for that convert array to arrayList

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length);
				{
					//break;

				}
			}

		}
	}

}
