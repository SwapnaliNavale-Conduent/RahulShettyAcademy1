import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows {

	public static void main(String[] args) throws IOException {
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String Parentwid= it.next();
		String ChildWinid =it.next();
		driver.switchTo().window(ChildWinid);
		driver.get("https://rahulshettyacademy.com/");
		
		String CourseName= driver.findElement(By.xpath("//a[contains(text(),'Learn Postman for API Automation Testing with Java')]")).getText();
	    driver.switchTo().window(Parentwid);
	    
	    //driver.findElement(By.cssSelector("[name='name']")).sendKeys(CourseName);

	    
	    //Capture webelement screenshot
	    WebElement name =driver.findElement(By.cssSelector("[name='name']"));
	    name.sendKeys(CourseName);
	    File file=name.getScreenshotAs(OutputType.FILE);
	    
	    FileUtils.copyFile(file, new File("logon.png"));
	    
	    //Get Height And width of the webElement
	    
	   System.out.println(name.getRect().getDimension().getHeight());
	   System.out.println(name.getRect().getDimension().getWidth());
	   
	   driver.quit();
	}

}
