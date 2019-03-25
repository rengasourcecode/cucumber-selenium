import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebookclass {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List <WebElement> li=driver.findElements(By.xpath("//a"));
		System.out.println(li.size());
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D:\\cucumberscreenshots\\abc.png"));
		for(WebElement s:li)
		{
			//System.out.println(s.getAttribute("href"));
			//System.out.println(s.getText());
			String url=s.getAttribute("href");
			validate(url);
		}
		
		
			}

	static void validate(String url) throws IOException
	{
		 URL link = new URL(url);
		 // Create a connection using URL object (i.e., link)
		 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		 //Set the timeout for 2 seconds
		 httpConn.setConnectTimeout(2000);
		 //connect using connect method
		 httpConn.connect();
		 //use getResponseCode() to get the response code. 
		 if(httpConn.getResponseCode()== 200) { 
		 System.out.println(url+" - "+httpConn.getResponseMessage());
		 }else
		 if(httpConn.getResponseCode()== 404) {
		 System.out.println(url+" - "+httpConn.getResponseMessage());
		 
	
	}}
	
}
	
	

