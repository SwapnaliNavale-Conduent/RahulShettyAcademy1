import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinksOnPage {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException,  IOException {
		 WebDriver  driver= new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			List <WebElement> links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));	
			
			SoftAssert a = new SoftAssert();
			for(  WebElement link:links)
			{
				String url =link.getDomAttribute("href");
				
				
				HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				int rescode =conn.getResponseCode();
				System.out.println(rescode);
				a.assertTrue(rescode<400,"The link text\"+link.getText()+\"is broken with the code\"+rescode");
				
				/*if(rescode>400)
				{
					System.out.println("The link text"+link.getText()+"is broken with the code"+rescode);
					Assert.assertTrue(false);
				}*/
				
			
			}
			//Same code copy above
			/*String url =driver.findElement(By.cssSelector("a[href*='brokenlink']")).getDomAttribute("href");
			
		HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int rescode =conn.getResponseCode();
		System.out.println(rescode);*/
			a.assertAll();

	}

}
