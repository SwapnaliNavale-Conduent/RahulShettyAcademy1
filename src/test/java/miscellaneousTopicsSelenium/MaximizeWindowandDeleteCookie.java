package miscellaneousTopicsSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowandDeleteCookie {

	public static void main(String[] args) throws IOException {
		 WebDriver  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().deleteCookieNamed("SessionKey");
		// driver.manage().addCookie(null);
		 
		 driver.get("https://www.google.com/");
		 
		 
		 //take scrennshot
		 
		 //IF you getting error in "File" then download apache jar and add it to project ecternal jar file
		 // link for that :https://commons.apache.org/io/download_io.cgi
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File ("c://screenshot.png"));
			
			
	}
	

}
